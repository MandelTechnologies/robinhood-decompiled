package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
abstract class zzju implements zzjy {
    zzju() {
    }

    @Override // com.google.android.recaptcha.internal.zzjy
    public final zzjx zza(CharSequence charSequence, Charset charset) {
        zzjz zzjzVarZzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzjt) zzjzVarZzb).zza(bytes, 0, bytes.length);
        return zzjzVarZzb.zzb();
    }
}
