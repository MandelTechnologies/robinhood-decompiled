package com.robinhood.android.advancedchart.config;

import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvancedChartEditIndicatorViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u001a\u001a\u00020\u001bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JG\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorViewState;", "", "attributeList", "", "Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute;", "indicatorStates", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "technicalIndicatorType", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "resultEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/advancedchart/config/Result;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;Lcom/robinhood/udf/UiEvent;)V", "getAttributeList", "()Ljava/util/List;", "getIndicatorStates", "getTechnicalIndicatorType", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "getResultEvent", "()Lcom/robinhood/udf/UiEvent;", "getUpdatedConfig", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "launchMode", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "getDeletedConfig", "deletedIndicatorId", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AdvancedChartEditIndicatorViewState {
    public static final int $stable = 8;
    private final List<TechnicalIndicatorConfigAttribute> attributeList;
    private final List<IndicatorState> indicatorStates;
    private final UiEvent<AdvancedChartEditIndicatorViewState2> resultEvent;
    private final ApiTechnicalIndicator.Type technicalIndicatorType;

    public AdvancedChartEditIndicatorViewState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedChartEditIndicatorViewState copy$default(AdvancedChartEditIndicatorViewState advancedChartEditIndicatorViewState, List list, List list2, ApiTechnicalIndicator.Type type2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            list = advancedChartEditIndicatorViewState.attributeList;
        }
        if ((i & 2) != 0) {
            list2 = advancedChartEditIndicatorViewState.indicatorStates;
        }
        if ((i & 4) != 0) {
            type2 = advancedChartEditIndicatorViewState.technicalIndicatorType;
        }
        if ((i & 8) != 0) {
            uiEvent = advancedChartEditIndicatorViewState.resultEvent;
        }
        return advancedChartEditIndicatorViewState.copy(list, list2, type2, uiEvent);
    }

    public final List<TechnicalIndicatorConfigAttribute> component1() {
        return this.attributeList;
    }

    public final List<IndicatorState> component2() {
        return this.indicatorStates;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiTechnicalIndicator.Type getTechnicalIndicatorType() {
        return this.technicalIndicatorType;
    }

    public final UiEvent<AdvancedChartEditIndicatorViewState2> component4() {
        return this.resultEvent;
    }

    public final AdvancedChartEditIndicatorViewState copy(List<TechnicalIndicatorConfigAttribute> attributeList, List<IndicatorState> indicatorStates, ApiTechnicalIndicator.Type technicalIndicatorType, UiEvent<AdvancedChartEditIndicatorViewState2> resultEvent) {
        Intrinsics.checkNotNullParameter(attributeList, "attributeList");
        Intrinsics.checkNotNullParameter(technicalIndicatorType, "technicalIndicatorType");
        return new AdvancedChartEditIndicatorViewState(attributeList, indicatorStates, technicalIndicatorType, resultEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedChartEditIndicatorViewState)) {
            return false;
        }
        AdvancedChartEditIndicatorViewState advancedChartEditIndicatorViewState = (AdvancedChartEditIndicatorViewState) other;
        return Intrinsics.areEqual(this.attributeList, advancedChartEditIndicatorViewState.attributeList) && Intrinsics.areEqual(this.indicatorStates, advancedChartEditIndicatorViewState.indicatorStates) && this.technicalIndicatorType == advancedChartEditIndicatorViewState.technicalIndicatorType && Intrinsics.areEqual(this.resultEvent, advancedChartEditIndicatorViewState.resultEvent);
    }

    public int hashCode() {
        int iHashCode = this.attributeList.hashCode() * 31;
        List<IndicatorState> list = this.indicatorStates;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.technicalIndicatorType.hashCode()) * 31;
        UiEvent<AdvancedChartEditIndicatorViewState2> uiEvent = this.resultEvent;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "AdvancedChartEditIndicatorViewState(attributeList=" + this.attributeList + ", indicatorStates=" + this.indicatorStates + ", technicalIndicatorType=" + this.technicalIndicatorType + ", resultEvent=" + this.resultEvent + ")";
    }

    public AdvancedChartEditIndicatorViewState(List<TechnicalIndicatorConfigAttribute> attributeList, List<IndicatorState> list, ApiTechnicalIndicator.Type technicalIndicatorType, UiEvent<AdvancedChartEditIndicatorViewState2> uiEvent) {
        Intrinsics.checkNotNullParameter(attributeList, "attributeList");
        Intrinsics.checkNotNullParameter(technicalIndicatorType, "technicalIndicatorType");
        this.attributeList = attributeList;
        this.indicatorStates = list;
        this.technicalIndicatorType = technicalIndicatorType;
        this.resultEvent = uiEvent;
    }

    public /* synthetic */ AdvancedChartEditIndicatorViewState(List list, List list2, ApiTechnicalIndicator.Type type2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? ApiTechnicalIndicator.Type.UNKNOWN : type2, (i & 8) != 0 ? null : uiEvent);
    }

    public final List<TechnicalIndicatorConfigAttribute> getAttributeList() {
        return this.attributeList;
    }

    public final List<IndicatorState> getIndicatorStates() {
        return this.indicatorStates;
    }

    public final ApiTechnicalIndicator.Type getTechnicalIndicatorType() {
        return this.technicalIndicatorType;
    }

    public final UiEvent<AdvancedChartEditIndicatorViewState2> getResultEvent() {
        return this.resultEvent;
    }

    public final List<ApiTechnicalIndicator> getUpdatedConfig(AdvancedChartEditIndicatorLaunchMode launchMode) {
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        ApiTechnicalIndicator apiTechnicalIndicator = TechnicalIndicatorConfigAttribute2.toApiTechnicalIndicator(this.attributeList, this.technicalIndicatorType);
        List<IndicatorState> list = this.indicatorStates;
        if (list == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            List<IndicatorState> list2 = list;
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(((IndicatorState) it.next()).getApiTechnicalIndicator());
            }
        }
        List<ApiTechnicalIndicator> mutableList = CollectionsKt.toMutableList(collectionEmptyList);
        if (launchMode instanceof AdvancedChartEditIndicatorLaunchMode.Adding) {
            mutableList.add(apiTechnicalIndicator);
            return mutableList;
        }
        if (!(launchMode instanceof AdvancedChartEditIndicatorLaunchMode.Editing)) {
            throw new NoWhenBranchMatchedException();
        }
        String id = ((AdvancedChartEditIndicatorLaunchMode.Editing) launchMode).getApiTechnicalIndicator().getId();
        Iterator<ApiTechnicalIndicator> it2 = mutableList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it2.next().getId(), id)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            mutableList.set(i, apiTechnicalIndicator);
        }
        return mutableList;
    }

    public final List<ApiTechnicalIndicator> getDeletedConfig(final String deletedIndicatorId) {
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(deletedIndicatorId, "deletedIndicatorId");
        List<IndicatorState> list = this.indicatorStates;
        if (list == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            List<IndicatorState> list2 = list;
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                collectionEmptyList.add(((IndicatorState) it.next()).getApiTechnicalIndicator());
            }
        }
        List<ApiTechnicalIndicator> mutableList = CollectionsKt.toMutableList(collectionEmptyList);
        CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AdvancedChartEditIndicatorViewState.getDeletedConfig$lambda$3(deletedIndicatorId, (ApiTechnicalIndicator) obj));
            }
        });
        return mutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeletedConfig$lambda$3(String str, ApiTechnicalIndicator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getId(), str);
    }
}
