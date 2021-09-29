package io.horizontalsystems.marketkit.models

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal
import java.math.BigInteger

data class MarketInfoResponse(
    override val uid: String,
    override val name: String,
    override val code: String,
    @SerializedName("market_cap_rank")
    override val marketCapRank: Int?,
    @SerializedName("coingecko_id")
    override val coinGeckoId: String,

    val price: String,
    @SerializedName("price_change_24h")
    val priceChange: BigDecimal,
    @SerializedName("market_cap")
    val marketCap: BigInteger,
    @SerializedName("total_volume")
    val totalVolume: BigInteger,
) : CoinResponse
