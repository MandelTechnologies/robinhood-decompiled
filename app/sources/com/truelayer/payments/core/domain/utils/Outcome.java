package com.truelayer.payments.core.domain.utils;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Outcome.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0001\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/utils/Outcome;", "T", "E", "", "()V", "expect", "message", "", "(Ljava/lang/String;)Ljava/lang/Object;", "Companion", "Lcom/truelayer/payments/core/domain/utils/Fail;", "Lcom/truelayer/payments/core/domain/utils/Ok;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class Outcome<T, E> {
    public /* synthetic */ Outcome(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmOverloads
    public final T expect() throws Throwable {
        return (T) expect$default(this, null, 1, null);
    }

    private Outcome() {
    }

    public static /* synthetic */ Object expect$default(Outcome outcome, String str, int i, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expect");
        }
        if ((i & 1) != 0) {
            str = "Expected an `Ok` state however received a `Fail` state.";
        }
        return outcome.expect(str);
    }

    @JvmOverloads
    public final T expect(String message) throws Throwable {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this instanceof Outcome3) {
            return (T) ((Outcome3) this).getValue();
        }
        if (!(this instanceof Outcome2)) {
            throw new NoWhenBranchMatchedException();
        }
        Outcome2 outcome2 = (Outcome2) this;
        if (outcome2.getError() instanceof Throwable) {
            throw ((Throwable) outcome2.getError());
        }
        throw new IllegalStateException(message + outcome2.getError());
    }
}
