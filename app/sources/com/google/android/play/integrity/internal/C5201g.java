package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.g */
/* loaded from: classes27.dex */
public final class C5201g extends C5166a implements InterfaceC5203i {
    C5201g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5203i
    /* renamed from: c */
    public final void mo975c(Bundle bundle, InterfaceC5212r interfaceC5212r) throws RemoteException {
        Parcel parcelM914a = m914a();
        C5197c.m969c(parcelM914a, bundle);
        parcelM914a.writeStrongBinder(interfaceC5212r);
        m915b(6, parcelM914a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5203i
    /* renamed from: d */
    public final void mo976d(Bundle bundle, InterfaceC5205k interfaceC5205k) throws RemoteException {
        Parcel parcelM914a = m914a();
        C5197c.m969c(parcelM914a, bundle);
        parcelM914a.writeStrongBinder(interfaceC5205k);
        m915b(3, parcelM914a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC5203i
    /* renamed from: e */
    public final void mo977e(Bundle bundle, InterfaceC5205k interfaceC5205k) throws RemoteException {
        Parcel parcelM914a = m914a();
        C5197c.m969c(parcelM914a, bundle);
        parcelM914a.writeStrongBinder(interfaceC5205k);
        m915b(2, parcelM914a);
    }
}
