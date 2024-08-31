package kemalakkus.bankinguicompose.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector

data class Currency(
    val name: String,
    val sell: Float,
    val buy: Float,
    val icon: ImageVector
)

