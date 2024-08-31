package kemalakkus.bankinguicompose.util

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import kemalakkus.bankinguicompose.R
import kemalakkus.bankinguicompose.model.CardType
import kemalakkus.bankinguicompose.ui.theme.BlueEnd
import kemalakkus.bankinguicompose.ui.theme.BlueStart
import kemalakkus.bankinguicompose.ui.theme.GreenEnd
import kemalakkus.bankinguicompose.ui.theme.GreenStart
import kemalakkus.bankinguicompose.ui.theme.OrangeEnd
import kemalakkus.bankinguicompose.ui.theme.OrangeStart
import kemalakkus.bankinguicompose.ui.theme.PurpleEnd
import kemalakkus.bankinguicompose.ui.theme.PurpleStart

fun getGradientColor(cardType: CardType): Brush {
    return when (cardType) {
        CardType.VISA -> Brush.linearGradient(
            colors = listOf(
                PurpleStart,
                PurpleEnd
            )
        )
        CardType.MASTER_CARD -> Brush.linearGradient(
            colors = listOf(
                BlueStart,
                BlueEnd
            )
        )
        CardType.PERSONAL -> Brush.linearGradient(
            colors = listOf(
                GreenStart,
                GreenEnd
            )
        )
        CardType.AMERICAN_EXPRESS -> Brush.linearGradient(
            colors = listOf(
                OrangeStart,
                OrangeEnd
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
        CardType.MASTER_CARD -> R.drawable.ic_mastercard
        CardType.PERSONAL -> R.drawable.ic_visa
        CardType.AMERICAN_EXPRESS -> R.drawable.ic_mastercard
    }
}