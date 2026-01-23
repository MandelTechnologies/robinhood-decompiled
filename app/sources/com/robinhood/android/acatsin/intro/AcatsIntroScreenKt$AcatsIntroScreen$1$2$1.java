package com.robinhood.android.acatsin.intro;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AcatsIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
/* synthetic */ class AcatsIntroScreenKt$AcatsIntroScreen$1$2$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    AcatsIntroScreenKt$AcatsIntroScreen$1$2$1(Object obj) {
        super(1, obj, AcatsIntroScreenCallbacks.class, "onPageChange", "onPageChange(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((AcatsIntroScreenCallbacks) this.receiver).onPageChange(i);
    }
}
