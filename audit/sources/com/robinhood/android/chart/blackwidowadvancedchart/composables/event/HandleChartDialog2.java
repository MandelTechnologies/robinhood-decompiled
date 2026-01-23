package com.robinhood.android.chart.blackwidowadvancedchart.composables.event;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartDialog;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HandleChartDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.ComposableSingletons$HandleChartDialogKt$lambda$-1872335918$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HandleChartDialog2 implements Function2<Composer, Integer, Unit> {
    public static final HandleChartDialog2 INSTANCE = new HandleChartDialog2();

    HandleChartDialog2() {
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
            ComposerKt.traceEventStart(-1872335918, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.event.ComposableSingletons$HandleChartDialogKt.lambda$-1872335918.<anonymous> (HandleChartDialog.kt:82)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        ChartDialog chartDialog = new ChartDialog(companion.invoke("Error"), companion.invoke("Some error message"));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.ComposableSingletons$HandleChartDialogKt$lambda$-1872335918$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HandleChartDialog3.ChartDialogComposable(chartDialog, (Function0) objRememberedValue, composer, ChartDialog.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
