package jonceski.kliment.jacococoverageexample;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityUiTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void loginProcessTest() {
        //Enter username& password
        onView(withId(R.id.username)).perform(typeText("user"));
        onView(withId(R.id.password)).perform(typeText("user1234"));
        onView(withId(R.id.password)).perform(closeSoftKeyboard());
        onView(withId(R.id.button_login)).perform(click());

        //validate the inputed data.
        onView(withId(R.id.result)).check(matches(withText("SUCCESS")));
    }
}
