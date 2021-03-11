package com.example.myiyaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myiyaapp.ui.theme.MyIyaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIyaAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
                    NewsStory()
                }
            }
        }
    }
}

@Composable
fun NewsStory() {
    MaterialTheme() {
        val typography = MaterialTheme.typography
        Column(
            modifier = Modifier.padding(16.dp),

        ) {
            Image(
                painter = painterResource(R.drawable.headers),
                contentDescription = null,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
                    .shadow(15.dp)
                    .clip(shape = RoundedCornerShape(4.dp)),
                contentScale = ContentScale.FillBounds
            )
            Spacer(modifier = Modifier.requiredHeight(16.dp))
            Text(
                "ID: {KODE BOMB}", style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text("Release Date: 2018-05-17")
            Text("{KODE BOMB} 朝から晩までチ●ポまみれのケダモノ性交！！理性吹き飛ぶほどイキ続けてドーパミン全開ノンストップ全身痙攣アクメ 日菜々はのん")
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyIyaAppTheme {
        Greeting("Android")
    }
}