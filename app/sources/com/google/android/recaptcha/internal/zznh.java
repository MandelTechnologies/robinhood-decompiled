package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public class zznh extends zznf implements zzor {
    protected zznh(zzni zzniVar) {
        super(zzniVar);
    }

    @Override // com.google.android.recaptcha.internal.zznf, com.google.android.recaptcha.internal.zzop
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzni zzk() {
        if (!((zzni) this.zza).zzK()) {
            return (zzni) this.zza;
        }
        ((zzni) this.zza).zzb.zzg();
        return (zzni) super.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zznf
    protected final void zzn() {
        super.zzn();
        if (((zzni) this.zza).zzb != zznb.zzd()) {
            zzni zzniVar = (zzni) this.zza;
            zzniVar.zzb = zzniVar.zzb.clone();
        }
    }
}
