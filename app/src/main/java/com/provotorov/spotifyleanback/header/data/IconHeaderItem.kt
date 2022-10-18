package com.provotorov.spotifyleanback.header.data

import androidx.annotation.DrawableRes
import androidx.leanback.widget.Action.NO_ID
import androidx.leanback.widget.HeaderItem

class IconHeaderItem(
    id: Long,
    name: String,
    @DrawableRes val iconResId: Int
) : HeaderItem(id, name) {
    constructor(name: String, @DrawableRes iconResId: Int): this(NO_ID, name, iconResId)
}