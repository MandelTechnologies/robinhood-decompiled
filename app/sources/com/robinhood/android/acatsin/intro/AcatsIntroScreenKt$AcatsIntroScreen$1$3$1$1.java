package com.robinhood.android.acatsin.intro;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AcatsIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
/* synthetic */ class AcatsIntroScreenKt$AcatsIntroScreen$1$3$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    AcatsIntroScreenKt$AcatsIntroScreen$1$3$1$1(Object obj) {
        super(0, obj, AcatsIntroScreenCallbacks.class, "onBack", "onBack()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AcatsIntroScreenCallbacks) this.receiver).onBack();
    }
}
