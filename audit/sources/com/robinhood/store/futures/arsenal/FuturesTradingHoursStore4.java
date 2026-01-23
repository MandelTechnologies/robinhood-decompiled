package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesTradingHoursDao;
import com.robinhood.arsenal.proto.p281v1.idl.TradingSessionsDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: FuturesTradingHoursStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$tradingHoursEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class FuturesTradingHoursStore4 extends AdaptedFunctionReference implements Function2<TradingSessionsDto, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    FuturesTradingHoursStore4(Object obj) {
        super(2, obj, FuturesTradingHoursDao.class, "insert", "insert(Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TradingSessionsDto tradingSessionsDto, Continuation<? super Unit> continuation) {
        return FuturesTradingHoursStore.tradingHoursEndpoint$insert((FuturesTradingHoursDao) this.receiver, tradingSessionsDto, continuation);
    }
}
