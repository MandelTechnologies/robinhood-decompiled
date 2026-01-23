package com.robinhood.equity.ordersummary.contracts;

import com.robinhood.equity.ordersummary.contracts.models.OrderConfirmationParams;
import com.robinhood.equity.ordersummary.contracts.models.OrderConfirmationResult;
import com.robinhood.equity.ordersummary.contracts.models.OrderSummaryParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: EquityOrderSummaryService.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH'J\u0018\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;", "", "getOrderSummary", "", "params", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamOrderConfirmation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "orderConfirmationParams", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;", "getOrderConfirmation", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@ManagedServices(serviceName = "EquityOrderSummary")
/* loaded from: classes15.dex */
public interface EquityOrderSummaryService {
    Object getOrderConfirmation(OrderConfirmationParams orderConfirmationParams, Continuation<? super OrderConfirmationResult> continuation);

    Object getOrderSummary(OrderSummaryParams orderSummaryParams, Continuation<? super String> continuation);

    Flow<OrderConfirmationResult> streamOrderConfirmation(OrderConfirmationParams orderConfirmationParams);
}
