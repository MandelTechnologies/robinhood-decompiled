package io.sentry;

import io.sentry.util.Objects;

/* loaded from: classes21.dex */
public final class SendFireAndForgetEnvelopeSender implements InterfaceC45694x769dc528 {
    private final InterfaceC45693x1b3ae270 sendFireAndForgetDirPath;

    public SendFireAndForgetEnvelopeSender(InterfaceC45693x1b3ae270 interfaceC45693x1b3ae270) {
        this.sendFireAndForgetDirPath = (InterfaceC45693x1b3ae270) Objects.requireNonNull(interfaceC45693x1b3ae270, "SendFireAndForgetDirPath is required");
    }

    @Override // io.sentry.InterfaceC45694x769dc528
    public SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForget create(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        String dirPath = this.sendFireAndForgetDirPath.getDirPath();
        if (dirPath == null || !hasValidPath(dirPath, sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return null;
        }
        return processDir(new EnvelopeSender(iHub, sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis(), sentryOptions.getMaxQueueSize()), dirPath, sentryOptions.getLogger());
    }
}
