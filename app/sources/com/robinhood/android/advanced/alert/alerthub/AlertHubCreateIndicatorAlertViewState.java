package com.robinhood.android.advanced.alert.alerthub;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubCreateIndicatorAlertViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000256Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010.\u001a\u00020\u0012HÆ\u0003Jm\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertViewState;", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "dismissEvent", "Lcom/robinhood/udf/UiEvent;", "", "errorEvent", "", "isLoading", "", "selectedIndicatorMovingType", "Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "selectedIntervalLength", "Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "bottomTextPlaceholder", "", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;Ljava/lang/String;)V", "getItem", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "getDismissEvent", "()Lcom/robinhood/udf/UiEvent;", "getErrorEvent", "()Z", "getSelectedIndicatorMovingType", "()Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "getSelectedIntervalLength", "()Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Interval;", "getUiResource", "()Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "getBottomTextPlaceholder", "()Ljava/lang/String;", "topTitleState", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertViewState$TopTitleState;", "getTopTitleState", "()Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertViewState$TopTitleState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "TopTitleState", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AlertHubCreateIndicatorAlertViewState {
    private final String bottomTextPlaceholder;
    private final UiEvent<Unit> dismissEvent;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isLoading;
    private final AlertHubSettingItem item;
    private final AlertHubCreateIndicatorAlertViewState2 selectedIndicatorMovingType;
    private final ApiAlertHubSettingItem.Interval selectedIntervalLength;
    private final AlertHubUiResources uiResource;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<AlertHubCreateIndicatorAlertViewState2> VALUE_MOVING_TYPE = CollectionsKt.listOf((Object[]) new AlertHubCreateIndicatorAlertViewState2[]{AlertHubCreateIndicatorAlertViewState2.MOVE_BELOW_VALUE, AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE});

    public AlertHubCreateIndicatorAlertViewState() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }

    public static /* synthetic */ AlertHubCreateIndicatorAlertViewState copy$default(AlertHubCreateIndicatorAlertViewState alertHubCreateIndicatorAlertViewState, AlertHubSettingItem alertHubSettingItem, UiEvent uiEvent, UiEvent uiEvent2, boolean z, AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2, ApiAlertHubSettingItem.Interval interval, AlertHubUiResources alertHubUiResources, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            alertHubSettingItem = alertHubCreateIndicatorAlertViewState.item;
        }
        if ((i & 2) != 0) {
            uiEvent = alertHubCreateIndicatorAlertViewState.dismissEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = alertHubCreateIndicatorAlertViewState.errorEvent;
        }
        if ((i & 8) != 0) {
            z = alertHubCreateIndicatorAlertViewState.isLoading;
        }
        if ((i & 16) != 0) {
            alertHubCreateIndicatorAlertViewState2 = alertHubCreateIndicatorAlertViewState.selectedIndicatorMovingType;
        }
        if ((i & 32) != 0) {
            interval = alertHubCreateIndicatorAlertViewState.selectedIntervalLength;
        }
        if ((i & 64) != 0) {
            alertHubUiResources = alertHubCreateIndicatorAlertViewState.uiResource;
        }
        if ((i & 128) != 0) {
            str = alertHubCreateIndicatorAlertViewState.bottomTextPlaceholder;
        }
        AlertHubUiResources alertHubUiResources2 = alertHubUiResources;
        String str2 = str;
        AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState22 = alertHubCreateIndicatorAlertViewState2;
        ApiAlertHubSettingItem.Interval interval2 = interval;
        return alertHubCreateIndicatorAlertViewState.copy(alertHubSettingItem, uiEvent, uiEvent2, z, alertHubCreateIndicatorAlertViewState22, interval2, alertHubUiResources2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final AlertHubSettingItem getItem() {
        return this.item;
    }

    public final UiEvent<Unit> component2() {
        return this.dismissEvent;
    }

    public final UiEvent<Throwable> component3() {
        return this.errorEvent;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final AlertHubCreateIndicatorAlertViewState2 getSelectedIndicatorMovingType() {
        return this.selectedIndicatorMovingType;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiAlertHubSettingItem.Interval getSelectedIntervalLength() {
        return this.selectedIntervalLength;
    }

    /* renamed from: component7, reason: from getter */
    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBottomTextPlaceholder() {
        return this.bottomTextPlaceholder;
    }

    public final AlertHubCreateIndicatorAlertViewState copy(AlertHubSettingItem item, UiEvent<Unit> dismissEvent, UiEvent<Throwable> errorEvent, boolean isLoading, AlertHubCreateIndicatorAlertViewState2 selectedIndicatorMovingType, ApiAlertHubSettingItem.Interval selectedIntervalLength, AlertHubUiResources uiResource, String bottomTextPlaceholder) {
        Intrinsics.checkNotNullParameter(selectedIndicatorMovingType, "selectedIndicatorMovingType");
        Intrinsics.checkNotNullParameter(selectedIntervalLength, "selectedIntervalLength");
        Intrinsics.checkNotNullParameter(bottomTextPlaceholder, "bottomTextPlaceholder");
        return new AlertHubCreateIndicatorAlertViewState(item, dismissEvent, errorEvent, isLoading, selectedIndicatorMovingType, selectedIntervalLength, uiResource, bottomTextPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertHubCreateIndicatorAlertViewState)) {
            return false;
        }
        AlertHubCreateIndicatorAlertViewState alertHubCreateIndicatorAlertViewState = (AlertHubCreateIndicatorAlertViewState) other;
        return Intrinsics.areEqual(this.item, alertHubCreateIndicatorAlertViewState.item) && Intrinsics.areEqual(this.dismissEvent, alertHubCreateIndicatorAlertViewState.dismissEvent) && Intrinsics.areEqual(this.errorEvent, alertHubCreateIndicatorAlertViewState.errorEvent) && this.isLoading == alertHubCreateIndicatorAlertViewState.isLoading && this.selectedIndicatorMovingType == alertHubCreateIndicatorAlertViewState.selectedIndicatorMovingType && this.selectedIntervalLength == alertHubCreateIndicatorAlertViewState.selectedIntervalLength && Intrinsics.areEqual(this.uiResource, alertHubCreateIndicatorAlertViewState.uiResource) && Intrinsics.areEqual(this.bottomTextPlaceholder, alertHubCreateIndicatorAlertViewState.bottomTextPlaceholder);
    }

    public int hashCode() {
        AlertHubSettingItem alertHubSettingItem = this.item;
        int iHashCode = (alertHubSettingItem == null ? 0 : alertHubSettingItem.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.dismissEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.errorEvent;
        int iHashCode3 = (((((((iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.selectedIndicatorMovingType.hashCode()) * 31) + this.selectedIntervalLength.hashCode()) * 31;
        AlertHubUiResources alertHubUiResources = this.uiResource;
        return ((iHashCode3 + (alertHubUiResources != null ? alertHubUiResources.hashCode() : 0)) * 31) + this.bottomTextPlaceholder.hashCode();
    }

    public String toString() {
        return "AlertHubCreateIndicatorAlertViewState(item=" + this.item + ", dismissEvent=" + this.dismissEvent + ", errorEvent=" + this.errorEvent + ", isLoading=" + this.isLoading + ", selectedIndicatorMovingType=" + this.selectedIndicatorMovingType + ", selectedIntervalLength=" + this.selectedIntervalLength + ", uiResource=" + this.uiResource + ", bottomTextPlaceholder=" + this.bottomTextPlaceholder + ")";
    }

    public AlertHubCreateIndicatorAlertViewState(AlertHubSettingItem alertHubSettingItem, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, boolean z, AlertHubCreateIndicatorAlertViewState2 selectedIndicatorMovingType, ApiAlertHubSettingItem.Interval selectedIntervalLength, AlertHubUiResources alertHubUiResources, String bottomTextPlaceholder) {
        Intrinsics.checkNotNullParameter(selectedIndicatorMovingType, "selectedIndicatorMovingType");
        Intrinsics.checkNotNullParameter(selectedIntervalLength, "selectedIntervalLength");
        Intrinsics.checkNotNullParameter(bottomTextPlaceholder, "bottomTextPlaceholder");
        this.item = alertHubSettingItem;
        this.dismissEvent = uiEvent;
        this.errorEvent = uiEvent2;
        this.isLoading = z;
        this.selectedIndicatorMovingType = selectedIndicatorMovingType;
        this.selectedIntervalLength = selectedIntervalLength;
        this.uiResource = alertHubUiResources;
        this.bottomTextPlaceholder = bottomTextPlaceholder;
    }

    public final AlertHubSettingItem getItem() {
        return this.item;
    }

    public final UiEvent<Unit> getDismissEvent() {
        return this.dismissEvent;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ AlertHubCreateIndicatorAlertViewState(AlertHubSettingItem alertHubSettingItem, UiEvent uiEvent, UiEvent uiEvent2, boolean z, AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2, ApiAlertHubSettingItem.Interval interval, AlertHubUiResources alertHubUiResources, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : alertHubSettingItem, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : uiEvent2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE : alertHubCreateIndicatorAlertViewState2, (i & 32) != 0 ? ApiAlertHubSettingItem.Interval.FIVE_MINUTES : interval, (i & 64) != 0 ? null : alertHubUiResources, (i & 128) != 0 ? "" : str);
    }

    public final AlertHubCreateIndicatorAlertViewState2 getSelectedIndicatorMovingType() {
        return this.selectedIndicatorMovingType;
    }

    public final ApiAlertHubSettingItem.Interval getSelectedIntervalLength() {
        return this.selectedIntervalLength;
    }

    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }

    public final String getBottomTextPlaceholder() {
        return this.bottomTextPlaceholder;
    }

    public final TopTitleState getTopTitleState() {
        return new TopTitleState(this.selectedIndicatorMovingType, this.uiResource);
    }

    /* compiled from: AlertHubCreateIndicatorAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertViewState$TopTitleState;", "", "selectedIndicatorMovingType", "Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "<init>", "(Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;)V", "getSelectedIndicatorMovingType", "()Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "getUiResource", "()Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TopTitleState {
        public static final int $stable = 8;
        private final AlertHubCreateIndicatorAlertViewState2 selectedIndicatorMovingType;
        private final AlertHubUiResources uiResource;

        public static /* synthetic */ TopTitleState copy$default(TopTitleState topTitleState, AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2, AlertHubUiResources alertHubUiResources, int i, Object obj) {
            if ((i & 1) != 0) {
                alertHubCreateIndicatorAlertViewState2 = topTitleState.selectedIndicatorMovingType;
            }
            if ((i & 2) != 0) {
                alertHubUiResources = topTitleState.uiResource;
            }
            return topTitleState.copy(alertHubCreateIndicatorAlertViewState2, alertHubUiResources);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertHubCreateIndicatorAlertViewState2 getSelectedIndicatorMovingType() {
            return this.selectedIndicatorMovingType;
        }

        /* renamed from: component2, reason: from getter */
        public final AlertHubUiResources getUiResource() {
            return this.uiResource;
        }

        public final TopTitleState copy(AlertHubCreateIndicatorAlertViewState2 selectedIndicatorMovingType, AlertHubUiResources uiResource) {
            Intrinsics.checkNotNullParameter(selectedIndicatorMovingType, "selectedIndicatorMovingType");
            return new TopTitleState(selectedIndicatorMovingType, uiResource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopTitleState)) {
                return false;
            }
            TopTitleState topTitleState = (TopTitleState) other;
            return this.selectedIndicatorMovingType == topTitleState.selectedIndicatorMovingType && Intrinsics.areEqual(this.uiResource, topTitleState.uiResource);
        }

        public int hashCode() {
            int iHashCode = this.selectedIndicatorMovingType.hashCode() * 31;
            AlertHubUiResources alertHubUiResources = this.uiResource;
            return iHashCode + (alertHubUiResources == null ? 0 : alertHubUiResources.hashCode());
        }

        public String toString() {
            return "TopTitleState(selectedIndicatorMovingType=" + this.selectedIndicatorMovingType + ", uiResource=" + this.uiResource + ")";
        }

        public TopTitleState(AlertHubCreateIndicatorAlertViewState2 selectedIndicatorMovingType, AlertHubUiResources alertHubUiResources) {
            Intrinsics.checkNotNullParameter(selectedIndicatorMovingType, "selectedIndicatorMovingType");
            this.selectedIndicatorMovingType = selectedIndicatorMovingType;
            this.uiResource = alertHubUiResources;
        }

        public final AlertHubCreateIndicatorAlertViewState2 getSelectedIndicatorMovingType() {
            return this.selectedIndicatorMovingType;
        }

        public final AlertHubUiResources getUiResource() {
            return this.uiResource;
        }
    }

    /* compiled from: AlertHubCreateIndicatorAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertViewState$Companion;", "", "<init>", "()V", "VALUE_MOVING_TYPE", "", "Lcom/robinhood/android/advanced/alert/alerthub/IndicatorMovingType;", "getVALUE_MOVING_TYPE", "()Ljava/util/List;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<AlertHubCreateIndicatorAlertViewState2> getVALUE_MOVING_TYPE() {
            return AlertHubCreateIndicatorAlertViewState.VALUE_MOVING_TYPE;
        }
    }
}
