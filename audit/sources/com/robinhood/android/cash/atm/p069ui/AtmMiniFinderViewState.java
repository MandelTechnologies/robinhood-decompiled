package com.robinhood.android.cash.atm.p069ui;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.SphericalUtil;
import com.robinhood.android.cash.lib.atm.p072ui.MapPinDrawableFactory;
import com.robinhood.models.api.minerva.Atm;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtmMiniFinderViewState.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u001d\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b!J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÂ\u0003JM\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmMiniFinderViewState;", "", "isLocationPermissionAvailable", "", "isLocationSettingsEnabled", "populateAtmMarkers", "Lcom/robinhood/udf/UiEvent;", "", "atmList", "", "Lcom/robinhood/models/api/minerva/Atm;", "lastKnownDeviceLocation", "Lcom/google/android/gms/maps/model/LatLng;", "<init>", "(ZZLcom/robinhood/udf/UiEvent;Ljava/util/List;Lcom/google/android/gms/maps/model/LatLng;)V", "()Z", "getPopulateAtmMarkers", "()Lcom/robinhood/udf/UiEvent;", "isEnableLocationCardVisible", "latLngZoom", "Lcom/google/android/gms/maps/CameraUpdate;", "getLatLngZoom", "()Lcom/google/android/gms/maps/CameraUpdate;", "getAtmMarkers", "Lcom/google/android/gms/maps/model/MarkerOptions;", "mapPinDrawableFactory", "Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory;", "calculateBoundsFromClosestAtmDistance", "Lcom/google/android/gms/maps/model/LatLngBounds;", "closestAtm", "generateMarkerIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "isHighlighted", "generateMarkerIcon$feature_cash_atm_externalDebug", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class AtmMiniFinderViewState {
    private final List<Atm> atmList;
    private final boolean isLocationPermissionAvailable;
    private final boolean isLocationSettingsEnabled;
    private final LatLng lastKnownDeviceLocation;
    private final UiEvent<Unit> populateAtmMarkers;
    public static final int $stable = 8;
    private static final LatLng INITIAL_COORDINATES = new LatLng(39.8283459d, -98.5794797d);

    public AtmMiniFinderViewState() {
        this(false, false, null, null, null, 31, null);
    }

    private final List<Atm> component4() {
        return this.atmList;
    }

    /* renamed from: component5, reason: from getter */
    private final LatLng getLastKnownDeviceLocation() {
        return this.lastKnownDeviceLocation;
    }

    public static /* synthetic */ AtmMiniFinderViewState copy$default(AtmMiniFinderViewState atmMiniFinderViewState, boolean z, boolean z2, UiEvent uiEvent, List list, LatLng latLng, int i, Object obj) {
        if ((i & 1) != 0) {
            z = atmMiniFinderViewState.isLocationPermissionAvailable;
        }
        if ((i & 2) != 0) {
            z2 = atmMiniFinderViewState.isLocationSettingsEnabled;
        }
        if ((i & 4) != 0) {
            uiEvent = atmMiniFinderViewState.populateAtmMarkers;
        }
        if ((i & 8) != 0) {
            list = atmMiniFinderViewState.atmList;
        }
        if ((i & 16) != 0) {
            latLng = atmMiniFinderViewState.lastKnownDeviceLocation;
        }
        LatLng latLng2 = latLng;
        UiEvent uiEvent2 = uiEvent;
        return atmMiniFinderViewState.copy(z, z2, uiEvent2, list, latLng2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLocationPermissionAvailable() {
        return this.isLocationPermissionAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLocationSettingsEnabled() {
        return this.isLocationSettingsEnabled;
    }

    public final UiEvent<Unit> component3() {
        return this.populateAtmMarkers;
    }

    public final AtmMiniFinderViewState copy(boolean isLocationPermissionAvailable, boolean isLocationSettingsEnabled, UiEvent<Unit> populateAtmMarkers, List<Atm> atmList, LatLng lastKnownDeviceLocation) {
        return new AtmMiniFinderViewState(isLocationPermissionAvailable, isLocationSettingsEnabled, populateAtmMarkers, atmList, lastKnownDeviceLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtmMiniFinderViewState)) {
            return false;
        }
        AtmMiniFinderViewState atmMiniFinderViewState = (AtmMiniFinderViewState) other;
        return this.isLocationPermissionAvailable == atmMiniFinderViewState.isLocationPermissionAvailable && this.isLocationSettingsEnabled == atmMiniFinderViewState.isLocationSettingsEnabled && Intrinsics.areEqual(this.populateAtmMarkers, atmMiniFinderViewState.populateAtmMarkers) && Intrinsics.areEqual(this.atmList, atmMiniFinderViewState.atmList) && Intrinsics.areEqual(this.lastKnownDeviceLocation, atmMiniFinderViewState.lastKnownDeviceLocation);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLocationPermissionAvailable) * 31) + Boolean.hashCode(this.isLocationSettingsEnabled)) * 31;
        UiEvent<Unit> uiEvent = this.populateAtmMarkers;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        List<Atm> list = this.atmList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LatLng latLng = this.lastKnownDeviceLocation;
        return iHashCode3 + (latLng != null ? latLng.hashCode() : 0);
    }

    public String toString() {
        return "AtmMiniFinderViewState(isLocationPermissionAvailable=" + this.isLocationPermissionAvailable + ", isLocationSettingsEnabled=" + this.isLocationSettingsEnabled + ", populateAtmMarkers=" + this.populateAtmMarkers + ", atmList=" + this.atmList + ", lastKnownDeviceLocation=" + this.lastKnownDeviceLocation + ")";
    }

    public AtmMiniFinderViewState(boolean z, boolean z2, UiEvent<Unit> uiEvent, List<Atm> list, LatLng latLng) {
        this.isLocationPermissionAvailable = z;
        this.isLocationSettingsEnabled = z2;
        this.populateAtmMarkers = uiEvent;
        this.atmList = list;
        this.lastKnownDeviceLocation = latLng;
    }

    public /* synthetic */ AtmMiniFinderViewState(boolean z, boolean z2, UiEvent uiEvent, List list, LatLng latLng, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : latLng);
    }

    public final boolean isLocationPermissionAvailable() {
        return this.isLocationPermissionAvailable;
    }

    public final boolean isLocationSettingsEnabled() {
        return this.isLocationSettingsEnabled;
    }

    public final UiEvent<Unit> getPopulateAtmMarkers() {
        return this.populateAtmMarkers;
    }

    public final boolean isEnableLocationCardVisible() {
        return (this.isLocationSettingsEnabled && this.isLocationPermissionAvailable) ? false : true;
    }

    public final CameraUpdate getLatLngZoom() {
        List<Atm> list;
        LatLng latLng = this.lastKnownDeviceLocation;
        if (latLng != null && (list = this.atmList) != null) {
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(calculateBoundsFromClosestAtmDistance(latLng, (Atm) CollectionsKt.first((List) list)), 20);
            Intrinsics.checkNotNull(cameraUpdateNewLatLngBounds);
            return cameraUpdateNewLatLngBounds;
        }
        if (latLng != null) {
            CameraUpdate cameraUpdateNewLatLngZoom = CameraUpdateFactory.newLatLngZoom(latLng, 10.0f);
            Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngZoom, "newLatLngZoom(...)");
            return cameraUpdateNewLatLngZoom;
        }
        CameraUpdate cameraUpdateNewLatLngZoom2 = CameraUpdateFactory.newLatLngZoom(INITIAL_COORDINATES, 3.0f);
        Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngZoom2, "newLatLngZoom(...)");
        return cameraUpdateNewLatLngZoom2;
    }

    public final List<MarkerOptions> getAtmMarkers(MapPinDrawableFactory mapPinDrawableFactory) {
        List listTake;
        Intrinsics.checkNotNullParameter(mapPinDrawableFactory, "mapPinDrawableFactory");
        List<Atm> list = this.atmList;
        if (list != null && (listTake = CollectionsKt.take(list, 5)) != null) {
            List list2 = listTake;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Atm atm = (Atm) obj;
                boolean z = true;
                MarkerOptions markerOptionsFlat = new MarkerOptions().draggable(false).position(new LatLng(atm.getLatitude(), atm.getLongitude())).flat(true);
                if (i != 0) {
                    z = false;
                }
                arrayList.add(markerOptionsFlat.icon(generateMarkerIcon$feature_cash_atm_externalDebug(z, mapPinDrawableFactory)));
                i = i2;
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private final LatLngBounds calculateBoundsFromClosestAtmDistance(LatLng lastKnownDeviceLocation, Atm closestAtm) {
        LatLng latLng = new LatLng(closestAtm.getLatitude(), closestAtm.getLongitude());
        double dComputeDistanceBetween = SphericalUtil.computeDistanceBetween(latLng, lastKnownDeviceLocation) + 20;
        LatLng latLngComputeOffset = SphericalUtil.computeOffset(lastKnownDeviceLocation, dComputeDistanceBetween, 0.0d);
        LatLng latLngComputeOffset2 = SphericalUtil.computeOffset(lastKnownDeviceLocation, dComputeDistanceBetween, 90.0d);
        LatLngBounds latLngBoundsBuild = new LatLngBounds.Builder().include(latLng).include(lastKnownDeviceLocation).include(latLngComputeOffset).include(latLngComputeOffset2).include(SphericalUtil.computeOffset(lastKnownDeviceLocation, dComputeDistanceBetween, 180.0d)).include(SphericalUtil.computeOffset(lastKnownDeviceLocation, dComputeDistanceBetween, -90.0d)).build();
        Intrinsics.checkNotNullExpressionValue(latLngBoundsBuild, "build(...)");
        return latLngBoundsBuild;
    }

    public final BitmapDescriptor generateMarkerIcon$feature_cash_atm_externalDebug(boolean isHighlighted, MapPinDrawableFactory mapPinDrawableFactory) {
        Intrinsics.checkNotNullParameter(mapPinDrawableFactory, "mapPinDrawableFactory");
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(mapPinDrawableFactory.generateBitmap(MapPinDrawableFactory.Type.INSTANCE.fromHighlighted(isHighlighted)));
        Intrinsics.checkNotNullExpressionValue(bitmapDescriptorFromBitmap, "fromBitmap(...)");
        return bitmapDescriptorFromBitmap;
    }
}
