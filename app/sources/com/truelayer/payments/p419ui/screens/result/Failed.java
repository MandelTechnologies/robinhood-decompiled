package com.truelayer.payments.p419ui.screens.result;

import com.truelayer.payments.core.domain.payments.PaymentFailureReason;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/result/Failed;", "Lcom/truelayer/payments/ui/screens/result/ResultScreen;", "reference", "", "clientName", "failureReason", "Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "provider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "type", "Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;)V", "getClientName", "()Ljava/lang/String;", "getFailureReason", "()Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "getProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getReference", "getType", "()Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Failed implements ResultScreen {
    public static final int $stable = 8;
    private final String clientName;
    private final PaymentFailureReason failureReason;
    private final PaymentProvider provider;
    private final String reference;
    private final ResultScreen8 type;

    public static /* synthetic */ Failed copy$default(Failed failed, String str, String str2, PaymentFailureReason paymentFailureReason, PaymentProvider paymentProvider, ResultScreen8 resultScreen8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = failed.reference;
        }
        if ((i & 2) != 0) {
            str2 = failed.clientName;
        }
        if ((i & 4) != 0) {
            paymentFailureReason = failed.failureReason;
        }
        if ((i & 8) != 0) {
            paymentProvider = failed.provider;
        }
        if ((i & 16) != 0) {
            resultScreen8 = failed.type;
        }
        ResultScreen8 resultScreen82 = resultScreen8;
        PaymentFailureReason paymentFailureReason2 = paymentFailureReason;
        return failed.copy(str, str2, paymentFailureReason2, paymentProvider, resultScreen82);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentFailureReason getFailureReason() {
        return this.failureReason;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentProvider getProvider() {
        return this.provider;
    }

    /* renamed from: component5, reason: from getter */
    public final ResultScreen8 getType() {
        return this.type;
    }

    public final Failed copy(String reference, String clientName, PaymentFailureReason failureReason, PaymentProvider provider, ResultScreen8 type2) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new Failed(reference, clientName, failureReason, provider, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Failed)) {
            return false;
        }
        Failed failed = (Failed) other;
        return Intrinsics.areEqual(this.reference, failed.reference) && Intrinsics.areEqual(this.clientName, failed.clientName) && this.failureReason == failed.failureReason && Intrinsics.areEqual(this.provider, failed.provider) && this.type == failed.type;
    }

    public int hashCode() {
        String str = this.reference;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.clientName.hashCode()) * 31) + this.failureReason.hashCode()) * 31) + this.provider.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Failed(reference=" + this.reference + ", clientName=" + this.clientName + ", failureReason=" + this.failureReason + ", provider=" + this.provider + ", type=" + this.type + ")";
    }

    public Failed(String str, String clientName, PaymentFailureReason failureReason, PaymentProvider provider, ResultScreen8 type2) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.reference = str;
        this.clientName = clientName;
        this.failureReason = failureReason;
        this.provider = provider;
        this.type = type2;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final PaymentFailureReason getFailureReason() {
        return this.failureReason;
    }

    public final PaymentProvider getProvider() {
        return this.provider;
    }

    public final ResultScreen8 getType() {
        return this.type;
    }
}
