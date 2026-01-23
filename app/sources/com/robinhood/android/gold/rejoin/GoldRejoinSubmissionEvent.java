package com.robinhood.android.gold.rejoin;

import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldRejoinSubmissionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionEvent;", "", "<init>", "()V", "Loaded", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionEvent$Loaded;", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldRejoinSubmissionEvent {
    public static final int $stable = 0;

    public /* synthetic */ GoldRejoinSubmissionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GoldRejoinSubmissionEvent() {
    }

    /* compiled from: GoldRejoinSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionEvent$Loaded;", "Lcom/robinhood/android/gold/rejoin/GoldRejoinSubmissionEvent;", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "<init>", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;)V", "getOutcome", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-rejoin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldRejoinSubmissionEvent {
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
}
