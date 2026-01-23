package com.robinhood.android.redesign.accounttab.duxo;

import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabTarget;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: AccountTabViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0013HÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\u008f\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\fHÆ\u0001J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\nHÖ\u0001J\t\u00105\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0014\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001e¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/duxo/AccountSelectorViewState;", "", "allTabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "accountTabs", "upsellTabs", "tabInfoIndexMap", "Lkotlinx/collections/immutable/ImmutableMap;", "", "", "hasPrivacy", "", "accountsLoading", "deeplinkTarget", "Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabTarget;", "nuxTab", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Nux;", "newUserExperienceStage", "Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "showSubtitles", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableMap;ZZLcom/robinhood/android/redesign/accounttab/deeplink/AccountTabTarget;Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Nux;Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;Z)V", "getAllTabs", "()Lkotlinx/collections/immutable/ImmutableList;", "getAccountTabs", "getUpsellTabs", "getTabInfoIndexMap", "()Lkotlinx/collections/immutable/ImmutableMap;", "getHasPrivacy", "()Z", "getAccountsLoading", "getDeeplinkTarget", "()Lcom/robinhood/android/redesign/accounttab/deeplink/AccountTabTarget;", "getNuxTab", "()Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Nux;", "getNewUserExperienceStage", "()Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "getShowSubtitles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountSelectorViewState {
    public static final int $stable = 8;
    private final ImmutableList<AccountTabInfo.Account> accountTabs;
    private final boolean accountsLoading;
    private final ImmutableList<AccountTabInfo.Account> allTabs;
    private final AccountTabTarget deeplinkTarget;
    private final boolean hasPrivacy;
    private final NewUserExperienceStage newUserExperienceStage;
    private final AccountTabInfo.Nux nuxTab;
    private final boolean showSubtitles;
    private final ImmutableMap<String, Integer> tabInfoIndexMap;
    private final ImmutableList<AccountTabInfo.Account> upsellTabs;

    public static /* synthetic */ AccountSelectorViewState copy$default(AccountSelectorViewState accountSelectorViewState, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableMap immutableMap, boolean z, boolean z2, AccountTabTarget accountTabTarget, AccountTabInfo.Nux nux, NewUserExperienceStage newUserExperienceStage, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = accountSelectorViewState.allTabs;
        }
        if ((i & 2) != 0) {
            immutableList2 = accountSelectorViewState.accountTabs;
        }
        if ((i & 4) != 0) {
            immutableList3 = accountSelectorViewState.upsellTabs;
        }
        if ((i & 8) != 0) {
            immutableMap = accountSelectorViewState.tabInfoIndexMap;
        }
        if ((i & 16) != 0) {
            z = accountSelectorViewState.hasPrivacy;
        }
        if ((i & 32) != 0) {
            z2 = accountSelectorViewState.accountsLoading;
        }
        if ((i & 64) != 0) {
            accountTabTarget = accountSelectorViewState.deeplinkTarget;
        }
        if ((i & 128) != 0) {
            nux = accountSelectorViewState.nuxTab;
        }
        if ((i & 256) != 0) {
            newUserExperienceStage = accountSelectorViewState.newUserExperienceStage;
        }
        if ((i & 512) != 0) {
            z3 = accountSelectorViewState.showSubtitles;
        }
        NewUserExperienceStage newUserExperienceStage2 = newUserExperienceStage;
        boolean z4 = z3;
        AccountTabTarget accountTabTarget2 = accountTabTarget;
        AccountTabInfo.Nux nux2 = nux;
        boolean z5 = z;
        boolean z6 = z2;
        return accountSelectorViewState.copy(immutableList, immutableList2, immutableList3, immutableMap, z5, z6, accountTabTarget2, nux2, newUserExperienceStage2, z4);
    }

    public final ImmutableList<AccountTabInfo.Account> component1() {
        return this.allTabs;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowSubtitles() {
        return this.showSubtitles;
    }

    public final ImmutableList<AccountTabInfo.Account> component2() {
        return this.accountTabs;
    }

    public final ImmutableList<AccountTabInfo.Account> component3() {
        return this.upsellTabs;
    }

    public final ImmutableMap<String, Integer> component4() {
        return this.tabInfoIndexMap;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAccountsLoading() {
        return this.accountsLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final AccountTabTarget getDeeplinkTarget() {
        return this.deeplinkTarget;
    }

    /* renamed from: component8, reason: from getter */
    public final AccountTabInfo.Nux getNuxTab() {
        return this.nuxTab;
    }

    /* renamed from: component9, reason: from getter */
    public final NewUserExperienceStage getNewUserExperienceStage() {
        return this.newUserExperienceStage;
    }

    public final AccountSelectorViewState copy(ImmutableList<AccountTabInfo.Account> allTabs, ImmutableList<AccountTabInfo.Account> accountTabs, ImmutableList<AccountTabInfo.Account> upsellTabs, ImmutableMap<String, Integer> tabInfoIndexMap, boolean hasPrivacy, boolean accountsLoading, AccountTabTarget deeplinkTarget, AccountTabInfo.Nux nuxTab, NewUserExperienceStage newUserExperienceStage, boolean showSubtitles) {
        Intrinsics.checkNotNullParameter(allTabs, "allTabs");
        Intrinsics.checkNotNullParameter(accountTabs, "accountTabs");
        Intrinsics.checkNotNullParameter(upsellTabs, "upsellTabs");
        Intrinsics.checkNotNullParameter(tabInfoIndexMap, "tabInfoIndexMap");
        Intrinsics.checkNotNullParameter(newUserExperienceStage, "newUserExperienceStage");
        return new AccountSelectorViewState(allTabs, accountTabs, upsellTabs, tabInfoIndexMap, hasPrivacy, accountsLoading, deeplinkTarget, nuxTab, newUserExperienceStage, showSubtitles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectorViewState)) {
            return false;
        }
        AccountSelectorViewState accountSelectorViewState = (AccountSelectorViewState) other;
        return Intrinsics.areEqual(this.allTabs, accountSelectorViewState.allTabs) && Intrinsics.areEqual(this.accountTabs, accountSelectorViewState.accountTabs) && Intrinsics.areEqual(this.upsellTabs, accountSelectorViewState.upsellTabs) && Intrinsics.areEqual(this.tabInfoIndexMap, accountSelectorViewState.tabInfoIndexMap) && this.hasPrivacy == accountSelectorViewState.hasPrivacy && this.accountsLoading == accountSelectorViewState.accountsLoading && Intrinsics.areEqual(this.deeplinkTarget, accountSelectorViewState.deeplinkTarget) && Intrinsics.areEqual(this.nuxTab, accountSelectorViewState.nuxTab) && this.newUserExperienceStage == accountSelectorViewState.newUserExperienceStage && this.showSubtitles == accountSelectorViewState.showSubtitles;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.allTabs.hashCode() * 31) + this.accountTabs.hashCode()) * 31) + this.upsellTabs.hashCode()) * 31) + this.tabInfoIndexMap.hashCode()) * 31) + Boolean.hashCode(this.hasPrivacy)) * 31) + Boolean.hashCode(this.accountsLoading)) * 31;
        AccountTabTarget accountTabTarget = this.deeplinkTarget;
        int iHashCode2 = (iHashCode + (accountTabTarget == null ? 0 : accountTabTarget.hashCode())) * 31;
        AccountTabInfo.Nux nux = this.nuxTab;
        return ((((iHashCode2 + (nux != null ? nux.hashCode() : 0)) * 31) + this.newUserExperienceStage.hashCode()) * 31) + Boolean.hashCode(this.showSubtitles);
    }

    public String toString() {
        return "AccountSelectorViewState(allTabs=" + this.allTabs + ", accountTabs=" + this.accountTabs + ", upsellTabs=" + this.upsellTabs + ", tabInfoIndexMap=" + this.tabInfoIndexMap + ", hasPrivacy=" + this.hasPrivacy + ", accountsLoading=" + this.accountsLoading + ", deeplinkTarget=" + this.deeplinkTarget + ", nuxTab=" + this.nuxTab + ", newUserExperienceStage=" + this.newUserExperienceStage + ", showSubtitles=" + this.showSubtitles + ")";
    }

    public AccountSelectorViewState(ImmutableList<AccountTabInfo.Account> allTabs, ImmutableList<AccountTabInfo.Account> accountTabs, ImmutableList<AccountTabInfo.Account> upsellTabs, ImmutableMap<String, Integer> tabInfoIndexMap, boolean z, boolean z2, AccountTabTarget accountTabTarget, AccountTabInfo.Nux nux, NewUserExperienceStage newUserExperienceStage, boolean z3) {
        Intrinsics.checkNotNullParameter(allTabs, "allTabs");
        Intrinsics.checkNotNullParameter(accountTabs, "accountTabs");
        Intrinsics.checkNotNullParameter(upsellTabs, "upsellTabs");
        Intrinsics.checkNotNullParameter(tabInfoIndexMap, "tabInfoIndexMap");
        Intrinsics.checkNotNullParameter(newUserExperienceStage, "newUserExperienceStage");
        this.allTabs = allTabs;
        this.accountTabs = accountTabs;
        this.upsellTabs = upsellTabs;
        this.tabInfoIndexMap = tabInfoIndexMap;
        this.hasPrivacy = z;
        this.accountsLoading = z2;
        this.deeplinkTarget = accountTabTarget;
        this.nuxTab = nux;
        this.newUserExperienceStage = newUserExperienceStage;
        this.showSubtitles = z3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccountSelectorViewState(kotlinx.collections.immutable.ImmutableList r2, kotlinx.collections.immutable.ImmutableList r3, kotlinx.collections.immutable.ImmutableList r4, kotlinx.collections.immutable.ImmutableMap r5, boolean r6, boolean r7, com.robinhood.android.redesign.accounttab.deeplink.AccountTabTarget r8, com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo.Nux r9, com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L8
            kotlinx.collections.immutable.PersistentList r2 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L8:
            r13 = r12 & 2
            if (r13 == 0) goto L10
            kotlinx.collections.immutable.PersistentList r3 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L10:
            r13 = r12 & 4
            if (r13 == 0) goto L18
            kotlinx.collections.immutable.PersistentList r4 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L18:
            r13 = r12 & 64
            r0 = 0
            if (r13 == 0) goto L1e
            r8 = r0
        L1e:
            r12 = r12 & 128(0x80, float:1.794E-43)
            r13 = r11
            if (r12 == 0) goto L2e
            r11 = r0
            r9 = r7
            r12 = r10
            r7 = r5
            r10 = r8
            r5 = r3
            r8 = r6
            r3 = r1
            r6 = r4
            r4 = r2
            goto L38
        L2e:
            r11 = r9
            r12 = r10
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.redesign.accounttab.duxo.AccountSelectorViewState.<init>(kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableMap, boolean, boolean, com.robinhood.android.redesign.accounttab.deeplink.AccountTabTarget, com.robinhood.android.redesign.accounttab.duxo.TabInfo$Nux, com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImmutableList<AccountTabInfo.Account> getAllTabs() {
        return this.allTabs;
    }

    public final ImmutableList<AccountTabInfo.Account> getAccountTabs() {
        return this.accountTabs;
    }

    public final ImmutableList<AccountTabInfo.Account> getUpsellTabs() {
        return this.upsellTabs;
    }

    public final ImmutableMap<String, Integer> getTabInfoIndexMap() {
        return this.tabInfoIndexMap;
    }

    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    public final boolean getAccountsLoading() {
        return this.accountsLoading;
    }

    public final AccountTabTarget getDeeplinkTarget() {
        return this.deeplinkTarget;
    }

    public final AccountTabInfo.Nux getNuxTab() {
        return this.nuxTab;
    }

    public final NewUserExperienceStage getNewUserExperienceStage() {
        return this.newUserExperienceStage;
    }

    public final boolean getShowSubtitles() {
        return this.showSubtitles;
    }
}
