package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EarlyPayEnrollmentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore$postEnrollment$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class EarlyPayEnrollmentStore3 extends FunctionReferenceImpl implements Function2<ApiEarlyPayEnrollment.Request, Continuation<? super ApiEarlyPayEnrollment>, Object>, ContinuationImpl6 {
    EarlyPayEnrollmentStore3(Object obj) {
        super(2, obj, TransfersBonfireApi.class, "updateEarlyPayEnrollment", "updateEarlyPayEnrollment(Lcom/robinhood/models/api/bonfire/ApiEarlyPayEnrollment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEarlyPayEnrollment.Request request, Continuation<? super ApiEarlyPayEnrollment> continuation) {
        return ((TransfersBonfireApi) this.receiver).updateEarlyPayEnrollment(request, continuation);
    }
}
