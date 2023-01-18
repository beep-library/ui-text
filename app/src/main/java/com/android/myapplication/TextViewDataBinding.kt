package com.android.myapplication

import android.text.method.LinkMovementMethod
import android.util.Log
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("setUIText")
fun TextView.setUIText(uiText: UIText?) {
    Log.d("TAG", "setUIText: $uiText")
    if (uiText == null) return
    if (uiText.clickable) {
        movementMethod = LinkMovementMethod()
    }
    text = uiText.asString(context)
}
