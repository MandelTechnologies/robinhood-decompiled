package com.robinhood.librobinhood.data.store.rhy;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.rosetta.eventlogging.RHYContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RhyAccountLoggingStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore$rhyContextAccountTypeEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RhyAccountLoggingStore4 extends AdaptedFunctionReference implements Function2<RHYContext.AccountType, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RhyAccountLoggingStore4(Object obj) {
        super(2, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RHYContext.AccountType accountType, Continuation<? super Unit> continuation) {
        return RhyAccountLoggingStore.rhyContextAccountTypeEndpoint$accept((BehaviorRelay) this.receiver, accountType, continuation);
    }
}
