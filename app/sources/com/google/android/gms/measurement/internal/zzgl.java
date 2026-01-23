package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes27.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    zzgl(zzic zzicVar) {
        super(zzicVar);
        Context contextZzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgj(this, contextZzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3 A[Catch: SQLiteException -> 0x0098, SQLiteDatabaseLockedException -> 0x009f, SQLiteFullException -> 0x00a3, all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:30:0x008d, B:32:0x0093, B:43:0x00b3, B:45:0x00d7, B:47:0x00e1, B:49:0x00e9, B:59:0x0103, B:73:0x012b, B:75:0x0131, B:76:0x0134, B:93:0x016b, B:83:0x0154), top: B:107:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160 A[PHI: r8 r10 r17
      0x0160: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x014c, B:96:0x0182, B:87:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzs(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzp;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        zzg();
        boolean z3 = false;
        z3 = false;
        if (!this.zzc) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzbb;
            Cursor cursor = null;
            zzr zzrVarZzh = zzalVarZzc.zzp(null, zzfxVar) ? this.zzu.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (zzicVar.zzc().zzp(null, zzfxVar) && zzrVarZzh != null) {
                contentValues.put("app_version", zzrVarZzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzrVarZzh.zzj));
            }
            zzicVar.zzc();
            int i2 = 0;
            int i3 = 5;
            for (int i4 = 5; i2 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseZzp = zzp();
                } catch (SQLiteDatabaseLockedException unused) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e) {
                    e = e;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e2) {
                    e = e2;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabaseZzp = null;
                }
                if (sQLiteDatabaseZzp == null) {
                    this.zzc = true;
                } else {
                    try {
                        sQLiteDatabaseZzp.beginTransaction();
                        cursorRawQuery = sQLiteDatabaseZzp.rawQuery("select count(1) from messages", null);
                        long j = 0;
                        if (cursorRawQuery == null) {
                            if (j < 100000) {
                            }
                            sQLiteDatabaseZzp.insertOrThrow(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, null, contentValues);
                            sQLiteDatabaseZzp.setTransactionSuccessful();
                            sQLiteDatabaseZzp.endTransaction();
                            if (cursorRawQuery != null) {
                            }
                            sQLiteDatabaseZzp.close();
                            return z2;
                        }
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                j = cursorRawQuery.getLong(z3 ? 1 : 0);
                            }
                            if (j < 100000) {
                                zzicVar.zzaV().zzb().zza("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseZzp.delete(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    zzgs zzgsVarZzb = zzicVar.zzaV().zzb();
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i3);
                                            i3 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzp == null) {
                                                sQLiteDatabaseZzp.close();
                                            }
                                            i2++;
                                            z3 = z;
                                        }
                                        try {
                                            zzgsVarZzb.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                            this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                            this.zzc = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                            }
                                            i2++;
                                            z3 = z;
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            if (sQLiteDatabaseZzp != null) {
                                                try {
                                                    if (sQLiteDatabaseZzp.inTransaction()) {
                                                        sQLiteDatabaseZzp.endTransaction();
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cursor = cursorRawQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    if (sQLiteDatabaseZzp != null) {
                                                        sQLiteDatabaseZzp.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                            this.zzc = z2;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                            }
                                            i2++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (cursorRawQuery != null) {
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                        }
                                        i2++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        z2 = true;
                                        if (sQLiteDatabaseZzp != null) {
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                        this.zzc = z2;
                                        if (cursorRawQuery != null) {
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                        }
                                        i2++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            }
                            sQLiteDatabaseZzp.insertOrThrow(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, null, contentValues);
                            sQLiteDatabaseZzp.setTransactionSuccessful();
                            sQLiteDatabaseZzp.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseZzp.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (cursorRawQuery != null) {
                            }
                            if (sQLiteDatabaseZzp == null) {
                            }
                            i2++;
                            z3 = z;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                            this.zzc = true;
                            if (cursorRawQuery != null) {
                            }
                            if (sQLiteDatabaseZzp != null) {
                            }
                            i2++;
                            z3 = z;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            if (sQLiteDatabaseZzp != null) {
                            }
                            this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                            this.zzc = z2;
                            if (cursorRawQuery != null) {
                            }
                            if (sQLiteDatabaseZzp != null) {
                            }
                            i2++;
                            z3 = z;
                        }
                    } catch (SQLiteDatabaseLockedException unused4) {
                        z = z3 ? 1 : 0;
                        cursorRawQuery = null;
                    } catch (SQLiteFullException e9) {
                        e = e9;
                        z = z3 ? 1 : 0;
                        cursorRawQuery = null;
                    } catch (SQLiteException e10) {
                        e = e10;
                        z = z3 ? 1 : 0;
                        z2 = true;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabaseZzp != null) {
                        }
                        throw th;
                    }
                    i2++;
                    z3 = z;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp == null || (iDelete = sQLiteDatabaseZzp.delete(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, null, null)) <= 0) {
                return;
            }
            this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbh.zza(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpm.zza(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(zzah zzahVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzahVar);
        if (bArrZzae.length <= 131072) {
            return zzs(2, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzbeVar);
        if (bArrZzae == null) {
            zzicVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzae.length <= 131072) {
            return zzs(4, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0218 A[Catch: SQLiteDatabaseLockedException -> 0x0121, SQLiteException -> 0x01f5, SQLiteFullException -> 0x01f8, all -> 0x036a, TryCatch #5 {all -> 0x036a, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x032f, B:183:0x0335, B:184:0x0338, B:191:0x035a, B:201:0x0376, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0276, B:149:0x0286, B:156:0x02c5, B:158:0x02e2, B:159:0x02f1), top: B:224:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0264 A[Catch: SQLiteException -> 0x0243, SQLiteFullException -> 0x0246, SQLiteDatabaseLockedException -> 0x0359, all -> 0x036a, TryCatch #5 {all -> 0x036a, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:56:0x0134, B:61:0x014c, B:63:0x0151, B:181:0x032f, B:183:0x0335, B:184:0x0338, B:191:0x035a, B:201:0x0376, B:78:0x0186, B:79:0x0189, B:77:0x0182, B:87:0x019c, B:89:0x01b0, B:96:0x01cb, B:97:0x01d4, B:98:0x01d7, B:94:0x01c5, B:101:0x01db, B:105:0x01f1, B:119:0x0218, B:120:0x0222, B:121:0x0225, B:117:0x0212, B:124:0x022b, B:128:0x023f, B:142:0x0264, B:144:0x026e, B:145:0x0271, B:140:0x025e, B:148:0x0276, B:149:0x0286, B:156:0x02c5, B:158:0x02e2, B:159:0x02f1), top: B:224:0x032f }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0366 A[PHI: r6 r11 r13 r17 r19 r21
      0x0366: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r13v9 android.database.sqlite.SQLiteDatabase) = 
      (r13v5 android.database.sqlite.SQLiteDatabase)
      (r13v7 android.database.sqlite.SQLiteDatabase)
      (r13v10 android.database.sqlite.SQLiteDatabase)
     binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]
      0x0366: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:187:0x034d, B:204:0x038b, B:195:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzm(int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseZzp;
        String str;
        String str2;
        String str3;
        int i2;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        long j2;
        String str4;
        String[] strArr;
        int i3;
        zzfx zzfxVar;
        int i4;
        int i5;
        int i6;
        zzic zzicVar;
        long j3;
        String string2;
        Parcel parcelObtain;
        zzic zzicVar2;
        zzbg zzbgVarCreateFromParcel;
        int i7;
        int i8;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        String str5 = "entry";
        String str6 = "type";
        String str7 = "rowid";
        zzg();
        ?? r6 = 0;
        if (this.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i9 = 0;
        int i10 = 5;
        int i11 = 0;
        for (int i12 = 5; i11 < i12; i12 = 5) {
            try {
                sQLiteDatabaseZzp = zzp();
                try {
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    if (cursor != null) {
                    }
                    if (sQLiteDatabaseZzp != null) {
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused) {
                str = str5;
                str2 = str6;
                str3 = str7;
                i2 = i9;
                sQLiteDatabaseZzp = null;
            } catch (SQLiteFullException e) {
                e = e;
                str = str5;
                str2 = str6;
                str3 = str7;
                i2 = i9;
                sQLiteDatabaseZzp = null;
            } catch (SQLiteException e2) {
                e = e2;
                str = str5;
                str2 = str6;
                str3 = str7;
                i2 = i9;
                sQLiteDatabaseZzp = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                sQLiteDatabaseZzp = null;
            }
            if (sQLiteDatabaseZzp == null) {
                this.zzc = true;
                return r6;
            }
            try {
                sQLiteDatabaseZzp.beginTransaction();
                try {
                    cursorQuery2 = sQLiteDatabaseZzp.query(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, new String[]{str7}, "type=?", new String[]{Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET}, null, null, "rowid desc", Constants.SdidMigrationStatusCodes.ALREADY_SDID);
                    try {
                        j = -1;
                        if (cursorQuery2.moveToFirst()) {
                            j2 = cursorQuery2.getLong(i9);
                            cursorQuery2.close();
                        } else {
                            cursorQuery2.close();
                            j2 = -1;
                        }
                        if (j2 != -1) {
                            String[] strArr2 = new String[1];
                            strArr2[i9] = String.valueOf(j2);
                            str4 = "rowid<?";
                            strArr = strArr2;
                        } else {
                            str4 = r6;
                            strArr = str4;
                        }
                        String[] strArr3 = {str7, str6, str5};
                        zzic zzicVar3 = this.zzu;
                        zzal zzalVarZzc = zzicVar3.zzc();
                        i3 = 1;
                        zzfxVar = zzfy.zzbb;
                        boolean zZzp = zzalVarZzc.zzp(r6, zzfxVar);
                        i4 = 4;
                        i5 = 3;
                        i6 = 2;
                        if (zZzp) {
                            strArr3 = new String[i12];
                            strArr3[i9] = str7;
                            strArr3[1] = str6;
                            strArr3[2] = str5;
                            strArr3[3] = "app_version";
                            strArr3[4] = "app_version_int";
                        }
                        String[] strArr4 = strArr3;
                        zzicVar = zzicVar3;
                        cursorQuery = sQLiteDatabaseZzp.query(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, strArr4, str4, strArr, null, null, "rowid asc", Integer.toString(100));
                    } catch (Throwable th3) {
                        th = th3;
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        i2 = i9;
                        if (cursorQuery2 != null) {
                            try {
                                cursorQuery2.close();
                            } catch (SQLiteDatabaseLockedException unused2) {
                                cursorQuery = null;
                                SystemClock.sleep(i10);
                                i10 += 20;
                                if (cursorQuery != null) {
                                }
                                if (sQLiteDatabaseZzp == null) {
                                }
                                i11++;
                                i9 = i2;
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                r6 = 0;
                            } catch (SQLiteFullException e3) {
                                e = e3;
                                cursorQuery = null;
                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                this.zzc = true;
                                if (cursorQuery != null) {
                                }
                                if (sQLiteDatabaseZzp == null) {
                                }
                                i11++;
                                i9 = i2;
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                r6 = 0;
                            } catch (SQLiteException e4) {
                                e = e4;
                                cursorQuery = null;
                                if (sQLiteDatabaseZzp != null) {
                                }
                                this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                this.zzc = true;
                                if (cursorQuery != null) {
                                }
                                if (sQLiteDatabaseZzp == null) {
                                }
                                i11++;
                                i9 = i2;
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                r6 = 0;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    i2 = i9;
                    cursorQuery2 = null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                str = str5;
                str2 = str6;
                str3 = str7;
                i2 = i9;
            } catch (SQLiteFullException e5) {
                e = e5;
                str = str5;
                str2 = str6;
                str3 = str7;
                i2 = i9;
            } catch (SQLiteException e6) {
                e = e6;
                str = str5;
                str2 = str6;
                str3 = str7;
                i2 = i9;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    j = cursorQuery.getLong(i9);
                    int i13 = cursorQuery.getInt(i3);
                    byte[] blob = cursorQuery.getBlob(i6);
                    try {
                        if (zzicVar.zzc().zzp(null, zzfxVar)) {
                            string2 = cursorQuery.getString(i5);
                            j3 = cursorQuery.getLong(i4);
                        } else {
                            j3 = 0;
                            string2 = null;
                        }
                        String str8 = str5;
                        long j4 = j3;
                        str2 = str6;
                        if (i13 == 0) {
                            try {
                                parcelObtain = Parcel.obtain();
                                zzicVar2 = zzicVar;
                                try {
                                    str3 = str7;
                                    try {
                                        try {
                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                            parcelObtain.setDataPosition(0);
                                            zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            throw th;
                                        }
                                    } catch (SafeParcelReader.ParseException unused4) {
                                        this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                        parcelObtain.recycle();
                                        str = str8;
                                        i8 = 2;
                                        i7 = 3;
                                        i2 = 0;
                                        i5 = i7;
                                        i9 = i2;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        i3 = 1;
                                        i4 = 4;
                                        i6 = i8;
                                        zzicVar = zzicVar2;
                                    }
                                } catch (SafeParcelReader.ParseException unused5) {
                                    str3 = str7;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                try {
                                    if (zzbgVarCreateFromParcel != null) {
                                        arrayList.add(new zzgk(zzbgVarCreateFromParcel, string2, j4));
                                    }
                                    str = str8;
                                    i8 = 2;
                                    i7 = 3;
                                    i2 = 0;
                                    i5 = i7;
                                    i9 = i2;
                                    str5 = str;
                                    str6 = str2;
                                    str7 = str3;
                                    i3 = 1;
                                    i4 = 4;
                                    i6 = i8;
                                    zzicVar = zzicVar2;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    str = str8;
                                    i2 = 0;
                                    SystemClock.sleep(i10);
                                    i10 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp == null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i11++;
                                    i9 = i2;
                                    str5 = str;
                                    str6 = str2;
                                    str7 = str3;
                                    r6 = 0;
                                } catch (SQLiteFullException e7) {
                                    e = e7;
                                    str = str8;
                                    i2 = 0;
                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                    this.zzc = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp == null) {
                                    }
                                    i11++;
                                    i9 = i2;
                                    str5 = str;
                                    str6 = str2;
                                    str7 = str3;
                                    r6 = 0;
                                } catch (SQLiteException e8) {
                                    e = e8;
                                    str = str8;
                                    i2 = 0;
                                    if (sQLiteDatabaseZzp != null) {
                                        try {
                                            if (sQLiteDatabaseZzp.inTransaction()) {
                                                sQLiteDatabaseZzp.endTransaction();
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                                sQLiteDatabaseZzp.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                    this.zzc = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp == null) {
                                    }
                                    i11++;
                                    i9 = i2;
                                    str5 = str;
                                    str6 = str2;
                                    str7 = str3;
                                    r6 = 0;
                                }
                            } catch (SQLiteDatabaseLockedException unused7) {
                                str3 = str7;
                            } catch (SQLiteFullException e9) {
                                e = e9;
                                str3 = str7;
                            } catch (SQLiteException e10) {
                                e = e10;
                                str3 = str7;
                            }
                        } else {
                            zzicVar2 = zzicVar;
                            str3 = str7;
                            if (i13 == 1) {
                                parcelObtain = Parcel.obtain();
                                try {
                                    try {
                                        parcelObtain.unmarshall(blob, 0, blob.length);
                                        parcelObtain.setDataPosition(0);
                                        zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain);
                                    } finally {
                                        parcelObtain.recycle();
                                    }
                                } catch (SafeParcelReader.ParseException unused8) {
                                    this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                    parcelObtain.recycle();
                                    zzplVarCreateFromParcel = null;
                                }
                                if (zzplVarCreateFromParcel != null) {
                                    arrayList.add(new zzgk(zzplVarCreateFromParcel, string2, j4));
                                }
                                str = str8;
                                i8 = 2;
                                i7 = 3;
                                i2 = 0;
                                i5 = i7;
                                i9 = i2;
                                str5 = str;
                                str6 = str2;
                                str7 = str3;
                                i3 = 1;
                                i4 = 4;
                                i6 = i8;
                                zzicVar = zzicVar2;
                            } else {
                                i8 = 2;
                                if (i13 == 2) {
                                    parcelObtain = Parcel.obtain();
                                    try {
                                        str = str8;
                                        try {
                                            try {
                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                parcelObtain.setDataPosition(0);
                                                zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain);
                                            } catch (SafeParcelReader.ParseException unused9) {
                                                this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                parcelObtain.recycle();
                                                zzahVarCreateFromParcel = null;
                                                if (zzahVarCreateFromParcel != null) {
                                                }
                                                i7 = 3;
                                                i2 = 0;
                                                i5 = i7;
                                                i9 = i2;
                                                str5 = str;
                                                str6 = str2;
                                                str7 = str3;
                                                i3 = 1;
                                                i4 = 4;
                                                i6 = i8;
                                                zzicVar = zzicVar2;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            throw th;
                                        }
                                    } catch (SafeParcelReader.ParseException unused10) {
                                        str = str8;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        str = str8;
                                    }
                                    try {
                                        if (zzahVarCreateFromParcel != null) {
                                            arrayList.add(new zzgk(zzahVarCreateFromParcel, string2, j4));
                                        }
                                        i7 = 3;
                                        i2 = 0;
                                        i5 = i7;
                                        i9 = i2;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        i3 = 1;
                                        i4 = 4;
                                        i6 = i8;
                                        zzicVar = zzicVar2;
                                    } catch (SQLiteDatabaseLockedException unused11) {
                                        i2 = 0;
                                        SystemClock.sleep(i10);
                                        i10 += 20;
                                        if (cursorQuery != null) {
                                        }
                                        if (sQLiteDatabaseZzp == null) {
                                        }
                                        i11++;
                                        i9 = i2;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        r6 = 0;
                                    } catch (SQLiteFullException e11) {
                                        e = e11;
                                        i2 = 0;
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                        }
                                        if (sQLiteDatabaseZzp == null) {
                                        }
                                        i11++;
                                        i9 = i2;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        r6 = 0;
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        i2 = 0;
                                        if (sQLiteDatabaseZzp != null) {
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                        }
                                        if (sQLiteDatabaseZzp == null) {
                                        }
                                        i11++;
                                        i9 = i2;
                                        str5 = str;
                                        str6 = str2;
                                        str7 = str3;
                                        r6 = 0;
                                    }
                                } else {
                                    str = str8;
                                    if (i13 == 4) {
                                        parcelObtain = Parcel.obtain();
                                        try {
                                            i2 = 0;
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain);
                                                } catch (SafeParcelReader.ParseException unused12) {
                                                    this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                    parcelObtain.recycle();
                                                    zzbeVarCreateFromParcel = null;
                                                    if (zzbeVarCreateFromParcel != null) {
                                                    }
                                                    i7 = 3;
                                                    i5 = i7;
                                                    i9 = i2;
                                                    str5 = str;
                                                    str6 = str2;
                                                    str7 = str3;
                                                    i3 = 1;
                                                    i4 = 4;
                                                    i6 = i8;
                                                    zzicVar = zzicVar2;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                throw th;
                                            }
                                        } catch (SafeParcelReader.ParseException unused13) {
                                            i2 = 0;
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                        try {
                                            if (zzbeVarCreateFromParcel != null) {
                                                arrayList.add(new zzgk(zzbeVarCreateFromParcel, string2, j4));
                                            }
                                            i7 = 3;
                                        } catch (SQLiteDatabaseLockedException unused14) {
                                            SystemClock.sleep(i10);
                                            i10 += 20;
                                            if (cursorQuery != null) {
                                            }
                                            if (sQLiteDatabaseZzp == null) {
                                            }
                                            i11++;
                                            i9 = i2;
                                            str5 = str;
                                            str6 = str2;
                                            str7 = str3;
                                            r6 = 0;
                                        } catch (SQLiteFullException e13) {
                                            e = e13;
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursorQuery != null) {
                                            }
                                            if (sQLiteDatabaseZzp == null) {
                                            }
                                            i11++;
                                            i9 = i2;
                                            str5 = str;
                                            str6 = str2;
                                            str7 = str3;
                                            r6 = 0;
                                        } catch (SQLiteException e14) {
                                            e = e14;
                                            if (sQLiteDatabaseZzp != null) {
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                            this.zzc = true;
                                            if (cursorQuery != null) {
                                            }
                                            if (sQLiteDatabaseZzp == null) {
                                            }
                                            i11++;
                                            i9 = i2;
                                            str5 = str;
                                            str6 = str2;
                                            str7 = str3;
                                            r6 = 0;
                                        }
                                    } else {
                                        i7 = 3;
                                        i2 = 0;
                                        if (i13 == 3) {
                                            this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                        } else {
                                            this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                        }
                                    }
                                    i5 = i7;
                                    i9 = i2;
                                    str5 = str;
                                    str6 = str2;
                                    str7 = str3;
                                    i3 = 1;
                                    i4 = 4;
                                    i6 = i8;
                                    zzicVar = zzicVar2;
                                }
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                    } catch (SQLiteFullException e15) {
                        e = e15;
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                    } catch (SQLiteException e16) {
                        e = e16;
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                    }
                } catch (SQLiteDatabaseLockedException unused16) {
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    i2 = i9;
                } catch (SQLiteFullException e17) {
                    e = e17;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    i2 = i9;
                } catch (SQLiteException e18) {
                    e = e18;
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    i2 = i9;
                }
                i11++;
                i9 = i2;
                str5 = str;
                str6 = str2;
                str7 = str3;
                r6 = 0;
            }
            if (sQLiteDatabaseZzp.delete(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
            }
            sQLiteDatabaseZzp.setTransactionSuccessful();
            sQLiteDatabaseZzp.endTransaction();
            cursorQuery.close();
            sQLiteDatabaseZzp.close();
            return arrayList;
        }
        this.zzu.zzaV().zze().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[PHI: r4
      0x0068: PHI (r4v4 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:28:0x0066, B:25:0x005f, B:32:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i = 5;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    this.zzu.zzaV().zze().zza("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzp = zzp();
                            if (sQLiteDatabaseZzp != null) {
                                sQLiteDatabaseZzp.beginTransaction();
                                sQLiteDatabaseZzp.delete(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseZzp.setTransactionSuccessful();
                                sQLiteDatabaseZzp.endTransaction();
                                sQLiteDatabaseZzp.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteFullException e) {
                            this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e);
                            this.zzc = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteException e2) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e2);
                        this.zzc = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                    }
                }
                i2++;
            }
        }
        return false;
    }

    final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context contextZzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
