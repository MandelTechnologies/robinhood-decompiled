package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.recommendations.models.api.ApiSignRecommendationsDisclosuresPostBody;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RecommendationsDisclosuresStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsDisclosuresStore$signDisclosuresEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RecommendationsDisclosuresStore4 extends FunctionReferenceImpl implements Function2<ApiSignRecommendationsDisclosuresPostBody, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RecommendationsDisclosuresStore4(Object obj) {
        super(2, obj, RecommendationsApi.class, "signRecommendationsDisclosures", "signRecommendationsDisclosures(Lcom/robinhood/recommendations/models/api/ApiSignRecommendationsDisclosuresPostBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSignRecommendationsDisclosuresPostBody apiSignRecommendationsDisclosuresPostBody, Continuation<? super Unit> continuation) {
        return ((RecommendationsApi) this.receiver).signRecommendationsDisclosures(apiSignRecommendationsDisclosuresPostBody, continuation);
    }
}
