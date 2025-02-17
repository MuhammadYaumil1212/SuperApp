import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.daylab.superapp.presentation.ui.theme.BrownChocolate

@Composable
fun AppText(
    text: String,
    fontWeight: FontWeight,
    fontSize: TextUnit,
    lineHeigth: Int = 1,
    fontColor: Color? = BrownChocolate,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    maxLine: Int = 1
) {
    Text(
        text = text,
        fontSize = fontSize,
        color = fontColor!!,
        fontWeight = fontWeight,
        overflow = overflow,
        maxLines = maxLine,
        lineHeight = lineHeigth.sp

    )
}
