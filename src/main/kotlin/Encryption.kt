import kotlin.time.times

class Encryption {
    val m = 4
    val reverse = true

    val keycode = "asdfasdf67a8s7d67f8a7sasdff"

    fun Encrypt(pw: String): String {
        var password = ""
        var result = ""
        val list = ArrayList<ArrayList<Int>>()
        val resultList = ArrayList<String>()
        if (reverse){
            pw.toCharArray().reversedArray().forEach {
                password+=it
            }
        }
        password.forEachIndexed { index, c ->
            var mx = m
            password.forEach { keyC ->
                mx*=(m*keyC.code)
            }
            resultList.add((c.code.toLong()*mx).toString())
        }
        password.forEachIndexed { index, c ->
            var key = c.code.toLong()
            keycode.forEach { keyC ->
                key*=m
            }
            resultList[index]=(resultList[index]+key.toString())
        }
        resultList.forEach {
            result+=it
        }
        return result
    }
}