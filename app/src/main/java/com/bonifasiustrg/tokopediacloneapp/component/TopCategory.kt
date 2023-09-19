package com.bonifasiustrg.tokopediacloneapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bonifasiustrg.tokopediacloneapp.R
import com.bonifasiustrg.tokopediacloneapp.model.ListCategory

@Composable
fun TopCategory(modifier: Modifier = Modifier, listTopCategory: ListCategory) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Image(painter = painterResource(id = listTopCategory.imgTopCategory), contentDescription = "",
            modifier = modifier.size(40.dp)
            )
        Text(text = stringResource(id = listTopCategory.txtTopCategory), fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun TopCategoruPrev() {
    TopCategory(listTopCategory = ListCategory(R.drawable.cicil, R.string.txt_credit))
}