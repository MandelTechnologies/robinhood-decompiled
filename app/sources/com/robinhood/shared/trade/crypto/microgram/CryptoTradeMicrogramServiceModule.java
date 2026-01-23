package com.robinhood.shared.trade.crypto.microgram;

import kotlin.Metadata;

/* compiled from: CryptoTradeMicrogramServiceModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule;", "", "<init>", "()V", "provideCryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "provideCryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradeMicrogramServiceModule {
    public static final int $stable = 0;

    public final RealCryptoTradeUserInputsService provideCryptoTradeUserInputsService() {
        return new RealCryptoTradeUserInputsService2();
    }

    public final RealCryptoTradeFeeEstimationService provideCryptoTradeFeeEstimationService() {
        return new RealCryptoTradeFeeEstimationService2();
    }
}
