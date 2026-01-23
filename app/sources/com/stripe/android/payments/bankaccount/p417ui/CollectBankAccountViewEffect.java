package com.stripe.android.payments.bankaccount.p417ui;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountViewEffect.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "", "()V", "FinishWithResult", "OpenConnectionsFlow", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public abstract class CollectBankAccountViewEffect {
    public /* synthetic */ CollectBankAccountViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CollectBankAccountViewEffect() {
    }

    /* compiled from: CollectBankAccountViewEffect.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$OpenConnectionsFlow;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "", "publishableKey", "financialConnectionsSessionSecret", "stripeAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPublishableKey", "getFinancialConnectionsSessionSecret", "getStripeAccountId", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class OpenConnectionsFlow extends CollectBankAccountViewEffect {
        private final String financialConnectionsSessionSecret;
        private final String publishableKey;
        private final String stripeAccountId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenConnectionsFlow)) {
                return false;
            }
            OpenConnectionsFlow openConnectionsFlow = (OpenConnectionsFlow) other;
            return Intrinsics.areEqual(this.publishableKey, openConnectionsFlow.publishableKey) && Intrinsics.areEqual(this.financialConnectionsSessionSecret, openConnectionsFlow.financialConnectionsSessionSecret) && Intrinsics.areEqual(this.stripeAccountId, openConnectionsFlow.stripeAccountId);
        }

        public int hashCode() {
            int iHashCode = ((this.publishableKey.hashCode() * 31) + this.financialConnectionsSessionSecret.hashCode()) * 31;
            String str = this.stripeAccountId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.publishableKey + ", financialConnectionsSessionSecret=" + this.financialConnectionsSessionSecret + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final String getFinancialConnectionsSessionSecret() {
            return this.financialConnectionsSessionSecret;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenConnectionsFlow(String publishableKey, String financialConnectionsSessionSecret, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.publishableKey = publishableKey;
            this.financialConnectionsSessionSecret = financialConnectionsSessionSecret;
            this.stripeAccountId = str;
        }
    }

    /* compiled from: CollectBankAccountViewEffect.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect$FinishWithResult;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "result", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "getResult", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class FinishWithResult extends CollectBankAccountViewEffect {
        private final CollectBankAccountResultInternal result;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishWithResult) && Intrinsics.areEqual(this.result, ((FinishWithResult) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.result + ")";
        }

        public final CollectBankAccountResultInternal getResult() {
            return this.result;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(CollectBankAccountResultInternal result) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }
    }
}
