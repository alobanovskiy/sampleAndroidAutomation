package com.example.sampleuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.application.ozon.OzonMainPage
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class OzonFirstTest : AbstractApplicationTest<OzonMainPage>(
    OzonMainPage()
) {

    @Test
    fun firstTest() = with(app) {
        open()
        clickSearch()
        typeToSearch("философия Java")
        byText("Философия Java Эккель Брюс").waitFindObject(10)
        assertEquals(getPriceFromResults(0),"1 938 ₽")
        clickTitleFromResults(3)
    }
}
