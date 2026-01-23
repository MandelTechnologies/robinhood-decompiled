package io.sentry;

import java.io.File;

/* renamed from: io.sentry.SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForgetFactory */
/* loaded from: classes21.dex */
public interface InterfaceC45694x769dc528 {
    SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForget create(IHub iHub, SentryOptions sentryOptions);

    default boolean hasValidPath(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.log(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    default SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForget processDir(final DirectoryProcessor directoryProcessor, final String str, final ILogger iLogger) {
        final File file = new File(str);
        return new SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForget() { // from class: io.sentry.SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForgetFactory$$ExternalSyntheticLambda0
            @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration$SendFireAndForget
            public final void send() {
                InterfaceC45694x769dc528.$r8$lambda$mVofT0O3ZhWGh_u8l7qb1MKrmhs(iLogger, str, directoryProcessor, file);
            }
        };
    }

    static /* synthetic */ void $r8$lambda$mVofT0O3ZhWGh_u8l7qb1MKrmhs(ILogger iLogger, String str, DirectoryProcessor directoryProcessor, File file) {
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        iLogger.log(sentryLevel, "Started processing cached files from %s", str);
        directoryProcessor.processDirectory(file);
        iLogger.log(sentryLevel, "Finished processing cached files from %s", str);
    }
}
