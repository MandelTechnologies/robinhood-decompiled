package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.AssetHomeStateDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AssetHomeStateStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.AssetHomeStateStore$stateEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class AssetHomeStateStore2 extends AdaptedFunctionReference implements Function2<AssetHomeState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    AssetHomeStateStore2(Object obj) {
        super(2, obj, AssetHomeStateDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetHomeState assetHomeState, Continuation<? super Unit> continuation) {
        return AssetHomeStateStore.stateEndpoint$insert((AssetHomeStateDao) this.receiver, assetHomeState, continuation);
    }
}
