package com.patriciafiona.marioworld

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import com.patriciafiona.mario_world.core.data.MarioRepository
import com.patriciafiona.mario_world.core.data.Resource
import com.patriciafiona.mario_world.core.data.source.local.DummyDataSource
import com.patriciafiona.mario_world.core.data.source.local.entity.CharacterEntity
import com.patriciafiona.mario_world.core.domain.model.Character
import com.patriciafiona.mario_world.core.domain.repository.IMarioRepository
import com.patriciafiona.mario_world.core.domain.usecase.MarioInteractor
import com.patriciafiona.mario_world.core.domain.usecase.MarioUseCase
import com.patriciafiona.marioworld.data.DummyCharactersTestData
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import com.patriciafiona.marioworld.ui.main.MainViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.Mockito.verifyNoMoreInteractions
import org.mockito.Mockito.`when`


@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {
    private lateinit var marioUseCase: MarioUseCase

    @Mock
    private lateinit var marioRepository: IMarioRepository

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val newsData = DummyDataSource.getAllNews()

    @Before
    fun setUp() {
        marioUseCase = MarioInteractor(marioRepository)
    }

    @Test
    fun getCharacters() {
        val dummyCharacter: List<Character> = DummyCharactersTestData.generateDummyCharacter()
        val dataListCharacter = flowOf(Resource.Success(dummyCharacter))

        `when`(marioRepository.getAllCharacters()).thenReturn(dataListCharacter)

        runBlocking {
            val data = marioRepository.getAllCharacters().first().data
            assertNotNull(data)
            assertEquals(14, data?.size)
        }

    }

    @Test
    fun `Get Dummy News Data`() {
        assertNotNull(newsData)
        assertEquals(newsData.size, 3)

        //Simulate checking data
        val newsData01 = newsData[0]
        assertEquals(
            "Discover the all-new course Piranha Plant Cove with the Exploration Tour",
            newsData01.title
        )
        assertEquals(
            "Discover a brand-new course in the Mario Kart™ Tour game with the Exploration Tour, the latest limited-time event in the Mario Kart Tour game, happening now.",
            newsData01.headline
        )
        assertEquals(
            "https://mario.nintendo.com/news/mobilenews-discover-the-all-new-course-piranha-plant-cove-with-the-exploration-tour/",
            newsData01.link
        )
    }
}