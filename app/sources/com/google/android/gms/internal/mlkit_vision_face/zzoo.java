package com.google.android.gms.internal.mlkit_vision_face;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes27.dex */
public final class zzoo {
    private static zzoo zza;

    private zzoo() {
    }

    public static synchronized zzoo zza() {
        try {
            if (zza == null) {
                zza = new zzoo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
