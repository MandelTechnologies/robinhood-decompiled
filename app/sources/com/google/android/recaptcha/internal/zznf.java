package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zznf;
import com.google.android.recaptcha.internal.zznl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public class zznf<MessageType extends zznl<MessageType, BuilderType>, BuilderType extends zznf<MessageType, BuilderType>> extends zzkp<MessageType, BuilderType> {
    protected zznl zza;
    private final zznl zzb;

    protected zznf(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzK()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzu();
    }

    private static void zzd(Object obj, Object obj2) {
        zzpa.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzor
    public final /* synthetic */ zzoq zzaf() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkp
    protected final /* synthetic */ zzkp zzb(zzkq zzkqVar) {
        zzg((zznl) zzkqVar);
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzkp
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zznf zza() {
        zznf zznfVar = (zznf) this.zzb.zzh(5, null, null);
        zznfVar.zza = zzk();
        return zznfVar;
    }

    public final zznf zzg(zznl zznlVar) {
        if (!this.zzb.equals(zznlVar)) {
            if (!this.zza.zzK()) {
                zzn();
            }
            zzd(this.zza, zznlVar);
        }
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzop
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final MessageType zzj() {
        MessageType messagetype = (MessageType) zzk();
        if (zznl.zzJ(messagetype, true)) {
            return messagetype;
        }
        throw new zzpu(messagetype);
    }

    @Override // com.google.android.recaptcha.internal.zzop
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzK()) {
            return (MessageType) this.zza;
        }
        this.zza.zzF();
        return (MessageType) this.zza;
    }

    protected final void zzm() {
        if (this.zza.zzK()) {
            return;
        }
        zzn();
    }

    protected void zzn() {
        zznl zznlVarZzu = this.zzb.zzu();
        zzd(zznlVarZzu, this.zza);
        this.zza = zznlVarZzu;
    }

    @Override // com.google.android.recaptcha.internal.zzor
    public final boolean zzo() {
        return zznl.zzJ(this.zza, false);
    }
}
