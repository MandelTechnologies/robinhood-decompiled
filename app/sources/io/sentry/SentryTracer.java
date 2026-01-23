package io.sentry;

import io.sentry.Scope;
import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.User;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes14.dex */
public final class SentryTracer implements ITransaction {
    private final Baggage baggage;
    private volatile TimerTask deadlineTimeoutTask;
    private final IHub hub;
    private volatile TimerTask idleTimeoutTask;
    private final Instrumenter instrumenter;
    private String name;
    private final Span root;
    private volatile Timer timer;
    private TransactionNameSource transactionNameSource;
    private final TransactionOptions transactionOptions;
    private final TransactionPerformanceCollector transactionPerformanceCollector;
    private final SentryId eventId = new SentryId();
    private final List<Span> children = new CopyOnWriteArrayList();
    private FinishStatus finishStatus = FinishStatus.NOT_FINISHED;
    private final Object timerLock = new Object();
    private final AtomicBoolean isIdleFinishTimerRunning = new AtomicBoolean(false);
    private final AtomicBoolean isDeadlineTimerRunning = new AtomicBoolean(false);
    private final Contexts contexts = new Contexts();

    SentryTracer(TransactionContext transactionContext, IHub iHub, TransactionOptions transactionOptions, TransactionPerformanceCollector transactionPerformanceCollector) {
        this.timer = null;
        Objects.requireNonNull(transactionContext, "context is required");
        Objects.requireNonNull(iHub, "hub is required");
        this.root = new Span(transactionContext, this, iHub, transactionOptions.getStartTimestamp(), transactionOptions);
        this.name = transactionContext.getName();
        this.instrumenter = transactionContext.getInstrumenter();
        this.hub = iHub;
        this.transactionPerformanceCollector = transactionPerformanceCollector;
        this.transactionNameSource = transactionContext.getTransactionNameSource();
        this.transactionOptions = transactionOptions;
        if (transactionContext.getBaggage() != null) {
            this.baggage = transactionContext.getBaggage();
        } else {
            this.baggage = new Baggage(iHub.getOptions().getLogger());
        }
        if (transactionPerformanceCollector != null) {
            transactionPerformanceCollector.start(this);
        }
        if (transactionOptions.getIdleTimeout() == null && transactionOptions.getDeadlineTimeout() == null) {
            return;
        }
        this.timer = new Timer(true);
        scheduleDeadlineTimeout();
        scheduleFinish();
    }

