package com.robinhood.android.transfers.history;

import com.robinhood.models.p320db.bff.PaymentIntent;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentIntentHistoryDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDataState;", "", "paymentIntent", "Lcom/robinhood/models/db/bff/PaymentIntent;", "paymentInstrument", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "<init>", "(Lcom/robinhood/models/db/bff/PaymentIntent;Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;)V", "getPaymentIntent", "()Lcom/robinhood/models/db/bff/PaymentIntent;", "getPaymentInstrument", "()Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PaymentIntentHistoryDetailDataState {
    public static final int $stable = 8;
    private final PaymentInstrumentV2 paymentInstrument;
    private final PaymentIntent paymentIntent;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentIntentHistoryDetailDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentIntentHistoryDetailDataState copy$default(PaymentIntentHistoryDetailDataState paymentIntentHistoryDetailDataState, PaymentIntent paymentIntent, PaymentInstrumentV2 paymentInstrumentV2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentIntent = paymentIntentHistoryDetailDataState.paymentIntent;
        }
        if ((i & 2) != 0) {
            paymentInstrumentV2 = paymentIntentHistoryDetailDataState.paymentInstrument;
        }
        return paymentIntentHistoryDetailDataState.copy(paymentIntent, paymentInstrumentV2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentInstrumentV2 getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public final PaymentIntentHistoryDetailDataState copy(PaymentIntent paymentIntent, PaymentInstrumentV2 paymentInstrument) {
        return new PaymentIntentHistoryDetailDataState(paymentIntent, paymentInstrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentIntentHistoryDetailDataState)) {
            return false;
        }
        PaymentIntentHistoryDetailDataState paymentIntentHistoryDetailDataState = (PaymentIntentHistoryDetailDataState) other;
        return Intrinsics.areEqual(this.paymentIntent, paymentIntentHistoryDetailDataState.paymentIntent) && Intrinsics.areEqual(this.paymentInstrument, paymentIntentHistoryDetailDataState.paymentInstrument);
    }

    public int hashCode() {
        PaymentIntent paymentIntent = this.paymentIntent;
        int iHashCode = (paymentIntent == null ? 0 : paymentIntent.hashCode()) * 31;
        PaymentInstrumentV2 paymentInstrumentV2 = this.paymentInstrument;
        return iHashCode + (paymentInstrumentV2 != null ? paymentInstrumentV2.hashCode() : 0);
    }

    public String toString() {
        return "PaymentIntentHistoryDetailDataState(paymentIntent=" + this.paymentIntent + ", paymentInstrument=" + this.paymentInstrument + ")";
    }

    public PaymentIntentHistoryDetailDataState(PaymentIntent paymentIntent, PaymentInstrumentV2 paymentInstrumentV2) {
        this.paymentIntent = paymentIntent;
        this.paymentInstrument = paymentInstrumentV2;
    }

    public /* synthetic */ PaymentIntentHistoryDetailDataState(PaymentIntent paymentIntent, PaymentInstrumentV2 paymentInstrumentV2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentIntent, (i & 2) != 0 ? null : paymentInstrumentV2);
    }

    public final PaymentIntent getPaymentIntent() {
        return this.paymentIntent;
    }

    public final PaymentInstrumentV2 getPaymentInstrument() {
        return this.paymentInstrument;
    }
}
