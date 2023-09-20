
class Encryption {
    val m = 3
    val reverse = true

    val keycode = "asdfasdf67a87df8a7sasdff"

    fun Encrypt(pw: String): String {
        var password = ""
        var result = ""
        var returnResult = ""
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
        for (i in result.indices){
            if (i%2 == 0 && i != 0 && i != result.toCharArray().size-1){
                returnResult += numberToEnglishChar("${result[i-1]}${result[i]}")
            }
        }
        return returnResult
    }
    fun numberToEnglishChar(number: String): String {
        return when (number.toInt()) {
            1 -> 'a'
            2 -> 'b'
            3 -> 'c'
            4 -> 'd'
            5 -> 'e'
            6 -> 'f'
            7 -> 'g'
            8 -> 'h'
            9 -> 'i'
            10 -> 'j'
            11 -> 'k'
            12 -> 'l'
            13 -> 'm'
            14 -> 'n'
            15 -> 'o'
            16 -> 'p'
            17 -> 'q'
            18 -> 'r'
            19 -> 's'
            20 -> 't'
            21 -> 'u'
            22 -> 'v'
            23 -> 'w'
            24 -> 'x'
            25 -> 'y'
            26 -> 'z'
            27 -> 'A'
            28 -> 'B'
            29 -> 'C'
            30 -> 'D'
            31 -> 'E'
            32 -> 'F'
            33 -> 'G'
            34 -> 'H'
            35 -> 'I'
            36 -> 'J'
            37 -> 'K'
            38 -> 'L'
            39 -> 'M'
            40 -> 'N'
            41 -> 'O'
            42 -> 'P'
            43 -> 'Q'
            44 -> 'R'
            45 -> 'S'
            46 -> 'T'
            47 -> 'U'
            48 -> 'V'
            49 -> 'W'
            50 -> 'X'
            51 -> 'Y'
            52 -> 'Z'
            53 -> '!'
            54 -> '@'
            55 -> '#'
            56 -> '$'
            57 -> '%'
            58 -> '^'
            59 -> '&'
            60 -> '*'
            61 -> '('
            62 -> ')'
            63 -> '['
            64 -> ']'
            65 -> '{'
            66 -> '}'
            67 -> '<'
            68 -> '>'
            69 -> '?'
            70 -> '/'
            71 -> '|'
            72 -> '\\'
            73 -> '+'
            74 -> '-'
            75 -> '='
            76 -> '_'
            77 -> '.'
            78 -> ','
            79 -> ';'
            80 -> ':'
            81 -> '`'
            82 -> '~'

            else -> number
        }.toString()
    }
}