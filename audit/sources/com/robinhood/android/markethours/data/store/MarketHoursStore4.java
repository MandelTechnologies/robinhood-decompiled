package com.robinhood.android.markethours.data.store;

import com.robinhood.models.api.ApiMarketHours;
import com.robinhood.models.dao.MarketHoursDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: MarketHoursStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markethours.data.store.MarketHoursStore$getMarketHoursEndpoint$2, reason: use source file name */
/* loaded from: classes17.dex */
/* synthetic */ class MarketHoursStore4 extends AdaptedFunctionReference implements Function2<ApiMarketHours, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    MarketHoursStore4(Object obj) {
        super(2, obj, MarketHoursDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiMarketHours;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMarketHours apiMarketHours, Continuation<? super Unit> continuation) {
        return MarketHoursStore.getMarketHoursEndpoint$insert$0((MarketHoursDao) this.receiver, apiMarketHours, continuation);
    }
}
