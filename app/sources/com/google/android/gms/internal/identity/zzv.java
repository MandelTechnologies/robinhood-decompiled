package com.google.android.gms.internal.identity;

import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* loaded from: classes27.dex */
public interface zzv extends IInterface {
    void zzD(LocationSettingsRequest locationSettingsRequest, zzab zzabVar, String str) throws RemoteException;

    void zzq(LastLocationRequest lastLocationRequest, zzee zzeeVar) throws RemoteException;

    @Deprecated
    void zzr(LastLocationRequest lastLocationRequest, zzz zzzVar) throws RemoteException;

    @Deprecated
    Location zzs() throws RemoteException;

    ICancelToken zzt(CurrentLocationRequest currentLocationRequest, zzee zzeeVar) throws RemoteException;

    @Deprecated
    ICancelToken zzu(CurrentLocationRequest currentLocationRequest, zzz zzzVar) throws RemoteException;

    @Deprecated
    void zzv(zzei zzeiVar) throws RemoteException;

    void zzw(zzee zzeeVar, LocationRequest locationRequest, IStatusCallback iStatusCallback) throws RemoteException;

    void zzx(zzee zzeeVar, IStatusCallback iStatusCallback) throws RemoteException;
}
