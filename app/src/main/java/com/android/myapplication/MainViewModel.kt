package com.android.myapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn

class MainViewModel : ViewModel() {

    val uiText = flow {
        emit(
            UIText.Builder()
                .appendDynamicString("스타벅스에서")
                .spanOnTextColor(R.color.purple_200)
                .spanOnClickable { }
                .spanOnBold()
                .appendStringResource(R.string.map_bottom_sheet_title_brands_name)
                .appendDynamicString(" 10개")
                .spanOnTextColor(R.color.purple_200)
                .spanOnRelativeSize(1.2f)
                .appendStringResource(R.string.map_bottom_sheet_title_brands_size)
                .build()
        )
    }.stateIn(viewModelScope, SharingStarted.Eagerly, UIText.Empty)
}
