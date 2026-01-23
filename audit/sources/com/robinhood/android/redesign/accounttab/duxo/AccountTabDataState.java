package com.robinhood.android.redesign.accounttab.duxo;

import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013HÆ\u0003J\t\u0010<\u001a\u00020\u0017HÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J½\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\rHÆ\u0001J\u0013\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDataState;", "", "individualTabInfo", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "otherIndividualTabInfoList", "", "managedTabInfoList", "retirementIraTabInfo", "retirementRothTabInfo", "spendingTabInfo", "jointTabInfo", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "hasPrivacy", "", "loading", "userHasNoBrokerageAccounts", "pendingDeeplinkRequest", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "preferredAccountOrder", "", "", "", "newUserExperienceStage", "Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "showSubtitles", "<init>", "(Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;ZZZLcom/robinhood/shared/home/contracts/TabLinkIntentKey;Ljava/util/Map;Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;Z)V", "getIndividualTabInfo", "()Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "getOtherIndividualTabInfoList", "()Ljava/util/List;", "getManagedTabInfoList", "getRetirementIraTabInfo", "getRetirementRothTabInfo", "getSpendingTabInfo", "getJointTabInfo", "()Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "getHasPrivacy", "()Z", "getLoading", "getUserHasNoBrokerageAccounts", "getPendingDeeplinkRequest", "()Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "getPreferredAccountOrder", "()Ljava/util/Map;", "getNewUserExperienceStage", "()Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "getShowSubtitles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountTabDataState {
    public static final int $stable = 8;
    private final boolean hasPrivacy;
    private final AccountTabInfo.Account individualTabInfo;
    private final AccountTabInfo jointTabInfo;
    private final boolean loading;
    private final List<AccountTabInfo.Account> managedTabInfoList;
    private final NewUserExperienceStage newUserExperienceStage;
    private final List<AccountTabInfo.Account> otherIndividualTabInfoList;
    private final TabLinkIntentKey pendingDeeplinkRequest;
    private final Map<String, Long> preferredAccountOrder;
    private final AccountTabInfo.Account retirementIraTabInfo;
    private final AccountTabInfo.Account retirementRothTabInfo;
    private final boolean showSubtitles;
    private final AccountTabInfo.Account spendingTabInfo;
    private final boolean userHasNoBrokerageAccounts;

    public AccountTabDataState() {
        this(null, null, null, null, null, null, null, false, false, false, null, null, null, false, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountTabInfo.Account getIndividualTabInfo() {
        return this.individualTabInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getUserHasNoBrokerageAccounts() {
        return this.userHasNoBrokerageAccounts;
    }

    /* renamed from: component11, reason: from getter */
    public final TabLinkIntentKey getPendingDeeplinkRequest() {
        return this.pendingDeeplinkRequest;
    }

    public final Map<String, Long> component12() {
        return this.preferredAccountOrder;
    }

    /* renamed from: component13, reason: from getter */
    public final NewUserExperienceStage getNewUserExperienceStage() {
        return this.newUserExperienceStage;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowSubtitles() {
        return this.showSubtitles;
    }

    public final List<AccountTabInfo.Account> component2() {
        return this.otherIndividualTabInfoList;
    }

    public final List<AccountTabInfo.Account> component3() {
        return this.managedTabInfoList;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountTabInfo.Account getRetirementIraTabInfo() {
        return this.retirementIraTabInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final AccountTabInfo.Account getRetirementRothTabInfo() {
        return this.retirementRothTabInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final AccountTabInfo.Account getSpendingTabInfo() {
        return this.spendingTabInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final AccountTabInfo getJointTabInfo() {
        return this.jointTabInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final AccountTabDataState copy(AccountTabInfo.Account individualTabInfo, List<AccountTabInfo.Account> otherIndividualTabInfoList, List<AccountTabInfo.Account> managedTabInfoList, AccountTabInfo.Account retirementIraTabInfo, AccountTabInfo.Account retirementRothTabInfo, AccountTabInfo.Account spendingTabInfo, AccountTabInfo jointTabInfo, boolean hasPrivacy, boolean loading, boolean userHasNoBrokerageAccounts, TabLinkIntentKey pendingDeeplinkRequest, Map<String, Long> preferredAccountOrder, NewUserExperienceStage newUserExperienceStage, boolean showSubtitles) {
        Intrinsics.checkNotNullParameter(preferredAccountOrder, "preferredAccountOrder");
        Intrinsics.checkNotNullParameter(newUserExperienceStage, "newUserExperienceStage");
        return new AccountTabDataState(individualTabInfo, otherIndividualTabInfoList, managedTabInfoList, retirementIraTabInfo, retirementRothTabInfo, spendingTabInfo, jointTabInfo, hasPrivacy, loading, userHasNoBrokerageAccounts, pendingDeeplinkRequest, preferredAccountOrder, newUserExperienceStage, showSubtitles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTabDataState)) {
            return false;
        }
        AccountTabDataState accountTabDataState = (AccountTabDataState) other;
        return Intrinsics.areEqual(this.individualTabInfo, accountTabDataState.individualTabInfo) && Intrinsics.areEqual(this.otherIndividualTabInfoList, accountTabDataState.otherIndividualTabInfoList) && Intrinsics.areEqual(this.managedTabInfoList, accountTabDataState.managedTabInfoList) && Intrinsics.areEqual(this.retirementIraTabInfo, accountTabDataState.retirementIraTabInfo) && Intrinsics.areEqual(this.retirementRothTabInfo, accountTabDataState.retirementRothTabInfo) && Intrinsics.areEqual(this.spendingTabInfo, accountTabDataState.spendingTabInfo) && Intrinsics.areEqual(this.jointTabInfo, accountTabDataState.jointTabInfo) && this.hasPrivacy == accountTabDataState.hasPrivacy && this.loading == accountTabDataState.loading && this.userHasNoBrokerageAccounts == accountTabDataState.userHasNoBrokerageAccounts && Intrinsics.areEqual(this.pendingDeeplinkRequest, accountTabDataState.pendingDeeplinkRequest) && Intrinsics.areEqual(this.preferredAccountOrder, accountTabDataState.preferredAccountOrder) && this.newUserExperienceStage == accountTabDataState.newUserExperienceStage && this.showSubtitles == accountTabDataState.showSubtitles;
    }

    public int hashCode() {
        AccountTabInfo.Account account = this.individualTabInfo;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        List<AccountTabInfo.Account> list = this.otherIndividualTabInfoList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AccountTabInfo.Account> list2 = this.managedTabInfoList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AccountTabInfo.Account account2 = this.retirementIraTabInfo;
        int iHashCode4 = (iHashCode3 + (account2 == null ? 0 : account2.hashCode())) * 31;
        AccountTabInfo.Account account3 = this.retirementRothTabInfo;
        int iHashCode5 = (iHashCode4 + (account3 == null ? 0 : account3.hashCode())) * 31;
        AccountTabInfo.Account account4 = this.spendingTabInfo;
        int iHashCode6 = (iHashCode5 + (account4 == null ? 0 : account4.hashCode())) * 31;
        AccountTabInfo accountTabInfo = this.jointTabInfo;
        int iHashCode7 = (((((((iHashCode6 + (accountTabInfo == null ? 0 : accountTabInfo.hashCode())) * 31) + Boolean.hashCode(this.hasPrivacy)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.userHasNoBrokerageAccounts)) * 31;
        TabLinkIntentKey tabLinkIntentKey = this.pendingDeeplinkRequest;
        return ((((((iHashCode7 + (tabLinkIntentKey != null ? tabLinkIntentKey.hashCode() : 0)) * 31) + this.preferredAccountOrder.hashCode()) * 31) + this.newUserExperienceStage.hashCode()) * 31) + Boolean.hashCode(this.showSubtitles);
    }

    public String toString() {
        return "AccountTabDataState(individualTabInfo=" + this.individualTabInfo + ", otherIndividualTabInfoList=" + this.otherIndividualTabInfoList + ", managedTabInfoList=" + this.managedTabInfoList + ", retirementIraTabInfo=" + this.retirementIraTabInfo + ", retirementRothTabInfo=" + this.retirementRothTabInfo + ", spendingTabInfo=" + this.spendingTabInfo + ", jointTabInfo=" + this.jointTabInfo + ", hasPrivacy=" + this.hasPrivacy + ", loading=" + this.loading + ", userHasNoBrokerageAccounts=" + this.userHasNoBrokerageAccounts + ", pendingDeeplinkRequest=" + this.pendingDeeplinkRequest + ", preferredAccountOrder=" + this.preferredAccountOrder + ", newUserExperienceStage=" + this.newUserExperienceStage + ", showSubtitles=" + this.showSubtitles + ")";
    }

    public AccountTabDataState(AccountTabInfo.Account account, List<AccountTabInfo.Account> list, List<AccountTabInfo.Account> list2, AccountTabInfo.Account account2, AccountTabInfo.Account account3, AccountTabInfo.Account account4, AccountTabInfo accountTabInfo, boolean z, boolean z2, boolean z3, TabLinkIntentKey tabLinkIntentKey, Map<String, Long> preferredAccountOrder, NewUserExperienceStage newUserExperienceStage, boolean z4) {
        Intrinsics.checkNotNullParameter(preferredAccountOrder, "preferredAccountOrder");
        Intrinsics.checkNotNullParameter(newUserExperienceStage, "newUserExperienceStage");
        this.individualTabInfo = account;
        this.otherIndividualTabInfoList = list;
        this.managedTabInfoList = list2;
        this.retirementIraTabInfo = account2;
        this.retirementRothTabInfo = account3;
        this.spendingTabInfo = account4;
        this.jointTabInfo = accountTabInfo;
        this.hasPrivacy = z;
        this.loading = z2;
        this.userHasNoBrokerageAccounts = z3;
        this.pendingDeeplinkRequest = tabLinkIntentKey;
        this.preferredAccountOrder = preferredAccountOrder;
        this.newUserExperienceStage = newUserExperienceStage;
        this.showSubtitles = z4;
    }

    public final AccountTabInfo.Account getIndividualTabInfo() {
        return this.individualTabInfo;
    }

    public final List<AccountTabInfo.Account> getOtherIndividualTabInfoList() {
        return this.otherIndividualTabInfoList;
    }

    public final List<AccountTabInfo.Account> getManagedTabInfoList() {
        return this.managedTabInfoList;
    }

    public final AccountTabInfo.Account getRetirementIraTabInfo() {
        return this.retirementIraTabInfo;
    }

    public final AccountTabInfo.Account getRetirementRothTabInfo() {
        return this.retirementRothTabInfo;
    }

    public final AccountTabInfo.Account getSpendingTabInfo() {
        return this.spendingTabInfo;
    }

    public final AccountTabInfo getJointTabInfo() {
        return this.jointTabInfo;
    }

    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getUserHasNoBrokerageAccounts() {
        return this.userHasNoBrokerageAccounts;
    }

    public final TabLinkIntentKey getPendingDeeplinkRequest() {
        return this.pendingDeeplinkRequest;
    }

    public /* synthetic */ AccountTabDataState(AccountTabInfo.Account account, List list, List list2, AccountTabInfo.Account account2, AccountTabInfo.Account account3, AccountTabInfo.Account account4, AccountTabInfo accountTabInfo, boolean z, boolean z2, boolean z3, TabLinkIntentKey tabLinkIntentKey, Map map, NewUserExperienceStage newUserExperienceStage, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : account2, (i & 16) != 0 ? null : account3, (i & 32) != 0 ? null : account4, (i & 64) != 0 ? null : accountTabInfo, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? false : z3, (i & 1024) == 0 ? tabLinkIntentKey : null, (i & 2048) != 0 ? MapsKt.emptyMap() : map, (i & 4096) != 0 ? NewUserExperienceStage.PENDING : newUserExperienceStage, (i & 8192) != 0 ? false : z4);
    }

    public final Map<String, Long> getPreferredAccountOrder() {
        return this.preferredAccountOrder;
    }

    public final NewUserExperienceStage getNewUserExperienceStage() {
        return this.newUserExperienceStage;
    }

    public final boolean getShowSubtitles() {
        return this.showSubtitles;
    }
}
