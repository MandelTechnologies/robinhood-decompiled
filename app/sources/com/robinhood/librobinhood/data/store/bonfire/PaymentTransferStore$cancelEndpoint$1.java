package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.transfers.api.ApiPaymentTransferUpdateResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaymentTransferStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PaymentTransferStore$cancelEndpoint$1 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiPaymentTransferUpdateResponse>, Object>, ContinuationImpl6 {
    PaymentTransferStore$cancelEndpoint$1(Object obj) {
        super(2, obj, TransfersBonfireApi.class, "cancelPaymentTransfer", "cancelPaymentTransfer(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiPaymentTransferUpdateResponse> continuation) {
        return ((TransfersBonfireApi) this.receiver).cancelPaymentTransfer(uuid, continuation);
    }
}
