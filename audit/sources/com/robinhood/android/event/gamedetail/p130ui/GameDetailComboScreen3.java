package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GameDetailComboScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$ComboScreen$4$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailComboScreen3 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    GameDetailComboScreen3(Object obj) {
        super(1, obj, GdpV2ComboUiCallbacks.class, "selectPropsCategory", "selectPropsCategory(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((GdpV2ComboUiCallbacks) this.receiver).selectPropsCategory(i);
    }
}
