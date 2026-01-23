package com.robinhood.android.equitydetail.p123ui.chart;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import com.robinhood.android.charts.span.AdvancedChartSelector;
import com.robinhood.android.charts.span.SpanSelector3;
import com.robinhood.android.charts.span.SpanSelector5;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class InstrumentChartKt$InstrumentChart$1$17 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $chartBarrier;
    final /* synthetic */ InstrumentChartSpans $chartSpans;
    final /* synthetic */ String $displaySpan;
    final /* synthetic */ boolean $hasVisitedBwChart;
    final /* synthetic */ boolean $isInBlackWidowAdvancedChartExperiment;
    final /* synthetic */ Function0<Unit> $onAdvancedButtonClicked;
    final /* synthetic */ Function0<Unit> $onChartSettingsClicked;
    final /* synthetic */ Function1<String, Unit> $onSpanChanged;
    final /* synthetic */ ConstraintLayoutBaseScope4 $spans;
    final /* synthetic */ ConstraintLayoutScope $this_ConstraintLayout;

    /* JADX WARN: Multi-variable type inference failed */
    InstrumentChartKt$InstrumentChart$1$17(ConstraintLayoutScope constraintLayoutScope, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, boolean z, InstrumentChartSpans instrumentChartSpans, String str, Function1<? super String, Unit> function1, Function0<Unit> function0, boolean z2, Function0<Unit> function02) {
        this.$this_ConstraintLayout = constraintLayoutScope;
        this.$spans = constraintLayoutBaseScope4;
        this.$chartBarrier = horizontalAnchor;
        this.$isInBlackWidowAdvancedChartExperiment = z;
        this.$chartSpans = instrumentChartSpans;
        this.$displaySpan = str;
        this.$onSpanChanged = function1;
        this.$onChartSettingsClicked = function0;
        this.$hasVisitedBwChart = z2;
        this.$onAdvancedButtonClicked = function02;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-774781988, i, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChart.<anonymous>.<anonymous> (InstrumentChart.kt:419)");
        }
        ConstraintLayoutScope constraintLayoutScope = this.$this_ConstraintLayout;
        Modifier.Companion companion = Modifier.INSTANCE;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4 = this.$spans;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$chartBarrier);
        final ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = this.$chartBarrier;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<ConstrainScope, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$1$17$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                    invoke2(constrainScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ConstrainScope constrainAs) {
                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                    ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), horizontalAnchor, 0.0f, 0.0f, 6, null);
                    ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
        final boolean z = this.$isInBlackWidowAdvancedChartExperiment;
        InstrumentChartSpans instrumentChartSpans = this.$chartSpans;
        String str = this.$displaySpan;
        Function1<String, Unit> function1 = this.$onSpanChanged;
        final Function0<Unit> function0 = this.$onChartSettingsClicked;
        final boolean z2 = this.$hasVisitedBwChart;
        final Function0<Unit> function02 = this.$onAdvancedButtonClicked;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierConstrainAs);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, companion, 1.0f, false, 2, null);
        composer.startReplaceGroup(-655105157);
        ComposableLambda composableLambdaRememberComposableLambda = z ? ComposableLambda3.rememberComposableLambda(1393314203, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$1$17$2$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                invoke(row5, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Row5 InstrumentChartSpansDynamicSelector, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(InstrumentChartSpansDynamicSelector, "$this$InstrumentChartSpansDynamicSelector");
                if ((i2 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1393314203, i2, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstrumentChart.kt:431)");
                }
                SpanSelector5.BentoIcon bentoIcon = new SpanSelector5.BentoIcon(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16), StringResources_androidKt.stringResource(C15314R.string.chart_options_settings, composer2, 0));
                Function0<Unit> function03 = function0;
                SpanSelector3.ChartSpanTrailingButton(bentoIcon, function03, ModifiersKt.educationTourId$default(Modifier.INSTANCE, EducationTourElementIds.PRICE_CHART_SETTINGS_ELEMENT_ID, function03, null, false, false, 28, null), composer2, SpanSelector5.BentoIcon.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54) : null;
        composer.endReplaceGroup();
        InstrumentChartSpansDynamicSelector.InstrumentChartSpansDynamicSelector(instrumentChartSpans, str, modifierWeight$default, null, null, function1, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-702985721, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartKt$InstrumentChart$1$17$2$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                invoke(row5, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Row5 InstrumentChartSpansDynamicSelector, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(InstrumentChartSpansDynamicSelector, "$this$InstrumentChartSpansDynamicSelector");
                if ((i2 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-702985721, i2, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstrumentChart.kt:450)");
                }
                if (z) {
                    composer2.startReplaceGroup(-386998351);
                    AdvancedChartSelector.AdvancedChartSelector(function02, !z2, null, composer2, 0, 4);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-386712035);
                    SpanSelector5.BentoIcon bentoIcon = new SpanSelector5.BentoIcon(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16), StringResources_androidKt.stringResource(C15314R.string.chart_options_settings, composer2, 0));
                    Function0<Unit> function03 = function0;
                    SpanSelector3.ChartSpanTrailingButton(bentoIcon, function03, ModifiersKt.educationTourId$default(Modifier.INSTANCE, EducationTourElementIds.PRICE_CHART_SETTINGS_ELEMENT_ID, function03, null, false, false, 28, null), composer2, SpanSelector5.BentoIcon.$stable, 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 100663296, 88);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }
}
