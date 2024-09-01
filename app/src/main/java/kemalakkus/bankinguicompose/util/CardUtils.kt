package kemalakkus.bankinguicompose.util

import androidx.compose.ui.graphics.Brush
import kemalakkus.bankinguicompose.R
import kemalakkus.bankinguicompose.model.CardType
import kemalakkus.bankinguicompose.ui.theme.BlueEnd
import kemalakkus.bankinguicompose.ui.theme.BlueStart
import kemalakkus.bankinguicompose.ui.theme.GrayEnd
import kemalakkus.bankinguicompose.ui.theme.GrayStart
import kemalakkus.bankinguicompose.ui.theme.GreenEnd
import kemalakkus.bankinguicompose.ui.theme.GreenStart
import kemalakkus.bankinguicompose.ui.theme.RedEnd
import kemalakkus.bankinguicompose.ui.theme.RedStart

fun getGradientColor(cardType: CardType): Brush {
    return when (cardType) {
        CardType.MASTER_CARD -> Brush.linearGradient(
            colors = listOf(
                GrayStart,
                GrayEnd
            )
        )
        CardType.PAYPAL -> Brush.linearGradient(
            colors = listOf(
                BlueEnd,
                BlueStart
            )
        )
        CardType.VISA -> Brush.linearGradient(
            colors = listOf(
                RedStart,
                RedEnd
            )
        )
        CardType.AMERICAN_EXPRESS -> Brush.linearGradient(
            colors = listOf(
                GreenStart,
                GreenEnd
            )
        )
    }
}

fun maskCardNumber(cardNumber: String): String {
    if (cardNumber.length != 16) {
        throw IllegalArgumentException("Card number must be exactly 12 digits")
    }

    val maskedPart = "************"
    val visiblePart = cardNumber.takeLast(4)

    val formattedMaskedPart = maskedPart.chunked(4).joinToString(" ")
    val formattedVisiblePart = visiblePart.chunked(4).joinToString(" ")

    return "$formattedMaskedPart $formattedVisiblePart"
}

fun getCardIcon(cardType: CardType): Int {
    return when (cardType) {
        CardType.VISA -> R.drawable.ic_visa
        CardType.MASTER_CARD -> R.drawable.ic_master_card
        CardType.PAYPAL -> R.drawable.ic_pay_pal
        CardType.AMERICAN_EXPRESS -> R.drawable.ic_american_express
    }
}