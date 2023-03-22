package com.example.kotiki

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Kotik(
    val name: String,
    val owner: String,
    val text: String,

    ) : Parcelable
