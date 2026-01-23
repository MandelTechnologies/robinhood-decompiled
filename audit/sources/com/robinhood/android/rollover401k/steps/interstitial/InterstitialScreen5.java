package com.robinhood.android.rollover401k.steps.interstitial;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InterstitialScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.interstitial.InterstitialScreenKt$InterstitialScreen$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class InterstitialScreen5 extends FunctionReferenceImpl implements Function0<Unit> {
    InterstitialScreen5(Object obj) {
        super(0, obj, InterstitialScreen3.class, "onCloseTapped", "onCloseTapped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((InterstitialScreen3) this.receiver).onCloseTapped();
    }
}
