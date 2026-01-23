package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzi;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public final class BitmapDescriptorFactory {
    private static zzi zza;

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap, "image must not be null");
        try {
            return new BitmapDescriptor(zzb().zzg(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static void zza(zzi zziVar) {
        if (zza != null) {
            return;
        }
        zza = (zzi) Preconditions.checkNotNull(zziVar, "delegate must not be null");
    }

    private static zzi zzb() {
        return (zzi) Preconditions.checkNotNull(zza, "IBitmapDescriptorFactory is not initialized");
    }

    public static BitmapDescriptor defaultMarker(float f) {
        try {
            return new BitmapDescriptor(zzb().zze(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
