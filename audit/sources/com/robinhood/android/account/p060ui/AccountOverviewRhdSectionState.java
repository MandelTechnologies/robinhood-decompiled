package com.robinhood.android.account.p060ui;

import com.robinhood.android.futures.lib.rhd.accountoverview.RhdAccountDataState;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewFuturesCard.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewRhdSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "rhdState", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "ecSupported", "", "cryptoSupported", "<init>", "(Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;ZZ)V", "getRhdState", "()Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "getEcSupported", "()Z", "getCryptoSupported", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountOverviewRhdSectionState extends AccountOverviewSectionState {
    public static final int $stable = 8;
    private final boolean cryptoSupported;
    private final boolean ecSupported;
    private final RhdAccountDataState rhdState;

    public static /* synthetic */ AccountOverviewRhdSectionState copy$default(AccountOverviewRhdSectionState accountOverviewRhdSectionState, RhdAccountDataState rhdAccountDataState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            rhdAccountDataState = accountOverviewRhdSectionState.rhdState;
        }
        if ((i & 2) != 0) {
            z = accountOverviewRhdSectionState.ecSupported;
        }
        if ((i & 4) != 0) {
            z2 = accountOverviewRhdSectionState.cryptoSupported;
        }
        return accountOverviewRhdSectionState.copy(rhdAccountDataState, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final RhdAccountDataState getRhdState() {
        return this.rhdState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEcSupported() {
        return this.ecSupported;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCryptoSupported() {
        return this.cryptoSupported;
    }

    public final AccountOverviewRhdSectionState copy(RhdAccountDataState rhdState, boolean ecSupported, boolean cryptoSupported) {
        Intrinsics.checkNotNullParameter(rhdState, "rhdState");
        return new AccountOverviewRhdSectionState(rhdState, ecSupported, cryptoSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountOverviewRhdSectionState)) {
            return false;
        }
        AccountOverviewRhdSectionState accountOverviewRhdSectionState = (AccountOverviewRhdSectionState) other;
        return Intrinsics.areEqual(this.rhdState, accountOverviewRhdSectionState.rhdState) && this.ecSupported == accountOverviewRhdSectionState.ecSupported && this.cryptoSupported == accountOverviewRhdSectionState.cryptoSupported;
    }

    public int hashCode() {
        return (((this.rhdState.hashCode() * 31) + Boolean.hashCode(this.ecSupported)) * 31) + Boolean.hashCode(this.cryptoSupported);
    }

    public String toString() {
        return "AccountOverviewRhdSectionState(rhdState=" + this.rhdState + ", ecSupported=" + this.ecSupported + ", cryptoSupported=" + this.cryptoSupported + ")";
    }

    public final RhdAccountDataState getRhdState() {
        return this.rhdState;
    }

    public final boolean getEcSupported() {
        return this.ecSupported;
    }

    public final boolean getCryptoSupported() {
        return this.cryptoSupported;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountOverviewRhdSectionState(RhdAccountDataState rhdState, boolean z, boolean z2) {
        super(CardOrder.CardIdentifier.FUTURES, null);
        Intrinsics.checkNotNullParameter(rhdState, "rhdState");
        this.rhdState = rhdState;
        this.ecSupported = z;
        this.cryptoSupported = z2;
    }
}
