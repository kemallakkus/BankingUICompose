package kemalakkus.bankinguicompose.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.CurrencyBitcoin
import androidx.compose.material.icons.filled.Wallet
import kemalakkus.bankinguicompose.model.Card
import kemalakkus.bankinguicompose.model.CardType
import kemalakkus.bankinguicompose.model.Finance
import kemalakkus.bankinguicompose.ui.theme.BlueStart
import kemalakkus.bankinguicompose.ui.theme.GreenStart
import kemalakkus.bankinguicompose.ui.theme.OrangeStart
import kemalakkus.bankinguicompose.ui.theme.PurpleStart
import kemalakkus.bankinguicompose.util.getCardIcon
import kemalakkus.bankinguicompose.util.getGradientColor
import kemalakkus.bankinguicompose.util.maskCardNumber

object FinanceDataProvider {
    fun getFinanceItems(): List<Finance> {
        return listOf(
            Finance(
                title = "My\nBusiness",
                icon = Icons.Default.Business,
                backgroundColor = OrangeStart
            ),
            Finance(
                title = "My\nWallet",
                icon = Icons.Default.Wallet,
                backgroundColor = BlueStart
            ),
            Finance(
                title = "Finance\nAnalysis",
                icon = Icons.Default.CurrencyBitcoin,
                backgroundColor = GreenStart
            ),
            Finance(
                title = "My\nTransactions",
                icon = Icons.Default.Analytics,
                backgroundColor = PurpleStart
            )
        )
    }
}