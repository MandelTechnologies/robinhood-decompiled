package com.robinhood.android.markethours.data.store;

import com.robinhood.models.api.ApiOrderSessionResponse;
import com.robinhood.models.dao.EquityOrderSessionDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: MarketHoursStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markethours.data.store.MarketHoursStore$getShortSellOrderSessionEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarketHoursStore6 extends AdaptedFunctionReference implements Function2<ApiOrderSessionResponse, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    MarketHoursStore6(Object obj) {
        super(2, obj, EquityOrderSessionDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiOrderSessionResponse;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOrderSessionResponse apiOrderSessionResponse, Continuation<? super Unit> continuation) {
        return MarketHoursStore.getShortSellOrderSessionEndpoint$insert((EquityOrderSessionDao) this.receiver, apiOrderSessionResponse, continuation);
    }
}
