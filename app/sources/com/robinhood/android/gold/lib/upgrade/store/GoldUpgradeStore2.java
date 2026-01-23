package com.robinhood.android.gold.lib.upgrade.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldSweepAgreementsFlow;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: GoldUpgradeStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore$goldSweepAgreementsEndpoint$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldUpgradeStore2 extends AdaptedFunctionReference implements Function2<Result<? extends ApiGoldSweepAgreementsFlow>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    GoldUpgradeStore2(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Result<? extends ApiGoldSweepAgreementsFlow> result, Continuation<? super Unit> continuation) {
        return invoke(result.getValue(), continuation);
    }

    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return GoldUpgradeStore.goldSweepAgreementsEndpoint$accept$0((BehaviorRelay) this.receiver, obj, continuation);
    }
}
