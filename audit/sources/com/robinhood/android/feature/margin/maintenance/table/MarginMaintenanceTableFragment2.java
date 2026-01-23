package com.robinhood.android.feature.margin.maintenance.table;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.InfoKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginMaintenanceTableFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MarginMaintenanceTableFragment2 {
    public static final MarginMaintenanceTableFragment2 INSTANCE = new MarginMaintenanceTableFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1262657951 = ComposableLambda3.composableLambdaInstance(1262657951, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableFragmentKt$lambda$1262657951$1
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
                ComposerKt.traceEventStart(1262657951, i, -1, "com.robinhood.android.feature.margin.maintenance.table.ComposableSingletons$MarginMaintenanceTableFragmentKt.lambda$1262657951.<anonymous> (MarginMaintenanceTableFragment.kt:247)");
            }
            IconKt.m5872Iconww6aTOc(InfoKt.getInfo(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1262657951$feature_margin_maintenance_table_externalDebug */
    public final Function2<Composer, Integer, Unit> m2019x5ea4f5e6() {
        return lambda$1262657951;
    }
}
