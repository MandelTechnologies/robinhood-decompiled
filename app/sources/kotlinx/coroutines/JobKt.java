package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata(m3635d1 = {"kotlinx/coroutines/JobKt__JobKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class JobKt {
    public static final CompletableJob Job(Job job) {
        return Job6.Job(job);
    }

    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job6.cancel(coroutineContext, cancellationException);
    }

    public static final void cancel(Job job, String str, Throwable th) {
        Job6.cancel(job, str, th);
    }

    public static final Object cancelAndJoin(Job job, Continuation<? super Unit> continuation) {
        return Job6.cancelAndJoin(job, continuation);
    }

    public static final void cancelChildren(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job6.cancelChildren(coroutineContext, cancellationException);
    }

    public static final Job4 disposeOnCompletion(Job job, Job4 job4) {
        return Job6.disposeOnCompletion(job, job4);
    }

    public static final void ensureActive(CoroutineContext coroutineContext) {
        Job6.ensureActive(coroutineContext);
    }

    public static final void ensureActive(Job job) {
        Job6.ensureActive(job);
    }

    public static final Job getJob(CoroutineContext coroutineContext) {
        return Job6.getJob(coroutineContext);
    }

    public static final Job4 invokeOnCompletion(Job job, boolean z, JobNode jobNode) {
        return Job6.invokeOnCompletion(job, z, jobNode);
    }

    public static final boolean isActive(CoroutineContext coroutineContext) {
        return Job6.isActive(coroutineContext);
    }
}
