package com.robinhood.store.futures;

import com.robinhood.store.futures.FuturesOrderStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FuturesOrderStore$getOrdersOverview$2$3 extends AdaptedFunctionReference implements Function3<Integer, Boolean, Continuation<? super FuturesOrderStore.GetOrdersOverviewResult>, Object>, ContinuationImpl6 {
    public static final FuturesOrderStore$getOrdersOverview$2$3 INSTANCE = new FuturesOrderStore$getOrdersOverview$2$3();

    FuturesOrderStore$getOrdersOverview$2$3() {
        super(3, FuturesOrderStore.GetOrdersOverviewResult.class, "<init>", "<init>(IZ)V", 4);
    }

    public final Object invoke(int i, boolean z, Continuation<? super FuturesOrderStore.GetOrdersOverviewResult> continuation) {
        return FuturesOrderStore.getOrdersOverview$lambda$13$lambda$12(i, z, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Boolean bool, Continuation<? super FuturesOrderStore.GetOrdersOverviewResult> continuation) {
        return invoke(num.intValue(), bool.booleanValue(), continuation);
    }
}
