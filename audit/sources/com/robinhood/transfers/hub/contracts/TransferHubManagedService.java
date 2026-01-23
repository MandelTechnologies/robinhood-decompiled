package com.robinhood.transfers.hub.contracts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: TransferHubManagedService.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubManagedService;", "", "setDataForDisplayLogic", "", "displayLogicContainer", "Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;", "(Lcom/robinhood/transfers/hub/contracts/TransferHubDisplayLogicContainer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataForDisplayLogic", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferHubItemSelected", "identifier", "Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "(Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appLoaded", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "mg.transferhubservice")
/* loaded from: classes12.dex */
public interface TransferHubManagedService {
    Object appLoaded(Continuation<? super Unit> continuation);

    Object getDataForDisplayLogic(Continuation<? super TransferHubDisplayLogicContainer> continuation);

    Object setDataForDisplayLogic(TransferHubDisplayLogicContainer transferHubDisplayLogicContainer, Continuation<? super Unit> continuation);

    Object transferHubItemSelected(TransferHubItemClickIdentifier transferHubItemClickIdentifier, Continuation<? super Unit> continuation);
}
