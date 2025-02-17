package com.daylab.superapp.presentation.components

import AppText
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.daylab.superapp.R

@Composable
fun AppToolbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .systemBarsPadding(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_user),
            contentDescription = "ic_user"
        )

        Spacer(modifier = Modifier.width(10.dp))

        AppText(
            text = "Add Address",
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            overflow = TextOverflow.Companion.Ellipsis,
        )

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_bell),
            contentDescription = "ic_bell"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppToolbarPrev() {
    AppToolbar()
}