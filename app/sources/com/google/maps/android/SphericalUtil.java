package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes27.dex */
public class SphericalUtil {
    public static LatLng computeOffset(LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.latitude);
        double radians3 = Math.toRadians(latLng.longitude);
        double dCos = Math.cos(d3);
        double dSin = Math.sin(d3);
        double dSin2 = Math.sin(radians2);
        double dCos2 = dSin * Math.cos(radians2);
        double dCos3 = (dCos * dSin2) + (Math.cos(radians) * dCos2);
        return new LatLng(Math.toDegrees(Math.asin(dCos3)), Math.toDegrees(radians3 + Math.atan2(dCos2 * Math.sin(radians), dCos - (dSin2 * dCos3))));
    }

    private static double distanceRadians(double d, double d2, double d3, double d4) {
        return MathUtil.arcHav(MathUtil.havDistance(d, d3, d2 - d4));
    }

    static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }
}
