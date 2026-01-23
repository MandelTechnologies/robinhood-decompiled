package com.robinhood.android.options.simulatedreturn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsSimulatedReturnFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.simulatedreturn.OptionsSimulatedReturnFragment$ComposeContent$6$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionsSimulatedReturnFragment6 extends FunctionReferenceImpl implements Function1<Double, Unit> {
    OptionsSimulatedReturnFragment6(Object obj) {
        super(1, obj, OptionsSimulatedReturnDuxo.class, "onEstimatedContractPriceUpdated", "onEstimatedContractPriceUpdated(Ljava/lang/Double;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Double d) {
        invoke2(d);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Double d) {
        ((OptionsSimulatedReturnDuxo) this.receiver).onEstimatedContractPriceUpdated(d);
    }
}
