package com.google.android.recaptcha.internal;

import com.plaid.internal.EnumC7081g;
import java.util.HashMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzgh {
    private final zzgg zza;
    private final HashMap zzb;
    private final zzfy zzc;
    private final zzci zzd;

    public zzgh(zzfy zzfyVar, zzci zzciVar, zzbq zzbqVar) {
        this.zzc = zzfyVar;
        this.zzd = zzciVar;
        zzgg zzggVar = new zzgg();
        this.zza = zzggVar;
        HashMap map = new HashMap();
        this.zzb = map;
        zzggVar.zzd(EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, map);
    }

    public final zzgg zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, this.zzb);
    }

    public final zzci zzc() {
        return this.zzd;
    }

    public final zzfy zzd() {
        return this.zzc;
    }

    public final void zze(int i, Object obj) {
        this.zzb.put(Integer.valueOf(i - 2), obj);
    }
}
