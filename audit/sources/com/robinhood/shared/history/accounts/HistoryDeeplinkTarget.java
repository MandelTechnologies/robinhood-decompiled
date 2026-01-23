package com.robinhood.shared.history.accounts;

import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.contracts.account.DeprecatedAccountsHistoryTransactionTypeFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HistoryDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/HistoryDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HistoryDeeplinkTarget extends DeeplinkTarget4 {
    public static final HistoryDeeplinkTarget INSTANCE = new HistoryDeeplinkTarget();
    public static final int $stable = 8;

    private HistoryDeeplinkTarget() {
        super(AnalyticsStrings.BUTTON_GROUP_TITLE_HISTORY, false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilterFromServerValue;
        AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilterFromServerValue;
        DeprecatedAccountsHistoryTransactionTypeFilter deprecatedAccountsHistoryTransactionTypeFilter;
        AccountsHistoryTransactionTypeFilter replacedBy;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_type_filter");
        if (queryParameter == null || (accountsHistoryAccountTypeFilterFromServerValue = AccountsHistoryAccountTypeFilter.INSTANCE.fromServerValue(queryParameter)) == null) {
            accountsHistoryAccountTypeFilterFromServerValue = AccountsHistoryAccountTypeFilter.ALL;
        }
        AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter = accountsHistoryAccountTypeFilterFromServerValue;
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("type");
        if (queryParameter2 != null) {
            AccountsHistoryTransactionTypeFilter.Companion companion = AccountsHistoryTransactionTypeFilter.INSTANCE;
            accountsHistoryTransactionTypeFilterFromServerValue = companion.fromServerValue(queryParameter2);
            if (accountsHistoryTransactionTypeFilterFromServerValue == companion.getDefault() && (deprecatedAccountsHistoryTransactionTypeFilter = (DeprecatedAccountsHistoryTransactionTypeFilter) DeprecatedAccountsHistoryTransactionTypeFilter.INSTANCE.fromServerValue(queryParameter2)) != null && (replacedBy = deprecatedAccountsHistoryTransactionTypeFilter.getReplacedBy()) != null) {
                accountsHistoryTransactionTypeFilterFromServerValue = replacedBy;
            }
            if (accountsHistoryTransactionTypeFilterFromServerValue == null) {
            }
        } else {
            accountsHistoryTransactionTypeFilterFromServerValue = AccountsHistoryTransactionTypeFilter.ALL;
        }
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new AccountsHistoryContract.Key(accountsHistoryAccountTypeFilter, accountsHistoryTransactionTypeFilterFromServerValue, null, null, false, null, 60, null), false, false, false, false, false, false, 118, null), null, false, 12, null)};
    }
}
