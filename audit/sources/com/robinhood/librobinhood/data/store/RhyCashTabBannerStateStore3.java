package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.bonfire.RhyCashTabBannerStateDao;
import com.robinhood.models.p320db.bonfire.RhyCashTabBannerState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RhyCashTabBannerStateStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.RhyCashTabBannerStateStore$get$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RhyCashTabBannerStateStore3 extends AdaptedFunctionReference implements Function2<RhyCashTabBannerState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RhyCashTabBannerStateStore3(Object obj) {
        super(2, obj, RhyCashTabBannerStateDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyCashTabBannerState rhyCashTabBannerState, Continuation<? super Unit> continuation) {
        return RhyCashTabBannerStateStore.get$insert((RhyCashTabBannerStateDao) this.receiver, rhyCashTabBannerState, continuation);
    }
}
