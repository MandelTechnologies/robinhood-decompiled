package com.robinhood.android.advanced.chart;

import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndicatorState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"toIndicatorStates", "", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfig;", "toIndicatorConfigs", "feature-lib-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advanced.chart.IndicatorStateKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class IndicatorState4 {

    /* compiled from: IndicatorState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.chart.IndicatorStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTechnicalIndicator.Type.values().length];
            try {
                iArr[ApiTechnicalIndicator.Type.SMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.EMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.VWAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.BOLL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.MACD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.RSI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.DEPTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.ORDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTechnicalIndicator.Type.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<IndicatorState> toIndicatorStates(List<TechnicalIndicatorConfig> list) {
        List listListOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<TechnicalIndicatorConfig> list2 = list;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : list2) {
            ApiTechnicalIndicator.Type type2 = ((TechnicalIndicatorConfig) obj).getApiTechnicalIndicator().getType();
            Object arrayList = linkedHashMap2.get(type2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(type2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList<Tuples2> arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((ApiTechnicalIndicator.Type) entry.getKey()).ordinal()]) {
                case 1:
                    listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.f5844C1, Color.f5845C2, Color.f5846C3});
                    break;
                case 2:
                    listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.f5847C4, Color.f5848C5, Color.f5849C6});
                    break;
                case 3:
                    listListOf = CollectionsKt.listOf(Color.f5850C7);
                    break;
                case 4:
                    listListOf = CollectionsKt.listOf(Color.C13);
                    break;
                case 5:
                    listListOf = CollectionsKt.listOf(Color.C11);
                    break;
                case 6:
                    listListOf = CollectionsKt.listOf(Color.C12);
                    break;
                case 7:
                case 8:
                case 9:
                    listListOf = CollectionsKt.listOf(Color.f5844C1);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            CollectionsKt.addAll(arrayList2, CollectionsKt.zip((Iterable) entry.getValue(), listListOf));
        }
        for (Tuples2 tuples2 : arrayList2) {
            linkedHashMap.put(((TechnicalIndicatorConfig) tuples2.getFirst()).getApiTechnicalIndicator().getId(), tuples2.getSecond());
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (TechnicalIndicatorConfig technicalIndicatorConfig : list2) {
            Color color = (Color) linkedHashMap.get(technicalIndicatorConfig.getApiTechnicalIndicator().getId());
            if (color == null) {
                color = Color.f5844C1;
            }
            arrayList3.add(new IndicatorState(color, IndicatorState3.SETTINGS, technicalIndicatorConfig.getApiTechnicalIndicator(), technicalIndicatorConfig.getTitle()));
        }
        return arrayList3;
    }

    public static final List<TechnicalIndicatorConfig> toIndicatorConfigs(List<IndicatorState> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<IndicatorState> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (IndicatorState indicatorState : list2) {
            arrayList.add(new TechnicalIndicatorConfig(indicatorState.getApiTechnicalIndicator(), indicatorState.getFullTitle()));
        }
        return arrayList;
    }
}
