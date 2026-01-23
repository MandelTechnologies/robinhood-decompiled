package com.robinhood.android.futures.detail.p140ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$9$1(Object obj) {
        super(0, obj, FuturesDetailScreenCallbacks.class, "onContractSelectorDismissed", "onContractSelectorDismissed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesDetailScreenCallbacks) this.receiver).onContractSelectorDismissed();
    }
}
