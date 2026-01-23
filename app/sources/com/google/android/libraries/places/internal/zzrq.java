package com.google.android.libraries.places.internal;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
public final class zzrq {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzru zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zzru] */
    static {
        zzrv zzrvVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzrvVar = new zzrv();
                break;
            }
            zzrvVar = null;
            try {
                zzrvVar = (zzru) Class.forName(zza[i]).asSubclass(zzru.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzrvVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzrvVar;
    }

    public static StackTraceElement zza(Class cls, int i) {
        zzrr.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
