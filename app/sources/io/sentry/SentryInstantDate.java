package io.sentry;

import p479j$.time.Instant;

/* loaded from: classes14.dex */
public final class SentryInstantDate extends SentryDate {
    private final Instant date;

    public SentryInstantDate() {
        this(Instant.now());
    }

    public SentryInstantDate(Instant instant) {
        this.date = instant;
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return DateUtils.secondsToNanos(this.date.getEpochSecond()) + this.date.getNano();
    }
}
