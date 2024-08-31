package kemalakkus.bankinguicompose.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kemalakkus.bankinguicompose.data.FinanceDataProvider

@Preview
@Composable
fun FinanceSection() {
    val financeItems = FinanceDataProvider.getFinanceItems()

    Column {
        Text(
            text = "Finance",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp),
            color = MaterialTheme.colorScheme.onBackground
        )
    }

    LazyRow {
        items(financeItems.size) { index ->
            FinanceItem(index)
        }
    }
}