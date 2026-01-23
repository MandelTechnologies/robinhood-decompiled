package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzmy extends zzmx {
    zzmy() {
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    final void zza(Object obj) {
        ((zzni) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    final void zzb(zzqi zzqiVar, Map.Entry entry) throws IOException {
        zznj zznjVar = (zznj) entry.getKey();
        zzqg zzqgVar = zzqg.zza;
        switch (zznjVar.zzb.ordinal()) {
            case 0:
                zzqiVar.zzf(zznjVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzqiVar.zzo(zznjVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzqiVar.zzt(zznjVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzqiVar.zzK(zznjVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzqiVar.zzr(zznjVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzqiVar.zzm(zznjVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzqiVar.zzk(zznjVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzqiVar.zzb(zznjVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzqiVar.zzG(zznjVar.zza, (String) entry.getValue());
                break;
            case 9:
                zzqiVar.zzq(zznjVar.zza, entry.getValue(), zzpa.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzqiVar.zzv(zznjVar.zza, entry.getValue(), zzpa.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzqiVar.zzd(zznjVar.zza, (zzlg) entry.getValue());
                break;
            case 12:
                zzqiVar.zzI(zznjVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzqiVar.zzr(zznjVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zzqiVar.zzx(zznjVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzqiVar.zzz(zznjVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzqiVar.zzB(zznjVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzqiVar.zzD(zznjVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
