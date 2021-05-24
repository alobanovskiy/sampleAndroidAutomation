package com.example.sampleuiautomatorproject.test

import com.example.sampleuiautomatorproject.application.OzonApp
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test

class OzonThirdTest : AbstractApplicationTest<OzonApp>(OzonApp()){
    @Test
    fun thirdTest() = with(app) {
        open()
        clickProfile()
        clickLogIn()
        clickEnterByEmail()
        typeIntoEmailField("text")
        clickGetCode()
        assertEquals(getErrorText(), "Некорректный формат почты")
    }
}