    @Override // io.sentry.ITransaction
    public void scheduleFinish() {
        Long idleTimeout;
        synchronized (this.timerLock) {
            try {
                if (this.timer != null && (idleTimeout = this.transactionOptions.getIdleTimeout()) != null) {
                    cancelIdleTimer();
                    this.isIdleFinishTimerRunning.set(true);
                    this.idleTimeoutTask = new TimerTask() { // from class: io.sentry.SentryTracer.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            SentryTracer.this.onIdleTimeoutReached();
                        }
                    };
                    try {
                        this.timer.schedule(this.idleTimeoutTask, idleTimeout.longValue());
                    } catch (Throwable th) {
                        this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Failed to schedule finish timer", th);
                        onIdleTimeoutReached();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdleTimeoutReached() {
        SpanStatus status = getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        finish(status);
        this.isIdleFinishTimerRunning.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDeadlineTimeoutReached() {
        SpanStatus status = getStatus();
        if (status == null) {
            status = SpanStatus.DEADLINE_EXCEEDED;
        }
        forceFinish(status, this.transactionOptions.getIdleTimeout() != null, null);
        this.isDeadlineTimerRunning.set(false);
    }

    @Override // io.sentry.ITransaction
    public void forceFinish(SpanStatus spanStatus, boolean z, Hint hint) {
        if (isFinished()) {
            return;
        }
        SentryDate sentryDateNow = this.hub.getOptions().getDateProvider().now();
        List<Span> list = this.children;
        ListIterator<Span> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Span spanPrevious = listIterator.previous();
            spanPrevious.setSpanFinishedCallback(null);
            spanPrevious.finish(spanStatus, sentryDateNow);
        }
        finish(spanStatus, sentryDateNow, z, hint);
    }

    public void finish(SpanStatus spanStatus, SentryDate sentryDate, boolean z, Hint hint) {
        SentryDate finishDate = this.root.getFinishDate();
        if (sentryDate == null) {
            sentryDate = finishDate;
        }
        if (sentryDate == null) {
            sentryDate = this.hub.getOptions().getDateProvider().now();
        }
        for (Span span : this.children) {
            if (span.getOptions().isIdle()) {
                span.finish(spanStatus != null ? spanStatus : getSpanContext().status, sentryDate);
            }
        }
        this.finishStatus = FinishStatus.finishing(spanStatus);
        if (this.root.isFinished()) {
            return;
        }
        if (!this.transactionOptions.isWaitForChildren() || hasAllChildrenFinished()) {
            final AtomicReference atomicReference = new AtomicReference();
            final SpanFinishedCallback spanFinishedCallback = this.root.getSpanFinishedCallback();
            this.root.setSpanFinishedCallback(new SpanFinishedCallback() { // from class: io.sentry.SentryTracer$$ExternalSyntheticLambda0
                @Override // io.sentry.SpanFinishedCallback
                public final void execute(Span span2) {
                    SentryTracer.$r8$lambda$tVdDjzzeXMKyUqYbPN6CoIs26QY(this.f$0, spanFinishedCallback, atomicReference, span2);
                }
            });
            this.root.finish(this.finishStatus.spanStatus, sentryDate);
            Boolean bool = Boolean.TRUE;
            ProfilingTraceData profilingTraceDataOnTransactionFinish = (bool.equals(isSampled()) && bool.equals(isProfileSampled())) ? this.hub.getOptions().getTransactionProfiler().onTransactionFinish(this, (List) atomicReference.get(), this.hub.getOptions()) : null;
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.SentryTracer$$ExternalSyntheticLambda1
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    SentryTracer.$r8$lambda$eRNemq4hgiUSDr9OZP0ajBm1sG0(this.f$0, iScope);
                }
            });
            SentryTransaction sentryTransaction = new SentryTransaction(this);
            if (this.timer != null) {
                synchronized (this.timerLock) {
                    try {
                        if (this.timer != null) {
                            cancelIdleTimer();
                            cancelDeadlineTimer();
                            this.timer.cancel();
                            this.timer = null;
                        }
                    } finally {
                    }
                }
            }
            if (z && this.children.isEmpty() && this.transactionOptions.getIdleTimeout() != null) {
                this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "Dropping idle transaction %s because it has no child spans", this.name);
            } else {
                sentryTransaction.getMeasurements().putAll(this.root.getMeasurements());
                this.hub.captureTransaction(sentryTransaction, traceContext(), hint, profilingTraceDataOnTransactionFinish);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$tVdDjzzeXMKyUqYbPN6CoIs26QY(SentryTracer sentryTracer, SpanFinishedCallback spanFinishedCallback, AtomicReference atomicReference, Span span) {
        if (spanFinishedCallback != null) {
            sentryTracer.getClass();
            spanFinishedCallback.execute(span);
        }
        TransactionFinishedCallback transactionFinishedCallback = sentryTracer.transactionOptions.getTransactionFinishedCallback();
        if (transactionFinishedCallback != null) {
            transactionFinishedCallback.execute(sentryTracer);
        }
        TransactionPerformanceCollector transactionPerformanceCollector = sentryTracer.transactionPerformanceCollector;
        if (transactionPerformanceCollector != null) {
            atomicReference.set(transactionPerformanceCollector.stop(sentryTracer));
        }
    }

    public static /* synthetic */ void $r8$lambda$eRNemq4hgiUSDr9OZP0ajBm1sG0(final SentryTracer sentryTracer, final IScope iScope) {
        sentryTracer.getClass();
        iScope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.SentryTracer$$ExternalSyntheticLambda4
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction) {
                SentryTracer.$r8$lambda$UOntxYk8P3QdjoDm5OYhlbv80kk(this.f$0, iScope, iTransaction);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$UOntxYk8P3QdjoDm5OYhlbv80kk(SentryTracer sentryTracer, IScope iScope, ITransaction iTransaction) {
        sentryTracer.getClass();
        if (iTransaction == sentryTracer) {
            iScope.clearTransaction();
        }
    }

    private void cancelIdleTimer() {
        synchronized (this.timerLock) {
            try {
                if (this.idleTimeoutTask != null) {
                    this.idleTimeoutTask.cancel();
                    this.isIdleFinishTimerRunning.set(false);
                    this.idleTimeoutTask = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void scheduleDeadlineTimeout() {
        Long deadlineTimeout = this.transactionOptions.getDeadlineTimeout();
        if (deadlineTimeout != null) {
            synchronized (this.timerLock) {
                try {
                    if (this.timer != null) {
                        cancelDeadlineTimer();
                        this.isDeadlineTimerRunning.set(true);
                        this.deadlineTimeoutTask = new TimerTask() { // from class: io.sentry.SentryTracer.2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                SentryTracer.this.onDeadlineTimeoutReached();
                            }
                        };
                        this.timer.schedule(this.deadlineTimeoutTask, deadlineTimeout.longValue());
                    }
                } catch (Throwable th) {
                    this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Failed to schedule finish timer", th);
                    onDeadlineTimeoutReached();
                } finally {
                }
            }
        }
    }

    private void cancelDeadlineTimer() {
        synchronized (this.timerLock) {
            try {
                if (this.deadlineTimeoutTask != null) {
                    this.deadlineTimeoutTask.cancel();
                    this.isDeadlineTimerRunning.set(false);
                    this.deadlineTimeoutTask = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<Span> getChildren() {
        return this.children;
    }

    @Override // io.sentry.ISpan
    public SentryDate getStartDate() {
        return this.root.getStartDate();
    }

    @Override // io.sentry.ISpan
    public SentryDate getFinishDate() {
        return this.root.getFinishDate();
    }

    ISpan startChild(SpanId spanId, String str, String str2) {
        return startChild(spanId, str, str2, new SpanOptions());
    }

    ISpan startChild(SpanId spanId, String str, String str2, SpanOptions spanOptions) {
        return createChild(spanId, str, str2, spanOptions);
    }

    ISpan startChild(SpanId spanId, String str, String str2, SentryDate sentryDate, Instrumenter instrumenter, SpanOptions spanOptions) {
        return createChild(spanId, str, str2, sentryDate, instrumenter, spanOptions);
    }

    private ISpan createChild(SpanId spanId, String str, String str2, SpanOptions spanOptions) {
        return createChild(spanId, str, str2, null, Instrumenter.SENTRY, spanOptions);
    }

    private ISpan createChild(SpanId spanId, String str, String str2, SentryDate sentryDate, Instrumenter instrumenter, SpanOptions spanOptions) {
        String name;
        if (this.root.isFinished()) {
            return NoOpSpan.getInstance();
        }
        if (!this.instrumenter.equals(instrumenter)) {
            return NoOpSpan.getInstance();
        }
        if (this.children.size() < this.hub.getOptions().getMaxSpans()) {
            Objects.requireNonNull(spanId, "parentSpanId is required");
            Objects.requireNonNull(str, "operation is required");
            cancelIdleTimer();
            Span span = new Span(this.root.getTraceId(), spanId, this, str, this.hub, sentryDate, spanOptions, new SpanFinishedCallback() { // from class: io.sentry.SentryTracer$$ExternalSyntheticLambda2
                @Override // io.sentry.SpanFinishedCallback
                public final void execute(Span span2) {
                    SentryTracer.$r8$lambda$sQOksdvthpV8VHIxa2ZRCUQs_KY(this.f$0, span2);
                }
            });
            span.setDescription(str2);
            span.setData("thread.id", String.valueOf(Thread.currentThread().getId()));
            if (this.hub.getOptions().getMainThreadChecker().isMainThread()) {
                name = "main";
            } else {
                name = Thread.currentThread().getName();
            }
            span.setData("thread.name", name);
            this.children.add(span);
            TransactionPerformanceCollector transactionPerformanceCollector = this.transactionPerformanceCollector;
            if (transactionPerformanceCollector != null) {
                transactionPerformanceCollector.onSpanStarted(span);
            }
            return span;
        }
        this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return NoOpSpan.getInstance();
    }

    public static /* synthetic */ void $r8$lambda$sQOksdvthpV8VHIxa2ZRCUQs_KY(SentryTracer sentryTracer, Span span) {
        TransactionPerformanceCollector transactionPerformanceCollector = sentryTracer.transactionPerformanceCollector;
        if (transactionPerformanceCollector != null) {
            transactionPerformanceCollector.onSpanFinished(span);
        }
        FinishStatus finishStatus = sentryTracer.finishStatus;
        if (sentryTracer.transactionOptions.getIdleTimeout() != null) {
            if (!sentryTracer.transactionOptions.isWaitForChildren() || sentryTracer.hasAllChildrenFinished()) {
                sentryTracer.scheduleFinish();
                return;
            }
            return;
        }
        if (finishStatus.isFinishing) {
            sentryTracer.finish(finishStatus.spanStatus);
        }
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter) {
        return startChild(str, str2, sentryDate, instrumenter, new SpanOptions());
    }

    public ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter, SpanOptions spanOptions) {
        return createChild(str, str2, sentryDate, instrumenter, spanOptions);
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2) {
        return startChild(str, str2, null, Instrumenter.SENTRY, new SpanOptions());
    }

    private ISpan createChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter, SpanOptions spanOptions) {
        if (this.root.isFinished()) {
            return NoOpSpan.getInstance();
        }
        if (!this.instrumenter.equals(instrumenter)) {
            return NoOpSpan.getInstance();
        }
        if (this.children.size() < this.hub.getOptions().getMaxSpans()) {
            return this.root.startChild(str, str2, sentryDate, instrumenter, spanOptions);
        }
        this.hub.getOptions().getLogger().log(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpan
    public void finish() {
        finish(getStatus());
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus) {
        finish(spanStatus, null);
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus, SentryDate sentryDate) {
        finish(spanStatus, sentryDate, true, null);
    }

    @Override // io.sentry.ISpan
    public TraceContext traceContext() throws Throwable {
        if (!this.hub.getOptions().isTraceSampling()) {
            return null;
        }
        updateBaggageValues();
        return this.baggage.toTraceContext();
    }

    private void updateBaggageValues() throws Throwable {
        synchronized (this) {
            try {
                try {
                    if (this.baggage.isMutable()) {
                        final AtomicReference atomicReference = new AtomicReference();
                        final AtomicReference atomicReference2 = new AtomicReference();
                        this.hub.configureScope(new ScopeCallback() { // from class: io.sentry.SentryTracer$$ExternalSyntheticLambda3
                            @Override // io.sentry.ScopeCallback
                            public final void run(IScope iScope) {
                                SentryTracer.m28512$r8$lambda$q49Ug5HKG6oooefFl98AlNq4sI(atomicReference, atomicReference2, iScope);
                            }
                        });
                        this.baggage.setValuesFromTransaction(this, (User) atomicReference.get(), (SentryId) atomicReference2.get(), this.hub.getOptions(), getSamplingDecision());
                        this.baggage.freeze();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* renamed from: $r8$lambda$q4-9Ug5HKG6oooefFl98AlNq4sI, reason: not valid java name */
    public static /* synthetic */ void m28512$r8$lambda$q49Ug5HKG6oooefFl98AlNq4sI(AtomicReference atomicReference, AtomicReference atomicReference2, IScope iScope) {
        atomicReference.set(iScope.getUser());
        atomicReference2.set(iScope.getReplayId());
    }

    private boolean hasAllChildrenFinished() {
        ArrayList<Span> arrayList = new ArrayList(this.children);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Span span : arrayList) {
            if (!span.isFinished() && span.getFinishDate() == null) {
                return false;
            }
        }
        return true;
    }

    @Override // io.sentry.ISpan
    public void setDescription(String str) {
        if (this.root.isFinished()) {
            this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.root.setDescription(str);
        }
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return this.root.getDescription();
    }

    @Override // io.sentry.ISpan
    public SpanStatus getStatus() {
        return this.root.getStatus();
    }

    @Override // io.sentry.ISpan
    public SpanContext getSpanContext() {
        return this.root.getSpanContext();
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return this.root.isFinished();
    }

    @Override // io.sentry.ISpan
    public void setData(String str, Object obj) {
        if (this.root.isFinished()) {
            this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.root.setData(str, obj);
        }
    }

    public void setMeasurementFromChild(String str, Number number) {
        if (this.root.getMeasurements().containsKey(str)) {
            return;
        }
        setMeasurement(str, number);
    }

    public void setMeasurementFromChild(String str, Number number, MeasurementUnit measurementUnit) {
        if (this.root.getMeasurements().containsKey(str)) {
            return;
        }
        setMeasurement(str, number, measurementUnit);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(String str, Number number) {
        this.root.setMeasurement(str, number);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(String str, Number number, MeasurementUnit measurementUnit) {
        this.root.setMeasurement(str, number, measurementUnit);
    }

    public Map<String, Object> getData() {
        return this.root.getData();
    }

    public Boolean isSampled() {
        return this.root.isSampled();
    }

    public Boolean isProfileSampled() {
        return this.root.isProfileSampled();
    }

    public TracesSamplingDecision getSamplingDecision() {
        return this.root.getSamplingDecision();
    }

    @Override // io.sentry.ITransaction
    public String getName() {
        return this.name;
    }

    @Override // io.sentry.ITransaction
    public TransactionNameSource getTransactionNameSource() {
        return this.transactionNameSource;
    }

    public List<Span> getSpans() {
        return this.children;
    }

    @Override // io.sentry.ITransaction
    public Span getLatestActiveSpan() {
        ArrayList arrayList = new ArrayList(this.children);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((Span) arrayList.get(size)).isFinished()) {
                return (Span) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.ITransaction
    public SentryId getEventId() {
        return this.eventId;
    }

    Span getRoot() {
        return this.root;
    }

    public Contexts getContexts() {
        return this.contexts;
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(SentryDate sentryDate) {
        return this.root.updateEndDate(sentryDate);
    }

    public LocalMetricsAggregator getLocalMetricsAggregator() {
        return this.root.getLocalMetricsAggregator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class FinishStatus {
        static final FinishStatus NOT_FINISHED = notFinished();
        private final boolean isFinishing;
        private final SpanStatus spanStatus;

        static FinishStatus finishing(SpanStatus spanStatus) {
            return new FinishStatus(true, spanStatus);
        }

        private static FinishStatus notFinished() {
            return new FinishStatus(false, null);
        }

        private FinishStatus(boolean z, SpanStatus spanStatus) {
            this.isFinishing = z;
            this.spanStatus = spanStatus;
        }
    }
}
