
fun main() {
    println(comission(7000.00, 76000.00, vkPay))
}

const val mastercard = "Mastercard"
const val maestro = "Maestro"
const val visa = "Visa"
const val mir = "Мир"
const val vkPay = "VK Pay"


fun comission(amountMoneysTransferInMonth: Double, moneysTransfer: Double, type: String): Double {
    return when (type) {
        mastercard, maestro -> if (amountMoneysTransferInMonth < 75000.00 && moneysTransfer < 75000.00) 0.00
        else (moneysTransfer * 0.006) + 25.00
        visa, mir -> if (moneysTransfer * 0.0075 < 35.00) 35.00 else moneysTransfer * 0.0075
        vkPay -> 0.00
        else -> 0.00
    }
//    amountMoneysTransferInMonth + moneysTransfer ....тут мы потом будем прибавлять разовые переводы к сумме переводов за месяц
}






