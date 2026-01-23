package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzoi implements zzpf {
    private static final zzoo zza = new zzog();
    private final zzoo zzb;

    public zzoi() {
        zzne zzneVarZza = zzne.zza();
        int i = zzpa.zza;
        zzoh zzohVar = new zzoh(zzneVarZza, zza);
        byte[] bArr = zznt.zzb;
        this.zzb = zzohVar;
    }

    @Override // com.google.android.recaptcha.internal.zzpf
    public final zzpe zza(Class cls) {
        int i = zzpg.zza;
        if (!zznl.class.isAssignableFrom(cls)) {
            int i2 = zzpa.zza;
        }
        zzon zzonVarZzb = this.zzb.zzb(cls);
        if (zzonVarZzb.zzb()) {
            int i3 = zzpa.zza;
            return zzou.zzc(zzpg.zzm(), zzmz.zza(), zzonVarZzb.zza());
        }
        int i4 = zzpa.zza;
        return zzot.zzm(cls, zzonVarZzb, zzox.zza(), zzoe.zza(), zzpg.zzm(), zzonVarZzb.zzc() + (-1) != 1 ? zzmz.zza() : null, zzom.zza());
    }
}
