package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zznj implements zzna {
    final int zza;
    final zzqg zzb;

    zznj(zzno zznoVar, int i, zzqg zzqgVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zzqgVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zznj) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzna
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzna
    public final zzop zzb(zzop zzopVar, zzoq zzoqVar) {
        zznf zznfVar = (zznf) zzopVar;
        zznfVar.zzg((zznl) zzoqVar);
        return zznfVar;
    }

    @Override // com.google.android.recaptcha.internal.zzna
    public final zzov zzc(zzov zzovVar, zzov zzovVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.recaptcha.internal.zzna
    public final zzqg zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzna
    public final zzqh zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzna
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzna
    public final boolean zzg() {
        return false;
    }
}
