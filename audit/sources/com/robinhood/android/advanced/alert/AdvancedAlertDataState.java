package com.robinhood.android.advanced.alert;

import com.robinhood.android.advanced.chart.IndicatorStateList;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJP\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;", "", "advancedAlert", "Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "activeAlertType", "Lcom/robinhood/android/advanced/alert/AlertType;", "isAppNotificationEnabled", "", "indicatorStateList", "Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "maximumFractionDigits", "", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;Lcom/robinhood/android/advanced/alert/AlertType;ZLcom/robinhood/android/advanced/chart/IndicatorStateList;Ljava/lang/Integer;)V", "getAdvancedAlert", "()Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "getUiResource", "()Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "getActiveAlertType", "()Lcom/robinhood/android/advanced/alert/AlertType;", "()Z", "getIndicatorStateList", "()Lcom/robinhood/android/advanced/chart/IndicatorStateList;", "getMaximumFractionDigits", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;Lcom/robinhood/android/advanced/alert/AlertType;ZLcom/robinhood/android/advanced/chart/IndicatorStateList;Ljava/lang/Integer;)Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;", "equals", "other", "hashCode", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AdvancedAlertDataState {
    public static final int $stable = 8;
    private final AlertType activeAlertType;
    private final AdvancedAlert advancedAlert;
    private final IndicatorStateList indicatorStateList;
    private final boolean isAppNotificationEnabled;
    private final Integer maximumFractionDigits;
    private final AlertHubUiResources uiResource;

    public static /* synthetic */ AdvancedAlertDataState copy$default(AdvancedAlertDataState advancedAlertDataState, AdvancedAlert advancedAlert, AlertHubUiResources alertHubUiResources, AlertType alertType, boolean z, IndicatorStateList indicatorState5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            advancedAlert = advancedAlertDataState.advancedAlert;
        }
        if ((i & 2) != 0) {
            alertHubUiResources = advancedAlertDataState.uiResource;
        }
        if ((i & 4) != 0) {
            alertType = advancedAlertDataState.activeAlertType;
        }
        if ((i & 8) != 0) {
            z = advancedAlertDataState.isAppNotificationEnabled;
        }
        if ((i & 16) != 0) {
            indicatorState5 = advancedAlertDataState.indicatorStateList;
        }
        if ((i & 32) != 0) {
            num = advancedAlertDataState.maximumFractionDigits;
        }
        IndicatorStateList indicatorState52 = indicatorState5;
        Integer num2 = num;
        return advancedAlertDataState.copy(advancedAlert, alertHubUiResources, alertType, z, indicatorState52, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final AdvancedAlert getAdvancedAlert() {
        return this.advancedAlert;
    }

    /* renamed from: component2, reason: from getter */
    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }

    /* renamed from: component3, reason: from getter */
    public final AlertType getActiveAlertType() {
        return this.activeAlertType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAppNotificationEnabled() {
        return this.isAppNotificationEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final IndicatorStateList getIndicatorStateList() {
        return this.indicatorStateList;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }

    public final AdvancedAlertDataState copy(AdvancedAlert advancedAlert, AlertHubUiResources uiResource, AlertType activeAlertType, boolean isAppNotificationEnabled, IndicatorStateList indicatorStateList, Integer maximumFractionDigits) {
        Intrinsics.checkNotNullParameter(activeAlertType, "activeAlertType");
        Intrinsics.checkNotNullParameter(indicatorStateList, "indicatorStateList");
        return new AdvancedAlertDataState(advancedAlert, uiResource, activeAlertType, isAppNotificationEnabled, indicatorStateList, maximumFractionDigits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedAlertDataState)) {
            return false;
        }
        AdvancedAlertDataState advancedAlertDataState = (AdvancedAlertDataState) other;
        return Intrinsics.areEqual(this.advancedAlert, advancedAlertDataState.advancedAlert) && Intrinsics.areEqual(this.uiResource, advancedAlertDataState.uiResource) && this.activeAlertType == advancedAlertDataState.activeAlertType && this.isAppNotificationEnabled == advancedAlertDataState.isAppNotificationEnabled && Intrinsics.areEqual(this.indicatorStateList, advancedAlertDataState.indicatorStateList) && Intrinsics.areEqual(this.maximumFractionDigits, advancedAlertDataState.maximumFractionDigits);
    }

    public int hashCode() {
        AdvancedAlert advancedAlert = this.advancedAlert;
        int iHashCode = (advancedAlert == null ? 0 : advancedAlert.hashCode()) * 31;
        AlertHubUiResources alertHubUiResources = this.uiResource;
        int iHashCode2 = (((((((iHashCode + (alertHubUiResources == null ? 0 : alertHubUiResources.hashCode())) * 31) + this.activeAlertType.hashCode()) * 31) + Boolean.hashCode(this.isAppNotificationEnabled)) * 31) + this.indicatorStateList.hashCode()) * 31;
        Integer num = this.maximumFractionDigits;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AdvancedAlertDataState(advancedAlert=" + this.advancedAlert + ", uiResource=" + this.uiResource + ", activeAlertType=" + this.activeAlertType + ", isAppNotificationEnabled=" + this.isAppNotificationEnabled + ", indicatorStateList=" + this.indicatorStateList + ", maximumFractionDigits=" + this.maximumFractionDigits + ")";
    }

    public AdvancedAlertDataState(AdvancedAlert advancedAlert, AlertHubUiResources alertHubUiResources, AlertType activeAlertType, boolean z, IndicatorStateList indicatorStateList, Integer num) {
        Intrinsics.checkNotNullParameter(activeAlertType, "activeAlertType");
        Intrinsics.checkNotNullParameter(indicatorStateList, "indicatorStateList");
        this.advancedAlert = advancedAlert;
        this.uiResource = alertHubUiResources;
        this.activeAlertType = activeAlertType;
        this.isAppNotificationEnabled = z;
        this.indicatorStateList = indicatorStateList;
        this.maximumFractionDigits = num;
    }

    public final AdvancedAlert getAdvancedAlert() {
        return this.advancedAlert;
    }

    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }

    public final AlertType getActiveAlertType() {
        return this.activeAlertType;
    }

    public final boolean isAppNotificationEnabled() {
        return this.isAppNotificationEnabled;
    }

    public /* synthetic */ AdvancedAlertDataState(AdvancedAlert advancedAlert, AlertHubUiResources alertHubUiResources, AlertType alertType, boolean z, IndicatorStateList indicatorState5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advancedAlert, (i & 2) != 0 ? null : alertHubUiResources, alertType, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new IndicatorStateList(CollectionsKt.emptyList(), 0L) : indicatorState5, (i & 32) != 0 ? null : num);
    }

    public final IndicatorStateList getIndicatorStateList() {
        return this.indicatorStateList;
    }

    public final Integer getMaximumFractionDigits() {
        return this.maximumFractionDigits;
    }
}
