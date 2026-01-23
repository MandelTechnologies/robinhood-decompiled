package com.robinhood.android.isa.contributions;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionHubDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionHubDataState;", "", "contributions", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;", "selectedTaxYear", "", "account", "Lcom/robinhood/models/db/Account;", "promotion", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;", "<init>", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;Ljava/lang/Integer;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;)V", "getContributions", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;", "getSelectedTaxYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getPromotion", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;", "component1", "component2", "component3", "component4", "copy", "(Lcom/robinhood/android/isa/models/isa/db/entity/IsaContributions;Ljava/lang/Integer;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;)Lcom/robinhood/android/isa/contributions/IsaContributionHubDataState;", "equals", "", "other", "hashCode", "toString", "", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaContributionHubDataState {
    public static final int $stable = 8;
    private final Account account;
    private final IsaContributions contributions;
    private final IsaPromotion promotion;
    private final Integer selectedTaxYear;

    public IsaContributionHubDataState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IsaContributionHubDataState copy$default(IsaContributionHubDataState isaContributionHubDataState, IsaContributions isaContributions, Integer num, Account account, IsaPromotion isaPromotion, int i, Object obj) {
        if ((i & 1) != 0) {
            isaContributions = isaContributionHubDataState.contributions;
        }
        if ((i & 2) != 0) {
            num = isaContributionHubDataState.selectedTaxYear;
        }
        if ((i & 4) != 0) {
            account = isaContributionHubDataState.account;
        }
        if ((i & 8) != 0) {
            isaPromotion = isaContributionHubDataState.promotion;
        }
        return isaContributionHubDataState.copy(isaContributions, num, account, isaPromotion);
    }

    /* renamed from: component1, reason: from getter */
    public final IsaContributions getContributions() {
        return this.contributions;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSelectedTaxYear() {
        return this.selectedTaxYear;
    }

    /* renamed from: component3, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component4, reason: from getter */
    public final IsaPromotion getPromotion() {
        return this.promotion;
    }

    public final IsaContributionHubDataState copy(IsaContributions contributions, Integer selectedTaxYear, Account account, IsaPromotion promotion) {
        return new IsaContributionHubDataState(contributions, selectedTaxYear, account, promotion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaContributionHubDataState)) {
            return false;
        }
        IsaContributionHubDataState isaContributionHubDataState = (IsaContributionHubDataState) other;
        return Intrinsics.areEqual(this.contributions, isaContributionHubDataState.contributions) && Intrinsics.areEqual(this.selectedTaxYear, isaContributionHubDataState.selectedTaxYear) && Intrinsics.areEqual(this.account, isaContributionHubDataState.account) && Intrinsics.areEqual(this.promotion, isaContributionHubDataState.promotion);
    }

    public int hashCode() {
        IsaContributions isaContributions = this.contributions;
        int iHashCode = (isaContributions == null ? 0 : isaContributions.hashCode()) * 31;
        Integer num = this.selectedTaxYear;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Account account = this.account;
        int iHashCode3 = (iHashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        IsaPromotion isaPromotion = this.promotion;
        return iHashCode3 + (isaPromotion != null ? isaPromotion.hashCode() : 0);
    }

    public String toString() {
        return "IsaContributionHubDataState(contributions=" + this.contributions + ", selectedTaxYear=" + this.selectedTaxYear + ", account=" + this.account + ", promotion=" + this.promotion + ")";
    }

    public IsaContributionHubDataState(IsaContributions isaContributions, Integer num, Account account, IsaPromotion isaPromotion) {
        this.contributions = isaContributions;
        this.selectedTaxYear = num;
        this.account = account;
        this.promotion = isaPromotion;
    }

    public /* synthetic */ IsaContributionHubDataState(IsaContributions isaContributions, Integer num, Account account, IsaPromotion isaPromotion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : isaContributions, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : account, (i & 8) != 0 ? null : isaPromotion);
    }

    public final IsaContributions getContributions() {
        return this.contributions;
    }

    public final Integer getSelectedTaxYear() {
        return this.selectedTaxYear;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final IsaPromotion getPromotion() {
        return this.promotion;
    }
}
