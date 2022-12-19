package com.example.affirmation

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.runner.RunWith
@RunWith(AndroidJUnit4::class)
class AffirmationsListTests {

    @get: Role
    val activity = ActivityScenarioRule(MainActivity::class.java)


}


annotation class Role
