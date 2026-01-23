package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import com.robinhood.models.api.transfer.ApiCryptoTransferSuvWorkflow;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CryptoTransfersStore$recreateWorkflow$1 extends FunctionReferenceImpl implements Function2<ApiCryptoTransferSuvWorkflow.Request, Continuation<? super ApiCryptoTransferSuvWorkflow>, Object>, ContinuationImpl6 {
    CryptoTransfersStore$recreateWorkflow$1(Object obj) {
        super(2, obj, CryptoTransfersApi.class, "recreateSuvWorkflow", "recreateSuvWorkflow(Lcom/robinhood/models/api/transfer/ApiCryptoTransferSuvWorkflow$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiCryptoTransferSuvWorkflow.Request request, Continuation<? super ApiCryptoTransferSuvWorkflow> continuation) {
        return ((CryptoTransfersApi) this.receiver).recreateSuvWorkflow(request, continuation);
    }
}
