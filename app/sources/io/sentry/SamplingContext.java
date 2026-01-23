package io.sentry;

import io.sentry.util.Objects;

/* loaded from: classes14.dex */
public final class SamplingContext {
    private final TransactionContext transactionContext;

    public SamplingContext(TransactionContext transactionContext, CustomSamplingContext customSamplingContext) {
        this.transactionContext = (TransactionContext) Objects.requireNonNull(transactionContext, "transactionContexts is required");
    }

    public TransactionContext getTransactionContext() {
        return this.transactionContext;
    }
}
