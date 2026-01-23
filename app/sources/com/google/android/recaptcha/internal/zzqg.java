package com.google.android.recaptcha.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzqg {
    public static final zzqg zza;
    public static final zzqg zzb;
    public static final zzqg zzc;
    public static final zzqg zzd;
    public static final zzqg zze;
    public static final zzqg zzf;
    public static final zzqg zzg;
    public static final zzqg zzh;
    public static final zzqg zzi;
    public static final zzqg zzj;
    public static final zzqg zzk;
    public static final zzqg zzl;
    public static final zzqg zzm;
    public static final zzqg zzn;
    public static final zzqg zzo;
    public static final zzqg zzp;
    public static final zzqg zzq;
    public static final zzqg zzr;
    private static final /* synthetic */ zzqg[] zzs;
    private final zzqh zzt;

    static {
        zzqg zzqgVar = new zzqg("DOUBLE", 0, zzqh.DOUBLE, 1);
        zza = zzqgVar;
        zzqg zzqgVar2 = new zzqg("FLOAT", 1, zzqh.FLOAT, 5);
        zzb = zzqgVar2;
        zzqh zzqhVar = zzqh.LONG;
        zzqg zzqgVar3 = new zzqg("INT64", 2, zzqhVar, 0);
        zzc = zzqgVar3;
        zzqg zzqgVar4 = new zzqg("UINT64", 3, zzqhVar, 0);
        zzd = zzqgVar4;
        zzqh zzqhVar2 = zzqh.INT;
        zzqg zzqgVar5 = new zzqg("INT32", 4, zzqhVar2, 0);
        zze = zzqgVar5;
        zzqg zzqgVar6 = new zzqg("FIXED64", 5, zzqhVar, 1);
        zzf = zzqgVar6;
        zzqg zzqgVar7 = new zzqg("FIXED32", 6, zzqhVar2, 5);
        zzg = zzqgVar7;
        zzqg zzqgVar8 = new zzqg("BOOL", 7, zzqh.BOOLEAN, 0);
        zzh = zzqgVar8;
        zzqg zzqgVar9 = new zzqg("STRING", 8, zzqh.STRING, 2);
        zzi = zzqgVar9;
        zzqh zzqhVar3 = zzqh.MESSAGE;
        zzqg zzqgVar10 = new zzqg("GROUP", 9, zzqhVar3, 3);
        zzj = zzqgVar10;
        zzqg zzqgVar11 = new zzqg("MESSAGE", 10, zzqhVar3, 2);
        zzk = zzqgVar11;
        zzqg zzqgVar12 = new zzqg("BYTES", 11, zzqh.BYTE_STRING, 2);
        zzl = zzqgVar12;
        zzqg zzqgVar13 = new zzqg("UINT32", 12, zzqhVar2, 0);
        zzm = zzqgVar13;
        zzqg zzqgVar14 = new zzqg("ENUM", 13, zzqh.ENUM, 0);
        zzn = zzqgVar14;
        zzqg zzqgVar15 = new zzqg("SFIXED32", 14, zzqhVar2, 5);
        zzo = zzqgVar15;
        zzqg zzqgVar16 = new zzqg("SFIXED64", 15, zzqhVar, 1);
        zzp = zzqgVar16;
        zzqg zzqgVar17 = new zzqg("SINT32", 16, zzqhVar2, 0);
        zzq = zzqgVar17;
        zzqg zzqgVar18 = new zzqg("SINT64", 17, zzqhVar, 0);
        zzr = zzqgVar18;
        zzs = new zzqg[]{zzqgVar, zzqgVar2, zzqgVar3, zzqgVar4, zzqgVar5, zzqgVar6, zzqgVar7, zzqgVar8, zzqgVar9, zzqgVar10, zzqgVar11, zzqgVar12, zzqgVar13, zzqgVar14, zzqgVar15, zzqgVar16, zzqgVar17, zzqgVar18};
    }

    private zzqg(String str, int i, zzqh zzqhVar, int i2) {
        this.zzt = zzqhVar;
    }

    public static zzqg[] values() {
        return (zzqg[]) zzs.clone();
    }

    public final zzqh zza() {
        return this.zzt;
    }
}
