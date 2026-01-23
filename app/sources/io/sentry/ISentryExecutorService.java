package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes21.dex */
public interface ISentryExecutorService {
    void close(long j);

    boolean isClosed();

    Future<?> schedule(Runnable runnable, long j) throws RejectedExecutionException;

    Future<?> submit(Runnable runnable) throws RejectedExecutionException;
}
