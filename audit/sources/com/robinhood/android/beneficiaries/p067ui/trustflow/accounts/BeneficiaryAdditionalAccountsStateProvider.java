package com.robinhood.android.beneficiaries.p067ui.trustflow.accounts;

import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.udf.StateProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BeneficiaryAdditionalAccountsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDataState;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState;", "<init>", "()V", "reduce", "dataState", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryAdditionalAccountsStateProvider implements StateProvider<BeneficiaryAdditionalAccountsDataState, BeneficiaryAdditionalAccountsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public BeneficiaryAdditionalAccountsViewState reduce(BeneficiaryAdditionalAccountsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        String title = dataState.getTitle();
        String subtitleMarkdown = dataState.getSubtitleMarkdown();
        ImmutableList immutableList = extensions2.toImmutableList(dataState.getAccountRowItems());
        ImmutableSet immutableSet = extensions2.toImmutableSet(dataState.getSelectedAccounts());
        boolean zIsLoading = dataState.isLoading();
        List<ApiBeneficiaryAgreementViewModel> additionalAgreements = dataState.getAdditionalAgreements();
        return new BeneficiaryAdditionalAccountsViewState(title, subtitleMarkdown, immutableList, immutableSet, zIsLoading, additionalAgreements != null ? extensions2.toImmutableList(additionalAgreements) : null);
    }
}
