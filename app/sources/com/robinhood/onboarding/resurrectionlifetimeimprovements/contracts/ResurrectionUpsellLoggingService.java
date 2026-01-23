package com.robinhood.onboarding.resurrectionlifetimeimprovements.contracts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: ResurrectionUpsellLoggingService.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ0\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/onboarding/resurrectionlifetimeimprovements/contracts/ResurrectionUpsellLoggingService;", "", "logTakeoverUpsellAction", "", "upsellIdentifier", "", "shownCount", "", "lastShownTimeMs", "", "wasShown", "", "(Ljava/lang/String;ILjava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logPostDepositUpsellAction", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "ResurrectionUpsellLoggingService")
/* loaded from: classes22.dex */
public interface ResurrectionUpsellLoggingService {
    Object logPostDepositUpsellAction(String str, int i, Long l, boolean z, Continuation<? super Unit> continuation);

    Object logTakeoverUpsellAction(String str, int i, Long l, boolean z, Continuation<? super Unit> continuation);
}
