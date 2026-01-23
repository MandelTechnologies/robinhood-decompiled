package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.6.0 */
/* loaded from: classes27.dex */
final class zzbx implements Executor {
    public static final zzbx zza = new zzbx();

    private zzbx() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
