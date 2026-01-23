package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;

/* loaded from: classes21.dex */
public interface IHub {
    void addBreadcrumb(Breadcrumb breadcrumb);

    void addBreadcrumb(Breadcrumb breadcrumb, Hint hint);

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint);

    SentryId captureEvent(SentryEvent sentryEvent, Hint hint);

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData);

    IHub clone();

    void close(boolean z);

    void configureScope(ScopeCallback scopeCallback);

    void endSession();

    void flush(long j);

    SentryOptions getOptions();

    RateLimiter getRateLimiter();

    ITransaction getTransaction();

    boolean isEnabled();

    boolean isHealthy();

    void setSpanContext(Throwable th, ISpan iSpan, String str);

    void setTag(String str, String str2);

    void setUser(User user);

    void startSession();

    ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions);

    default SentryId captureEvent(SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, new Hint());
    }

    default SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, new Hint());
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, hint, null);
    }
}
