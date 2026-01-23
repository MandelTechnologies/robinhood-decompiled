package com.robinhood.android.tradingtrends.p264ui.chartSection.chart;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.Logger;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.SubDisplayText2;
import com.robinhood.android.charts.segmented.UtilKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.sdui.chartgroup.SduiCursorData2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartAxis;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import com.robinhood.models.serverdriven.experimental.api.DisplayText;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TradingTrendsChartCursor.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\"\u0010\u0010\u0014\u001a\u00020\u00158\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"TradingTrendsChartCursor", "", "chartGroup", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "xPosition", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buySellLegendItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "xValueScrubbingLabel", "Lcom/robinhood/models/serverdriven/experimental/api/DisplayText;", "priceItem", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/serverdriven/experimental/api/DisplayText;Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TradingTrendsChartCursorPreview", "(Landroidx/compose/runtime/Composer;I)V", "TradingTrendsChartCursorPreview3", "ShareCountRowTag", "", "lib-trading-trends_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsChartCursor4 {
    public static final String ShareCountRowTag = "VolumesRowTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartCursor$lambda$15(ChartGroup chartGroup, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingTrendsChartCursor(chartGroup, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartCursor$lambda$17(ImmutableList immutableList, DisplayText displayText, ChartLegendItem chartLegendItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingTrendsChartCursor(immutableList, displayText, chartLegendItem, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartCursorPreview$lambda$18(int i, Composer composer, int i2) {
        TradingTrendsChartCursorPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartCursorPreview3$lambda$19(int i, Composer composer, int i2) {
        TradingTrendsChartCursorPreview3(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingTrendsChartCursor(final ChartGroup<? extends GenericAction> chartGroup, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        Chart chart;
        List listEmptyList;
        Map<String, List<ChartLegendItem>> legend_data;
        Set<Map.Entry<String, List<ChartLegendItem>>> setEntrySet;
        Tuples2 tuples2M3642to;
        ImmutableList immutableList;
        boolean zChanged2;
        Object objRememberedValue2;
        ChartAxis x_axis;
        Map<String, DisplayText> scrubbing_labels;
        Tuples2 tuples2M3642to2;
        ImmutableList immutableList2;
        boolean zChanged3;
        Object objRememberedValue3;
        Tuples2 tuples2M3642to3;
        DisplayText displayText;
        boolean zChanged4;
        Object objRememberedValue4;
        Chart chart2;
        Map<String, List<ChartLegendItem>> legend_data2;
        Set<Map.Entry<String, List<ChartLegendItem>>> setEntrySet2;
        Tuples2 tuples2M3642to4;
        ImmutableList immutableList3;
        boolean zChanged5;
        Object objRememberedValue5;
        Tuples2 tuples2;
        ImmutableList<ChartLegendItem> immutableList4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(1861256362);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1861256362, i3, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursor (TradingTrendsChartCursor.kt:53)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    chart = (Chart) CollectionsKt.firstOrNull((List) chartGroup.getCharts());
                    if (chart != null || (legend_data = chart.getLegend_data()) == null || (setEntrySet = legend_data.entrySet()) == null) {
                        listEmptyList = null;
                    } else {
                        listEmptyList = new ArrayList();
                        Iterator<T> it = setEntrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            try {
                                tuples2M3642to = Tuples4.m3642to(Float.valueOf(Float.parseFloat((String) entry.getKey())), extensions2.toImmutableList((Iterable) entry.getValue()));
                            } catch (Exception e) {
                                Logger.INSTANCE.mo1682e(e, "Failed to parse buy/sell legend_data", new Object[0]);
                                tuples2M3642to = null;
                            }
                            if (tuples2M3642to != null) {
                                listEmptyList.add(tuples2M3642to);
                            }
                        }
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    objRememberedValue = extensions2.toImmutableList(listEmptyList);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                immutableList = (ImmutableList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    x_axis = chartGroup.getX_axis();
                    if (x_axis != null || (scrubbing_labels = x_axis.getScrubbing_labels()) == null) {
                        objRememberedValue2 = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, DisplayText> entry2 : scrubbing_labels.entrySet()) {
                            try {
                                tuples2M3642to2 = Tuples4.m3642to(Float.valueOf(Float.parseFloat(entry2.getKey())), entry2.getValue());
                            } catch (Exception e2) {
                                Logger.INSTANCE.mo1682e(e2, "Failed to parse x-axis scrubbing_labels", new Object[0]);
                                tuples2M3642to2 = null;
                            }
                            if (tuples2M3642to2 != null) {
                                arrayList.add(tuples2M3642to2);
                            }
                        }
                        objRememberedValue2 = extensions2.toImmutableList(arrayList);
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                immutableList2 = (ImmutableList) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i5 = i3 & 112;
                zChanged3 = (i5 != 32) | composerStartRestartGroup.changed(immutableList);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    tuples2M3642to3 = (Tuples2) UtilKt.getClosestItemByValue(immutableList, f, new Function1() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(TradingTrendsChartCursor4.TradingTrendsChartCursor$lambda$5$lambda$4((Tuples2) obj));
                        }
                    });
                    if (tuples2M3642to3 == null) {
                        tuples2M3642to3 = Tuples4.m3642to(Float.valueOf(0.0f), extensions2.persistentListOf());
                    }
                    objRememberedValue3 = tuples2M3642to3;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Tuples2 tuples22 = (Tuples2) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                float fFloatValue = ((Number) tuples22.component1()).floatValue();
                ImmutableList immutableList5 = (ImmutableList) tuples22.component2();
                composerStartRestartGroup.startReplaceGroup(1961040578);
                if (immutableList2 != null) {
                    displayText = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Float.valueOf(TradingTrendsChartCursor4.TradingTrendsChartCursor$lambda$8$lambda$7$lambda$6((Tuples2) obj));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Tuples2 tuples23 = (Tuples2) UtilKt.getClosestItemByValue(immutableList2, fFloatValue, (Function1) objRememberedValue6);
                    displayText = tuples23 != null ? (DisplayText) tuples23.getSecond() : null;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged4 = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    chart2 = (Chart) CollectionsKt.getOrNull(chartGroup.getCharts(), 1);
                    if (chart2 != null || (legend_data2 = chart2.getLegend_data()) == null || (setEntrySet2 = legend_data2.entrySet()) == null) {
                        objRememberedValue4 = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it2 = setEntrySet2.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it2.next();
                            try {
                                tuples2M3642to4 = Tuples4.m3642to(Float.valueOf(Float.parseFloat((String) entry3.getKey())), extensions2.toImmutableList((Iterable) entry3.getValue()));
                            } catch (Exception e3) {
                                Logger.INSTANCE.mo1682e(e3, "Failed to parse price legend_data", new Object[0]);
                                tuples2M3642to4 = null;
                            }
                            if (tuples2M3642to4 != null) {
                                arrayList2.add(tuples2M3642to4);
                            }
                        }
                        objRememberedValue4 = extensions2.toImmutableList(arrayList2);
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                immutableList3 = (ImmutableList) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged5 = composerStartRestartGroup.changed(immutableList3) | (i5 == 32);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    if (immutableList3 == null && (tuples2 = (Tuples2) UtilKt.getClosestItemByValue(immutableList3, f, new Function1() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(TradingTrendsChartCursor4.TradingTrendsChartCursor$lambda$14$lambda$12$lambda$11((Tuples2) obj));
                        }
                    })) != null && (immutableList4 = (ImmutableList) tuples2.getSecond()) != null) {
                        for (ChartLegendItem chartLegendItem : immutableList4) {
                            if (Intrinsics.areEqual(chartLegendItem.getId(), AnalyticsStrings.TAG_SORT_ORDER_PRICE)) {
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    chartLegendItem = null;
                    composerStartRestartGroup.updateRememberedValue(chartLegendItem);
                    objRememberedValue5 = chartLegendItem;
                }
                composerStartRestartGroup.endReplaceGroup();
                TradingTrendsChartCursor(immutableList5, displayText, (ChartLegendItem) objRememberedValue5, modifier4, composerStartRestartGroup, (i3 << 3) & 7168, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingTrendsChartCursor4.TradingTrendsChartCursor$lambda$15(chartGroup, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(chartGroup);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                chart = (Chart) CollectionsKt.firstOrNull((List) chartGroup.getCharts());
                if (chart != null) {
                    listEmptyList = null;
                    if (listEmptyList == null) {
                    }
                    objRememberedValue = extensions2.toImmutableList(listEmptyList);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    immutableList = (ImmutableList) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged2 = composerStartRestartGroup.changed(chartGroup);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        x_axis = chartGroup.getX_axis();
                        if (x_axis != null) {
                            objRememberedValue2 = null;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            immutableList2 = (ImmutableList) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            int i52 = i3 & 112;
                            zChanged3 = (i52 != 32) | composerStartRestartGroup.changed(immutableList);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged3) {
                                tuples2M3642to3 = (Tuples2) UtilKt.getClosestItemByValue(immutableList, f, new Function1() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Float.valueOf(TradingTrendsChartCursor4.TradingTrendsChartCursor$lambda$5$lambda$4((Tuples2) obj));
                                    }
                                });
                                if (tuples2M3642to3 == null) {
                                }
                                objRememberedValue3 = tuples2M3642to3;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                Tuples2 tuples222 = (Tuples2) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                float fFloatValue2 = ((Number) tuples222.component1()).floatValue();
                                ImmutableList immutableList52 = (ImmutableList) tuples222.component2();
                                composerStartRestartGroup.startReplaceGroup(1961040578);
                                if (immutableList2 != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChanged4 = composerStartRestartGroup.changed(chartGroup);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged4) {
                                    chart2 = (Chart) CollectionsKt.getOrNull(chartGroup.getCharts(), 1);
                                    if (chart2 != null) {
                                        objRememberedValue4 = null;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        immutableList3 = (ImmutableList) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChanged5 = composerStartRestartGroup.changed(immutableList3) | (i52 == 32);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged5) {
                                            if (immutableList3 == null) {
                                                chartLegendItem = null;
                                                composerStartRestartGroup.updateRememberedValue(chartLegendItem);
                                                objRememberedValue5 = chartLegendItem;
                                                composerStartRestartGroup.endReplaceGroup();
                                                TradingTrendsChartCursor(immutableList52, displayText, (ChartLegendItem) objRememberedValue5, modifier4, composerStartRestartGroup, (i3 << 3) & 7168, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                modifier3 = modifier4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TradingTrendsChartCursor$lambda$5$lambda$4(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TradingTrendsChartCursor$lambda$8$lambda$7$lambda$6(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TradingTrendsChartCursor$lambda$14$lambda$12$lambda$11(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6 A[LOOP:0: B:57:0x00b0->B:59:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingTrendsChartCursor(final ImmutableList<ChartLegendItem> immutableList, final DisplayText displayText, final ChartLegendItem chartLegendItem, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BentoTheme bentoTheme;
        int i4;
        long jM21372getBg20d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1956502112);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(displayText) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chartLegendItem) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1956502112, i3, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursor (TradingTrendsChartCursor.kt:160)");
                }
                composerStartRestartGroup.startReplaceGroup(997155969);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                for (ChartLegendItem chartLegendItem2 : immutableList) {
                    arrayList.add(Tuples4.m3642to(Integer.valueOf(Integer.parseInt(chartLegendItem2.getId())), Color.m6701boximpl(SduiColors2.m18896toComposeColorDefaultediJQMabo(chartLegendItem2.getValue_color(), 0L, composerStartRestartGroup, 0, 1))));
                }
                composerStartRestartGroup.endReplaceGroup();
                final ImmutableList immutableList2 = extensions2.toImmutableList(arrayList);
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(997164483);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(997163650);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                int i6 = CardDefaults.$stable;
                CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, jM21371getBg0d7_KjU, 0L, 0L, composerStartRestartGroup, i6 << 12, 12);
                Modifier modifier5 = modifier4;
                CardKt.Card(modifier5, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), cardColorsM5729cardColorsro_MJ88, cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i6 << 18) | 6, 62), null, ComposableLambda3.rememberComposableLambda(1486724754, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt.TradingTrendsChartCursor.3
                    public final void invoke(Column5 Card, Composer composer3, int i7) {
                        ImmutableList<ChartLegendItem> immutableList3;
                        ImmutableList<Tuples2<Integer, Color>> immutableList4;
                        Modifier.Companion companion;
                        int i8;
                        Composer composer4 = composer3;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1486724754, i7, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursor.<anonymous> (TradingTrendsChartCursor.kt:175)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion2, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM() + bentoTheme2.getSpacing(composer4, i9).m21595getXsmallD9Ej5fM()), bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM()), Intrinsic4.Min), C2002Dp.m7995constructorimpl(182), 0.0f, 2, null);
                        DisplayText displayText2 = displayText;
                        ImmutableList<ChartLegendItem> immutableList5 = immutableList;
                        ImmutableList<Tuples2<Integer, Color>> immutableList6 = immutableList2;
                        ChartLegendItem chartLegendItem3 = chartLegendItem;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer4, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5176widthInVpY3zN4$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer4.startReplaceGroup(1849141775);
                        if (displayText2 != null) {
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), 7, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer4, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            immutableList4 = immutableList6;
                            SubDisplayText2.TintedRegularText(Row5.weight$default(Row6.INSTANCE, companion2, 1.0f, false, 2, null), SduiCursorData2.toComposableModel(displayText2, composer4, 0), false, composer4, CursorData.DisplayText.$stable << 3, 4);
                            composer4.startReplaceGroup(2103756694);
                            if (chartLegendItem3 != null) {
                                String value = chartLegendItem3.getValue();
                                TextStyle textS = bentoTheme2.getTypography(composer4, i9).getTextS();
                                long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(chartLegendItem3.getValue_color(), 0L, composer4, 0, 1);
                                companion = companion2;
                                immutableList3 = immutableList5;
                                composer4 = composer3;
                                i8 = 2;
                                BentoText2.m20747BentoText38GnDrw(value, null, Color.m6701boximpl(jM18896toComposeColorDefaultediJQMabo), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer4, 24576, 0, 8170);
                            } else {
                                companion = companion2;
                                i8 = 2;
                                immutableList3 = immutableList5;
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                        } else {
                            immutableList3 = immutableList5;
                            immutableList4 = immutableList6;
                            companion = companion2;
                            i8 = 2;
                        }
                        composer4.endReplaceGroup();
                        if (immutableList3.size() <= i8) {
                            composer4.startReplaceGroup(1489740910);
                            int i10 = 0;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer4, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, companion);
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor3);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composer4.startReplaceGroup(587638286);
                            int i11 = 0;
                            for (Iterator<ChartLegendItem> it = immutableList3.iterator(); it.hasNext(); it = it) {
                                ChartLegendItem next = it.next();
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                ChartLegendItem chartLegendItem4 = next;
                                int i13 = (i11 <= 0 || i11 != CollectionsKt.getLastIndex(immutableList3)) ? i10 : 1;
                                String title = chartLegendItem4.getTitle();
                                TextStyle textS2 = BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextS();
                                long jM18896toComposeColorDefaultediJQMabo2 = SduiColors2.m18896toComposeColorDefaultediJQMabo(chartLegendItem4.getValue_color(), 0L, composer4, 0, 1);
                                TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                composer4 = composer3;
                                BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), Color.m6701boximpl(jM18896toComposeColorDefaultediJQMabo2), null, null, null, TextAlign.m7912boximpl(i13 != 0 ? companion5.m7920getEnde0LSkKk() : companion5.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textS2, composer4, 0, 0, 8120);
                                i10 = i10;
                                i11 = i12;
                                row6 = row6;
                            }
                            int i14 = i10;
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            StackedRowChart.m19511StackedRowChartmkeQTyY(immutableList4, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, composer4, 0, 28);
                            ImmutableList<ChartLegendItem> immutableList7 = immutableList3;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList7, 10));
                            Iterator<ChartLegendItem> it2 = immutableList7.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().getValue());
                            }
                            if (!arrayList2.isEmpty()) {
                                Iterator it3 = arrayList2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (((String) it3.next()).length() > 0) {
                                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TradingTrendsChartCursor4.ShareCountRowTag);
                                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, i14);
                                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, i14);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer4, modifierTestTag);
                                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor4);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                                        Row6 row62 = Row6.INSTANCE;
                                        composer4.startReplaceGroup(1475394865);
                                        int i15 = i14;
                                        for (Object obj : arrayList2) {
                                            int i16 = i15 + 1;
                                            if (i15 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            String str = (String) obj;
                                            int i17 = (i15 <= 0 || i15 != CollectionsKt.getLastIndex(immutableList7)) ? i14 : 1;
                                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                            int i18 = BentoTheme.$stable;
                                            TextStyle textS3 = bentoTheme3.getTypography(composer4, i18).getTextS();
                                            long jM21426getFg20d7_KjU = bentoTheme3.getColors(composer4, i18).m21426getFg20d7_KjU();
                                            int iM7920getEnde0LSkKk = i17 != 0 ? TextAlign.INSTANCE.m7920getEnde0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk();
                                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme3.getSpacing(composer4, i18).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            composer4.startReplaceGroup(1475415276);
                                            float fM21595getXsmallD9Ej5fM = i15 != 0 ? bentoTheme3.getSpacing(composer4, i18).m21595getXsmallD9Ej5fM() : C2002Dp.m7995constructorimpl(i14);
                                            composer4.endReplaceGroup();
                                            Modifier modifierWidth = Intrinsic3.width(PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default2, fM21595getXsmallD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), Intrinsic4.Max);
                                            Modifier modifierWeight$default = Row5.weight$default(row62, modifierWidth, 1.0f, false, 2, null);
                                            Row6 row63 = row62;
                                            if (modifierWeight$default != null) {
                                                modifierWidth = modifierWeight$default;
                                            }
                                            BentoText2.m20747BentoText38GnDrw(str, modifierWidth, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk), 0, false, 1, 0, null, 0, textS3, composer4, 805306368, 0, 7608);
                                            i15 = i16;
                                            row62 = row63;
                                            immutableList7 = immutableList7;
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                    }
                                }
                            }
                            composer4.endReplaceGroup();
                        } else {
                            int i19 = 0;
                            composer4.startReplaceGroup(1491856226);
                            StackedRowChart.m19511StackedRowChartmkeQTyY(immutableList4, null, 0.0f, 0.0f, 0.0f, composer4, 0, 30);
                            for (ChartLegendItem chartLegendItem5 : immutableList3) {
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                int i20 = BentoTheme.$stable;
                                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion7, 0.0f, bentoTheme4.getSpacing(composer4, i20).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer4, 48);
                                int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, i19);
                                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default3);
                                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor5);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy4, companion8.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion8.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion8.getSetModifier());
                                composer4 = composer3;
                                BentoText2.m20747BentoText38GnDrw(chartLegendItem5.getTitle(), Row5.weight$default(Row6.INSTANCE, companion7, 1.0f, false, 2, null), Color.m6701boximpl(SduiColors2.m18896toComposeColorDefaultediJQMabo(chartLegendItem5.getValue_color(), 0L, composer4, 0, 1)), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer4, i20).getTextS(), composer4, 0, 0, 8120);
                                BentoText2.m20747BentoText38GnDrw(chartLegendItem5.getValue(), null, Color.m6701boximpl(bentoTheme4.getColors(composer4, i20).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer4, i20).getTextS(), composer4, 0, 0, 8186);
                                composer3.endNode();
                                i19 = 0;
                            }
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 196608, 16);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingTrendsChartCursor4.TradingTrendsChartCursor$lambda$17(immutableList, displayText, chartLegendItem, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(997155969);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            while (r13.hasNext()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final ImmutableList<Tuples2<Integer, Color>> immutableList22 = extensions2.toImmutableList(arrayList2);
            CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            long jM21371getBg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
            int i62 = CardDefaults.$stable;
            CardColors cardColorsM5729cardColorsro_MJ882 = cardDefaults2.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, jM21371getBg0d7_KjU2, 0L, 0L, composerStartRestartGroup, i62 << 12, 12);
            Modifier modifier52 = modifier4;
            CardKt.Card(modifier52, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), cardColorsM5729cardColorsro_MJ882, cardDefaults2.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i62 << 18) | 6, 62), null, ComposableLambda3.rememberComposableLambda(1486724754, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt.TradingTrendsChartCursor.3
                public final void invoke(Column5 Card, Composer composer3, int i7) {
                    ImmutableList<ChartLegendItem> immutableList3;
                    ImmutableList<Tuples2<Integer, Color>> immutableList4;
                    Modifier.Companion companion;
                    int i8;
                    Composer composer4 = composer3;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i7 & 17) == 16 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1486724754, i7, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursor.<anonymous> (TradingTrendsChartCursor.kt:175)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion2, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM() + bentoTheme2.getSpacing(composer4, i9).m21595getXsmallD9Ej5fM()), bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM()), Intrinsic4.Min), C2002Dp.m7995constructorimpl(182), 0.0f, 2, null);
                    DisplayText displayText2 = displayText;
                    ImmutableList<ChartLegendItem> immutableList5 = immutableList;
                    ImmutableList<Tuples2<Integer, Color>> immutableList6 = immutableList22;
                    ChartLegendItem chartLegendItem3 = chartLegendItem;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer4, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5176widthInVpY3zN4$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer4.startReplaceGroup(1849141775);
                    if (displayText2 != null) {
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer4, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        immutableList4 = immutableList6;
                        SubDisplayText2.TintedRegularText(Row5.weight$default(Row6.INSTANCE, companion2, 1.0f, false, 2, null), SduiCursorData2.toComposableModel(displayText2, composer4, 0), false, composer4, CursorData.DisplayText.$stable << 3, 4);
                        composer4.startReplaceGroup(2103756694);
                        if (chartLegendItem3 != null) {
                            String value = chartLegendItem3.getValue();
                            TextStyle textS = bentoTheme2.getTypography(composer4, i9).getTextS();
                            long jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(chartLegendItem3.getValue_color(), 0L, composer4, 0, 1);
                            companion = companion2;
                            immutableList3 = immutableList5;
                            composer4 = composer3;
                            i8 = 2;
                            BentoText2.m20747BentoText38GnDrw(value, null, Color.m6701boximpl(jM18896toComposeColorDefaultediJQMabo), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer4, 24576, 0, 8170);
                        } else {
                            companion = companion2;
                            i8 = 2;
                            immutableList3 = immutableList5;
                        }
                        composer4.endReplaceGroup();
                        composer4.endNode();
                    } else {
                        immutableList3 = immutableList5;
                        immutableList4 = immutableList6;
                        companion = companion2;
                        i8 = 2;
                    }
                    composer4.endReplaceGroup();
                    if (immutableList3.size() <= i8) {
                        composer4.startReplaceGroup(1489740910);
                        int i10 = 0;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer4, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, companion);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composer4.startReplaceGroup(587638286);
                        int i11 = 0;
                        for (Iterator<ChartLegendItem> it = immutableList3.iterator(); it.hasNext(); it = it) {
                            ChartLegendItem next = it.next();
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ChartLegendItem chartLegendItem4 = next;
                            int i13 = (i11 <= 0 || i11 != CollectionsKt.getLastIndex(immutableList3)) ? i10 : 1;
                            String title = chartLegendItem4.getTitle();
                            TextStyle textS2 = BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextS();
                            long jM18896toComposeColorDefaultediJQMabo2 = SduiColors2.m18896toComposeColorDefaultediJQMabo(chartLegendItem4.getValue_color(), 0L, composer4, 0, 1);
                            TextAlign.Companion companion5 = TextAlign.INSTANCE;
                            composer4 = composer3;
                            BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), Color.m6701boximpl(jM18896toComposeColorDefaultediJQMabo2), null, null, null, TextAlign.m7912boximpl(i13 != 0 ? companion5.m7920getEnde0LSkKk() : companion5.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textS2, composer4, 0, 0, 8120);
                            i10 = i10;
                            i11 = i12;
                            row6 = row6;
                        }
                        int i14 = i10;
                        composer4.endReplaceGroup();
                        composer4.endNode();
                        StackedRowChart.m19511StackedRowChartmkeQTyY(immutableList4, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, composer4, 0, 28);
                        ImmutableList<ChartLegendItem> immutableList7 = immutableList3;
                        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList7, 10));
                        Iterator<ChartLegendItem> it2 = immutableList7.iterator();
                        while (it2.hasNext()) {
                            arrayList22.add(it2.next().getValue());
                        }
                        if (!arrayList22.isEmpty()) {
                            Iterator it3 = arrayList22.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if (((String) it3.next()).length() > 0) {
                                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TradingTrendsChartCursor4.ShareCountRowTag);
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer4, i14);
                                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, i14);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer4, modifierTestTag);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor4);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    composer4.startReplaceGroup(1475394865);
                                    int i15 = i14;
                                    for (Object obj : arrayList22) {
                                        int i16 = i15 + 1;
                                        if (i15 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        String str = (String) obj;
                                        int i17 = (i15 <= 0 || i15 != CollectionsKt.getLastIndex(immutableList7)) ? i14 : 1;
                                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                        int i18 = BentoTheme.$stable;
                                        TextStyle textS3 = bentoTheme3.getTypography(composer4, i18).getTextS();
                                        long jM21426getFg20d7_KjU = bentoTheme3.getColors(composer4, i18).m21426getFg20d7_KjU();
                                        int iM7920getEnde0LSkKk = i17 != 0 ? TextAlign.INSTANCE.m7920getEnde0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk();
                                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme3.getSpacing(composer4, i18).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        composer4.startReplaceGroup(1475415276);
                                        float fM21595getXsmallD9Ej5fM = i15 != 0 ? bentoTheme3.getSpacing(composer4, i18).m21595getXsmallD9Ej5fM() : C2002Dp.m7995constructorimpl(i14);
                                        composer4.endReplaceGroup();
                                        Modifier modifierWidth = Intrinsic3.width(PaddingKt.m5146paddingqDBjuR0$default(modifierM5146paddingqDBjuR0$default2, fM21595getXsmallD9Ej5fM, 0.0f, 0.0f, 0.0f, 14, null), Intrinsic4.Max);
                                        Modifier modifierWeight$default = Row5.weight$default(row62, modifierWidth, 1.0f, false, 2, null);
                                        Row6 row63 = row62;
                                        if (modifierWeight$default != null) {
                                            modifierWidth = modifierWeight$default;
                                        }
                                        BentoText2.m20747BentoText38GnDrw(str, modifierWidth, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk), 0, false, 1, 0, null, 0, textS3, composer4, 805306368, 0, 7608);
                                        i15 = i16;
                                        row62 = row63;
                                        immutableList7 = immutableList7;
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.endNode();
                                }
                            }
                        }
                        composer4.endReplaceGroup();
                    } else {
                        int i19 = 0;
                        composer4.startReplaceGroup(1491856226);
                        StackedRowChart.m19511StackedRowChartmkeQTyY(immutableList4, null, 0.0f, 0.0f, 0.0f, composer4, 0, 30);
                        for (ChartLegendItem chartLegendItem5 : immutableList3) {
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                            int i20 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion7, 0.0f, bentoTheme4.getSpacing(composer4, i20).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer4, 48);
                            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, i19);
                            CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default3);
                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor5);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy4, companion8.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion8.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion8.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion8.getSetModifier());
                            composer4 = composer3;
                            BentoText2.m20747BentoText38GnDrw(chartLegendItem5.getTitle(), Row5.weight$default(Row6.INSTANCE, companion7, 1.0f, false, 2, null), Color.m6701boximpl(SduiColors2.m18896toComposeColorDefaultediJQMabo(chartLegendItem5.getValue_color(), 0L, composer4, 0, 1)), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer4, i20).getTextS(), composer4, 0, 0, 8120);
                            BentoText2.m20747BentoText38GnDrw(chartLegendItem5.getValue(), null, Color.m6701boximpl(bentoTheme4.getColors(composer4, i20).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer4, i20).getTextS(), composer4, 0, 0, 8186);
                            composer3.endNode();
                            i19 = 0;
                        }
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 196608, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void TradingTrendsChartCursorPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-653037824);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-653037824, i, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorPreview (TradingTrendsChartCursor.kt:278)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradingTrendsChartCursor.INSTANCE.m19509getLambda$689849272$lib_trading_trends_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsChartCursor4.TradingTrendsChartCursorPreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TradingTrendsChartCursorPreview3(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1510828359);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1510828359, i, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorPreview3 (TradingTrendsChartCursor.kt:325)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TradingTrendsChartCursor.INSTANCE.getLambda$369673471$lib_trading_trends_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsChartCursor4.TradingTrendsChartCursorPreview3$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
