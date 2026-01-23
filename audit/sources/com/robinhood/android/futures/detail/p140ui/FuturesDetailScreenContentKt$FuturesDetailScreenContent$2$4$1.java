package com.robinhood.android.futures.detail.p140ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$4$1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$4$1(Object obj) {
        super(1, obj, FuturesDetailScreenCallbacks.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesDetailScreenCallbacks) this.receiver).onError(p0);
    }
}
