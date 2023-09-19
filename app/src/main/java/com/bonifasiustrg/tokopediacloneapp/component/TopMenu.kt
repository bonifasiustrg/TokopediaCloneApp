package com.bonifasiustrg.tokopediacloneapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bonifasiustrg.tokopediacloneapp.R
import com.bonifasiustrg.tokopediacloneapp.model.ListTopMenu
import com.bonifasiustrg.tokopediacloneapp.ui.theme.TokopediaCloneAppTheme

@Composable
fun TopMenu(modifier: Modifier = Modifier, listTopMenu: ListTopMenu) {
    Row(
        modifier = modifier
            .padding(16.dp)
            .height(IntrinsicSize.Max),
        horizontalArrangement = spacedBy(8.dp)
    ) {
        Image(painter = painterResource(id = listTopMenu.imgTopBar), contentDescription = "",
            modifier = modifier.size(40.dp)
            )

        Column{
            Text(text = stringResource(id = listTopMenu.txtTopBar),
                fontSize = 14.sp
            )
            Text(text = stringResource(id = listTopMenu.descTopBar),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        }

        Divider(
            modifier = modifier
                .fillMaxHeight()
                .width(1.dp),
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopMenuPrev() {
    TokopediaCloneAppTheme {
        TopMenu(
            listTopMenu = ListTopMenu(
                R.drawable.gopay,
                R.string.txt_gopay,
                R.string.txt_dummy_gopay
            )
        )
    }
}