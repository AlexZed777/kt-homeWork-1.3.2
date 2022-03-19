@file:Suppress("DEPRECATION")

import junit.framework.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test


class MainKtTest {

    @Test
    fun test_actual_comission_maestro() {
        val MAESTRO = "Maestro"
        val moneysTransfer = 76000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 481.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, MAESTRO)

        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun test_actual_comission_visa() {
        val VISA = "Visa"
        val moneysTransfer = 76000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 570.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, VISA)

        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun test_actual_comission_vkpay() {
        val VKPAY = "VK Pay"
        val moneysTransfer = 76000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 0.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, VKPAY)

        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun test_actual_comission_maestro_limit() {
        val MAESTRO = "Maestro"
        val moneysTransfer = 6000
        val amountMoneysTransferInMonth = 77000
        val expectedComission = 61.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, MAESTRO)

        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun test_actual_comission_visa_limit() {
        val VISA = "Visa"
        val moneysTransfer = 3000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 35.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, VISA)

        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun test_actual_comission_vkpay_limit() {
        val VKPAY = "VK Pay"
        val moneysTransfer = 6000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 0.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, VKPAY)

        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun test_actual_comission_mastercard() {
        val MASTERCARD = "Mastercard"
        val moneysTransfer = 76000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 481.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, MASTERCARD)

        assertEquals(expectedComission, actualComission)

    }
    @Ignore
    @Test
    fun test_actual_comission_mir() {
        val MIR = "Mir"
        val moneysTransfer = 76000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 570.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, MIR)

        assertEquals(expectedComission, actualComission)

    }

    @Test
    fun test_actual_comission_mastercard_limit() {
        val MASTERCARD = "Mastercard"
        val moneysTransfer = 6000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 0.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, MASTERCARD)

        assertEquals(expectedComission, actualComission)

    }
    @Ignore
    @Test
    fun test_actual_comission_mir_limit() {
        val MIR = "Mir"
        val moneysTransfer = 9000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 67.5

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer, MIR)

        assertEquals(expectedComission, actualComission)
    }
    @Test
    fun test_actual_comission() {
//        val VKPAY = "VK Pay"
        val moneysTransfer = 6000
        val amountMoneysTransferInMonth = 7000
        val expectedComission = 0.0

        val actualComission = comission(amountMoneysTransferInMonth, moneysTransfer)

        assertEquals(expectedComission, actualComission)

    }
}