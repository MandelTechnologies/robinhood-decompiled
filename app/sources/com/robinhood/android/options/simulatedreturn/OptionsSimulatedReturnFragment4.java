package com.robinhood.android.options.simulatedreturn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsSimulatedReturnFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment$ComposeContent$4$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionsSimulatedReturnFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    OptionsSimulatedReturnFragment4(Object obj) {
        super(0, obj, OptionsSimulatedReturnDuxo.class, "onChartTypeIconClicked", "onChartTypeIconClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionsSimulatedReturnDuxo) this.receiver).onChartTypeIconClicked();
    }
}
