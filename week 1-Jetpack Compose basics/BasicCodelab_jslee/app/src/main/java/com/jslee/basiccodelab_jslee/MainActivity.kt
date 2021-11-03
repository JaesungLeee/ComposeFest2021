package com.jslee.basiccodelab_jslee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jslee.basiccodelab_jslee.ui.theme.BasicCodelab_jsleeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicCodelab_jsleeTheme {
                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                }
                MyApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 4.dp)
    ) {
//        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
        Column(
            modifier = Modifier.fillMaxWidth().padding(24.dp),
        ) {
            Text(text = "Hello,")
            Text(text = name)
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    BasicCodelab_jsleeTheme {
//        Greeting("Android")
        MyApp()
    }

}

//@Composable
//private fun MyApp() {
//    Surface(color = MaterialTheme.colors.background) {
//        Greeting(name = "Android")
//    }
//}

@Composable
fun MyApp(names: List<String> = listOf("World", "Compose")) {
    Column {
        for (name in names) {
            Greeting(name = name)
        }
    }
}