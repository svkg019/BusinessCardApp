package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.material.Icon
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Search
import androidx.compose.ui.res.colorResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NameDesignationWithIcon(
                        name = "Souvik Ghosh",
                        designation = "Android Developer"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    designation: String,
    mobileNumber: String,
    email: String,
    webSite: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.deepBlue))
    ) {
        NameDesignationWithIcon(name, designation)
        ContactInfo(mobileNumber, email, webSite)


    }

}

@Composable
fun NameDesignationWithIcon(name: String, designation: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Inside,
        )
        Text(
            text = name,
            modifier = modifier
                .fillMaxWidth()
                .align(alignment = Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 45.sp,
            color = Color.White
        )
        Text(
            text = designation,
            modifier = modifier
                .fillMaxWidth()
                .align(alignment = Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = Color(0xFF3ddc84)
        )

    }

}

@Composable
fun ContactInfo(
    mobileNumber: String,
    email: String,
    webSite: String,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(bottom = 15.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Row(


        ) {
            Icon(
                Icons.Rounded.Call,
                contentDescription = null,
                modifier = modifier.padding(start = 25.dp, end = 15.dp, bottom = 5.dp),
                tint = Color(0xFF3ddc84)


            )
            Text(
                text = mobileNumber,
                fontStyle = FontStyle.Normal,
                fontSize = 20.sp,
                color = Color(0xFF3ddc84)
            )

        }
        Row(


        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                modifier = modifier.padding(start = 25.dp, end = 15.dp, bottom = 5.dp),
                tint = Color(0xFF3ddc84)


            )
            Text(
                text = email,
                fontStyle = FontStyle.Normal,
                fontSize = 20.sp,
                color = Color(0xFF3ddc84)
            )

        }
        Row(


        ) {
            Icon(
                Icons.Rounded.Search,
                contentDescription = null,
                modifier = modifier.padding(start = 25.dp, end = 15.dp, bottom = 5.dp),
                tint = Color(0xFF3ddc84)


            )
            Text(
                text = webSite,
                fontStyle = FontStyle.Normal,
                fontSize = 20.sp,
                color = Color(0xFF3ddc84)
            )

        }


    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard(
            "Souvik Ghosh",
            "Android Developer",
            "+918637824592",
            "souvikghosh.education@gmail.com",
            "www.svkg.in"
        )

    }
}