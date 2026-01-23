package com.robinhood.android.transfers.international.p266ui.methodselection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TransferMethodComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.methodselection.TransferMethodComposableKt$Loaded$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TransferMethodComposable7 extends FunctionReferenceImpl implements Function0<Unit> {
    TransferMethodComposable7(Object obj) {
        super(0, obj, TransferMethodDuxo.class, "onWireSelected", "onWireSelected()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TransferMethodDuxo) this.receiver).onWireSelected();
    }
}
