package com.robinhood.android.history.p153ui.check;

import com.robinhood.models.api.minerva.ApiCheckPaymentDetails;
import com.robinhood.models.p320db.mcduckling.CheckPaymentDetails;
import com.robinhood.models.p320db.mcduckling.p321ui.UiCheckPaymentDetails;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CheckPaymentDetailViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/history/ui/check/CheckPaymentDetailViewState;", "", "isLoading", "", "checkDetails", "Lcom/robinhood/models/db/mcduckling/ui/UiCheckPaymentDetails;", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(ZLcom/robinhood/models/db/mcduckling/ui/UiCheckPaymentDetails;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getCheckDetails", "()Lcom/robinhood/models/db/mcduckling/ui/UiCheckPaymentDetails;", "getError", "()Lcom/robinhood/udf/UiEvent;", "isEstimatedDateVisible", "estimatedDate", "", "getEstimatedDate", "()Ljava/lang/String;", "submittedDate", "getSubmittedDate", "statusMessage", "getStatusMessage", "isMemoVisible", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class CheckPaymentDetailViewState {
    public static final int $stable = 8;
    private final UiCheckPaymentDetails checkDetails;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;

    /* compiled from: CheckPaymentDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCheckPaymentDetails.State.values().length];
            try {
                iArr[ApiCheckPaymentDetails.State.UNCONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCheckPaymentDetails.State.SUBMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCheckPaymentDetails.State.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCheckPaymentDetails.State.READY_FOR_MAILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCheckPaymentDetails.State.MAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiCheckPaymentDetails.State.STOPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiCheckPaymentDetails.State.STOP_REQUESTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CheckPaymentDetailViewState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckPaymentDetailViewState copy$default(CheckPaymentDetailViewState checkPaymentDetailViewState, boolean z, UiCheckPaymentDetails uiCheckPaymentDetails, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkPaymentDetailViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiCheckPaymentDetails = checkPaymentDetailViewState.checkDetails;
        }
        if ((i & 4) != 0) {
            uiEvent = checkPaymentDetailViewState.error;
        }
        return checkPaymentDetailViewState.copy(z, uiCheckPaymentDetails, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCheckPaymentDetails getCheckDetails() {
        return this.checkDetails;
    }

    public final UiEvent<Throwable> component3() {
        return this.error;
    }

    public final CheckPaymentDetailViewState copy(boolean isLoading, UiCheckPaymentDetails checkDetails, UiEvent<Throwable> error) {
        return new CheckPaymentDetailViewState(isLoading, checkDetails, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentDetailViewState)) {
            return false;
        }
        CheckPaymentDetailViewState checkPaymentDetailViewState = (CheckPaymentDetailViewState) other;
        return this.isLoading == checkPaymentDetailViewState.isLoading && Intrinsics.areEqual(this.checkDetails, checkPaymentDetailViewState.checkDetails) && Intrinsics.areEqual(this.error, checkPaymentDetailViewState.error);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiCheckPaymentDetails uiCheckPaymentDetails = this.checkDetails;
        int iHashCode2 = (iHashCode + (uiCheckPaymentDetails == null ? 0 : uiCheckPaymentDetails.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "CheckPaymentDetailViewState(isLoading=" + this.isLoading + ", checkDetails=" + this.checkDetails + ", error=" + this.error + ")";
    }

    public CheckPaymentDetailViewState(boolean z, UiCheckPaymentDetails uiCheckPaymentDetails, UiEvent<Throwable> uiEvent) {
        this.isLoading = z;
        this.checkDetails = uiCheckPaymentDetails;
        this.error = uiEvent;
    }

    public /* synthetic */ CheckPaymentDetailViewState(boolean z, UiCheckPaymentDetails uiCheckPaymentDetails, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiCheckPaymentDetails, (i & 4) != 0 ? null : uiEvent);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiCheckPaymentDetails getCheckDetails() {
        return this.checkDetails;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean isEstimatedDateVisible() {
        CheckPaymentDetails checkPayment;
        UiCheckPaymentDetails uiCheckPaymentDetails = this.checkDetails;
        ApiCheckPaymentDetails.State state = (uiCheckPaymentDetails == null || (checkPayment = uiCheckPaymentDetails.getCheckPayment()) == null) ? null : checkPayment.getState();
        switch (state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final String getEstimatedDate() {
        UiCheckPaymentDetails uiCheckPaymentDetails = this.checkDetails;
        if (uiCheckPaymentDetails == null || uiCheckPaymentDetails.getCheckPayment().getEstimatedArrival() == null) {
            return null;
        }
        CheckPaymentDetails.CheckEstimatedDates estimatedArrival = this.checkDetails.getCheckPayment().getEstimatedArrival();
        Intrinsics.checkNotNull(estimatedArrival);
        if (estimatedArrival.getIsSameDay()) {
            return LocalDateFormatter.MEDIUM.format(estimatedArrival.getEndDate());
        }
        return LocalDateFormatter.MEDIUM_NO_YEAR.format(estimatedArrival.getStartDate()) + " - " + LocalDateFormatter.MEDIUM.format(estimatedArrival.getEndDate());
    }

    public final String getSubmittedDate() {
        UiCheckPaymentDetails uiCheckPaymentDetails = this.checkDetails;
        if (uiCheckPaymentDetails == null) {
            return null;
        }
        return InstantFormatter.DATE_IN_SYSTEM_ZONE.format((InstantFormatter) uiCheckPaymentDetails.getCheckPayment().getCreatedAt());
    }

    public final String getStatusMessage() {
        UiCheckPaymentDetails uiCheckPaymentDetails;
        CheckPaymentDetails checkPayment;
        CheckPaymentDetails checkPayment2;
        UiCheckPaymentDetails uiCheckPaymentDetails2 = this.checkDetails;
        String statusMessage = (uiCheckPaymentDetails2 == null || (checkPayment2 = uiCheckPaymentDetails2.getCheckPayment()) == null) ? null : checkPayment2.getStatusMessage();
        if (statusMessage == null || StringsKt.isBlank(statusMessage) || (uiCheckPaymentDetails = this.checkDetails) == null || (checkPayment = uiCheckPaymentDetails.getCheckPayment()) == null) {
            return null;
        }
        return checkPayment.getStatusMessage();
    }

    public final boolean isMemoVisible() {
        CheckPaymentDetails checkPayment;
        String memo;
        UiCheckPaymentDetails uiCheckPaymentDetails = this.checkDetails;
        return (uiCheckPaymentDetails == null || (checkPayment = uiCheckPaymentDetails.getCheckPayment()) == null || (memo = checkPayment.getMemo()) == null || !(StringsKt.isBlank(memo) ^ true)) ? false : true;
    }
}
