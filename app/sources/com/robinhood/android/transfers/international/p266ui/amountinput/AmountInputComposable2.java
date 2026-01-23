package com.robinhood.android.transfers.international.p266ui.amountinput;

import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputDataState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AmountInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputComposableKt$AmountInputComposable$4$1$1$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AmountInputComposable2 extends FunctionReferenceImpl implements Function1<AmountInputDataState.InputType, Unit> {
    AmountInputComposable2(Object obj) {
        super(1, obj, AmountInputDuxo.class, "setSelectedInput", "setSelectedInput(Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AmountInputDataState.InputType inputType) {
        invoke2(inputType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AmountInputDataState.InputType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AmountInputDuxo) this.receiver).setSelectedInput(p0);
    }
}
