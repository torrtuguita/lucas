
fun main(){
    var num1 = 15
    var num2 = 5
    var palavra = "osso"
    var palavraR = palavra.reversed()
    var acao = readLine()
    var ligar : Boolean = true
    val media = (num1 + num2)/2

    while (ligar){
        when (acao){
            "1" -> if (palavra == palavraR){
                println ("é pali")
                break
            }else{
                println("não é pali")
                break
            }
            "media" -> if (ligar){
                println("sua media é $media")
                break
            }
            "3" -> ligar = false
            else -> if (ligar){
                println("numero invalido")
                break
            }
        }
    }
}