package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorAlertContentUiModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateQueuedAchDepositFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositFragment$refreshUi$6$1$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class CreateQueuedAchDepositFragment2 extends FunctionReferenceImpl implements Function1<GoldEarningsCalculatorAlertContentUiModel, Unit> {
    CreateQueuedAchDepositFragment2(Object obj) {
        super(1, obj, CreateQueuedAchDepositFragment.class, "onDisplayDisclosureSheet", "onDisplayDisclosureSheet(Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel) {
        invoke2(goldEarningsCalculatorAlertContentUiModel);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GoldEarningsCalculatorAlertContentUiModel p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CreateQueuedAchDepositFragment) this.receiver).onDisplayDisclosureSheet(p0);
    }
}
