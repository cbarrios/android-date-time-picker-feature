package com.lalosapps.datetimepickerdialogs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lalosapps.datetimepickerdialogs.ui.theme.DateTimePickerDialogsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DateTimePickerDialogsTheme {

            }
        }
    }
}