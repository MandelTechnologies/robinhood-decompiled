package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.models.dao.RecommendationsLearnMoreDao;
import com.robinhood.recommendations.models.p362db.RecommendationsLearnMore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RecommendationsLearnMoreStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsLearnMoreStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RecommendationsLearnMoreStore3 extends AdaptedFunctionReference implements Function2<RecommendationsLearnMore, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RecommendationsLearnMoreStore3(Object obj) {
        super(2, obj, RecommendationsLearnMoreDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecommendationsLearnMore recommendationsLearnMore, Continuation<? super Unit> continuation) {
        return RecommendationsLearnMoreStore.endpoint$insert((RecommendationsLearnMoreDao) this.receiver, recommendationsLearnMore, continuation);
    }
}
