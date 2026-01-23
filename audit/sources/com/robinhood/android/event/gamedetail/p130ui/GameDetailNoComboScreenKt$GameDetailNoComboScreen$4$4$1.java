package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GameDetailNoComboScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$4$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$4$1(Object obj) {
        super(1, obj, GdpV1UiCallbacks.class, "onPropsCategoryClick", "onPropsCategoryClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((GdpV1UiCallbacks) this.receiver).onPropsCategoryClick(i);
    }
}
