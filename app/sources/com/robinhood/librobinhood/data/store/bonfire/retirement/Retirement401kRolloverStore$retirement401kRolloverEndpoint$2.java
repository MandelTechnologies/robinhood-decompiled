package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.Retirement401kRolloverDao;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: Retirement401kRolloverStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class Retirement401kRolloverStore$retirement401kRolloverEndpoint$2 extends AdaptedFunctionReference implements Function2<Retirement401kRolloverViewModel, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    Retirement401kRolloverStore$retirement401kRolloverEndpoint$2(Object obj) {
        super(2, obj, Retirement401kRolloverDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Retirement401kRolloverViewModel retirement401kRolloverViewModel, Continuation<? super Unit> continuation) {
        return Retirement401kRolloverStore.retirement401kRolloverEndpoint$insert$1((Retirement401kRolloverDao) this.receiver, retirement401kRolloverViewModel, continuation);
    }
}
