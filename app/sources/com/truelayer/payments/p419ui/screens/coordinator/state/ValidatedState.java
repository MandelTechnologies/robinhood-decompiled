package com.truelayer.payments.p419ui.screens.coordinator.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ValidatedState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState;", "", "()V", "Invalid", "MoreDataRequired", "Valid", "Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState$Invalid;", "Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState$MoreDataRequired;", "Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState$Valid;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ValidatedState {
    public static final int $stable = 0;

    public /* synthetic */ ValidatedState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ValidatedState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState$Valid;", "Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState;", "state", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "(Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;)V", "getState", "()Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Valid extends ValidatedState {
        public static final int $stable = 8;
        private final PaymentProcessorState state;

        public static /* synthetic */ Valid copy$default(Valid valid, PaymentProcessorState paymentProcessorState, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentProcessorState = valid.state;
            }
            return valid.copy(paymentProcessorState);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentProcessorState getState() {
            return this.state;
        }

        public final Valid copy(PaymentProcessorState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Valid(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Valid) && Intrinsics.areEqual(this.state, ((Valid) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Valid(state=" + this.state + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Valid(PaymentProcessorState state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final PaymentProcessorState getState() {
            return this.state;
        }
    }

    private ValidatedState() {
    }

    /* compiled from: ValidatedState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState$Invalid;", "Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Invalid extends ValidatedState {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Invalid copy$default(Invalid invalid, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = invalid.error;
            }
            return invalid.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Invalid copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Invalid(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Invalid) && Intrinsics.areEqual(this.error, ((Invalid) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Invalid(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invalid(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: ValidatedState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState$MoreDataRequired;", "T", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "Lcom/truelayer/payments/ui/screens/coordinator/state/ValidatedState;", "name", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getName", "()Ljava/lang/Class;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class MoreDataRequired<T extends PaymentProcessorState> extends ValidatedState {
        public static final int $stable = 8;
        private final Class<T> name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MoreDataRequired copy$default(MoreDataRequired moreDataRequired, Class cls, int i, Object obj) {
            if ((i & 1) != 0) {
                cls = moreDataRequired.name;
            }
            return moreDataRequired.copy(cls);
        }

        public final Class<T> component1() {
            return this.name;
        }

        public final MoreDataRequired<T> copy(Class<T> name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new MoreDataRequired<>(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MoreDataRequired) && Intrinsics.areEqual(this.name, ((MoreDataRequired) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "MoreDataRequired(name=" + this.name + ")";
        }

        public final Class<T> getName() {
            return this.name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoreDataRequired(Class<T> name) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }
    }
}
