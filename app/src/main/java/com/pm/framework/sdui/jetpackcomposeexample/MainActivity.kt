package com.pm.framework.sdui.jetpackcomposeexample

import android.graphics.Color
import android.os.Bundle
import android.widget.StackView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.pm.framework.sdui.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color.*
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MaterialTheme {
                RecipeList(defaultRecipes)
                Box { addTopBar() }
            }
        }
    }
}

@Composable
private fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        Greeting("Android")
    }
}

@Composable
fun Greeting(name: String) {
  //  Surface(color = MaterialTheme.colors.primary) {
        Column(modifier = Modifier.padding(24.dp)) {
            Text(text = "Hello, World", style=TextStyle(color= Companion.Red))
            Text(text = "Hello, Second World", style=TextStyle(color=Companion.Red))
            Text(text = "Hello, Third World", style=TextStyle(color=Companion.Red))
        }
   // }
}

@Composable
fun addTopBar() {

    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(title = {
            Text("Composable CookBook")
        })
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeExampleTheme {
        Greeting("Android")
    }
}