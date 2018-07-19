package jonceski.kliment.jacococoverageexample;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TextUtilsTest {
    @Test
    public void password_isCorrect() {
        assertTrue(TextUtils.isValidPassword("aaaaaaa1"));
        assertFalse(TextUtils.isValidPassword("111"));
    }
}
