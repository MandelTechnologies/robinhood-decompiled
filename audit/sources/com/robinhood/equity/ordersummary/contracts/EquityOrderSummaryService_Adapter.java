package com.robinhood.equity.ordersummary.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter;
import com.robinhood.equity.ordersummary.contracts.models.OrderConfirmationParams;
import com.robinhood.equity.ordersummary.contracts.models.OrderConfirmationResult;
import com.robinhood.equity.ordersummary.contracts.models.OrderSummaryParams;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: EquityOrderSummaryService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;", "params", "", "getOrderSummary", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;", "orderConfirmationParams", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "streamOrderConfirmation", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;)Lkotlinx/coroutines/flow/Flow;", "getOrderConfirmation", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getOrderSummary", "Endpoint_streamOrderConfirmation", "Endpoint_getOrderConfirmation", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class EquityOrderSummaryService_Adapter implements EquityOrderSummaryService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter", m3645f = "EquityOrderSummaryService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "getOrderConfirmation")
    /* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$getOrderConfirmation$1 */
    static final class C331421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C331421(Continuation<? super C331421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityOrderSummaryService_Adapter.this.getOrderConfirmation(null, this);
        }
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter", m3645f = "EquityOrderSummaryService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "getOrderSummary")
    /* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$getOrderSummary$1 */
    static final class C331431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C331431(Continuation<? super C331431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EquityOrderSummaryService_Adapter.this.getOrderSummary(null, this);
        }
    }

    public EquityOrderSummaryService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getOrderSummary(OrderSummaryParams orderSummaryParams, Continuation<? super String> continuation) throws IOException {
        C331431 c331431;
        if (continuation instanceof C331431) {
            c331431 = (C331431) continuation;
            int i = c331431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c331431.label = i - Integer.MIN_VALUE;
            } else {
                c331431 = new C331431(continuation);
            }
        }
        C331431 c3314312 = c331431;
        Object objCallSuspendFunction = c3314312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3314312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getOrderSummary.Arguments arguments = new Endpoint_getOrderSummary.Arguments(orderSummaryParams);
            json.getSerializersModule();
            KSerializer<Endpoint_getOrderSummary.Arguments> kSerializerSerializer = Endpoint_getOrderSummary.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getOrderSummary.Emission> kSerializerSerializer2 = Endpoint_getOrderSummary.Emission.INSTANCE.serializer();
            c3314312.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getOrderSummary", arguments, c3314312);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getOrderSummary.Emission) objCallSuspendFunction).m22309unboximpl();
    }

    @Override // com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService
    public Flow<OrderConfirmationResult> streamOrderConfirmation(OrderConfirmationParams orderConfirmationParams) {
        Intrinsics.checkNotNullParameter(orderConfirmationParams, "orderConfirmationParams");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamOrderConfirmation.Arguments arguments = new Endpoint_streamOrderConfirmation.Arguments(orderConfirmationParams);
        json.getSerializersModule();
        KSerializer<Endpoint_streamOrderConfirmation.Arguments> kSerializerSerializer = Endpoint_streamOrderConfirmation.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamOrderConfirmation.Emission.INSTANCE.serializer(), "streamOrderConfirmation", arguments, null);
        return new Flow<OrderConfirmationResult>() { // from class: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$streamOrderConfirmation$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {2, 0, 0})
            @SourceDebugExtension
            /* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$streamOrderConfirmation$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$streamOrderConfirmation$$inlined$map$1$2", m3645f = "EquityOrderSummaryService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "emit")
                /* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$streamOrderConfirmation$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        OrderConfirmationResult orderConfirmationResultM22316unboximpl = ((EquityOrderSummaryService_Adapter.Endpoint_streamOrderConfirmation.Emission) obj).m22316unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orderConfirmationResultM22316unboximpl, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super OrderConfirmationResult> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getOrderConfirmation(OrderConfirmationParams orderConfirmationParams, Continuation<? super OrderConfirmationResult> continuation) throws IOException {
        C331421 c331421;
        if (continuation instanceof C331421) {
            c331421 = (C331421) continuation;
            int i = c331421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c331421.label = i - Integer.MIN_VALUE;
            } else {
                c331421 = new C331421(continuation);
            }
        }
        C331421 c3314212 = c331421;
        Object objCallSuspendFunction = c3314212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3314212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getOrderConfirmation.Arguments arguments = new Endpoint_getOrderConfirmation.Arguments(orderConfirmationParams);
            json.getSerializersModule();
            KSerializer<Endpoint_getOrderConfirmation.Arguments> kSerializerSerializer = Endpoint_getOrderConfirmation.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getOrderConfirmation.Emission> kSerializerSerializer2 = Endpoint_getOrderConfirmation.Emission.INSTANCE.serializer();
            c3314212.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getOrderConfirmation", arguments, c3314212);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getOrderConfirmation.Emission) objCallSuspendFunction).m22302unboximpl();
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getOrderSummary implements ServiceCallable {
        private final Json json;
        private final EquityOrderSummaryService service;

        public Endpoint_getOrderSummary(EquityOrderSummaryService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C33141x687ec0ef c33141x687ec0ef = new C33141x687ec0ef(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c33141x687ec0ef);
        }

        /* compiled from: EquityOrderSummaryService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Arguments;", "", "params", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;", "<init>", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getParams", "()Lcom/robinhood/equity/ordersummary/contracts/models/OrderSummaryParams;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final OrderSummaryParams params;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, OrderSummaryParams orderSummaryParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderSummaryParams = arguments.params;
                }
                return arguments.copy(orderSummaryParams);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderSummaryParams getParams() {
                return this.params;
            }

            public final Arguments copy(OrderSummaryParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new Arguments(params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.params, ((Arguments) other).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                return "Arguments(params=" + this.params + ")";
            }

            /* compiled from: EquityOrderSummaryService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33133x30c73844.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, OrderSummaryParams orderSummaryParams, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33133x30c73844.INSTANCE.getDescriptor());
                }
                this.params = orderSummaryParams;
            }

            public Arguments(OrderSummaryParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final OrderSummaryParams getParams() {
                return this.params;
            }
        }

        /* compiled from: EquityOrderSummaryService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22303boximpl(String str) {
                return new Emission(str);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m22304constructorimpl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22305equalsimpl(String str, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(str, ((Emission) obj).m22309unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22306equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22307hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22308toStringimpl(String str) {
                return "Emission(value=" + str + ")";
            }

            public boolean equals(Object obj) {
                return m22305equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22307hashCodeimpl(this.value);
            }

            public String toString() {
                return m22308toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m22309unboximpl() {
                return this.value;
            }

            /* compiled from: EquityOrderSummaryService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderSummary$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33134x1e759bbd.INSTANCE;
                }
            }

            private /* synthetic */ Emission(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamOrderConfirmation implements ServiceCallable {
        private final Json json;
        private final EquityOrderSummaryService service;

        public Endpoint_streamOrderConfirmation(EquityOrderSummaryService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityOrderSummaryService_Adapter.Endpoint_streamOrderConfirmation.call$lambda$1(this.f$0, (EquityOrderSummaryService_Adapter.Endpoint_streamOrderConfirmation.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamOrderConfirmation endpoint_streamOrderConfirmation, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<OrderConfirmationResult> flowStreamOrderConfirmation = endpoint_streamOrderConfirmation.service.streamOrderConfirmation(it.getOrderConfirmationParams());
            return new Flow<Emission>() { // from class: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$call$lambda$1$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {2, 0, 0})
                @SourceDebugExtension
                /* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$call$lambda$1$$inlined$map$1$2", m3645f = "EquityOrderSummaryService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "emit")
                    /* renamed from: com.robinhood.equity.ordersummary.contracts.EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            EquityOrderSummaryService_Adapter.Endpoint_streamOrderConfirmation.Emission emissionM22310boximpl = EquityOrderSummaryService_Adapter.Endpoint_streamOrderConfirmation.Emission.m22310boximpl(EquityOrderSummaryService_Adapter.Endpoint_streamOrderConfirmation.Emission.m22311constructorimpl((OrderConfirmationResult) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22310boximpl, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super EquityOrderSummaryService_Adapter.Endpoint_streamOrderConfirmation.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamOrderConfirmation.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }

        /* compiled from: EquityOrderSummaryService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$Arguments;", "", "orderConfirmationParams", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;", "<init>", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrderConfirmationParams", "()Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final OrderConfirmationParams orderConfirmationParams;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, OrderConfirmationParams orderConfirmationParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderConfirmationParams = arguments.orderConfirmationParams;
                }
                return arguments.copy(orderConfirmationParams);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderConfirmationParams getOrderConfirmationParams() {
                return this.orderConfirmationParams;
            }

            public final Arguments copy(OrderConfirmationParams orderConfirmationParams) {
                Intrinsics.checkNotNullParameter(orderConfirmationParams, "orderConfirmationParams");
                return new Arguments(orderConfirmationParams);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.orderConfirmationParams, ((Arguments) other).orderConfirmationParams);
            }

            public int hashCode() {
                return this.orderConfirmationParams.hashCode();
            }

            public String toString() {
                return "Arguments(orderConfirmationParams=" + this.orderConfirmationParams + ")";
            }

            /* compiled from: EquityOrderSummaryService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33136xbd3d2499.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, OrderConfirmationParams orderConfirmationParams, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33136xbd3d2499.INSTANCE.getDescriptor());
                }
                this.orderConfirmationParams = orderConfirmationParams;
            }

            public Arguments(OrderConfirmationParams orderConfirmationParams) {
                Intrinsics.checkNotNullParameter(orderConfirmationParams, "orderConfirmationParams");
                this.orderConfirmationParams = orderConfirmationParams;
            }

            public final OrderConfirmationParams getOrderConfirmationParams() {
                return this.orderConfirmationParams;
            }
        }

        /* compiled from: EquityOrderSummaryService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$Emission;", "", "value", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "constructor-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;)Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "getValue", "()Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;)I", "toString", "", "toString-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final OrderConfirmationResult value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22310boximpl(OrderConfirmationResult orderConfirmationResult) {
                return new Emission(orderConfirmationResult);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static OrderConfirmationResult m22311constructorimpl(OrderConfirmationResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22312equalsimpl(OrderConfirmationResult orderConfirmationResult, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(orderConfirmationResult, ((Emission) obj).m22316unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22313equalsimpl0(OrderConfirmationResult orderConfirmationResult, OrderConfirmationResult orderConfirmationResult2) {
                return Intrinsics.areEqual(orderConfirmationResult, orderConfirmationResult2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22314hashCodeimpl(OrderConfirmationResult orderConfirmationResult) {
                return orderConfirmationResult.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22315toStringimpl(OrderConfirmationResult orderConfirmationResult) {
                return "Emission(value=" + orderConfirmationResult + ")";
            }

            public boolean equals(Object obj) {
                return m22312equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22314hashCodeimpl(this.value);
            }

            public String toString() {
                return m22315toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ OrderConfirmationResult m22316unboximpl() {
                return this.value;
            }

            /* compiled from: EquityOrderSummaryService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_streamOrderConfirmation$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33137x861650c8.INSTANCE;
                }
            }

            private /* synthetic */ Emission(OrderConfirmationResult orderConfirmationResult) {
                this.value = orderConfirmationResult;
            }

            public final OrderConfirmationResult getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderConfirmation;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getOrderConfirmation implements ServiceCallable {
        private final Json json;
        private final EquityOrderSummaryService service;

        public Endpoint_getOrderConfirmation(EquityOrderSummaryService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C33140x31d43b4 c33140x31d43b4 = new C33140x31d43b4(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c33140x31d43b4);
        }

        /* compiled from: EquityOrderSummaryService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderConfirmation$Arguments;", "", "orderConfirmationParams", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;", "<init>", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrderConfirmationParams", "()Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationParams;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final OrderConfirmationParams orderConfirmationParams;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, OrderConfirmationParams orderConfirmationParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderConfirmationParams = arguments.orderConfirmationParams;
                }
                return arguments.copy(orderConfirmationParams);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderConfirmationParams getOrderConfirmationParams() {
                return this.orderConfirmationParams;
            }

            public final Arguments copy(OrderConfirmationParams orderConfirmationParams) {
                Intrinsics.checkNotNullParameter(orderConfirmationParams, "orderConfirmationParams");
                return new Arguments(orderConfirmationParams);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.orderConfirmationParams, ((Arguments) other).orderConfirmationParams);
            }

            public int hashCode() {
                return this.orderConfirmationParams.hashCode();
            }

            public String toString() {
                return "Arguments(orderConfirmationParams=" + this.orderConfirmationParams + ")";
            }

            /* compiled from: EquityOrderSummaryService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderConfirmation$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderConfirmation$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33131xee5432df.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, OrderConfirmationParams orderConfirmationParams, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33131xee5432df.INSTANCE.getDescriptor());
                }
                this.orderConfirmationParams = orderConfirmationParams;
            }

            public Arguments(OrderConfirmationParams orderConfirmationParams) {
                Intrinsics.checkNotNullParameter(orderConfirmationParams, "orderConfirmationParams");
                this.orderConfirmationParams = orderConfirmationParams;
            }

            public final OrderConfirmationParams getOrderConfirmationParams() {
                return this.orderConfirmationParams;
            }
        }

        /* compiled from: EquityOrderSummaryService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderConfirmation$Emission;", "", "value", "Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "constructor-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;)Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "getValue", "()Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;)I", "toString", "", "toString-impl", "(Lcom/robinhood/equity/ordersummary/contracts/models/OrderConfirmationResult;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final OrderConfirmationResult value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22296boximpl(OrderConfirmationResult orderConfirmationResult) {
                return new Emission(orderConfirmationResult);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static OrderConfirmationResult m22297constructorimpl(OrderConfirmationResult orderConfirmationResult) {
                return orderConfirmationResult;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22298equalsimpl(OrderConfirmationResult orderConfirmationResult, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(orderConfirmationResult, ((Emission) obj).m22302unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22299equalsimpl0(OrderConfirmationResult orderConfirmationResult, OrderConfirmationResult orderConfirmationResult2) {
                return Intrinsics.areEqual(orderConfirmationResult, orderConfirmationResult2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22300hashCodeimpl(OrderConfirmationResult orderConfirmationResult) {
                if (orderConfirmationResult == null) {
                    return 0;
                }
                return orderConfirmationResult.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22301toStringimpl(OrderConfirmationResult orderConfirmationResult) {
                return "Emission(value=" + orderConfirmationResult + ")";
            }

            public boolean equals(Object obj) {
                return m22298equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22300hashCodeimpl(this.value);
            }

            public String toString() {
                return m22301toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ OrderConfirmationResult m22302unboximpl() {
                return this.value;
            }

            /* compiled from: EquityOrderSummaryService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderConfirmation$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/equity/ordersummary/contracts/EquityOrderSummaryService_Adapter$Endpoint_getOrderConfirmation$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33132x5e6161c2.INSTANCE;
                }
            }

            private /* synthetic */ Emission(OrderConfirmationResult orderConfirmationResult) {
                this.value = orderConfirmationResult;
            }

            public final OrderConfirmationResult getValue() {
                return this.value;
            }
        }
    }
}
