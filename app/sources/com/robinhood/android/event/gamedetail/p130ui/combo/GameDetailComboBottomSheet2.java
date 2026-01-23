package com.robinhood.android.event.gamedetail.p130ui.combo;

import com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GameDetailComboBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$GameDetailComboBottomSheet$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailComboBottomSheet2 extends FunctionReferenceImpl implements Function0<Unit> {
    GameDetailComboBottomSheet2(Object obj) {
        super(0, obj, GameDetailComboCallbacks.class, "clearSelections", "clearSelections()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GameDetailComboCallbacks) this.receiver).clearSelections();
    }
}
