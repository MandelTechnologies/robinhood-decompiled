package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositConfirmationDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationDataState;", "", "postTransferPage", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "instrument", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;)V", "getPostTransferPage", "()Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "getInstrument", "()Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkQueuedDepositConfirmationDataState {
    public static final int $stable = 8;
    private final PaymentInstrumentV2 instrument;
    private final UiPostTransferPage.UkQueuedDeposit postTransferPage;

    public static /* synthetic */ UkQueuedDepositConfirmationDataState copy$default(UkQueuedDepositConfirmationDataState ukQueuedDepositConfirmationDataState, UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, PaymentInstrumentV2 paymentInstrumentV2, int i, Object obj) {
        if ((i & 1) != 0) {
            ukQueuedDeposit = ukQueuedDepositConfirmationDataState.postTransferPage;
        }
        if ((i & 2) != 0) {
            paymentInstrumentV2 = ukQueuedDepositConfirmationDataState.instrument;
        }
        return ukQueuedDepositConfirmationDataState.copy(ukQueuedDeposit, paymentInstrumentV2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiPostTransferPage.UkQueuedDeposit getPostTransferPage() {
        return this.postTransferPage;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentInstrumentV2 getInstrument() {
        return this.instrument;
    }

    public final UkQueuedDepositConfirmationDataState copy(UiPostTransferPage.UkQueuedDeposit postTransferPage, PaymentInstrumentV2 instrument) {
        Intrinsics.checkNotNullParameter(postTransferPage, "postTransferPage");
        return new UkQueuedDepositConfirmationDataState(postTransferPage, instrument);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkQueuedDepositConfirmationDataState)) {
            return false;
        }
        UkQueuedDepositConfirmationDataState ukQueuedDepositConfirmationDataState = (UkQueuedDepositConfirmationDataState) other;
        return Intrinsics.areEqual(this.postTransferPage, ukQueuedDepositConfirmationDataState.postTransferPage) && Intrinsics.areEqual(this.instrument, ukQueuedDepositConfirmationDataState.instrument);
    }

    public int hashCode() {
        int iHashCode = this.postTransferPage.hashCode() * 31;
        PaymentInstrumentV2 paymentInstrumentV2 = this.instrument;
        return iHashCode + (paymentInstrumentV2 == null ? 0 : paymentInstrumentV2.hashCode());
    }

    public String toString() {
        return "UkQueuedDepositConfirmationDataState(postTransferPage=" + this.postTransferPage + ", instrument=" + this.instrument + ")";
    }

    public UkQueuedDepositConfirmationDataState(UiPostTransferPage.UkQueuedDeposit postTransferPage, PaymentInstrumentV2 paymentInstrumentV2) {
        Intrinsics.checkNotNullParameter(postTransferPage, "postTransferPage");
        this.postTransferPage = postTransferPage;
        this.instrument = paymentInstrumentV2;
    }

    public /* synthetic */ UkQueuedDepositConfirmationDataState(UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, PaymentInstrumentV2 paymentInstrumentV2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ukQueuedDeposit, (i & 2) != 0 ? null : paymentInstrumentV2);
    }

    public final UiPostTransferPage.UkQueuedDeposit getPostTransferPage() {
        return this.postTransferPage;
    }

    public final PaymentInstrumentV2 getInstrument() {
        return this.instrument;
    }
}
