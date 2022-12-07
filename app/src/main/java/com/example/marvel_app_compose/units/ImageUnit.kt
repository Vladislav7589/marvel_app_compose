package com.example.marvel_app_compose.units
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.marvel_app_compose.R


@Composable
fun ImageComponent() {
    Image(
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .padding(all = 8.dp),
        painter = painterResource(R.drawable.marvel),
        contentDescription = "Logo Marvel"
    )
}
