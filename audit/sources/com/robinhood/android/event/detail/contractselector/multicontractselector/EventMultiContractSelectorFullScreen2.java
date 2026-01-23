package com.robinhood.android.event.detail.contractselector.multicontractselector;

import com.robinhood.android.event.detail.contractselector.ContractSelectorButtonViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventMultiContractSelectorFullScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt$EventMultiContractSelectorFullScreen$1$2$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventMultiContractSelectorFullScreen2 extends FunctionReferenceImpl implements Function2<ContractSelectorButtonViewState, Integer, Unit> {
    EventMultiContractSelectorFullScreen2(Object obj) {
        super(2, obj, EventMultiContractSelectorDuxo.class, "onTradeClicked", "onTradeClicked(Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ContractSelectorButtonViewState contractSelectorButtonViewState, Integer num) {
        invoke(contractSelectorButtonViewState, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ContractSelectorButtonViewState p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventMultiContractSelectorDuxo) this.receiver).onTradeClicked(p0, i);
    }
}
