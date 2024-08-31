package kemalakkus.bankinguicompose.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Brush

data class Card(
    val cardType: CardType,
    val cardNumber: String,
    val cardName: String,
    val balance: Double,
    val color: Brush,
    @DrawableRes val icon: Int
)

