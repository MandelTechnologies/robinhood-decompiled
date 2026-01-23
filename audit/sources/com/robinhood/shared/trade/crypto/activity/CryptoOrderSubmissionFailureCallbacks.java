package com.robinhood.shared.trade.crypto.activity;

import kotlin.Metadata;

/* compiled from: CryptoOrderSubmissionFailureCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderSubmissionFailureCallbacks;", "", "setFormStateToEditing", "", "convertToRebateOrder", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface CryptoOrderSubmissionFailureCallbacks {

    /* compiled from: CryptoOrderSubmissionFailureCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void convertToRebateOrder(CryptoOrderSubmissionFailureCallbacks cryptoOrderSubmissionFailureCallbacks) {
        }
    }

    void convertToRebateOrder();

    void setFormStateToEditing();
}
