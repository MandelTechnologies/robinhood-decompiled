package com.robinhood.shared.posttransfer;

import com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TransferMarginCallCoveredFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferMarginCallCoveredFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferMarginCallCoveredFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    TransferMarginCallCoveredFragment2(Object obj) {
        super(0, obj, TransferMarginCallCoveredFragment.Callbacks.class, "onDoneClick", "onDoneClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TransferMarginCallCoveredFragment.Callbacks) this.receiver).onDoneClick();
    }
}
