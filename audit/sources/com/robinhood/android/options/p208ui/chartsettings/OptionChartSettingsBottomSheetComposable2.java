package com.robinhood.android.options.p208ui.chartsettings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.options.p208ui.chart.ChartType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChartSettingsBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.chartsettings.ComposableSingletons$OptionChartSettingsBottomSheetComposableKt$lambda$-475243332$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChartSettingsBottomSheetComposable2 implements Function2<Composer, Integer, Unit> {
    public static final OptionChartSettingsBottomSheetComposable2 INSTANCE = new OptionChartSettingsBottomSheetComposable2();

    OptionChartSettingsBottomSheetComposable2() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-475243332, i, -1, "com.robinhood.android.options.ui.chartsettings.ComposableSingletons$OptionChartSettingsBottomSheetComposableKt.lambda$-475243332.<anonymous> (OptionChartSettingsBottomSheetComposable.kt:111)");
        }
        ChartType chartType = ChartType.LINE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.ui.chartsettings.ComposableSingletons$OptionChartSettingsBottomSheetComposableKt$lambda$-475243332$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChartSettingsBottomSheetComposable2.invoke$lambda$1$lambda$0((ChartType) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.ui.chartsettings.ComposableSingletons$OptionChartSettingsBottomSheetComposableKt$lambda$-475243332$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChartSettingsBottomSheetComposable2.invoke$lambda$3$lambda$2(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        OptionChartSettingsBottomSheetComposable3.OptionChartSettingsBottomSheetComposable(chartType, true, function1, (Function1) objRememberedValue2, null, composer, 3510, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ChartType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }
}
