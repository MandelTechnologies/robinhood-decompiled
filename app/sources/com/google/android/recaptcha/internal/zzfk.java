package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzfk extends Lambda implements Function0 {
    public static final zzfk zza = new zzfk();

    public zzfk() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws zzbf {
        int i = zzax.zza;
        Object objZzb = zzaw.zza().zzb(zzez.class.getName().hashCode());
        if (objZzb != null) {
            return (zzez) objZzb;
        }
        throw new zzbf(zzbd.zzb, zzbc.zzax, null);
    }
}
