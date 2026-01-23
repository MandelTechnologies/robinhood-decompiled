package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes21.dex */
public final class SentryExecutorService implements ISentryExecutorService {
    private final ScheduledExecutorService executorService;

    SentryExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
    }

    public SentryExecutorService() {
        this(Executors.newSingleThreadScheduledExecutor(new SentryExecutorServiceThreadFactory()));
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.executorService.submit(runnable);
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> schedule(Runnable runnable, long j) {
        return this.executorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[Catch: all -> 0x0020, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:7:0x0010, B:9:0x001a, B:13:0x0022, B:14:0x002e), top: B:18:0x0003, inners: #1 }] */
    @Override // io.sentry.ISentryExecutorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close(long j) {
        synchronized (this.executorService) {
            if (!this.executorService.isShutdown()) {
                this.executorService.shutdown();
                try {
                } catch (InterruptedException unused) {
                    this.executorService.shutdownNow();
                    Thread.currentThread().interrupt();
                }
                if (!this.executorService.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                    this.executorService.shutdownNow();
                }
            }
        }
    }

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }

    private static final class SentryExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        private SentryExecutorServiceThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryExecutorServiceThreadFactory-");
            int i = this.cnt;
            this.cnt = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }
}
