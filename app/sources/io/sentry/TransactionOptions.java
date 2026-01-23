package io.sentry;

/* loaded from: classes14.dex */
public final class TransactionOptions extends SpanOptions {
    private boolean bindToScope = false;
    private SentryDate startTimestamp = null;
    private boolean isAppStartTransaction = false;
    private boolean waitForChildren = false;
    private Long idleTimeout = null;
    private Long deadlineTimeout = null;
    private TransactionFinishedCallback transactionFinishedCallback = null;

    public CustomSamplingContext getCustomSamplingContext() {
        return null;
    }

    public boolean isBindToScope() {
        return this.bindToScope;
    }

    public SentryDate getStartTimestamp() {
        return this.startTimestamp;
    }

    public void setStartTimestamp(SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    public boolean isWaitForChildren() {
        return this.waitForChildren;
    }

    public void setWaitForChildren(boolean z) {
        this.waitForChildren = z;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public void setDeadlineTimeout(Long l) {
        this.deadlineTimeout = l;
    }

    public Long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public TransactionFinishedCallback getTransactionFinishedCallback() {
        return this.transactionFinishedCallback;
    }

    public void setTransactionFinishedCallback(TransactionFinishedCallback transactionFinishedCallback) {
        this.transactionFinishedCallback = transactionFinishedCallback;
    }

    public void setAppStartTransaction(boolean z) {
        this.isAppStartTransaction = z;
    }

    public boolean isAppStartTransaction() {
        return this.isAppStartTransaction;
    }
}
