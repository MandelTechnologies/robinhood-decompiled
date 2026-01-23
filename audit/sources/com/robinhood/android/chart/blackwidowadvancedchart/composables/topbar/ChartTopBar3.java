package com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks2;
import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.QuoteState;
import com.robinhood.android.chart.blackwidowadvancedchart.TopBarState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ComposableSingletons$ChartTopBarKt$lambda$-62992088$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ChartTopBar3 implements Function2<Composer, Integer, Unit> {
    public static final ChartTopBar3 INSTANCE = new ChartTopBar3();

    ChartTopBar3() {
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
            ComposerKt.traceEventStart(-62992088, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ComposableSingletons$ChartTopBarKt.lambda$-62992088.<anonymous> (ChartTopBar.kt:144)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        TopBarState topBarState = new TopBarState(new QuoteState(companion.invoke("$122.00"), companion.invoke("(1.43%)")), LowerTopBarState.DisplayStatus.Indicators.INSTANCE);
        BlackWidowAdvanceChartCallbacks previewChartCallbacks = BlackWidowAdvanceChartCallbacks2.getPreviewChartCallbacks();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ComposableSingletons$ChartTopBarKt$lambda$-62992088$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ComposableSingletons$ChartTopBarKt$lambda$-62992088$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ChartTopBar.ChartTopBar(topBarState, null, true, false, previewChartCallbacks, function0, (Function0) objRememberedValue2, null, composer, 1772976, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
