package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkp;
import com.google.android.recaptcha.internal.zzkq;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public abstract class zzkp<MessageType extends zzkq<MessageType, BuilderType>, BuilderType extends zzkp<MessageType, BuilderType>> implements zzop {
    @Override // 
    public abstract zzkp zza();

    protected abstract zzkp zzb(zzkq zzkqVar);

    @Override // com.google.android.recaptcha.internal.zzop
    public final /* bridge */ /* synthetic */ zzop zzc(zzoq zzoqVar) {
        if (zzaf().getClass().isInstance(zzoqVar)) {
            return zzb((zzkq) zzoqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
