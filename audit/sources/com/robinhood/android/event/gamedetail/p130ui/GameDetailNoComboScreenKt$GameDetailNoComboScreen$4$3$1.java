package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV1UiCallbacks;
import com.robinhood.android.event.gamedetail.components.ContractOptionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailNoComboScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$3$1 extends FunctionReferenceImpl implements Function1<ContractOptionData, Unit> {
    GameDetailNoComboScreenKt$GameDetailNoComboScreen$4$3$1(Object obj) {
        super(1, obj, GdpV1UiCallbacks.class, "onContractUnselected", "onContractUnselected(Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContractOptionData contractOptionData) {
        invoke2(contractOptionData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContractOptionData p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GdpV1UiCallbacks) this.receiver).onContractUnselected(p0);
    }
}
