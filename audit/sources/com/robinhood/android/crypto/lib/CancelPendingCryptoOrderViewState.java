package com.robinhood.android.crypto.lib;

import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;

/* compiled from: CancelPendingCryptoOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/lib/CancelPendingCryptoOrderViewState;", "", "isCancelPendingCryptoOrdersLoading", "", "()Z", "cancelPendingCryptoOrderNetworkErrorEvent", "Lcom/robinhood/udf/UiEvent;", "", "getCancelPendingCryptoOrderNetworkErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "cancelPendingCryptoOrderResponseEvent", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "getCancelPendingCryptoOrderResponseEvent", "feature-lib-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface CancelPendingCryptoOrderViewState {
    UiEvent<Throwable> getCancelPendingCryptoOrderNetworkErrorEvent();

    UiEvent<ApiCryptoCancelAllPendingOrders> getCancelPendingCryptoOrderResponseEvent();

    boolean isCancelPendingCryptoOrdersLoading();
}
