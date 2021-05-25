package com.example.sampleuiautomatorproject.test

import com.example.sampleuiautomatorproject.application.ozon.OzonMainPage
import com.example.sampleuiautomatorproject.application.ozon.ProfilePage
import junit.framework.Assert.assertEquals
import org.junit.Test

class OzonThirdTest : AbstractApplicationTest<OzonMainPage>(
    OzonMainPage()
){
    @Test
    fun thirdTest() = with(app) {
        open()
        clickProfile()
        clickLogIn()
        ProfilePage().clickEnterByEmail()
        ProfilePage().typeIntoEmailField("text")
        ProfilePage().clickGetCode()
        assertEquals(getErrorText(), "Некорректный формат почты")
    }
}