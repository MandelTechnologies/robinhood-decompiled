package com.robinhood.android.gold.lib.hub.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.gold.lib.hub.api.ApiGoldHub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: GoldHubStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class GoldHubStore$goldHubEndpoint$1 extends AdaptedFunctionReference implements Function2<ApiGoldHub, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    GoldHubStore$goldHubEndpoint$1(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiGoldHub apiGoldHub, Continuation<? super Unit> continuation) {
        return GoldHubStore.goldHubEndpoint$accept((BehaviorRelay) this.receiver, apiGoldHub, continuation);
    }
}
