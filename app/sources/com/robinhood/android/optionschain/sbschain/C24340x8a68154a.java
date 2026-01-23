package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$2$4$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24340x8a68154a extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    C24340x8a68154a(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "dismissSimulatedReturnSwitchChartTooltip", "dismissSimulatedReturnSwitchChartTooltip(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((OptionSideBySideChainDuxo) this.receiver).dismissSimulatedReturnSwitchChartTooltip(z);
    }
}
