package com.example.demobottomsheetnav

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior

class CustomBottomSheetBehavior @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : BottomSheetBehavior<View>(context, attrs) {

    init {
        peekHeight = 0
        skipCollapsed = true
        isHideable = false
        isDraggable = false
    }

    fun hide() {
        isHideable = true
        state = STATE_HIDDEN
    }

    fun show() {
        isHideable = false
        state = STATE_EXPANDED
    }
}