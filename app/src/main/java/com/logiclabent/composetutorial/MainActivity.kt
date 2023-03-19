package com.logiclabent.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.logiclabent.composetutorial.ui.theme.ComposeTutorialTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(msg= Message(author = "Android", body = "Jetpack compose"))
        }
    }
}

data class Message(val author: String, val body: String)


@Composable
fun MessageCard(msg: Message){
    Column {
        Text(text=msg.author)
        Text(text = msg.body)
    }

}

@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(msg = Message("Colleague","Hey, take a look at Jetpack compose, it is great"))
}
