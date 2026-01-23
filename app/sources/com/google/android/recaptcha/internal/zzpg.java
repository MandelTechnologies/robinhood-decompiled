package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzpg {
    public static final /* synthetic */ int zza = 0;
    private static final zzpv zzb;

    static {
        int i = zzpa.zza;
        zzb = new zzpx();
    }

    public static void zzA(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzA(i, list, z);
    }

    public static void zzB(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzC(i, list, z);
    }

    public static void zzC(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzE(i, list, z);
    }

    public static void zzD(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzJ(i, list, z);
    }

    public static void zzE(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzL(i, list, z);
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznm)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzlr.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzB;
        }
        zznm zznmVar = (zznm) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzlr.zzB(zznmVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlr.zzA(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlr.zzA(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznm)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzlr.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzB;
        }
        zznm zznmVar = (zznm) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzlr.zzB(zznmVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    static int zzg(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzof)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzlr.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzof zzofVar = (zzof) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzlr.zzB(zzofVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    static int zzh(int i, Object obj, zzpe zzpeVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzob)) {
            return zzlr.zzA(i2) + zzlr.zzy((zzoq) obj, zzpeVar);
        }
        int iZzA = zzlr.zzA(i2);
        int iZza = ((zzob) obj).zza();
        return iZzA + zzlr.zzA(iZza) + iZza;
    }

    static int zzi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznm)) {
            int iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzlr.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iZzA;
        }
        zznm zznmVar = (zznm) list;
        int iZzA2 = 0;
        while (i < size) {
            int iZze = zznmVar.zze(i);
            iZzA2 += zzlr.zzA((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iZzA2;
    }

    static int zzj(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzof)) {
            int iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzlr.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iZzB;
        }
        zzof zzofVar = (zzof) list;
        int iZzB2 = 0;
        while (i < size) {
            long jZze = zzofVar.zze(i);
            iZzB2 += zzlr.zzB((jZze >> 63) ^ (jZze + jZze));
            i++;
        }
        return iZzB2;
    }

    static int zzk(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zznm)) {
            int iZzA = 0;
            while (i < size) {
                iZzA += zzlr.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZzA;
        }
        zznm zznmVar = (zznm) list;
        int iZzA2 = 0;
        while (i < size) {
            iZzA2 += zzlr.zzA(zznmVar.zze(i));
            i++;
        }
        return iZzA2;
    }

    static int zzl(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzof)) {
            int iZzB = 0;
            while (i < size) {
                iZzB += zzlr.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return iZzB;
        }
        zzof zzofVar = (zzof) list;
        int iZzB2 = 0;
        while (i < size) {
            iZzB2 += zzlr.zzB(zzofVar.zze(i));
            i++;
        }
        return iZzB2;
    }

    public static zzpv zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i, List list, zznp zznpVar, Object obj2, zzpv zzpvVar) {
        if (zznpVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zznpVar.zza(iIntValue)) {
                    obj2 = zzo(obj, i, iIntValue, obj2, zzpvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (zznpVar.zza(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = zzo(obj, i, iIntValue2, obj2, zzpvVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object zzo(Object obj, int i, int i2, Object obj2, zzpv zzpvVar) {
        if (obj2 == null) {
            obj2 = zzpvVar.zza(obj);
        }
        zzpvVar.zzh(obj2, i, i2);
        return obj2;
    }

    static void zzp(zzmx zzmxVar, Object obj, Object obj2) {
        zznb zznbVar = ((zzni) obj2).zzb;
        if (zznbVar.zza.isEmpty()) {
            return;
        }
        ((zzni) obj).zzi().zzh(zznbVar);
    }

    static void zzq(zzpv zzpvVar, Object obj, Object obj2) {
        zznl zznlVar = (zznl) obj;
        zzpw zzpwVarZze = zznlVar.zzc;
        zzpw zzpwVar = ((zznl) obj2).zzc;
        if (!zzpw.zzc().equals(zzpwVar)) {
            if (zzpw.zzc().equals(zzpwVarZze)) {
                zzpwVarZze = zzpw.zze(zzpwVarZze, zzpwVar);
            } else {
                zzpwVarZze.zzd(zzpwVar);
            }
        }
        zznlVar.zzc = zzpwVarZze;
    }

    public static void zzr(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzg(i, list, z);
    }

    public static void zzt(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzj(i, list, z);
    }

    public static void zzu(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzl(i, list, z);
    }

    public static void zzv(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzn(i, list, z);
    }

    public static void zzw(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzp(i, list, z);
    }

    public static void zzx(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzs(i, list, z);
    }

    public static void zzy(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzu(i, list, z);
    }

    public static void zzz(int i, List list, zzqi zzqiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzqiVar.zzy(i, list, z);
    }
}
