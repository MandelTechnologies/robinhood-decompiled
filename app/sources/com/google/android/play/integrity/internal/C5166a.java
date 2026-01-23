package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.a */
/* loaded from: classes27.dex */
public class C5166a implements IInterface {

    /* renamed from: a */
    private final IBinder f812a;

    /* renamed from: b */
    private final String f813b;

    protected C5166a(IBinder iBinder, String str) {
        this.f812a = iBinder;
        this.f813b = str;
    }

    /* renamed from: a */
    protected final Parcel m914a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f813b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f812a;
    }

    /* renamed from: b */
    protected final void m915b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f812a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
