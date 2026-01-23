package com.robinhood.android.beneficiaries.p067ui.individualflow.accounts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import com.robinhood.android.beneficiaries.p067ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsViewState;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BeneficiaryCreateAdditionalAccountsDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0006J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDataState;", "", "title", "", "subtitleMarkdown", "additionalAccounts", "", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountRow;", "selectedAccounts", "", "isLoading", "", "additionalAgreements", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;ZLjava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getAdditionalAccounts", "()Ljava/util/List;", "getSelectedAccounts", "()Ljava/util/Set;", "()Z", "getAdditionalAgreements", "getError", "()Lcom/robinhood/udf/UiEvent;", "getAccountRowItems", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState$AccountRowData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryCreateAdditionalAccountsDataState {
    public static final int $stable = 8;
    private final List<ApiCreateBeneficiaryAccountRow> additionalAccounts;
    private final List<ApiBeneficiaryAgreementViewModel> additionalAgreements;
    private final UiEvent<Throwable> error;
    private final boolean isLoading;
    private final Set<String> selectedAccounts;
    private final String subtitleMarkdown;
    private final String title;

    public BeneficiaryCreateAdditionalAccountsDataState() {
        this(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ BeneficiaryCreateAdditionalAccountsDataState copy$default(BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState, String str, String str2, List list, Set set, boolean z, List list2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryCreateAdditionalAccountsDataState.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryCreateAdditionalAccountsDataState.subtitleMarkdown;
        }
        if ((i & 4) != 0) {
            list = beneficiaryCreateAdditionalAccountsDataState.additionalAccounts;
        }
        if ((i & 8) != 0) {
            set = beneficiaryCreateAdditionalAccountsDataState.selectedAccounts;
        }
        if ((i & 16) != 0) {
            z = beneficiaryCreateAdditionalAccountsDataState.isLoading;
        }
        if ((i & 32) != 0) {
            list2 = beneficiaryCreateAdditionalAccountsDataState.additionalAgreements;
        }
        if ((i & 64) != 0) {
            uiEvent = beneficiaryCreateAdditionalAccountsDataState.error;
        }
        List list3 = list2;
        UiEvent uiEvent2 = uiEvent;
        boolean z2 = z;
        List list4 = list;
        return beneficiaryCreateAdditionalAccountsDataState.copy(str, str2, list4, set, z2, list3, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<ApiCreateBeneficiaryAccountRow> component3() {
        return this.additionalAccounts;
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

    public final BeneficiaryCreateAdditionalAccountsDataState copy(String title, String subtitleMarkdown, List<ApiCreateBeneficiaryAccountRow> additionalAccounts, Set<String> selectedAccounts, boolean isLoading, List<ApiBeneficiaryAgreementViewModel> additionalAgreements, UiEvent<Throwable> error) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(additionalAccounts, "additionalAccounts");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        return new BeneficiaryCreateAdditionalAccountsDataState(title, subtitleMarkdown, additionalAccounts, selectedAccounts, isLoading, additionalAgreements, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryCreateAdditionalAccountsDataState)) {
            return false;
        }
        BeneficiaryCreateAdditionalAccountsDataState beneficiaryCreateAdditionalAccountsDataState = (BeneficiaryCreateAdditionalAccountsDataState) other;
        return Intrinsics.areEqual(this.title, beneficiaryCreateAdditionalAccountsDataState.title) && Intrinsics.areEqual(this.subtitleMarkdown, beneficiaryCreateAdditionalAccountsDataState.subtitleMarkdown) && Intrinsics.areEqual(this.additionalAccounts, beneficiaryCreateAdditionalAccountsDataState.additionalAccounts) && Intrinsics.areEqual(this.selectedAccounts, beneficiaryCreateAdditionalAccountsDataState.selectedAccounts) && this.isLoading == beneficiaryCreateAdditionalAccountsDataState.isLoading && Intrinsics.areEqual(this.additionalAgreements, beneficiaryCreateAdditionalAccountsDataState.additionalAgreements) && Intrinsics.areEqual(this.error, beneficiaryCreateAdditionalAccountsDataState.error);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitleMarkdown;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.additionalAccounts.hashCode()) * 31) + this.selectedAccounts.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        List<ApiBeneficiaryAgreementViewModel> list = this.additionalAgreements;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode3 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "BeneficiaryCreateAdditionalAccountsDataState(title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", additionalAccounts=" + this.additionalAccounts + ", selectedAccounts=" + this.selectedAccounts + ", isLoading=" + this.isLoading + ", additionalAgreements=" + this.additionalAgreements + ", error=" + this.error + ")";
    }

    public BeneficiaryCreateAdditionalAccountsDataState(String title, String str, List<ApiCreateBeneficiaryAccountRow> additionalAccounts, Set<String> selectedAccounts, boolean z, List<ApiBeneficiaryAgreementViewModel> list, UiEvent<Throwable> uiEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(additionalAccounts, "additionalAccounts");
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        this.title = title;
        this.subtitleMarkdown = str;
        this.additionalAccounts = additionalAccounts;
        this.selectedAccounts = selectedAccounts;
        this.isLoading = z;
        this.additionalAgreements = list;
        this.error = uiEvent;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BeneficiaryCreateAdditionalAccountsDataState(java.lang.String r2, java.lang.String r3, java.util.List r4, java.util.Set r5, boolean r6, java.util.List r7, com.robinhood.udf.UiEvent r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.beneficiaries.p067ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsDataState.<init>(java.lang.String, java.lang.String, java.util.List, java.util.Set, boolean, java.util.List, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final List<ApiCreateBeneficiaryAccountRow> getAdditionalAccounts() {
        return this.additionalAccounts;
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

    public final List<BeneficiaryCreateAdditionalAccountsViewState.AccountRowData> getAccountRowItems() {
        List<ApiCreateBeneficiaryAccountRow> list = this.additionalAccounts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ApiCreateBeneficiaryAccountRow apiCreateBeneficiaryAccountRow : list) {
            arrayList.add(new BeneficiaryCreateAdditionalAccountsViewState.AccountRowData(apiCreateBeneficiaryAccountRow, this.selectedAccounts.contains(apiCreateBeneficiaryAccountRow.getValue())));
        }
        return arrayList;
    }
}
