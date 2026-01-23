package com.robinhood.android.options.p208ui.chart;

import com.robinhood.android.options.p208ui.bottomsheet.LateCloseBottomSheetDialogFragment;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: OptionHistoricalChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class OptionHistoricalChartKt$OptionHistoricalChart$1$6$1 implements Function0<Unit> {
    final /* synthetic */ Function1<LateCloseBottomSheetDialogFragment.Args, Unit> $onLateCloseInfoClicked;
    final /* synthetic */ OptionsDetailPageBodyState2.Chart $state;

    /* JADX WARN: Multi-variable type inference failed */
    OptionHistoricalChartKt$OptionHistoricalChart$1$6$1(Function1<? super LateCloseBottomSheetDialogFragment.Args, Unit> function1, OptionsDetailPageBodyState2.Chart chart) {
        this.$onLateCloseInfoClicked = function1;
        this.$state = chart;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onLateCloseInfoClicked.invoke(this.$state.getLateCloseBottomSheetArgs());
    }
}
