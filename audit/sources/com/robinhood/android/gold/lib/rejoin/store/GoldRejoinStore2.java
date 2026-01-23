package com.robinhood.android.gold.lib.rejoin.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.gold.lib.rejoin.api.ApiGoldRejoinFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: GoldRejoinStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.lib.rejoin.store.GoldRejoinStore$goldRejoinFlowEndpoint$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldRejoinStore2 extends AdaptedFunctionReference implements Function2<ApiGoldRejoinFlow, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    GoldRejoinStore2(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiGoldRejoinFlow apiGoldRejoinFlow, Continuation<? super Unit> continuation) {
        return GoldRejoinStore.goldRejoinFlowEndpoint$accept((BehaviorRelay) this.receiver, apiGoldRejoinFlow, continuation);
    }
}
