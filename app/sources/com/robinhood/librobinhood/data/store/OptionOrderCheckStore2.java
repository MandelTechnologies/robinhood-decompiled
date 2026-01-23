package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.ApiOptionOrderCheck;
import com.robinhood.models.api.ApiOptionOrderPostBody;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionOrderCheckStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionOrderCheckStore$getOptionOrderCheck$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionOrderCheckStore2 extends FunctionReferenceImpl implements Function2<ApiOptionOrderPostBody, Continuation<? super ApiOptionOrderCheck>, Object>, ContinuationImpl6 {
    OptionOrderCheckStore2(Object obj) {
        super(2, obj, OptionsBonfireApi.class, "getOptionOrderCheck", "getOptionOrderCheck(Lcom/robinhood/models/api/ApiOptionOrderPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionOrderPostBody apiOptionOrderPostBody, Continuation<? super ApiOptionOrderCheck> continuation) {
        return ((OptionsBonfireApi) this.receiver).getOptionOrderCheck(apiOptionOrderPostBody, continuation);
    }
}
