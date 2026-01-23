package com.robinhood.store.futures.mib;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MiBFuturesAccountProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/futures/mib/MiBFuturesState;", "", "isInMiBFuturesExperiment", "", "hasMultipleRhsAccounts", "futuresAllowedRhsAccount", "Lcom/robinhood/models/db/Account;", "<init>", "(ZZLcom/robinhood/models/db/Account;)V", "()Z", "getHasMultipleRhsAccounts", "getFuturesAllowedRhsAccount", "()Lcom/robinhood/models/db/Account;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MiBFuturesState {
    private final Account futuresAllowedRhsAccount;
    private final boolean hasMultipleRhsAccounts;
    private final boolean isInMiBFuturesExperiment;

    public static /* synthetic */ MiBFuturesState copy$default(MiBFuturesState miBFuturesState, boolean z, boolean z2, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            z = miBFuturesState.isInMiBFuturesExperiment;
        }
        if ((i & 2) != 0) {
            z2 = miBFuturesState.hasMultipleRhsAccounts;
        }
        if ((i & 4) != 0) {
            account = miBFuturesState.futuresAllowedRhsAccount;
        }
        return miBFuturesState.copy(z, z2, account);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsInMiBFuturesExperiment() {
        return this.isInMiBFuturesExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMultipleRhsAccounts() {
        return this.hasMultipleRhsAccounts;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getFuturesAllowedRhsAccount() {
        return this.futuresAllowedRhsAccount;
    }

    public final MiBFuturesState copy(boolean isInMiBFuturesExperiment, boolean hasMultipleRhsAccounts, Account futuresAllowedRhsAccount) {
        return new MiBFuturesState(isInMiBFuturesExperiment, hasMultipleRhsAccounts, futuresAllowedRhsAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiBFuturesState)) {
            return false;
        }
        MiBFuturesState miBFuturesState = (MiBFuturesState) other;
        return this.isInMiBFuturesExperiment == miBFuturesState.isInMiBFuturesExperiment && this.hasMultipleRhsAccounts == miBFuturesState.hasMultipleRhsAccounts && Intrinsics.areEqual(this.futuresAllowedRhsAccount, miBFuturesState.futuresAllowedRhsAccount);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isInMiBFuturesExperiment) * 31) + Boolean.hashCode(this.hasMultipleRhsAccounts)) * 31;
        Account account = this.futuresAllowedRhsAccount;
        return iHashCode + (account == null ? 0 : account.hashCode());
    }

    public String toString() {
        return "MiBFuturesState(isInMiBFuturesExperiment=" + this.isInMiBFuturesExperiment + ", hasMultipleRhsAccounts=" + this.hasMultipleRhsAccounts + ", futuresAllowedRhsAccount=" + this.futuresAllowedRhsAccount + ")";
    }

    public MiBFuturesState(boolean z, boolean z2, Account account) {
        this.isInMiBFuturesExperiment = z;
        this.hasMultipleRhsAccounts = z2;
        this.futuresAllowedRhsAccount = account;
    }

    public final boolean isInMiBFuturesExperiment() {
        return this.isInMiBFuturesExperiment;
    }

    public final boolean getHasMultipleRhsAccounts() {
        return this.hasMultipleRhsAccounts;
    }

    public final Account getFuturesAllowedRhsAccount() {
        return this.futuresAllowedRhsAccount;
    }
}
