package com.google.android.recaptcha.internal;

import android.content.Context;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzif implements zzij {
    private final Context zza;

    public zzif(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzij
    /* renamed from: cs */
    public final /* synthetic */ Object mo992cs(Object[] objArr) {
        return zzig.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzij
    public final Object zza(Object... objArr) {
        return this.zza.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
