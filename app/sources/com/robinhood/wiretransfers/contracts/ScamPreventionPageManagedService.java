package com.robinhood.wiretransfers.contracts;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: ScamPreventionPageManagedService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/ScamPreventionPageManagedService;", "", "buttonSelected", "", "selectionType", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "(Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.wiretransfers.contracts.scamprevention")
/* loaded from: classes12.dex */
public interface ScamPreventionPageManagedService {
    Object buttonSelected(ScamPreventionButtonType scamPreventionButtonType, Continuation<? super Unit> continuation);
}
