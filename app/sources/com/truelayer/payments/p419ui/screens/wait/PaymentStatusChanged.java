package com.truelayer.payments.p419ui.screens.wait;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.payments.Payment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WaitViewData.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/wait/PaymentStatusChanged;", "Lcom/truelayer/payments/ui/screens/wait/WaitScreens;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "waitingScreen", "Lcom/truelayer/payments/ui/screens/wait/Waiting;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/ui/screens/wait/Waiting;)V", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getWaitingScreen", "()Lcom/truelayer/payments/ui/screens/wait/Waiting;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentStatusChanged implements WaitViewData3 {
    public static final int $stable = 8;
    private final Payment payment;
    private final Waiting waitingScreen;

    public static /* synthetic */ PaymentStatusChanged copy$default(PaymentStatusChanged paymentStatusChanged, Payment payment, Waiting waiting, int i, Object obj) {
        if ((i & 1) != 0) {
            payment = paymentStatusChanged.payment;
        }
        if ((i & 2) != 0) {
            waiting = paymentStatusChanged.waitingScreen;
        }
        return paymentStatusChanged.copy(payment, waiting);
    }

    /* renamed from: component1, reason: from getter */
    public final Payment getPayment() {
        return this.payment;
    }

    /* renamed from: component2, reason: from getter */
    public final Waiting getWaitingScreen() {
        return this.waitingScreen;
    }

    public final PaymentStatusChanged copy(Payment payment, Waiting waitingScreen) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(waitingScreen, "waitingScreen");
        return new PaymentStatusChanged(payment, waitingScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentStatusChanged)) {
            return false;
        }
        PaymentStatusChanged paymentStatusChanged = (PaymentStatusChanged) other;
        return Intrinsics.areEqual(this.payment, paymentStatusChanged.payment) && Intrinsics.areEqual(this.waitingScreen, paymentStatusChanged.waitingScreen);
    }

    public int hashCode() {
        return (this.payment.hashCode() * 31) + this.waitingScreen.hashCode();
    }

    public String toString() {
        return "PaymentStatusChanged(payment=" + this.payment + ", waitingScreen=" + this.waitingScreen + ")";
    }

    public PaymentStatusChanged(Payment payment, Waiting waitingScreen) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(waitingScreen, "waitingScreen");
        this.payment = payment;
        this.waitingScreen = waitingScreen;
    }

    public final Payment getPayment() {
        return this.payment;
    }

    public final Waiting getWaitingScreen() {
        return this.waitingScreen;
    }
}
