package com.robinhood.android.slip.onboarding.hub;

import com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks2;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipHubSettingsMultiAccountsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$sam$com_robinhood_shared_account_contracts_switcher_AccountToggleCallbacks$0, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipHubSettingsMultiAccountsFragment5 implements AccountSelectorCallbacks2, FunctionAdapter {
    private final /* synthetic */ Function2 function;

    SlipHubSettingsMultiAccountsFragment5(Function2 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AccountSelectorCallbacks2) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSelectorCallbacks2
    public final /* synthetic */ void onAccountToggled(String str, boolean z) {
        this.function.invoke(str, Boolean.valueOf(z));
    }
}
