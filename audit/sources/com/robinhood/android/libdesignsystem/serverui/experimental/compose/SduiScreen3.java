package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SduiScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiScreenKt$GenericActionSduiScreenRoot$1$sheetListener$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class SduiScreen3 extends FunctionReferenceImpl implements Function0<Unit> {
    SduiScreen3(Object obj) {
        super(0, obj, SduiScreen5.class, "onBottomSheetDismissed", "onBottomSheetDismissed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SduiScreen5) this.receiver).onBottomSheetDismissed();
    }
}
