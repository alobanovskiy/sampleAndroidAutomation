package com.example.sampleuiautomatorproject.application

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.byText
import com.example.sampleuiautomatorproject.util.device
import com.example.sampleuiautomatorproject.util.ext.*

class PlayMarket : AbstractApplication("com.android.vending") {

    private val searchSelector = byText("Поиск игр и приложений")
    private val searchInputSelector = byText("Search for apps & games")
    private val installButton = byText("Установить")
    private val cancelButton = byText("Cancel")
    private val openInstalledAppButton = byText("Открыть")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun typeToSearch(text: String) {
        searchSelector.waitFindObject().text = text
        device.pressEnter()
    }

    fun clickResult(resultName: String) {
        byText(resultName).waitFindObject().click()
    }

    fun clickInstall() {
        installButton.waitFindObject().click()
    }

    fun waitForInstalled() {
        openInstalledAppButton
            .waitFindObject()
            .waitIsClickable(true, 25.secondsToMillis())
    }

    fun openInstalledApp() {
        //device.click(770,540)
        openInstalledAppButton.waitFindObject().clickAndWaitnewWindow()
    }
}
