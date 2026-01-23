package com.robinhood.android.transfers.p271ui.confirm;

import android.content.res.Resources;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u001f2\u0006\u0010%\u001a\u00020&J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0001J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferViewState;", "", "isLoading", "", "transfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "isConfirmInFlight", "isAbortInFlight", "transferConfirmedEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Timeline;", "viewTransferDetailEvent", "Ljava/util/UUID;", "errorEvent", "", "loadErrorEvent", "<init>", "(ZLcom/robinhood/transfers/models/db/AchTransfer;Lcom/robinhood/models/db/AchRelationship;ZZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getTransfer", "()Lcom/robinhood/transfers/models/db/AchTransfer;", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getTransferConfirmedEvent", "()Lcom/robinhood/udf/UiEvent;", "getViewTransferDetailEvent", "getErrorEvent", "getLoadErrorEvent", "amountText", "", "getAmountText", "()Ljava/lang/String;", "areButtonsVisible", "getAreButtonsVisible", "getAccountText", "resources", "Landroid/content/res/Resources;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConfirmTransferViewState {
    public static final int $stable = 8;
    private final AchRelationship achRelationship;
    private final String amountText;
    private final boolean areButtonsVisible;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isAbortInFlight;
    private final boolean isConfirmInFlight;
    private final boolean isLoading;
    private final UiEvent<Throwable> loadErrorEvent;
    private final AchTransfer transfer;
    private final UiEvent<UiPostTransferPage.Timeline> transferConfirmedEvent;
    private final UiEvent<UUID> viewTransferDetailEvent;

    public static /* synthetic */ ConfirmTransferViewState copy$default(ConfirmTransferViewState confirmTransferViewState, boolean z, AchTransfer achTransfer, AchRelationship achRelationship, boolean z2, boolean z3, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confirmTransferViewState.isLoading;
        }
        if ((i & 2) != 0) {
            achTransfer = confirmTransferViewState.transfer;
        }
        if ((i & 4) != 0) {
            achRelationship = confirmTransferViewState.achRelationship;
        }
        if ((i & 8) != 0) {
            z2 = confirmTransferViewState.isConfirmInFlight;
        }
        if ((i & 16) != 0) {
            z3 = confirmTransferViewState.isAbortInFlight;
        }
        if ((i & 32) != 0) {
            uiEvent = confirmTransferViewState.transferConfirmedEvent;
        }
        if ((i & 64) != 0) {
            uiEvent2 = confirmTransferViewState.viewTransferDetailEvent;
        }
        if ((i & 128) != 0) {
            uiEvent3 = confirmTransferViewState.errorEvent;
        }
        if ((i & 256) != 0) {
            uiEvent4 = confirmTransferViewState.loadErrorEvent;
        }
        UiEvent uiEvent5 = uiEvent3;
        UiEvent uiEvent6 = uiEvent4;
        UiEvent uiEvent7 = uiEvent;
        UiEvent uiEvent8 = uiEvent2;
        boolean z4 = z3;
        AchRelationship achRelationship2 = achRelationship;
        return confirmTransferViewState.copy(z, achTransfer, achRelationship2, z2, z4, uiEvent7, uiEvent8, uiEvent5, uiEvent6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final AchTransfer getTransfer() {
        return this.transfer;
    }

    /* renamed from: component3, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsConfirmInFlight() {
        return this.isConfirmInFlight;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAbortInFlight() {
        return this.isAbortInFlight;
    }

    public final UiEvent<UiPostTransferPage.Timeline> component6() {
        return this.transferConfirmedEvent;
    }

    public final UiEvent<UUID> component7() {
        return this.viewTransferDetailEvent;
    }

    public final UiEvent<Throwable> component8() {
        return this.errorEvent;
    }

    public final UiEvent<Throwable> component9() {
        return this.loadErrorEvent;
    }

    public final ConfirmTransferViewState copy(boolean isLoading, AchTransfer transfer, AchRelationship achRelationship, boolean isConfirmInFlight, boolean isAbortInFlight, UiEvent<UiPostTransferPage.Timeline> transferConfirmedEvent, UiEvent<UUID> viewTransferDetailEvent, UiEvent<Throwable> errorEvent, UiEvent<Throwable> loadErrorEvent) {
        return new ConfirmTransferViewState(isLoading, transfer, achRelationship, isConfirmInFlight, isAbortInFlight, transferConfirmedEvent, viewTransferDetailEvent, errorEvent, loadErrorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmTransferViewState)) {
            return false;
        }
        ConfirmTransferViewState confirmTransferViewState = (ConfirmTransferViewState) other;
        return this.isLoading == confirmTransferViewState.isLoading && Intrinsics.areEqual(this.transfer, confirmTransferViewState.transfer) && Intrinsics.areEqual(this.achRelationship, confirmTransferViewState.achRelationship) && this.isConfirmInFlight == confirmTransferViewState.isConfirmInFlight && this.isAbortInFlight == confirmTransferViewState.isAbortInFlight && Intrinsics.areEqual(this.transferConfirmedEvent, confirmTransferViewState.transferConfirmedEvent) && Intrinsics.areEqual(this.viewTransferDetailEvent, confirmTransferViewState.viewTransferDetailEvent) && Intrinsics.areEqual(this.errorEvent, confirmTransferViewState.errorEvent) && Intrinsics.areEqual(this.loadErrorEvent, confirmTransferViewState.loadErrorEvent);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        AchTransfer achTransfer = this.transfer;
        int iHashCode2 = (iHashCode + (achTransfer == null ? 0 : achTransfer.hashCode())) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode3 = (((((iHashCode2 + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31) + Boolean.hashCode(this.isConfirmInFlight)) * 31) + Boolean.hashCode(this.isAbortInFlight)) * 31;
        UiEvent<UiPostTransferPage.Timeline> uiEvent = this.transferConfirmedEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<UUID> uiEvent2 = this.viewTransferDetailEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent3 = this.errorEvent;
        int iHashCode6 = (iHashCode5 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<Throwable> uiEvent4 = this.loadErrorEvent;
        return iHashCode6 + (uiEvent4 != null ? uiEvent4.hashCode() : 0);
    }

    public String toString() {
        return "ConfirmTransferViewState(isLoading=" + this.isLoading + ", transfer=" + this.transfer + ", achRelationship=" + this.achRelationship + ", isConfirmInFlight=" + this.isConfirmInFlight + ", isAbortInFlight=" + this.isAbortInFlight + ", transferConfirmedEvent=" + this.transferConfirmedEvent + ", viewTransferDetailEvent=" + this.viewTransferDetailEvent + ", errorEvent=" + this.errorEvent + ", loadErrorEvent=" + this.loadErrorEvent + ")";
    }

    public ConfirmTransferViewState(boolean z, AchTransfer achTransfer, AchRelationship achRelationship, boolean z2, boolean z3, UiEvent<UiPostTransferPage.Timeline> uiEvent, UiEvent<UUID> uiEvent2, UiEvent<Throwable> uiEvent3, UiEvent<Throwable> uiEvent4) {
        Money amount;
        this.isLoading = z;
        this.transfer = achTransfer;
        this.achRelationship = achRelationship;
        this.isConfirmInFlight = z2;
        this.isAbortInFlight = z3;
        this.transferConfirmedEvent = uiEvent;
        this.viewTransferDetailEvent = uiEvent2;
        this.errorEvent = uiEvent3;
        this.loadErrorEvent = uiEvent4;
        this.amountText = (achTransfer == null || (amount = achTransfer.getAmount()) == null) ? null : Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        this.areButtonsVisible = achTransfer != null;
    }

    public /* synthetic */ ConfirmTransferViewState(boolean z, AchTransfer achTransfer, AchRelationship achRelationship, boolean z2, boolean z3, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : achTransfer, (i & 4) != 0 ? null : achRelationship, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : uiEvent, (i & 64) != 0 ? null : uiEvent2, (i & 128) != 0 ? null : uiEvent3, (i & 256) != 0 ? null : uiEvent4);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final AchTransfer getTransfer() {
        return this.transfer;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final boolean isConfirmInFlight() {
        return this.isConfirmInFlight;
    }

    public final boolean isAbortInFlight() {
        return this.isAbortInFlight;
    }

    public final UiEvent<UiPostTransferPage.Timeline> getTransferConfirmedEvent() {
        return this.transferConfirmedEvent;
    }

    public final UiEvent<UUID> getViewTransferDetailEvent() {
        return this.viewTransferDetailEvent;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final UiEvent<Throwable> getLoadErrorEvent() {
        return this.loadErrorEvent;
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final boolean getAreButtonsVisible() {
        return this.areButtonsVisible;
    }

    public final String getAccountText(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        AchRelationship achRelationship = this.achRelationship;
        if (achRelationship != null) {
            return resources.getString(C30065R.string.confirm_transfer_account_text, AchRelationships.getTypeAndLastFourDisplayString(achRelationship, resources));
        }
        return null;
    }
}
