package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzls implements zzqi {
    private final zzlr zza;

    private zzls(zzlr zzlrVar) {
        byte[] bArr = zznt.zzb;
        this.zza = zzlrVar;
        zzlrVar.zza = this;
    }

    public static zzls zza(zzlr zzlrVar) {
        zzls zzlsVar = zzlrVar.zza;
        return zzlsVar != null ? zzlsVar : new zzls(zzlrVar);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzs(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzD(int i, long j) throws IOException {
        this.zza.zzu(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzr(i, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzp(i, str);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzs(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzd(int i, zzlg zzlgVar) throws IOException {
        this.zza.zze(i, zzlgVar);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzlg) list.get(i2));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzr(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzq(int i, Object obj, zzpe zzpeVar) throws IOException {
        zzlr zzlrVar = this.zza;
        zzlrVar.zzr(i, 3);
        zzpeVar.zzj((zzoq) obj, zzlrVar.zza);
        zzlrVar.zzr(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzu(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzv(int i, Object obj, zzpe zzpeVar) throws IOException {
        this.zza.zzm(i, (zzoq) obj, zzpeVar);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzlg) {
            this.zza.zzo(i, (zzlg) obj);
        } else {
            this.zza.zzn(i, (zzoq) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzoc)) {
            while (i2 < list.size()) {
                this.zza.zzp(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzoc zzocVar = (zzoc) list;
        while (i2 < list.size()) {
            Object objZzc = zzocVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzp(i, (String) objZzc);
            } else {
                this.zza.zze(i, (zzlg) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zznm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzs(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zzlr.zzA(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i2 < list.size()) {
                this.zza.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zznm zznmVar = (zznm) list;
        if (!z) {
            while (i2 < zznmVar.size()) {
                this.zza.zzs(i, zznmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zznmVar.size(); i4++) {
            iZzA2 += zzlr.zzA(zznmVar.zze(i4));
        }
        this.zza.zzt(iZzA2);
        while (i2 < zznmVar.size()) {
            this.zza.zzt(zznmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzof)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzlr.zzB(((Long) list.get(i3)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i2 < list.size()) {
                this.zza.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzof zzofVar = (zzof) list;
        if (!z) {
            while (i2 < zzofVar.size()) {
                this.zza.zzu(i, zzofVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzofVar.size(); i4++) {
            iZzB2 += zzlr.zzB(zzofVar.zze(i4));
        }
        this.zza.zzt(iZzB2);
        while (i2 < zzofVar.size()) {
            this.zza.zzv(zzofVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zznm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zznm zznmVar = (zznm) list;
        if (!z) {
            while (i2 < zznmVar.size()) {
                this.zza.zzf(i, zznmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zznmVar.size(); i6++) {
            zznmVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzt(i5);
        while (i2 < zznmVar.size()) {
            this.zza.zzg(zznmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzof)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzof zzofVar = (zzof) list;
        if (!z) {
            while (i2 < zzofVar.size()) {
                this.zza.zzh(i, zzofVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzofVar.size(); i6++) {
            zzofVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzt(i5);
        while (i2 < zzofVar.size()) {
            this.zza.zzi(zzofVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzkx zzkxVar = (zzkx) list;
        if (!z) {
            while (i2 < zzkxVar.size()) {
                this.zza.zzd(i, zzkxVar.zzf(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzkxVar.size(); i6++) {
            zzkxVar.zzf(i6);
            i5++;
        }
        this.zza.zzt(i5);
        while (i2 < zzkxVar.size()) {
            this.zza.zzb(zzkxVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zznm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzlr.zzB(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zznm zznmVar = (zznm) list;
        if (!z) {
            while (i2 < zznmVar.size()) {
                this.zza.zzj(i, zznmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zznmVar.size(); i4++) {
            iZzB2 += zzlr.zzB(zznmVar.zze(i4));
        }
        this.zza.zzt(iZzB2);
        while (i2 < zznmVar.size()) {
            this.zza.zzk(zznmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzof)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzof zzofVar = (zzof) list;
        if (!z) {
            while (i2 < zzofVar.size()) {
                this.zza.zzh(i, zzofVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzofVar.size(); i6++) {
            zzofVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzt(i5);
        while (i2 < zzofVar.size()) {
            this.zza.zzi(zzofVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzmq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzmq zzmqVar = (zzmq) list;
        if (!z) {
            while (i2 < zzmqVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzmqVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzmqVar.size(); i6++) {
            zzmqVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzt(i5);
        while (i2 < zzmqVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmqVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zznd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zznd zzndVar = (zznd) list;
        if (!z) {
            while (i2 < zzndVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzndVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzndVar.size(); i6++) {
            zzndVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzt(i5);
        while (i2 < zzndVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzndVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zznm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzt(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zznm zznmVar = (zznm) list;
        if (!z) {
            while (i2 < zznmVar.size()) {
                this.zza.zzf(i, zznmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zznmVar.size(); i6++) {
            zznmVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzt(i5);
        while (i2 < zznmVar.size()) {
            this.zza.zzg(zznmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zznm)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzlr zzlrVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzlrVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzA += zzlr.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzA);
            while (i2 < list.size()) {
                zzlr zzlrVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzlrVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zznm zznmVar = (zznm) list;
        if (!z) {
            while (i2 < zznmVar.size()) {
                zzlr zzlrVar3 = this.zza;
                int iZze = zznmVar.zze(i2);
                zzlrVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zznmVar.size(); i4++) {
            int iZze2 = zznmVar.zze(i4);
            iZzA2 += zzlr.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzA2);
        while (i2 < zznmVar.size()) {
            zzlr zzlrVar4 = this.zza;
            int iZze3 = zznmVar.zze(i2);
            zzlrVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzof)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzlr zzlrVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzlrVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzB += zzlr.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzB);
            while (i2 < list.size()) {
                zzlr zzlrVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzlrVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzof zzofVar = (zzof) list;
        if (!z) {
            while (i2 < zzofVar.size()) {
                zzlr zzlrVar3 = this.zza;
                long jZze = zzofVar.zze(i2);
                zzlrVar3.zzu(i, (jZze >> 63) ^ (jZze + jZze));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzofVar.size(); i4++) {
            long jZze2 = zzofVar.zze(i4);
            iZzB2 += zzlr.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzB2);
        while (i2 < zzofVar.size()) {
            zzlr zzlrVar4 = this.zza;
            long jZze3 = zzofVar.zze(i2);
            zzlrVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zznm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzlr.zzB(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zznm zznmVar = (zznm) list;
        if (!z) {
            while (i2 < zznmVar.size()) {
                this.zza.zzj(i, zznmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zznmVar.size(); i4++) {
            iZzB2 += zzlr.zzB(zznmVar.zze(i4));
        }
        this.zza.zzt(iZzB2);
        while (i2 < zznmVar.size()) {
            this.zza.zzk(zznmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqi
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzof)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzu(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzr(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zzlr.zzB(((Long) list.get(i3)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i2 < list.size()) {
                this.zza.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzof zzofVar = (zzof) list;
        if (!z) {
            while (i2 < zzofVar.size()) {
                this.zza.zzu(i, zzofVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzr(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzofVar.size(); i4++) {
            iZzB2 += zzlr.zzB(zzofVar.zze(i4));
        }
        this.zza.zzt(iZzB2);
        while (i2 < zzofVar.size()) {
            this.zza.zzv(zzofVar.zze(i2));
            i2++;
        }
    }
}
