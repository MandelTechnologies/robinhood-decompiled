package com.robinhood.futures.ordercheck.contracts;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.futures.ordercheck.contracts.models.FuturesOrderPriceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: FuturesOrderCheckResolver.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J)\u0010\u0007\u001a\u00020\u00032\u0019\u0010\b\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rH§@¢\u0006\u0002\u0010\u000eJ1\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0019\u0010\u0012\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rH§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "", "applyForAccount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "focusOnPriceText", "focusOnQuantityText", "makeDeposit", "suggestedAmount", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "(Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePrice", "priceType", "Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;", "newPrice", "(Lcom/robinhood/futures/ordercheck/contracts/models/FuturesOrderPriceType;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@ManagedServices(serviceName = "com.robinhood.futures.ordercheck.FuturesOrderCheckResolver")
/* loaded from: classes15.dex */
public interface FuturesOrderCheckResolver {
    Object applyForAccount(Continuation<? super Unit> continuation);

    Object focusOnPriceText(Continuation<? super Unit> continuation);

    Object focusOnQuantityText(Continuation<? super Unit> continuation);

    Object makeDeposit(BigDecimal bigDecimal, Continuation<? super Unit> continuation);

    Object updatePrice(FuturesOrderPriceType futuresOrderPriceType, BigDecimal bigDecimal, Continuation<? super Unit> continuation);
}
