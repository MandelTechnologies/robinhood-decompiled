package com.salesforce.android.smi.remote.internal.api;

import com.salesforce.android.smi.remote.internal.util.Fibonacci;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: FibonacciBackoff.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\bR$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\b¨\u0006 "}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/FibonacciBackoff;", "", "", "maxRetry", "ceiling", "<init>", "(II)V", "restrictedRetryCount", "()I", "", "currentBackoff", "()J", "increment", "reset", "()Lcom/salesforce/android/smi/remote/internal/api/FibonacciBackoff;", "", "shouldRetry", "()Z", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getMaxRetry", "getCeiling", "value", "retryCount", "getRetryCount", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class FibonacciBackoff {
    private final int ceiling;
    private final int maxRetry;
    private int retryCount;

    /* JADX WARN: Illegal instructions before constructor call */
    public FibonacciBackoff() {
        int i = 0;
        this(i, i, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibonacciBackoff)) {
            return false;
        }
        FibonacciBackoff fibonacciBackoff = (FibonacciBackoff) other;
        return this.maxRetry == fibonacciBackoff.maxRetry && this.ceiling == fibonacciBackoff.ceiling;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxRetry) * 31) + Integer.hashCode(this.ceiling);
    }

    public String toString() {
        return "FibonacciBackoff(maxRetry=" + this.maxRetry + ", ceiling=" + this.ceiling + ")";
    }

    public FibonacciBackoff(int i, int i2) {
        this.maxRetry = i;
        this.ceiling = i2;
    }

    public /* synthetic */ FibonacciBackoff(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? 5 : i2);
    }

    private final int restrictedRetryCount() {
        int i = this.retryCount;
        int i2 = this.ceiling;
        return i < i2 ? i : i2;
    }

    public final long currentBackoff() {
        return RangesKt.coerceAtLeast(Fibonacci.fibonacci$default(restrictedRetryCount(), 0, 0, 6, null) * 1000, 1000L);
    }

    public final int increment() {
        int i = this.retryCount;
        this.retryCount = i + 1;
        return i;
    }

    public final FibonacciBackoff reset() {
        this.retryCount = 0;
        return this;
    }

    public final boolean shouldRetry() {
        int i = this.maxRetry;
        return i == -1 || this.retryCount < i;
    }
}
