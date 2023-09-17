package com.bonifasiustrg.tokopediacloneapp.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Row(modifier = modifier.width(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            OutlinedTextField(
                value = "",
                onValueChange = {

                },
                leadingIcon = { Icon(imageVector = Icons.Outlined.Search, contentDescription = null) },
                placeholder = { Text(text = "Search here") },
                modifier = modifier.widthIn(min = 200.dp),
                shape = RoundedCornerShape(16.dp)
            )

            Icon(imageVector = Icons.Outlined.Email,
                modifier = modifier.size(24.dp),
                contentDescription = null
            )
            Icon(imageVector = Icons.Outlined.ShoppingCart,
                modifier = modifier.size(24.dp),
                contentDescription = null
            )
            Icon(imageVector = Icons.Outlined.Notifications,
                modifier = modifier.size(24.dp),
                contentDescription = null
            )
            Icon(imageVector = Icons.Outlined.Menu,
                modifier = modifier.size(36.dp),
                contentDescription = null
            )
        }

        Row(
            modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = null, modifier = modifier.size(16.dp))
            Text(text = "Dikirim ke alamat", fontSize = 12.sp)
            Text(text = "Bonifasius Tarigan", fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Icon(imageVector = Icons.Outlined.KeyboardArrowDown, contentDescription = null, modifier = modifier.size(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopBarPrev() {
    MainTopBar()
}

