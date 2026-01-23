package com.robinhood.utils.p408rx;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;

/* compiled from: ScopedSubscription.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/rx/JobDisposable;", "Lio/reactivex/disposables/Disposable;", "job", "Lkotlinx/coroutines/Job;", "message", "", "<init>", "(Lkotlinx/coroutines/Job;Ljava/lang/String;)V", "isDisposed", "", "dispose", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
final class JobDisposable implements Disposable {
    private final Job job;
    private final String message;

    public JobDisposable(Job job, String message) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(message, "message");
        this.job = job;
        this.message = message;
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.job.isCompleted();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        Job6.cancel$default(this.job, this.message, null, 2, null);
    }
}
