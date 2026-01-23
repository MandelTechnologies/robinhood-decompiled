package com.robinhood.android.beneficiaries.p067ui.individualflow.accounts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import com.robinhood.udf.UiEvent;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateAdditionalAccountsViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState;", "", "title", "", "subtitleMarkdown", "accountRowItems", "", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState$AccountRowData;", "selectedAccounts", "", "isLoading", "", "additionalAgreements", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;ZLjava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getAccountRowItems", "()Ljava/util/List;", "getSelectedAccounts", "()Ljava/util/Set;", "()Z", "getAdditionalAgreements", "getError", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "AccountRowData", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryCreateAdditionalAccountsViewState {
    public static final int $stable = 8;
    private final List<AccountRowData> accountRowItems;
    private final List<ApiBeneficiaryAgreementViewModel> additionalAgreements;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;
    private final Set<String> selectedAccounts;
    private final String subtitleMarkdown;
    private final String title;

    public BeneficiaryCreateAdditionalAccountsViewState() {
        this(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ BeneficiaryCreateAdditionalAccountsViewState copy$default(BeneficiaryCreateAdditionalAccountsViewState beneficiaryCreateAdditionalAccountsViewState, String str, String str2, List list, Set set, boolean z, List list2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryCreateAdditionalAccountsViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryCreateAdditionalAccountsViewState.subtitleMarkdown;
        }
        if ((i & 4) != 0) {
            list = beneficiaryCreateAdditionalAccountsViewState.accountRowItems;
        }
        if ((i & 8) != 0) {
            set = beneficiaryCreateAdditionalAccountsViewState.selectedAccounts;
        }
        if ((i & 16) != 0) {
            z = beneficiaryCreateAdditionalAccountsViewState.isLoading;
        }
        if ((i & 32) != 0) {
            list2 = beneficiaryCreateAdditionalAccountsViewState.additionalAgreements;
        }
        if ((i & 64) != 0) {
            uiEvent = beneficiaryCreateAdditionalAccountsViewState.error;
        }
        List list3 = list2;
        UiEvent uiEvent2 = uiEvent;
        boolean z2 = z;
        List list4 = list;
        return beneficiaryCreateAdditionalAccountsViewState.copy(str, str2, list4, set, z2, list3, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<AccountRowData> component3() {
        return this.accountRowItems;
    }

    public final Set<String> component4() {
        return this.selectedAccounts;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<ApiBeneficiaryAgreementViewModel> component6() {
        return this.additionalAgreements;
    }

    public final UiEvent<Throwable> component7() {
        return this.error;
    }

    public final BeneficiaryCreateAdditionalAccountsViewState copy(String title, String subtitleMarkdown, List<AccountRowData> accountRowItems, Set<String> selectedAccounts, boolean isLoading, List<ApiBeneficiaryAgreementViewModel> additionalAgreements, UiEvent<Throwable> error) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accountRowItems, "accountRowItems");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        return new BeneficiaryCreateAdditionalAccountsViewState(title, subtitleMarkdown, accountRowItems, selectedAccounts, isLoading, additionalAgreements, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryCreateAdditionalAccountsViewState)) {
            return false;
        }
        BeneficiaryCreateAdditionalAccountsViewState beneficiaryCreateAdditionalAccountsViewState = (BeneficiaryCreateAdditionalAccountsViewState) other;
        return Intrinsics.areEqual(this.title, beneficiaryCreateAdditionalAccountsViewState.title) && Intrinsics.areEqual(this.subtitleMarkdown, beneficiaryCreateAdditionalAccountsViewState.subtitleMarkdown) && Intrinsics.areEqual(this.accountRowItems, beneficiaryCreateAdditionalAccountsViewState.accountRowItems) && Intrinsics.areEqual(this.selectedAccounts, beneficiaryCreateAdditionalAccountsViewState.selectedAccounts) && this.isLoading == beneficiaryCreateAdditionalAccountsViewState.isLoading && Intrinsics.areEqual(this.additionalAgreements, beneficiaryCreateAdditionalAccountsViewState.additionalAgreements) && Intrinsics.areEqual(this.error, beneficiaryCreateAdditionalAccountsViewState.error);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitleMarkdown;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accountRowItems.hashCode()) * 31) + this.selectedAccounts.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        List<ApiBeneficiaryAgreementViewModel> list = this.additionalAgreements;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryCreateAdditionalAccountsViewState(title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", accountRowItems=" + this.accountRowItems + ", selectedAccounts=" + this.selectedAccounts + ", isLoading=" + this.isLoading + ", additionalAgreements=" + this.additionalAgreements + ", error=" + this.error + ")";
    }

    public BeneficiaryCreateAdditionalAccountsViewState(String title, String str, List<AccountRowData> accountRowItems, Set<String> selectedAccounts, boolean z, List<ApiBeneficiaryAgreementViewModel> list, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accountRowItems, "accountRowItems");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        this.title = title;
        this.subtitleMarkdown = str;
        this.accountRowItems = accountRowItems;
        this.selectedAccounts = selectedAccounts;
        this.isLoading = z;
        this.additionalAgreements = list;
        this.error = uiEvent;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BeneficiaryCreateAdditionalAccountsViewState(java.lang.String r2, java.lang.String r3, java.util.List r4, java.util.Set r5, boolean r6, java.util.List r7, com.robinhood.udf.UiEvent r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L14
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L14:
            r10 = r9 & 8
            if (r10 == 0) goto L1c
            java.util.Set r5 = kotlin.collections.SetsKt.emptySet()
        L1c:
            r10 = r9 & 16
            if (r10 == 0) goto L21
            r6 = 0
        L21:
            r10 = r9 & 32
            if (r10 == 0) goto L26
            r7 = r0
        L26:
            r9 = r9 & 64
            if (r9 == 0) goto L33
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3b
        L33:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.beneficiaries.p067ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsViewState.<init>(java.lang.String, java.lang.String, java.util.List, java.util.Set, boolean, java.util.List, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<AccountRowData> getAccountRowItems() {
        return this.accountRowItems;
    }

    public final Set<String> getSelectedAccounts() {
        return this.selectedAccounts;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<ApiBeneficiaryAgreementViewModel> getAdditionalAgreements() {
        return this.additionalAgreements;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState$AccountRowData;", "", "account", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;", "isSelected", "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;Z)V", "getAccount", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
