package com.robinhood.android.lib.performancechart;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.charts.Placeholders2;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.charts.span.SpanOptionsDynamicSelector;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PerformanceChartLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000f\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u000b\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"PlaceholderPrimaryText", "", "PlaceholderSecondaryText", "PerformanceChartLoadingTestTag", "getPerformanceChartLoadingTestTag$annotations", "()V", "PerformanceChartLoadingComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TextPlaceholderShape", "Landroidx/compose/ui/graphics/Shape;", "getTextPlaceholderShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "PerformanceChartLoadingComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformanceChartLoadingComposable3 {
    public static final String PerformanceChartLoadingTestTag = "performance_chart_loading";
    private static final String PlaceholderPrimaryText = "$X,XXX.XX";
    private static final String PlaceholderSecondaryText = "+$X,XXX.XX (X.XX%) Today";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartLoadingComposable$lambda$3(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PerformanceChartLoadingComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartLoadingComposablePreview$lambda$4(int i, Composer composer, int i2) {
        PerformanceChartLoadingComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPerformanceChartLoadingTestTag$annotations() {
    }

    public static final void PerformanceChartLoadingComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1180068190);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1180068190, i3, -1, "com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposable (PerformanceChartLoadingComposable.kt:32)");
            }
            Modifier modifierTestTag = TestTag3.testTag(modifier3, PerformanceChartLoadingTestTag);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            WrappedTickerKt.TickerText(new TickerTextState(PlaceholderPrimaryText, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), TickerTextState.Style.DISPLAY_LARGE, "", false, 16, null), ModifiersKt.bentoPlaceholder(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), composerStartRestartGroup, 6, 0), true, getTextPlaceholderShape(composerStartRestartGroup, 0)), composerStartRestartGroup, TickerTextState.$stable, 0);
            Modifier modifier4 = modifier3;
            BentoText2.m20747BentoText38GnDrw(PlaceholderSecondaryText, ModifiersKt.bentoPlaceholder(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, 0.0f, C2002Dp.m7995constructorimpl(48), composerStartRestartGroup, 390, 1), true, getTextPlaceholderShape(composerStartRestartGroup, 0)), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16380);
            Placeholders2.ChartPlaceholder(com.robinhood.android.charts.ModifiersKt.fullWidthChartSize(companion2), false, composerStartRestartGroup, 0, 2);
            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0), true, null, 2, null);
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new SpanOption("", "", false));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PerformanceChartLoadingComposable3.PerformanceChartLoadingComposable$lambda$2$lambda$1$lambda$0((String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(immutableList3PersistentListOf, "", (Function1) objRememberedValue, modifierBentoPlaceholder$default, null, false, null, composerStartRestartGroup, 432, 112);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerformanceChartLoadingComposable3.PerformanceChartLoadingComposable$lambda$3(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceChartLoadingComposable$lambda$2$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @JvmName
    private static final Shape getTextPlaceholderShape(Composer composer, int i) {
        composer.startReplaceGroup(-2120428370);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2120428370, i, -1, "com.robinhood.android.lib.performancechart.<get-TextPlaceholderShape> (PerformanceChartLoadingComposable.kt:85)");
        }
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return roundedCornerShapeM5327RoundedCornerShape0680j_4;
    }

    private static final void PerformanceChartLoadingComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1114645497);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1114645497, i, -1, "com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposablePreview (PerformanceChartLoadingComposable.kt:89)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, PerformanceChartLoadingComposable.INSTANCE.m15841getLambda$318541391$lib_performance_chart_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartLoadingComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerformanceChartLoadingComposable3.PerformanceChartLoadingComposablePreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
