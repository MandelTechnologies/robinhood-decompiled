package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public class zzob {
    protected volatile zzoq zza;
    private volatile zzlg zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzob)) {
            return false;
        }
        zzob zzobVar = (zzob) obj;
        zzoq zzoqVar = this.zza;
        zzoq zzoqVar2 = zzobVar.zza;
        if (zzoqVar == null && zzoqVar2 == null) {
            return zzb().equals(zzobVar.zzb());
        }
        if (zzoqVar != null && zzoqVar2 != null) {
            return zzoqVar.equals(zzoqVar2);
        }
        if (zzoqVar != null) {
            zzobVar.zzd(zzoqVar.zzaf());
            return zzoqVar.equals(zzobVar.zza);
        }
        zzd(zzoqVar2.zzaf());
        return this.zza.equals(zzoqVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzlf) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zzlg zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzlg.zzb;
                } else {
                    this.zzb = this.zza.zzb();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzoq zzc(zzoq zzoqVar) {
        zzoq zzoqVar2 = this.zza;
        this.zzb = null;
        this.zza = zzoqVar;
        return zzoqVar2;
    }

    protected final void zzd(zzoq zzoqVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzoqVar;
                this.zzb = zzlg.zzb;
            } catch (zznv unused) {
                this.zza = zzoqVar;
                this.zzb = zzlg.zzb;
            }
        }
    }
}
