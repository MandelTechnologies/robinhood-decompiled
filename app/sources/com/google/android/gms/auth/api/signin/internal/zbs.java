package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes27.dex */
public final class zbs extends com.google.android.gms.internal.p555authapi.zba implements IInterface {
    zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p555authapi.zbc.zbd(parcelZba, zbrVar);
        com.google.android.gms.internal.p555authapi.zbc.zbc(parcelZba, googleSignInOptions);
        zbb(103, parcelZba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p555authapi.zbc.zbd(parcelZba, zbrVar);
        com.google.android.gms.internal.p555authapi.zbc.zbc(parcelZba, googleSignInOptions);
        zbb(102, parcelZba);
    }
}
