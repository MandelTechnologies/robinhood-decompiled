package io.sentry.android.core;

import android.app.Activity;
import io.sentry.Attachment;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.android.core.internal.util.ScreenshotUtils;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;

/* loaded from: classes21.dex */
public final class ScreenshotEventProcessor implements EventProcessor {
    private final BuildInfoProvider buildInfoProvider;
    private final Debouncer debouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), 2000, 3);
    private final SentryAndroidOptions options;

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return sentryTransaction;
    }

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            IntegrationUtils.addIntegrationToSdkVersion((Class<?>) ScreenshotEventProcessor.class);
        }
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        byte[] bArrTakeScreenshot;
        if (sentryEvent.isErrored()) {
            if (!this.options.isAttachScreenshot()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return sentryEvent;
            }
            Activity activity = CurrentActivityHolder.getInstance().getActivity();
            if (activity != null && !HintUtils.isFromHybridSdk(hint)) {
                boolean zCheckForDebounce = this.debouncer.checkForDebounce();
                this.options.getBeforeScreenshotCaptureCallback();
                if (!zCheckForDebounce && (bArrTakeScreenshot = ScreenshotUtils.takeScreenshot(activity, this.options.getMainThreadChecker(), this.options.getLogger(), this.buildInfoProvider)) != null) {
                    hint.setScreenshot(Attachment.fromScreenshot(bArrTakeScreenshot));
                    hint.set("android:activity", activity);
                }
            }
        }
        return sentryEvent;
    }
}
