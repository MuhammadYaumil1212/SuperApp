import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

@Composable
fun AppText(
    text: String,
    fontWeight: FontWeight,
    fontSize: TextUnit,
    overflow:TextOverflow,
    maxLine:Int = 1
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        overflow = overflow,
        maxLines = maxLine
    )
}
