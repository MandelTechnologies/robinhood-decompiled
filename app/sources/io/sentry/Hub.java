package io.sentry;

import io.sentry.Scope;
import io.sentry.Stack;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.hints.SessionEndHint;
import io.sentry.hints.SessionStartHint;
import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import io.sentry.util.ExceptionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes21.dex */
public final class Hub implements IHub, MetricsApi.IMetricsInterface {
    private volatile boolean isEnabled;
    private volatile SentryId lastEventId;
    private final MetricsApi metricsApi;
    private final SentryOptions options;
    private final Stack stack;
    private final Map<Throwable, Pair<WeakReference<ISpan>, String>> throwableToSpan;
    private final TracesSampler tracesSampler;
    private final TransactionPerformanceCollector transactionPerformanceCollector;

    public Hub(SentryOptions sentryOptions) {
        this(sentryOptions, createRootStackItem(sentryOptions));
    }

    private Hub(SentryOptions sentryOptions, Stack stack) {
        this.throwableToSpan = Collections.synchronizedMap(new WeakHashMap());
        validateOptions(sentryOptions);
        this.options = sentryOptions;
        this.tracesSampler = new TracesSampler(sentryOptions);
        this.stack = stack;
        this.lastEventId = SentryId.EMPTY_ID;
        this.transactionPerformanceCollector = sentryOptions.getTransactionPerformanceCollector();
        this.isEnabled = true;
        this.metricsApi = new MetricsApi(this);
    }

    private Hub(SentryOptions sentryOptions, Stack.StackItem stackItem) {
        this(sentryOptions, new Stack(sentryOptions.getLogger(), stackItem));
    }

    private static void validateOptions(SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
    }

    private static Stack.StackItem createRootStackItem(SentryOptions sentryOptions) {
        validateOptions(sentryOptions);
        return new Stack.StackItem(sentryOptions, new SentryClient(sentryOptions), new Scope(sentryOptions));
    }

