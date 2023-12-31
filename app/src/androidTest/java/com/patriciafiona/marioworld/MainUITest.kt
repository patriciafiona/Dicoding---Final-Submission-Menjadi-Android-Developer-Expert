package com.patriciafiona.marioworld

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.patriciafiona.mario_world.core.data.source.local.DummyDataSource
import com.patriciafiona.marioworld.ui.main.MainActivity
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainUITest{
    private val dummyNews = DummyDataSource.getAllNews()
    private val dummyCharacters = DummyCharactersTestData.generateDummyCharacter()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun loadNews() {
        onView(withId(R.id.news_title)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.news_title)).check(matches(withText("News")))

//        onView(withId(R.id.rv_news)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.rv_news)).check(matches(isDisplayed()))
//        onView(withId(R.id.rv_news)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyNews.size))
    }

//    @Test
//    fun loadDetailMovie() {
//        onView(withId(R.id.navigation_movie)).perform(click())
//
//        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
//
//        onView(withId(R.id.movieTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.movieTitle)).check(matches(withText(dummyDetailMovie[0].title)))
//        onView(withId(R.id.movieTopTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.movieTopTitle)).check(matches(withText(dummyDetailMovie[0].title)))
//
//        onView(withId(R.id.movieRating)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//
//        onView(withId(R.id.movieReleaseDate)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.movieReleaseDate)).check(matches(withText(
//            Utils.changeStringToDateFormat(
//                dummyDetailMovie[0].releaseDate!!
//            )
//        )))
//
//        onView(withId(R.id.movieDuration)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.movieDuration)).check(matches(withText(
//            Utils.changeMinuteToDurationFormat(
//                dummyDetailMovie[0].runtime!!
//            )
//        )))
//
//        onView(withId(R.id.movieSinopsis)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.movieSinopsis)).check(matches(withText(dummyDetailMovie[0].overview)))
//        onView(withId(R.id.btnFavoriteMovie)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.moviePoster)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.movieBackdrop)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//
//        onView(withId(R.id.btnBackPage)).perform(click())
//    }
//
//    @Test
//    fun loadTvShow() {
//        onView(withId(R.id.navigation_tvShow)).perform(click())
//        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
//        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
//    }
//
//    @Test
//    fun loadDetailTvShow() {
//        onView(withId(R.id.navigation_tvShow)).perform(click())
//
//        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
//
//        onView(withId(R.id.showTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.showTitle)).check(matches(withText(dummyDetailTvShow[0].name)))
//        onView(withId(R.id.showTopTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.showTopTitle)).check(matches(withText(dummyDetailTvShow[0].name)))
//
//        onView(withId(R.id.showRating)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//
//        onView(withId(R.id.showReleaseDate)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.showReleaseDate)).check(matches(withText(
//            Utils.changeStringDateToYear(
//                dummyDetailTvShow[0].releaseDate!!
//            ).toString()
//        )))
//
//        onView(withId(R.id.showDuration)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.showDuration)).check(matches(withText(
//            Utils.changeMinuteToDurationFormat(
//                dummyDetailTvShow[0].runtime!![0]!!
//            )
//        )))
//
//        onView(withId(R.id.showSinopsis)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.showSinopsis)).check(matches(withText(dummyDetailTvShow[0].overview)))
//        onView(withId(R.id.btnFavoriteshow)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.showPoster)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//        onView(withId(R.id.showBackdrop)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//
//        onView(withId(R.id.rv_seasonDetail)).check(matches(isDisplayed()))
//        onView(withId(R.id.rv_seasonDetail)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
//            dummyDetailTvShow[0].seasons!!.size))
//
//        onView(withId(R.id.btnBackPage02)).perform(click())
//    }
//
//    @Test
//    fun testMovieListExpansion() {
//        onView(withId(R.id.navigation_movie)).perform(click())
//        onView(withId(R.id.indicatorImage)).perform(click()) //expand page
//        onView(withId(R.id.indicatorImage)).perform(click())// minimize expand page
//    }
//
//    @Test
//    fun testTvShowListExpansion() {
//        onView(withId(R.id.navigation_tvShow)).perform(click())
//        onView(withId(R.id.indicatorImage2)).perform(click()) //expand page
//        onView(withId(R.id.indicatorImage2)).perform(click())// minimize expand page
//    }

}