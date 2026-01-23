package com.robinhood.android.retirement.contributions;

import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/AccountSelectionData;", "", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "contributionSink", "Lcom/robinhood/android/retirement/contributions/ContributionSink;", "accounts", "", "matchRateTypeOverride", "Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/retirement/contributions/ContributionSink;Ljava/util/List;Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;)V", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getContributionSink", "()Lcom/robinhood/android/retirement/contributions/ContributionSink;", "getAccounts", "()Ljava/util/List;", "getMatchRateTypeOverride", "()Lcom/robinhood/android/models/retirement/api/MatchBreakdownType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountSelectionData {
    public static final int $stable = 8;
    private final List<TransferAccount> accounts;
    private final ContributionSink contributionSink;
    private final ApiRetirementMatchResponse3 matchRateTypeOverride;
    private final TransferAccount sourceAccount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountSelectionData copy$default(AccountSelectionData accountSelectionData, TransferAccount transferAccount, ContributionSink contributionSink, List list, ApiRetirementMatchResponse3 apiRetirementMatchResponse3, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccount = accountSelectionData.sourceAccount;
        }
        if ((i & 2) != 0) {
            contributionSink = accountSelectionData.contributionSink;
        }
        if ((i & 4) != 0) {
            list = accountSelectionData.accounts;
        }
        if ((i & 8) != 0) {
            apiRetirementMatchResponse3 = accountSelectionData.matchRateTypeOverride;
        }
        return accountSelectionData.copy(transferAccount, contributionSink, list, apiRetirementMatchResponse3);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final ContributionSink getContributionSink() {
        return this.contributionSink;
    }

    public final List<TransferAccount> component3() {
        return this.accounts;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiRetirementMatchResponse3 getMatchRateTypeOverride() {
        return this.matchRateTypeOverride;
    }

    public final AccountSelectionData copy(TransferAccount sourceAccount, ContributionSink contributionSink, List<TransferAccount> accounts2, ApiRetirementMatchResponse3 matchRateTypeOverride) {
        Intrinsics.checkNotNullParameter(contributionSink, "contributionSink");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        return new AccountSelectionData(sourceAccount, contributionSink, accounts2, matchRateTypeOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectionData)) {
            return false;
        }
        AccountSelectionData accountSelectionData = (AccountSelectionData) other;
        return Intrinsics.areEqual(this.sourceAccount, accountSelectionData.sourceAccount) && Intrinsics.areEqual(this.contributionSink, accountSelectionData.contributionSink) && Intrinsics.areEqual(this.accounts, accountSelectionData.accounts) && this.matchRateTypeOverride == accountSelectionData.matchRateTypeOverride;
    }

    public int hashCode() {
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode = (((((transferAccount == null ? 0 : transferAccount.hashCode()) * 31) + this.contributionSink.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        ApiRetirementMatchResponse3 apiRetirementMatchResponse3 = this.matchRateTypeOverride;
        return iHashCode + (apiRetirementMatchResponse3 != null ? apiRetirementMatchResponse3.hashCode() : 0);
    }

    public String toString() {
        return "AccountSelectionData(sourceAccount=" + this.sourceAccount + ", contributionSink=" + this.contributionSink + ", accounts=" + this.accounts + ", matchRateTypeOverride=" + this.matchRateTypeOverride + ")";
    }

    public AccountSelectionData(TransferAccount transferAccount, ContributionSink contributionSink, List<TransferAccount> accounts2, ApiRetirementMatchResponse3 apiRetirementMatchResponse3) {
        Intrinsics.checkNotNullParameter(contributionSink, "contributionSink");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        this.sourceAccount = transferAccount;
        this.contributionSink = contributionSink;
        this.accounts = accounts2;
        this.matchRateTypeOverride = apiRetirementMatchResponse3;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final ContributionSink getContributionSink() {
        return this.contributionSink;
    }

    public final List<TransferAccount> getAccounts() {
        return this.accounts;
    }

    public final ApiRetirementMatchResponse3 getMatchRateTypeOverride() {
        return this.matchRateTypeOverride;
    }
}
