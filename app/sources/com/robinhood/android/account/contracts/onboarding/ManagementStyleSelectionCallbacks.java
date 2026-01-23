package com.robinhood.android.account.contracts.onboarding;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;

/* compiled from: ManagementStyleSelectionCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionCallbacks;", "", "onConfirmSelfDirectedAccount", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onConfirmManagedAccount", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface ManagementStyleSelectionCallbacks {
    void onConfirmManagedAccount(BrokerageAccountType brokerageAccountType);

    void onConfirmSelfDirectedAccount(BrokerageAccountType brokerageAccountType);
}
