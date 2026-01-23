package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2ComposableKt$InternationalTransferV2Composable$6$1 */
/* loaded from: classes9.dex */
/* synthetic */ class C30797xcdaa4a48 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    C30797xcdaa4a48(Object obj) {
        super(1, obj, InternationalTransferV2Duxo.class, "onNumpadKeyPress", "onNumpadKeyPress(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InternationalTransferV2Duxo) this.receiver).onNumpadKeyPress(p0);
    }
}
