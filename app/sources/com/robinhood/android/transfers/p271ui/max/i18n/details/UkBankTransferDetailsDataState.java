package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkBankTransferDetailsDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDataState;", "", "transfer", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "paymentInstrument", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "isInCancelableUkTransferExperiment", "", "isCancelRequestInFlight", "<init>", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;ZZ)V", "getTransfer", "()Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getPaymentInstrument", "()Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkBankTransferDetailsDataState {
    public static final int $stable = 8;
    private final boolean isCancelRequestInFlight;
    private final boolean isInCancelableUkTransferExperiment;
    private final PaymentInstrumentV2 paymentInstrument;
    private final PaymentTransfer transfer;

    public UkBankTransferDetailsDataState() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ UkBankTransferDetailsDataState copy$default(UkBankTransferDetailsDataState ukBankTransferDetailsDataState, PaymentTransfer paymentTransfer, PaymentInstrumentV2 paymentInstrumentV2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentTransfer = ukBankTransferDetailsDataState.transfer;
        }
        if ((i & 2) != 0) {
            paymentInstrumentV2 = ukBankTransferDetailsDataState.paymentInstrument;
        }
        if ((i & 4) != 0) {
            z = ukBankTransferDetailsDataState.isInCancelableUkTransferExperiment;
        }
        if ((i & 8) != 0) {
            z2 = ukBankTransferDetailsDataState.isCancelRequestInFlight;
        }
        return ukBankTransferDetailsDataState.copy(paymentTransfer, paymentInstrumentV2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentTransfer getTransfer() {
        return this.transfer;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentInstrumentV2 getPaymentInstrument() {
        return this.paymentInstrument;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInCancelableUkTransferExperiment() {
        return this.isInCancelableUkTransferExperiment;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }

    public final UkBankTransferDetailsDataState copy(PaymentTransfer transfer, PaymentInstrumentV2 paymentInstrument, boolean isInCancelableUkTransferExperiment, boolean isCancelRequestInFlight) {
        return new UkBankTransferDetailsDataState(transfer, paymentInstrument, isInCancelableUkTransferExperiment, isCancelRequestInFlight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkBankTransferDetailsDataState)) {
            return false;
        }
        UkBankTransferDetailsDataState ukBankTransferDetailsDataState = (UkBankTransferDetailsDataState) other;
        return Intrinsics.areEqual(this.transfer, ukBankTransferDetailsDataState.transfer) && Intrinsics.areEqual(this.paymentInstrument, ukBankTransferDetailsDataState.paymentInstrument) && this.isInCancelableUkTransferExperiment == ukBankTransferDetailsDataState.isInCancelableUkTransferExperiment && this.isCancelRequestInFlight == ukBankTransferDetailsDataState.isCancelRequestInFlight;
    }

    public int hashCode() {
        PaymentTransfer paymentTransfer = this.transfer;
        int iHashCode = (paymentTransfer == null ? 0 : paymentTransfer.hashCode()) * 31;
        PaymentInstrumentV2 paymentInstrumentV2 = this.paymentInstrument;
        return ((((iHashCode + (paymentInstrumentV2 != null ? paymentInstrumentV2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInCancelableUkTransferExperiment)) * 31) + Boolean.hashCode(this.isCancelRequestInFlight);
    }

    public String toString() {
        return "UkBankTransferDetailsDataState(transfer=" + this.transfer + ", paymentInstrument=" + this.paymentInstrument + ", isInCancelableUkTransferExperiment=" + this.isInCancelableUkTransferExperiment + ", isCancelRequestInFlight=" + this.isCancelRequestInFlight + ")";
    }

    public UkBankTransferDetailsDataState(PaymentTransfer paymentTransfer, PaymentInstrumentV2 paymentInstrumentV2, boolean z, boolean z2) {
        this.transfer = paymentTransfer;
        this.paymentInstrument = paymentInstrumentV2;
        this.isInCancelableUkTransferExperiment = z;
        this.isCancelRequestInFlight = z2;
    }

    public /* synthetic */ UkBankTransferDetailsDataState(PaymentTransfer paymentTransfer, PaymentInstrumentV2 paymentInstrumentV2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentTransfer, (i & 2) != 0 ? null : paymentInstrumentV2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final PaymentTransfer getTransfer() {
        return this.transfer;
    }

    public final PaymentInstrumentV2 getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public final boolean isInCancelableUkTransferExperiment() {
        return this.isInCancelableUkTransferExperiment;
    }

    public final boolean isCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }
}
