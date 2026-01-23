package com.robinhood.android.rollover401k;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Rollover401kHeaderImageScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.Rollover401kHeaderImageScreenKt$HeaderImageScreen$1$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class Rollover401kHeaderImageScreen4 extends FunctionReferenceImpl implements Function0<Unit> {
    Rollover401kHeaderImageScreen4(Object obj) {
        super(0, obj, Rollover401kHeaderImageScreen2.class, "onBackButtonClick", "onBackButtonClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((Rollover401kHeaderImageScreen2) this.receiver).onBackButtonClick();
    }
}
