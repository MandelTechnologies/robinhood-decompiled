package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2Fragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferV2Fragment$ComposeContent$7$1 extends FunctionReferenceImpl implements Function1<QuickSelectorChip, Unit> {
    CreateTransferV2Fragment$ComposeContent$7$1(Object obj) {
        super(1, obj, CreateTransferV2Duxo.class, "onQuickSelectorChipClick", "onQuickSelectorChipClick(Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(QuickSelectorChip quickSelectorChip) {
        invoke2(quickSelectorChip);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(QuickSelectorChip p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CreateTransferV2Duxo) this.receiver).onQuickSelectorChipClick(p0);
    }
}
