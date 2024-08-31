package kemalakkus.bankinguicompose.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kemalakkus.bankinguicompose.navigation.BottomNavigationBar
import kemalakkus.bankinguicompose.presentation.component.CardSection
import kemalakkus.bankinguicompose.presentation.component.CurrenciesSection
import kemalakkus.bankinguicompose.presentation.component.FinanceSection
import kemalakkus.bankinguicompose.presentation.component.WalletSection

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {

    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                selectedIndex = selectedIndex,
                onItemSelected = { index ->
                    selectedIndex = index
                }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            WalletSection()


            CardSection()

            Spacer(modifier = Modifier.height(24.dp))

            FinanceSection()

            CurrenciesSection()
        }

        //FinanceSection()
        //CurrenciesSection()
    }
}