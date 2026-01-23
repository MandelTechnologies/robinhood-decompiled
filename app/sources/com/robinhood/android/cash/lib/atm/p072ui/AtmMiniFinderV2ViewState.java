package com.robinhood.android.cash.lib.atm.p072ui;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtmMiniFinderV2ViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/AtmMiniFinderV2ViewState;", "", "latLngZoom", "Lcom/google/android/gms/maps/CameraUpdate;", "atmPositions", "", "Lcom/google/android/gms/maps/model/LatLng;", "<init>", "(Lcom/google/android/gms/maps/CameraUpdate;Ljava/util/List;)V", "getLatLngZoom", "()Lcom/google/android/gms/maps/CameraUpdate;", "getAtmPositions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AtmMiniFinderV2ViewState {
    public static final int $stable = 8;
    private final List<LatLng> atmPositions;
    private final CameraUpdate latLngZoom;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AtmMiniFinderV2ViewState copy$default(AtmMiniFinderV2ViewState atmMiniFinderV2ViewState, CameraUpdate cameraUpdate, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            cameraUpdate = atmMiniFinderV2ViewState.latLngZoom;
        }
        if ((i & 2) != 0) {
            list = atmMiniFinderV2ViewState.atmPositions;
        }
        return atmMiniFinderV2ViewState.copy(cameraUpdate, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CameraUpdate getLatLngZoom() {
        return this.latLngZoom;
    }

    public final List<LatLng> component2() {
        return this.atmPositions;
    }

    public final AtmMiniFinderV2ViewState copy(CameraUpdate latLngZoom, List<LatLng> atmPositions) {
        Intrinsics.checkNotNullParameter(latLngZoom, "latLngZoom");
        Intrinsics.checkNotNullParameter(atmPositions, "atmPositions");
        return new AtmMiniFinderV2ViewState(latLngZoom, atmPositions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtmMiniFinderV2ViewState)) {
            return false;
        }
        AtmMiniFinderV2ViewState atmMiniFinderV2ViewState = (AtmMiniFinderV2ViewState) other;
        return Intrinsics.areEqual(this.latLngZoom, atmMiniFinderV2ViewState.latLngZoom) && Intrinsics.areEqual(this.atmPositions, atmMiniFinderV2ViewState.atmPositions);
    }

    public int hashCode() {
        return (this.latLngZoom.hashCode() * 31) + this.atmPositions.hashCode();
    }

    public String toString() {
        return "AtmMiniFinderV2ViewState(latLngZoom=" + this.latLngZoom + ", atmPositions=" + this.atmPositions + ")";
    }

    public AtmMiniFinderV2ViewState(CameraUpdate latLngZoom, List<LatLng> atmPositions) {
        Intrinsics.checkNotNullParameter(latLngZoom, "latLngZoom");
        Intrinsics.checkNotNullParameter(atmPositions, "atmPositions");
        this.latLngZoom = latLngZoom;
        this.atmPositions = atmPositions;
    }

    public final CameraUpdate getLatLngZoom() {
        return this.latLngZoom;
    }

    public final List<LatLng> getAtmPositions() {
        return this.atmPositions;
    }
}
