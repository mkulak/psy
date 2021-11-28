import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    window.onload = { event ->
        document.getElementById("root")?.innerHTML = "<h1>TADA</h1>"
        Unit
    }
}
