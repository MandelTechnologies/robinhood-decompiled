package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import com.robinhood.models.api.ApiAutomaticDeposit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ScheduleAutomaticDepositV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState$Loading;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ScheduleAutomaticDepositV2ViewState {

    /* compiled from: ScheduleAutomaticDepositV2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState$Loading;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ScheduleAutomaticDepositV2ViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1013140655;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ScheduleAutomaticDepositV2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState$Loaded;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ScheduleAutomaticDepositV2ViewState;", "enablePrimaryCta", "", "shouldCleanupOnboardingRecurringContent", "selectedFrequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "<init>", "(ZZLcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;)V", "getEnablePrimaryCta", "()Z", "getShouldCleanupOnboardingRecurringContent", "getSelectedFrequency", "()Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ScheduleAutomaticDepositV2ViewState {
        public static final int $stable = 0;
        private final boolean enablePrimaryCta;
        private final ApiAutomaticDeposit.Frequency selectedFrequency;
        private final boolean shouldCleanupOnboardingRecurringContent;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, boolean z2, ApiAutomaticDeposit.Frequency frequency, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.enablePrimaryCta;
            }
            if ((i & 2) != 0) {
                z2 = loaded.shouldCleanupOnboardingRecurringContent;
            }
            if ((i & 4) != 0) {
                frequency = loaded.selectedFrequency;
            }
            return loaded.copy(z, z2, frequency);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnablePrimaryCta() {
            return this.enablePrimaryCta;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldCleanupOnboardingRecurringContent() {
            return this.shouldCleanupOnboardingRecurringContent;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiAutomaticDeposit.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }

        public final Loaded copy(boolean enablePrimaryCta, boolean shouldCleanupOnboardingRecurringContent, ApiAutomaticDeposit.Frequency selectedFrequency) {
            return new Loaded(enablePrimaryCta, shouldCleanupOnboardingRecurringContent, selectedFrequency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.enablePrimaryCta == loaded.enablePrimaryCta && this.shouldCleanupOnboardingRecurringContent == loaded.shouldCleanupOnboardingRecurringContent && this.selectedFrequency == loaded.selectedFrequency;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.enablePrimaryCta) * 31) + Boolean.hashCode(this.shouldCleanupOnboardingRecurringContent)) * 31;
            ApiAutomaticDeposit.Frequency frequency = this.selectedFrequency;
            return iHashCode + (frequency == null ? 0 : frequency.hashCode());
        }

        public String toString() {
            return "Loaded(enablePrimaryCta=" + this.enablePrimaryCta + ", shouldCleanupOnboardingRecurringContent=" + this.shouldCleanupOnboardingRecurringContent + ", selectedFrequency=" + this.selectedFrequency + ")";
        }

        public Loaded(boolean z, boolean z2, ApiAutomaticDeposit.Frequency frequency) {
            this.enablePrimaryCta = z;
            this.shouldCleanupOnboardingRecurringContent = z2;
            this.selectedFrequency = frequency;
        }

        public /* synthetic */ Loaded(boolean z, boolean z2, ApiAutomaticDeposit.Frequency frequency, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, (i & 4) != 0 ? null : frequency);
        }

        public final boolean getEnablePrimaryCta() {
            return this.enablePrimaryCta;
        }

        public final boolean getShouldCleanupOnboardingRecurringContent() {
            return this.shouldCleanupOnboardingRecurringContent;
        }

        public final ApiAutomaticDeposit.Frequency getSelectedFrequency() {
            return this.selectedFrequency;
        }
    }
}
