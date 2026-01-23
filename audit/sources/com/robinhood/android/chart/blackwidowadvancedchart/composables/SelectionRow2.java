package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SelectionRow2 {
    public static final SelectionRow2 INSTANCE = new SelectionRow2();

    /* renamed from: lambda$-1197161580, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8683lambda$1197161580 = ComposableLambda3.composableLambdaInstance(-1197161580, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionRowKt$lambda$-1197161580$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 SelectionRow, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1197161580, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ComposableSingletons$SelectionRowKt.lambda$-1197161580.<anonymous> (SelectionRow.kt:83)");
            }
            BentoText2.m20747BentoText38GnDrw("Test", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$437296409 = ComposableLambda3.composableLambdaInstance(437296409, false, SelectionRow4.INSTANCE);

    /* renamed from: getLambda$-1197161580$lib_black_widow_advanced_chart_externalDebug */
    public final Function3<Row5, Composer, Integer, Unit> m1750x7cf1a3e8() {
        return f8683lambda$1197161580;
    }

    public final Function2<Composer, Integer, Unit> getLambda$437296409$lib_black_widow_advanced_chart_externalDebug() {
        return lambda$437296409;
    }
}
