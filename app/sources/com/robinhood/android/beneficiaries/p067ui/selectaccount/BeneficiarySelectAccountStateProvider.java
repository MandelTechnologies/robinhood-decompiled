package com.robinhood.android.beneficiaries.p067ui.selectaccount;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.beneficiaries.models.api.BeneficiaryAccountSelectorViewModel;
import com.robinhood.android.beneficiaries.p067ui.selectaccount.BeneficiarySelectAccountViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorRowData;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: BeneficiarySelectAccountStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountDataState;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountViewState;", "<init>", "()V", "reduce", "dataState", "toAccountSelectorData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "", "Lcom/robinhood/android/beneficiaries/models/api/BeneficiaryAccountSelectorViewModel;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiarySelectAccountStateProvider implements StateProvider<BeneficiarySelectAccountDataState, BeneficiarySelectAccountViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public BeneficiarySelectAccountViewState reduce(BeneficiarySelectAccountDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAccountSelectorViewModels() != null) {
            return new BeneficiarySelectAccountViewState.Content(dataState.getTitle(), dataState.getSubtitleMarkdown(), toAccountSelectorData(dataState.getAccountSelectorViewModels()));
        }
        return BeneficiarySelectAccountViewState.Loading.INSTANCE;
    }

    private final AccountSelectorData toAccountSelectorData(List<BeneficiaryAccountSelectorViewModel> list) {
        List<BeneficiaryAccountSelectorViewModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BeneficiaryAccountSelectorViewModel beneficiaryAccountSelectorViewModel : list2) {
            BrokerageAccountType brokerage_account_type = beneficiaryAccountSelectorViewModel.getBrokerage_account_type();
            ManagementType management_type = beneficiaryAccountSelectorViewModel.getManagement_type();
            Instant created_at = beneficiaryAccountSelectorViewModel.getCreated_at();
            String account_number = beneficiaryAccountSelectorViewModel.getAccount_number();
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(new AccountSelectorRowData(brokerage_account_type, management_type, created_at, null, account_number, companion.invoke(beneficiaryAccountSelectorViewModel.getTitle()), companion.invoke(beneficiaryAccountSelectorViewModel.getSubtitle()), AccountDisplayIcons.getDisplayIcon24(beneficiaryAccountSelectorViewModel.getBrokerage_account_type(), beneficiaryAccountSelectorViewModel.getManagement_type()), null, null, false, 1800, null));
        }
        return new AccountSelectorData(extensions2.toImmutableList(arrayList));
    }
}
