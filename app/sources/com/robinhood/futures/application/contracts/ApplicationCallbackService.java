package com.robinhood.futures.application.contracts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: ApplicationCallbackService.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/futures/application/contracts/ApplicationCallbackService;", "", "continueFromFuturesInvestorProfile", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.futures.application.ApplicationCallbackService")
/* loaded from: classes15.dex */
public interface ApplicationCallbackService {
    Object continueFromFuturesInvestorProfile(Continuation<? super Unit> continuation);
}
