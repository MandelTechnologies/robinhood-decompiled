package com.robinhood.librobinhood.data.store;

import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.dao.InvestmentScheduleDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class TraderInvestmentScheduleStore$fetchInvestmentScheduleEndpoint$2 extends AdaptedFunctionReference implements Function2<ApiInvestmentSchedule, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    TraderInvestmentScheduleStore$fetchInvestmentScheduleEndpoint$2(Object obj) {
        super(2, obj, InvestmentScheduleDao.class, "insert", "insert(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiInvestmentSchedule apiInvestmentSchedule, Continuation<? super Unit> continuation) {
        return TraderInvestmentScheduleStore.fetchInvestmentScheduleEndpoint$insert((InvestmentScheduleDao) this.receiver, apiInvestmentSchedule, continuation);
    }
}
