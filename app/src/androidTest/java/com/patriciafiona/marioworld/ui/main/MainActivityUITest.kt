package com.patriciafiona.marioworld.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.action.ViewActions.swipeDown
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.patriciafiona.mario_world.core.data.source.local.DummyDataSource
import com.patriciafiona.marioworld.DummyCharactersTestData
import org.junit.Assert.*
import com.patriciafiona.marioworld.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityUITest {

    private val dummyNews = DummyDataSource.getAllNews()
    private val dummyCharacter = DummyCharactersTestData.generateDummyCharacter()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkBgSoundButton() {
        onView(withId(R.id.btn_sound)).check(matches(isDisplayed()))
        runBlocking {
            delay(1500)

            //Pause the sound
            onView(withId(R.id.btn_sound)).perform(click())

            delay(1500)

            //Play the sound
            onView(withId(R.id.btn_sound)).perform(click())
        }
    }

    @Test
    fun checkProfilePage() {
        //1. Check if profile button displayed on screen
        onView(withId(R.id.btn_profile)).check(matches(isDisplayed()))

        //2. Open Profile page by Clicking the button
        onView(withId(R.id.btn_profile)).perform(click())

        //3. Check data on the screen
        onView(withId(R.id.user_status)).check(matches(withText("Online")))
        onView(withId(R.id.username)).check(matches(withText("Patricia Fiona")))
        onView(withId(R.id.user_email)).check(matches(withText("patriciafiona3@gmail.com")))
    }

    @Test
    fun loadNews() {
        //1. Check if recycle view displayed on screen
        onView(withId(R.id.rv_news)).check(matches(isDisplayed()))

        //2. Check if RV size equals to data size
        onView(withId(R.id.rv_news)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyNews.size)
        )

        //3. Try to open one of the News
        onView(withId(R.id.rv_news)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(1, click())
        )
    }

//    @Test
//    fun loadCharacters() {
//        onView(withId(R.id.main_scrollview))
//            .perform(swipeUp())
//
//        onView(withId(R.id.rv_characters)).check(matches(isDisplayed()))
//        onView(withId(R.id.rv_characters)).perform(
//            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyCharacter.size)
//        )
//    }


}