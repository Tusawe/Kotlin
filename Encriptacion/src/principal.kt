import java.lang.StringBuilder
import java.util.*

val cripto : String = "QWEASDZXCRTYFGHVBNUIOPJKLM"

fun main() {

    var sc = Scanner(System.`in`)
    println("Introduzca el mensaje a encriptar:")
    var cadena = sc.nextLine()

    cadena = simplificarCadena(cadena)
    println(cadena)
    println(encriptar(cadena))
    println(desencriptar(encriptar(cadena)))

}

fun encriptar (cadena : String) : String {

    var mensaje = StringBuilder()

    for (i in 0 until cadena.length) {

        mensaje.append(cripto[cadena[i].toInt()-65])

    }

    return mensaje.toString()

}

fun desencriptar (cadena : String) : String {

    var mensaje = StringBuilder()

    for (i in 0 until cadena.length) {
        for (x in 0 until cripto.length) {
            if (cadena[i] == cripto[x]) {
                mensaje.append((x + 65).toChar())
            }
        }
    }

    return mensaje.toString()

}

fun simplificarCadena (cadena : String) : String {
    var cadenaNueva = StringBuilder()

    for(i in 0 until cadena.length){

        when(cadena[i]){

            'á' -> cadenaNueva.append("A")
            'é' -> cadenaNueva.append("E")
            'í' -> cadenaNueva.append("I")
            'ó' -> cadenaNueva.append("O")
            'ú' -> cadenaNueva.append("U")
            'ñ' -> cadenaNueva.append("N")
            'Á' -> cadenaNueva.append("A")
            'É' -> cadenaNueva.append("E")
            'Í' -> cadenaNueva.append("I")
            'Ó' -> cadenaNueva.append("O")
            'Ú' -> cadenaNueva.append("U")
            'Ñ' -> cadenaNueva.append("N")
            in 'a'..'z' -> cadenaNueva.append((cadena[i].toInt()-97+65).toChar())
            in 'A'..'Z' -> cadenaNueva.append(cadena[i])
            ' ' -> cadenaNueva.append("")
            else -> cadenaNueva.append("")

        }

    }

    return cadenaNueva.toString()

}

