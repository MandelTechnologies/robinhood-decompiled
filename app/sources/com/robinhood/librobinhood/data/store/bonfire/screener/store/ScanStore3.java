package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.equityscreener.models.dao.ScanResultResponseDao;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ScanStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore$scanEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ScanStore3 extends AdaptedFunctionReference implements Function2<ScanResultResponse, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ScanStore3(Object obj) {
        super(2, obj, ScanResultResponseDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScanResultResponse scanResultResponse, Continuation<? super Unit> continuation) {
        return ScanStore.scanEndpoint$insert((ScanResultResponseDao) this.receiver, scanResultResponse, continuation);
    }
}
