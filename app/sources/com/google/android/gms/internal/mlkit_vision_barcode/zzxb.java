package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.3.1 */
/* loaded from: classes27.dex */
public final class zzxb {
    private static zzxb zza;

    private zzxb() {
    }

    public static synchronized zzxb zza() {
        try {
            if (zza == null) {
                zza = new zzxb();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
