package com.google.android.p049a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: BaseProxy.java */
/* renamed from: com.google.android.a.a, reason: use source file name */
/* loaded from: classes4.dex */
public class BaseProxy implements IInterface {

    /* renamed from: a */
    private final IBinder f669a;

    /* renamed from: b */
    private final String f670b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected BaseProxy(IBinder iBinder) {
        this.f669a = iBinder;
    }

    /* renamed from: a */
    protected final Parcel m786a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f670b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f669a;
    }

    /* renamed from: b */
    protected final Parcel m787b(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f669a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
