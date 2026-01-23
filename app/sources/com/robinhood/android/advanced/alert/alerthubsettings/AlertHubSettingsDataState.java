package com.robinhood.android.advanced.alert.alerthubsettings;

import com.robinhood.models.advanced.alert.p302db.AlertHubSettings;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubSettingsDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\rHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsDataState;", "", "alertHubSettings", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettings;", "instruments", "", "Lcom/robinhood/models/db/Instrument;", "currencyPairs", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "itemsToBeRemoved", "", "Ljava/util/UUID;", "areNotificationsEnabled", "", "<init>", "(Lcom/robinhood/models/advanced/alert/db/AlertHubSettings;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Z)V", "getAlertHubSettings", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettings;", "getInstruments", "()Ljava/util/List;", "getCurrencyPairs", "getItemsToBeRemoved", "()Ljava/util/Set;", "getAreNotificationsEnabled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AlertHubSettingsDataState {
    public static final int $stable = 8;
    private final AlertHubSettings alertHubSettings;
    private final boolean areNotificationsEnabled;
    private final List<UiCurrencyPair> currencyPairs;
    private final List<Instrument> instruments;
    private final Set<UUID> itemsToBeRemoved;

    public AlertHubSettingsDataState() {
        this(null, null, null, null, false, 31, null);
    }

    public static /* synthetic */ AlertHubSettingsDataState copy$default(AlertHubSettingsDataState alertHubSettingsDataState, AlertHubSettings alertHubSettings, List list, List list2, Set set, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alertHubSettings = alertHubSettingsDataState.alertHubSettings;
        }
        if ((i & 2) != 0) {
            list = alertHubSettingsDataState.instruments;
        }
        if ((i & 4) != 0) {
            list2 = alertHubSettingsDataState.currencyPairs;
        }
        if ((i & 8) != 0) {
            set = alertHubSettingsDataState.itemsToBeRemoved;
        }
        if ((i & 16) != 0) {
            z = alertHubSettingsDataState.areNotificationsEnabled;
        }
        boolean z2 = z;
        List list3 = list2;
        return alertHubSettingsDataState.copy(alertHubSettings, list, list3, set, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final AlertHubSettings getAlertHubSettings() {
        return this.alertHubSettings;
    }

    public final List<Instrument> component2() {
        return this.instruments;
    }

    public final List<UiCurrencyPair> component3() {
        return this.currencyPairs;
    }

    public final Set<UUID> component4() {
        return this.itemsToBeRemoved;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAreNotificationsEnabled() {
        return this.areNotificationsEnabled;
    }

    public final AlertHubSettingsDataState copy(AlertHubSettings alertHubSettings, List<Instrument> instruments, List<UiCurrencyPair> currencyPairs, Set<UUID> itemsToBeRemoved, boolean areNotificationsEnabled) {
        Intrinsics.checkNotNullParameter(itemsToBeRemoved, "itemsToBeRemoved");
        return new AlertHubSettingsDataState(alertHubSettings, instruments, currencyPairs, itemsToBeRemoved, areNotificationsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertHubSettingsDataState)) {
            return false;
        }
        AlertHubSettingsDataState alertHubSettingsDataState = (AlertHubSettingsDataState) other;
        return Intrinsics.areEqual(this.alertHubSettings, alertHubSettingsDataState.alertHubSettings) && Intrinsics.areEqual(this.instruments, alertHubSettingsDataState.instruments) && Intrinsics.areEqual(this.currencyPairs, alertHubSettingsDataState.currencyPairs) && Intrinsics.areEqual(this.itemsToBeRemoved, alertHubSettingsDataState.itemsToBeRemoved) && this.areNotificationsEnabled == alertHubSettingsDataState.areNotificationsEnabled;
    }

    public int hashCode() {
        AlertHubSettings alertHubSettings = this.alertHubSettings;
        int iHashCode = (alertHubSettings == null ? 0 : alertHubSettings.hashCode()) * 31;
        List<Instrument> list = this.instruments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UiCurrencyPair> list2 = this.currencyPairs;
        return ((((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.itemsToBeRemoved.hashCode()) * 31) + Boolean.hashCode(this.areNotificationsEnabled);
    }

    public String toString() {
        return "AlertHubSettingsDataState(alertHubSettings=" + this.alertHubSettings + ", instruments=" + this.instruments + ", currencyPairs=" + this.currencyPairs + ", itemsToBeRemoved=" + this.itemsToBeRemoved + ", areNotificationsEnabled=" + this.areNotificationsEnabled + ")";
    }

    public AlertHubSettingsDataState(AlertHubSettings alertHubSettings, List<Instrument> list, List<UiCurrencyPair> list2, Set<UUID> itemsToBeRemoved, boolean z) {
        Intrinsics.checkNotNullParameter(itemsToBeRemoved, "itemsToBeRemoved");
        this.alertHubSettings = alertHubSettings;
        this.instruments = list;
        this.currencyPairs = list2;
        this.itemsToBeRemoved = itemsToBeRemoved;
        this.areNotificationsEnabled = z;
    }

    public final AlertHubSettings getAlertHubSettings() {
        return this.alertHubSettings;
    }

    public final List<Instrument> getInstruments() {
        return this.instruments;
    }

    public final List<UiCurrencyPair> getCurrencyPairs() {
        return this.currencyPairs;
    }

    public /* synthetic */ AlertHubSettingsDataState(AlertHubSettings alertHubSettings, List list, List list2, Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : alertHubSettings, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? SetsKt.emptySet() : set, (i & 16) != 0 ? true : z);
    }

    public final Set<UUID> getItemsToBeRemoved() {
        return this.itemsToBeRemoved;
    }

    public final boolean getAreNotificationsEnabled() {
        return this.areNotificationsEnabled;
    }
}
