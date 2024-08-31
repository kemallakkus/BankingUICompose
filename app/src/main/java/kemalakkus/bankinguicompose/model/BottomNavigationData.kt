package kemalakkus.bankinguicompose.model

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationData(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)
