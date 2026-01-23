package com.robinhood.android.equities.taxlots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SelectLotsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class SelectLotsComposableKt$SelectLotsComposable$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    SelectLotsComposableKt$SelectLotsComposable$1$1(Object obj) {
        super(1, obj, SelectLotsDuxo.class, "setKeyboardVisible", "setKeyboardVisible(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((SelectLotsDuxo) this.receiver).setKeyboardVisible(z);
    }
}
