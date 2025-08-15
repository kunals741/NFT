package com.kunal.nft.presentation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.kunal.nft.R
import com.kunal.nft.presentation.ui.composables.GlideAvifImage
import com.kunal.nft.presentation.ui.theme.Black75
import com.kunal.nft.presentation.ui.theme.Grey14
import com.kunal.nft.presentation.ui.theme.Grey75
import com.kunal.nft.presentation.ui.theme.InterFontFamily

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun SplashScreen(
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "NFT",
            style = TextStyle(
                color = Color.Black,
                fontSize = 38.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                fontFamily = InterFontFamily,
            ),
            modifier = Modifier.padding(top = 70.dp),
        )

        GlideAvifImage(
            "https://i2.seadn.io/ethereum/0x49cf6f5d44e70224e2e23fdcdd2c053f30ada28b/7756d8436bab1402e1e9f97ede028a/e87756d8436bab1402e1e9f97ede028a.png",
            modifier = Modifier
                .padding(top = 20.dp)
                .size(width = 380.dp, 480.dp)
                .clip(RoundedCornerShape(50.dp))
        )

        Text(
            "Find, Collect and Sell Amazing NFTs",
            style = TextStyle(
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = InterFontFamily,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.padding(start = 68.dp, top = 20.dp, end = 68.dp)
        )

        Text(
            "Explore the best collection’s of NFTs and buy and sell your NFTs as well",
            style = TextStyle(
                color = Black75,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = InterFontFamily,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.padding(start = 68.dp, top = 11.dp, end = 68.dp)
        )

        Button(
            onClick = {
                //todo
            },
            modifier.padding(horizontal = 77.dp),
            contentPadding = PaddingValues(
                vertical = 20.dp, horizontal = 44.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White,
                disabledContainerColor = Grey75,
                disabledContentColor = Grey14
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Let’s Start",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = InterFontFamily,
                    ),
                )
                Spacer(modifier = Modifier.weight(1f, fill = true))
                Image(
                    painter = painterResource(R.drawable.ic_arrow_right),
                    contentDescription = "right arrow",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(28.dp, 12.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    Scaffold {
        SplashScreen(modifier = Modifier.padding(it))
    }
}