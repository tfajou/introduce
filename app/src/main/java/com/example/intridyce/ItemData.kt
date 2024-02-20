package com.example.intridyce

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class ItemData(
    val Image:Int,
    val name: String,
    val Price:Int,
    val nickname:String,
    val interestCnt:Int,
    val Chat: Int,
    val Like: Boolean
):Parcelable