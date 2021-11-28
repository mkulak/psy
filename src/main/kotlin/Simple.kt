import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.Image
import kotlin.random.Random

fun main() {
    window.onload = { event ->
        val img = document.getElementById("mainImg") as Image
        val nextBtn = document.getElementById("nextBtn") as HTMLButtonElement
        var picId = 0
        nextBtn.onclick = {
            val oldPicId = picId
            while (picId == oldPicId) {
                picId = Random.nextInt(1, 5)
            }
            img.src = "sigil${picId}.png"
            Unit
        }
        Unit
    }
}
