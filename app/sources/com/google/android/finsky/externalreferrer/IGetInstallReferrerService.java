package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p049a.BaseProxy;
import com.google.android.p049a.BaseStub;
import com.google.android.p049a.Codecs;

/* loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* loaded from: classes16.dex */
    public static abstract class Stub extends BaseStub implements IGetInstallReferrerService {

        public static class Proxy extends BaseProxy implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            /* renamed from: c */
            public final Bundle mo797c(Bundle bundle) throws RemoteException {
                Parcel parcelM786a = m786a();
                Codecs.m789b(parcelM786a, bundle);
                Parcel parcelM787b = m787b(parcelM786a);
                Bundle bundle2 = (Bundle) Codecs.m788a(parcelM787b, Bundle.CREATOR);
                parcelM787b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m798b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    /* renamed from: c */
    Bundle mo797c(Bundle bundle) throws RemoteException;
}
