package com.robinhood.store.advisory;

import com.robinhood.models.advisory.dao.AdvisorInsightsDao;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AdvisoryInsightsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AdvisoryInsightsStore$singleInsightEndpoint$1 extends AdaptedFunctionReference implements Function2<AdvisoryInsight, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    AdvisoryInsightsStore$singleInsightEndpoint$1(Object obj) {
        super(2, obj, AdvisorInsightsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvisoryInsight advisoryInsight, Continuation<? super Unit> continuation) {
        return AdvisoryInsightsStore.singleInsightEndpoint$insert((AdvisorInsightsDao) this.receiver, advisoryInsight, continuation);
    }
}
