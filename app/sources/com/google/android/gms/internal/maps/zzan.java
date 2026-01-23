package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public final class zzan extends zza implements zzap {
    zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final boolean zzD(zzap zzapVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzapVar);
        Parcel parcelZzJ = zzJ(15, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final int zzh() throws RemoteException {
        Parcel parcelZzJ = zzJ(16, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final void zzp() throws RemoteException {
        zzc(1, zza());
    }
}
