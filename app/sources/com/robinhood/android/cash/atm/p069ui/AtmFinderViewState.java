package com.robinhood.android.cash.atm.p069ui;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.robinhood.models.api.minerva.Atm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtmFinderViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BM\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003JO\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState;", "", "atms", "", "Lcom/robinhood/models/api/minerva/Atm;", "mapBounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "userLocation", "Landroid/location/Location;", "loading", "", "isLocationPermissionGranted", "isLocationSettingEnabled", "<init>", "(Ljava/util/List;Lcom/google/android/gms/maps/model/LatLngBounds;Landroid/location/Location;ZZZ)V", "getAtms", "()Ljava/util/List;", "getMapBounds", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "getUserLocation", "()Landroid/location/Location;", "getLoading", "()Z", "filteredAtms", "getFilteredAtms", "loadState", "Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState$LoadState;", "getLoadState", "()Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState$LoadState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "LoadState", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class AtmFinderViewState {
    public static final int $stable = 8;
    private final List<Atm> atms;
    private final List<Atm> filteredAtms;
    private final boolean isLocationPermissionGranted;
    private final boolean isLocationSettingEnabled;
    private final boolean loading;
    private final LatLngBounds mapBounds;
    private final Location userLocation;

    public AtmFinderViewState() {
        this(null, null, null, false, false, false, 63, null);
    }

    public static /* synthetic */ AtmFinderViewState copy$default(AtmFinderViewState atmFinderViewState, List list, LatLngBounds latLngBounds, Location location, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = atmFinderViewState.atms;
        }
        if ((i & 2) != 0) {
            latLngBounds = atmFinderViewState.mapBounds;
        }
        if ((i & 4) != 0) {
            location = atmFinderViewState.userLocation;
        }
        if ((i & 8) != 0) {
            z = atmFinderViewState.loading;
        }
        if ((i & 16) != 0) {
            z2 = atmFinderViewState.isLocationPermissionGranted;
        }
        if ((i & 32) != 0) {
            z3 = atmFinderViewState.isLocationSettingEnabled;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return atmFinderViewState.copy(list, latLngBounds, location, z, z4, z5);
    }

    public final List<Atm> component1() {
        return this.atms;
    }

    /* renamed from: component2, reason: from getter */
    public final LatLngBounds getMapBounds() {
        return this.mapBounds;
    }

    /* renamed from: component3, reason: from getter */
    public final Location getUserLocation() {
        return this.userLocation;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLocationPermissionGranted() {
        return this.isLocationPermissionGranted;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLocationSettingEnabled() {
        return this.isLocationSettingEnabled;
    }

    public final AtmFinderViewState copy(List<Atm> atms, LatLngBounds mapBounds, Location userLocation, boolean loading, boolean isLocationPermissionGranted, boolean isLocationSettingEnabled) {
        Intrinsics.checkNotNullParameter(atms, "atms");
        return new AtmFinderViewState(atms, mapBounds, userLocation, loading, isLocationPermissionGranted, isLocationSettingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtmFinderViewState)) {
            return false;
        }
        AtmFinderViewState atmFinderViewState = (AtmFinderViewState) other;
        return Intrinsics.areEqual(this.atms, atmFinderViewState.atms) && Intrinsics.areEqual(this.mapBounds, atmFinderViewState.mapBounds) && Intrinsics.areEqual(this.userLocation, atmFinderViewState.userLocation) && this.loading == atmFinderViewState.loading && this.isLocationPermissionGranted == atmFinderViewState.isLocationPermissionGranted && this.isLocationSettingEnabled == atmFinderViewState.isLocationSettingEnabled;
    }

    public int hashCode() {
        int iHashCode = this.atms.hashCode() * 31;
        LatLngBounds latLngBounds = this.mapBounds;
        int iHashCode2 = (iHashCode + (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 31;
        Location location = this.userLocation;
        return ((((((iHashCode2 + (location != null ? location.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.isLocationPermissionGranted)) * 31) + Boolean.hashCode(this.isLocationSettingEnabled);
    }

    public String toString() {
        return "AtmFinderViewState(atms=" + this.atms + ", mapBounds=" + this.mapBounds + ", userLocation=" + this.userLocation + ", loading=" + this.loading + ", isLocationPermissionGranted=" + this.isLocationPermissionGranted + ", isLocationSettingEnabled=" + this.isLocationSettingEnabled + ")";
    }

    public AtmFinderViewState(List<Atm> atms, LatLngBounds latLngBounds, Location location, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(atms, "atms");
        this.atms = atms;
        this.mapBounds = latLngBounds;
        this.userLocation = location;
        this.loading = z;
        this.isLocationPermissionGranted = z2;
        this.isLocationSettingEnabled = z3;
        if (latLngBounds != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : atms) {
                Atm atm = (Atm) obj;
                if (this.mapBounds.contains(new LatLng(atm.getLatitude(), atm.getLongitude()))) {
                    arrayList.add(obj);
                }
            }
            atms = arrayList;
        }
        this.filteredAtms = atms;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AtmFinderViewState(java.util.List r2, com.google.android.gms.maps.model.LatLngBounds r3, android.location.Location r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Le
            r3 = r0
        Le:
            r9 = r8 & 4
            if (r9 == 0) goto L13
            r4 = r0
        L13:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            r5 = 1
        L18:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1e
            r6 = r0
        L1e:
            r8 = r8 & 32
            if (r8 == 0) goto L2a
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L31
        L2a:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L31:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.cash.atm.p069ui.AtmFinderViewState.<init>(java.util.List, com.google.android.gms.maps.model.LatLngBounds, android.location.Location, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<Atm> getAtms() {
        return this.atms;
    }

    public final LatLngBounds getMapBounds() {
        return this.mapBounds;
    }

    public final Location getUserLocation() {
        return this.userLocation;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean isLocationPermissionGranted() {
        return this.isLocationPermissionGranted;
    }

    public final boolean isLocationSettingEnabled() {
        return this.isLocationSettingEnabled;
    }

    public final List<Atm> getFilteredAtms() {
        return this.filteredAtms;
    }

    public final LoadState getLoadState() {
        if (!this.isLocationSettingEnabled) {
            return LoadState.SETTING_DISABLED;
        }
        if (!this.isLocationPermissionGranted) {
            return LoadState.NO_PERMISSION;
        }
        if (this.loading) {
            return LoadState.LOADING;
        }
        if (!this.filteredAtms.isEmpty()) {
            return LoadState.LOADED;
        }
        if (!this.loading) {
            return LoadState.EMPTY;
        }
        throw new IllegalStateException(("Unknown configuration: " + this).toString());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtmFinderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState$LoadState;", "", "isActiveState", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "LOADING", "EMPTY", "LOADED", "SETTING_DISABLED", "NO_PERMISSION", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LoadState[] $VALUES;
        private final boolean isActiveState;
        public static final LoadState LOADING = new LoadState("LOADING", 0, true);
        public static final LoadState EMPTY = new LoadState("EMPTY", 1, true);
        public static final LoadState LOADED = new LoadState("LOADED", 2, true);
        public static final LoadState SETTING_DISABLED = new LoadState("SETTING_DISABLED", 3, false);
        public static final LoadState NO_PERMISSION = new LoadState("NO_PERMISSION", 4, false);

        private static final /* synthetic */ LoadState[] $values() {
            return new LoadState[]{LOADING, EMPTY, LOADED, SETTING_DISABLED, NO_PERMISSION};
        }

        public static EnumEntries<LoadState> getEntries() {
            return $ENTRIES;
        }

        private LoadState(String str, int i, boolean z) {
            this.isActiveState = z;
        }

        /* renamed from: isActiveState, reason: from getter */
        public final boolean getIsActiveState() {
            return this.isActiveState;
        }

        static {
            LoadState[] loadStateArr$values = $values();
            $VALUES = loadStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(loadStateArr$values);
        }

        public static LoadState valueOf(String str) {
            return (LoadState) Enum.valueOf(LoadState.class, str);
        }

        public static LoadState[] values() {
            return (LoadState[]) $VALUES.clone();
        }
    }
}
