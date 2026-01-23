package com.robinhood.android.redesign.feature.accounttab.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorExpansionState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;", "", "<init>", "()V", "collapsedOrAboutToBeCollapsed", "", "Expanded", "Collapsed", "Transitioning", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState$Collapsed;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState$Expanded;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState$Transitioning;", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class AccountSelectorExpansionState {
    public static final int $stable = 0;

    public /* synthetic */ AccountSelectorExpansionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AccountSelectorExpansionState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState$Expanded;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;", "<init>", "()V", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Expanded extends AccountSelectorExpansionState {
        public static final int $stable = 0;
        public static final Expanded INSTANCE = new Expanded();

        private Expanded() {
            super(null);
        }
    }

    private AccountSelectorExpansionState() {
    }

    /* compiled from: AccountSelectorExpansionState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState$Collapsed;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;", "<init>", "()V", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Collapsed extends AccountSelectorExpansionState {
        public static final int $stable = 0;
        public static final Collapsed INSTANCE = new Collapsed();

        private Collapsed() {
            super(null);
        }
    }

    /* compiled from: AccountSelectorExpansionState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0001HÆ\u0003J\t\u0010\n\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState$Transitioning;", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;", "from", "to", "<init>", "(Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;)V", "getFrom", "()Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;", "getTo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Transitioning extends AccountSelectorExpansionState {
        public static final int $stable = 0;
        private final AccountSelectorExpansionState from;
        private final AccountSelectorExpansionState to;

        public static /* synthetic */ Transitioning copy$default(Transitioning transitioning, AccountSelectorExpansionState accountSelectorExpansionState, AccountSelectorExpansionState accountSelectorExpansionState2, int i, Object obj) {
            if ((i & 1) != 0) {
                accountSelectorExpansionState = transitioning.from;
            }
            if ((i & 2) != 0) {
                accountSelectorExpansionState2 = transitioning.to;
            }
            return transitioning.copy(accountSelectorExpansionState, accountSelectorExpansionState2);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountSelectorExpansionState getFrom() {
            return this.from;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountSelectorExpansionState getTo() {
            return this.to;
        }

        public final Transitioning copy(AccountSelectorExpansionState from, AccountSelectorExpansionState to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            return new Transitioning(from, to);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Transitioning)) {
                return false;
            }
            Transitioning transitioning = (Transitioning) other;
            return Intrinsics.areEqual(this.from, transitioning.from) && Intrinsics.areEqual(this.to, transitioning.to);
        }

        public int hashCode() {
            return (this.from.hashCode() * 31) + this.to.hashCode();
        }

        public String toString() {
            return "Transitioning(from=" + this.from + ", to=" + this.to + ")";
        }

        public final AccountSelectorExpansionState getFrom() {
            return this.from;
        }

        public final AccountSelectorExpansionState getTo() {
            return this.to;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transitioning(AccountSelectorExpansionState from, AccountSelectorExpansionState to) {
            super(null);
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.from = from;
            this.to = to;
        }
    }

    public final boolean collapsedOrAboutToBeCollapsed() {
        Collapsed collapsed = Collapsed.INSTANCE;
        if (Intrinsics.areEqual(this, collapsed)) {
            return true;
        }
        Transitioning transitioning = this instanceof Transitioning ? (Transitioning) this : null;
        return Intrinsics.areEqual(transitioning != null ? transitioning.getTo() : null, collapsed);
    }
}
