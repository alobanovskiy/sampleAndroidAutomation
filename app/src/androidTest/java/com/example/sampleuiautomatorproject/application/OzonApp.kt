package com.example.sampleuiautomatorproject.application

import androidx.test.uiautomator.Direction
import androidx.test.uiautomator.UiObject2
import androidx.test.uiautomator.UiScrollable
import androidx.test.uiautomator.UiSelector
import com.example.sampleuiautomatorproject.util.byStringRes
import com.example.sampleuiautomatorproject.util.ext.clickAndWaitnewWindow
import com.example.sampleuiautomatorproject.util.ext.waitFindObject
import com.example.sampleuiautomatorproject.util.ext.waitFindObjects


//отнаследовать по примеру плеймаркет
class OzonApp : AbstractApplication("ru.ozon.app.android") {
    private val searchSelector = byStringRes("ru.ozon.app.android:id/searchTv")
    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")
    private val outsideZoneSelector = byStringRes("ru.ozon.app.android:id/touch_outside")
    private val priceSelector = byStringRes("ru.ozon.app.android:id/priceTv")
    private val titleSelector = byStringRes("ru.ozon.app.android:id/titleTv")
    private val addToFavouriteSelector = byStringRes("ru.ozon.app.android:id/favoriteIv")
    private val moveToFavouritesSelector = byStringRes("ru.ozon.app.android:id/menu_favorites")
    private val profileSelector = byStringRes("ru.ozon.app.android:id/menu_profile")
    private val loginButtonSelector = byStringRes("ru.ozon.app.android:id/buttonAtomTitleTv")
    private val enterByEmailSelector = byStringRes("ru.ozon.app.android:id/hintButtonsContainerLl")
    private val emailFieldSelector = byStringRes("ru.ozon.app.android:id/fieldEt")
    private val getCodeSelector = byStringRes("ru.ozon.app.android:id/submitBtn")
    private val errorMsgSelector = byStringRes("ru.ozon.app.android:id/textinput_error")

    fun getFormTitle(): String {
        return byStringRes("ru.ozon.app.android:id/titleTv").waitFindObject(10).text
    }

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun getErrorText(): String {
       return errorMsgSelector.waitFindObject().text
    }

    fun clickGetCode() {
        getCodeSelector.waitFindObject().click()
    }

    fun clickProfile() {
        profileSelector.waitFindObject().click()
    }

    fun clickEnterByEmail() {
        enterByEmailSelector.waitFindObject().click()
    }

    fun typeIntoEmailField(email: String) {
        emailFieldSelector.waitFindObject().text = email
    }

    fun clickTitleFromResults(instanceId: Int) {
        titleSelector.waitFindObjects(10)[instanceId].clickAndWaitnewWindow()
    }

    fun getTitleFromResults(instanceId: Int): String {
        return titleSelector.waitFindObjects(15)[instanceId].text
    }

    fun getPriceFromResults(instanceId: Int): String {
        return priceSelector.waitFindObjects(10)[instanceId].text
    }

    fun clickFavourite() {
        addToFavouriteSelector.waitFindObject().longClick()
    }

    fun clickLogIn() {
        loginButtonSelector.waitFindObject().click()
    }

    fun clickLayout() {
        val appViews = UiScrollable(
            UiSelector().resourceId("ru.ozon.app.android:id/containerLL")
                .scrollable(true)
        )
        appViews.swipeDown(5)
    }

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun moveToFavourites() {
        moveToFavouritesSelector.waitFindObject().click()
    }
}

