package ae.network.nicardmanagementsdk.repository.interfaces

import ae.network.nicardmanagementsdk.domain.models.CardIdentifierModel
import ae.network.nicardmanagementsdk.domain.models.PinCertificateModel
import ae.network.nicardmanagementsdk.network.dto.set_pin.CardIdentifierBodyDto
import ae.network.nicardmanagementsdk.network.dto.set_pin.SetPinBodyDto

interface ISetPinRepository {

    suspend fun getCardsLookUp(
        token: String,
        bankCode: String,
        cardIdentifierBody: CardIdentifierBodyDto
    ): CardIdentifierModel

    suspend fun getPinCertificate(
        token: String,
        bankCode: String
    ): PinCertificateModel

    suspend fun setPin(
        token: String,
        bankCode: String,
        setPinBody: SetPinBodyDto
    )

}