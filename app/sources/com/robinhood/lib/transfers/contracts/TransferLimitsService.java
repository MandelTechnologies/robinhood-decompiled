package com.robinhood.lib.transfers.contracts;

import com.robinhood.lib.transfers.contracts.models.TransferLimits;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: TransferLimitsService.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/lib/transfers/contracts/TransferLimitsService;", "", "getTransferLimits", "", "Lcom/robinhood/lib/transfers/contracts/models/TransferLimits;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.transfers.accounts.TransferLimitsService")
/* loaded from: classes3.dex */
public interface TransferLimitsService {
    Object getTransferLimits(Continuation<? super List<TransferLimits>> continuation);
}
