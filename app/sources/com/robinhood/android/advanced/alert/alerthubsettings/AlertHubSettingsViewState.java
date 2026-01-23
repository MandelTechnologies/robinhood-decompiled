package com.robinhood.android.advanced.alert.alerthubsettings;

import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState;", "", "showNotificationsBanner", "", "<init>", "(Z)V", "getShowNotificationsBanner", "()Z", "Loading", "Loaded", "Item", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Loaded;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Loading;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AlertHubSettingsViewState {
    public static final int $stable = 0;
    private final boolean showNotificationsBanner;

    public /* synthetic */ AlertHubSettingsViewState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private AlertHubSettingsViewState(boolean z) {
        this.showNotificationsBanner = z;
    }

    public /* synthetic */ AlertHubSettingsViewState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, null);
    }

    public boolean getShowNotificationsBanner() {
        return this.showNotificationsBanner;
    }

    /* compiled from: AlertHubSettingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Loading;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState;", "showNotificationsBanner", "", "<init>", "(Z)V", "getShowNotificationsBanner", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends AlertHubSettingsViewState {
        public static final int $stable = 0;
        private final boolean showNotificationsBanner;

        public Loading() {
            this(false, 1, null);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loading.showNotificationsBanner;
            }
            return loading.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowNotificationsBanner() {
            return this.showNotificationsBanner;
        }

        public final Loading copy(boolean showNotificationsBanner) {
            return new Loading(showNotificationsBanner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.showNotificationsBanner == ((Loading) other).showNotificationsBanner;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showNotificationsBanner);
        }

        public String toString() {
            return "Loading(showNotificationsBanner=" + this.showNotificationsBanner + ")";
        }

        public /* synthetic */ Loading(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState
        public boolean getShowNotificationsBanner() {
            return this.showNotificationsBanner;
        }

        public Loading(boolean z) {
            super(z, null);
            this.showNotificationsBanner = z;
        }
    }

    /* compiled from: AlertHubSettingsViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Loaded;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState;", "title", "", "infoActionContentfulId", "items", "", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item;", "noAlertsTitle", "noAlertsSubtitle", "showNotificationsBanner", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getInfoActionContentfulId", "getItems", "()Ljava/util/List;", "getNoAlertsTitle", "getNoAlertsSubtitle", "getShowNotificationsBanner", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends AlertHubSettingsViewState {
        public static final int $stable = 8;
        private final String infoActionContentfulId;
        private final List<Item> items;
        private final String noAlertsSubtitle;
        private final String noAlertsTitle;
        private final boolean showNotificationsBanner;
        private final String title;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, String str2, List list, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                str2 = loaded.infoActionContentfulId;
            }
            if ((i & 4) != 0) {
                list = loaded.items;
            }
            if ((i & 8) != 0) {
                str3 = loaded.noAlertsTitle;
            }
            if ((i & 16) != 0) {
                str4 = loaded.noAlertsSubtitle;
            }
            if ((i & 32) != 0) {
                z = loaded.showNotificationsBanner;
            }
            String str5 = str4;
            boolean z2 = z;
            return loaded.copy(str, str2, list, str3, str5, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInfoActionContentfulId() {
            return this.infoActionContentfulId;
        }

        public final List<Item> component3() {
            return this.items;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNoAlertsTitle() {
            return this.noAlertsTitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNoAlertsSubtitle() {
            return this.noAlertsSubtitle;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowNotificationsBanner() {
            return this.showNotificationsBanner;
        }

        public final Loaded copy(String title, String infoActionContentfulId, List<? extends Item> items, String noAlertsTitle, String noAlertsSubtitle, boolean showNotificationsBanner) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(noAlertsTitle, "noAlertsTitle");
            Intrinsics.checkNotNullParameter(noAlertsSubtitle, "noAlertsSubtitle");
            return new Loaded(title, infoActionContentfulId, items, noAlertsTitle, noAlertsSubtitle, showNotificationsBanner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.infoActionContentfulId, loaded.infoActionContentfulId) && Intrinsics.areEqual(this.items, loaded.items) && Intrinsics.areEqual(this.noAlertsTitle, loaded.noAlertsTitle) && Intrinsics.areEqual(this.noAlertsSubtitle, loaded.noAlertsSubtitle) && this.showNotificationsBanner == loaded.showNotificationsBanner;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.infoActionContentfulId;
            return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.items.hashCode()) * 31) + this.noAlertsTitle.hashCode()) * 31) + this.noAlertsSubtitle.hashCode()) * 31) + Boolean.hashCode(this.showNotificationsBanner);
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", infoActionContentfulId=" + this.infoActionContentfulId + ", items=" + this.items + ", noAlertsTitle=" + this.noAlertsTitle + ", noAlertsSubtitle=" + this.noAlertsSubtitle + ", showNotificationsBanner=" + this.showNotificationsBanner + ")";
        }

        public /* synthetic */ Loaded(String str, String str2, List list, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, str3, str4, (i & 32) != 0 ? false : z);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getInfoActionContentfulId() {
            return this.infoActionContentfulId;
        }

        public final List<Item> getItems() {
            return this.items;
        }

        public final String getNoAlertsTitle() {
            return this.noAlertsTitle;
        }

        public final String getNoAlertsSubtitle() {
            return this.noAlertsSubtitle;
        }

        @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState
        public boolean getShowNotificationsBanner() {
            return this.showNotificationsBanner;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(String title, String str, List<? extends Item> items, String noAlertsTitle, String noAlertsSubtitle, boolean z) {
            super(z, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(noAlertsTitle, "noAlertsTitle");
            Intrinsics.checkNotNullParameter(noAlertsSubtitle, "noAlertsSubtitle");
            this.title = title;
            this.infoActionContentfulId = str;
            this.items = items;
            this.noAlertsTitle = noAlertsTitle;
            this.noAlertsSubtitle = noAlertsSubtitle;
            this.showNotificationsBanner = z;
        }
    }

    /* compiled from: AlertHubSettingsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item;", "", "symbol", "", "id", "Ljava/util/UUID;", "subtitle", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "loggingIdentifier", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getId", "()Ljava/util/UUID;", "getSubtitle", "getEntityType", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "getLoggingIdentifier", "InstrumentItem", "CryptoItem", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item$CryptoItem;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item$InstrumentItem;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Item {
        public static final int $stable = 8;
        private final AlertHubSettings2 entityType;
        private final UUID id;
        private final String loggingIdentifier;
        private final String subtitle;
        private final String symbol;

        public /* synthetic */ Item(String str, UUID uuid, String str2, AlertHubSettings2 alertHubSettings2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uuid, str2, alertHubSettings2, str3);
        }

        private Item(String str, UUID uuid, String str2, AlertHubSettings2 alertHubSettings2, String str3) {
            this.symbol = str;
            this.id = uuid;
            this.subtitle = str2;
            this.entityType = alertHubSettings2;
            this.loggingIdentifier = str3;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final UUID getId() {
            return this.id;
        }

        public String getSubtitle() {
            return this.subtitle;
        }

        public AlertHubSettings2 getEntityType() {
            return this.entityType;
        }

        public String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        /* compiled from: AlertHubSettingsViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item$InstrumentItem;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item;", "instrument", "Lcom/robinhood/models/db/Instrument;", "subtitle", "", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "loggingIdentifier", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Ljava/lang/String;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSubtitle", "()Ljava/lang/String;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "getLoggingIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InstrumentItem extends Item {
            public static final int $stable = 8;
            private final AlertHubSettings2 entityType;
            private final Instrument instrument;
            private final String loggingIdentifier;
            private final String subtitle;

            public static /* synthetic */ InstrumentItem copy$default(InstrumentItem instrumentItem, Instrument instrument, String str, AlertHubSettings2 alertHubSettings2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = instrumentItem.instrument;
                }
                if ((i & 2) != 0) {
                    str = instrumentItem.subtitle;
                }
                if ((i & 4) != 0) {
                    alertHubSettings2 = instrumentItem.entityType;
                }
                if ((i & 8) != 0) {
                    str2 = instrumentItem.loggingIdentifier;
                }
                return instrumentItem.copy(instrument, str, alertHubSettings2, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final AlertHubSettings2 getEntityType() {
                return this.entityType;
            }

            /* renamed from: component4, reason: from getter */
            public final String getLoggingIdentifier() {
                return this.loggingIdentifier;
            }

            public final InstrumentItem copy(Instrument instrument, String subtitle, AlertHubSettings2 entityType, String loggingIdentifier) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(entityType, "entityType");
                Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
                return new InstrumentItem(instrument, subtitle, entityType, loggingIdentifier);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InstrumentItem)) {
                    return false;
                }
                InstrumentItem instrumentItem = (InstrumentItem) other;
                return Intrinsics.areEqual(this.instrument, instrumentItem.instrument) && Intrinsics.areEqual(this.subtitle, instrumentItem.subtitle) && this.entityType == instrumentItem.entityType && Intrinsics.areEqual(this.loggingIdentifier, instrumentItem.loggingIdentifier);
            }

            public int hashCode() {
                return (((((this.instrument.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.entityType.hashCode()) * 31) + this.loggingIdentifier.hashCode();
            }

            public String toString() {
                return "InstrumentItem(instrument=" + this.instrument + ", subtitle=" + this.subtitle + ", entityType=" + this.entityType + ", loggingIdentifier=" + this.loggingIdentifier + ")";
            }

            public final Instrument getInstrument() {
                return this.instrument;
            }

            @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState.Item
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState.Item
            public AlertHubSettings2 getEntityType() {
                return this.entityType;
            }

            @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState.Item
            public String getLoggingIdentifier() {
                return this.loggingIdentifier;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstrumentItem(Instrument instrument, String subtitle, AlertHubSettings2 entityType, String loggingIdentifier) {
                super(instrument.getSymbol(), instrument.getId(), subtitle, entityType, loggingIdentifier, null);
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(entityType, "entityType");
                Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
                this.instrument = instrument;
                this.subtitle = subtitle;
                this.entityType = entityType;
                this.loggingIdentifier = loggingIdentifier;
            }
        }

        /* compiled from: AlertHubSettingsViewState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item$CryptoItem;", "Lcom/robinhood/android/advanced/alert/alerthubsettings/AlertHubSettingsViewState$Item;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "subtitle", "", "entityType", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "loggingIdentifier", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;Ljava/lang/String;)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSubtitle", "()Ljava/lang/String;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingsEntityType;", "getLoggingIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CryptoItem extends Item {
            public static final int $stable = 8;
            private final UiCurrencyPair currencyPair;
            private final AlertHubSettings2 entityType;
            private final String loggingIdentifier;
            private final String subtitle;

            public static /* synthetic */ CryptoItem copy$default(CryptoItem cryptoItem, UiCurrencyPair uiCurrencyPair, String str, AlertHubSettings2 alertHubSettings2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = cryptoItem.currencyPair;
                }
                if ((i & 2) != 0) {
                    str = cryptoItem.subtitle;
                }
                if ((i & 4) != 0) {
                    alertHubSettings2 = cryptoItem.entityType;
                }
                if ((i & 8) != 0) {
                    str2 = cryptoItem.loggingIdentifier;
                }
                return cryptoItem.copy(uiCurrencyPair, str, alertHubSettings2, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final AlertHubSettings2 getEntityType() {
                return this.entityType;
            }

            /* renamed from: component4, reason: from getter */
            public final String getLoggingIdentifier() {
                return this.loggingIdentifier;
            }

            public final CryptoItem copy(UiCurrencyPair currencyPair, String subtitle, AlertHubSettings2 entityType, String loggingIdentifier) {
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(entityType, "entityType");
                Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
                return new CryptoItem(currencyPair, subtitle, entityType, loggingIdentifier);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CryptoItem)) {
                    return false;
                }
                CryptoItem cryptoItem = (CryptoItem) other;
                return Intrinsics.areEqual(this.currencyPair, cryptoItem.currencyPair) && Intrinsics.areEqual(this.subtitle, cryptoItem.subtitle) && this.entityType == cryptoItem.entityType && Intrinsics.areEqual(this.loggingIdentifier, cryptoItem.loggingIdentifier);
            }

            public int hashCode() {
                return (((((this.currencyPair.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.entityType.hashCode()) * 31) + this.loggingIdentifier.hashCode();
            }

            public String toString() {
                return "CryptoItem(currencyPair=" + this.currencyPair + ", subtitle=" + this.subtitle + ", entityType=" + this.entityType + ", loggingIdentifier=" + this.loggingIdentifier + ")";
            }

            public final UiCurrencyPair getCurrencyPair() {
                return this.currencyPair;
            }

            @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState.Item
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState.Item
            public AlertHubSettings2 getEntityType() {
                return this.entityType;
            }

            @Override // com.robinhood.android.advanced.alert.alerthubsettings.AlertHubSettingsViewState.Item
            public String getLoggingIdentifier() {
                return this.loggingIdentifier;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CryptoItem(UiCurrencyPair currencyPair, String subtitle, AlertHubSettings2 entityType, String loggingIdentifier) {
                super(currencyPair.getAssetCurrency().getCode(), currencyPair.getId(), subtitle, entityType, loggingIdentifier, null);
                Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(entityType, "entityType");
                Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
                this.currencyPair = currencyPair;
                this.subtitle = subtitle;
                this.entityType = entityType;
                this.loggingIdentifier = loggingIdentifier;
            }
        }
    }
}
