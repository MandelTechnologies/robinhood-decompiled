package com.robinhood.lib.equity.order;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OrderService.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\u0006H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\bJa\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0019\u0010\u0011\u001a\u00150\u0012j\u0002`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u001e2\u0006\u0010\u000b\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\bJF\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/OrderService;", "", "cancelOrder", "Lkotlin/Result;", "", "orderId", "", "cancelOrder-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrder", "Lcom/robinhood/lib/equity/order/Order;", "id", "getOrder-gIAlu-s", "maintenanceCallSellPosition", "Lcom/robinhood/lib/equity/order/SellStocksResponse;", "accountNumber", "symbol", "quantity", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "instrumentId", "refId", "marketBuysExperimentMember", "", "maintenanceCallSellPosition-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollOrder", "Lkotlinx/coroutines/flow/Flow;", "waitForOrdersToReachState", "orderIds", "", "state", "Lcom/robinhood/lib/equity/order/OrderState;", "pollInterval", "", "numAttempts", "", "waitForOrdersToReachState-yxL6bBk", "(Ljava/util/List;Lcom/robinhood/lib/equity/order/OrderState;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface OrderService {
    /* renamed from: cancelOrder-gIAlu-s, reason: not valid java name */
    Object mo22535cancelOrdergIAlus(String str, Continuation<? super Result<Unit>> continuation);

    /* renamed from: getOrder-gIAlu-s, reason: not valid java name */
    Object mo22536getOrdergIAlus(String str, Continuation<? super Result<Order>> continuation);

    /* renamed from: maintenanceCallSellPosition-bMdYcbs, reason: not valid java name */
    Object mo22537maintenanceCallSellPositionbMdYcbs(String str, String str2, BigDecimal bigDecimal, String str3, String str4, boolean z, Continuation<? super Result<SellStocksResponse>> continuation);

    Object pollOrder(String str, Continuation<? super Flow<Result<Order>>> continuation);

    /* renamed from: waitForOrdersToReachState-yxL6bBk, reason: not valid java name */
    Object mo22538waitForOrdersToReachStateyxL6bBk(List<String> list, OrderState orderState, long j, int i, Continuation<? super Result<Unit>> continuation);

    /* compiled from: OrderService.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* renamed from: waitForOrdersToReachState-yxL6bBk$default, reason: not valid java name */
        public static /* synthetic */ Object m22539waitForOrdersToReachStateyxL6bBk$default(OrderService orderService, List list, OrderState orderState, long j, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: waitForOrdersToReachState-yxL6bBk");
            }
            if ((i2 & 4) != 0) {
                j = 500;
            }
            long j2 = j;
            if ((i2 & 8) != 0) {
                i = 10;
            }
            return orderService.mo22538waitForOrdersToReachStateyxL6bBk(list, orderState, j2, i, continuation);
        }
    }
}
