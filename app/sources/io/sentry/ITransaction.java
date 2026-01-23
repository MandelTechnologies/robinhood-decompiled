package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;

/* loaded from: classes21.dex */
public interface ITransaction extends ISpan {
    void forceFinish(SpanStatus spanStatus, boolean z, Hint hint);

    SentryId getEventId();

    Span getLatestActiveSpan();

    String getName();

    TransactionNameSource getTransactionNameSource();

    void scheduleFinish();
}
