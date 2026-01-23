package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzph extends zzpo {
    zzph() {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzpo
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                ((zzna) ((zzpi) zzg(i)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzna) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
