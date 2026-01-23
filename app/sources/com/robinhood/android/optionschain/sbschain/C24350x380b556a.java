package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.optionschain.sbschain.table.SpreadSelectionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$1$1$9$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24350x380b556a extends FunctionReferenceImpl implements Function1<SpreadSelectionState, Unit> {
    C24350x380b556a(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "logSpreadTooltipAppear", "logSpreadTooltipAppear(Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SpreadSelectionState spreadSelectionState) {
        invoke2(spreadSelectionState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SpreadSelectionState p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainDuxo) this.receiver).logSpreadTooltipAppear(p0);
    }
}
