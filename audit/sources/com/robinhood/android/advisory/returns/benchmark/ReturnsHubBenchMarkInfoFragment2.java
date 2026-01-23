package com.robinhood.android.advisory.returns.benchmark;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.returns.C9338R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ReturnsHubBenchMarkInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.returns.benchmark.ComposableSingletons$ReturnsHubBenchMarkInfoFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsHubBenchMarkInfoFragment2 {
    public static final ReturnsHubBenchMarkInfoFragment2 INSTANCE = new ReturnsHubBenchMarkInfoFragment2();
    private static Function2<Composer, Integer, Unit> lambda$371958218 = ComposableLambda3.composableLambdaInstance(371958218, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.returns.benchmark.ComposableSingletons$ReturnsHubBenchMarkInfoFragmentKt$lambda$371958218$1
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
                ComposerKt.traceEventStart(371958218, i, -1, "com.robinhood.android.advisory.returns.benchmark.ComposableSingletons$ReturnsHubBenchMarkInfoFragmentKt.lambda$371958218.<anonymous> (ReturnsHubBenchMarkInfoFragment.kt:82)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C9338R.string.returns_hub_benchmark_info_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$371958218$feature_returns_hub_externalDebug() {
        return lambda$371958218;
    }
}
