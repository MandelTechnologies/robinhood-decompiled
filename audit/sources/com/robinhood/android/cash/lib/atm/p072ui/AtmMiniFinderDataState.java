package com.robinhood.android.cash.lib.atm.p072ui;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.SphericalUtil;
import com.robinhood.models.api.minerva.Atm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtmMiniFinderDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÂ\u0003J'\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderDataState;", "", "atmList", "", "Lcom/robinhood/models/api/minerva/Atm;", "lastKnownDeviceLocation", "Lcom/google/android/gms/maps/model/LatLng;", "<init>", "(Ljava/util/List;Lcom/google/android/gms/maps/model/LatLng;)V", "latLngZoom", "Lcom/google/android/gms/maps/CameraUpdate;", "getLatLngZoom", "()Lcom/google/android/gms/maps/CameraUpdate;", "atmPositions", "getAtmPositions", "()Ljava/util/List;", "calculateBoundsFromClosestAtmDistance", "Lcom/google/android/gms/maps/model/LatLngBounds;", "closestAtm", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class AtmMiniFinderDataState {
    private static final int DEFAULT_BOUNDS_PADDING = 20;
    private static final float DEFAULT_ZOOM = 10.0f;
    private static final float MIN_ZOOM = 3.0f;
    private final List<Atm> atmList;
    private final LatLng lastKnownDeviceLocation;
    public static final int $stable = 8;
    private static final LatLng INITIAL_COORDINATES = new LatLng(39.8283459d, -98.5794797d);

    /* JADX WARN: Multi-variable type inference failed */
    public AtmMiniFinderDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final List<Atm> component1() {
        return this.atmList;
    }

    /* renamed from: component2, reason: from getter */
    private final LatLng getLastKnownDeviceLocation() {
        return this.lastKnownDeviceLocation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AtmMiniFinderDataState copy$default(AtmMiniFinderDataState atmMiniFinderDataState, List list, LatLng latLng, int i, Object obj) {
        if ((i & 1) != 0) {
            list = atmMiniFinderDataState.atmList;
        }
        if ((i & 2) != 0) {
            latLng = atmMiniFinderDataState.lastKnownDeviceLocation;
        }
        return atmMiniFinderDataState.copy(list, latLng);
    }

    public final AtmMiniFinderDataState copy(List<Atm> atmList, LatLng lastKnownDeviceLocation) {
        return new AtmMiniFinderDataState(atmList, lastKnownDeviceLocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtmMiniFinderDataState)) {
            return false;
        }
        AtmMiniFinderDataState atmMiniFinderDataState = (AtmMiniFinderDataState) other;
        return Intrinsics.areEqual(this.atmList, atmMiniFinderDataState.atmList) && Intrinsics.areEqual(this.lastKnownDeviceLocation, atmMiniFinderDataState.lastKnownDeviceLocation);
    }

    public int hashCode() {
        List<Atm> list = this.atmList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        LatLng latLng = this.lastKnownDeviceLocation;
        return iHashCode + (latLng != null ? latLng.hashCode() : 0);
    }

    public String toString() {
        return "AtmMiniFinderDataState(atmList=" + this.atmList + ", lastKnownDeviceLocation=" + this.lastKnownDeviceLocation + ")";
    }

    public AtmMiniFinderDataState(List<Atm> list, LatLng latLng) {
        this.atmList = list;
        this.lastKnownDeviceLocation = latLng;
    }

    public /* synthetic */ AtmMiniFinderDataState(List list, LatLng latLng, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : latLng);
    }

    public final CameraUpdate getLatLngZoom() {
        List<Atm> list;
        if (this.lastKnownDeviceLocation != null && (list = this.atmList) != null && !list.isEmpty()) {
            CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(calculateBoundsFromClosestAtmDistance(this.lastKnownDeviceLocation, (Atm) CollectionsKt.first((List) this.atmList)), 20);
            Intrinsics.checkNotNull(cameraUpdateNewLatLngBounds);
            return cameraUpdateNewLatLngBounds;
        }
        LatLng latLng = this.lastKnownDeviceLocation;
        if (latLng != null) {
            CameraUpdate cameraUpdateNewLatLngZoom = CameraUpdateFactory.newLatLngZoom(latLng, 10.0f);
            Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngZoom, "newLatLngZoom(...)");
            return cameraUpdateNewLatLngZoom;
        }
        CameraUpdate cameraUpdateNewLatLngZoom2 = CameraUpdateFactory.newLatLngZoom(INITIAL_COORDINATES, 3.0f);
        Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngZoom2, "newLatLngZoom(...)");
        return cameraUpdateNewLatLngZoom2;
    }

    public final List<LatLng> getAtmPositions() {
        ArrayList arrayList;
        List listTake;
        List<Atm> list = this.atmList;
        if (list == null || (listTake = CollectionsKt.take(list, 5)) == null) {
            arrayList = null;
        } else {
            List<Atm> list2 = listTake;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Atm atm : list2) {
                arrayList.add(new LatLng(atm.getLatitude(), atm.getLongitude()));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
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
}
