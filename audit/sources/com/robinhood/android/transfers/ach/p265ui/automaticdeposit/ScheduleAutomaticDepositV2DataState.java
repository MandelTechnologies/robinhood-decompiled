package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ScheduleAutomaticDepositV2ViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScheduleAutomaticDepositV2DataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2DataState;", "", "selectedFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "shouldCleanupOnboardingRecurringContent", "", "<init>", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Ljava/lang/Boolean;)V", "getSelectedFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "getShouldCleanupOnboardingRecurringContent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;Ljava/lang/Boolean;)Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2DataState;", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ScheduleAutomaticDepositV2DataState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ApiAutomaticDeposit.Frequency selectedFrequency;
    private final Boolean shouldCleanupOnboardingRecurringContent;

    /* JADX WARN: Multi-variable type inference failed */
    public ScheduleAutomaticDepositV2DataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScheduleAutomaticDepositV2DataState copy$default(ScheduleAutomaticDepositV2DataState scheduleAutomaticDepositV2DataState, ApiAutomaticDeposit.Frequency frequency, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            frequency = scheduleAutomaticDepositV2DataState.selectedFrequency;
        }
        if ((i & 2) != 0) {
            bool = scheduleAutomaticDepositV2DataState.shouldCleanupOnboardingRecurringContent;
        }
        return scheduleAutomaticDepositV2DataState.copy(frequency, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAutomaticDeposit.Frequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getShouldCleanupOnboardingRecurringContent() {
        return this.shouldCleanupOnboardingRecurringContent;
    }

    public final ScheduleAutomaticDepositV2DataState copy(ApiAutomaticDeposit.Frequency selectedFrequency, Boolean shouldCleanupOnboardingRecurringContent) {
        return new ScheduleAutomaticDepositV2DataState(selectedFrequency, shouldCleanupOnboardingRecurringContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleAutomaticDepositV2DataState)) {
            return false;
        }
        ScheduleAutomaticDepositV2DataState scheduleAutomaticDepositV2DataState = (ScheduleAutomaticDepositV2DataState) other;
        return this.selectedFrequency == scheduleAutomaticDepositV2DataState.selectedFrequency && Intrinsics.areEqual(this.shouldCleanupOnboardingRecurringContent, scheduleAutomaticDepositV2DataState.shouldCleanupOnboardingRecurringContent);
    }

    public int hashCode() {
        ApiAutomaticDeposit.Frequency frequency = this.selectedFrequency;
        int iHashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
        Boolean bool = this.shouldCleanupOnboardingRecurringContent;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ScheduleAutomaticDepositV2DataState(selectedFrequency=" + this.selectedFrequency + ", shouldCleanupOnboardingRecurringContent=" + this.shouldCleanupOnboardingRecurringContent + ")";
    }

    public ScheduleAutomaticDepositV2DataState(ApiAutomaticDeposit.Frequency frequency, Boolean bool) {
        this.selectedFrequency = frequency;
        this.shouldCleanupOnboardingRecurringContent = bool;
    }

    public /* synthetic */ ScheduleAutomaticDepositV2DataState(ApiAutomaticDeposit.Frequency frequency, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : frequency, (i & 2) != 0 ? null : bool);
    }

    public final ApiAutomaticDeposit.Frequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final Boolean getShouldCleanupOnboardingRecurringContent() {
        return this.shouldCleanupOnboardingRecurringContent;
    }

    /* compiled from: ScheduleAutomaticDepositV2DataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2DataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2DataState;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState;", "<init>", "()V", "reduce", "dataState", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<ScheduleAutomaticDepositV2DataState, ScheduleAutomaticDepositV2ViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public ScheduleAutomaticDepositV2ViewState reduce(ScheduleAutomaticDepositV2DataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getShouldCleanupOnboardingRecurringContent() == null) {
                return ScheduleAutomaticDepositV2ViewState.Loading.INSTANCE;
            }
            return new ScheduleAutomaticDepositV2ViewState.Loaded(dataState.getSelectedFrequency() != null, dataState.getShouldCleanupOnboardingRecurringContent().booleanValue(), dataState.getSelectedFrequency());
        }
    }
}
