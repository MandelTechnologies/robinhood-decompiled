package com.robinhood.lib.equity.order;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.plaid.internal.EnumC7081g;
import com.robinhood.lib.equity.common.DataSourceRequestContexts;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import microgram.datasource.DataSourceRequestContext;
import microgram.datasource.PaginatedList;
import microgram.datasource.brokeback.Brokeback;
import microgram.datasource.brokeback.models.Account;
import microgram.datasource.brokeback.models.BrokerageAccountType;

/* compiled from: OrderService.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000fJa\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\r2\u0019\u0010\u0018\u001a\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\t0\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0%2\u0006\u0010\u0012\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000fJB\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/OrderServiceImplementation;", "Lcom/robinhood/lib/equity/order/OrderService;", "context", "Lmicrogram/datasource/DataSourceRequestContext;", "json", "Lkotlinx/serialization/json/Json;", "brokeback", "Lmicrogram/datasource/brokeback/Brokeback;", "(Lmicrogram/datasource/DataSourceRequestContext;Lkotlinx/serialization/json/Json;Lmicrogram/datasource/brokeback/Brokeback;)V", "cancelOrder", "Lkotlin/Result;", "", "orderId", "", "cancelOrder-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrder", "Lcom/robinhood/lib/equity/order/Order;", "id", "getOrder-gIAlu-s", "maintenanceCallSellPosition", "Lcom/robinhood/lib/equity/order/SellStocksResponse;", "accountNumber", "symbol", "quantity", "Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;", "Lmicrogram/datasource/utils/BigDecimalWithSerializer;", "Lkotlinx/serialization/Serializable;", "with", "Lmicrogram/datasource/utils/BigDecimalSerializer;", "instrumentId", "refId", "marketBuysExperimentMember", "", "maintenanceCallSellPosition-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;Lcom/ionspin/kotlin/bignum/decimal/BigDecimal;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollOrder", "Lkotlinx/coroutines/flow/Flow;", "waitForOrdersToReachState", "orderIds", "", "state", "Lcom/robinhood/lib/equity/order/OrderState;", "pollInterval", "", "numAttempts", "", "waitForOrdersToReachState-yxL6bBk", "(Ljava/util/List;Lcom/robinhood/lib/equity/order/OrderState;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Component", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation, reason: use source file name */
/* loaded from: classes27.dex */
public final class OrderService2 implements OrderService {
    private final Brokeback brokeback;
    private final DataSourceRequestContext context;
    private final Json json;

    /* compiled from: OrderService.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/lib/equity/order/OrderServiceImplementation$Component;", "", "bind", "Lcom/robinhood/lib/equity/order/OrderService;", "Lcom/robinhood/lib/equity/order/OrderServiceImplementation;", "getBind", "(Lcom/robinhood/lib/equity/order/OrderServiceImplementation;)Lcom/robinhood/lib/equity/order/OrderService;", "lib-equity-store"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation$Component */
    public interface Component {

        /* compiled from: OrderService.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation$Component$DefaultImpls */
        public static final class DefaultImpls {
            public static OrderService getBind(Component component, OrderService2 receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                return receiver;
            }
        }

        OrderService getBind(OrderService2 orderService2);
    }

    public OrderService2(DataSourceRequestContext context, Json json, Brokeback brokeback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        this.json = json;
    }

