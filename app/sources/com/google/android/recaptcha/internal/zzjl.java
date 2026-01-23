package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public final class zzjl extends zzjp implements Serializable {
    final int zza;
    private final Queue zzb;

    public static zzjl zza(int i) {
        return new zzjl(i);
    }

    @Override // com.google.android.recaptcha.internal.zzjn, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.zza) {
            return zzjs.zza(this, collection.iterator());
        }
        clear();
        int i = size - this.zza;
        zzjh.zzb(i >= 0, "number to skip cannot be negative");
        return zzjs.zza(this, new zzjr(collection, i).iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzjp, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzjn, com.google.android.recaptcha.internal.zzjo
    protected final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjp, com.google.android.recaptcha.internal.zzjn
    protected final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzjp
    protected final Queue zzd() {
        return this.zzb;
    }

    private zzjl(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zzjk.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
        }
        this.zzb = new ArrayDeque(i);
        this.zza = i;
    }

    @Override // com.google.android.recaptcha.internal.zzjn, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }
}
