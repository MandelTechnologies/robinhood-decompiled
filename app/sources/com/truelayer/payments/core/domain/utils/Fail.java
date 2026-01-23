package com.truelayer.payments.core.domain.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Outcome.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/utils/Fail;", "E", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "", "error", "(Ljava/lang/Object;)V", "getError", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/truelayer/payments/core/domain/utils/Fail;", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Fail<E> extends Outcome {
    private final E error;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fail copy$default(Fail fail, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = fail.error;
        }
        return fail.copy(obj);
    }

    public final E component1() {
        return this.error;
    }

    public final Fail<E> copy(E error) {
        return new Fail<>(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Fail) && Intrinsics.areEqual(this.error, ((Fail) other).error);
    }

    public int hashCode() {
        E e = this.error;
        if (e == null) {
            return 0;
        }
        return e.hashCode();
    }

    public String toString() {
        return "Fail(error=" + this.error + ")";
    }

    public Fail(E e) {
        super(null);
        this.error = e;
    }

    public final E getError() {
        return this.error;
    }
}