    @Override // io.sentry.IHub
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // io.sentry.IHub
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return captureEventInternal(sentryEvent, hint, null);
    }

    private SentryId captureEventInternal(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        SentryId sentryIdCaptureEvent = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return sentryIdCaptureEvent;
        }
        if (sentryEvent == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return sentryIdCaptureEvent;
        }
        try {
            assignTraceContext(sentryEvent);
            Stack.StackItem stackItemPeek = this.stack.peek();
            sentryIdCaptureEvent = stackItemPeek.getClient().captureEvent(sentryEvent, buildLocalScope(stackItemPeek.getScope(), scopeCallback), hint);
            this.lastEventId = sentryIdCaptureEvent;
            return sentryIdCaptureEvent;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing event with id: " + sentryEvent.getEventId(), th);
            return sentryIdCaptureEvent;
        }
    }

    @Override // io.sentry.IHub
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        } else {
            try {
                SentryId sentryIdCaptureEnvelope = this.stack.peek().getClient().captureEnvelope(sentryEnvelope, hint);
                if (sentryIdCaptureEnvelope != null) {
                    return sentryIdCaptureEnvelope;
                }
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing envelope.", th);
            }
        }
        return sentryId;
    }

    private void assignTraceContext(SentryEvent sentryEvent) {
        Pair<WeakReference<ISpan>, String> pair;
        ISpan iSpan;
        if (!this.options.isTracingEnabled() || sentryEvent.getThrowable() == null || (pair = this.throwableToSpan.get(ExceptionUtils.findRootCause(sentryEvent.getThrowable()))) == null) {
            return;
        }
        WeakReference<ISpan> first = pair.getFirst();
        if (sentryEvent.getContexts().getTrace() == null && first != null && (iSpan = first.get()) != null) {
            sentryEvent.getContexts().setTrace(iSpan.getSpanContext());
        }
        String second = pair.getSecond();
        if (sentryEvent.getTransaction() != null || second == null) {
            return;
        }
        sentryEvent.setTransaction(second);
    }

    @Override // io.sentry.IHub
    public void startSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem stackItemPeek = this.stack.peek();
        Scope.SessionPair sessionPairStartSession = stackItemPeek.getScope().startSession();
        if (sessionPairStartSession != null) {
            if (sessionPairStartSession.getPrevious() != null) {
                stackItemPeek.getClient().captureSession(sessionPairStartSession.getPrevious(), HintUtils.createWithTypeCheckHint(new SessionEndHint()));
            }
            stackItemPeek.getClient().captureSession(sessionPairStartSession.getCurrent(), HintUtils.createWithTypeCheckHint(new SessionStartHint()));
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
    }

    @Override // io.sentry.IHub
    public void endSession() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Stack.StackItem stackItemPeek = this.stack.peek();
        Session sessionEndSession = stackItemPeek.getScope().endSession();
        if (sessionEndSession != null) {
            stackItemPeek.getClient().captureSession(sessionEndSession, HintUtils.createWithTypeCheckHint(new SessionEndHint()));
        }
    }

    @Override // io.sentry.IHub
    public void close(boolean z) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : this.options.getIntegrations()) {
                if (integration instanceof Closeable) {
                    try {
                        ((Closeable) integration).close();
                    } catch (IOException e) {
                        this.options.getLogger().log(SentryLevel.WARNING, "Failed to close the integration {}.", integration, e);
                    }
                }
            }
            configureScope(new ScopeCallback() { // from class: io.sentry.Hub$$ExternalSyntheticLambda0
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.clear();
                }
            });
            this.options.getTransactionProfiler().close();
            this.options.getTransactionPerformanceCollector().close();
            final ISentryExecutorService executorService = this.options.getExecutorService();
            if (z) {
                executorService.submit(new Runnable() { // from class: io.sentry.Hub$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        executorService.close(this.f$0.options.getShutdownTimeoutMillis());
                    }
                });
            } else {
                executorService.close(this.options.getShutdownTimeoutMillis());
            }
            this.stack.peek().getClient().close(z);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error while closing the Hub.", th);
        }
        this.isEnabled = false;
    }

    @Override // io.sentry.IHub
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (breadcrumb == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().addBreadcrumb(breadcrumb, hint);
        }
    }

    @Override // io.sentry.IHub
    public void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, new Hint());
    }

    @Override // io.sentry.IHub
    public void setUser(User user) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        } else {
            this.stack.peek().getScope().setUser(user);
        }
    }

    @Override // io.sentry.IHub
    public void setTag(String str, String str2) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.stack.peek().getScope().setTag(str, str2);
        }
    }

    @Override // io.sentry.IHub
    public SentryOptions getOptions() {
        return this.stack.peek().getOptions();
    }

    @Override // io.sentry.IHub
    public void configureScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            scopeCallback.run(this.stack.peek().getScope());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.IHub
    public boolean isHealthy() {
        return this.stack.peek().getClient().isHealthy();
    }

    @Override // io.sentry.IHub
    public void flush(long j) {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.stack.peek().getClient().flush(j);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.IHub
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m28497clone() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        return new Hub(this.options, new Stack(this.stack));
    }

    @Override // io.sentry.IHub
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData) {
        SentryTransaction sentryTransaction2;
        Objects.requireNonNull(sentryTransaction, "transaction is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!sentryTransaction.isFinished()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", sentryTransaction.getEventId());
        } else if (!Boolean.TRUE.equals(Boolean.valueOf(sentryTransaction.isSampled()))) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", sentryTransaction.getEventId());
            if (this.options.getBackpressureMonitor().getDownsampleFactor() > 0) {
                IClientReportRecorder clientReportRecorder = this.options.getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.BACKPRESSURE;
                clientReportRecorder.recordLostEvent(discardReason, DataCategory.Transaction);
                this.options.getClientReportRecorder().recordLostEvent(discardReason, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            } else {
                IClientReportRecorder clientReportRecorder2 = this.options.getClientReportRecorder();
                DiscardReason discardReason2 = DiscardReason.SAMPLE_RATE;
                clientReportRecorder2.recordLostEvent(discardReason2, DataCategory.Transaction);
                this.options.getClientReportRecorder().recordLostEvent(discardReason2, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            }
        } else {
            try {
                Stack.StackItem stackItemPeek = this.stack.peek();
                sentryTransaction2 = sentryTransaction;
                try {
                    return stackItemPeek.getClient().captureTransaction(sentryTransaction2, traceContext, stackItemPeek.getScope(), hint, profilingTraceData);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    this.options.getLogger().log(SentryLevel.ERROR, "Error while capturing transaction with id: " + sentryTransaction2.getEventId(), th2);
                    return sentryId;
                }
            } catch (Throwable th3) {
                th = th3;
                sentryTransaction2 = sentryTransaction;
            }
        }
        return sentryId;
    }

    @Override // io.sentry.IHub
    public ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        return createTransaction(transactionContext, transactionOptions);
    }

    private ITransaction createTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        final ITransaction noOpTransaction;
        Objects.requireNonNull(transactionContext, "transactionContext is required");
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            noOpTransaction = NoOpTransaction.getInstance();
        } else if (!this.options.getInstrumenter().equals(transactionContext.getInstrumenter())) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", transactionContext.getInstrumenter(), this.options.getInstrumenter());
            noOpTransaction = NoOpTransaction.getInstance();
        } else if (!this.options.isTracingEnabled()) {
            this.options.getLogger().log(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            noOpTransaction = NoOpTransaction.getInstance();
        } else {
            transactionOptions.getCustomSamplingContext();
            TracesSamplingDecision tracesSamplingDecisionSample = this.tracesSampler.sample(new SamplingContext(transactionContext, null));
            transactionContext.setSamplingDecision(tracesSamplingDecisionSample);
            SentryTracer sentryTracer = new SentryTracer(transactionContext, this, transactionOptions, this.transactionPerformanceCollector);
            if (tracesSamplingDecisionSample.getSampled().booleanValue() && tracesSamplingDecisionSample.getProfileSampled().booleanValue()) {
                ITransactionProfiler transactionProfiler = this.options.getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.bindTransaction(sentryTracer);
                } else if (transactionOptions.isAppStartTransaction()) {
                    transactionProfiler.bindTransaction(sentryTracer);
                }
            }
            noOpTransaction = sentryTracer;
        }
        if (transactionOptions.isBindToScope()) {
            configureScope(new ScopeCallback() { // from class: io.sentry.Hub$$ExternalSyntheticLambda2
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.setTransaction(noOpTransaction);
                }
            });
        }
        return noOpTransaction;
    }

    @Override // io.sentry.IHub
    public ITransaction getTransaction() {
        if (!isEnabled()) {
            this.options.getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
            return null;
        }
        return this.stack.peek().getScope().getTransaction();
    }

    @Override // io.sentry.IHub
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
        Objects.requireNonNull(th, "throwable is required");
        Objects.requireNonNull(iSpan, "span is required");
        Objects.requireNonNull(str, "transactionName is required");
        Throwable thFindRootCause = ExceptionUtils.findRootCause(th);
        if (this.throwableToSpan.containsKey(thFindRootCause)) {
            return;
        }
        this.throwableToSpan.put(thFindRootCause, new Pair<>(new WeakReference(iSpan), str));
    }

    private IScope buildLocalScope(IScope iScope, ScopeCallback scopeCallback) {
        if (scopeCallback != null) {
            try {
                IScope iScopeM28501clone = iScope.m28501clone();
                scopeCallback.run(iScopeM28501clone);
                return iScopeM28501clone;
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return iScope;
    }

    @Override // io.sentry.IHub
    public RateLimiter getRateLimiter() {
        return this.stack.peek().getClient().getRateLimiter();
    }
}
