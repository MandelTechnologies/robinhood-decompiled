package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.j */
/* loaded from: classes27.dex */
public abstract class AbstractBinderC5204j extends BinderC5193b implements InterfaceC5205k {
    public AbstractBinderC5204j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.BinderC5193b
    /* renamed from: a */
    protected final boolean mo965a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Bundle bundle = (Bundle) C5197c.m967a(parcel, Bundle.CREATOR);
            C5197c.m968b(parcel);
            mo886e(bundle);
            return true;
        }
        if (i == 3) {
            Bundle bundle2 = (Bundle) C5197c.m967a(parcel, Bundle.CREATOR);
            C5197c.m968b(parcel);
            mo884c(bundle2);
            return true;
        }
        if (i == 4) {
            Bundle bundle3 = (Bundle) C5197c.m967a(parcel, Bundle.CREATOR);
            C5197c.m968b(parcel);
            mo885d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) C5197c.m967a(parcel, Bundle.CREATOR);
        C5197c.m968b(parcel);
        mo883b(bundle4);
        return true;
    }
}
