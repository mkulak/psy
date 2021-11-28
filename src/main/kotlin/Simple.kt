import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.Image

fun main() {
    window.onload = { event ->
        val img = document.getElementById("mainImg") as Image
        val nextBtn = document.getElementById("nextBtn") as HTMLButtonElement
        nextBtn.onclick = {
            val picId = (1..4).random()
            img.src = "sigil${picId}.png"
            Unit
        }
        Unit
    }
}
