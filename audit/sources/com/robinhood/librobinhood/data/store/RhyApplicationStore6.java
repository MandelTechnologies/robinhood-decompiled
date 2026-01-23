package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.rhy.ApiSubmitRhyApplicationRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RhyApplicationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.RhyApplicationStore$postEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RhyApplicationStore6 extends FunctionReferenceImpl implements Function2<ApiSubmitRhyApplicationRequest, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RhyApplicationStore6(Object obj) {
        super(2, obj, Identi.class, "submitRhyApplication", "submitRhyApplication(Lcom/robinhood/models/api/identi/rhy/ApiSubmitRhyApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSubmitRhyApplicationRequest apiSubmitRhyApplicationRequest, Continuation<? super Unit> continuation) {
        return ((Identi) this.receiver).submitRhyApplication(apiSubmitRhyApplicationRequest, continuation);
    }
}
