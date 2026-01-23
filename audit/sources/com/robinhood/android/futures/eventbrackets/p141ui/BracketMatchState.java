package com.robinhood.android.futures.eventbrackets.p141ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "", "<init>", "()V", "Locked", "Tradeable", "Resolved", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState$Locked;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState$Resolved;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState$Tradeable;", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class BracketMatchState {
    public static final int $stable = 0;

    public /* synthetic */ BracketMatchState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: BracketMatchOverviewCard.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState$Locked;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "showTwoLocksSideBySide", "", "<init>", "(Z)V", "getShowTwoLocksSideBySide", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Locked extends BracketMatchState {
        public static final int $stable = 0;
        private final boolean showTwoLocksSideBySide;

        public static /* synthetic */ Locked copy$default(Locked locked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = locked.showTwoLocksSideBySide;
            }
            return locked.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowTwoLocksSideBySide() {
            return this.showTwoLocksSideBySide;
        }

        public final Locked copy(boolean showTwoLocksSideBySide) {
            return new Locked(showTwoLocksSideBySide);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Locked) && this.showTwoLocksSideBySide == ((Locked) other).showTwoLocksSideBySide;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showTwoLocksSideBySide);
        }

        public String toString() {
            return "Locked(showTwoLocksSideBySide=" + this.showTwoLocksSideBySide + ")";
        }

        public Locked(boolean z) {
            super(null);
            this.showTwoLocksSideBySide = z;
        }

        public final boolean getShowTwoLocksSideBySide() {
            return this.showTwoLocksSideBySide;
        }
    }

    private BracketMatchState() {
    }

    /* compiled from: BracketMatchOverviewCard.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState$Tradeable;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "isLive", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Tradeable extends BracketMatchState {
        public static final int $stable = 0;
        private final boolean isLive;

        public static /* synthetic */ Tradeable copy$default(Tradeable tradeable, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tradeable.isLive;
            }
            return tradeable.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLive() {
            return this.isLive;
        }

        public final Tradeable copy(boolean isLive) {
            return new Tradeable(isLive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tradeable) && this.isLive == ((Tradeable) other).isLive;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLive);
        }

        public String toString() {
            return "Tradeable(isLive=" + this.isLive + ")";
        }

        public Tradeable(boolean z) {
            super(null);
            this.isLive = z;
        }

        public final boolean isLive() {
            return this.isLive;
        }
    }

    /* compiled from: BracketMatchOverviewCard.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState$Resolved;", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketMatchState;", "seed1IsWinner", "", "<init>", "(Z)V", "getSeed1IsWinner", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Resolved extends BracketMatchState {
        public static final int $stable = 0;
        private final boolean seed1IsWinner;

        public static /* synthetic */ Resolved copy$default(Resolved resolved, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = resolved.seed1IsWinner;
            }
            return resolved.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSeed1IsWinner() {
            return this.seed1IsWinner;
        }

        public final Resolved copy(boolean seed1IsWinner) {
            return new Resolved(seed1IsWinner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Resolved) && this.seed1IsWinner == ((Resolved) other).seed1IsWinner;
        }

        public int hashCode() {
            return Boolean.hashCode(this.seed1IsWinner);
        }

        public String toString() {
            return "Resolved(seed1IsWinner=" + this.seed1IsWinner + ")";
        }

        public final boolean getSeed1IsWinner() {
            return this.seed1IsWinner;
        }

        public Resolved(boolean z) {
            super(null);
            this.seed1IsWinner = z;
        }
    }
}
