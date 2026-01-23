package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.l */
/* loaded from: classes27.dex */
public final class C5206l extends C5166a implements InterfaceC5208n {
    C5206l(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5208n
    /* renamed from: c */
    public final void mo979c(Bundle bundle, InterfaceC5212r interfaceC5212r) throws RemoteException {
        Parcel parcelM914a = m914a();
        C5197c.m969c(parcelM914a, bundle);
        parcelM914a.writeStrongBinder(interfaceC5212r);
        m915b(3, parcelM914a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5208n
    /* renamed from: d */
    public final void mo980d(Bundle bundle, InterfaceC5210p interfaceC5210p) throws RemoteException {
        Parcel parcelM914a = m914a();
        C5197c.m969c(parcelM914a, bundle);
        parcelM914a.writeStrongBinder(interfaceC5210p);
        m915b(2, parcelM914a);
    }
}
