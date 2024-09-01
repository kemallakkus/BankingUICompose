package kemalakkus.bankinguicompose.presentation.component

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import kemalakkus.bankinguicompose.data.CardDataProvider
import kotlin.math.abs

@Preview
@Composable
fun CardSection() {
    val cardItems = CardDataProvider.getCardItems()
    val lazyListState = rememberLazyListState()

    LazyRow(state = lazyListState) {
        items(cardItems.size) { index ->
            val scale by remember {
                derivedStateOf {
                    calculateScale(index, lazyListState)
                }
            }
            CardItem(index = index, scale = scale)
        }
    }
}

fun calculateScale(index: Int, lazyListState: LazyListState): Float {
    val visibleItemInfo = lazyListState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == index }
    return visibleItemInfo?.let {
        val itemCenter = it.offset + it.size / 2
        val viewportCenter = lazyListState.layoutInfo.viewportEndOffset / 2
        calculateScaleFactor(viewportCenter, itemCenter)
    } ?: 0.85f
}

fun calculateScaleFactor(viewportCenter: Int, itemCenter: Int): Float {
    val distanceFromCenter = abs(viewportCenter - itemCenter)
    val scaleFactor = 0.8f + (0.8f - distanceFromCenter / viewportCenter.toFloat()).coerceIn(0f, 0.15f)
    return scaleFactor
}
