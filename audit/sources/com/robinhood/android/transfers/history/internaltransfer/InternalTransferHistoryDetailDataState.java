package com.robinhood.android.transfers.history.internaltransfer;

import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalTransferHistoryDetailDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0087\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/internaltransfer/InternalTransferHistoryDetailDataState;", "", "overview", "Lcom/robinhood/android/transfers/history/internaltransfer/TransactionOverview;", "transaction", "Lcom/robinhood/shared/models/history/MinervaTransaction;", ErrorResponse.DETAIL, "", "loadingText", "isLoading", "", "showCancelButton", "isCancelRequestInFlight", "cancelSuccessEvent", "Lcom/robinhood/udf/UiEvent;", "", "cancelErrorEvent", "", "additionalInfoText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/android/transfers/history/internaltransfer/TransactionOverview;Lcom/robinhood/shared/models/history/MinervaTransaction;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/utils/resource/StringResource;)V", "getOverview", "()Lcom/robinhood/android/transfers/history/internaltransfer/TransactionOverview;", "getTransaction", "()Lcom/robinhood/shared/models/history/MinervaTransaction;", "getDetail", "()Ljava/lang/CharSequence;", "getLoadingText", "()Z", "getShowCancelButton", "getCancelSuccessEvent", "()Lcom/robinhood/udf/UiEvent;", "getCancelErrorEvent", "getAdditionalInfoText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfer-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternalTransferHistoryDetailDataState {
    public static final int $stable = 8;
    private final StringResource additionalInfoText;
    private final UiEvent<Throwable> cancelErrorEvent;
    private final UiEvent<Unit> cancelSuccessEvent;
    private final CharSequence detail;
    private final boolean isCancelRequestInFlight;
    private final boolean isLoading;
    private final CharSequence loadingText;
    private final TransactionOverview overview;
    private final boolean showCancelButton;
    private final MinervaTransaction transaction;

    public InternalTransferHistoryDetailDataState() {
        this(null, null, null, null, false, false, false, null, null, null, 1023, null);
    }

    public static /* synthetic */ InternalTransferHistoryDetailDataState copy$default(InternalTransferHistoryDetailDataState internalTransferHistoryDetailDataState, TransactionOverview transactionOverview, MinervaTransaction minervaTransaction, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, UiEvent uiEvent, UiEvent uiEvent2, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionOverview = internalTransferHistoryDetailDataState.overview;
        }
        if ((i & 2) != 0) {
            minervaTransaction = internalTransferHistoryDetailDataState.transaction;
        }
        if ((i & 4) != 0) {
            charSequence = internalTransferHistoryDetailDataState.detail;
        }
        if ((i & 8) != 0) {
            charSequence2 = internalTransferHistoryDetailDataState.loadingText;
        }
        if ((i & 16) != 0) {
            z = internalTransferHistoryDetailDataState.isLoading;
        }
        if ((i & 32) != 0) {
            z2 = internalTransferHistoryDetailDataState.showCancelButton;
        }
        if ((i & 64) != 0) {
            z3 = internalTransferHistoryDetailDataState.isCancelRequestInFlight;
        }
        if ((i & 128) != 0) {
            uiEvent = internalTransferHistoryDetailDataState.cancelSuccessEvent;
        }
        if ((i & 256) != 0) {
            uiEvent2 = internalTransferHistoryDetailDataState.cancelErrorEvent;
        }
        if ((i & 512) != 0) {
            stringResource = internalTransferHistoryDetailDataState.additionalInfoText;
        }
        UiEvent uiEvent3 = uiEvent2;
        StringResource stringResource2 = stringResource;
        boolean z4 = z3;
        UiEvent uiEvent4 = uiEvent;
        boolean z5 = z;
        boolean z6 = z2;
        return internalTransferHistoryDetailDataState.copy(transactionOverview, minervaTransaction, charSequence, charSequence2, z5, z6, z4, uiEvent4, uiEvent3, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransactionOverview getOverview() {
        return this.overview;
    }

    /* renamed from: component10, reason: from getter */
    public final StringResource getAdditionalInfoText() {
        return this.additionalInfoText;
    }

    /* renamed from: component2, reason: from getter */
    public final MinervaTransaction getTransaction() {
        return this.transaction;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getDetail() {
        return this.detail;
    }

    /* renamed from: component4, reason: from getter */
    public final CharSequence getLoadingText() {
        return this.loadingText;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }

    public final UiEvent<Unit> component8() {
        return this.cancelSuccessEvent;
    }

    public final UiEvent<Throwable> component9() {
        return this.cancelErrorEvent;
    }

    public final InternalTransferHistoryDetailDataState copy(TransactionOverview overview, MinervaTransaction transaction, CharSequence detail, CharSequence loadingText, boolean isLoading, boolean showCancelButton, boolean isCancelRequestInFlight, UiEvent<Unit> cancelSuccessEvent, UiEvent<Throwable> cancelErrorEvent, StringResource additionalInfoText) {
        return new InternalTransferHistoryDetailDataState(overview, transaction, detail, loadingText, isLoading, showCancelButton, isCancelRequestInFlight, cancelSuccessEvent, cancelErrorEvent, additionalInfoText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalTransferHistoryDetailDataState)) {
            return false;
        }
        InternalTransferHistoryDetailDataState internalTransferHistoryDetailDataState = (InternalTransferHistoryDetailDataState) other;
        return Intrinsics.areEqual(this.overview, internalTransferHistoryDetailDataState.overview) && Intrinsics.areEqual(this.transaction, internalTransferHistoryDetailDataState.transaction) && Intrinsics.areEqual(this.detail, internalTransferHistoryDetailDataState.detail) && Intrinsics.areEqual(this.loadingText, internalTransferHistoryDetailDataState.loadingText) && this.isLoading == internalTransferHistoryDetailDataState.isLoading && this.showCancelButton == internalTransferHistoryDetailDataState.showCancelButton && this.isCancelRequestInFlight == internalTransferHistoryDetailDataState.isCancelRequestInFlight && Intrinsics.areEqual(this.cancelSuccessEvent, internalTransferHistoryDetailDataState.cancelSuccessEvent) && Intrinsics.areEqual(this.cancelErrorEvent, internalTransferHistoryDetailDataState.cancelErrorEvent) && Intrinsics.areEqual(this.additionalInfoText, internalTransferHistoryDetailDataState.additionalInfoText);
    }

    public int hashCode() {
        TransactionOverview transactionOverview = this.overview;
        int iHashCode = (transactionOverview == null ? 0 : transactionOverview.hashCode()) * 31;
        MinervaTransaction minervaTransaction = this.transaction;
        int iHashCode2 = (iHashCode + (minervaTransaction == null ? 0 : minervaTransaction.hashCode())) * 31;
        CharSequence charSequence = this.detail;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.loadingText;
        int iHashCode4 = (((((((iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.showCancelButton)) * 31) + Boolean.hashCode(this.isCancelRequestInFlight)) * 31;
        UiEvent<Unit> uiEvent = this.cancelSuccessEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.cancelErrorEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        StringResource stringResource = this.additionalInfoText;
        return iHashCode6 + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        TransactionOverview transactionOverview = this.overview;
        MinervaTransaction minervaTransaction = this.transaction;
        CharSequence charSequence = this.detail;
        CharSequence charSequence2 = this.loadingText;
        return "InternalTransferHistoryDetailDataState(overview=" + transactionOverview + ", transaction=" + minervaTransaction + ", detail=" + ((Object) charSequence) + ", loadingText=" + ((Object) charSequence2) + ", isLoading=" + this.isLoading + ", showCancelButton=" + this.showCancelButton + ", isCancelRequestInFlight=" + this.isCancelRequestInFlight + ", cancelSuccessEvent=" + this.cancelSuccessEvent + ", cancelErrorEvent=" + this.cancelErrorEvent + ", additionalInfoText=" + this.additionalInfoText + ")";
    }

    public InternalTransferHistoryDetailDataState(TransactionOverview transactionOverview, MinervaTransaction minervaTransaction, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, UiEvent<Unit> uiEvent, UiEvent<Throwable> uiEvent2, StringResource stringResource) {
        this.overview = transactionOverview;
        this.transaction = minervaTransaction;
        this.detail = charSequence;
        this.loadingText = charSequence2;
        this.isLoading = z;
        this.showCancelButton = z2;
        this.isCancelRequestInFlight = z3;
        this.cancelSuccessEvent = uiEvent;
        this.cancelErrorEvent = uiEvent2;
        this.additionalInfoText = stringResource;
    }

    public /* synthetic */ InternalTransferHistoryDetailDataState(TransactionOverview transactionOverview, MinervaTransaction minervaTransaction, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, UiEvent uiEvent, UiEvent uiEvent2, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transactionOverview, (i & 2) != 0 ? null : minervaTransaction, (i & 4) != 0 ? null : charSequence, (i & 8) != 0 ? null : charSequence2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : uiEvent, (i & 256) != 0 ? null : uiEvent2, (i & 512) != 0 ? null : stringResource);
    }

    public final TransactionOverview getOverview() {
        return this.overview;
    }

    public final MinervaTransaction getTransaction() {
        return this.transaction;
    }

    public final CharSequence getDetail() {
        return this.detail;
    }

    public final CharSequence getLoadingText() {
        return this.loadingText;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    public final boolean isCancelRequestInFlight() {
        return this.isCancelRequestInFlight;
    }

    public final UiEvent<Unit> getCancelSuccessEvent() {
        return this.cancelSuccessEvent;
    }

    public final UiEvent<Throwable> getCancelErrorEvent() {
        return this.cancelErrorEvent;
    }

    public final StringResource getAdditionalInfoText() {
        return this.additionalInfoText;
    }
}
