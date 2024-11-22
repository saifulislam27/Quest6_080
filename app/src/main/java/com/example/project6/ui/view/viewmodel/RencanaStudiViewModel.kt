package com.example.project6.ui.view.viewmodel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.colorResource
import com.example.project6.R
import com.example.project6.model.Mahasiswa
import java.lang.reflect.Modifier


@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var chosenDropdown by remember {
        mutableStateOf(
            ""
        )
    }
    var checked by remember {
        mutableStateOf(false)
    }
    var pilihankelas by remember {
        mutableStateOf("")

    }
    var listData: MutableList<String> = mutableListOf(chosenDropdown, pilihankelas)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary))
    ) {
    }
}
