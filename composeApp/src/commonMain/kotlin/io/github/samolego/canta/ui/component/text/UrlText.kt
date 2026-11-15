package io.github.samolego.canta.ui.component.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle

private val urlPattern = """(https?://[^\s<>"')\]]+)""".toRegex()

/**
 * Renders description text with any `http(s)://` URLs removed entirely:
 * no clickable links and no raw URL text. The surrounding sentences are
 * kept as-is. (Arabic build: all visible links are removed by policy.)
 */
@Composable
fun UrlText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodySmall,
) {
    val stripped = text.replace(urlPattern, "").replace("""[ \t]+""".toRegex(), " ").replace(""" ?\n ?""".toRegex(), "\n").trim()
    Text(
        text = stripped,
        modifier = modifier,
        style = style,
    )
}
