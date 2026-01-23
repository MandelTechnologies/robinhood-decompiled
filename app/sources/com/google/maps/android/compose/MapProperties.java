package com.google.maps.android.compose;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapProperties.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0002\u0010\u0010Jd\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006\""}, m3636d2 = {"Lcom/google/maps/android/compose/MapProperties;", "", "isBuildingEnabled", "", "isIndoorEnabled", "isMyLocationEnabled", "isTrafficEnabled", "latLngBoundsForCameraTarget", "Lcom/google/android/gms/maps/model/LatLngBounds;", "mapStyleOptions", "Lcom/google/android/gms/maps/model/MapStyleOptions;", "mapType", "Lcom/google/maps/android/compose/MapType;", "maxZoomPreference", "", "minZoomPreference", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/MapStyleOptions;Lcom/google/maps/android/compose/MapType;FF)V", "()Z", "getLatLngBoundsForCameraTarget", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "getMapStyleOptions", "()Lcom/google/android/gms/maps/model/MapStyleOptions;", "getMapType", "()Lcom/google/maps/android/compose/MapType;", "getMaxZoomPreference", "()F", "getMinZoomPreference", "copy", "equals", "other", "hashCode", "", "toString", "", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class MapProperties {
    public static final int $stable = 0;
    private final boolean isBuildingEnabled;
    private final boolean isIndoorEnabled;
    private final boolean isMyLocationEnabled;
    private final boolean isTrafficEnabled;
    private final LatLngBounds latLngBoundsForCameraTarget;
    private final MapStyleOptions mapStyleOptions;
    private final MapType mapType;
    private final float maxZoomPreference;
    private final float minZoomPreference;

    public MapProperties() {
        this(false, false, false, false, null, null, null, 0.0f, 0.0f, 511, null);
    }

    public MapProperties(boolean z, boolean z2, boolean z3, boolean z4, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, MapType mapType, float f, float f2) {
        Intrinsics.checkNotNullParameter(mapType, "mapType");
        this.isBuildingEnabled = z;
        this.isIndoorEnabled = z2;
        this.isMyLocationEnabled = z3;
        this.isTrafficEnabled = z4;
        this.latLngBoundsForCameraTarget = latLngBounds;
        this.mapStyleOptions = mapStyleOptions;
        this.mapType = mapType;
        this.maxZoomPreference = f;
        this.minZoomPreference = f2;
    }

    /* renamed from: isBuildingEnabled, reason: from getter */
    public final boolean getIsBuildingEnabled() {
        return this.isBuildingEnabled;
    }

    /* renamed from: isIndoorEnabled, reason: from getter */
    public final boolean getIsIndoorEnabled() {
        return this.isIndoorEnabled;
    }

    /* renamed from: isMyLocationEnabled, reason: from getter */
    public final boolean getIsMyLocationEnabled() {
        return this.isMyLocationEnabled;
    }

    /* renamed from: isTrafficEnabled, reason: from getter */
    public final boolean getIsTrafficEnabled() {
        return this.isTrafficEnabled;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.latLngBoundsForCameraTarget;
    }

    public final MapStyleOptions getMapStyleOptions() {
        return this.mapStyleOptions;
    }

    public /* synthetic */ MapProperties(boolean z, boolean z2, boolean z3, boolean z4, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, MapType mapType, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : latLngBounds, (i & 32) != 0 ? null : mapStyleOptions, (i & 64) != 0 ? MapType.NORMAL : mapType, (i & 128) != 0 ? 21.0f : f, (i & 256) != 0 ? 3.0f : f2);
    }

    public final MapType getMapType() {
        return this.mapType;
    }

    public final float getMaxZoomPreference() {
        return this.maxZoomPreference;
    }

    public final float getMinZoomPreference() {
        return this.minZoomPreference;
    }

    public String toString() {
        return "MapProperties(isBuildingEnabled=" + this.isBuildingEnabled + ", isIndoorEnabled=" + this.isIndoorEnabled + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", isTrafficEnabled=" + this.isTrafficEnabled + ", latLngBoundsForCameraTarget=" + this.latLngBoundsForCameraTarget + ", mapStyleOptions=" + this.mapStyleOptions + ", mapType=" + this.mapType + ", maxZoomPreference=" + this.maxZoomPreference + ", minZoomPreference=" + this.minZoomPreference + ')';
    }

    public boolean equals(Object other) {
        if (!(other instanceof MapProperties)) {
            return false;
        }
        MapProperties mapProperties = (MapProperties) other;
        return this.isBuildingEnabled == mapProperties.isBuildingEnabled && this.isIndoorEnabled == mapProperties.isIndoorEnabled && this.isMyLocationEnabled == mapProperties.isMyLocationEnabled && this.isTrafficEnabled == mapProperties.isTrafficEnabled && Intrinsics.areEqual(this.latLngBoundsForCameraTarget, mapProperties.latLngBoundsForCameraTarget) && Intrinsics.areEqual(this.mapStyleOptions, mapProperties.mapStyleOptions) && this.mapType == mapProperties.mapType && this.maxZoomPreference == mapProperties.maxZoomPreference && this.minZoomPreference == mapProperties.minZoomPreference;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isBuildingEnabled), Boolean.valueOf(this.isIndoorEnabled), Boolean.valueOf(this.isMyLocationEnabled), Boolean.valueOf(this.isTrafficEnabled), this.latLngBoundsForCameraTarget, this.mapStyleOptions, this.mapType, Float.valueOf(this.maxZoomPreference), Float.valueOf(this.minZoomPreference));
    }

    public static /* synthetic */ MapProperties copy$default(MapProperties mapProperties, boolean z, boolean z2, boolean z3, boolean z4, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, MapType mapType, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mapProperties.isBuildingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = mapProperties.isIndoorEnabled;
        }
        if ((i & 4) != 0) {
            z3 = mapProperties.isMyLocationEnabled;
        }
        if ((i & 8) != 0) {
            z4 = mapProperties.isTrafficEnabled;
        }
        if ((i & 16) != 0) {
            latLngBounds = mapProperties.latLngBoundsForCameraTarget;
        }
        if ((i & 32) != 0) {
            mapStyleOptions = mapProperties.mapStyleOptions;
        }
        if ((i & 64) != 0) {
            mapType = mapProperties.mapType;
        }
        if ((i & 128) != 0) {
            f = mapProperties.maxZoomPreference;
        }
        if ((i & 256) != 0) {
            f2 = mapProperties.minZoomPreference;
        }
        float f3 = f;
        float f4 = f2;
        MapStyleOptions mapStyleOptions2 = mapStyleOptions;
        MapType mapType2 = mapType;
        LatLngBounds latLngBounds2 = latLngBounds;
        boolean z5 = z3;
        return mapProperties.copy(z, z2, z5, z4, latLngBounds2, mapStyleOptions2, mapType2, f3, f4);
    }

    public final MapProperties copy(boolean isBuildingEnabled, boolean isIndoorEnabled, boolean isMyLocationEnabled, boolean isTrafficEnabled, LatLngBounds latLngBoundsForCameraTarget, MapStyleOptions mapStyleOptions, MapType mapType, float maxZoomPreference, float minZoomPreference) {
        Intrinsics.checkNotNullParameter(mapType, "mapType");
        return new MapProperties(isBuildingEnabled, isIndoorEnabled, isMyLocationEnabled, isTrafficEnabled, latLngBoundsForCameraTarget, mapStyleOptions, mapType, maxZoomPreference, minZoomPreference);
    }
}
