package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SettingsTitle.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$SettingsTitleKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SettingsTitle {
    public static final SettingsTitle INSTANCE = new SettingsTitle();

    /* renamed from: lambda$-1572306379, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8694lambda$1572306379 = ComposableLambda3.composableLambdaInstance(-1572306379, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$SettingsTitleKt$lambda$-1572306379$1
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
                ComposerKt.traceEventStart(-1572306379, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.ComposableSingletons$SettingsTitleKt.lambda$-1572306379.<anonymous> (SettingsTitle.kt:117)");
            }
            SettingsTitle3.SettingsTitle(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1572306379$feature_black_widow_advanced_chart_externalDebug */
    public final Function2<Composer, Integer, Unit> m1770x41d8e21b() {
        return f8694lambda$1572306379;
    }
}
