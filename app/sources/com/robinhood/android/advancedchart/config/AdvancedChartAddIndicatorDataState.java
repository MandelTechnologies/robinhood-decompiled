package com.robinhood.android.advancedchart.config;

import com.robinhood.android.advanced.chart.AdvancedChartExperiments;
import com.robinhood.android.advanced.chart.IndicatorTypes;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.p386db.SupportedIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfig;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvancedChartAddIndicatorViewState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00030\u001eH\u0002J\f\u0010$\u001a\u00020\u001b*\u00020%H\u0002J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J;\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u001f\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDataState;", "", "supportedIndicators", "", "Lcom/robinhood/shared/models/advancedChart/db/SupportedIndicator;", "configList", "Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfigList;", "selectedIndicatorType", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "indicatorListVariant", "Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP4$Variant;", "<init>", "(Ljava/util/List;Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfigList;Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP4$Variant;)V", "getSupportedIndicators", "()Ljava/util/List;", "getConfigList", "()Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfigList;", "getSelectedIndicatorType", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "getIndicatorListVariant", "()Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP4$Variant;", "clientSupportedIndicatorTypeList", "getClientSupportedIndicatorTypeList", "finalizedList", "Lcom/robinhood/android/advancedchart/config/IndicatorTypeListItem;", "getFinalizedList", "getPrimaryItemText", "Lcom/robinhood/utils/resource/StringResource;", "type", "typeMap", "", "Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfig;", "dialogErrorData", "Lkotlin/Pair;", "getDialogErrorData", "()Lkotlin/Pair;", "getDisplayText", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AdvancedChartAddIndicatorDataState {
    public static final int $stable = 8;
    private final List<ApiTechnicalIndicator.Type> clientSupportedIndicatorTypeList;
    private final TechnicalIndicatorConfigList configList;
    private final Tuples2<StringResource, StringResource> dialogErrorData;
    private final List<IndicatorTypeListItem> finalizedList;
    private final AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant indicatorListVariant;
    private final ApiTechnicalIndicator.Type selectedIndicatorType;
    private final List<SupportedIndicator> supportedIndicators;

    public AdvancedChartAddIndicatorDataState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedChartAddIndicatorDataState copy$default(AdvancedChartAddIndicatorDataState advancedChartAddIndicatorDataState, List list, TechnicalIndicatorConfigList technicalIndicatorConfigList, ApiTechnicalIndicator.Type type2, AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            list = advancedChartAddIndicatorDataState.supportedIndicators;
        }
        if ((i & 2) != 0) {
            technicalIndicatorConfigList = advancedChartAddIndicatorDataState.configList;
        }
        if ((i & 4) != 0) {
            type2 = advancedChartAddIndicatorDataState.selectedIndicatorType;
        }
        if ((i & 8) != 0) {
            variant = advancedChartAddIndicatorDataState.indicatorListVariant;
        }
        return advancedChartAddIndicatorDataState.copy(list, technicalIndicatorConfigList, type2, variant);
    }

    public final List<SupportedIndicator> component1() {
        return this.supportedIndicators;
    }

    /* renamed from: component2, reason: from getter */
    public final TechnicalIndicatorConfigList getConfigList() {
        return this.configList;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiTechnicalIndicator.Type getSelectedIndicatorType() {
        return this.selectedIndicatorType;
    }

    /* renamed from: component4, reason: from getter */
    public final AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant getIndicatorListVariant() {
        return this.indicatorListVariant;
    }

    public final AdvancedChartAddIndicatorDataState copy(List<SupportedIndicator> supportedIndicators, TechnicalIndicatorConfigList configList, ApiTechnicalIndicator.Type selectedIndicatorType, AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant indicatorListVariant) {
        Intrinsics.checkNotNullParameter(supportedIndicators, "supportedIndicators");
        Intrinsics.checkNotNullParameter(indicatorListVariant, "indicatorListVariant");
        return new AdvancedChartAddIndicatorDataState(supportedIndicators, configList, selectedIndicatorType, indicatorListVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedChartAddIndicatorDataState)) {
            return false;
        }
        AdvancedChartAddIndicatorDataState advancedChartAddIndicatorDataState = (AdvancedChartAddIndicatorDataState) other;
        return Intrinsics.areEqual(this.supportedIndicators, advancedChartAddIndicatorDataState.supportedIndicators) && Intrinsics.areEqual(this.configList, advancedChartAddIndicatorDataState.configList) && this.selectedIndicatorType == advancedChartAddIndicatorDataState.selectedIndicatorType && this.indicatorListVariant == advancedChartAddIndicatorDataState.indicatorListVariant;
    }

    public int hashCode() {
        int iHashCode = this.supportedIndicators.hashCode() * 31;
        TechnicalIndicatorConfigList technicalIndicatorConfigList = this.configList;
        int iHashCode2 = (iHashCode + (technicalIndicatorConfigList == null ? 0 : technicalIndicatorConfigList.hashCode())) * 31;
        ApiTechnicalIndicator.Type type2 = this.selectedIndicatorType;
        return ((iHashCode2 + (type2 != null ? type2.hashCode() : 0)) * 31) + this.indicatorListVariant.hashCode();
    }

    public String toString() {
        return "AdvancedChartAddIndicatorDataState(supportedIndicators=" + this.supportedIndicators + ", configList=" + this.configList + ", selectedIndicatorType=" + this.selectedIndicatorType + ", indicatorListVariant=" + this.indicatorListVariant + ")";
    }

    public AdvancedChartAddIndicatorDataState(List<SupportedIndicator> supportedIndicators, TechnicalIndicatorConfigList technicalIndicatorConfigList, ApiTechnicalIndicator.Type type2, AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant indicatorListVariant) {
        Map<ApiTechnicalIndicator.Type, ? extends List<TechnicalIndicatorConfig>> mapEmptyMap;
        Integer numValueOf;
        List<TechnicalIndicatorConfig> technicalIndicatorConfigs;
        List<TechnicalIndicatorConfig> technicalIndicatorConfigs2;
        Intrinsics.checkNotNullParameter(supportedIndicators, "supportedIndicators");
        Intrinsics.checkNotNullParameter(indicatorListVariant, "indicatorListVariant");
        this.supportedIndicators = supportedIndicators;
        this.configList = technicalIndicatorConfigList;
        this.selectedIndicatorType = type2;
        this.indicatorListVariant = indicatorListVariant;
        this.clientSupportedIndicatorTypeList = CollectionsKt.listOf((Object[]) new ApiTechnicalIndicator.Type[]{ApiTechnicalIndicator.Type.SMA, ApiTechnicalIndicator.Type.EMA, ApiTechnicalIndicator.Type.BOLL, ApiTechnicalIndicator.Type.VWAP, ApiTechnicalIndicator.Type.RSI, ApiTechnicalIndicator.Type.MACD});
        List<SupportedIndicator> list = supportedIndicators;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SupportedIndicator) it.next()).getIndicatorType());
        }
        TechnicalIndicatorConfigList technicalIndicatorConfigList2 = this.configList;
        Tuples2<StringResource, StringResource> tuples2M3642to = null;
        if (technicalIndicatorConfigList2 == null || (technicalIndicatorConfigs2 = technicalIndicatorConfigList2.getTechnicalIndicatorConfigs()) == null) {
            mapEmptyMap = null;
        } else {
            mapEmptyMap = new LinkedHashMap<>();
            for (Object obj : technicalIndicatorConfigs2) {
                ApiTechnicalIndicator.Type type3 = ((TechnicalIndicatorConfig) obj).getApiTechnicalIndicator().getType();
                List arrayList2 = mapEmptyMap.get(type3);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    mapEmptyMap.put(type3, arrayList2);
                }
                arrayList2.add(obj);
            }
        }
        mapEmptyMap = mapEmptyMap == null ? MapsKt.emptyMap() : mapEmptyMap;
        List<ApiTechnicalIndicator.Type> list2 = this.clientSupportedIndicatorTypeList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (arrayList.contains((ApiTechnicalIndicator.Type) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<ApiTechnicalIndicator.Type> arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            ApiTechnicalIndicator.Type type4 = (ApiTechnicalIndicator.Type) obj3;
            if (!this.indicatorListVariant.isInExperiment() || mapEmptyMap.getOrDefault(type4, CollectionsKt.emptyList()).size() < type4.getMaximumInstance()) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (ApiTechnicalIndicator.Type type5 : arrayList4) {
            arrayList5.add(new IndicatorTypeListItem(type5, getPrimaryItemText(type5, mapEmptyMap), StringResource.INSTANCE.invoke(IndicatorTypes.getFullNameResId(type5), new Object[0])));
        }
        this.finalizedList = arrayList5;
        TechnicalIndicatorConfigList technicalIndicatorConfigList3 = this.configList;
        if (technicalIndicatorConfigList3 == null || (technicalIndicatorConfigs = technicalIndicatorConfigList3.getTechnicalIndicatorConfigs()) == null) {
            numValueOf = null;
        } else {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : technicalIndicatorConfigs) {
                if (((TechnicalIndicatorConfig) obj4).getApiTechnicalIndicator().getType() == this.selectedIndicatorType) {
                    arrayList6.add(obj4);
                }
            }
            numValueOf = Integer.valueOf(arrayList6.size());
        }
        ApiTechnicalIndicator.Type type6 = this.selectedIndicatorType;
        if (type6 != null) {
            int maximumInstance = type6.getMaximumInstance();
            if (numValueOf != null && numValueOf.intValue() == maximumInstance) {
                StringResource.Companion companion = StringResource.INSTANCE;
                StringResource stringResourceInvoke = companion.invoke(IndicatorTypes.getAbbreviationResId(this.selectedIndicatorType), new Object[0]);
                tuples2M3642to = this.selectedIndicatorType.getMaximumInstance() == 1 ? Tuples4.m3642to(companion.invoke(C8502R.string.advanced_chart_error_single_ti_title, stringResourceInvoke), companion.invoke(C8502R.string.advanced_chart_error_single_ti_message, new Object[0])) : Tuples4.m3642to(companion.invoke(C8502R.string.advanced_chart_error_max_ti_title, Integer.valueOf(this.selectedIndicatorType.getMaximumInstance()), stringResourceInvoke), companion.invoke(C8502R.string.advanced_chart_error_max_ti_message, stringResourceInvoke));
            }
        }
        this.dialogErrorData = tuples2M3642to;
    }

    public /* synthetic */ AdvancedChartAddIndicatorDataState(List list, TechnicalIndicatorConfigList technicalIndicatorConfigList, ApiTechnicalIndicator.Type type2, AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant variant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : technicalIndicatorConfigList, (i & 4) != 0 ? null : type2, (i & 8) != 0 ? AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant.CONTROL : variant);
    }

    public final List<SupportedIndicator> getSupportedIndicators() {
        return this.supportedIndicators;
    }

    public final TechnicalIndicatorConfigList getConfigList() {
        return this.configList;
    }

    public final ApiTechnicalIndicator.Type getSelectedIndicatorType() {
        return this.selectedIndicatorType;
    }

    public final AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant getIndicatorListVariant() {
        return this.indicatorListVariant;
    }

    public final List<ApiTechnicalIndicator.Type> getClientSupportedIndicatorTypeList() {
        return this.clientSupportedIndicatorTypeList;
    }

    public final List<IndicatorTypeListItem> getFinalizedList() {
        return this.finalizedList;
    }

    private final StringResource getPrimaryItemText(ApiTechnicalIndicator.Type type2, Map<ApiTechnicalIndicator.Type, ? extends List<TechnicalIndicatorConfig>> typeMap) {
        List listEmptyList;
        List<TechnicalIndicatorConfig> list = typeMap.get(type2);
        if (list != null) {
            List<TechnicalIndicatorConfig> list2 = list;
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                listEmptyList.add(getDisplayText(((TechnicalIndicatorConfig) it.next()).getApiTechnicalIndicator()));
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (this.indicatorListVariant == AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant.REMOVE_ROWS_ADD_HINT && !listEmptyList.isEmpty()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return companion.invoke(C8502R.string.advanced_chart_add_indicator_title_with_indicators, companion.invoke(IndicatorTypes.getAbbreviationResId(type2), new Object[0]), new StringResource.Join(listEmptyList, ", "));
        }
        return StringResource.INSTANCE.invoke(IndicatorTypes.getAbbreviationResId(type2), new Object[0]);
    }

    public final Tuples2<StringResource, StringResource> getDialogErrorData() {
        return this.dialogErrorData;
    }

    private final StringResource getDisplayText(ApiTechnicalIndicator apiTechnicalIndicator) {
        String strValueOf;
        int abbreviationResId = IndicatorTypes.getAbbreviationResId(apiTechnicalIndicator.getType());
        if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) {
            strValueOf = String.valueOf(((ApiTechnicalIndicator.ApiSimpleMovingAverage) apiTechnicalIndicator).getPeriod());
        } else if (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) {
            strValueOf = String.valueOf(((ApiTechnicalIndicator.ApiExponentialMovingAverage) apiTechnicalIndicator).getPeriod());
        } else {
            if (!(apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) && !(apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice) && !(apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) && !(apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiBollingerBands) && !(apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiUnknownTechnicalIndicator)) {
                throw new NoWhenBranchMatchedException();
            }
            strValueOf = "";
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{companion.invoke(abbreviationResId, new Object[0]), companion.invoke(strValueOf)}), "");
    }
}
