package com.patriciafiona.marioworld.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SdkSuppress
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import com.patriciafiona.mario_world.core.data.source.local.DummyDataSource
import com.patriciafiona.marioworld.DummyCharactersTestData
import com.patriciafiona.marioworld.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@SdkSuppress(minSdkVersion = 24)
class MainActivityUITest {

    private val dummyNews = DummyDataSource.getAllNews()
    private val dummyCharacter = DummyCharactersTestData.generateDummyCharacter()

    private lateinit var mDevice: UiDevice

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    }

    @Test
    fun checkBgSoundButton(): Unit {
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
    fun checkProfilePage(): Unit {
        //1. Check if profile button displayed on screen
        onView(withId(R.id.btn_profile)).check(matches(isDisplayed()))

        //2. Open Profile page by Clicking the button
        onView(withId(R.id.btn_profile)).perform(click())

        //3. Check data on the screen
        onView(withId(R.id.user_status)).check(matches(withText("Online")))
        onView(withId(R.id.username)).check(matches(withText("Patricia Fiona")))
        onView(withId(R.id.user_email)).check(matches(withText("patriciafiona3@gmail.com")))

        onView(withId(R.id.tv_academy_value)).check(matches(withText("21")))
        onView(withId(R.id.tv_since_value)).check(matches(withText("2019")))
        onView(withId(R.id.tv_xp_value)).check(matches(withText("226979")))

        //4. Back to Main Activity
        onView(withId(R.id.btn_back)).perform(click())
    }

    @Test
    fun loadNews(): Unit {
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

        //4. Close browser
        mDevice.pressBack()
    }

}