package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public abstract class zzlr extends zzky {
    private static final Logger zzb = Logger.getLogger(zzlr.class.getName());
    private static final boolean zzc = zzqc.zzx();
    zzls zza;

    private zzlr() {
        throw null;
    }

    /* synthetic */ zzlr(zzlq zzlqVar) {
    }

    public static int zzA(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    static int zzw(int i, zzoq zzoqVar, zzpe zzpeVar) {
        int iZzA = zzA(i << 3);
        return iZzA + iZzA + ((zzkq) zzoqVar).zza(zzpeVar);
    }

    public static int zzx(zzoq zzoqVar) {
        int iZzn = zzoqVar.zzn();
        return zzA(iZzn) + iZzn;
    }

    static int zzy(zzoq zzoqVar, zzpe zzpeVar) {
        int iZza = ((zzkq) zzoqVar).zza(zzpeVar);
        return zzA(iZza) + iZza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzqf.zzc(str);
        } catch (zzqe unused) {
            length = str.getBytes(zznt.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzD(String str, zzqe zzqeVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzqeVar);
        byte[] bytes = str.getBytes(zznt.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzlp(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzlg zzlgVar) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    abstract void zzm(int i, zzoq zzoqVar, zzpe zzpeVar) throws IOException;

    public abstract void zzn(int i, zzoq zzoqVar) throws IOException;

    public abstract void zzo(int i, zzlg zzlgVar) throws IOException;

    public abstract void zzp(int i, String str) throws IOException;

    public abstract void zzr(int i, int i2) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i) throws IOException;

    public abstract void zzu(int i, long j) throws IOException;

    public abstract void zzv(long j) throws IOException;
}
