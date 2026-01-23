package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzpx extends zzpv {
    zzpx() {
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zznl zznlVar = (zznl) obj;
        zzpw zzpwVar = zznlVar.zzc;
        if (zzpwVar != zzpw.zzc()) {
            return zzpwVar;
        }
        zzpw zzpwVarZzf = zzpw.zzf();
        zznlVar.zzc = zzpwVarZzf;
        return zzpwVarZzf;
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* synthetic */ Object zzb() {
        return zzpw.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* synthetic */ Object zzc(Object obj) {
        zzpw zzpwVar = (zzpw) obj;
        zzpwVar.zzh();
        return zzpwVar;
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i, int i2) {
        ((zzpw) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* bridge */ /* synthetic */ void zze(Object obj, int i, long j) {
        ((zzpw) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* bridge */ /* synthetic */ void zzf(Object obj, int i, Object obj2) {
        ((zzpw) obj).zzj((i << 3) | 3, (zzpw) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* bridge */ /* synthetic */ void zzg(Object obj, int i, zzlg zzlgVar) {
        ((zzpw) obj).zzj((i << 3) | 2, zzlgVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, long j) {
        ((zzpw) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final void zzi(Object obj) {
        ((zznl) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzpv
    final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zznl) obj).zzc = (zzpw) obj2;
    }
}
