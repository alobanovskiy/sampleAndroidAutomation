package com.example.sampleuiautomatorproject.application.ozon

import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.waitFindObject

class ProfilePage {
    private val loginButtonSelector = byStringRes("ru.ozon.app.android:id/buttonAtomTitleTv")
    private val enterByEmailSelector = byStringRes("ru.ozon.app.android:id/hintButtonsContainerLl")
    private val emailFieldSelector = byStringRes("ru.ozon.app.android:id/fieldEt")
    private val getCodeSelector = byStringRes("ru.ozon.app.android:id/submitBtn")

    fun clickLogIn() {
        loginButtonSelector.waitFindObject().click()
    }

    fun typeIntoEmailField(email: String) {
        emailFieldSelector.waitFindObject().text = email
    }

    fun clickEnterByEmail() {
        enterByEmailSelector.waitFindObject().click()
    }

    fun clickGetCode() {
        getCodeSelector.waitFindObject().click()
    }
}