package com.robinhood.android.transfers.p271ui.max.upsell;

import com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFrequencyUpsellDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDataState;", "", "sweepStatus", "Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "displayDepositBoostMessage", "", "<init>", "(Lcom/robinhood/librobinhood/data/store/SweepsStatus;Ljava/lang/Boolean;)V", "getSweepStatus", "()Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "getDisplayDepositBoostMessage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/robinhood/librobinhood/data/store/SweepsStatus;Ljava/lang/Boolean;)Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDataState;", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringFrequencyUpsellDataState {
    private final Boolean displayDepositBoostMessage;
    private final SweepsStatus sweepStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringFrequencyUpsellDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecurringFrequencyUpsellDataState copy$default(RecurringFrequencyUpsellDataState recurringFrequencyUpsellDataState, SweepsStatus sweepsStatus, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            sweepsStatus = recurringFrequencyUpsellDataState.sweepStatus;
        }
        if ((i & 2) != 0) {
            bool = recurringFrequencyUpsellDataState.displayDepositBoostMessage;
        }
        return recurringFrequencyUpsellDataState.copy(sweepsStatus, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final SweepsStatus getSweepStatus() {
        return this.sweepStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getDisplayDepositBoostMessage() {
        return this.displayDepositBoostMessage;
    }

    public final RecurringFrequencyUpsellDataState copy(SweepsStatus sweepStatus, Boolean displayDepositBoostMessage) {
        return new RecurringFrequencyUpsellDataState(sweepStatus, displayDepositBoostMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringFrequencyUpsellDataState)) {
            return false;
        }
        RecurringFrequencyUpsellDataState recurringFrequencyUpsellDataState = (RecurringFrequencyUpsellDataState) other;
        return Intrinsics.areEqual(this.sweepStatus, recurringFrequencyUpsellDataState.sweepStatus) && Intrinsics.areEqual(this.displayDepositBoostMessage, recurringFrequencyUpsellDataState.displayDepositBoostMessage);
    }

    public int hashCode() {
        SweepsStatus sweepsStatus = this.sweepStatus;
        int iHashCode = (sweepsStatus == null ? 0 : sweepsStatus.hashCode()) * 31;
        Boolean bool = this.displayDepositBoostMessage;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "RecurringFrequencyUpsellDataState(sweepStatus=" + this.sweepStatus + ", displayDepositBoostMessage=" + this.displayDepositBoostMessage + ")";
    }

    public RecurringFrequencyUpsellDataState(SweepsStatus sweepsStatus, Boolean bool) {
        this.sweepStatus = sweepsStatus;
        this.displayDepositBoostMessage = bool;
    }

    public /* synthetic */ RecurringFrequencyUpsellDataState(SweepsStatus sweepsStatus, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sweepsStatus, (i & 2) != 0 ? null : bool);
    }

    public final SweepsStatus getSweepStatus() {
        return this.sweepStatus;
    }

    public final Boolean getDisplayDepositBoostMessage() {
        return this.displayDepositBoostMessage;
    }

    /* compiled from: RecurringFrequencyUpsellDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellDataState;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;", "<init>", "()V", "reduce", "dataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<RecurringFrequencyUpsellDataState, RecurringFrequencyUpsellViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RecurringFrequencyUpsellViewState reduce(RecurringFrequencyUpsellDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getDisplayDepositBoostMessage() == null || dataState.getSweepStatus() == null) {
                return RecurringFrequencyUpsellViewState.Loading.INSTANCE;
            }
            return new RecurringFrequencyUpsellViewState.Loaded(dataState.getSweepStatus().getSweepEnrollment().getSweepEnrolled() ? dataState.getSweepStatus().getSweepInterestRate() : null, dataState.getDisplayDepositBoostMessage().booleanValue());
        }
    }
}
