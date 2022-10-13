package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xff0d3948)
                ) {
                    LogoAndName()
                }
            }
        }
    }
}


@Composable
// TODO change composable name
fun LogoAndName() {
    val logo = painterResource(R.drawable.android_logo);

    Box() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Image(painter = logo, contentDescription = null, modifier = Modifier.size(78.dp))
            Text(
                text = "Muhammad Rydwan",
                fontSize = 32.sp,
                fontWeight = FontWeight.Light,
                color = Color(0xffFFFFFF)
            )
            Text(text = "Mobile Developer at Reku", fontSize = 14.sp, color = Color(0xff76d99f), fontWeight = FontWeight.Bold)
        }
        ContactList()
    }

}

@Composable
fun ContactList() {
    Column(modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(bottom = 24.dp), verticalArrangement = Arrangement.Bottom,) {
        Divider(thickness = 1.dp, color = Color(0xff607a84))
        Row(modifier = Modifier.fillMaxWidth().padding(start = 48.dp).padding(vertical = 6.dp)) {
            Icon(
                Icons.Filled.Phone,
                contentDescription = "phone icon",
                modifier = Modifier.padding(end = 20.dp),
                tint = Color(0xff76d99f)
            )
            Text(text = "+62 82 117 055 066", color = Color.White)
        }
        Divider(thickness = 1.dp, color = Color(0xff607a84))
        Row(modifier = Modifier.fillMaxWidth().padding(start = 48.dp).padding(vertical = 6.dp)) {
            Icon(
                Icons.Filled.Share,
                contentDescription = "share icon",
                modifier = Modifier.padding(end = 20.dp),
                tint = Color(0xff76d99f)
            )
            Text(text = "@rydwan10", color = Color.White)
        }
        Divider(thickness = 1.dp, color = Color(0xff607a84))
        Row(modifier = Modifier.fillMaxWidth().padding(start = 48.dp).padding(vertical = 6.dp)) {
            Icon(
                Icons.Filled.Email,
                contentDescription = "email icon",
                modifier = Modifier.padding(end = 20.dp),
                tint = Color(0xff76d99f)
            )
            Text(text = "rydwan.dev@gmail.com", color = Color.White)
        }
    }
}


//@Composable
//fun ContactDivider() {
//    Divider(
//        color = Color(0xff607a84),
//        modifier = Modifier
//            .fillMaxHeight()
//            .width(1.dp)
//    )
//}

@Preview(showBackground = true, backgroundColor = 0xff0d3948)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        LogoAndName()
    }
}