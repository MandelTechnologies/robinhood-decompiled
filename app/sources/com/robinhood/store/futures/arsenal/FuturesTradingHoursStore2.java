package com.robinhood.store.futures.arsenal;

import com.plaid.internal.EnumC7081g;
import com.robinhood.store.futures.arsenal.FuturesTradingHoursStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FuturesTradingHoursStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$Companion", m3645f = "FuturesTradingHoursStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "getNextOpenTradingSession$lib_store_futures_externalDebug")
/* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$Companion$getNextOpenTradingSession$1, reason: use source file name */
/* loaded from: classes12.dex */
final class FuturesTradingHoursStore2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FuturesTradingHoursStore.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesTradingHoursStore2(FuturesTradingHoursStore.Companion companion, Continuation<? super FuturesTradingHoursStore2> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getNextOpenTradingSession$lib_store_futures_externalDebug(null, null, null, this);
    }
}
