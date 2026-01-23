package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.api.bonfire.ApiGoldValuePropsDowngrade;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: GoldValuePropsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.GoldValuePropsStore$downgradeValuePropsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class GoldValuePropsStore3 extends AdaptedFunctionReference implements Function2<ApiGoldValuePropsDowngrade, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    GoldValuePropsStore3(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiGoldValuePropsDowngrade apiGoldValuePropsDowngrade, Continuation<? super Unit> continuation) {
        return GoldValuePropsStore.downgradeValuePropsEndpoint$accept((BehaviorRelay) this.receiver, apiGoldValuePropsDowngrade, continuation);
    }
}
