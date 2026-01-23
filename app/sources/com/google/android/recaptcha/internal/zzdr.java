package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzdr extends Lambda implements Function0 {
    public static final zzdr zza = new zzdr();

    public zzdr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws zzbf {
        int i = zzax.zza;
        Object objZzb = zzaw.zza().zzb(zzfl.class.getName().hashCode());
        if (objZzb != null) {
            return (zzfl) objZzb;
        }
        throw new zzbf(zzbd.zzb, zzbc.zzax, null);
    }
}
