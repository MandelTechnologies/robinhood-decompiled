package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzd extends zza implements IInterface {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    public final void zzk(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(74, parcelZza);
    }

    public final void zzl(PushTokenizeRequest pushTokenizeRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pushTokenizeRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(28, parcelZza);
    }

    public final void zzm(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(10, parcelZza);
    }

    public final void zzr(ViewTokenRequest viewTokenRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, viewTokenRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(79, parcelZza);
    }
}
