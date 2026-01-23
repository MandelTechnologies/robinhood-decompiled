package com.robinhood.android.lib.store.margin;

import com.robinhood.models.api.BrokebackMarginApi;
import com.robinhood.models.api.MarginRecommendedActions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarginCallRecommendedActionsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.store.margin.MarginCallRecommendedActionsStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginCallRecommendedActionsStore2 extends FunctionReferenceImpl implements Function2<String, Continuation<? super MarginRecommendedActions>, Object>, ContinuationImpl6 {
    MarginCallRecommendedActionsStore2(Object obj) {
        super(2, obj, BrokebackMarginApi.class, "getMarginRecommendedActions", "getMarginRecommendedActions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super MarginRecommendedActions> continuation) {
        return ((BrokebackMarginApi) this.receiver).getMarginRecommendedActions(str, continuation);
    }
}
