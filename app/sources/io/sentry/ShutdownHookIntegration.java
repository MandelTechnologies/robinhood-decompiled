package io.sentry;

import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes21.dex */
public final class ShutdownHookIntegration implements Integration, Closeable {
    private final Runtime runtime;
    private Thread thread;

    public ShutdownHookIntegration(Runtime runtime) {
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "Runtime is required");
    }

    public ShutdownHookIntegration() {
        this(Runtime.getRuntime());
    }

    @Override // io.sentry.Integration
    public void register(final IHub iHub, final SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (sentryOptions.isEnableShutdownHook()) {
            this.thread = new Thread(new Runnable() { // from class: io.sentry.ShutdownHookIntegration$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    iHub.flush(sentryOptions.getFlushTimeoutMillis());
                }
            });
            handleShutdownInProgress(new Runnable() { // from class: io.sentry.ShutdownHookIntegration$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration.m28514$r8$lambda$FKX5vC2E3WmjmJjtqJsnNqsII(this.f$0, sentryOptions);
                }
            });
        } else {
            sentryOptions.getLogger().log(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
        }
    }

    /* renamed from: $r8$lambda$-FKX5vC2E3W-mjmJjtqJsnNqsII, reason: not valid java name */
    public static /* synthetic */ void m28514$r8$lambda$FKX5vC2E3WmjmJjtqJsnNqsII(ShutdownHookIntegration shutdownHookIntegration, SentryOptions sentryOptions) {
        shutdownHookIntegration.runtime.addShutdownHook(shutdownHookIntegration.thread);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion((Class<?>) ShutdownHookIntegration.class);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.thread != null) {
            handleShutdownInProgress(new Runnable() { // from class: io.sentry.ShutdownHookIntegration$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ShutdownHookIntegration shutdownHookIntegration = this.f$0;
                    shutdownHookIntegration.runtime.removeShutdownHook(shutdownHookIntegration.thread);
                }
            });
        }
    }

    private void handleShutdownInProgress(Runnable runnable) {
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }
}
