package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzix extends Lambda implements Function0 {
    public static final zzix zza = new zzix();

    public zzix() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws zzbf {
        int i = zzax.zza;
        Object objZzb = zzaw.zza().zzb(zzfh.class.getName().hashCode());
        if (objZzb != null) {
            return (zzfh) objZzb;
        }
        throw new zzbf(zzbd.zzb, zzbc.zzax, null);
    }
}
