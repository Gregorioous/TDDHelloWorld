package com.example.tddhelloworld

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CounterTest {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test() {
        onView(withId(R.id.textView)).check(matches(withText("0")))

        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("1")))

        onView(withText("increment")).perform(click())
        onView(withId(R.id.textView)).check(matches(withText("2")))


        activityScenarioRule.scenario.recreate()
        onView(withId(R.id.textView)).check(matches(withText("2")))

        /* for (i in 2..Integer.MAX_VALUE){
             onView(withText("increment")).perform(click())
             onView(withId(R.id.textView)).check(matches(withText(i.toString())))
         }
         onView(withText("increment")).perform(click())
         onView(withId(R.id.textView)).check(matches(withText("2147483647")))*/

    }
}