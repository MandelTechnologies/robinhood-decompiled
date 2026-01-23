package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GameDetailNoComboScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$5$1(Object obj) {
        super(0, obj, GdpV1UiCallbacks.class, "onPropsViewAllToggle", "onPropsViewAllToggle()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GdpV1UiCallbacks) this.receiver).onPropsViewAllToggle();
    }
}
