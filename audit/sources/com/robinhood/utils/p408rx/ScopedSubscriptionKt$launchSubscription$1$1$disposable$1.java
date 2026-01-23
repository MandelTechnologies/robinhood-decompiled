package com.robinhood.utils.p408rx;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuation;

/* compiled from: ScopedSubscription.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ScopedSubscriptionKt$launchSubscription$1$1$disposable$1 implements Function0<Unit> {
    final /* synthetic */ CancellableContinuation<Unit> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopedSubscriptionKt$launchSubscription$1$1$disposable$1(CancellableContinuation<? super Unit> cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CancellableContinuation.DefaultImpls.cancel$default(this.$continuation, null, 1, null);
    }
}
