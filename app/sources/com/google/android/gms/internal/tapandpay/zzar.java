package com.google.android.gms.internal.tapandpay;

/* compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* loaded from: classes27.dex */
final class zzar extends zzao {
    private final zzat zza;

    zzar(zzat zzatVar, int i) {
        super(zzatVar.size(), i);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
