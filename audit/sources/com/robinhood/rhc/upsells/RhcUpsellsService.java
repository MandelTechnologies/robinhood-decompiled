package com.robinhood.rhc.upsells;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: RhcUpsellsService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/RhcUpsellsService;", "", "shouldShowUpsell", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/rhc/upsells/TouchPointData;", "(Lcom/robinhood/rhc/upsells/TouchPointData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "RhcUpsellsService")
/* loaded from: classes26.dex */
public interface RhcUpsellsService {
    Object shouldShowUpsell(TouchPointData touchPointData, Continuation<? super String> continuation);
}
