package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaymentTransferStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PaymentTransferStore$abortEndpoint$1 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    PaymentTransferStore$abortEndpoint$1(Object obj) {
        super(2, obj, TransfersBonfireApi.class, "abortPaymentTransfer", "abortPaymentTransfer(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
        return ((TransfersBonfireApi) this.receiver).abortPaymentTransfer(uuid, continuation);
    }
}
