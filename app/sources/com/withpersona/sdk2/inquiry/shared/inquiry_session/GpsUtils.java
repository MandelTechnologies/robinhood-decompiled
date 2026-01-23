package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GpsUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0006"}, m3636d2 = {"getLocationAndPrecision", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsData;", "context", "Landroid/content/Context;", "isGpsEnabled", "", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class GpsUtils {
    public static final GpsData getLocationAndPrecision(Context context) {
        Location lastKnownLocation;
        GpsPrecisionAuthorization gpsPrecisionAuthorization;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        try {
            int iCheckSelfPermission = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION");
            int iCheckSelfPermission2 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
            if (iCheckSelfPermission == 0) {
                lastKnownLocation = locationManager.getLastKnownLocation("gps");
            } else {
                lastKnownLocation = iCheckSelfPermission2 == 0 ? locationManager.getLastKnownLocation("network") : null;
            }
            if (iCheckSelfPermission == 0) {
                gpsPrecisionAuthorization = GpsPrecisionAuthorization.PRECISE;
            } else {
                gpsPrecisionAuthorization = iCheckSelfPermission2 == 0 ? GpsPrecisionAuthorization.ROUGH : null;
            }
            if (lastKnownLocation != null && gpsPrecisionAuthorization != null) {
                return new GpsData(lastKnownLocation, gpsPrecisionAuthorization);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final boolean isGpsEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }
}
