
fun main() {
    println(comission(7000.00, 76000.00, MASTERCARD))
}

const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VKPAY = "VK Pay"


fun comission(amountMoneysTransferInMonth: Double, moneysTransfer: Double, type: String = VKPAY): Double {
    return when (type) {
        MASTERCARD, MAESTRO -> if (amountMoneysTransferInMonth < 75000.00 && moneysTransfer < 75000.00) 0.00
        else (moneysTransfer * 0.006) + 25.00
        VISA, MIR -> if (moneysTransfer * 0.0075 < 35.00) 35.00 else moneysTransfer * 0.0075
        else -> 0.00
    }
//    amountMoneysTransferInMonth + moneysTransfer ....тут мы потом будем прибавлять разовые переводы к сумме переводов за месяц
}






