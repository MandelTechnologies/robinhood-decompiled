package com.robinhood.android.directdeposit.p101ui.accountinfo;

import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"directDepositDisclosureText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "getDirectDepositDisclosureText", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;)Lcom/robinhood/utils/resource/StringResource;", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoViewStateKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class AccountInfoViewState2 {
    public static final StringResource getDirectDepositDisclosureText(AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        int i;
        Intrinsics.checkNotNullParameter(routingDetails, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = C14044R.string.direct_deposit_account_info_bank_info;
        if (routingDetails instanceof AccountRoutingDetailsStore.RoutingDetails.CashManagement) {
            i = C14044R.string.direct_deposit_account_info_robinhood_financial;
        } else {
            if (!(routingDetails instanceof AccountRoutingDetailsStore.RoutingDetails.RhySpending)) {
                throw new NoWhenBranchMatchedException();
            }
            i = C14044R.string.direct_deposit_account_info_robinhood_money;
        }
        return companion.invoke(i2, companion.invoke(i, new Object[0]), routingDetails.getFullBankName());
    }
}
