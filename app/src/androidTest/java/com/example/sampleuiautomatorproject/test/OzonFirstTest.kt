package com.example.sampleuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiSelector
import com.example.sampleuiautomatorproject.application.OzonApp
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class OzonFirstTest : AbstractApplicationTest<OzonApp>(OzonApp()) {

    @Test
    fun firstTest() = with(app) {
        open()
        clickSearch()
        typeToSearch("философия Java")
        assertEquals(getTitleFromResults(3),"Философия Java Эккель Брюс")
        assertEquals(getPriceFromResults(0),"1 938 ₽")
        clickTitleFromResults(3)
    }
}
