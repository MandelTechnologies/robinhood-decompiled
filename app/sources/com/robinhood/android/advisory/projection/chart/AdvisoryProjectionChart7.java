package com.robinhood.android.advisory.projection.chart;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotIntState2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryProjectionChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$7$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryProjectionChart7 implements Function3<List<? extends Double>, Composer, Integer, Unit> {
    final /* synthetic */ Currency $currency;
    final /* synthetic */ SnapshotIntState2 $maxGridIncrementsRowHeight$delegate;
    final /* synthetic */ BoxScope $this_Box;

    AdvisoryProjectionChart7(Currency currency, BoxScope boxScope, SnapshotIntState2 snapshotIntState2) {
        this.$currency = currency;
        this.$this_Box = boxScope;
        this.$maxGridIncrementsRowHeight$delegate = snapshotIntState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Double> list, Composer composer, Integer num) {
        invoke((List<Double>) list, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(List<Double> increments, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(increments, "increments");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1832732850, i, -1, "com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChart.<anonymous>.<anonymous> (AdvisoryProjectionChart.kt:357)");
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(increments);
        Currency currency = this.$currency;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(this.$this_Box.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierFillMaxSize$default, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
        composer.startReplaceGroup(5004770);
        final SnapshotIntState2 snapshotIntState2 = this.$maxGridIncrementsRowHeight$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$7$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryProjectionChart7.invoke$lambda$1$lambda$0(snapshotIntState2, ((Integer) obj).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ChartComponentsKt.ChartGridLines(persistentList, currency, modifierM5145paddingqDBjuR0, (Function1) objRememberedValue, composer, 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(Math.max(snapshotIntState2.getIntValue(), i));
        return Unit.INSTANCE;
    }
}
