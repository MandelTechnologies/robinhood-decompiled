package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public final class zzt extends zza implements zzv {
    zzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzv
    public final int zzi() throws RemoteException {
        Parcel parcelZzJ = zzJ(20, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzv
    public final void zzn() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzv
    public final boolean zzz(zzv zzvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzvVar);
        Parcel parcelZzJ = zzJ(19, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
