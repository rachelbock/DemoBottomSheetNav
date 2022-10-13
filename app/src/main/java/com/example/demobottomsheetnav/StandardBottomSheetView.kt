package com.example.demobottomsheetnav

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.unit.dp

class StandardBottomSheetView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    @Composable
    override fun Content() {
        Text(
            text = "This is my text",
            modifier = Modifier.height(250.dp)
        )
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

    }
}