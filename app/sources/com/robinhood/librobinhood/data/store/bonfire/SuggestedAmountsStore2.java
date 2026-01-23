package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SuggestedAmountsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class SuggestedAmountsStore2 extends FunctionReferenceImpl implements Function2<String, Continuation<? super ApiSuggestedAmountsResponse>, Object>, ContinuationImpl6 {
    SuggestedAmountsStore2(Object obj) {
        super(2, obj, TransfersBonfireApi.class, "getSuggestedAmounts", "getSuggestedAmounts(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiSuggestedAmountsResponse> continuation) {
        return ((TransfersBonfireApi) this.receiver).getSuggestedAmounts(str, continuation);
    }
}
