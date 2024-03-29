package com.les.chat.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val uid: String, val username: String, val displayPictureUrl: String) : Parcelable{
    constructor() : this("","","")
}
