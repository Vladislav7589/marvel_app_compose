
package com.example.marvel_app_compose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.marvel_app_compose.ui.theme.Marvel_app_composeTheme
import com.example.marvel_app_compose.ui.theme.BackgroundColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*
import com.example.marvel_app_compose.units.*
import com.google.accompanist.pager.*

class CustomTriangleShape : Shape {

    override fun createOutline(
        size: androidx.compose.ui.geometry.Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            moveTo(size.width, (size.height * 0.40).toFloat())
            lineTo(0F, size.height)
            lineTo(size.width, size.height)
            close()
        }
        return Outline.Generic(path)
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val color = remember {
                mutableStateOf(Color.Blue)
            }
            Marvel_app_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = BackgroundColor) {
                    Box(modifier = Modifier.clip(CustomTriangleShape()).background(color.value))
                    Screen(color)

                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Screen(color:  MutableState<Color>) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImageComponent()
        TextComponent()
        SliderComponent(color)


    }
}