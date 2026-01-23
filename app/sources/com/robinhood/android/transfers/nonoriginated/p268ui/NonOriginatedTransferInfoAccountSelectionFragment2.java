package com.robinhood.android.transfers.nonoriginated.p268ui;

import bff_money_movement.service.p019v1.RobinhoodAccountDto;
import com.robinhood.android.transfers.nonoriginated.p268ui.NonOriginatedTransferInfoAccountSelectionFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedTransferInfoAccountSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.nonoriginated.ui.NonOriginatedTransferInfoAccountSelectionFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class NonOriginatedTransferInfoAccountSelectionFragment2 extends FunctionReferenceImpl implements Function1<RobinhoodAccountDto, Unit> {
    NonOriginatedTransferInfoAccountSelectionFragment2(Object obj) {
        super(1, obj, NonOriginatedTransferInfoAccountSelectionFragment.Callbacks.class, "onAccountRowClick", "onAccountRowClick(Lbff_money_movement/service/v1/RobinhoodAccountDto;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RobinhoodAccountDto robinhoodAccountDto) {
        invoke2(robinhoodAccountDto);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RobinhoodAccountDto p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((NonOriginatedTransferInfoAccountSelectionFragment.Callbacks) this.receiver).onAccountRowClick(p0);
    }
}
