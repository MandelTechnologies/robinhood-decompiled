package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zznb {
    private static final zznb zzb = new zznb(true);
    final zzpo zza = new zzph();
    private boolean zzc;
    private boolean zzd;

    private zznb() {
    }

    public static int zza(zzna zznaVar, Object obj) {
        int iZzd;
        int iZzA;
        zzqg zzqgVarZzd = zznaVar.zzd();
        int iZza = zznaVar.zza();
        zznaVar.zzg();
        int iZzA2 = zzlr.zzA(iZza << 3);
        if (zzqgVarZzd == zzqg.zzj) {
            byte[] bArr = zznt.zzb;
            if (((zzoq) obj) instanceof zzkr) {
                throw null;
            }
            iZzA2 += iZzA2;
        }
        zzqh zzqhVar = zzqh.INT;
        int iZzB = 4;
        switch (zzqgVarZzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 1:
                ((Float) obj).getClass();
                return iZzA2 + iZzB;
            case 2:
                iZzB = zzlr.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 3:
                iZzB = zzlr.zzB(((Long) obj).longValue());
                return iZzA2 + iZzB;
            case 4:
                iZzB = zzlr.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 5:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 6:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 7:
                ((Boolean) obj).getClass();
                iZzB = 1;
                return iZzA2 + iZzB;
            case 8:
                if (!(obj instanceof zzlg)) {
                    iZzB = zzlr.zzz((String) obj);
                    return iZzA2 + iZzB;
                }
                iZzd = ((zzlg) obj).zzd();
                iZzA = zzlr.zzA(iZzd);
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 9:
                iZzB = ((zzoq) obj).zzn();
                return iZzA2 + iZzB;
            case 10:
                if (!(obj instanceof zzoa)) {
                    iZzB = zzlr.zzx((zzoq) obj);
                    return iZzA2 + iZzB;
                }
                iZzd = ((zzoa) obj).zza();
                iZzA = zzlr.zzA(iZzd);
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 11:
                if (obj instanceof zzlg) {
                    iZzd = ((zzlg) obj).zzd();
                    iZzA = zzlr.zzA(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzA = zzlr.zzA(iZzd);
                }
                iZzB = iZzA + iZzd;
                return iZzA2 + iZzB;
            case 12:
                iZzB = zzlr.zzA(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 13:
                iZzB = obj instanceof zznn ? zzlr.zzB(((zznn) obj).zza()) : zzlr.zzB(((Integer) obj).intValue());
                return iZzA2 + iZzB;
            case 14:
                ((Integer) obj).getClass();
                return iZzA2 + iZzB;
            case 15:
                ((Long) obj).getClass();
                iZzB = 8;
                return iZzA2 + iZzB;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzB = zzlr.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzA2 + iZzB;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzB = zzlr.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzA2 + iZzB;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zznb zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzov) {
            return ((zzov) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzna zznaVar = (zzna) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzoa;
        zznaVar.zzg();
        if (zznaVar.zze() != zzqh.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zznaVar, zzl(value));
            return;
        }
        Object objZze = zze(zznaVar);
        if (objZze != null) {
            if (z) {
                throw null;
            }
            this.zza.put(zznaVar, objZze instanceof zzov ? zznaVar.zzc((zzov) objZze, (zzov) value) : zznaVar.zzb(((zzoq) objZze).zzae(), (zzoq) value).zzj());
        } else {
            this.zza.put(zznaVar, zzl(value));
            if (z) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzna zznaVar = (zzna) entry.getKey();
        if (zznaVar.zze() != zzqh.MESSAGE) {
            return true;
        }
        zznaVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzor) {
            return ((zzor) value).zzo();
        }
        if (value instanceof zzoa) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int iZzA;
        int iZzA2;
        zzna zznaVar = (zzna) entry.getKey();
        Object value = entry.getValue();
        if (zznaVar.zze() != zzqh.MESSAGE) {
            return zza(zznaVar, value);
        }
        zznaVar.zzg();
        zznaVar.zzf();
        if (value instanceof zzoa) {
            int iZza = ((zzna) entry.getKey()).zza();
            int iZzA3 = zzlr.zzA(8);
            i = iZzA3 + iZzA3;
            iZzA = zzlr.zzA(16) + zzlr.zzA(iZza);
            int iZzA4 = zzlr.zzA(24);
            int iZza2 = ((zzoa) value).zza();
            iZzA2 = iZzA4 + zzlr.zzA(iZza2) + iZza2;
        } else {
            int iZza3 = ((zzna) entry.getKey()).zza();
            int iZzA5 = zzlr.zzA(8);
            i = iZzA5 + iZzA5;
            iZzA = zzlr.zzA(16) + zzlr.zzA(iZza3);
            iZzA2 = zzlr.zzA(24) + zzlr.zzx((zzoq) value);
        }
        return i + iZzA + iZzA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zznb) {
            return this.zza.equals(((zznb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzc = this.zza.zzc();
        int iZzo = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzo += zzo(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zznb clone() {
        zznb zznbVar = new zznb();
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zznbVar.zzi((zzna) ((zzpi) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zznbVar.zzi((zzna) entry.getKey(), entry.getValue());
        }
        zznbVar.zzd = this.zzd;
        return zznbVar;
    }

    public final Object zze(zzna zznaVar) {
        Object obj = this.zza.get(zznaVar);
        if (obj instanceof zzoa) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznz(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zznl) {
                ((zznl) entryZzg.getValue()).zzF();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zznb zznbVar) {
        int iZzc = zznbVar.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            zzm(zznbVar.zza.zzg(i));
        }
        Iterator it = zznbVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zznn) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzoa) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzna zznaVar, Object obj) {
        boolean z;
        zznaVar.zzg();
        zznaVar.zzd();
        byte[] bArr = zznt.zzb;
        obj.getClass();
        zzqg zzqgVar = zzqg.zza;
        zzqh zzqhVar = zzqh.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zzlg)) {
                    break;
                }
                if (obj instanceof zzoa) {
                    this.zzd = true;
                }
                this.zza.put(zznaVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzoa) {
                }
                this.zza.put(zznaVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzoq)) {
                    break;
                }
                if (obj instanceof zzoa) {
                }
                this.zza.put(zznaVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zznaVar.zza()), zznaVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zznb(boolean z) {
        zzg();
        zzg();
    }
}
