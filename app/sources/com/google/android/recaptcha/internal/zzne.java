package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzne implements zzoo {
    private static final zzne zza = new zzne();

    private zzne() {
    }

    public static zzne zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzoo
    public final zzon zzb(Class cls) {
        if (!zznl.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzon) zznl.zzt(cls.asSubclass(zznl.class)).zzh(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzoo
    public final boolean zzc(Class cls) {
        return zznl.class.isAssignableFrom(cls);
    }
}
