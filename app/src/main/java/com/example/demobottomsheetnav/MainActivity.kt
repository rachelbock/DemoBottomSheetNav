package com.example.demobottomsheetnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_EXPANDED
import com.google.android.material.bottomsheet.BottomSheetBehavior.State

class MainActivity : AppCompatActivity() {

    val bottomSheet: FrameLayout by lazy {
        findViewById(R.id.standard_bottom_sheet)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toggleBottomSheet() {
        val behavior = (bottomSheet.layoutParams as CoordinatorLayout.LayoutParams).behavior as CustomBottomSheetBehavior

        if (behavior.state == STATE_EXPANDED) {
            behavior.hide()
        } else {
            behavior.show()
        }
    }
}