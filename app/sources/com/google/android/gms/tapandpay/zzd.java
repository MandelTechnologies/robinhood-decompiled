package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.tapandpay.zzah;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
public final class zzd extends zzah {
    private static final ListenerHolder.Notifier zza = new zzc();
    private final ListenerHolder zzb;

    public zzd(BaseImplementation$ResultHolder baseImplementation$ResultHolder, ListenerHolder listenerHolder) {
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzb() {
        this.zzb.notifyListener(zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzc(Status status) {
    }
}
