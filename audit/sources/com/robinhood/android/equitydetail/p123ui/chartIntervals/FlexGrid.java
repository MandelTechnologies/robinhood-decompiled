package com.robinhood.android.equitydetail.p123ui.chartIntervals;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: FlexGrid.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.ComposableSingletons$FlexGridKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FlexGrid {
    public static final FlexGrid INSTANCE = new FlexGrid();
    private static Function3<Integer, Composer, Integer, Unit> lambda$1608626051 = ComposableLambda3.composableLambdaInstance(1608626051, false, new Function3<Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.ComposableSingletons$FlexGridKt$lambda$1608626051$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
            invoke(num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, Composer composer, int i2) {
            int i3;
            Composer composer2;
            int i4;
            if ((i2 & 6) == 0) {
                i3 = i;
                composer2 = composer;
                i4 = i2 | (composer2.changed(i3) ? 4 : 2);
            } else {
                i3 = i;
                composer2 = composer;
                i4 = i2;
            }
            if ((i4 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1608626051, i4, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.ComposableSingletons$FlexGridKt.lambda$1608626051.<anonymous> (FlexGrid.kt:67)");
            }
            TextKt.m5665Text4IGK_g(String.valueOf(i3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<Integer, Composer, Integer, Unit> lambda$1079707012 = ComposableLambda3.composableLambdaInstance(1079707012, false, new Function3<Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.ComposableSingletons$FlexGridKt$lambda$1079707012$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
            invoke(num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, Composer composer, int i2) {
            int i3;
            Composer composer2;
            int i4;
            if ((i2 & 6) == 0) {
                i3 = i;
                composer2 = composer;
                i4 = i2 | (composer2.changed(i3) ? 4 : 2);
            } else {
                i3 = i;
                composer2 = composer;
                i4 = i2;
            }
            if ((i4 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1079707012, i4, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.ComposableSingletons$FlexGridKt.lambda$1079707012.<anonymous> (FlexGrid.kt:80)");
            }
            TextKt.m5665Text4IGK_g(String.valueOf(i3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<Integer, Composer, Integer, Unit> getLambda$1079707012$feature_equity_detail_externalDebug() {
        return lambda$1079707012;
    }

    public final Function3<Integer, Composer, Integer, Unit> getLambda$1608626051$feature_equity_detail_externalDebug() {
        return lambda$1608626051;
    }
}
