package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Queue;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
public abstract class zzjp extends zzjn implements Queue {
    protected zzjp() {
    }

    @Override // java.util.Queue
    public final Object element() {
        return zzd().element();
    }

    public boolean offer(Object obj) {
        return zzd().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zzd().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zzd().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zzd().remove();
    }

    @Override // com.google.android.recaptcha.internal.zzjn
    protected /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    protected abstract Queue zzd();
}
