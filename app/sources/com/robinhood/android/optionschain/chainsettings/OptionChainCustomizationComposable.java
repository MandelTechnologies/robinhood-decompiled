package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposable;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainCustomizationComposable.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a5\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0002\u0010\u001f\u001aG\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0002\u0010&\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006'"}, m3636d2 = {"NormalMetricCardBorder", "Landroidx/compose/ui/unit/Dp;", "F", "SelectedMetricCardBorder", "OptionChainCustomization", "", "viewState", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationViewState;", "onHighlightedMetricChanged", "Lkotlin/Function1;", "Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;", "onHighlightedCategoryChanged", "", "onSelectedMetricChanged", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "(Lcom/robinhood/android/optionschain/chainsettings/OptionChainCustomizationViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MetricSelectionSection", "highlightedMetric", "selectedMetricLabelOne", "", "selectedMetricLabelTwo", "(Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "getBorderStroke", "Landroidx/compose/foundation/BorderStroke;", "isSelected", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "MetricCategorySection", "availableMetrics", "Lcom/robinhood/models/db/OptionChainAvailableMetrics;", "highlightedCategoryIndex", "(Lcom/robinhood/models/db/OptionChainAvailableMetrics;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MetricTypeSelectionSection", "metricsInHighlightedCategory", "Lkotlinx/collections/immutable/ImmutableList;", "selectedMetricOneType", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$MetricType;", "selectedMetricTwoType", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/optionschain/chainsettings/HighlightedMetric;Lcom/robinhood/models/db/OptionChainAvailableMetrics$MetricType;Lcom/robinhood/models/db/OptionChainAvailableMetrics$MetricType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainCustomizationComposable {
    private static final float NormalMetricCardBorder = C2002Dp.m7995constructorimpl(1);
    private static final float SelectedMetricCardBorder = C2002Dp.m7995constructorimpl(2);

    /* compiled from: OptionChainCustomizationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainCustomizationDataState2.values().length];
            try {
                iArr[OptionChainCustomizationDataState2.METRIC_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainCustomizationDataState2.METRIC_TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricCategorySection$lambda$13(OptionChainAvailableMetrics optionChainAvailableMetrics, Integer num, Function1 function1, int i, Composer composer, int i2) {
        MetricCategorySection(optionChainAvailableMetrics, num, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricCategorySection$lambda$8(OptionChainAvailableMetrics optionChainAvailableMetrics, Integer num, Function1 function1, int i, Composer composer, int i2) {
        MetricCategorySection(optionChainAvailableMetrics, num, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricSelectionSection$lambda$7(OptionChainCustomizationDataState2 optionChainCustomizationDataState2, String str, String str2, Function1 function1, int i, Composer composer, int i2) {
        MetricSelectionSection(optionChainCustomizationDataState2, str, str2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricTypeSelectionSection$lambda$14(ImmutableList immutableList, OptionChainCustomizationDataState2 optionChainCustomizationDataState2, OptionChainAvailableMetrics.MetricType metricType, OptionChainAvailableMetrics.MetricType metricType2, Function1 function1, int i, Composer composer, int i2) {
        MetricTypeSelectionSection(immutableList, optionChainCustomizationDataState2, metricType, metricType2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricTypeSelectionSection$lambda$19(ImmutableList immutableList, OptionChainCustomizationDataState2 optionChainCustomizationDataState2, OptionChainAvailableMetrics.MetricType metricType, OptionChainAvailableMetrics.MetricType metricType2, Function1 function1, int i, Composer composer, int i2) {
        MetricTypeSelectionSection(immutableList, optionChainCustomizationDataState2, metricType, metricType2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionChainCustomization$lambda$1(OptionChainCustomizationViewState optionChainCustomizationViewState, Function1 function1, Function1 function12, Function1 function13, int i, Composer composer, int i2) {
        OptionChainCustomization(optionChainCustomizationViewState, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OptionChainCustomization(final OptionChainCustomizationViewState viewState, final Function1<? super OptionChainCustomizationDataState2, Unit> onHighlightedMetricChanged, final Function1<? super Integer, Unit> onHighlightedCategoryChanged, final Function1<? super OptionChainAvailableMetrics.Metric, Unit> onSelectedMetricChanged, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onHighlightedMetricChanged, "onHighlightedMetricChanged");
        Intrinsics.checkNotNullParameter(onHighlightedCategoryChanged, "onHighlightedCategoryChanged");
        Intrinsics.checkNotNullParameter(onSelectedMetricChanged, "onSelectedMetricChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(2031601560);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onHighlightedMetricChanged) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onHighlightedCategoryChanged) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectedMetricChanged) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031601560, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainCustomization (OptionChainCustomizationComposable.kt:36)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(viewState.getHeaderTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8186);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            int i4 = i2;
            MetricSelectionSection(viewState.getHighlightedMetric(), viewState.getSelectedMetricLabelOne(), viewState.getSelectedMetricLabelTwo(), onHighlightedMetricChanged, composerStartRestartGroup, (i4 << 6) & 7168);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
            MetricCategorySection(viewState.getAvailableMetrics(), viewState.getHighlightedCategoryIndex(), onHighlightedCategoryChanged, composerStartRestartGroup, i4 & 896);
            MetricTypeSelectionSection(viewState.getMetricsInHighlightedCategory(), viewState.getHighlightedMetric(), viewState.getSelectedMetricOne().getMetricType(), viewState.getSelectedMetricTwo().getMetricType(), onSelectedMetricChanged, composerStartRestartGroup, (i4 << 3) & 57344);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainCustomizationComposable.OptionChainCustomization$lambda$1(viewState, onHighlightedMetricChanged, onHighlightedCategoryChanged, onSelectedMetricChanged, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MetricSelectionSection(final OptionChainCustomizationDataState2 highlightedMetric, final String selectedMetricLabelOne, final String selectedMetricLabelTwo, Function1<? super OptionChainCustomizationDataState2, Unit> function1, Composer composer, final int i) {
        int i2;
        final Function1<? super OptionChainCustomizationDataState2, Unit> onHighlightedMetricChanged = function1;
        Intrinsics.checkNotNullParameter(highlightedMetric, "highlightedMetric");
        Intrinsics.checkNotNullParameter(selectedMetricLabelOne, "selectedMetricLabelOne");
        Intrinsics.checkNotNullParameter(selectedMetricLabelTwo, "selectedMetricLabelTwo");
        Intrinsics.checkNotNullParameter(onHighlightedMetricChanged, "onHighlightedMetricChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-910470382);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(highlightedMetric.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(selectedMetricLabelOne) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(selectedMetricLabelTwo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onHighlightedMetricChanged) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-910470382, i2, -1, "com.robinhood.android.optionschain.chainsettings.MetricSelectionSection (OptionChainCustomizationComposable.kt:76)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            BorderStroke borderStroke = getBorderStroke(highlightedMetric == OptionChainCustomizationDataState2.METRIC_ONE, composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metric1_title, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i4 = i2 & 7168;
            boolean z = i4 == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainCustomizationComposable.MetricSelectionSection$lambda$6$lambda$3$lambda$2(onHighlightedMetricChanged);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i5 = i2;
            OptionChainMetricCard.m17181MetricCardhYmLsZ8(row6, strStringResource, selectedMetricLabelOne, jM21371getBg0d7_KjU, borderStroke, false, (Function0) objRememberedValue, composerStartRestartGroup, 6 | ((i2 << 3) & 896), 16);
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            BorderStroke borderStroke2 = getBorderStroke(highlightedMetric == OptionChainCustomizationDataState2.METRIC_TWO, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_metric2_title, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i4 == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                onHighlightedMetricChanged = function1;
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainCustomizationComposable.MetricSelectionSection$lambda$6$lambda$5$lambda$4(onHighlightedMetricChanged);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                onHighlightedMetricChanged = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionChainMetricCard.m17181MetricCardhYmLsZ8(row6, strStringResource2, selectedMetricLabelTwo, jM21371getBg0d7_KjU2, borderStroke2, false, (Function0) objRememberedValue2, composerStartRestartGroup, 6 | (i5 & 896), 16);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super OptionChainCustomizationDataState2, Unit> function12 = onHighlightedMetricChanged;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainCustomizationComposable.MetricSelectionSection$lambda$7(highlightedMetric, selectedMetricLabelOne, selectedMetricLabelTwo, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricSelectionSection$lambda$6$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(OptionChainCustomizationDataState2.METRIC_ONE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricSelectionSection$lambda$6$lambda$5$lambda$4(Function1 function1) {
        function1.invoke(OptionChainCustomizationDataState2.METRIC_TWO);
        return Unit.INSTANCE;
    }

    private static final BorderStroke getBorderStroke(boolean z, Composer composer, int i) {
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U;
        composer.startReplaceGroup(-1925880283);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1925880283, i, -1, "com.robinhood.android.optionschain.chainsettings.getBorderStroke (OptionChainCustomizationComposable.kt:103)");
        }
        if (z) {
            composer.startReplaceGroup(-1726285695);
            borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(SelectedMetricCardBorder, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU());
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1726188510);
            borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(NormalMetricCardBorder, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU());
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return borderStrokeM4886BorderStrokecXLIe8U;
    }

    public static final void MetricCategorySection(final OptionChainAvailableMetrics optionChainAvailableMetrics, final Integer num, final Function1<? super Integer, Unit> onHighlightedCategoryChanged, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onHighlightedCategoryChanged, "onHighlightedCategoryChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1879199430);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionChainAvailableMetrics) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onHighlightedCategoryChanged) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1879199430, i2, -1, "com.robinhood.android.optionschain.chainsettings.MetricCategorySection (OptionChainCustomizationComposable.kt:114)");
            }
            if (optionChainAvailableMetrics != null && !optionChainAvailableMetrics.getAvailableMetrics().isEmpty()) {
                if (optionChainAvailableMetrics.getAvailableMetrics().size() != 1) {
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(optionChainAvailableMetrics) | ((i2 & 896) == 256);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionChainCustomizationComposable.MetricCategorySection$lambda$12$lambda$11(optionChainAvailableMetrics, num, onHighlightedCategoryChanged, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyRow(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionChainCustomizationComposable.MetricCategorySection$lambda$8(optionChainAvailableMetrics, num, onHighlightedCategoryChanged, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainCustomizationComposable.MetricCategorySection$lambda$13(optionChainAvailableMetrics, num, onHighlightedCategoryChanged, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricCategorySection$lambda$12$lambda$11(OptionChainAvailableMetrics optionChainAvailableMetrics, final Integer num, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List<OptionChainAvailableMetrics.AvailableMetrics> availableMetrics = optionChainAvailableMetrics.getAvailableMetrics();
        LazyRow.items(availableMetrics.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$MetricCategorySection$lambda$12$lambda$11$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                return invoke(num2.intValue());
            }

            public final Object invoke(int i) {
                availableMetrics.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$MetricCategorySection$lambda$12$lambda$11$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num2, Composer composer, Integer num3) {
                invoke(lazyItemScope, num2.intValue(), composer, num3.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, final int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                boolean z = true;
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                OptionChainAvailableMetrics.AvailableMetrics availableMetrics2 = (OptionChainAvailableMetrics.AvailableMetrics) availableMetrics.get(i);
                composer.startReplaceGroup(1263988932);
                String categoryLabel = availableMetrics2.getCategoryLabel();
                Integer num2 = num;
                boolean z2 = num2 != null && i == num2.intValue();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1);
                if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(i)) && (i3 & 48) != 32) {
                    z = false;
                }
                boolean z3 = zChanged | z;
                Object objRememberedValue = composer.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$MetricCategorySection$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(Integer.valueOf(i));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                OptionChainMetricCard.MetricCategoryPill(categoryLabel, z2, (Function0) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void MetricTypeSelectionSection(final ImmutableList<OptionChainAvailableMetrics.Metric> metricsInHighlightedCategory, final OptionChainCustomizationDataState2 highlightedMetric, final OptionChainAvailableMetrics.MetricType selectedMetricOneType, final OptionChainAvailableMetrics.MetricType selectedMetricTwoType, final Function1<? super OptionChainAvailableMetrics.Metric, Unit> onSelectedMetricChanged, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(metricsInHighlightedCategory, "metricsInHighlightedCategory");
        Intrinsics.checkNotNullParameter(highlightedMetric, "highlightedMetric");
        Intrinsics.checkNotNullParameter(selectedMetricOneType, "selectedMetricOneType");
        Intrinsics.checkNotNullParameter(selectedMetricTwoType, "selectedMetricTwoType");
        Intrinsics.checkNotNullParameter(onSelectedMetricChanged, "onSelectedMetricChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1769270372);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(metricsInHighlightedCategory) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(highlightedMetric.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(selectedMetricOneType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(selectedMetricTwoType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectedMetricChanged) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1769270372, i2, -1, "com.robinhood.android.optionschain.chainsettings.MetricTypeSelectionSection (OptionChainCustomizationComposable.kt:139)");
            }
            if (metricsInHighlightedCategory.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionChainCustomizationComposable.MetricTypeSelectionSection$lambda$14(metricsInHighlightedCategory, highlightedMetric, selectedMetricOneType, selectedMetricTwoType, onSelectedMetricChanged, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(metricsInHighlightedCategory) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainCustomizationComposable.MetricTypeSelectionSection$lambda$18$lambda$17(metricsInHighlightedCategory, highlightedMetric, selectedMetricOneType, selectedMetricTwoType, onSelectedMetricChanged, (LazyGridScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierM5144paddingVpY3zN4$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, horizontalOrVerticalM5089spacedBy0680j_42, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0, 924);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainCustomizationComposable.MetricTypeSelectionSection$lambda$19(metricsInHighlightedCategory, highlightedMetric, selectedMetricOneType, selectedMetricTwoType, onSelectedMetricChanged, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricTypeSelectionSection$lambda$18$lambda$17(final ImmutableList immutableList, final OptionChainCustomizationDataState2 optionChainCustomizationDataState2, final OptionChainAvailableMetrics.MetricType metricType, final OptionChainAvailableMetrics.MetricType metricType2, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final C24222xdd399788 c24222xdd399788 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$MetricTypeSelectionSection$lambda$18$lambda$17$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(OptionChainAvailableMetrics.Metric metric) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((OptionChainAvailableMetrics.Metric) obj);
            }
        };
        LazyVerticalGrid.items(immutableList.size(), null, null, new Function1<Integer, Object>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$MetricTypeSelectionSection$lambda$18$lambda$17$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c24222xdd399788.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$MetricTypeSelectionSection$lambda$18$lambda$17$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                boolean z = true;
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                final OptionChainAvailableMetrics.Metric metric = (OptionChainAvailableMetrics.Metric) immutableList.get(i);
                composer.startReplaceGroup(-861443798);
                String metricLabel = metric.getMetricLabel();
                if (metric.getMetricType() != OptionChainAvailableMetrics.MetricType.UNSUPPORTED) {
                    int i4 = OptionChainCustomizationComposable.WhenMappings.$EnumSwitchMapping$0[optionChainCustomizationDataState2.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (metric.getMetricType() != metricType2) {
                            z = false;
                        }
                    } else if (metric.getMetricType() != metricType) {
                    }
                }
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(metric);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainCustomizationComposableKt$MetricTypeSelectionSection$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(metric);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                OptionChainMetricCard.MetricTypeCard(metricLabel, z, (Function0) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
