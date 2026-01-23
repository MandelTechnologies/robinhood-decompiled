package com.robinhood.android.options.simulatedreturn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsSimulatedReturnFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment$ComposeContent$3$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionsSimulatedReturnFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    OptionsSimulatedReturnFragment3(Object obj) {
        super(0, obj, OptionsSimulatedReturnDuxo.class, "onInfoIconTooltipClicked", "onInfoIconTooltipClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionsSimulatedReturnDuxo) this.receiver).onInfoIconTooltipClicked();
    }
}
