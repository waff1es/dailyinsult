package com.evilfloof.dailyinsult.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// Equivalent to the Affirmations class in the tutorial
data class Insult (
    @StringRes val insultResourceId: Int,
    @DrawableRes val floofResourceId: Int
)