package kemalakkus.bankinguicompose.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.CurrencyBitcoin
import androidx.compose.material.icons.filled.CurrencyFranc
import androidx.compose.material.icons.filled.CurrencyLira
import androidx.compose.material.icons.filled.CurrencyPound
import androidx.compose.material.icons.filled.CurrencyRuble
import androidx.compose.material.icons.filled.CurrencyYen
import androidx.compose.material.icons.filled.CurrencyYuan
import androidx.compose.material.icons.filled.Euro
import kemalakkus.bankinguicompose.model.Card
import kemalakkus.bankinguicompose.model.CardType
import kemalakkus.bankinguicompose.model.Currency
import kemalakkus.bankinguicompose.util.getCardIcon
import kemalakkus.bankinguicompose.util.getGradientColor
import kemalakkus.bankinguicompose.util.maskCardNumber

object CurrencyDataProvider {
    fun getCurrencyItems(): List<Currency> {
        return listOf(
            Currency(
                name = "USD",
                buy = 10.95f,
                sell = 10.85f,
                icon = Icons.Default.AttachMoney
            ),
            Currency(
                name = "EUR",
                buy = 14.75f,
                sell = 14.35f,
                icon = Icons.Default.Euro
            ),
            Currency(
                name = "TL",
                buy = 5.23f,
                sell = 5.13f,
                icon = Icons.Default.CurrencyLira
            ),
            Currency(
                name = "PND",
                buy = 20.64f,
                sell = 20.54f,
                icon = Icons.Default.CurrencyPound
            ),
            Currency(
                name = "YEN",
                buy = 12.74f,
                sell = 12.64f,
                icon = Icons.Default.CurrencyYen
            ),
            Currency(
                name = "RBL",
                buy = 10.95f,
                sell = 10.85f,
                icon = Icons.Default.CurrencyRuble
            ),
            Currency(
                name = "YUAN",
                buy = 8.33f,
                sell = 8.13f,
                icon = Icons.Default.CurrencyYuan
            ),
            Currency(
                name = "FRC",
                buy = 3.95f,
                sell = 3.85f,
                icon = Icons.Default.CurrencyFranc
            ),
            Currency(
                name = "BTC",
                buy = 43.77f,
                sell = 43.47f,
                icon = Icons.Default.CurrencyBitcoin
            ),
            Currency(
                name = "USD",
                buy = 10.95f,
                sell = 10.85f,
                icon = Icons.Default.AttachMoney
            ),
            Currency(
                name = "EUR",
                buy = 14.75f,
                sell = 14.35f,
                icon = Icons.Default.Euro
            ),
            Currency(
                name = "TL",
                buy = 5.23f,
                sell = 5.13f,
                icon = Icons.Default.CurrencyLira
            ),
            Currency(
                name = "PND",
                buy = 20.64f,
                sell = 20.54f,
                icon = Icons.Default.CurrencyPound
            ),
            Currency(
                name = "YEN",
                buy = 12.74f,
                sell = 12.64f,
                icon = Icons.Default.CurrencyYen
            ),
            Currency(
                name = "RBL",
                buy = 10.95f,
                sell = 10.85f,
                icon = Icons.Default.CurrencyRuble
            ),
            Currency(
                name = "YUAN",
                buy = 8.33f,
                sell = 8.13f,
                icon = Icons.Default.CurrencyYuan
            ),
            Currency(
                name = "FRC",
                buy = 3.95f,
                sell = 3.85f,
                icon = Icons.Default.CurrencyFranc
            ),
            Currency(
                name = "BTC",
                buy = 43.77f,
                sell = 43.47f,
                icon = Icons.Default.CurrencyBitcoin
            ),
        )
    }
}