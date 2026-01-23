package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.ApiEquityTradingSeenStatusResponse;
import com.robinhood.models.dao.EquityTradingSeenStatusDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: EquityTradingSeenStatusStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore$getEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class EquityTradingSeenStatusStore3 extends AdaptedFunctionReference implements Function2<ApiEquityTradingSeenStatusResponse, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    EquityTradingSeenStatusStore3(Object obj) {
        super(2, obj, EquityTradingSeenStatusDao.class, "insert", "insert(Lcom/robinhood/models/api/bonfire/ApiEquityTradingSeenStatusResponse;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEquityTradingSeenStatusResponse apiEquityTradingSeenStatusResponse, Continuation<? super Unit> continuation) {
        return EquityTradingSeenStatusStore.getEndpoint$insert((EquityTradingSeenStatusDao) this.receiver, apiEquityTradingSeenStatusResponse, continuation);
    }
}
