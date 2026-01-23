package com.robinhood.android.transfers.recurring.p270ui.experiment.details;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DetailsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.details.DetailsComposableKt$DetailsComposable$1$6$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DetailsComposable5 extends FunctionReferenceImpl implements Function0<Unit> {
    DetailsComposable5(Object obj) {
        super(0, obj, DetailsDuxo.class, "dismissPauseDialog", "dismissPauseDialog()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DetailsDuxo) this.receiver).dismissPauseDialog();
    }
}
