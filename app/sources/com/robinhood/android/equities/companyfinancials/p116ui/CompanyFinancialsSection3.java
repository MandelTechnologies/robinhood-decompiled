package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompanyFinancialsSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$3$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class CompanyFinancialsSection3 implements Function1<String, Unit> {
    final /* synthetic */ SnapshotState<String> $lastTimePeriod$delegate;
    final /* synthetic */ Function1<String, Unit> $onTimePeriodSelected;
    final /* synthetic */ SnapshotState<Boolean> $shouldAnimateBars$delegate;
    final /* synthetic */ SnapshotState<Boolean> $shouldAnimateLine$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    CompanyFinancialsSection3(Function1<? super String, Unit> function1, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<Boolean> snapshotState3) {
        this.$onTimePeriodSelected = function1;
        this.$lastTimePeriod$delegate = snapshotState;
        this.$shouldAnimateBars$delegate = snapshotState2;
        this.$shouldAnimateLine$delegate = snapshotState3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String timePeriod) {
        Intrinsics.checkNotNullParameter(timePeriod, "timePeriod");
        if (!Intrinsics.areEqual(CompanyFinancialsSection.CompanyFinancialsSection$lambda$27$lambda$16(this.$lastTimePeriod$delegate), timePeriod)) {
            CompanyFinancialsSection.CompanyFinancialsSection$lambda$4(this.$shouldAnimateBars$delegate, true);
            CompanyFinancialsSection.CompanyFinancialsSection$lambda$7(this.$shouldAnimateLine$delegate, true);
            this.$lastTimePeriod$delegate.setValue(timePeriod);
        }
        this.$onTimePeriodSelected.invoke(timePeriod);
    }
}
