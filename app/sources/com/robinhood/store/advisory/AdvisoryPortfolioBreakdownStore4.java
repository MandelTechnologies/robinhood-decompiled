package com.robinhood.store.advisory;

import com.robinhood.models.advisory.dao.ManagedReturnsBreakdownDao;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AdvisoryPortfolioBreakdownStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore$returnsBreakdownEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class AdvisoryPortfolioBreakdownStore4 extends AdaptedFunctionReference implements Function2<ReturnsBreakdown, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    AdvisoryPortfolioBreakdownStore4(Object obj) {
        super(2, obj, ManagedReturnsBreakdownDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReturnsBreakdown returnsBreakdown, Continuation<? super Unit> continuation) {
        return AdvisoryPortfolioBreakdownStore.returnsBreakdownEndpoint$insert((ManagedReturnsBreakdownDao) this.receiver, returnsBreakdown, continuation);
    }
}
