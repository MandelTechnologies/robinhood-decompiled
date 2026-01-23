package com.robinhood.android.portfolio.performanceChartSettings;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PerformanceChartSettingsComposable {
    public static final PerformanceChartSettingsComposable INSTANCE = new PerformanceChartSettingsComposable();

    /* renamed from: lambda$-1784836766, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9175lambda$1784836766 = ComposableLambda3.composableLambdaInstance(-1784836766, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsComposableKt$lambda$-1784836766$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1784836766, i, -1, "com.robinhood.android.portfolio.performanceChartSettings.ComposableSingletons$PerformanceChartSettingsComposableKt.lambda$-1784836766.<anonymous> (PerformanceChartSettingsComposable.kt:25)");
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25550R.string.chart_settings_title, composer, 0), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1784836766$feature_portfolio_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m17655getLambda$1784836766$feature_portfolio_externalDebug() {
        return f9175lambda$1784836766;
    }
}
