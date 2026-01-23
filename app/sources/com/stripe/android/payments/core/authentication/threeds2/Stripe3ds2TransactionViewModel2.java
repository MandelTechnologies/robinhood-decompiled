package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "", "()V", "Complete", "StartChallenge", "StartFallback", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.NextStep, reason: use source file name */
/* loaded from: classes22.dex */
public abstract class Stripe3ds2TransactionViewModel2 {
    public /* synthetic */ Stripe3ds2TransactionViewModel2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Stripe3ds2TransactionViewModel2() {
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "args", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "getArgs", "()Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.NextStep$StartChallenge, reason: from toString */
    public static final /* data */ class StartChallenge extends Stripe3ds2TransactionViewModel2 {
        private final InitChallengeArgs args;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartChallenge) && Intrinsics.areEqual(this.args, ((StartChallenge) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartChallenge(args=" + this.args + ")";
        }

        public final InitChallengeArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartChallenge(InitChallengeArgs args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "<init>", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "getArgs", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.NextStep$StartFallback, reason: from toString */
    public static final /* data */ class StartFallback extends Stripe3ds2TransactionViewModel2 {
        private final PaymentBrowserAuthContract.Args args;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartFallback) && Intrinsics.areEqual(this.args, ((StartFallback) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartFallback(args=" + this.args + ")";
        }

        public final PaymentBrowserAuthContract.Args getArgs() {
            return this.args;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartFallback(PaymentBrowserAuthContract.Args args) {
            super(null);
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "result", "<init>", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "getResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.NextStep$Complete, reason: from toString */
    public static final /* data */ class Complete extends Stripe3ds2TransactionViewModel2 {
        private final Unvalidated result;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Complete) && Intrinsics.areEqual(this.result, ((Complete) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Complete(result=" + this.result + ")";
        }

        public final Unvalidated getResult() {
            return this.result;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(Unvalidated result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }
    }
}
