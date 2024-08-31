package kemalakkus.bankinguicompose.data

import kemalakkus.bankinguicompose.model.Card
import kemalakkus.bankinguicompose.model.CardType
import kemalakkus.bankinguicompose.util.getCardIcon
import kemalakkus.bankinguicompose.util.getGradientColor
import kemalakkus.bankinguicompose.util.maskCardNumber

object CardDataProvider {
    fun getCardItems(): List<Card> {
        return listOf(
            Card(
                cardType = CardType.VISA,
                cardNumber = maskCardNumber("1234567890127352"),
                cardName = "Business Card",
                balance = 20.893,
                color = getGradientColor(CardType.VISA),
                icon = getCardIcon(CardType.VISA)
            ),
            Card(
                cardType = CardType.MASTER_CARD,
                cardNumber = maskCardNumber("1234902127329032"),
                cardName = "Shopping Card",
                balance = 11.343,
                color = getGradientColor(CardType.MASTER_CARD),
                icon = getCardIcon(CardType.MASTER_CARD)
            ),
            Card(
                cardType = CardType.PERSONAL,
                cardNumber = maskCardNumber("1256362352345632"),
                cardName = "Personal Card",
                balance = 120.423,
                color = getGradientColor(CardType.PERSONAL),
                icon = getCardIcon(CardType.PERSONAL)
            )
        )
    }
}