package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public interface zzf extends IInterface {
    int zzd() throws RemoteException;

    ICameraUpdateFactoryDelegate zze() throws RemoteException;

    IMapViewDelegate zzg(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) throws RemoteException;

    com.google.android.gms.internal.maps.zzi zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void zzl(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;
}
