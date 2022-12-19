package com.example.affirmation.model

import android.security.identity.AccessControlProfileId
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceId: Int,@DrawableRes val imageResourceId:Int) {

}