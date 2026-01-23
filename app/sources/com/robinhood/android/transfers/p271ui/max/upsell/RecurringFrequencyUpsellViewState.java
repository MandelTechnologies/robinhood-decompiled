package com.robinhood.android.transfers.p271ui.max.upsell;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFrequencyUpsellViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;", "", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loaded;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loading;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface RecurringFrequencyUpsellViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: RecurringFrequencyUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loading;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RecurringFrequencyUpsellViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -204002985;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: RecurringFrequencyUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loaded;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;", "sweepInterestRate", "Ljava/math/BigDecimal;", "displayDepositBoostMessage", "", "<init>", "(Ljava/math/BigDecimal;Z)V", "getSweepInterestRate", "()Ljava/math/BigDecimal;", "getDisplayDepositBoostMessage", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RecurringFrequencyUpsellViewState {
        public static final int $stable = 8;
        private final boolean displayDepositBoostMessage;
        private final BigDecimal sweepInterestRate;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, BigDecimal bigDecimal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = loaded.sweepInterestRate;
            }
            if ((i & 2) != 0) {
                z = loaded.displayDepositBoostMessage;
            }
            return loaded.copy(bigDecimal, z);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getSweepInterestRate() {
            return this.sweepInterestRate;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDisplayDepositBoostMessage() {
            return this.displayDepositBoostMessage;
        }

        public final Loaded copy(BigDecimal sweepInterestRate, boolean displayDepositBoostMessage) {
            return new Loaded(sweepInterestRate, displayDepositBoostMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.sweepInterestRate, loaded.sweepInterestRate) && this.displayDepositBoostMessage == loaded.displayDepositBoostMessage;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.sweepInterestRate;
            return ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + Boolean.hashCode(this.displayDepositBoostMessage);
        }

        public String toString() {
            return "Loaded(sweepInterestRate=" + this.sweepInterestRate + ", displayDepositBoostMessage=" + this.displayDepositBoostMessage + ")";
        }

        public Loaded(BigDecimal bigDecimal, boolean z) {
            this.sweepInterestRate = bigDecimal;
            this.displayDepositBoostMessage = z;
        }

        public final BigDecimal getSweepInterestRate() {
            return this.sweepInterestRate;
        }

        public final boolean getDisplayDepositBoostMessage() {
            return this.displayDepositBoostMessage;
        }
    }

    /* compiled from: RecurringFrequencyUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Companion;", "", "<init>", "()V", "mock", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loaded;", "getMock", "()Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loaded;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded mock = new Loaded(null, false);

        private Companion() {
        }

        public final Loaded getMock() {
            return mock;
        }
    }
}
