package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.m */
/* loaded from: classes27.dex */
public abstract class AbstractBinderC5207m extends BinderC5193b implements InterfaceC5208n {
    /* renamed from: b */
    public static InterfaceC5208n m981b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5208n ? (InterfaceC5208n) iInterfaceQueryLocalInterface : new C5206l(iBinder);
    }
}
