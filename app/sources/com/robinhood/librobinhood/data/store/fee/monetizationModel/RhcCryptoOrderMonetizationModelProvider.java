package com.robinhood.librobinhood.data.store.fee.monetizationModel;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhcCryptoOrderMonetizationModelProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/RhcCryptoOrderMonetizationModelProvider;", "", "<init>", "()V", "get", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "get$lib_store_crypto_externalDebug", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhcCryptoOrderMonetizationModelProvider {
    public final CryptoOrderMonetizationModel get$lib_store_crypto_externalDebug(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        if (!uiCurrencyPair.isFeeSupported()) {
            throw new IllegalStateException(("EU: Unsupported currency pair for fee monetization model: " + uiCurrencyPair.getId()).toString());
        }
        return CryptoOrderMonetizationModel.Fee.INSTANCE;
    }
}
