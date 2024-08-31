package kemalakkus.bankinguicompose.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class Finance(
    val title: String,
    val icon: ImageVector,
    val backgroundColor: Color,
)
