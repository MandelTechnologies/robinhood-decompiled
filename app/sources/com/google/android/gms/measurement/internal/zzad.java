package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpu;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* loaded from: classes27.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i2) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:405:0x0969, code lost:
    
        r0 = r13.zzaV().zze();
        r2 = com.google.android.gms.measurement.internal.zzgu.zzl(r34.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x097b, code lost:
    
        if (r12.zza() == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x097d, code lost:
    
        r3 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0986, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0987, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0854 A[PHI: r0 r13 r36
      0x0854: PHI (r0v120 java.util.Map) = (r0v122 java.util.Map), (r0v128 java.util.Map) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]
      0x0854: PHI (r36v4 java.util.Iterator) = (r36v5 java.util.Iterator), (r36v9 java.util.Iterator) binds: [B:370:0x0878, B:360:0x0852] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:452:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #13 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:452:0x019c }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zzb(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        int i;
        int i2;
        boolean z2;
        Map map;
        zzav zzavVarZzj;
        String str2;
        Cursor cursor;
        boolean z3;
        String str3;
        String str4;
        Cursor cursorQuery;
        ?? r11;
        HashSet<Integer> hashSet;
        ArrayMap arrayMap;
        List list3;
        boolean z4;
        ?? r5;
        Cursor cursorRawQuery;
        Map map2;
        HashSet hashSet2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Map map3;
        String str5;
        ArrayMap arrayMap2;
        Cursor cursor2;
        String str6;
        Cursor cursorQuery2;
        List arrayList;
        zzz zzzVar;
        Iterator it4;
        zzbc zzbcVar;
        Iterator it5;
        Map map4;
        Iterator it6;
        long j;
        String str7;
        Cursor cursor3;
        Cursor cursor4;
        List arrayList2;
        Cursor cursorQuery3;
        List arrayList3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it7 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it7.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it7.next()).zzd())) {
                z2 = true;
                break;
            }
        }
        zzpu.zza();
        zzic zzicVar = this.zzu;
        boolean zZzp = zzicVar.zzc().zzp(this.zza, zzfy.zzaF);
        zzpu.zza();
        boolean zZzp2 = zzicVar.zzc().zzp(this.zza, zzfy.zzaE);
        if (z2) {
            zzav zzavVarZzj2 = this.zzg.zzj();
            String str8 = this.zza;
            zzavVarZzj2.zzaw();
            zzavVarZzj2.zzg();
            Preconditions.checkNotEmpty(str8);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzavVarZzj2.zze().update("events", contentValues, "app_id = ?", new String[]{str8});
            } catch (SQLiteException e) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str8), e);
            }
        }
        Map map5 = Collections.EMPTY_MAP;
        String str9 = WebsocketGatewayConstants.DATA_KEY;
        String str10 = "audience_id";
        if (zZzp2 && zZzp) {
            zzav zzavVarZzj3 = this.zzg.zzj();
            String str11 = this.zza;
            Preconditions.checkNotEmpty(str11);
            ArrayMap arrayMap3 = new ArrayMap();
            try {
                cursorQuery3 = zzavVarZzj3.zze().query("event_filters", new String[]{"audience_id", WebsocketGatewayConstants.DATA_KEY}, "app_id=?", new String[]{str11}, null, null, null);
                try {
                    try {
                        if (cursorQuery3.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery3.getBlob(i2))).zzbc();
                                    if (zzffVar.zzg()) {
                                        Integer numValueOf = Integer.valueOf(cursorQuery3.getInt(i));
                                        List list4 = (List) arrayMap3.get(numValueOf);
                                        if (list4 == null) {
                                            arrayList3 = new ArrayList();
                                            arrayMap3.put(numValueOf, arrayList3);
                                        } else {
                                            arrayList3 = list4;
                                        }
                                        arrayList3.add(zzffVar);
                                    }
                                } catch (IOException e2) {
                                    zzavVarZzj3.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str11), e2);
                                }
                                if (!cursorQuery3.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            cursorQuery3.close();
                            map = arrayMap3;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str11), e);
                        map5 = Collections.EMPTY_MAP;
                        if (cursorQuery3 != null) {
                            cursorQuery3.close();
                        }
                        map = map5;
                        zzavVarZzj = this.zzg.zzj();
                        str2 = this.zza;
                        zzavVarZzj.zzaw();
                        zzavVarZzj.zzg();
                        Preconditions.checkNotEmpty(str2);
                        cursorQuery = zzavVarZzj.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            z3 = z2;
                            str3 = WebsocketGatewayConstants.DATA_KEY;
                        }
                        if (!r11.isEmpty()) {
                        }
                        String str12 = str3;
                        String str13 = str4;
                        String str14 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                        }
                        if (z) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery3 != null) {
                        cursorQuery3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e5) {
                e = e5;
                cursorQuery3 = null;
            } catch (Throwable th3) {
                th = th3;
                cursorQuery3 = null;
                if (cursorQuery3 != null) {
                }
                throw th;
            }
            cursorQuery3.close();
            map = map5;
        } else {
            map = map5;
        }
        zzavVarZzj = this.zzg.zzj();
        str2 = this.zza;
        zzavVarZzj.zzaw();
        zzavVarZzj.zzg();
        Preconditions.checkNotEmpty(str2);
        try {
            cursorQuery = zzavVarZzj.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map6 = Collections.EMPTY_MAP;
                cursorQuery.close();
                r11 = map6;
                z3 = z2;
                str3 = WebsocketGatewayConstants.DATA_KEY;
                str4 = "audience_id";
            } else {
                ArrayMap arrayMap4 = new ArrayMap();
                while (true) {
                    int i3 = cursorQuery.getInt(0);
                    try {
                        arrayMap4.put(Integer.valueOf(i3), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                        z3 = z2;
                        str3 = str9;
                        str4 = str10;
                    } catch (IOException e6) {
                        z3 = z2;
                        str3 = str9;
                        try {
                            str4 = str10;
                            try {
                                zzavVarZzj.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str2), Integer.valueOf(i3), e6);
                            } catch (SQLiteException e7) {
                                e = e7;
                                zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str2), e);
                                Map map7 = Collections.EMPTY_MAP;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                r11 = map7;
                                if (!r11.isEmpty()) {
                                }
                                String str122 = str3;
                                String str132 = str4;
                                String str142 = "Skipping failed audience ID";
                                if (!list.isEmpty()) {
                                }
                                if (z) {
                                }
                            }
                        } catch (SQLiteException e8) {
                            e = e8;
                            str4 = str10;
                            zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str2), e);
                            Map map72 = Collections.EMPTY_MAP;
                            if (cursorQuery != null) {
                            }
                            r11 = map72;
                            if (!r11.isEmpty()) {
                            }
                            String str1222 = str3;
                            String str1322 = str4;
                            String str1422 = "Skipping failed audience ID";
                            if (!list.isEmpty()) {
                            }
                            if (z) {
                            }
                        }
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    z2 = z3;
                    str9 = str3;
                    str10 = str4;
                }
                cursorQuery.close();
                r11 = arrayMap4;
            }
        } catch (SQLiteException e9) {
            e = e9;
            z3 = z2;
            str3 = WebsocketGatewayConstants.DATA_KEY;
            str4 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        if (!r11.isEmpty()) {
            HashSet hashSet3 = new HashSet(r11.keySet());
            if (z3) {
                String str15 = this.zza;
                zzav zzavVarZzj4 = this.zzg.zzj();
                String str16 = this.zza;
                zzavVarZzj4.zzaw();
                zzavVarZzj4.zzg();
                Preconditions.checkNotEmpty(str16);
                Map arrayMap5 = new ArrayMap();
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj4.zze();
                try {
                    try {
                        cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str16, str16});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    Integer numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                    List arrayList4 = (List) arrayMap5.get(numValueOf2);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        arrayMap5.put(numValueOf2, arrayList4);
                                    }
                                    arrayList4.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                } while (cursorRawQuery.moveToNext());
                            } else {
                                arrayMap5 = Collections.EMPTY_MAP;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            zzavVarZzj4.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str16), e);
                            arrayMap5 = Collections.EMPTY_MAP;
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            Preconditions.checkNotEmpty(str15);
                            Preconditions.checkNotNull(r11);
                            ArrayMap arrayMap6 = new ArrayMap();
                            if (!r11.isEmpty()) {
                            }
                            hashSet = hashSet3;
                            arrayMap = arrayMap6;
                            Map map8 = r11;
                            while (r16.hasNext()) {
                            }
                            String str12222 = str3;
                            String str13222 = str4;
                            String str14222 = "Skipping failed audience ID";
                            if (!list.isEmpty()) {
                            }
                            if (z) {
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = sQLiteDatabaseZze;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursorRawQuery = null;
                } catch (Throwable th6) {
                    th = th6;
                    r5 = 0;
                    if (r5 != 0) {
                    }
                    throw th;
                }
                cursorRawQuery.close();
                Preconditions.checkNotEmpty(str15);
                Preconditions.checkNotNull(r11);
                ArrayMap arrayMap62 = new ArrayMap();
                if (!r11.isEmpty()) {
                    Iterator it8 = r11.keySet().iterator();
                    while (it8.hasNext()) {
                        Integer num = (Integer) it8.next();
                        num.intValue();
                        com.google.android.gms.internal.measurement.zzii zziiVar = (com.google.android.gms.internal.measurement.zzii) r11.get(num);
                        List list5 = (List) arrayMap5.get(num);
                        if (list5 == null || list5.isEmpty()) {
                            map2 = arrayMap5;
                            hashSet2 = hashSet3;
                            it = it8;
                            arrayMap62.put(num, zziiVar);
                            arrayMap5 = map2;
                            hashSet3 = hashSet2;
                            it8 = it;
                        } else {
                            zzpg zzpgVar = this.zzg;
                            map2 = arrayMap5;
                            hashSet2 = hashSet3;
                            List listZzq = zzpgVar.zzp().zzq(zziiVar.zzc(), list5);
                            if (listZzq.isEmpty()) {
                                arrayMap5 = map2;
                                hashSet3 = hashSet2;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar.zzcl();
                                zzihVar.zzd();
                                zzihVar.zzc(listZzq);
                                List listZzq2 = zzpgVar.zzp().zzq(zziiVar.zza(), list5);
                                zzihVar.zzb();
                                zzihVar.zza(listZzq2);
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it9 = zziiVar.zze().iterator();
                                while (it9.hasNext()) {
                                    Iterator it10 = it8;
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it9.next();
                                    Iterator it11 = it9;
                                    if (!list5.contains(Integer.valueOf(zzhqVar.zzb()))) {
                                        arrayList5.add(zzhqVar);
                                    }
                                    it8 = it10;
                                    it9 = it11;
                                }
                                it = it8;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList5);
                                ArrayList arrayList6 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzg()) {
                                    if (!list5.contains(Integer.valueOf(zzikVar.zzb()))) {
                                        arrayList6.add(zzikVar);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList6);
                                arrayMap62.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbc());
                                arrayMap5 = map2;
                                hashSet3 = hashSet2;
                                it8 = it;
                            }
                        }
                    }
                }
                hashSet = hashSet3;
                arrayMap = arrayMap62;
            } else {
                hashSet = hashSet3;
                arrayMap = r11;
            }
            Map map82 = r11;
            for (Integer num2 : hashSet) {
                num2.intValue();
                com.google.android.gms.internal.measurement.zzii zziiVar2 = (com.google.android.gms.internal.measurement.zzii) arrayMap.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap7 = new ArrayMap();
                if (zziiVar2 != null && zziiVar2.zzf() != 0) {
                    for (com.google.android.gms.internal.measurement.zzhq zzhqVar2 : zziiVar2.zze()) {
                        if (zzhqVar2.zza()) {
                            ArrayMap arrayMap8 = arrayMap;
                            arrayMap7.put(Integer.valueOf(zzhqVar2.zzb()), zzhqVar2.zzc() ? Long.valueOf(zzhqVar2.zzd()) : null);
                            arrayMap = arrayMap8;
                        }
                    }
                }
                ArrayMap arrayMap9 = arrayMap;
                ArrayMap arrayMap10 = new ArrayMap();
                if (zziiVar2 != null && zziiVar2.zzh() != 0) {
                    Iterator it12 = zziiVar2.zzg().iterator();
                    while (it12.hasNext()) {
                        com.google.android.gms.internal.measurement.zzik zzikVar2 = (com.google.android.gms.internal.measurement.zzik) it12.next();
                        if (zzikVar2.zza() && zzikVar2.zzd() > 0) {
                            arrayMap10.put(Integer.valueOf(zzikVar2.zzb()), Long.valueOf(zzikVar2.zze(zzikVar2.zzd() - 1)));
                            it12 = it12;
                            zziiVar2 = zziiVar2;
                        }
                    }
                }
                com.google.android.gms.internal.measurement.zzii zziiVar3 = zziiVar2;
                if (zziiVar3 != null) {
                    int i4 = 0;
                    while (i4 < zziiVar3.zzb() * 64) {
                        if (zzpk.zzn(zziiVar3.zza(), i4)) {
                            z4 = zZzp;
                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i4));
                            bitSet2.set(i4);
                            if (zzpk.zzn(zziiVar3.zzc(), i4)) {
                                bitSet.set(i4);
                            }
                            i4++;
                            zZzp = z4;
                        } else {
                            z4 = zZzp;
                        }
                        arrayMap7.remove(Integer.valueOf(i4));
                        i4++;
                        zZzp = z4;
                    }
                }
                boolean z5 = zZzp;
                com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map82.get(num2);
                if (zZzp2 && z5 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                    Iterator it13 = list3.iterator();
                    while (it13.hasNext()) {
                        com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) it13.next();
                        int iZzb = zzffVar2.zzb();
                        Iterator it14 = it13;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar2.zzj()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf3 = Integer.valueOf(iZzb);
                        if (arrayMap7.containsKey(numValueOf3)) {
                            arrayMap7.put(numValueOf3, Long.valueOf(jLongValue));
                        }
                        if (arrayMap10.containsKey(numValueOf3)) {
                            arrayMap10.put(numValueOf3, Long.valueOf(jLongValue));
                        }
                        it13 = it14;
                    }
                }
                this.zzc.put(num2, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, arrayMap7, arrayMap10, null));
                str3 = str3;
                map = map;
                str4 = str4;
                map82 = map82;
                zZzp = z5;
                arrayMap = arrayMap9;
            }
        }
        String str122222 = str3;
        String str132222 = str4;
        String str142222 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzz zzzVar2 = new zzz(this, null);
            ArrayMap arrayMap11 = new ArrayMap();
            Iterator it15 = list.iterator();
            while (it15.hasNext()) {
                com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it15.next();
                com.google.android.gms.internal.measurement.zzhs zzhsVarZza = zzzVar2.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpg zzpgVar2 = this.zzg;
                    zzbc zzbcVarZzaf = zzpgVar2.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                    zzpgVar2.zzj().zzh(zzbcVarZzaf);
                    if (z) {
                        continue;
                    } else {
                        long j2 = zzbcVarZzaf.zzc;
                        String strZzd = zzhsVarZza.zzd();
                        Map map9 = (Map) arrayMap11.get(strZzd);
                        if (map9 == null) {
                            zzav zzavVarZzj5 = zzpgVar2.zzj();
                            zzzVar = zzzVar2;
                            String str17 = this.zza;
                            zzavVarZzj5.zzaw();
                            zzavVarZzj5.zzg();
                            Preconditions.checkNotEmpty(str17);
                            Preconditions.checkNotEmpty(strZzd);
                            it4 = it15;
                            ArrayMap arrayMap12 = new ArrayMap();
                            try {
                                try {
                                    str7 = str17;
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor3 = null;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                str7 = str17;
                            }
                            try {
                                Cursor cursorQuery4 = zzavVarZzj5.zze().query("event_filters", new String[]{str132222, str122222}, "app_id=? AND event_name=?", new String[]{str17, strZzd}, null, null, null);
                                try {
                                    try {
                                        if (cursorQuery4.moveToFirst()) {
                                            zzbcVar = zzbcVarZzaf;
                                            while (true) {
                                                try {
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(1))).zzbc();
                                                        Integer numValueOf4 = Integer.valueOf(cursorQuery4.getInt(0));
                                                        List list6 = (List) arrayMap12.get(numValueOf4);
                                                        if (list6 == null) {
                                                            cursor4 = cursorQuery4;
                                                            try {
                                                                arrayList2 = new ArrayList();
                                                                arrayMap12.put(numValueOf4, arrayList2);
                                                            } catch (SQLiteException e13) {
                                                                e = e13;
                                                                cursor3 = cursor4;
                                                                try {
                                                                    zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str7), e);
                                                                    map9 = Collections.EMPTY_MAP;
                                                                    if (cursor3 != null) {
                                                                    }
                                                                    arrayMap11.put(strZzd, map9);
                                                                    it5 = map9.keySet().iterator();
                                                                    while (it5.hasNext()) {
                                                                    }
                                                                    it15 = it4;
                                                                    zzzVar2 = zzzVar;
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    if (cursor3 != null) {
                                                                        cursor3.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                cursor3 = cursor4;
                                                                if (cursor3 != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            cursor4 = cursorQuery4;
                                                            arrayList2 = list6;
                                                        }
                                                        arrayList2.add(zzffVar3);
                                                    } catch (IOException e14) {
                                                        cursor4 = cursorQuery4;
                                                        zzavVarZzj5.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str7), e14);
                                                    }
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                    }
                                                    cursorQuery4 = cursor4;
                                                } catch (SQLiteException e15) {
                                                    e = e15;
                                                    cursor4 = cursorQuery4;
                                                }
                                            }
                                            cursor4.close();
                                            map9 = arrayMap12;
                                        } else {
                                            zzbcVar = zzbcVarZzaf;
                                            map9 = Collections.EMPTY_MAP;
                                            cursorQuery4.close();
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        cursor4 = cursorQuery4;
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    cursor4 = cursorQuery4;
                                    zzbcVar = zzbcVarZzaf;
                                }
                            } catch (SQLiteException e17) {
                                e = e17;
                                zzbcVar = zzbcVarZzaf;
                                cursor3 = null;
                                zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str7), e);
                                map9 = Collections.EMPTY_MAP;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                arrayMap11.put(strZzd, map9);
                                it5 = map9.keySet().iterator();
                                while (it5.hasNext()) {
                                }
                                it15 = it4;
                                zzzVar2 = zzzVar;
                            }
                            arrayMap11.put(strZzd, map9);
                        } else {
                            zzzVar = zzzVar2;
                            it4 = it15;
                            zzbcVar = zzbcVarZzaf;
                        }
                        it5 = map9.keySet().iterator();
                        while (it5.hasNext()) {
                            Integer num3 = (Integer) it5.next();
                            int iIntValue = num3.intValue();
                            if (this.zzb.contains(num3)) {
                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                            } else {
                                Iterator it16 = ((List) map9.get(num3)).iterator();
                                boolean zZzd = true;
                                while (true) {
                                    if (!it16.hasNext()) {
                                        map4 = map9;
                                        it6 = it5;
                                        j = j2;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it16.next();
                                    map4 = map9;
                                    it6 = it5;
                                    zzaa zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar4);
                                    j = j2;
                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVar, zzd(iIntValue, zzffVar4.zzb()));
                                    if (!zZzd) {
                                        this.zzb.add(num3);
                                        break;
                                    }
                                    zzc(num3).zza(zzaaVar);
                                    j2 = j;
                                    map9 = map4;
                                    it5 = it6;
                                }
                                if (!zZzd) {
                                    this.zzb.add(num3);
                                }
                                j2 = j;
                                map9 = map4;
                                it5 = it6;
                            }
                        }
                        it15 = it4;
                        zzzVar2 = zzzVar;
                    }
                }
            }
        }
        if (z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            ArrayMap arrayMap13 = new ArrayMap();
            Iterator it17 = list2.iterator();
            while (it17.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it17.next();
                String strZzc = zziuVar.zzc();
                Map map10 = (Map) arrayMap13.get(strZzc);
                if (map10 == null) {
                    zzav zzavVarZzj6 = this.zzg.zzj();
                    String str18 = this.zza;
                    zzavVarZzj6.zzaw();
                    zzavVarZzj6.zzg();
                    Preconditions.checkNotEmpty(str18);
                    Preconditions.checkNotEmpty(strZzc);
                    ArrayMap arrayMap14 = new ArrayMap();
                    try {
                        cursorQuery2 = zzavVarZzj6.zze().query("property_filters", new String[]{str132222, str122222}, "app_id=? AND property_name=?", new String[]{str18, strZzc}, null, null, null);
                        try {
                            try {
                            } catch (SQLiteException e18) {
                                e = e18;
                                it2 = it17;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            cursor2 = cursorQuery2;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e19) {
                        e = e19;
                        it2 = it17;
                        str6 = str18;
                        cursorQuery2 = null;
                    } catch (Throwable th12) {
                        th = th12;
                        cursor2 = null;
                    }
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            try {
                                com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery2.getBlob(1))).zzbc();
                                Integer numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                List list7 = (List) arrayMap14.get(numValueOf5);
                                if (list7 == null) {
                                    it2 = it17;
                                    try {
                                        arrayList = new ArrayList();
                                        arrayMap14.put(numValueOf5, arrayList);
                                    } catch (SQLiteException e20) {
                                        e = e20;
                                        str6 = str18;
                                        zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str6), e);
                                        map10 = Collections.EMPTY_MAP;
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                        arrayMap13.put(strZzc, map10);
                                        it3 = map10.keySet().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                break;
                                            }
                                            map10 = map3;
                                            arrayMap13 = arrayMap2;
                                            str142222 = str5;
                                        }
                                        it17 = it2;
                                    }
                                } else {
                                    it2 = it17;
                                    arrayList = list7;
                                }
                                arrayList.add(zzfnVar);
                                str6 = str18;
                            } catch (IOException e21) {
                                it2 = it17;
                                str6 = str18;
                                try {
                                    zzavVarZzj6.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgu.zzl(str6), e21);
                                } catch (SQLiteException e22) {
                                    e = e22;
                                    zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str6), e);
                                    map10 = Collections.EMPTY_MAP;
                                    if (cursorQuery2 != null) {
                                    }
                                    arrayMap13.put(strZzc, map10);
                                    it3 = map10.keySet().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                        }
                                        map10 = map3;
                                        arrayMap13 = arrayMap2;
                                        str142222 = str5;
                                    }
                                    it17 = it2;
                                }
                            }
                            if (!cursorQuery2.moveToNext()) {
                                break;
                            }
                            it17 = it2;
                            str18 = str6;
                        }
                        cursorQuery2.close();
                        map10 = arrayMap14;
                        arrayMap13.put(strZzc, map10);
                    } else {
                        it2 = it17;
                        map10 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                        arrayMap13.put(strZzc, map10);
                    }
                } else {
                    it2 = it17;
                }
                it3 = map10.keySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Integer num4 = (Integer) it3.next();
                        int iIntValue2 = num4.intValue();
                        if (this.zzb.contains(num4)) {
                            this.zzu.zzaV().zzk().zzb(str142222, num4);
                            break;
                        }
                        Iterator it18 = ((List) map10.get(num4)).iterator();
                        boolean zZzd2 = true;
                        while (true) {
                            if (!it18.hasNext()) {
                                map3 = map10;
                                str5 = str142222;
                                arrayMap2 = arrayMap13;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) it18.next();
                            zzic zzicVar2 = this.zzu;
                            map3 = map10;
                            if (Log.isLoggable(zzicVar2.zzaV().zzn(), 2)) {
                                str5 = str142222;
                                arrayMap2 = arrayMap13;
                                zzicVar2.zzaV().zzk().zzd("Evaluating filter. audience, filter, property", num4, zzfnVar2.zza() ? Integer.valueOf(zzfnVar2.zzb()) : null, zzicVar2.zzl().zzc(zzfnVar2.zzc()));
                                zzicVar2.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar2));
                            } else {
                                str5 = str142222;
                                arrayMap2 = arrayMap13;
                            }
                            if (!zzfnVar2.zza() || zzfnVar2.zzb() > 256) {
                                break;
                            }
                            zzac zzacVar = new zzac(this, this.zza, iIntValue2, zzfnVar2);
                            zZzd2 = zzacVar.zzd(this.zzd, this.zze, zziuVar, zzd(iIntValue2, zzfnVar2.zzb()));
                            if (!zZzd2) {
                                this.zzb.add(num4);
                                break;
                            }
                            zzc(num4).zza(zzacVar);
                            map10 = map3;
                            arrayMap13 = arrayMap2;
                            str142222 = str5;
                        }
                        if (!zZzd2) {
                            this.zzb.add(num4);
                        }
                        map10 = map3;
                        arrayMap13 = arrayMap2;
                        str142222 = str5;
                    }
                }
                it17 = it2;
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Set<Integer> setKeySet = this.zzc.keySet();
        setKeySet.removeAll(this.zzb);
        for (Integer num5 : setKeySet) {
            int iIntValue3 = num5.intValue();
            zzy zzyVar = (zzy) this.zzc.get(num5);
            Preconditions.checkNotNull(zzyVar);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue3);
            arrayList7.add(zzhgVarZzb);
            zzav zzavVarZzj7 = this.zzg.zzj();
            String str19 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
            zzavVarZzj7.zzaw();
            zzavVarZzj7.zzg();
            Preconditions.checkNotEmpty(str19);
            Preconditions.checkNotNull(zziiVarZzc);
            byte[] bArrZzcc = zziiVarZzc.zzcc();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str19);
            contentValues2.put(str132222, num5);
            contentValues2.put("current_results", bArrZzcc);
            try {
            } catch (SQLiteException e23) {
                e = e23;
            }
            try {
                if (zzavVarZzj7.zze().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                    zzavVarZzj7.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str19));
                }
            } catch (SQLiteException e24) {
                e = e24;
                zzavVarZzj7.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str19), e);
            }
        }
        return arrayList7;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbb() {
        return false;
    }
}
