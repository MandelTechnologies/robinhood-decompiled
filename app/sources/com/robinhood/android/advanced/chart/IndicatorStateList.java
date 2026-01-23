package com.robinhood.android.advanced.chart;

import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndicatorState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "", "indicatorStates", "", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "timestamp", "", "<init>", "(Ljava/util/List;J)V", "getIndicatorStates", "()Ljava/util/List;", "getTimestamp", "()J", "getNewIndicatorStateListWith", "technicalIndicatorConfigList", "Lcom/robinhood/shared/models/advancedChart/db/TechnicalIndicatorConfigList;", "getPreselectIndicatorList", "preselectedList", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class IndicatorStateList {
    private final List<IndicatorState> indicatorStates;
    private final long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndicatorStateList copy$default(IndicatorStateList indicatorStateList, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = indicatorStateList.indicatorStates;
        }
        if ((i & 2) != 0) {
            j = indicatorStateList.timestamp;
        }
        return indicatorStateList.copy(list, j);
    }

    public final List<IndicatorState> component1() {
        return this.indicatorStates;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final IndicatorStateList copy(List<IndicatorState> indicatorStates, long timestamp) {
        Intrinsics.checkNotNullParameter(indicatorStates, "indicatorStates");
        return new IndicatorStateList(indicatorStates, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorStateList)) {
            return false;
        }
        IndicatorStateList indicatorStateList = (IndicatorStateList) other;
        return Intrinsics.areEqual(this.indicatorStates, indicatorStateList.indicatorStates) && this.timestamp == indicatorStateList.timestamp;
    }

    public int hashCode() {
        return (this.indicatorStates.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "IndicatorStateList(indicatorStates=" + this.indicatorStates + ", timestamp=" + this.timestamp + ")";
    }

    public IndicatorStateList(List<IndicatorState> indicatorStates, long j) {
        Intrinsics.checkNotNullParameter(indicatorStates, "indicatorStates");
        this.indicatorStates = indicatorStates;
        this.timestamp = j;
    }

    public final List<IndicatorState> getIndicatorStates() {
        return this.indicatorStates;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final IndicatorStateList getNewIndicatorStateListWith(TechnicalIndicatorConfigList technicalIndicatorConfigList) {
        Intrinsics.checkNotNullParameter(technicalIndicatorConfigList, "technicalIndicatorConfigList");
        return technicalIndicatorConfigList.getTimestamp() > this.timestamp ? new IndicatorStateList(IndicatorState4.toIndicatorStates(technicalIndicatorConfigList.getTechnicalIndicatorConfigs()), technicalIndicatorConfigList.getTimestamp()) : this;
    }

    public final List<IndicatorState> getPreselectIndicatorList(List<? extends ApiTechnicalIndicator> preselectedList) {
        if (preselectedList == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (IndicatorState indicatorState : this.indicatorStates) {
            Iterator<T> it = preselectedList.iterator();
            while (it.hasNext()) {
                if (ApiTechnicalIndicator2.isTheSameIndicatorFromDeeplink(indicatorState.getApiTechnicalIndicator(), (ApiTechnicalIndicator) it.next()) && !Intrinsics.areEqual(indicatorState.getSelected(), Boolean.TRUE)) {
                    arrayList.add(indicatorState);
                }
            }
        }
        return arrayList;
    }
}
