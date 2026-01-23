package com.robinhood.android.transfers.p271ui.updaterecurring;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateRecurringDepositFrequencyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.updaterecurring.UpdateRecurringDepositFrequencyFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class UpdateRecurringDepositFrequencyFragment2 extends FunctionReferenceImpl implements Function1<ApiCreateTransferRequest2, Unit> {
    UpdateRecurringDepositFrequencyFragment2(Object obj) {
        super(1, obj, UpdateRecurringDepositFrequencyFragment.class, "onContinueClicked", "onContinueClicked(Lcom/robinhood/models/api/bonfire/TransferFrequency;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ApiCreateTransferRequest2 apiCreateTransferRequest2) {
        invoke2(apiCreateTransferRequest2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ApiCreateTransferRequest2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((UpdateRecurringDepositFrequencyFragment) this.receiver).onContinueClicked(p0);
    }
}
