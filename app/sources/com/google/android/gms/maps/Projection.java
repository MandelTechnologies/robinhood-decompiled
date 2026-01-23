package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public final class Projection {
    private final IProjectionDelegate zza;

    Projection(IProjectionDelegate iProjectionDelegate) {
        this.zza = iProjectionDelegate;
    }

    public VisibleRegion getVisibleRegion() {
        try {
            return this.zza.getVisibleRegion();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
