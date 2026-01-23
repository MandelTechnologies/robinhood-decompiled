package com.robinhood.android.retirement.p239ui.funded;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardChartFooter.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.funded.ComposableSingletons$RetirementDashboardChartFooterKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementDashboardChartFooter3 {
    public static final RetirementDashboardChartFooter3 INSTANCE = new RetirementDashboardChartFooter3();

    /* renamed from: lambda$-713875832, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9225lambda$713875832 = ComposableLambda3.composableLambdaInstance(-713875832, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.ComposableSingletons$RetirementDashboardChartFooterKt$lambda$-713875832$1
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
                ComposerKt.traceEventStart(-713875832, i, -1, "com.robinhood.android.retirement.ui.funded.ComposableSingletons$RetirementDashboardChartFooterKt.lambda$-713875832.<anonymous> (RetirementDashboardChartFooter.kt:50)");
            }
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, "Buying power", null, null, new BentoBaseRowState.Meta.SingleLine("$X,XXX.XX"), null, false, false, false, 0L, null, composer, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 384, 0, 4059);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$219444843 = ComposableLambda3.composableLambdaInstance(219444843, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.ComposableSingletons$RetirementDashboardChartFooterKt$lambda$219444843$1
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
                ComposerKt.traceEventStart(219444843, i, -1, "com.robinhood.android.retirement.ui.funded.ComposableSingletons$RetirementDashboardChartFooterKt.lambda$219444843.<anonymous> (RetirementDashboardChartFooter.kt:75)");
            }
            RetirementDashboardChartFooter6.DashboardChartFooterPlaceholder(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-713875832$feature_retirement_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18212getLambda$713875832$feature_retirement_tab_externalDebug() {
        return f9225lambda$713875832;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$219444843$feature_retirement_tab_externalDebug() {
        return lambda$219444843;
    }
}
