package com.robinhood.android.advanced.alert.alerthub;

import com.robinhood.android.advanced.chart.IndicatorStateList;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubIndicatorListViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListViewState;", "", "disclosureContentfulId", "", "indicatorStateList", "Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/advanced/chart/IndicatorStateList;Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;)V", "getDisclosureContentfulId", "()Ljava/lang/String;", "getIndicatorStateList", "()Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "getUiResource", "()Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AlertHubIndicatorListViewState {
    public static final int $stable = 8;
    private final String disclosureContentfulId;
    private final IndicatorStateList indicatorStateList;
    private final AlertHubUiResources uiResource;

    public AlertHubIndicatorListViewState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AlertHubIndicatorListViewState copy$default(AlertHubIndicatorListViewState alertHubIndicatorListViewState, String str, IndicatorStateList indicatorStateList, AlertHubUiResources alertHubUiResources, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertHubIndicatorListViewState.disclosureContentfulId;
        }
        if ((i & 2) != 0) {
            indicatorStateList = alertHubIndicatorListViewState.indicatorStateList;
        }
        if ((i & 4) != 0) {
            alertHubUiResources = alertHubIndicatorListViewState.uiResource;
        }
        return alertHubIndicatorListViewState.copy(str, indicatorStateList, alertHubUiResources);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisclosureContentfulId() {
        return this.disclosureContentfulId;
    }

    /* renamed from: component2, reason: from getter */
    public final IndicatorStateList getIndicatorStateList() {
        return this.indicatorStateList;
    }

    /* renamed from: component3, reason: from getter */
    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }

    public final AlertHubIndicatorListViewState copy(String disclosureContentfulId, IndicatorStateList indicatorStateList, AlertHubUiResources uiResource) {
        Intrinsics.checkNotNullParameter(indicatorStateList, "indicatorStateList");
        return new AlertHubIndicatorListViewState(disclosureContentfulId, indicatorStateList, uiResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertHubIndicatorListViewState)) {
            return false;
        }
        AlertHubIndicatorListViewState alertHubIndicatorListViewState = (AlertHubIndicatorListViewState) other;
        return Intrinsics.areEqual(this.disclosureContentfulId, alertHubIndicatorListViewState.disclosureContentfulId) && Intrinsics.areEqual(this.indicatorStateList, alertHubIndicatorListViewState.indicatorStateList) && Intrinsics.areEqual(this.uiResource, alertHubIndicatorListViewState.uiResource);
    }

    public int hashCode() {
        String str = this.disclosureContentfulId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.indicatorStateList.hashCode()) * 31;
        AlertHubUiResources alertHubUiResources = this.uiResource;
        return iHashCode + (alertHubUiResources != null ? alertHubUiResources.hashCode() : 0);
    }

    public String toString() {
        return "AlertHubIndicatorListViewState(disclosureContentfulId=" + this.disclosureContentfulId + ", indicatorStateList=" + this.indicatorStateList + ", uiResource=" + this.uiResource + ")";
    }

    public AlertHubIndicatorListViewState(String str, IndicatorStateList indicatorStateList, AlertHubUiResources alertHubUiResources) {
        Intrinsics.checkNotNullParameter(indicatorStateList, "indicatorStateList");
        this.disclosureContentfulId = str;
        this.indicatorStateList = indicatorStateList;
        this.uiResource = alertHubUiResources;
    }

    public final String getDisclosureContentfulId() {
        return this.disclosureContentfulId;
    }

    public /* synthetic */ AlertHubIndicatorListViewState(String str, IndicatorStateList indicatorStateList, AlertHubUiResources alertHubUiResources, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new IndicatorStateList(CollectionsKt.emptyList(), 0L) : indicatorStateList, (i & 4) != 0 ? null : alertHubUiResources);
    }

    public final IndicatorStateList getIndicatorStateList() {
        return this.indicatorStateList;
    }

    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }
}
