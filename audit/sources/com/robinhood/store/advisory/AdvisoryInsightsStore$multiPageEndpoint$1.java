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
/* synthetic */ class AdvisoryInsightsStore$multiPageEndpoint$1 extends AdaptedFunctionReference implements Function2<Iterable<? extends AdvisoryInsight>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    AdvisoryInsightsStore$multiPageEndpoint$1(Object obj) {
        super(2, obj, AdvisorInsightsDao.class, "insert", "insert(Ljava/lang/Iterable;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Iterable<AdvisoryInsight> iterable, Continuation<? super Unit> continuation) {
        return AdvisoryInsightsStore.multiPageEndpoint$insert$0((AdvisorInsightsDao) this.receiver, iterable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Iterable<? extends AdvisoryInsight> iterable, Continuation<? super Unit> continuation) {
        return invoke2((Iterable<AdvisoryInsight>) iterable, continuation);
    }
}
