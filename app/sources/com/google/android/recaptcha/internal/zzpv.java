package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
abstract class zzpv {
    private static volatile int zza = 100;

    zzpv() {
    }

    abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i, int i2);

    abstract void zze(Object obj, int i, long j);

    abstract void zzf(Object obj, int i, Object obj2);

    abstract void zzg(Object obj, int i, zzlg zzlgVar);

    abstract void zzh(Object obj, int i, long j);

    abstract void zzi(Object obj);

    abstract void zzj(Object obj, Object obj2);

    final boolean zzk(Object obj, zzpd zzpdVar, int i) throws IOException {
        int iZzd = zzpdVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzh(obj, i2, zzpdVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zze(obj, i2, zzpdVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzg(obj, i2, zzpdVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw new zznu("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i2, zzpdVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new zznv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzpdVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzpdVar, i5)) {
        }
        if ((i4 | 4) != zzpdVar.zzd()) {
            throw new zznv("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i2, zzc(objZzb));
        return true;
    }
}
