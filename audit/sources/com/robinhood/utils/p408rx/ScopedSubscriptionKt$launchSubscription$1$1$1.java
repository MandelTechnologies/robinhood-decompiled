package com.robinhood.utils.p408rx;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: ScopedSubscription.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ScopedSubscriptionKt$launchSubscription$1$1$1 implements Function1<Throwable, Unit> {
    final /* synthetic */ Disposable $disposable;

    public ScopedSubscriptionKt$launchSubscription$1$1$1(Disposable disposable) {
        this.$disposable = disposable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$disposable.dispose();
    }
}
