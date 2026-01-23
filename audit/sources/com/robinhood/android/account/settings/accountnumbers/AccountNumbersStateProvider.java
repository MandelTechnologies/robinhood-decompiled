package com.robinhood.android.account.settings.accountnumbers;

import bonfire.proto.idl.accounts.p028v1.AccountNumbersResponseDto;
import com.robinhood.android.account.settings.accountnumbers.AccountNumbersViewState;
import com.robinhood.android.udf.StateProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AccountNumbersStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDataState;", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersViewState;", "<init>", "()V", "reduce", "dataState", "feature-account-number-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNumbersStateProvider implements StateProvider<AccountNumbersDataState, AccountNumbersViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AccountNumbersViewState reduce(AccountNumbersDataState dataState) {
        List<UIComponentDto> contents_masked;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AccountNumbersResponseDto accountNumbersResponse = dataState.getAccountNumbersResponse();
        if (accountNumbersResponse != null) {
            String title = accountNumbersResponse.getTitle();
            if (dataState.isSecondaryAuthenticated()) {
                contents_masked = accountNumbersResponse.getContents();
            } else {
                contents_masked = accountNumbersResponse.getContents_masked();
            }
            return new AccountNumbersViewState.Loaded(title, extensions2.toImmutableList(contents_masked));
        }
        return AccountNumbersViewState.Loading.INSTANCE;
    }
}
