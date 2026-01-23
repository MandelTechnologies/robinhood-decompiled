package com.robinhood.android.event.detail.contractselector.multicontractselector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EventMultiContractSelectorFullScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenContentKt$EventMultiContractSelectorFullScreenContent$2$2$2$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EventMultiContractSelectorFullScreenContent5 extends FunctionReferenceImpl implements Function0<Unit> {
    EventMultiContractSelectorFullScreenContent5(Object obj) {
        super(0, obj, EventMultiContractSelectorFullScreenContent.class, "onTradeOverlayDialogDismiss", "onTradeOverlayDialogDismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventMultiContractSelectorFullScreenContent) this.receiver).onTradeOverlayDialogDismiss();
    }
}
