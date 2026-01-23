package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.q */
/* loaded from: classes27.dex */
public abstract class AbstractBinderC5211q extends BinderC5193b implements InterfaceC5212r {
    public AbstractBinderC5211q() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // com.google.android.play.integrity.internal.BinderC5193b
    /* renamed from: a */
    protected final boolean mo965a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) C5197c.m967a(parcel, Bundle.CREATOR);
        C5197c.m968b(parcel);
        mo872b(bundle);
        return true;
    }
}
