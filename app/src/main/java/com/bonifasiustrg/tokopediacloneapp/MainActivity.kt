package  com.bonifasiustrg.tokopediacloneapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.bonifasiustrg.tokopediacloneapp.component.MainTopBar
import com.bonifasiustrg.tokopediacloneapp.component.TopMenu
import com.bonifasiustrg.tokopediacloneapp.model.dummyListTopMenu
import com.bonifasiustrg.tokopediacloneapp.ui.theme.TokopediaCloneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TokopediaCloneAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MarketApp()
                }
            }
        }
    }
}


@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
    ) {
//        your code compose here
        Column {

            MainTopBar()
            MainTopMenu()
        }
    }

}

@Composable
fun MainTopMenu() {
    LazyRow() {
        items(dummyListTopMenu) {
            TopMenu(listTopMenu = it)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MainTopMenuPrev() {
    TokopediaCloneAppTheme {
        MainTopMenu()
    }
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
    TokopediaCloneAppTheme {
        MarketApp()
    }
}
