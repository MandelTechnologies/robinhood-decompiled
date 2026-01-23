package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.t */
/* loaded from: classes27.dex */
public abstract class AbstractRunnableC5214t implements Runnable {

    /* renamed from: a */
    private final TaskCompletionSource f856a;

    AbstractRunnableC5214t() {
        this.f856a = null;
    }

    public AbstractRunnableC5214t(TaskCompletionSource taskCompletionSource) {
        this.f856a = taskCompletionSource;
    }

    /* renamed from: a */
    public void mo860a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f856a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* renamed from: b */
    protected abstract void mo861b();

    /* renamed from: c */
    final TaskCompletionSource m988c() {
        return this.f856a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo861b();
        } catch (Exception e) {
            mo860a(e);
        }
    }
}
