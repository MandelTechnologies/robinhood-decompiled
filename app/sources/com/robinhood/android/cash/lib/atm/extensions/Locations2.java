package com.robinhood.android.cash.lib.atm.extensions;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Locations.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "Landroid/location/Location;", "lib-cash-atm_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.lib.atm.extensions.LocationsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Locations2 {
    public static final LatLng toLatLng(Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return new LatLng(location.getLatitude(), location.getLongitude());
    }
}
