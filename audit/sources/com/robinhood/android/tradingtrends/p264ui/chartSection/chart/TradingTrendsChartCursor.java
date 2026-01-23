package com.robinhood.android.tradingtrends.p264ui.chartSection.chart;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TradingTrendsChartCursor.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.chart.ComposableSingletons$TradingTrendsChartCursorKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsChartCursor {
    public static final TradingTrendsChartCursor INSTANCE = new TradingTrendsChartCursor();

    /* renamed from: lambda$-689849272, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9275lambda$689849272 = ComposableLambda3.composableLambdaInstance(-689849272, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.ComposableSingletons$TradingTrendsChartCursorKt$lambda$-689849272$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-689849272, i, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.ComposableSingletons$TradingTrendsChartCursorKt.lambda$-689849272.<anonymous> (TradingTrendsChartCursor.kt:280)");
            }
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(500));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5174width3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Color color = Color.FG3;
            ThemedColor themedColor = new ThemedColor(color, color);
            Color color2 = Color.POSITIVE;
            ChartLegendItem chartLegendItem = new ChartLegendItem(themedColor, "50% Buy", "5,000,000 shares", new ThemedColor(color2, color2), null, "5000000", 16, null);
            ThemedColor themedColor2 = new ThemedColor(color, color);
            Color color3 = Color.f5853FG;
            TradingTrendsChartCursor4.TradingTrendsChartCursor(extensions2.persistentListOf(chartLegendItem, new ChartLegendItem(themedColor2, "50% Sell", "5,000,000 shares", new ThemedColor(color3, color3), null, "5000000", 16, null)), new DisplayText("Nov 2023", new ThemedColor(color3, color3), null, 4, null), null, null, composer, 384, 8);
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
    });
    private static Function2<Composer, Integer, Unit> lambda$369673471 = ComposableLambda3.composableLambdaInstance(369673471, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.ComposableSingletons$TradingTrendsChartCursorKt$lambda$369673471$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(369673471, i, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.ComposableSingletons$TradingTrendsChartCursorKt.lambda$369673471.<anonymous> (TradingTrendsChartCursor.kt:327)");
            }
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(500));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5174width3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Color color = Color.FG3;
            ThemedColor themedColor = new ThemedColor(color, color);
            Color color2 = Color.POSITIVE;
            ChartLegendItem chartLegendItem = new ChartLegendItem(themedColor, "33% Buy", "5,000,000 shares", new ThemedColor(color2, color2), null, "5000000", 16, null);
            ThemedColor themedColor2 = new ThemedColor(color, color);
            Color color3 = Color.f5853FG;
            TradingTrendsChartCursor4.TradingTrendsChartCursor(extensions2.persistentListOf(chartLegendItem, new ChartLegendItem(themedColor2, "33% Sell", "5,000,000 shares", new ThemedColor(color3, color3), null, "5000000", 16, null), new ChartLegendItem(new ThemedColor(color, color), "33% Sell", "5,000,000 shares", new ThemedColor(color3, color3), null, "5000000", 16, null)), new DisplayText("Nov 2023", new ThemedColor(color3, color3), null, 4, null), null, null, composer, 384, 8);
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
    });

    /* renamed from: getLambda$-689849272$lib_trading_trends_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19509getLambda$689849272$lib_trading_trends_externalDebug() {
        return f9275lambda$689849272;
    }

    public final Function2<Composer, Integer, Unit> getLambda$369673471$lib_trading_trends_externalDebug() {
        return lambda$369673471;
    }
}
