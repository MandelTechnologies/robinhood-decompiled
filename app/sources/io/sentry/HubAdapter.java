package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;

/* loaded from: classes21.dex */
public final class HubAdapter implements IHub {
    private static final HubAdapter INSTANCE = new HubAdapter();

    private HubAdapter() {
    }

    public static HubAdapter getInstance() {
        return INSTANCE;
    }

    @Override // io.sentry.IHub
    public boolean isEnabled() {
        return Sentry.isEnabled();
    }

    @Override // io.sentry.IHub
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return Sentry.captureEvent(sentryEvent, hint);
    }

    @Override // io.sentry.IHub
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        return Sentry.getCurrentHub().captureEnvelope(sentryEnvelope, hint);
    }

    @Override // io.sentry.IHub
    public void startSession() {
        Sentry.startSession();
    }

    @Override // io.sentry.IHub
    public void endSession() {
        Sentry.endSession();
    }

    @Override // io.sentry.IHub
    public void close(boolean z) {
        Sentry.close();
    }

    @Override // io.sentry.IHub
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        Sentry.addBreadcrumb(breadcrumb, hint);
    }

    @Override // io.sentry.IHub
    public void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, new Hint());
    }

    @Override // io.sentry.IHub
    public void setUser(User user) {
        Sentry.setUser(user);
    }

    @Override // io.sentry.IHub
    public void setTag(String str, String str2) {
        Sentry.setTag(str, str2);
    }

    @Override // io.sentry.IHub
    public void configureScope(ScopeCallback scopeCallback) {
        Sentry.configureScope(scopeCallback);
    }

    @Override // io.sentry.IHub
    public boolean isHealthy() {
        return Sentry.isHealthy();
    }

    @Override // io.sentry.IHub
    public void flush(long j) {
        Sentry.flush(j);
    }

    @Override // io.sentry.IHub
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m28498clone() {
        return Sentry.getCurrentHub().m28500clone();
    }

    @Override // io.sentry.IHub
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData) {
        return Sentry.getCurrentHub().captureTransaction(sentryTransaction, traceContext, hint, profilingTraceData);
    }

    @Override // io.sentry.IHub
    public ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        return Sentry.startTransaction(transactionContext, transactionOptions);
    }

    @Override // io.sentry.IHub
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
        Sentry.getCurrentHub().setSpanContext(th, iSpan, str);
    }

    @Override // io.sentry.IHub
    public ITransaction getTransaction() {
        return Sentry.getCurrentHub().getTransaction();
    }

    @Override // io.sentry.IHub
    public SentryOptions getOptions() {
        return Sentry.getCurrentHub().getOptions();
    }

    @Override // io.sentry.IHub
    public RateLimiter getRateLimiter() {
        return Sentry.getCurrentHub().getRateLimiter();
    }
}
