package com.robinhood.transfers.hub.contracts;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: TransferHubConfigurationManagedService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubConfigurationManagedService;", "", "getTransferScreenPrefillData", "Lcom/robinhood/transfers/hub/contracts/TransferConfigResponse;", "isWithdrawal", "", "hasRhsAccount", "hasRhyAccount", "(ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.transferhubconfigservice")
/* loaded from: classes12.dex */
public interface TransferHubConfigurationManagedService {
    Object getTransferScreenPrefillData(boolean z, boolean z2, boolean z3, Continuation<? super TransferConfigResponse> continuation);
}
