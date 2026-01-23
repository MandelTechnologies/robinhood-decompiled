package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PositionsV2Dao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PositionsV2Store$streamPositionItemsForInstrumentTypes$1$1 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
    PositionsV2Store$streamPositionItemsForInstrumentTypes$1$1(Object obj) {
        super(1, obj, PositionsV2Dao.class, "deleteAll", "deleteAll()V", 4);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return PositionsV2Store.streamPositionItemsForInstrumentTypes$lambda$5$deleteAll((PositionsV2Dao) this.receiver, continuation);
    }
}
