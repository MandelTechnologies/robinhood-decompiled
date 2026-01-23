package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.model.TransferAccountSelectionLoadConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: AccountSelectionConfigurationService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService;", "", "setOnLoadConfiguration", "", "config", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountSelectionLoadConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.transfers.accounts.AccountSelectionConfigurationService")
/* loaded from: classes12.dex */
public interface AccountSelectionConfigurationService {
    Object refreshAccounts(Continuation<? super Unit> continuation);

    Object setOnLoadConfiguration(TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration, Continuation<? super Unit> continuation);
}
