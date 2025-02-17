package com.daylab.superapp.presentation.components

import AppText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.daylab.superapp.presentation.ui.theme.BrownLight
import com.daylab.superapp.presentation.ui.theme.BrownSand

@Composable
fun AppBanner(
    modifier: Modifier = Modifier,
    imageUrl: String? = "",
    title: String?,
    description: String?
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .padding(start = 16.dp, end = 16.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(color = BrownSand)

    ) {
        imageUrl?.let {
            AsyncImage(
                modifier = Modifier
                    .fillMaxSize(),
                model = imageUrl,
                contentDescription = "Banner image",
                contentScale = ContentScale.Crop
            )
        }
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .padding(50.dp),
        ) {
            title?.let {
                AppText(
                    text = it,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    fontColor = BrownLight,
                    maxLine = 2,
                    lineHeigth = 30
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            description?.let {
                AppText(
                    text = it,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    fontColor = BrownLight
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun AppBannerPreview() {
    AppBanner(
        imageUrl = "https://unsplash.com/photos/a-couple-of-people-standing-next-to-a-body-of-water-5RjrMyQY4gg",
        title = "hello World",
        description = "Subtitle",
    )
}