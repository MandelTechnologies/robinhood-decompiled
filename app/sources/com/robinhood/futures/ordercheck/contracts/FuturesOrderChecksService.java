package com.robinhood.futures.ordercheck.contracts;

import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderCheckRequest;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderChecksResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: FuturesOrderChecksService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderChecksService;", "", "validateOrderAndPresentErrorAlert", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderChecksResult;", "candidateOrder", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.futures.ordercheck.FuturesOrderChecksService")
/* loaded from: classes15.dex */
public interface FuturesOrderChecksService {
    Object validateOrderAndPresentErrorAlert(FuturesOrderCheckRequest futuresOrderCheckRequest, Continuation<? super FuturesOrderChecksResult> continuation);
}
