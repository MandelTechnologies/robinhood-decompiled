package com.robinhood.android.gold.upgrade.legacy;

import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeSubmissionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent;", "", "<init>", "()V", "Loaded", "Error", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent$Error;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent$Loaded;", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class LegacyGoldUpgradeSubmissionEvent {
    public static final int $stable = 0;

    public /* synthetic */ LegacyGoldUpgradeSubmissionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LegacyGoldUpgradeSubmissionEvent() {
    }

    /* compiled from: LegacyGoldUpgradeSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent$Loaded;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent;", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "<init>", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;)V", "getOutcome", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends LegacyGoldUpgradeSubmissionEvent {
        public static final int $stable = 8;
        private final GoldUpgradeOutcome outcome;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, GoldUpgradeOutcome goldUpgradeOutcome, int i, Object obj) {
            if ((i & 1) != 0) {
                goldUpgradeOutcome = loaded.outcome;
            }
            return loaded.copy(goldUpgradeOutcome);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldUpgradeOutcome getOutcome() {
            return this.outcome;
        }

        public final Loaded copy(GoldUpgradeOutcome outcome) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            return new Loaded(outcome);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.outcome, ((Loaded) other).outcome);
        }

        public int hashCode() {
            return this.outcome.hashCode();
        }

        public String toString() {
            return "Loaded(outcome=" + this.outcome + ")";
        }

        public final GoldUpgradeOutcome getOutcome() {
            return this.outcome;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(GoldUpgradeOutcome outcome) {
            super(null);
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            this.outcome = outcome;
        }
    }

    /* compiled from: LegacyGoldUpgradeSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent$Error;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeSubmissionEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends LegacyGoldUpgradeSubmissionEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }
}
