package com.google.android.recaptcha.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
public final class zznw {
    public static final zznw zza;
    public static final zznw zzb;
    public static final zznw zzc;
    public static final zznw zzd;
    public static final zznw zze;
    public static final zznw zzf;
    public static final zznw zzg;
    public static final zznw zzh;
    public static final zznw zzi;
    public static final zznw zzj;
    private static final /* synthetic */ zznw[] zzk;
    private final Class zzl;

    static {
        zznw zznwVar = new zznw("VOID", 0, Void.class, Void.class, null);
        zza = zznwVar;
        Class cls = Integer.TYPE;
        zznw zznwVar2 = new zznw("INT", 1, cls, Integer.class, 0);
        zzb = zznwVar2;
        zznw zznwVar3 = new zznw("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zznwVar3;
        zznw zznwVar4 = new zznw("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zznwVar4;
        zznw zznwVar5 = new zznw("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zznwVar5;
        zznw zznwVar6 = new zznw("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zznwVar6;
        zznw zznwVar7 = new zznw("STRING", 6, String.class, String.class, "");
        zzg = zznwVar7;
        zznw zznwVar8 = new zznw("BYTE_STRING", 7, zzlg.class, zzlg.class, zzlg.zzb);
        zzh = zznwVar8;
        zznw zznwVar9 = new zznw("ENUM", 8, cls, Integer.class, null);
        zzi = zznwVar9;
        zznw zznwVar10 = new zznw("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zznwVar10;
        zzk = new zznw[]{zznwVar, zznwVar2, zznwVar3, zznwVar4, zznwVar5, zznwVar6, zznwVar7, zznwVar8, zznwVar9, zznwVar10};
    }

    private zznw(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zznw[] values() {
        return (zznw[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
