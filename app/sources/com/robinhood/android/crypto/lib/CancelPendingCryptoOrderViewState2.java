package com.robinhood.android.crypto.lib;

import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CancelPendingCryptoOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\"\u001d\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"isCancelSuccessful", "", "Lcom/robinhood/models/api/ApiCryptoCancelAllPendingOrders;", "cancelPendingCryptoOrderTransferErrorEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/crypto/lib/CancelPendingCryptoOrderViewState;", "getCancelPendingCryptoOrderTransferErrorEvent", "(Lcom/robinhood/android/crypto/lib/CancelPendingCryptoOrderViewState;)Lcom/robinhood/udf/UiEvent;", "feature-lib-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.lib.CancelPendingCryptoOrderViewStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CancelPendingCryptoOrderViewState2 {
    private static final boolean isCancelSuccessful(ApiCryptoCancelAllPendingOrders apiCryptoCancelAllPendingOrders) {
        return apiCryptoCancelAllPendingOrders.getTotal_pending_order_count() == apiCryptoCancelAllPendingOrders.getCanceled_pending_order_count();
    }

    public static final UiEvent<StringResource> getCancelPendingCryptoOrderTransferErrorEvent(CancelPendingCryptoOrderViewState cancelPendingCryptoOrderViewState) {
        ApiCryptoCancelAllPendingOrders apiCryptoCancelAllPendingOrdersConsume;
        Intrinsics.checkNotNullParameter(cancelPendingCryptoOrderViewState, "<this>");
        UiEvent<ApiCryptoCancelAllPendingOrders> cancelPendingCryptoOrderResponseEvent = cancelPendingCryptoOrderViewState.getCancelPendingCryptoOrderResponseEvent();
        if (cancelPendingCryptoOrderResponseEvent == null || (apiCryptoCancelAllPendingOrdersConsume = cancelPendingCryptoOrderResponseEvent.consume()) == null || isCancelSuccessful(apiCryptoCancelAllPendingOrdersConsume)) {
            return null;
        }
        return new UiEvent<>(StringResource.INSTANCE.invoke(C12914R.string.cancel_pending_crypto_orders_transfer_error_description, Integer.valueOf(apiCryptoCancelAllPendingOrdersConsume.getCanceled_pending_order_count()), Integer.valueOf(apiCryptoCancelAllPendingOrdersConsume.getTotal_pending_order_count())));
    }
}
