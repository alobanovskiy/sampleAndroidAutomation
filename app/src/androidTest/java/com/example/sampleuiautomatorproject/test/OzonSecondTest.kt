package com.example.sampleuiautomatorproject.test

import com.example.sampleuiautomatorproject.application.ozon.OzonMainPage
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.device
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import org.junit.Assert.assertEquals
import org.junit.Test

class OzonSecondTest : AbstractApplicationTest<OzonMainPage>(
    OzonMainPage()
){

    @Test
    fun secondTest() = with(app) {
        open()
        clickSearch()
        typeToSearch("философия Java")
        byText("Философия Java Эккель Брюс").waitFindObject(10)
        clickTitleFromResults(3)
        clickFavourite()
        device.pressBack()
        device.pressBack()
        clickFavourite()
        moveToFavourites()
        assertEquals(getTitleFromResults(0),"Философия Java Эккель Брюс | Эккель Брюс")
        clickFavourite()
    }
}