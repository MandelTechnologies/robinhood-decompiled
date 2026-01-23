package com.robinhood.android.advanced.alert;

import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.api.PriceDisplayResources;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertViewState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0006ABCDEFB\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0012HÆ\u0003J\t\u00108\u001a\u00020\u0014HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u009f\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState;", "", "isPriceAlertRadioSelected", "", "priceAlertSettings", "", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "indicatorAlertSettings", "selectedAlertSettings", "selectedAlertSettingsWithResource", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSettingWithResource;", "priceAlertSelectorState", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$PriceAlertSelectorState;", "alertSelectorState", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSelectorState;", "digestId", "", "segmentedControlState", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$SegmentedControlState;", "addAlertTypeState", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AddAlertTypeState;", "advancedAlert", "Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$PriceAlertSelectorState;Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSelectorState;Ljava/lang/String;Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$SegmentedControlState;Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AddAlertTypeState;Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;)V", "()Z", "getPriceAlertSettings", "()Ljava/util/List;", "getIndicatorAlertSettings", "getSelectedAlertSettings", "getSelectedAlertSettingsWithResource", "getPriceAlertSelectorState", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$PriceAlertSelectorState;", "getAlertSelectorState", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSelectorState;", "getDigestId", "()Ljava/lang/String;", "getSegmentedControlState", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$SegmentedControlState;", "getAddAlertTypeState", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AddAlertTypeState;", "getAdvancedAlert", "()Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "getUiResource", "()Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "AlertSettingWithResource", "SegmentedControlState", "AddAlertTypeState", "PriceAlertSelectorState", "AlertSelectorState", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AdvancedAlertViewState {
    private final AddAlertTypeState addAlertTypeState;
    private final AdvancedAlert advancedAlert;
    private final AlertSelectorState alertSelectorState;
    private final String digestId;
    private final List<AlertHubSettingItem> indicatorAlertSettings;
    private final boolean isPriceAlertRadioSelected;
    private final PriceAlertSelectorState priceAlertSelectorState;
    private final List<AlertHubSettingItem> priceAlertSettings;
    private final SegmentedControlState segmentedControlState;
    private final List<AlertHubSettingItem> selectedAlertSettings;
    private final List<AlertSettingWithResource> selectedAlertSettingsWithResource;
    private final AlertHubUiResources uiResource;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<ApiAlertHubSettingItem.Type> PRICE_ALERT_TYPES = CollectionsKt.listOf((Object[]) new ApiAlertHubSettingItem.Type[]{ApiAlertHubSettingItem.Type.PRICE_ABOVE, ApiAlertHubSettingItem.Type.PRICE_BELOW});

    public static /* synthetic */ AdvancedAlertViewState copy$default(AdvancedAlertViewState advancedAlertViewState, boolean z, List list, List list2, List list3, List list4, PriceAlertSelectorState priceAlertSelectorState, AlertSelectorState alertSelectorState, String str, SegmentedControlState segmentedControlState, AddAlertTypeState addAlertTypeState, AdvancedAlert advancedAlert, AlertHubUiResources alertHubUiResources, int i, Object obj) {
        if ((i & 1) != 0) {
            z = advancedAlertViewState.isPriceAlertRadioSelected;
        }
        if ((i & 2) != 0) {
            list = advancedAlertViewState.priceAlertSettings;
        }
        if ((i & 4) != 0) {
            list2 = advancedAlertViewState.indicatorAlertSettings;
        }
        if ((i & 8) != 0) {
            list3 = advancedAlertViewState.selectedAlertSettings;
        }
        if ((i & 16) != 0) {
            list4 = advancedAlertViewState.selectedAlertSettingsWithResource;
        }
        if ((i & 32) != 0) {
            priceAlertSelectorState = advancedAlertViewState.priceAlertSelectorState;
        }
        if ((i & 64) != 0) {
            alertSelectorState = advancedAlertViewState.alertSelectorState;
        }
        if ((i & 128) != 0) {
            str = advancedAlertViewState.digestId;
        }
        if ((i & 256) != 0) {
            segmentedControlState = advancedAlertViewState.segmentedControlState;
        }
        if ((i & 512) != 0) {
            addAlertTypeState = advancedAlertViewState.addAlertTypeState;
        }
        if ((i & 1024) != 0) {
            advancedAlert = advancedAlertViewState.advancedAlert;
        }
        if ((i & 2048) != 0) {
            alertHubUiResources = advancedAlertViewState.uiResource;
        }
        AdvancedAlert advancedAlert2 = advancedAlert;
        AlertHubUiResources alertHubUiResources2 = alertHubUiResources;
        SegmentedControlState segmentedControlState2 = segmentedControlState;
        AddAlertTypeState addAlertTypeState2 = addAlertTypeState;
        AlertSelectorState alertSelectorState2 = alertSelectorState;
        String str2 = str;
        List list5 = list4;
        PriceAlertSelectorState priceAlertSelectorState2 = priceAlertSelectorState;
        return advancedAlertViewState.copy(z, list, list2, list3, list5, priceAlertSelectorState2, alertSelectorState2, str2, segmentedControlState2, addAlertTypeState2, advancedAlert2, alertHubUiResources2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPriceAlertRadioSelected() {
        return this.isPriceAlertRadioSelected;
    }

    /* renamed from: component10, reason: from getter */
    public final AddAlertTypeState getAddAlertTypeState() {
        return this.addAlertTypeState;
    }

    /* renamed from: component11, reason: from getter */
    public final AdvancedAlert getAdvancedAlert() {
        return this.advancedAlert;
    }

    /* renamed from: component12, reason: from getter */
    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }

    public final List<AlertHubSettingItem> component2() {
        return this.priceAlertSettings;
    }

    public final List<AlertHubSettingItem> component3() {
        return this.indicatorAlertSettings;
    }

    public final List<AlertHubSettingItem> component4() {
        return this.selectedAlertSettings;
    }

    public final List<AlertSettingWithResource> component5() {
        return this.selectedAlertSettingsWithResource;
    }

    /* renamed from: component6, reason: from getter */
    public final PriceAlertSelectorState getPriceAlertSelectorState() {
        return this.priceAlertSelectorState;
    }

    /* renamed from: component7, reason: from getter */
    public final AlertSelectorState getAlertSelectorState() {
        return this.alertSelectorState;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDigestId() {
        return this.digestId;
    }

    /* renamed from: component9, reason: from getter */
    public final SegmentedControlState getSegmentedControlState() {
        return this.segmentedControlState;
    }

    public final AdvancedAlertViewState copy(boolean isPriceAlertRadioSelected, List<? extends AlertHubSettingItem> priceAlertSettings, List<? extends AlertHubSettingItem> indicatorAlertSettings, List<? extends AlertHubSettingItem> selectedAlertSettings, List<AlertSettingWithResource> selectedAlertSettingsWithResource, PriceAlertSelectorState priceAlertSelectorState, AlertSelectorState alertSelectorState, String digestId, SegmentedControlState segmentedControlState, AddAlertTypeState addAlertTypeState, AdvancedAlert advancedAlert, AlertHubUiResources uiResource) {
        Intrinsics.checkNotNullParameter(priceAlertSettings, "priceAlertSettings");
        Intrinsics.checkNotNullParameter(indicatorAlertSettings, "indicatorAlertSettings");
        Intrinsics.checkNotNullParameter(selectedAlertSettings, "selectedAlertSettings");
        Intrinsics.checkNotNullParameter(selectedAlertSettingsWithResource, "selectedAlertSettingsWithResource");
        Intrinsics.checkNotNullParameter(priceAlertSelectorState, "priceAlertSelectorState");
        Intrinsics.checkNotNullParameter(alertSelectorState, "alertSelectorState");
        Intrinsics.checkNotNullParameter(segmentedControlState, "segmentedControlState");
        Intrinsics.checkNotNullParameter(addAlertTypeState, "addAlertTypeState");
        return new AdvancedAlertViewState(isPriceAlertRadioSelected, priceAlertSettings, indicatorAlertSettings, selectedAlertSettings, selectedAlertSettingsWithResource, priceAlertSelectorState, alertSelectorState, digestId, segmentedControlState, addAlertTypeState, advancedAlert, uiResource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedAlertViewState)) {
            return false;
        }
        AdvancedAlertViewState advancedAlertViewState = (AdvancedAlertViewState) other;
        return this.isPriceAlertRadioSelected == advancedAlertViewState.isPriceAlertRadioSelected && Intrinsics.areEqual(this.priceAlertSettings, advancedAlertViewState.priceAlertSettings) && Intrinsics.areEqual(this.indicatorAlertSettings, advancedAlertViewState.indicatorAlertSettings) && Intrinsics.areEqual(this.selectedAlertSettings, advancedAlertViewState.selectedAlertSettings) && Intrinsics.areEqual(this.selectedAlertSettingsWithResource, advancedAlertViewState.selectedAlertSettingsWithResource) && Intrinsics.areEqual(this.priceAlertSelectorState, advancedAlertViewState.priceAlertSelectorState) && Intrinsics.areEqual(this.alertSelectorState, advancedAlertViewState.alertSelectorState) && Intrinsics.areEqual(this.digestId, advancedAlertViewState.digestId) && Intrinsics.areEqual(this.segmentedControlState, advancedAlertViewState.segmentedControlState) && Intrinsics.areEqual(this.addAlertTypeState, advancedAlertViewState.addAlertTypeState) && Intrinsics.areEqual(this.advancedAlert, advancedAlertViewState.advancedAlert) && Intrinsics.areEqual(this.uiResource, advancedAlertViewState.uiResource);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.isPriceAlertRadioSelected) * 31) + this.priceAlertSettings.hashCode()) * 31) + this.indicatorAlertSettings.hashCode()) * 31) + this.selectedAlertSettings.hashCode()) * 31) + this.selectedAlertSettingsWithResource.hashCode()) * 31) + this.priceAlertSelectorState.hashCode()) * 31) + this.alertSelectorState.hashCode()) * 31;
        String str = this.digestId;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.segmentedControlState.hashCode()) * 31) + this.addAlertTypeState.hashCode()) * 31;
        AdvancedAlert advancedAlert = this.advancedAlert;
        int iHashCode3 = (iHashCode2 + (advancedAlert == null ? 0 : advancedAlert.hashCode())) * 31;
        AlertHubUiResources alertHubUiResources = this.uiResource;
        return iHashCode3 + (alertHubUiResources != null ? alertHubUiResources.hashCode() : 0);
    }

    public String toString() {
        return "AdvancedAlertViewState(isPriceAlertRadioSelected=" + this.isPriceAlertRadioSelected + ", priceAlertSettings=" + this.priceAlertSettings + ", indicatorAlertSettings=" + this.indicatorAlertSettings + ", selectedAlertSettings=" + this.selectedAlertSettings + ", selectedAlertSettingsWithResource=" + this.selectedAlertSettingsWithResource + ", priceAlertSelectorState=" + this.priceAlertSelectorState + ", alertSelectorState=" + this.alertSelectorState + ", digestId=" + this.digestId + ", segmentedControlState=" + this.segmentedControlState + ", addAlertTypeState=" + this.addAlertTypeState + ", advancedAlert=" + this.advancedAlert + ", uiResource=" + this.uiResource + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedAlertViewState(boolean z, List<? extends AlertHubSettingItem> priceAlertSettings, List<? extends AlertHubSettingItem> indicatorAlertSettings, List<? extends AlertHubSettingItem> selectedAlertSettings, List<AlertSettingWithResource> selectedAlertSettingsWithResource, PriceAlertSelectorState priceAlertSelectorState, AlertSelectorState alertSelectorState, String str, SegmentedControlState segmentedControlState, AddAlertTypeState addAlertTypeState, AdvancedAlert advancedAlert, AlertHubUiResources alertHubUiResources) {
        Intrinsics.checkNotNullParameter(priceAlertSettings, "priceAlertSettings");
        Intrinsics.checkNotNullParameter(indicatorAlertSettings, "indicatorAlertSettings");
        Intrinsics.checkNotNullParameter(selectedAlertSettings, "selectedAlertSettings");
        Intrinsics.checkNotNullParameter(selectedAlertSettingsWithResource, "selectedAlertSettingsWithResource");
        Intrinsics.checkNotNullParameter(priceAlertSelectorState, "priceAlertSelectorState");
        Intrinsics.checkNotNullParameter(alertSelectorState, "alertSelectorState");
        Intrinsics.checkNotNullParameter(segmentedControlState, "segmentedControlState");
        Intrinsics.checkNotNullParameter(addAlertTypeState, "addAlertTypeState");
        this.isPriceAlertRadioSelected = z;
        this.priceAlertSettings = priceAlertSettings;
        this.indicatorAlertSettings = indicatorAlertSettings;
        this.selectedAlertSettings = selectedAlertSettings;
        this.selectedAlertSettingsWithResource = selectedAlertSettingsWithResource;
        this.priceAlertSelectorState = priceAlertSelectorState;
        this.alertSelectorState = alertSelectorState;
        this.digestId = str;
        this.segmentedControlState = segmentedControlState;
        this.addAlertTypeState = addAlertTypeState;
        this.advancedAlert = advancedAlert;
        this.uiResource = alertHubUiResources;
    }

    public final boolean isPriceAlertRadioSelected() {
        return this.isPriceAlertRadioSelected;
    }

    public final List<AlertHubSettingItem> getPriceAlertSettings() {
        return this.priceAlertSettings;
    }

    public final List<AlertHubSettingItem> getIndicatorAlertSettings() {
        return this.indicatorAlertSettings;
    }

    public final List<AlertHubSettingItem> getSelectedAlertSettings() {
        return this.selectedAlertSettings;
    }

    public final List<AlertSettingWithResource> getSelectedAlertSettingsWithResource() {
        return this.selectedAlertSettingsWithResource;
    }

    public final PriceAlertSelectorState getPriceAlertSelectorState() {
        return this.priceAlertSelectorState;
    }

    public final AlertSelectorState getAlertSelectorState() {
        return this.alertSelectorState;
    }

    public final String getDigestId() {
        return this.digestId;
    }

    public final SegmentedControlState getSegmentedControlState() {
        return this.segmentedControlState;
    }

    public final AddAlertTypeState getAddAlertTypeState() {
        return this.addAlertTypeState;
    }

    public final AdvancedAlert getAdvancedAlert() {
        return this.advancedAlert;
    }

    public final AlertHubUiResources getUiResource() {
        return this.uiResource;
    }

    /* compiled from: AdvancedAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSettingWithResource;", "", "alert", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "title", "", "subtitle", "indicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "isAppNotificationEnabled", "", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;Z)V", "getAlert", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIndicator", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "setIndicator", "(Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;)V", "()Z", "setAppNotificationEnabled", "(Z)V", "id", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlertSettingWithResource {
        public static final int $stable = 8;
        private final AlertHubSettingItem alert;
        private ApiTechnicalIndicator indicator;
        private boolean isAppNotificationEnabled;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ AlertSettingWithResource copy$default(AlertSettingWithResource alertSettingWithResource, AlertHubSettingItem alertHubSettingItem, String str, String str2, ApiTechnicalIndicator apiTechnicalIndicator, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                alertHubSettingItem = alertSettingWithResource.alert;
            }
            if ((i & 2) != 0) {
                str = alertSettingWithResource.title;
            }
            if ((i & 4) != 0) {
                str2 = alertSettingWithResource.subtitle;
            }
            if ((i & 8) != 0) {
                apiTechnicalIndicator = alertSettingWithResource.indicator;
            }
            if ((i & 16) != 0) {
                z = alertSettingWithResource.isAppNotificationEnabled;
            }
            boolean z2 = z;
            String str3 = str2;
            return alertSettingWithResource.copy(alertHubSettingItem, str, str3, apiTechnicalIndicator, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertHubSettingItem getAlert() {
            return this.alert;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiTechnicalIndicator getIndicator() {
            return this.indicator;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsAppNotificationEnabled() {
            return this.isAppNotificationEnabled;
        }

        public final AlertSettingWithResource copy(AlertHubSettingItem alert, String title, String subtitle, ApiTechnicalIndicator indicator, boolean isAppNotificationEnabled) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            return new AlertSettingWithResource(alert, title, subtitle, indicator, isAppNotificationEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertSettingWithResource)) {
                return false;
            }
            AlertSettingWithResource alertSettingWithResource = (AlertSettingWithResource) other;
            return Intrinsics.areEqual(this.alert, alertSettingWithResource.alert) && Intrinsics.areEqual(this.title, alertSettingWithResource.title) && Intrinsics.areEqual(this.subtitle, alertSettingWithResource.subtitle) && Intrinsics.areEqual(this.indicator, alertSettingWithResource.indicator) && this.isAppNotificationEnabled == alertSettingWithResource.isAppNotificationEnabled;
        }

        public int hashCode() {
            int iHashCode = this.alert.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ApiTechnicalIndicator apiTechnicalIndicator = this.indicator;
            return ((iHashCode3 + (apiTechnicalIndicator != null ? apiTechnicalIndicator.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAppNotificationEnabled);
        }

        public String toString() {
            return "AlertSettingWithResource(alert=" + this.alert + ", title=" + this.title + ", subtitle=" + this.subtitle + ", indicator=" + this.indicator + ", isAppNotificationEnabled=" + this.isAppNotificationEnabled + ")";
        }

        public AlertSettingWithResource(AlertHubSettingItem alert, String str, String str2, ApiTechnicalIndicator apiTechnicalIndicator, boolean z) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.alert = alert;
            this.title = str;
            this.subtitle = str2;
            this.indicator = apiTechnicalIndicator;
            this.isAppNotificationEnabled = z;
        }

        public /* synthetic */ AlertSettingWithResource(AlertHubSettingItem alertHubSettingItem, String str, String str2, ApiTechnicalIndicator apiTechnicalIndicator, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(alertHubSettingItem, str, str2, apiTechnicalIndicator, (i & 16) != 0 ? true : z);
        }

        public final AlertHubSettingItem getAlert() {
            return this.alert;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ApiTechnicalIndicator getIndicator() {
            return this.indicator;
        }

        public final void setIndicator(ApiTechnicalIndicator apiTechnicalIndicator) {
            this.indicator = apiTechnicalIndicator;
        }

        public final boolean isAppNotificationEnabled() {
            return this.isAppNotificationEnabled;
        }

        public final void setAppNotificationEnabled(boolean z) {
            this.isAppNotificationEnabled = z;
        }

        public final String getId() {
            return this.alert.getId();
        }
    }

    /* compiled from: AdvancedAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$SegmentedControlState;", "", "activeAlertType", "Lcom/robinhood/android/advanced/alert/AlertType;", "priceRadioBtnTxt", "", "indicatorRadioBtnTxt", "itemCount", "", "<init>", "(Lcom/robinhood/android/advanced/alert/AlertType;Ljava/lang/String;Ljava/lang/String;I)V", "getActiveAlertType", "()Lcom/robinhood/android/advanced/alert/AlertType;", "getPriceRadioBtnTxt", "()Ljava/lang/String;", "getIndicatorRadioBtnTxt", "getItemCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SegmentedControlState {
        public static final int $stable = 0;
        private final AlertType activeAlertType;
        private final String indicatorRadioBtnTxt;
        private final int itemCount;
        private final String priceRadioBtnTxt;

        public static /* synthetic */ SegmentedControlState copy$default(SegmentedControlState segmentedControlState, AlertType alertType, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                alertType = segmentedControlState.activeAlertType;
            }
            if ((i2 & 2) != 0) {
                str = segmentedControlState.priceRadioBtnTxt;
            }
            if ((i2 & 4) != 0) {
                str2 = segmentedControlState.indicatorRadioBtnTxt;
            }
            if ((i2 & 8) != 0) {
                i = segmentedControlState.itemCount;
            }
            return segmentedControlState.copy(alertType, str, str2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final AlertType getActiveAlertType() {
            return this.activeAlertType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPriceRadioBtnTxt() {
            return this.priceRadioBtnTxt;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIndicatorRadioBtnTxt() {
            return this.indicatorRadioBtnTxt;
        }

        /* renamed from: component4, reason: from getter */
        public final int getItemCount() {
            return this.itemCount;
        }

        public final SegmentedControlState copy(AlertType activeAlertType, String priceRadioBtnTxt, String indicatorRadioBtnTxt, int itemCount) {
            Intrinsics.checkNotNullParameter(activeAlertType, "activeAlertType");
            return new SegmentedControlState(activeAlertType, priceRadioBtnTxt, indicatorRadioBtnTxt, itemCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentedControlState)) {
                return false;
            }
            SegmentedControlState segmentedControlState = (SegmentedControlState) other;
            return this.activeAlertType == segmentedControlState.activeAlertType && Intrinsics.areEqual(this.priceRadioBtnTxt, segmentedControlState.priceRadioBtnTxt) && Intrinsics.areEqual(this.indicatorRadioBtnTxt, segmentedControlState.indicatorRadioBtnTxt) && this.itemCount == segmentedControlState.itemCount;
        }

        public int hashCode() {
            int iHashCode = this.activeAlertType.hashCode() * 31;
            String str = this.priceRadioBtnTxt;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.indicatorRadioBtnTxt;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.itemCount);
        }

        public String toString() {
            return "SegmentedControlState(activeAlertType=" + this.activeAlertType + ", priceRadioBtnTxt=" + this.priceRadioBtnTxt + ", indicatorRadioBtnTxt=" + this.indicatorRadioBtnTxt + ", itemCount=" + this.itemCount + ")";
        }

        public SegmentedControlState(AlertType activeAlertType, String str, String str2, int i) {
            Intrinsics.checkNotNullParameter(activeAlertType, "activeAlertType");
            this.activeAlertType = activeAlertType;
            this.priceRadioBtnTxt = str;
            this.indicatorRadioBtnTxt = str2;
            this.itemCount = i;
        }

        public final AlertType getActiveAlertType() {
            return this.activeAlertType;
        }

        public final String getPriceRadioBtnTxt() {
            return this.priceRadioBtnTxt;
        }

        public final String getIndicatorRadioBtnTxt() {
            return this.indicatorRadioBtnTxt;
        }

        public final int getItemCount() {
            return this.itemCount;
        }
    }

    /* compiled from: AdvancedAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AddAlertTypeState;", "", "addAlertText", "", "addAlertSubtitleText", "maximumAlertReached", "", "isAppNotificationEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAddAlertText", "()Ljava/lang/String;", "getAddAlertSubtitleText", "getMaximumAlertReached", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AddAlertTypeState {
        public static final int $stable = 0;
        private final String addAlertSubtitleText;
        private final String addAlertText;
        private final boolean isAppNotificationEnabled;
        private final boolean maximumAlertReached;

        public static /* synthetic */ AddAlertTypeState copy$default(AddAlertTypeState addAlertTypeState, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addAlertTypeState.addAlertText;
            }
            if ((i & 2) != 0) {
                str2 = addAlertTypeState.addAlertSubtitleText;
            }
            if ((i & 4) != 0) {
                z = addAlertTypeState.maximumAlertReached;
            }
            if ((i & 8) != 0) {
                z2 = addAlertTypeState.isAppNotificationEnabled;
            }
            return addAlertTypeState.copy(str, str2, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAddAlertText() {
            return this.addAlertText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAddAlertSubtitleText() {
            return this.addAlertSubtitleText;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMaximumAlertReached() {
            return this.maximumAlertReached;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsAppNotificationEnabled() {
            return this.isAppNotificationEnabled;
        }

        public final AddAlertTypeState copy(String addAlertText, String addAlertSubtitleText, boolean maximumAlertReached, boolean isAppNotificationEnabled) {
            Intrinsics.checkNotNullParameter(addAlertText, "addAlertText");
            Intrinsics.checkNotNullParameter(addAlertSubtitleText, "addAlertSubtitleText");
            return new AddAlertTypeState(addAlertText, addAlertSubtitleText, maximumAlertReached, isAppNotificationEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddAlertTypeState)) {
                return false;
            }
            AddAlertTypeState addAlertTypeState = (AddAlertTypeState) other;
            return Intrinsics.areEqual(this.addAlertText, addAlertTypeState.addAlertText) && Intrinsics.areEqual(this.addAlertSubtitleText, addAlertTypeState.addAlertSubtitleText) && this.maximumAlertReached == addAlertTypeState.maximumAlertReached && this.isAppNotificationEnabled == addAlertTypeState.isAppNotificationEnabled;
        }

        public int hashCode() {
            return (((((this.addAlertText.hashCode() * 31) + this.addAlertSubtitleText.hashCode()) * 31) + Boolean.hashCode(this.maximumAlertReached)) * 31) + Boolean.hashCode(this.isAppNotificationEnabled);
        }

        public String toString() {
            return "AddAlertTypeState(addAlertText=" + this.addAlertText + ", addAlertSubtitleText=" + this.addAlertSubtitleText + ", maximumAlertReached=" + this.maximumAlertReached + ", isAppNotificationEnabled=" + this.isAppNotificationEnabled + ")";
        }

        public AddAlertTypeState(String addAlertText, String addAlertSubtitleText, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(addAlertText, "addAlertText");
            Intrinsics.checkNotNullParameter(addAlertSubtitleText, "addAlertSubtitleText");
            this.addAlertText = addAlertText;
            this.addAlertSubtitleText = addAlertSubtitleText;
            this.maximumAlertReached = z;
            this.isAppNotificationEnabled = z2;
        }

        public final String getAddAlertText() {
            return this.addAlertText;
        }

        public final String getAddAlertSubtitleText() {
            return this.addAlertSubtitleText;
        }

        public final boolean getMaximumAlertReached() {
            return this.maximumAlertReached;
        }

        public final boolean isAppNotificationEnabled() {
            return this.isAppNotificationEnabled;
        }
    }

    /* compiled from: AdvancedAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$PriceAlertSelectorState;", "", "isPriceSelected", "", "uiResource", "Lcom/robinhood/models/advanced/alert/api/PriceDisplayResources;", "<init>", "(ZLcom/robinhood/models/advanced/alert/api/PriceDisplayResources;)V", "()Z", "getUiResource", "()Lcom/robinhood/models/advanced/alert/api/PriceDisplayResources;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PriceAlertSelectorState {
        public static final int $stable = 8;
        private final boolean isPriceSelected;
        private final PriceDisplayResources uiResource;

        public static /* synthetic */ PriceAlertSelectorState copy$default(PriceAlertSelectorState priceAlertSelectorState, boolean z, PriceDisplayResources priceDisplayResources, int i, Object obj) {
            if ((i & 1) != 0) {
                z = priceAlertSelectorState.isPriceSelected;
            }
            if ((i & 2) != 0) {
                priceDisplayResources = priceAlertSelectorState.uiResource;
            }
            return priceAlertSelectorState.copy(z, priceDisplayResources);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsPriceSelected() {
            return this.isPriceSelected;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDisplayResources getUiResource() {
            return this.uiResource;
        }

        public final PriceAlertSelectorState copy(boolean isPriceSelected, PriceDisplayResources uiResource) {
            return new PriceAlertSelectorState(isPriceSelected, uiResource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceAlertSelectorState)) {
                return false;
            }
            PriceAlertSelectorState priceAlertSelectorState = (PriceAlertSelectorState) other;
            return this.isPriceSelected == priceAlertSelectorState.isPriceSelected && Intrinsics.areEqual(this.uiResource, priceAlertSelectorState.uiResource);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isPriceSelected) * 31;
            PriceDisplayResources priceDisplayResources = this.uiResource;
            return iHashCode + (priceDisplayResources == null ? 0 : priceDisplayResources.hashCode());
        }

        public String toString() {
            return "PriceAlertSelectorState(isPriceSelected=" + this.isPriceSelected + ", uiResource=" + this.uiResource + ")";
        }

        public PriceAlertSelectorState(boolean z, PriceDisplayResources priceDisplayResources) {
            this.isPriceSelected = z;
            this.uiResource = priceDisplayResources;
        }

        public final boolean isPriceSelected() {
            return this.isPriceSelected;
        }

        public final PriceDisplayResources getUiResource() {
            return this.uiResource;
        }
    }

    /* compiled from: AdvancedAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSelectorState;", "", "isPriceSelected", "", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "<init>", "(ZLcom/robinhood/models/advanced/alert/db/AlertHubUiResources;)V", "()Z", "getUiResource", "()Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AlertSelectorState {
        public static final int $stable = 8;
        private final boolean isPriceSelected;
        private final AlertHubUiResources uiResource;

        public static /* synthetic */ AlertSelectorState copy$default(AlertSelectorState alertSelectorState, boolean z, AlertHubUiResources alertHubUiResources, int i, Object obj) {
            if ((i & 1) != 0) {
                z = alertSelectorState.isPriceSelected;
            }
            if ((i & 2) != 0) {
                alertHubUiResources = alertSelectorState.uiResource;
            }
            return alertSelectorState.copy(z, alertHubUiResources);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsPriceSelected() {
            return this.isPriceSelected;
        }

        /* renamed from: component2, reason: from getter */
        public final AlertHubUiResources getUiResource() {
            return this.uiResource;
        }

        public final AlertSelectorState copy(boolean isPriceSelected, AlertHubUiResources uiResource) {
            return new AlertSelectorState(isPriceSelected, uiResource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertSelectorState)) {
                return false;
            }
            AlertSelectorState alertSelectorState = (AlertSelectorState) other;
            return this.isPriceSelected == alertSelectorState.isPriceSelected && Intrinsics.areEqual(this.uiResource, alertSelectorState.uiResource);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isPriceSelected) * 31;
            AlertHubUiResources alertHubUiResources = this.uiResource;
            return iHashCode + (alertHubUiResources == null ? 0 : alertHubUiResources.hashCode());
        }

        public String toString() {
            return "AlertSelectorState(isPriceSelected=" + this.isPriceSelected + ", uiResource=" + this.uiResource + ")";
        }

        public AlertSelectorState(boolean z, AlertHubUiResources alertHubUiResources) {
            this.isPriceSelected = z;
            this.uiResource = alertHubUiResources;
        }

        public final boolean isPriceSelected() {
            return this.isPriceSelected;
        }

        public final AlertHubUiResources getUiResource() {
            return this.uiResource;
        }
    }

    /* compiled from: AdvancedAlertViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$Companion;", "", "<init>", "()V", "PRICE_ALERT_TYPES", "", "Lcom/robinhood/models/advanced/alert/api/ApiAlertHubSettingItem$Type;", "getPRICE_ALERT_TYPES", "()Ljava/util/List;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<ApiAlertHubSettingItem.Type> getPRICE_ALERT_TYPES() {
            return AdvancedAlertViewState.PRICE_ALERT_TYPES;
        }
    }
}
