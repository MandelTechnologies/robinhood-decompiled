package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.h */
/* loaded from: classes27.dex */
public abstract class AbstractBinderC5202h extends BinderC5193b implements InterfaceC5203i {
    /* renamed from: b */
    public static InterfaceC5203i m978b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5203i ? (InterfaceC5203i) iInterfaceQueryLocalInterface : new C5201g(iBinder);
    }
}
