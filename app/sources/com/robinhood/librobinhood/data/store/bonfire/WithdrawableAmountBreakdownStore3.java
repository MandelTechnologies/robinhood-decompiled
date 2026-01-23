package com.robinhood.librobinhood.data.store.bonfire;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdown;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: WithdrawableAmountBreakdownStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.WithdrawableAmountBreakdownStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class WithdrawableAmountBreakdownStore3 extends AdaptedFunctionReference implements Function2<ApiWithdrawableAmountBreakdown, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    WithdrawableAmountBreakdownStore3(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiWithdrawableAmountBreakdown apiWithdrawableAmountBreakdown, Continuation<? super Unit> continuation) {
        return WithdrawableAmountBreakdownStore.endpoint$accept((BehaviorRelay) this.receiver, apiWithdrawableAmountBreakdown, continuation);
    }
}
