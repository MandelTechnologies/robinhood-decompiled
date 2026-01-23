package io.sentry.util;

/* loaded from: classes21.dex */
public final class LazyEvaluator<T> {
    private final Evaluator<T> evaluator;
    private T value = null;

    public interface Evaluator<T> {
        T evaluate();
    }

    public LazyEvaluator(Evaluator<T> evaluator) {
        this.evaluator = evaluator;
    }

    public synchronized T getValue() {
        try {
            if (this.value == null) {
                this.value = this.evaluator.evaluate();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.value;
    }
}
