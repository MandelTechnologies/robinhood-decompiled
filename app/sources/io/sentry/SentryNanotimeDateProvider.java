package io.sentry;

/* loaded from: classes21.dex */
public final class SentryNanotimeDateProvider implements SentryDateProvider {
    @Override // io.sentry.SentryDateProvider
    public SentryDate now() {
        return new SentryNanotimeDate();
    }
}
