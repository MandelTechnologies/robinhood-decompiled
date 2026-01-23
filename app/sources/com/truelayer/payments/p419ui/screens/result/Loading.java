package com.truelayer.payments.p419ui.screens.result;

import com.truelayer.payments.core.domain.payments.PaymentProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/result/Loading;", "Lcom/truelayer/payments/ui/screens/result/ResultScreen;", "provider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "(Lcom/truelayer/payments/core/domain/payments/PaymentProvider;)V", "getProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Loading implements ResultScreen {
    public static final int $stable = 8;
    private final PaymentProvider provider;

    /* JADX WARN: Multi-variable type inference failed */
    public Loading() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Loading copy$default(Loading loading, PaymentProvider paymentProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProvider = loading.provider;
        }
        return loading.copy(paymentProvider);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentProvider getProvider() {
        return this.provider;
    }

    public final Loading copy(PaymentProvider provider) {
        return new Loading(provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Loading) && Intrinsics.areEqual(this.provider, ((Loading) other).provider);
    }

    public int hashCode() {
        PaymentProvider paymentProvider = this.provider;
        if (paymentProvider == null) {
            return 0;
        }
        return paymentProvider.hashCode();
    }

    public String toString() {
        return "Loading(provider=" + this.provider + ")";
    }

    public Loading(PaymentProvider paymentProvider) {
        this.provider = paymentProvider;
    }

    public /* synthetic */ Loading(PaymentProvider paymentProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentProvider);
    }

    public final PaymentProvider getProvider() {
        return this.provider;
    }
}
