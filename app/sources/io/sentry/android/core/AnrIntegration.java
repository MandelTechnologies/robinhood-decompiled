package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.ANRWatchDog;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.TransactionEnd;
import io.sentry.protocol.Mechanism;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes14.dex */
public final class AnrIntegration implements Integration, Closeable {

    @SuppressLint({"StaticFieldLeak"})
    private static ANRWatchDog anrWatchDog;
    private static final Object watchDogLock = new Object();
    private final Context context;
    private SentryOptions options;
    private boolean isClosed = false;
    private final Object startLock = new Object();

    public AnrIntegration(Context context) {
        this.context = context;
    }

    @Override // io.sentry.Integration
    public final void register(IHub iHub, SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        register(iHub, (SentryAndroidOptions) sentryOptions);
    }

    private void register(final IHub iHub, final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            IntegrationUtils.addIntegrationToSdkVersion((Class<?>) AnrIntegration.class);
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.AnrIntegration$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.$r8$lambda$m382jvuBl5o46ZjD6luefQymt2k(this.f$0, iHub, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$m382jvuBl5o46ZjD6luefQymt2k(AnrIntegration anrIntegration, IHub iHub, SentryAndroidOptions sentryAndroidOptions) {
        synchronized (anrIntegration.startLock) {
            try {
                if (!anrIntegration.isClosed) {
                    anrIntegration.startAnrWatchdog(iHub, sentryAndroidOptions);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startAnrWatchdog(final IHub iHub, final SentryAndroidOptions sentryAndroidOptions) {
        synchronized (watchDogLock) {
            try {
                if (anrWatchDog == null) {
                    ILogger logger = sentryAndroidOptions.getLogger();
                    SentryLevel sentryLevel = SentryLevel.DEBUG;
                    logger.log(sentryLevel, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    ANRWatchDog aNRWatchDog = new ANRWatchDog(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new ANRWatchDog.ANRListener() { // from class: io.sentry.android.core.AnrIntegration$$ExternalSyntheticLambda1
                        @Override // io.sentry.android.core.ANRWatchDog.ANRListener
                        public final void onAppNotResponding(ApplicationNotResponding applicationNotResponding) {
                            this.f$0.reportANR(iHub, sentryAndroidOptions, applicationNotResponding);
                        }
                    }, sentryAndroidOptions.getLogger(), this.context);
                    anrWatchDog = aNRWatchDog;
                    aNRWatchDog.start();
                    sentryAndroidOptions.getLogger().log(sentryLevel, "AnrIntegration installed.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reportANR(IHub iHub, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean zEquals = Boolean.TRUE.equals(AppState.getInstance().isInBackground());
        SentryEvent sentryEvent = new SentryEvent(buildAnrThrowable(zEquals, sentryAndroidOptions, applicationNotResponding));
        sentryEvent.setLevel(SentryLevel.ERROR);
        iHub.captureEvent(sentryEvent, HintUtils.createWithTypeCheckHint(new AnrHint(zEquals)));
    }

    private Throwable buildAnrThrowable(boolean z, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z) {
            str = "Background " + str;
        }
        ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(str, applicationNotResponding.getThread());
        Mechanism mechanism = new Mechanism();
        mechanism.setType("ANR");
        return new ExceptionMechanismException(mechanism, applicationNotResponding2, applicationNotResponding2.getThread(), true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.startLock) {
            this.isClosed = true;
        }
        synchronized (watchDogLock) {
            try {
                ANRWatchDog aNRWatchDog = anrWatchDog;
                if (aNRWatchDog != null) {
                    aNRWatchDog.interrupt();
                    anrWatchDog = null;
                    SentryOptions sentryOptions = this.options;
                    if (sentryOptions != null) {
                        sentryOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static final class AnrHint implements AbnormalExit, TransactionEnd {
        private final boolean isBackgroundAnr;

        @Override // io.sentry.hints.AbnormalExit
        public boolean ignoreCurrentThread() {
            return true;
        }

        @Override // io.sentry.hints.AbnormalExit
        public Long timestamp() {
            return null;
        }

        AnrHint(boolean z) {
            this.isBackgroundAnr = z;
        }

        @Override // io.sentry.hints.AbnormalExit
        public String mechanism() {
            return this.isBackgroundAnr ? "anr_background" : "anr_foreground";
        }
    }
}
