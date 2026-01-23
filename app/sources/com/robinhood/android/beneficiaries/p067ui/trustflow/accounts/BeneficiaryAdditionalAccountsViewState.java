package com.robinhood.android.beneficiaries.p067ui.trustflow.accounts;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: BeneficiaryAdditionalAccountsViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState;", "", "title", "", "subtitleMarkdown", "accountRowItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState$AccountRowData;", "selectedAccounts", "Lkotlinx/collections/immutable/ImmutableSet;", "isLoading", "", "additionalAgreements", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableSet;ZLkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getAccountRowItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedAccounts", "()Lkotlinx/collections/immutable/ImmutableSet;", "()Z", "getAdditionalAgreements", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "AccountRowData", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryAdditionalAccountsViewState {
    public static final int $stable = 8;
    private final ImmutableList<AccountRowData> accountRowItems;
    private final ImmutableList<ApiBeneficiaryAgreementViewModel> additionalAgreements;
    private final boolean isLoading;
    private final ImmutableSet<String> selectedAccounts;
    private final String subtitleMarkdown;
    private final String title;

    public BeneficiaryAdditionalAccountsViewState() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ BeneficiaryAdditionalAccountsViewState copy$default(BeneficiaryAdditionalAccountsViewState beneficiaryAdditionalAccountsViewState, String str, String str2, ImmutableList immutableList, ImmutableSet immutableSet, boolean z, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryAdditionalAccountsViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryAdditionalAccountsViewState.subtitleMarkdown;
        }
        if ((i & 4) != 0) {
            immutableList = beneficiaryAdditionalAccountsViewState.accountRowItems;
        }
        if ((i & 8) != 0) {
            immutableSet = beneficiaryAdditionalAccountsViewState.selectedAccounts;
        }
        if ((i & 16) != 0) {
            z = beneficiaryAdditionalAccountsViewState.isLoading;
        }
        if ((i & 32) != 0) {
            immutableList2 = beneficiaryAdditionalAccountsViewState.additionalAgreements;
        }
        boolean z2 = z;
        ImmutableList immutableList3 = immutableList2;
        return beneficiaryAdditionalAccountsViewState.copy(str, str2, immutableList, immutableSet, z2, immutableList3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final ImmutableList<AccountRowData> component3() {
        return this.accountRowItems;
    }

    public final ImmutableSet<String> component4() {
        return this.selectedAccounts;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<ApiBeneficiaryAgreementViewModel> component6() {
        return this.additionalAgreements;
    }

    public final BeneficiaryAdditionalAccountsViewState copy(String title, String subtitleMarkdown, ImmutableList<AccountRowData> accountRowItems, ImmutableSet<String> selectedAccounts, boolean isLoading, ImmutableList<ApiBeneficiaryAgreementViewModel> additionalAgreements) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accountRowItems, "accountRowItems");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        return new BeneficiaryAdditionalAccountsViewState(title, subtitleMarkdown, accountRowItems, selectedAccounts, isLoading, additionalAgreements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryAdditionalAccountsViewState)) {
            return false;
        }
        BeneficiaryAdditionalAccountsViewState beneficiaryAdditionalAccountsViewState = (BeneficiaryAdditionalAccountsViewState) other;
        return Intrinsics.areEqual(this.title, beneficiaryAdditionalAccountsViewState.title) && Intrinsics.areEqual(this.subtitleMarkdown, beneficiaryAdditionalAccountsViewState.subtitleMarkdown) && Intrinsics.areEqual(this.accountRowItems, beneficiaryAdditionalAccountsViewState.accountRowItems) && Intrinsics.areEqual(this.selectedAccounts, beneficiaryAdditionalAccountsViewState.selectedAccounts) && this.isLoading == beneficiaryAdditionalAccountsViewState.isLoading && Intrinsics.areEqual(this.additionalAgreements, beneficiaryAdditionalAccountsViewState.additionalAgreements);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitleMarkdown;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accountRowItems.hashCode()) * 31) + this.selectedAccounts.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        ImmutableList<ApiBeneficiaryAgreementViewModel> immutableList = this.additionalAgreements;
        return iHashCode2 + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryAdditionalAccountsViewState(title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", accountRowItems=" + this.accountRowItems + ", selectedAccounts=" + this.selectedAccounts + ", isLoading=" + this.isLoading + ", additionalAgreements=" + this.additionalAgreements + ")";
    }

    public BeneficiaryAdditionalAccountsViewState(String title, String str, ImmutableList<AccountRowData> accountRowItems, ImmutableSet<String> selectedAccounts, boolean z, ImmutableList<ApiBeneficiaryAgreementViewModel> immutableList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accountRowItems, "accountRowItems");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        this.title = title;
        this.subtitleMarkdown = str;
        this.accountRowItems = accountRowItems;
        this.selectedAccounts = selectedAccounts;
        this.isLoading = z;
        this.additionalAgreements = immutableList;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BeneficiaryAdditionalAccountsViewState(java.lang.String r2, java.lang.String r3, kotlinx.collections.immutable.ImmutableList r4, kotlinx.collections.immutable.ImmutableSet r5, boolean r6, kotlinx.collections.immutable.ImmutableList r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L14
            kotlinx.collections.immutable.PersistentList r4 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L14:
            r9 = r8 & 8
            if (r9 == 0) goto L1c
            kotlinx.collections.immutable.PersistentSet r5 = kotlinx.collections.immutable.extensions2.persistentSetOf()
        L1c:
            r9 = r8 & 16
            if (r9 == 0) goto L21
            r6 = 0
        L21:
            r8 = r8 & 32
            if (r8 == 0) goto L2d
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L34
        L2d:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L34:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.beneficiaries.p067ui.trustflow.accounts.BeneficiaryAdditionalAccountsViewState.<init>(java.lang.String, java.lang.String, kotlinx.collections.immutable.ImmutableList, kotlinx.collections.immutable.ImmutableSet, boolean, kotlinx.collections.immutable.ImmutableList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final ImmutableList<AccountRowData> getAccountRowItems() {
        return this.accountRowItems;
    }

    public final ImmutableSet<String> getSelectedAccounts() {
        return this.selectedAccounts;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ImmutableList<ApiBeneficiaryAgreementViewModel> getAdditionalAgreements() {
        return this.additionalAgreements;
    }

    /* compiled from: BeneficiaryAdditionalAccountsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState$AccountRowData;", "", "account", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;", "isSelected", "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;Z)V", "getAccount", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountRowData {
        public static final int $stable = 8;
        private final ApiCreateBeneficiaryAccountRow account;
        private final boolean isSelected;

        public static /* synthetic */ AccountRowData copy$default(AccountRowData accountRowData, ApiCreateBeneficiaryAccountRow apiCreateBeneficiaryAccountRow, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateBeneficiaryAccountRow = accountRowData.account;
            }
            if ((i & 2) != 0) {
                z = accountRowData.isSelected;
            }
            return accountRowData.copy(apiCreateBeneficiaryAccountRow, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateBeneficiaryAccountRow getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final AccountRowData copy(ApiCreateBeneficiaryAccountRow account, boolean isSelected) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new AccountRowData(account, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountRowData)) {
                return false;
            }
            AccountRowData accountRowData = (AccountRowData) other;
            return Intrinsics.areEqual(this.account, accountRowData.account) && this.isSelected == accountRowData.isSelected;
        }

        public int hashCode() {
            return (this.account.hashCode() * 31) + Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return "AccountRowData(account=" + this.account + ", isSelected=" + this.isSelected + ")";
        }

        public AccountRowData(ApiCreateBeneficiaryAccountRow account, boolean z) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.isSelected = z;
        }

        public final ApiCreateBeneficiaryAccountRow getAccount() {
            return this.account;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }
    }
}
