package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.MissingResourceException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzep {
    private static zzqu zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeq zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzql.zzc(zzql.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzep(int i, String str, int i2, String str2, String str3, String str4, String str5, zzeq zzeqVar, zzce zzceVar, Context context, Integer num) {
        this.zzk = i;
        this.zzb = str;
        this.zzl = i2;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeqVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:59:0x00e1
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Path cross not found for [B:34:0x00c7, B:38:0x00e8], limit reached: 71 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[Catch: NameNotFoundException -> 0x015f, TryCatch #2 {NameNotFoundException -> 0x015f, blocks: (B:43:0x0115, B:45:0x0119, B:48:0x0138, B:49:0x014d), top: B:66:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(int r13, com.google.android.recaptcha.internal.zzra r14) throws java.util.MissingResourceException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzep.zzc(int, com.google.android.recaptcha.internal.zzra):void");
    }

    public final void zza() throws MissingResourceException {
        zzc(3, null);
    }

    public final void zzb(zzbf zzbfVar) throws MissingResourceException {
        zzqz zzqzVarZzg = zzra.zzg();
        zzqzVarZzg.zzq(String.valueOf(zzbfVar.zzb().zza()));
        zzqzVarZzg.zzd(zzbfVar.zza().zza());
        zzqzVarZzg.zzp(zzbfVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzbfVar.zzd();
        if (strZzd != null) {
            zzqzVarZzg.zze(strZzd);
        }
        zzc(4, (zzra) zzqzVarZzg.zzj());
    }
}
