package kemalakkus.bankinguicompose.presentation.component

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kemalakkus.bankinguicompose.data.CardDataProvider

@Preview
@Composable
fun CardSection() {
    val cardItems = CardDataProvider.getCardItems()
    LazyRow {
        items(cardItems.size) {index ->
            CardItem(index)
        }
    }

}
