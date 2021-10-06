package com.example.compose_intro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.compose_intro.ui.theme.Compose_IntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Title() }
    }
}
@Composable
fun Title(){
    val Context = LocalContext.current
    Text(text = "Welcome",
        fontFamily = FontFamily.Cursive,
        fontSize = 46.sp,
        color = Color.Blue,

        modifier = Modifier.clickable {
            Toast.makeText(Context, "Clicked", Toast.LENGTH_SHORT).show()
        }
    )

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Surface(Modifier.fillMaxSize()) {
        Title()
    }
}


