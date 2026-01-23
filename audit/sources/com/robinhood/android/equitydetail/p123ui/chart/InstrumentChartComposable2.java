package com.robinhood.android.equitydetail.p123ui.chart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ChartSettingsBottomSheetComposable;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ChartSettingsBottomSheetComposable2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: InstrumentChartComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$1$6, reason: use source file name */
/* loaded from: classes3.dex */
final class InstrumentChartComposable2 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ InstrumentChartDuxo $duxo;
    final /* synthetic */ Function2<String, Function0<Unit>, Unit> $onLaunchEducationTour;
    final /* synthetic */ InstrumentChartViewState $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    InstrumentChartComposable2(InstrumentChartViewState instrumentChartViewState, InstrumentChartDuxo instrumentChartDuxo, Function2<? super String, ? super Function0<Unit>, Unit> function2) {
        this.$this_with = instrumentChartViewState;
        this.$duxo = instrumentChartDuxo;
        this.$onLaunchEducationTour = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(196208842, i, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstrumentChartComposable.kt:148)");
        }
        ChartSettingsBottomSheetComposable2 selectedChartType = this.$this_with.getSelectedChartType();
        boolean showExtendedHours = this.$this_with.getShowExtendedHours();
        InstrumentChartDuxo instrumentChartDuxo = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(instrumentChartDuxo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InstrumentChartComposable3(instrumentChartDuxo);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Function1 function1 = (Function1) ((KFunction) objRememberedValue);
        InstrumentChartDuxo instrumentChartDuxo2 = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(instrumentChartDuxo2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new InstrumentChartComposable4(instrumentChartDuxo2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Function1 function12 = (Function1) ((KFunction) objRememberedValue2);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance3 = ((i & 14) == 4 || ((i & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) | composer.changedInstance(this.$this_with) | composer.changedInstance(this.$duxo) | composer.changed(this.$onLaunchEducationTour);
        final InstrumentChartViewState instrumentChartViewState = this.$this_with;
        final InstrumentChartDuxo instrumentChartDuxo3 = this.$duxo;
        final Function2<String, Function0<Unit>, Unit> function2 = this.$onLaunchEducationTour;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$1$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentChartComposable2.invoke$lambda$5$lambda$4(instrumentChartViewState, instrumentChartDuxo3, function2, RhModalBottomSheet, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ChartSettingsBottomSheetComposable.ChartSettingsBottomSheetComposable(selectedChartType, showExtendedHours, function1, function12, (Function1) objRememberedValue3, null, composer, 0, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(InstrumentChartViewState instrumentChartViewState, final InstrumentChartDuxo instrumentChartDuxo, Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5, String tourName) {
        Intrinsics.checkNotNullParameter(tourName, "tourName");
        final ChartSettingsBottomSheetComposable2 selectedChartType = instrumentChartViewState.getSelectedChartType();
        if (Intrinsics.areEqual(tourName, EducationTourScreenNames.STOCK_CHART_SETTINGS_CANDLESTICK_PAGE_SCREEN)) {
            instrumentChartDuxo.onChartTypeSelected(ChartSettingsBottomSheetComposable2.CANDLESTICK);
            function2.invoke(tourName, new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$1$6$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InstrumentChartComposable2.invoke$lambda$5$lambda$4$lambda$2(instrumentChartDuxo, selectedChartType);
                }
            });
        } else if (Intrinsics.areEqual(tourName, EducationTourScreenNames.STOCK_CHART_SETTINGS_PAGE_SCREEN)) {
            instrumentChartDuxo.onChartTypeSelected(ChartSettingsBottomSheetComposable2.LINE);
            function2.invoke(tourName, new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$1$6$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InstrumentChartComposable2.invoke$lambda$5$lambda$4$lambda$3(instrumentChartDuxo, selectedChartType);
                }
            });
        }
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$2(InstrumentChartDuxo instrumentChartDuxo, ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2) {
        instrumentChartDuxo.onChartTypeSelected(chartSettingsBottomSheetComposable2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(InstrumentChartDuxo instrumentChartDuxo, ChartSettingsBottomSheetComposable2 chartSettingsBottomSheetComposable2) {
        instrumentChartDuxo.onChartTypeSelected(chartSettingsBottomSheetComposable2);
        return Unit.INSTANCE;
    }
}
