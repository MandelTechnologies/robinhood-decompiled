package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiInvestmentScheduleRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class TraderInvestmentScheduleStore$postInvestmentScheduleEndpoint$1 extends FunctionReferenceImpl implements Function2<ApiInvestmentScheduleRequest, Continuation<? super ApiInvestmentSchedule>, Object>, ContinuationImpl6 {
    TraderInvestmentScheduleStore$postInvestmentScheduleEndpoint$1(Object obj) {
        super(2, obj, RecurringApi.class, "postInvestmentSchedule", "postInvestmentSchedule(Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiInvestmentScheduleRequest apiInvestmentScheduleRequest, Continuation<? super ApiInvestmentSchedule> continuation) {
        return ((RecurringApi) this.receiver).postInvestmentSchedule(apiInvestmentScheduleRequest, continuation);
    }
}
