package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public final class zzw extends zza implements zzy {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final int zzf() throws RemoteException {
        Parcel parcelZzJ = zzJ(6, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzy
    public final boolean zzh(zzy zzyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzyVar);
        Parcel parcelZzJ = zzJ(5, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
