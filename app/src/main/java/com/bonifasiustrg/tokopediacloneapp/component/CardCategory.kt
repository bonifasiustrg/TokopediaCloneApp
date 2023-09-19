package com.bonifasiustrg.tokopediacloneapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
import com.bonifasiustrg.tokopediacloneapp.model.ListBanner
import com.bonifasiustrg.tokopediacloneapp.model.ListCategory

@Composable
fun CardCategory(modifier: Modifier = Modifier, listBanner: ListBanner) {
    Card(
        modifier = modifier
//            .widthIn(180.dp)
            .padding(start = 16.dp, top = 8.dp, bottom = 8.dp)
            .width(IntrinsicSize.Min)
            .heightIn(48.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Image(painter = painterResource(id = listBanner.imgBanner), contentDescription = "")
    }
}

@Preview(showBackground = true)
@Composable
fun CardCategoruPrev() {
    CardCategory(listBanner = ListBanner(R.drawable.banner1))
}