    public static final /* synthetic */ DataSourceRequestContext access$getContext$p(OrderService2 orderService2) {
        orderService2.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.robinhood.lib.equity.order.OrderService
    /* renamed from: waitForOrdersToReachState-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22538waitForOrdersToReachStateyxL6bBk(List<String> list, OrderState orderState, long j, int i, Continuation<? super Result<Unit>> continuation) {
        OrderService6 orderService6;
        if (continuation instanceof OrderService6) {
            orderService6 = (OrderService6) continuation;
            int i2 = orderService6.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderService6.label = i2 - Integer.MIN_VALUE;
            } else {
                orderService6 = new OrderService6(this, continuation);
            }
        }
        Object objCoroutineScope = orderService6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = orderService6.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objCoroutineScope);
            OrderService7 orderService7 = new OrderService7(i, list, j, this, orderState, null);
            orderService6.label = 1;
            objCoroutineScope = CoroutineScope2.coroutineScope(orderService7, orderService6);
            if (objCoroutineScope == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCoroutineScope);
        }
        return ((Result) objCoroutineScope).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.lib.equity.order.OrderService
    /* renamed from: getOrder-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22536getOrdergIAlus(String str, Continuation<? super Result<Order>> continuation) {
        OrderService4 orderService4;
        if (continuation instanceof OrderService4) {
            orderService4 = (OrderService4) continuation;
            int i = orderService4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderService4.label = i - Integer.MIN_VALUE;
            } else {
                orderService4 = new OrderService4(this, continuation);
            }
        }
        Object obj = orderService4.result;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = orderService4.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((Result) obj).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.lib.equity.order.OrderService
    /* renamed from: maintenanceCallSellPosition-bMdYcbs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22537maintenanceCallSellPositionbMdYcbs(String str, String str2, BigDecimal bigDecimal, String str3, String str4, boolean z, Continuation<? super Result<SellStocksResponse>> continuation) {
        OrderService5 orderService5;
        BigDecimal bigDecimal2;
        String str5;
        boolean z2;
        String account_number;
        OrderService2 orderService2;
        String str6;
        String str7;
        boolean z3;
        Object objM29225getAccountsgIAlus$default;
        String str8;
        String str9;
        List<Account> results;
        if (continuation instanceof OrderService5) {
            orderService5 = (OrderService5) continuation;
            int i = orderService5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderService5.label = i - Integer.MIN_VALUE;
            } else {
                orderService5 = new OrderService5(this, continuation);
            }
        }
        Object obj = orderService5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = orderService5.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (str == null) {
                orderService5.L$0 = this;
                orderService5.L$1 = str2;
                bigDecimal2 = bigDecimal;
                orderService5.L$2 = bigDecimal2;
                orderService5.L$3 = str3;
                orderService5.L$4 = str4;
                z3 = z;
                orderService5.Z$0 = z3;
                orderService5.label = 1;
                objM29225getAccountsgIAlus$default = Brokeback.DefaultImpls.m29225getAccountsgIAlus$default(null, false, orderService5, 1, null);
                if (objM29225getAccountsgIAlus$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str8 = str2;
                str9 = str4;
                orderService2 = this;
                str6 = str3;
            } else {
                bigDecimal2 = bigDecimal;
                str5 = str2;
                z2 = z;
                account_number = str;
                orderService2 = this;
                str6 = str3;
                str7 = str4;
                BigDecimal bigDecimal3 = bigDecimal2;
                if (account_number != null || StringsKt.isBlank(account_number)) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m28550constructorimpl(ResultKt.createFailure(new IllegalArgumentException("accountNumber is null or blank")));
                }
                Json json = orderService2.json;
                SellStocksBody sellStocks = new SellStocksBody(bigDecimal3, str5, DataSourceRequestContexts.getBrokebackUrlForEnvironment(null, "/accounts/" + account_number + "/"), DataSourceRequestContexts.getBrokebackUrlForEnvironment(null, "/instruments/" + str6 + "/"), str7, (String) null, (String) null, z2 ? 6 : 4, (String) null, (String) null, false, (String) null, 3936, (DefaultConstructorMarker) null);
                json.getSerializersModule();
                json.encodeToString(SellStocksBody.INSTANCE.serializer(), sellStocks);
                throw null;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            boolean z4 = orderService5.Z$0;
            String str10 = (String) orderService5.L$4;
            str6 = (String) orderService5.L$3;
            BigDecimal bigDecimal4 = (BigDecimal) orderService5.L$2;
            str8 = (String) orderService5.L$1;
            OrderService2 orderService22 = (OrderService2) orderService5.L$0;
            ResultKt.throwOnFailure(obj);
            z3 = z4;
            orderService2 = orderService22;
            objM29225getAccountsgIAlus$default = ((Result) obj).getValue();
            str9 = str10;
            bigDecimal2 = bigDecimal4;
        }
        if (Result.m28555isFailureimpl(objM29225getAccountsgIAlus$default)) {
            objM29225getAccountsgIAlus$default = null;
        }
        PaginatedList paginatedList = (PaginatedList) objM29225getAccountsgIAlus$default;
        if (paginatedList != null && (results = paginatedList.getResults()) != null) {
            for (Account account : results) {
                if (account.getBrokerage_account_type() == BrokerageAccountType.INDIVIDUAL) {
                    if (account != null) {
                        account_number = account.getAccount_number();
                        str7 = str9;
                    }
                    z2 = z3;
                    str5 = str8;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        str7 = str9;
        account_number = null;
        z2 = z3;
        str5 = str8;
        BigDecimal bigDecimal32 = bigDecimal2;
        if (account_number != null) {
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m28550constructorimpl(ResultKt.createFailure(new IllegalArgumentException("accountNumber is null or blank")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.lib.equity.order.OrderService
    /* renamed from: cancelOrder-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22535cancelOrdergIAlus(String str, Continuation<? super Result<Unit>> continuation) {
        OrderService3 orderService3;
        if (continuation instanceof OrderService3) {
            orderService3 = (OrderService3) continuation;
            int i = orderService3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderService3.label = i - Integer.MIN_VALUE;
            } else {
                orderService3 = new OrderService3(this, continuation);
            }
        }
        Object obj = orderService3.result;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = orderService3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((Result) obj).getValue();
    }

    /* compiled from: OrderService.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Result;", "Lcom/robinhood/lib/equity/order/Order;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.lib.equity.order.OrderServiceImplementation$pollOrder$2", m3645f = "OrderService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.lib.equity.order.OrderServiceImplementation$pollOrder$2 */
    static final class C333752 extends ContinuationImpl7 implements Function2<FlowCollector<? super Result<? extends Order>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C333752(String str, Continuation<? super C333752> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C333752 c333752 = OrderService2.this.new C333752(this.$id, continuation);
            c333752.L$0 = obj;
            return c333752;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends Order>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Result<Order>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Result<Order>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C333752) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Result resultM28549boximpl = Result.m28549boximpl(((Result) obj).getValue());
                    this.L$0 = flowCollector;
                    this.label = 2;
                    if (flowCollector.emit(resultM28549boximpl, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.L$0 = flowCollector;
                this.label = 3;
            }
            OrderService2.access$getContext$p(OrderService2.this);
            throw null;
        }
    }

    @Override // com.robinhood.lib.equity.order.OrderService
    public Object pollOrder(String str, Continuation<? super Flow<Result<Order>>> continuation) {
        return FlowKt.flow(new C333752(str, null));
    }
}
