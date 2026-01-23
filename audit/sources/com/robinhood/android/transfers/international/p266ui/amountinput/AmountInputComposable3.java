package com.robinhood.android.transfers.international.p266ui.amountinput;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AmountInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$AmountInputComposable$4$1$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AmountInputComposable3 extends FunctionReferenceImpl implements Function0<Unit> {
    AmountInputComposable3(Object obj) {
        super(0, obj, AmountInputDuxo.class, "exchangeRateInfoClicked", "exchangeRateInfoClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AmountInputDuxo) this.receiver).exchangeRateInfoClicked();
    }
}
