package com.robinhood.android.advisory.insights.detail;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.advisory.returns.ReturnsBarColors;
import com.robinhood.android.advisory.returns.ReturnsBarData;
import com.robinhood.android.advisory.returns.ReturnsChart2;
import com.robinhood.android.advisory.returns.ReturnsChart7;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightAsset;
import com.robinhood.models.advisory.p304db.insights.AdvisoryInsightReturnsBreakdownBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryInsightReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, m3636d2 = {"AdvisoryInsightReturnsChart", "", "chartModel", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightAsset$ReturnsChart;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightAsset$ReturnsChart;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "mapBarTypeToColors", "Lcom/robinhood/android/advisory/returns/ReturnsBarColors;", "type", "Lcom/robinhood/models/advisory/db/insights/AdvisoryInsightReturnsBreakdownBar$BarType;", "feature-advisory-insights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightReturnsChartKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightReturnsChart {

    /* compiled from: AdvisoryInsightReturnsChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.insights.detail.AdvisoryInsightReturnsChartKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvisoryInsightReturnsBreakdownBar.BarType.values().length];
            try {
                iArr[AdvisoryInsightReturnsBreakdownBar.BarType.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvisoryInsightReturnsBreakdownBar.BarType.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvisoryInsightReturnsBreakdownBar.BarType.SLIGHTLY_POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvisoryInsightReturnsBreakdownBar.BarType.SLIGHTLY_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryInsightReturnsChart$lambda$2(AdvisoryInsightAsset.ReturnsChart returnsChart, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryInsightReturnsChart(returnsChart, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc A[LOOP:0: B:49:0x00d6->B:51:0x00dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryInsightReturnsChart(final AdvisoryInsightAsset.ReturnsChart chartModel, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Iterator<T> it;
        Float fValueOf;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartModel, "chartModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(374913361);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(374913361, i3, -1, "com.robinhood.android.advisory.insights.detail.AdvisoryInsightReturnsChart (AdvisoryInsightReturnsChart.kt:18)");
                }
                List<AdvisoryInsightReturnsBreakdownBar> bars = chartModel.getReturnsBreakdown().getBars();
                it = bars.iterator();
                if (it.hasNext()) {
                    fValueOf = null;
                } else {
                    float fFloatValue = ((AdvisoryInsightReturnsBreakdownBar) it.next()).getPercentageChange().abs().floatValue();
                    while (it.hasNext()) {
                        fFloatValue = Math.max(fFloatValue, ((AdvisoryInsightReturnsBreakdownBar) it.next()).getPercentageChange().abs().floatValue());
                    }
                    fValueOf = Float.valueOf(fFloatValue);
                }
                float fCoerceAtLeast = fValueOf == null ? RangesKt.coerceAtLeast(fValueOf.floatValue(), 1.0E-4f) : 1.0f;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bars, 10));
                for (AdvisoryInsightReturnsBreakdownBar advisoryInsightReturnsBreakdownBar : bars) {
                    float fCoerceIn = RangesKt.coerceIn(advisoryInsightReturnsBreakdownBar.getPercentageChange().floatValue() / fCoerceAtLeast, -1.0f, 1.0f);
                    String formattedPercentageChange = advisoryInsightReturnsBreakdownBar.getFormattedPercentageChange();
                    arrayList.add(new ReturnsBarData(advisoryInsightReturnsBreakdownBar.getSymbol(), formattedPercentageChange, formattedPercentageChange, fCoerceIn, mapBarTypeToColors(advisoryInsightReturnsBreakdownBar.getBarType())));
                }
                ReturnsChart7.ReturnsBarChart(extensions2.toImmutableList(arrayList), SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), false, null, null, false, composerStartRestartGroup, ReturnsBarData.$stable | 196992, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.insights.detail.AdvisoryInsightReturnsChartKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryInsightReturnsChart.AdvisoryInsightReturnsChart$lambda$2(chartModel, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            List<AdvisoryInsightReturnsBreakdownBar> bars2 = chartModel.getReturnsBreakdown().getBars();
            it = bars2.iterator();
            if (it.hasNext()) {
            }
            if (fValueOf == null) {
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bars2, 10));
            while (r3.hasNext()) {
            }
            ReturnsChart7.ReturnsBarChart(extensions2.toImmutableList(arrayList2), SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), false, null, null, false, composerStartRestartGroup, ReturnsBarData.$stable | 196992, 24);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final ReturnsBarColors mapBarTypeToColors(AdvisoryInsightReturnsBreakdownBar.BarType barType) {
        int i = WhenMappings.$EnumSwitchMapping$0[barType.ordinal()];
        if (i == 1) {
            ReturnsChart2 returnsChart2 = ReturnsChart2.LIGHT_SELECTED;
            Tuples2 tuples2M3642to = Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278946574L)), Color.m6701boximpl(Color2.Color(4279478805L)), Color.m6701boximpl(Color2.Color(4280529444L)), Color.m6701boximpl(Color2.Color(4281061932L)), Color.m6701boximpl(Color2.Color(4282638913L)), Color.m6701boximpl(Color2.Color(4284215638L)), Color.m6701boximpl(Color2.Color(4287887459L))}));
            ReturnsChart2 returnsChart22 = ReturnsChart2.DARK_SELECTED;
            return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291297149L)), Color.m6701boximpl(Color2.Color(4287555140L)), Color.m6701boximpl(Color2.Color(4284271897L)), Color.m6701boximpl(Color2.Color(4282360854L)), Color.m6701boximpl(Color2.Color(4280515092L)), Color.m6701boximpl(Color2.Color(4279855119L)), Color.m6701boximpl(Color2.Color(4279456525L)), Color.m6701boximpl(Color2.Color(4278926859L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart2, Color.m6701boximpl(Color2.Color(1726349136))), Tuples4.m3642to(returnsChart22, Color.m6701boximpl(Color2.Color(1305280256)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291027865L)), Color.m6701boximpl(Color2.Color(4283350285L)), Color.m6701boximpl(Color2.Color(4278473220L))})), Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4279478805L)), Color.m6701boximpl(Color2.Color(4282638913L)), Color.m6701boximpl(Color2.Color(4291296941L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4289920844L)), Color.m6701boximpl(Color2.Color(4282619664L)), Color.m6701boximpl(Color2.Color(4278476801L)), Color.m6701boximpl(Color2.Color(4286762270L))})), Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281322295L)), Color.m6701boximpl(Color2.Color(4279478805L)), Color.m6701boximpl(Color2.Color(4283683132L)), Color.m6701boximpl(Color2.Color(4287887459L)), Color.m6701boximpl(Color2.Color(4290314134L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286827560L)), Color.m6701boximpl(Color2.Color(4284393525L)), Color.m6701boximpl(Color2.Color(4279987993L)), Color.m6701boximpl(Color2.Color(4279121676L))})), Tuples4.m3642to(returnsChart2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278946574L)), Color.m6701boximpl(Color2.Color(4280529444L)), Color.m6701boximpl(Color2.Color(4282372669L)), Color.m6701boximpl(Color2.Color(4284215638L)), Color.m6701boximpl(Color2.Color(4287887459L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart22, Color.m6701boximpl(Color2.Color(1718800175))), Tuples4.m3642to(returnsChart2, Color.m6701boximpl(Color2.Color(1723844284)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart2, Color.m6701boximpl(Color2.Color(2155148380L)))));
        }
        if (i == 2) {
            ReturnsChart2 returnsChart23 = ReturnsChart2.LIGHT_SELECTED;
            Tuples2 tuples2M3642to2 = Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294953907L)), Color.m6701boximpl(Color2.Color(4294947213L)), Color.m6701boximpl(Color2.Color(4294944125L)), Color.m6701boximpl(Color2.Color(4294940263L)), Color.m6701boximpl(Color2.Color(4294937946L)), Color.m6701boximpl(Color2.Color(4294935885L)), Color.m6701boximpl(Color2.Color(4294931252L)), Color.m6701boximpl(Color2.Color(4294922240L))}));
            ReturnsChart2 returnsChart24 = ReturnsChart2.DARK_SELECTED;
            return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to2, Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4283505667L)), Color.m6701boximpl(Color2.Color(4286589443L)), Color.m6701boximpl(Color2.Color(4289082626L)), Color.m6701boximpl(Color2.Color(4291575808L)), Color.m6701boximpl(Color2.Color(4292428800L)), Color.m6701boximpl(Color2.Color(4293216256L)), Color.m6701boximpl(Color2.Color(4294922240L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart23, Color.m6701boximpl(Color2.Color(1728046296))), Tuples4.m3642to(returnsChart24, Color.m6701boximpl(Color2.Color(2583652864L)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4286589443L)), Color.m6701boximpl(Color2.Color(4291575808L)), Color.m6701boximpl(Color2.Color(4294929191L))})), Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294938719L)), Color.m6701boximpl(Color2.Color(4294930480L)), Color.m6701boximpl(Color2.Color(4294922240L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4292428800L)), Color.m6701boximpl(Color2.Color(4286589443L)), Color.m6701boximpl(Color2.Color(4291575808L)), Color.m6701boximpl(Color2.Color(4294922240L))})), Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294940263L)), Color.m6701boximpl(Color2.Color(4294922240L)), Color.m6701boximpl(Color2.Color(4294609238L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart24, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4283505667L)), Color.m6701boximpl(Color2.Color(4286130437L)), Color.m6701boximpl(Color2.Color(4288755462L)), Color.m6701boximpl(Color2.Color(4293216256L))})), Tuples4.m3642to(returnsChart23, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4294958541L)), Color.m6701boximpl(Color2.Color(4294940263L)), Color.m6701boximpl(Color2.Color(4294922240L))}))), null, MapsKt.mapOf(Tuples4.m3642to(returnsChart24, Color.m6701boximpl(Color2.Color(1725580802))), Tuples4.m3642to(returnsChart23, Color.m6701boximpl(Color2.Color(1728013856)))), 32, null);
        }
        if (i == 3) {
            ReturnsChart2 returnsChart25 = ReturnsChart2.LIGHT_SELECTED;
            Tuples2 tuples2M3642to3 = Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4289113508L)), Color.m6701boximpl(Color2.Color(4290692539L)), Color.m6701boximpl(Color2.Color(4291218883L)), Color.m6701boximpl(Color2.Color(4291811019L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293520357L)), Color.m6701boximpl(Color2.Color(4293717736L)), Color.m6701boximpl(Color2.Color(4293914859L))}));
            ReturnsChart2 returnsChart26 = ReturnsChart2.DARK_SELECTED;
            return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to3, Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281151528L)), Color.m6701boximpl(Color2.Color(4281744176L)), Color.m6701boximpl(Color2.Color(4282073396L)), Color.m6701boximpl(Color2.Color(4282928960L)), Color.m6701boximpl(Color2.Color(4283850060L)), Color.m6701boximpl(Color2.Color(4284310866L)), Color.m6701boximpl(Color2.Color(4284771672L)), Color.m6701boximpl(Color2.Color(4285100637L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart25, Color.m6701boximpl(Color2.Color(1728053247))), Tuples4.m3642to(returnsChart26, Color.m6701boximpl(Color2.Color(1726145250)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4282336824L)), Color.m6701boximpl(Color2.Color(4281151528L)), Color.m6701boximpl(Color2.Color(4282073396L)), Color.m6701boximpl(Color2.Color(4283850060L)), Color.m6701boximpl(Color2.Color(4284771672L)), Color.m6701boximpl(Color2.Color(4285100637L))})), Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293914859L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4284574038L)), Color.m6701boximpl(Color2.Color(4282138679L)), Color.m6701boximpl(Color2.Color(4285100637L)), Color.m6701boximpl(Color2.Color(4286876795L))})), Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4291876301L)), Color.m6701boximpl(Color2.Color(4293126111L)), Color.m6701boximpl(Color2.Color(4293914859L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart26, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281151528L)), Color.m6701boximpl(Color2.Color(4282336824L)), Color.m6701boximpl(Color2.Color(4283718731L)), Color.m6701boximpl(Color2.Color(4285100637L))})), Tuples4.m3642to(returnsChart25, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4290626747L)), Color.m6701boximpl(Color2.Color(4292337363L)), Color.m6701boximpl(Color2.Color(4293388263L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart26, Color.m6701boximpl(Color2.Color(1714566700))), Tuples4.m3642to(returnsChart25, Color.m6701boximpl(Color2.Color(1723844284)))), null, 64, null);
        }
        if (i == 4) {
            ReturnsChart2 returnsChart27 = ReturnsChart2.LIGHT_SELECTED;
            Tuples2 tuples2M3642to4 = Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291545025L)), Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4293913322L))}));
            ReturnsChart2 returnsChart28 = ReturnsChart2.DARK_SELECTED;
            return new ReturnsBarColors(MapsKt.mapOf(tuples2M3642to4, Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281281066L)), Color.m6701boximpl(Color2.Color(4282399033L)), Color.m6701boximpl(Color2.Color(4285490019L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart27, Color.m6701boximpl(Color2.Color(1305200577))), Tuples4.m3642to(returnsChart28, Color.m6701boximpl(Color2.Color(1306714850)))), MapsKt.mapOf(Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4281281066L)), Color.m6701boximpl(Color2.Color(4285490019L))})), Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291150267L)), Color.m6701boximpl(Color2.Color(4293058266L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4285490019L)), Color.m6701boximpl(Color2.Color(4288123024L)), Color.m6701boximpl(Color2.Color(4288123024L))})), Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4291545025L))}))), MapsKt.mapOf(Tuples4.m3642to(returnsChart28, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4282399033L)), Color.m6701boximpl(Color2.Color(4285490019L)), Color.m6701boximpl(Color2.Color(4288123024L))})), Tuples4.m3642to(returnsChart27, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4291545025L)), Color.m6701boximpl(Color2.Color(4292794578L)), Color.m6701boximpl(Color2.Color(4293913322L))}))), null, null, 96, null);
        }
        return new ReturnsBarColors(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), null, null, null, 112, null);
    }
}
