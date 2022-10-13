package com.example.demobottomsheetnav

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

class StandardBottomSheetView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AbstractComposeView(context, attrs, defStyleAttr) {

    @Composable
    override fun Content() {
        var drawSecondText by remember { mutableStateOf(false) }
        Column {

            Text(
                text = "This is my text",
                modifier = Modifier.height(250.dp)
            )

            LaunchedEffect(Unit) {
                delay(2000)
                drawSecondText = true
            }
            if (drawSecondText) {
                Text(
                    text = "this is more text",
                    modifier = Modifier.height(150.dp)
                )
            }
        }
    }
}