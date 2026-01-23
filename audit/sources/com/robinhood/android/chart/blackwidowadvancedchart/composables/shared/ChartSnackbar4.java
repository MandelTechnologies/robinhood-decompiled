package com.robinhood.android.chart.blackwidowadvancedchart.composables.shared;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSnackbarVisuals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartSnackbar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ComposableSingletons$ChartSnackbarKt$lambda$-1556394098$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ChartSnackbar4 implements Function2<Composer, Integer, Unit> {
    public static final ChartSnackbar4 INSTANCE = new ChartSnackbar4();

    ChartSnackbar4() {
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
            ComposerKt.traceEventStart(-1556394098, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ComposableSingletons$ChartSnackbarKt.lambda$-1556394098.<anonymous> (ChartSnackbar.kt:81)");
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ALERT_12;
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("Day trades");
        StringResource stringResourceInvoke2 = companion.invoke("Learn More");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.shared.ComposableSingletons$ChartSnackbarKt$lambda$-1556394098$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ChartSnackbar2.ChartSnackbar(new ChartSnackbarVisuals(serverToBentoAssetMapper2, stringResourceInvoke, stringResourceInvoke2, (Function0) objRememberedValue, SnackbarDuration.Short), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
