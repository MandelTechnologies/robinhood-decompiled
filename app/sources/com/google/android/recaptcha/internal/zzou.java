package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzou implements zzpe {
    private final zzoq zza;
    private final zzpv zzb;
    private final boolean zzc;
    private final zzmx zzd;

    private zzou(zzpv zzpvVar, zzmx zzmxVar, zzoq zzoqVar) {
        this.zzb = zzpvVar;
        this.zzc = zzoqVar instanceof zzni;
        this.zzd = zzmxVar;
        this.zza = zzoqVar;
    }

    static zzou zzc(zzpv zzpvVar, zzmx zzmxVar, zzoq zzoqVar) {
        return new zzou(zzpvVar, zzmxVar, zzoqVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final int zza(Object obj) {
        int iZzb = ((zznl) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzni) obj).zzb.zzb() : iZzb;
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final int zzb(Object obj) {
        int iHashCode = ((zznl) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzni) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final Object zze() {
        zzoq zzoqVar = this.zza;
        return zzoqVar instanceof zznl ? ((zznl) zzoqVar).zzu() : zzoqVar.zzad().zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zzg(Object obj, Object obj2) {
        zzpg.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzpg.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zzh(Object obj, zzpd zzpdVar, zzmw zzmwVar) throws IOException {
        boolean zZzO;
        zzpv zzpvVar = this.zzb;
        Object objZza = zzpvVar.zza(obj);
        ((zzni) obj).zzi();
        while (zzpdVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzpdVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) != 2) {
                        zZzO = zzpdVar.zzO();
                    } else {
                        if (zzmwVar.zza(this.zza, iZzd >>> 3) != null) {
                            throw null;
                        }
                        zZzO = zzpvVar.zzk(objZza, zzpdVar, 0);
                    }
                    if (!zZzO) {
                        break;
                    }
                } else {
                    zznk zznkVarZza = null;
                    zzlg zzlgVarZzp = null;
                    while (zzpdVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzpdVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzpdVar.zzj();
                            zznkVarZza = zzmwVar.zza(this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (zznkVarZza != null) {
                                throw null;
                            }
                            zzlgVarZzp = zzpdVar.zzp();
                        } else if (!zzpdVar.zzO()) {
                            break;
                        }
                    }
                    if (zzpdVar.zzd() != 12) {
                        throw new zznv("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzlgVarZzp == null) {
                        continue;
                    } else {
                        if (zznkVarZza != null) {
                            throw null;
                        }
                        zzpvVar.zzg(objZza, iZzj, zzlgVarZzp);
                    }
                }
            } finally {
                zzpvVar.zzj(obj, objZza);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r12 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r6.zzj((r11 << 3) | 2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        r12 = r13;
        r11 = r3;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b A[EDGE_INSN: B:58:0x008b->B:35:0x008b BREAK  A[LOOP:1: B:18:0x004e->B:63:0x004e], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
        int iZzi;
        zznl zznlVar = (zznl) obj;
        zzpw zzpwVarZzf = zznlVar.zzc;
        if (zzpwVarZzf == zzpw.zzc()) {
            zzpwVarZzf = zzpw.zzf();
            zznlVar.zzc = zzpwVarZzf;
        }
        zzpw zzpwVar = zzpwVarZzf;
        ((zzni) obj).zzi();
        zznk zznkVarZza = null;
        while (i < i2) {
            int iZzi2 = zzkw.zzi(bArr, i, zzkvVar);
            int i3 = zzkvVar.zza;
            if (i3 == 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                zzkv zzkvVar2 = zzkvVar;
                int i5 = 0;
                zzlg zzlgVar = null;
                while (true) {
                    if (iZzi2 >= i4) {
                        iZzi = iZzi2;
                        break;
                    }
                    iZzi = zzkw.zzi(bArr2, iZzi2, zzkvVar2);
                    int i6 = zzkvVar2.zza;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (zznkVarZza != null) {
                                int i9 = zzpa.zza;
                                throw null;
                            }
                            if (i8 == 2) {
                                iZzi2 = zzkw.zza(bArr2, iZzi, zzkvVar2);
                                zzlgVar = (zzlg) zzkvVar2.zzc;
                            }
                        }
                        if (i6 != 12) {
                            break;
                        } else {
                            iZzi2 = zzkw.zzo(i6, bArr2, iZzi, i4, zzkvVar2);
                        }
                    } else if (i8 == 0) {
                        iZzi2 = zzkw.zzi(bArr2, iZzi, zzkvVar2);
                        i5 = zzkvVar2.zza;
                        zznkVarZza = zzkvVar2.zzd.zza(this.zza, i5);
                    } else if (i6 != 12) {
                    }
                }
            } else if ((i3 & 7) == 2) {
                zznkVarZza = zzkvVar.zzd.zza(this.zza, i3 >>> 3);
                if (zznkVarZza != null) {
                    int i10 = zzpa.zza;
                    throw null;
                }
                i = zzkw.zzh(i3, bArr, iZzi2, i2, zzpwVar, zzkvVar);
            } else {
                i = zzkw.zzo(i3, bArr, iZzi2, i2, zzkvVar);
            }
        }
        if (i != i2) {
            throw new zznv("Failed to parse the message.");
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zzj(Object obj, zzqi zzqiVar) throws IOException {
        Iterator itZzf = ((zzni) obj).zzb.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzna zznaVar = (zzna) entry.getKey();
            if (zznaVar.zze() != zzqh.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zznaVar.zzg();
            zznaVar.zzf();
            if (entry instanceof zzny) {
                zzqiVar.zzw(zznaVar.zza(), ((zzny) entry).zza().zzb());
            } else {
                zzqiVar.zzw(zznaVar.zza(), entry.getValue());
            }
        }
        ((zznl) obj).zzc.zzk(zzqiVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zznl) obj).zzc.equals(((zznl) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzni) obj).zzb.equals(((zzni) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final boolean zzl(Object obj) {
        return ((zzni) obj).zzb.zzk();
    }
}
