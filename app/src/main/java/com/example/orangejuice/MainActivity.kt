package com.example.orangejuice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.orangejuice.ui.theme.OrangeJuiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrangeJuiceTheme {
                // A surface container using the 'background' color from the theme
                OrangeJuiceMaker()

            }
        }
    }
}

@Composable
fun OrangeJuiceMaker(modifier: Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(align = Alignment.Center)) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        var result by remember {
            mutableStateOf(1)
        }
        var OrangeImage = when (result) {
            1 -> R.drawable.orange_tree
            2 -> R.drawable.orange_fruit
            3 -> R.drawable.orange_drink_full
            4 -> R.drawable.orange_drink_empty
            else -> R.drawable.orange_tree
        }

        Button(onClick = {
            result += 1
        })
        {
            if (result == 1) {

                Column(
                    modifier = modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        painter = painterResource(id = OrangeImage),
                        contentDescription = "Orange",
                        Modifier.background(color = Color.Green, shape = RectangleShape)
                    )
                    Spacer(modifier = Modifier.height(60.dp))


                    Text(text = stringResource(id = R.string.FirstStep))

                }
            }

            if (result == 2) {
                Column(
                    modifier = modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = { result++ }) {

                    }
                    Image(
                        painter = painterResource(id = OrangeImage),
                        contentDescription = "Orange",
                        Modifier.background(color = Color.Green, shape = RectangleShape)
                    )
                    Spacer(modifier = Modifier.height(60.dp))
                    Text(text = stringResource(id = R.string.SecondStep))
                }


            }
            if (result == 3) {
                Column(
                    modifier = modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = OrangeImage),
                        contentDescription = "Orange",
                        Modifier.background(color = Color.Green, shape = RectangleShape)
                    )
                    Spacer(modifier = Modifier.height(60.dp))
                    Text(text = stringResource(id = R.string.ThirdStep))
                }

            }

            if (result == 4) {
                Column(
                    modifier = modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = OrangeImage),
                        contentDescription = "Orange",
                        Modifier.background(color = Color.Green, shape = RectangleShape)
                    )

                    Spacer(modifier = Modifier.height(60.dp))
                    Text(text = stringResource(id = R.string.FourthStep))
                }



            }



        }

    }


}










@Preview(showBackground = true)
@Composable
fun OrangeJuiceMakerPreview()
{
    OrangeJuiceMaker()
}