package com.robinhood.futures.charts.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter;
import com.robinhood.futures.charts.contracts.models.EventContractEvent;
import com.robinhood.futures.charts.contracts.models.FuturesClosePrice;
import com.robinhood.futures.charts.contracts.models.FuturesClosePrice2;
import com.robinhood.futures.charts.contracts.models.FuturesContract;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical3;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical7;
import com.robinhood.futures.charts.contracts.models.FuturesPrevClosePrice;
import com.robinhood.futures.charts.contracts.models.FuturesProduct;
import com.robinhood.futures.charts.contracts.models.FuturesQuote;
import com.robinhood.futures.charts.contracts.models.FuturesQuote3;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: FuturesChartsClientService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\n123456789:B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J5\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\tH\u0096@¢\u0006\u0004\b#\u0010!J9\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00160\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00160\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0016¢\u0006\u0004\b(\u0010)J\u001e\u0010+\u001a\u00020*2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0096@¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100¨\u0006;"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "contractId", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "interval", "", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "getFuturesHistorical", "(Ljava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "productId", "getFuturesHistoricalForProduct", "", "Lcom/robinhood/futures/charts/contracts/models/FuturesClosePrice;", "getFuturesClosesRange", "(Ljava/lang/String;JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;", "getFuturesClosePrice", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "getFuturesLastTradePrice", "Lcom/robinhood/futures/charts/contracts/models/FuturesContract;", "getFuturesContract", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;", "getFuturesProduct", "eventContractIds", "streamEventContractHistoricals", "(Ljava/util/List;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;J)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesQuote;", "streamEventContractLastTradePrices", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;", "getEventContractEvent", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getFuturesHistorical", "Endpoint_getFuturesHistoricalForProduct", "Endpoint_getFuturesClosesRange", "Endpoint_getFuturesClosePrice", "Endpoint_getFuturesLastTradePrice", "Endpoint_getFuturesContract", "Endpoint_getFuturesProduct", "Endpoint_streamEagleHistoricals", "Endpoint_streamEagleLastTradePrices", "Endpoint_getEagleEvent", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class FuturesChartsClientService_Adapter implements FuturesChartsClientService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {354}, m3647m = "getEventContractEvent")
    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getEventContractEvent$1 */
    static final class C332611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C332611(Continuation<? super C332611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesChartsClientService_Adapter.this.getEventContractEvent(null, this);
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {354}, m3647m = "getFuturesContract")
    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesContract$1 */
    static final class C332621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C332621(Continuation<? super C332621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesChartsClientService_Adapter.this.getFuturesContract(null, this);
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {354}, m3647m = "getFuturesProduct")
    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesProduct$1 */
    static final class C332631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C332631(Continuation<? super C332631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesChartsClientService_Adapter.this.getFuturesProduct(null, this);
        }
    }

    public FuturesChartsClientService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<FuturesHistorical> getFuturesHistorical(String contractId, FuturesHistorical7 interval, long start, Long end) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_getFuturesHistorical.Arguments arguments = new Endpoint_getFuturesHistorical.Arguments(contractId, interval, start, end);
        json.getSerializersModule();
        KSerializer<Endpoint_getFuturesHistorical.Arguments> kSerializerSerializer = Endpoint_getFuturesHistorical.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_getFuturesHistorical.Emission.INSTANCE.serializer(), "getFuturesHistorical", arguments, null);
        return new Flow<FuturesHistorical>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistorical$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistorical$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistorical$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistorical$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesHistorical futuresHistoricalM22404unboximpl = ((FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Emission) obj).m22404unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresHistoricalM22404unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesHistorical> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<FuturesHistorical> getFuturesHistoricalForProduct(String productId, FuturesHistorical7 interval, long start, Long end) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_getFuturesHistoricalForProduct.Arguments arguments = new Endpoint_getFuturesHistoricalForProduct.Arguments(productId, interval, start, end);
        json.getSerializersModule();
        KSerializer<Endpoint_getFuturesHistoricalForProduct.Arguments> kSerializerSerializer = Endpoint_getFuturesHistoricalForProduct.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_getFuturesHistoricalForProduct.Emission.INSTANCE.serializer(), "getFuturesHistoricalForProduct", arguments, null);
        return new Flow<FuturesHistorical>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistoricalForProduct$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistoricalForProduct$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistoricalForProduct$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesHistoricalForProduct$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesHistorical futuresHistoricalM22411unboximpl = ((FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.Emission) obj).m22411unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresHistoricalM22411unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesHistorical> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<List<FuturesClosePrice>> getFuturesClosesRange(String contractId, long start, Long end) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_getFuturesClosesRange.Arguments arguments = new Endpoint_getFuturesClosesRange.Arguments(contractId, start, end);
        json.getSerializersModule();
        KSerializer<Endpoint_getFuturesClosesRange.Arguments> kSerializerSerializer = Endpoint_getFuturesClosesRange.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_getFuturesClosesRange.Emission.INSTANCE.serializer(), "getFuturesClosesRange", arguments, null);
        return new Flow<List<? extends FuturesClosePrice>>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosesRange$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosesRange$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosesRange$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosesRange$$inlined$map$1$2$1, reason: invalid class name */
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
                        List value = ((FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.Emission) obj).getValue();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends FuturesClosePrice>> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<FuturesPrevClosePrice> getFuturesClosePrice(String contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_getFuturesClosePrice.Arguments arguments = new Endpoint_getFuturesClosePrice.Arguments(contractId);
        json.getSerializersModule();
        KSerializer<Endpoint_getFuturesClosePrice.Arguments> kSerializerSerializer = Endpoint_getFuturesClosePrice.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_getFuturesClosePrice.Emission.INSTANCE.serializer(), "getFuturesClosePrice", arguments, null);
        return new Flow<FuturesPrevClosePrice>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosePrice$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosePrice$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosePrice$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesClosePrice$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesPrevClosePrice futuresPrevClosePriceM22382unboximpl = ((FuturesChartsClientService_Adapter.Endpoint_getFuturesClosePrice.Emission) obj).m22382unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresPrevClosePriceM22382unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesPrevClosePrice> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<Double> getFuturesLastTradePrice(String contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_getFuturesLastTradePrice.Arguments arguments = new Endpoint_getFuturesLastTradePrice.Arguments(contractId);
        json.getSerializersModule();
        KSerializer<Endpoint_getFuturesLastTradePrice.Arguments> kSerializerSerializer = Endpoint_getFuturesLastTradePrice.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_getFuturesLastTradePrice.Emission.INSTANCE.serializer(), "getFuturesLastTradePrice", arguments, null);
        return new Flow<Double>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesLastTradePrice$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesLastTradePrice$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesLastTradePrice$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$getFuturesLastTradePrice$$inlined$map$1$2$1, reason: invalid class name */
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
                        Double dBoxDouble = boxing.boxDouble(((FuturesChartsClientService_Adapter.Endpoint_getFuturesLastTradePrice.Emission) obj).m22419unboximpl());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dBoxDouble, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Double> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFuturesContract(String str, Continuation<? super FuturesContract> continuation) throws IOException {
        C332621 c332621;
        if (continuation instanceof C332621) {
            c332621 = (C332621) continuation;
            int i = c332621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c332621.label = i - Integer.MIN_VALUE;
            } else {
                c332621 = new C332621(continuation);
            }
        }
        C332621 c3326212 = c332621;
        Object objCallSuspendFunction = c3326212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3326212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getFuturesContract.Arguments arguments = new Endpoint_getFuturesContract.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getFuturesContract.Arguments> kSerializerSerializer = Endpoint_getFuturesContract.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getFuturesContract.Emission> kSerializerSerializer2 = Endpoint_getFuturesContract.Emission.INSTANCE.serializer();
            c3326212.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getFuturesContract", arguments, c3326212);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getFuturesContract.Emission) objCallSuspendFunction).m22397unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getFuturesProduct(String str, Continuation<? super FuturesProduct> continuation) throws IOException {
        C332631 c332631;
        if (continuation instanceof C332631) {
            c332631 = (C332631) continuation;
            int i = c332631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c332631.label = i - Integer.MIN_VALUE;
            } else {
                c332631 = new C332631(continuation);
            }
        }
        C332631 c3326312 = c332631;
        Object objCallSuspendFunction = c3326312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3326312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getFuturesProduct.Arguments arguments = new Endpoint_getFuturesProduct.Arguments(str);
            json.getSerializersModule();
            KSerializer<Endpoint_getFuturesProduct.Arguments> kSerializerSerializer = Endpoint_getFuturesProduct.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getFuturesProduct.Emission> kSerializerSerializer2 = Endpoint_getFuturesProduct.Emission.INSTANCE.serializer();
            c3326312.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getFuturesProduct", arguments, c3326312);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getFuturesProduct.Emission) objCallSuspendFunction).m22426unboximpl();
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<List<FuturesHistorical>> streamEventContractHistoricals(List<String> eventContractIds, FuturesHistorical7 interval, long start) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        Intrinsics.checkNotNullParameter(interval, "interval");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamEagleHistoricals.Arguments arguments = new Endpoint_streamEagleHistoricals.Arguments(eventContractIds, interval, start);
        json.getSerializersModule();
        KSerializer<Endpoint_streamEagleHistoricals.Arguments> kSerializerSerializer = Endpoint_streamEagleHistoricals.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamEagleHistoricals.Emission.INSTANCE.serializer(), "streamEagleHistoricals", arguments, null);
        return new Flow<List<? extends FuturesHistorical>>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractHistoricals$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractHistoricals$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractHistoricals$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractHistoricals$$inlined$map$1$2$1, reason: invalid class name */
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
                        List value = ((FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Emission) obj).getValue();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends FuturesHistorical>> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<List<FuturesQuote>> streamEventContractLastTradePrices(List<String> eventContractIds) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamEagleLastTradePrices.Arguments arguments = new Endpoint_streamEagleLastTradePrices.Arguments(eventContractIds);
        json.getSerializersModule();
        KSerializer<Endpoint_streamEagleLastTradePrices.Arguments> kSerializerSerializer = Endpoint_streamEagleLastTradePrices.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamEagleLastTradePrices.Emission.INSTANCE.serializer(), "streamEagleLastTradePrices", arguments, null);
        return new Flow<List<? extends FuturesQuote>>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractLastTradePrices$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractLastTradePrices$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractLastTradePrices$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$streamEventContractLastTradePrices$$inlined$map$1$2$1, reason: invalid class name */
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
                        List value = ((FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Emission) obj).getValue();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends FuturesQuote>> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getEventContractEvent(List<String> list, Continuation<? super EventContractEvent> continuation) throws IOException {
        C332611 c332611;
        if (continuation instanceof C332611) {
            c332611 = (C332611) continuation;
            int i = c332611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c332611.label = i - Integer.MIN_VALUE;
            } else {
                c332611 = new C332611(continuation);
            }
        }
        C332611 c3326112 = c332611;
        Object objCallSuspendFunction = c3326112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3326112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Endpoint_getEagleEvent.Arguments arguments = new Endpoint_getEagleEvent.Arguments(list);
            json.getSerializersModule();
            KSerializer<Endpoint_getEagleEvent.Arguments> kSerializerSerializer = Endpoint_getEagleEvent.Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            KSerializer<Endpoint_getEagleEvent.Emission> kSerializerSerializer2 = Endpoint_getEagleEvent.Emission.INSTANCE.serializer();
            c3326112.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, kSerializerSerializer2, "getEagleEvent", arguments, c3326112);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getEagleEvent.Emission) objCallSuspendFunction).m22375unboximpl();
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getFuturesHistorical implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getFuturesHistorical(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.call$lambda$1(this.f$0, (FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_getFuturesHistorical endpoint_getFuturesHistorical, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesHistorical> futuresHistorical = endpoint_getFuturesHistorical.service.getFuturesHistorical(it.getContractId(), it.getInterval(), it.getStart(), it.getEnd());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$call$lambda$1$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Emission emissionM22398boximpl = FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Emission.m22398boximpl(FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Emission.m22399constructorimpl((FuturesHistorical) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22398boximpl, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = futuresHistorical.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\fHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Arguments;", "", "contractId", "", "interval", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "start", "", "end", "<init>", "(Ljava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContractId", "()Ljava/lang/String;", "getInterval", "()Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "getStart", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;)Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final String contractId;
            private final Long end;
            private final FuturesHistorical7 interval;
            private final long start;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Arguments$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesHistorical.Arguments._childSerializers$_anonymous_();
                }
            }), null, null};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return FuturesHistorical7.INSTANCE.serializer();
            }

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, FuturesHistorical7 futuresHistorical7, long j, Long l, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.contractId;
                }
                if ((i & 2) != 0) {
                    futuresHistorical7 = arguments.interval;
                }
                if ((i & 4) != 0) {
                    j = arguments.start;
                }
                if ((i & 8) != 0) {
                    l = arguments.end;
                }
                Long l2 = l;
                return arguments.copy(str, futuresHistorical7, j, l2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractId() {
                return this.contractId;
            }

            /* renamed from: component2, reason: from getter */
            public final FuturesHistorical7 getInterval() {
                return this.interval;
            }

            /* renamed from: component3, reason: from getter */
            public final long getStart() {
                return this.start;
            }

            /* renamed from: component4, reason: from getter */
            public final Long getEnd() {
                return this.end;
            }

            public final Arguments copy(String contractId, FuturesHistorical7 interval, long start, Long end) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(interval, "interval");
                return new Arguments(contractId, interval, start, end);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.contractId, arguments.contractId) && this.interval == arguments.interval && this.start == arguments.start && Intrinsics.areEqual(this.end, arguments.end);
            }

            public int hashCode() {
                int iHashCode = ((((this.contractId.hashCode() * 31) + this.interval.hashCode()) * 31) + Long.hashCode(this.start)) * 31;
                Long l = this.end;
                return iHashCode + (l == null ? 0 : l.hashCode());
            }

            public String toString() {
                return "Arguments(contractId=" + this.contractId + ", interval=" + this.interval + ", start=" + this.start + ", end=" + this.end + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33225xa3329483.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, FuturesHistorical7 futuresHistorical7, long j, Long l, SerializationConstructorMarker serializationConstructorMarker) {
                if (15 != (i & 15)) {
                    PluginExceptions.throwMissingFieldException(i, 15, C33225xa3329483.INSTANCE.getDescriptor());
                }
                this.contractId = str;
                this.interval = futuresHistorical7;
                this.start = j;
                this.end = l;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.contractId);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.interval);
                output.encodeLongElement(serialDesc, 2, self.start);
                output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.end);
            }

            public Arguments(String contractId, FuturesHistorical7 interval, long j, Long l) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(interval, "interval");
                this.contractId = contractId;
                this.interval = interval;
                this.start = j;
                this.end = l;
            }

            public final String getContractId() {
                return this.contractId;
            }

            public final FuturesHistorical7 getInterval() {
                return this.interval;
            }

            public final long getStart() {
                return this.start;
            }

            public final Long getEnd() {
                return this.end;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;)Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesHistorical value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22398boximpl(FuturesHistorical futuresHistorical) {
                return new Emission(futuresHistorical);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesHistorical m22399constructorimpl(FuturesHistorical value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22400equalsimpl(FuturesHistorical futuresHistorical, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresHistorical, ((Emission) obj).m22404unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22401equalsimpl0(FuturesHistorical futuresHistorical, FuturesHistorical futuresHistorical2) {
                return Intrinsics.areEqual(futuresHistorical, futuresHistorical2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22402hashCodeimpl(FuturesHistorical futuresHistorical) {
                return futuresHistorical.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22403toStringimpl(FuturesHistorical futuresHistorical) {
                return "Emission(value=" + futuresHistorical + ")";
            }

            public boolean equals(Object obj) {
                return m22400equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22402hashCodeimpl(this.value);
            }

            public String toString() {
                return m22403toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesHistorical m22404unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistorical$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33226x11e3b9e.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesHistorical futuresHistorical) {
                this.value = futuresHistorical;
            }

            public final FuturesHistorical getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getFuturesHistoricalForProduct implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getFuturesHistoricalForProduct(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.call$lambda$1(this.f$0, (FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_getFuturesHistoricalForProduct endpoint_getFuturesHistoricalForProduct, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesHistorical> futuresHistoricalForProduct = endpoint_getFuturesHistoricalForProduct.service.getFuturesHistoricalForProduct(it.getProductId(), it.getInterval(), it.getStart(), it.getEnd());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = futuresHistoricalForProduct.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.Emission emissionM22405boximpl = FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.Emission.m22405boximpl(FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.Emission.m22406constructorimpl((FuturesHistorical) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22405boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\fHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Arguments;", "", "productId", "", "interval", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "start", "", "end", "<init>", "(Ljava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getProductId", "()Ljava/lang/String;", "getInterval", "()Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "getStart", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;)Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final Long end;
            private final FuturesHistorical7 interval;
            private final String productId;
            private final long start;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Arguments$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesHistoricalForProduct.Arguments._childSerializers$_anonymous_();
                }
            }), null, null};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return FuturesHistorical7.INSTANCE.serializer();
            }

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, FuturesHistorical7 futuresHistorical7, long j, Long l, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.productId;
                }
                if ((i & 2) != 0) {
                    futuresHistorical7 = arguments.interval;
                }
                if ((i & 4) != 0) {
                    j = arguments.start;
                }
                if ((i & 8) != 0) {
                    l = arguments.end;
                }
                Long l2 = l;
                return arguments.copy(str, futuresHistorical7, j, l2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getProductId() {
                return this.productId;
            }

            /* renamed from: component2, reason: from getter */
            public final FuturesHistorical7 getInterval() {
                return this.interval;
            }

            /* renamed from: component3, reason: from getter */
            public final long getStart() {
                return this.start;
            }

            /* renamed from: component4, reason: from getter */
            public final Long getEnd() {
                return this.end;
            }

            public final Arguments copy(String productId, FuturesHistorical7 interval, long start, Long end) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(interval, "interval");
                return new Arguments(productId, interval, start, end);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.productId, arguments.productId) && this.interval == arguments.interval && this.start == arguments.start && Intrinsics.areEqual(this.end, arguments.end);
            }

            public int hashCode() {
                int iHashCode = ((((this.productId.hashCode() * 31) + this.interval.hashCode()) * 31) + Long.hashCode(this.start)) * 31;
                Long l = this.end;
                return iHashCode + (l == null ? 0 : l.hashCode());
            }

            public String toString() {
                return "Arguments(productId=" + this.productId + ", interval=" + this.interval + ", start=" + this.start + ", end=" + this.end + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33230xc5c59149.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, FuturesHistorical7 futuresHistorical7, long j, Long l, SerializationConstructorMarker serializationConstructorMarker) {
                if (15 != (i & 15)) {
                    PluginExceptions.throwMissingFieldException(i, 15, C33230xc5c59149.INSTANCE.getDescriptor());
                }
                this.productId = str;
                this.interval = futuresHistorical7;
                this.start = j;
                this.end = l;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.productId);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.interval);
                output.encodeLongElement(serialDesc, 2, self.start);
                output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.end);
            }

            public Arguments(String productId, FuturesHistorical7 interval, long j, Long l) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(interval, "interval");
                this.productId = productId;
                this.interval = interval;
                this.start = j;
                this.end = l;
            }

            public final String getProductId() {
                return this.productId;
            }

            public final FuturesHistorical7 getInterval() {
                return this.interval;
            }

            public final long getStart() {
                return this.start;
            }

            public final Long getEnd() {
                return this.end;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;)Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesHistorical value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22405boximpl(FuturesHistorical futuresHistorical) {
                return new Emission(futuresHistorical);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesHistorical m22406constructorimpl(FuturesHistorical value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22407equalsimpl(FuturesHistorical futuresHistorical, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresHistorical, ((Emission) obj).m22411unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22408equalsimpl0(FuturesHistorical futuresHistorical, FuturesHistorical futuresHistorical2) {
                return Intrinsics.areEqual(futuresHistorical, futuresHistorical2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22409hashCodeimpl(FuturesHistorical futuresHistorical) {
                return futuresHistorical.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22410toStringimpl(FuturesHistorical futuresHistorical) {
                return "Emission(value=" + futuresHistorical + ")";
            }

            public boolean equals(Object obj) {
                return m22407equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22409hashCodeimpl(this.value);
            }

            public String toString() {
                return m22410toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesHistorical m22411unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesHistoricalForProduct$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33231xe9758e18.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesHistorical futuresHistorical) {
                this.value = futuresHistorical;
            }

            public final FuturesHistorical getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getFuturesClosesRange implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getFuturesClosesRange(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.call$lambda$1(this.f$0, (FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_getFuturesClosesRange endpoint_getFuturesClosesRange, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<List<FuturesClosePrice>> futuresClosesRange = endpoint_getFuturesClosesRange.service.getFuturesClosesRange(it.getContractId(), it.getStart(), it.getEnd());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = futuresClosesRange.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.Emission emissionM22384boximpl = FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.Emission.m22384boximpl(FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.Emission.m22385constructorimpl((List) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22384boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Arguments;", "", "contractId", "", "start", "", "end", "<init>", "(Ljava/lang/String;JLjava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContractId", "()Ljava/lang/String;", "getStart", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;JLjava/lang/Long;)Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Arguments;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String contractId;
            private final Long end;
            private final long start;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, long j, Long l, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.contractId;
                }
                if ((i & 2) != 0) {
                    j = arguments.start;
                }
                if ((i & 4) != 0) {
                    l = arguments.end;
                }
                return arguments.copy(str, j, l);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractId() {
                return this.contractId;
            }

            /* renamed from: component2, reason: from getter */
            public final long getStart() {
                return this.start;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getEnd() {
                return this.end;
            }

            public final Arguments copy(String contractId, long start, Long end) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                return new Arguments(contractId, start, end);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.contractId, arguments.contractId) && this.start == arguments.start && Intrinsics.areEqual(this.end, arguments.end);
            }

            public int hashCode() {
                int iHashCode = ((this.contractId.hashCode() * 31) + Long.hashCode(this.start)) * 31;
                Long l = this.end;
                return iHashCode + (l == null ? 0 : l.hashCode());
            }

            public String toString() {
                return "Arguments(contractId=" + this.contractId + ", start=" + this.start + ", end=" + this.end + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33217xa571d7b1.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, long j, Long l, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C33217xa571d7b1.INSTANCE.getDescriptor());
                }
                this.contractId = str;
                this.start = j;
                this.end = l;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.contractId);
                output.encodeLongElement(serialDesc, 1, self.start);
                output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.end);
            }

            public Arguments(String contractId, long j, Long l) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.contractId = contractId;
                this.start = j;
                this.end = l;
            }

            public final String getContractId() {
                return this.contractId;
            }

            public final long getStart() {
                return this.start;
            }

            public final Long getEnd() {
                return this.end;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Emission;", "", "value", "", "Lcom/robinhood/futures/charts/contracts/models/FuturesClosePrice;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<FuturesClosePrice> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Emission$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesClosesRange.Emission._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(FuturesClosePrice2.INSTANCE);
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22384boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends FuturesClosePrice> m22385constructorimpl(List<FuturesClosePrice> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22386equalsimpl(List<? extends FuturesClosePrice> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22387equalsimpl0(List<? extends FuturesClosePrice> list, List<? extends FuturesClosePrice> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22388hashCodeimpl(List<? extends FuturesClosePrice> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22389toStringimpl(List<? extends FuturesClosePrice> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m22386equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22388hashCodeimpl(this.value);
            }

            public String toString() {
                return m22389toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosesRange$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33219x972dab0.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<FuturesClosePrice> getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getFuturesClosePrice implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getFuturesClosePrice(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesClosePrice.call$lambda$1(this.f$0, (FuturesChartsClientService_Adapter.Endpoint_getFuturesClosePrice.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_getFuturesClosePrice endpoint_getFuturesClosePrice, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesPrevClosePrice> futuresClosePrice = endpoint_getFuturesClosePrice.service.getFuturesClosePrice(it.getContractId());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesClosePrice.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = futuresClosePrice.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsClientService_Adapter.Endpoint_getFuturesClosePrice.Emission emissionM22376boximpl = FuturesChartsClientService_Adapter.Endpoint_getFuturesClosePrice.Emission.m22376boximpl(FuturesChartsClientService_Adapter.Endpoint_getFuturesClosePrice.Emission.m22377constructorimpl((FuturesPrevClosePrice) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22376boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$Arguments;", "", "contractId", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContractId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String contractId;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.contractId;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractId() {
                return this.contractId;
            }

            public final Arguments copy(String contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                return new Arguments(contractId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.contractId, ((Arguments) other).contractId);
            }

            public int hashCode() {
                return this.contractId.hashCode();
            }

            public String toString() {
                return "Arguments(contractId=" + this.contractId + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33213x22783eaa.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33213x22783eaa.INSTANCE.getDescriptor());
                }
                this.contractId = str;
            }

            public Arguments(String contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.contractId = contractId;
            }

            public final String getContractId() {
                return this.contractId;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;)Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesPrevClosePrice value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22376boximpl(FuturesPrevClosePrice futuresPrevClosePrice) {
                return new Emission(futuresPrevClosePrice);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesPrevClosePrice m22377constructorimpl(FuturesPrevClosePrice value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22378equalsimpl(FuturesPrevClosePrice futuresPrevClosePrice, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresPrevClosePrice, ((Emission) obj).m22382unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22379equalsimpl0(FuturesPrevClosePrice futuresPrevClosePrice, FuturesPrevClosePrice futuresPrevClosePrice2) {
                return Intrinsics.areEqual(futuresPrevClosePrice, futuresPrevClosePrice2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22380hashCodeimpl(FuturesPrevClosePrice futuresPrevClosePrice) {
                return futuresPrevClosePrice.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22381toStringimpl(FuturesPrevClosePrice futuresPrevClosePrice) {
                return "Emission(value=" + futuresPrevClosePrice + ")";
            }

            public boolean equals(Object obj) {
                return m22378equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22380hashCodeimpl(this.value);
            }

            public String toString() {
                return m22381toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesPrevClosePrice m22382unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesClosePrice$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33214xfcf73097.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesPrevClosePrice futuresPrevClosePrice) {
                this.value = futuresPrevClosePrice;
            }

            public final FuturesPrevClosePrice getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getFuturesLastTradePrice implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getFuturesLastTradePrice(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsClientService_Adapter.Endpoint_getFuturesLastTradePrice.call$lambda$1(this.f$0, (FuturesChartsClientService_Adapter.Endpoint_getFuturesLastTradePrice.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_getFuturesLastTradePrice endpoint_getFuturesLastTradePrice, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<Double> futuresLastTradePrice = endpoint_getFuturesLastTradePrice.service.getFuturesLastTradePrice(it.getContractId());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsClientService_Adapter.Endpoint_getFuturesLastTradePrice.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = futuresLastTradePrice.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsClientService_Adapter.Endpoint_getFuturesLastTradePrice.Emission emissionM22413boximpl = FuturesChartsClientService_Adapter.Endpoint_getFuturesLastTradePrice.Emission.m22413boximpl(FuturesChartsClientService_Adapter.Endpoint_getFuturesLastTradePrice.Emission.m22414constructorimpl(((Number) obj).doubleValue()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22413boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$Arguments;", "", "contractId", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContractId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String contractId;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.contractId;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractId() {
                return this.contractId;
            }

            public final Arguments copy(String contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                return new Arguments(contractId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.contractId, ((Arguments) other).contractId);
            }

            public int hashCode() {
                return this.contractId.hashCode();
            }

            public String toString() {
                return "Arguments(contractId=" + this.contractId + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33234xddf2d3f4.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33234xddf2d3f4.INSTANCE.getDescriptor());
                }
                this.contractId = str;
            }

            public Arguments(String contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.contractId = contractId;
            }

            public final String getContractId() {
                return this.contractId;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$Emission;", "", "value", "", "constructor-impl", "(D)D", "getValue", "()D", "equals", "", "other", "equals-impl", "(DLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(D)I", "toString", "", "toString-impl", "(D)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22413boximpl(double d) {
                return new Emission(d);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static double m22414constructorimpl(double d) {
                return d;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22415equalsimpl(double d, Object obj) {
                return (obj instanceof Emission) && Double.compare(d, ((Emission) obj).m22419unboximpl()) == 0;
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22416equalsimpl0(double d, double d2) {
                return Double.compare(d, d2) == 0;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22417hashCodeimpl(double d) {
                return Double.hashCode(d);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22418toStringimpl(double d) {
                return "Emission(value=" + d + ")";
            }

            public boolean equals(Object obj) {
                return m22415equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22417hashCodeimpl(this.value);
            }

            public String toString() {
                return m22418toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ double m22419unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesLastTradePrice$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33235x348fca0d.INSTANCE;
                }
            }

            private /* synthetic */ Emission(double d) {
                this.value = d;
            }

            public final double getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getFuturesContract implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getFuturesContract(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C33259x358e8008 c33259x358e8008 = new C33259x358e8008(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c33259x358e8008);
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Arguments;", "", "contractId", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContractId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String contractId;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.contractId;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractId() {
                return this.contractId;
            }

            public final Arguments copy(String contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                return new Arguments(contractId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.contractId, ((Arguments) other).contractId);
            }

            public int hashCode() {
                return this.contractId.hashCode();
            }

            public String toString() {
                return "Arguments(contractId=" + this.contractId + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33221x9fa0440b.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33221x9fa0440b.INSTANCE.getDescriptor());
                }
                this.contractId = str;
            }

            public Arguments(String contractId) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                this.contractId = contractId;
            }

            public final String getContractId() {
                return this.contractId;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesContract;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesContract;)Lcom/robinhood/futures/charts/contracts/models/FuturesContract;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesContract;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesContract;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesContract;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesContract;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesContract value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22391boximpl(FuturesContract futuresContract) {
                return new Emission(futuresContract);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesContract m22392constructorimpl(FuturesContract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22393equalsimpl(FuturesContract futuresContract, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresContract, ((Emission) obj).m22397unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22394equalsimpl0(FuturesContract futuresContract, FuturesContract futuresContract2) {
                return Intrinsics.areEqual(futuresContract, futuresContract2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22395hashCodeimpl(FuturesContract futuresContract) {
                return futuresContract.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22396toStringimpl(FuturesContract futuresContract) {
                return "Emission(value=" + futuresContract + ")";
            }

            public boolean equals(Object obj) {
                return m22393equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22395hashCodeimpl(this.value);
            }

            public String toString() {
                return m22396toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesContract m22397unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesContract$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33222xdff87b16.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesContract futuresContract) {
                this.value = futuresContract;
            }

            public final FuturesContract getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getFuturesProduct implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getFuturesProduct(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            C33260xff4a3295 c33260xff4a3295 = new C33260xff4a3295(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, c33260xff4a3295);
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Arguments;", "", "productId", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getProductId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String productId;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.productId;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getProductId() {
                return this.productId;
            }

            public final Arguments copy(String productId) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                return new Arguments(productId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.productId, ((Arguments) other).productId);
            }

            public int hashCode() {
                return this.productId.hashCode();
            }

            public String toString() {
                return "Arguments(productId=" + this.productId + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33237x722185de.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33237x722185de.INSTANCE.getDescriptor());
                }
                this.productId = str;
            }

            public Arguments(String productId) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                this.productId = productId;
            }

            public final String getProductId() {
                return this.productId;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;)Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesProduct value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22420boximpl(FuturesProduct futuresProduct) {
                return new Emission(futuresProduct);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesProduct m22421constructorimpl(FuturesProduct value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22422equalsimpl(FuturesProduct futuresProduct, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresProduct, ((Emission) obj).m22426unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22423equalsimpl0(FuturesProduct futuresProduct, FuturesProduct futuresProduct2) {
                return Intrinsics.areEqual(futuresProduct, futuresProduct2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22424hashCodeimpl(FuturesProduct futuresProduct) {
                return futuresProduct.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22425toStringimpl(FuturesProduct futuresProduct) {
                return "Emission(value=" + futuresProduct + ")";
            }

            public boolean equals(Object obj) {
                return m22422equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22424hashCodeimpl(this.value);
            }

            public String toString() {
                return m22425toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesProduct m22426unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getFuturesProduct$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33238x942e32e3.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesProduct futuresProduct) {
                this.value = futuresProduct;
            }

            public final FuturesProduct getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamEagleHistoricals implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_streamEagleHistoricals(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.call$lambda$1(this.f$0, (FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamEagleHistoricals endpoint_streamEagleHistoricals, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<List<FuturesHistorical>> flowStreamEventContractHistoricals = endpoint_streamEagleHistoricals.service.streamEventContractHistoricals(it.getEventContractIds(), it.getInterval(), it.getStart());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamEventContractHistoricals.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Emission emissionM22427boximpl = FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Emission.m22427boximpl(FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Emission.m22428constructorimpl((List) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22427boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Arguments;", "", "eventContractIds", "", "", "interval", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "start", "", "<init>", "(Ljava/util/List;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEventContractIds", "()Ljava/util/List;", "getInterval", "()Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "getStart", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final List<String> eventContractIds;
            private final FuturesHistorical7 interval;
            private final long start;

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return FuturesHistorical7.INSTANCE.serializer();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Arguments copy$default(Arguments arguments, List list, FuturesHistorical7 futuresHistorical7, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = arguments.eventContractIds;
                }
                if ((i & 2) != 0) {
                    futuresHistorical7 = arguments.interval;
                }
                if ((i & 4) != 0) {
                    j = arguments.start;
                }
                return arguments.copy(list, futuresHistorical7, j);
            }

            public final List<String> component1() {
                return this.eventContractIds;
            }

            /* renamed from: component2, reason: from getter */
            public final FuturesHistorical7 getInterval() {
                return this.interval;
            }

            /* renamed from: component3, reason: from getter */
            public final long getStart() {
                return this.start;
            }

            public final Arguments copy(List<String> eventContractIds, FuturesHistorical7 interval, long start) {
                Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
                Intrinsics.checkNotNullParameter(interval, "interval");
                return new Arguments(eventContractIds, interval, start);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.eventContractIds, arguments.eventContractIds) && this.interval == arguments.interval && this.start == arguments.start;
            }

            public int hashCode() {
                return (((this.eventContractIds.hashCode() * 31) + this.interval.hashCode()) * 31) + Long.hashCode(this.start);
            }

            public String toString() {
                return "Arguments(eventContractIds=" + this.eventContractIds + ", interval=" + this.interval + ", start=" + this.start + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33242x399503a4.INSTANCE;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Arguments$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Arguments._childSerializers$_anonymous_();
                    }
                }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Arguments$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Arguments._childSerializers$_anonymous_$0();
                    }
                }), null};
            }

            public /* synthetic */ Arguments(int i, List list, FuturesHistorical7 futuresHistorical7, long j, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C33242x399503a4.INSTANCE.getDescriptor());
                }
                this.eventContractIds = list;
                this.interval = futuresHistorical7;
                this.start = j;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.eventContractIds);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.interval);
                output.encodeLongElement(serialDesc, 2, self.start);
            }

            public Arguments(List<String> eventContractIds, FuturesHistorical7 interval, long j) {
                Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
                Intrinsics.checkNotNullParameter(interval, "interval");
                this.eventContractIds = eventContractIds;
                this.interval = interval;
                this.start = j;
            }

            public final List<String> getEventContractIds() {
                return this.eventContractIds;
            }

            public final FuturesHistorical7 getInterval() {
                return this.interval;
            }

            public final long getStart() {
                return this.start;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Emission;", "", "value", "", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<FuturesHistorical> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Emission$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsClientService_Adapter.Endpoint_streamEagleHistoricals.Emission._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(FuturesHistorical3.INSTANCE);
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22427boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends FuturesHistorical> m22428constructorimpl(List<FuturesHistorical> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22429equalsimpl(List<? extends FuturesHistorical> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22430equalsimpl0(List<? extends FuturesHistorical> list, List<? extends FuturesHistorical> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22431hashCodeimpl(List<? extends FuturesHistorical> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22432toStringimpl(List<? extends FuturesHistorical> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m22429equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22431hashCodeimpl(this.value);
            }

            public String toString() {
                return m22432toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleHistoricals$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33244x6910e45d.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<FuturesHistorical> getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamEagleLastTradePrices implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_streamEagleLastTradePrices(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.call$lambda$1(this.f$0, (FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamEagleLastTradePrices endpoint_streamEagleLastTradePrices, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<List<FuturesQuote>> flowStreamEventContractLastTradePrices = endpoint_streamEagleLastTradePrices.service.streamEventContractLastTradePrices(it.getEventContractIds());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamEventContractLastTradePrices.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsClientService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Emission emissionM22435boximpl = FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Emission.m22435boximpl(FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Emission.m22436constructorimpl((List) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22435boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Arguments;", "", "eventContractIds", "", "", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEventContractIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final List<String> eventContractIds;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Arguments$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Arguments._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Arguments copy$default(Arguments arguments, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = arguments.eventContractIds;
                }
                return arguments.copy(list);
            }

            public final List<String> component1() {
                return this.eventContractIds;
            }

            public final Arguments copy(List<String> eventContractIds) {
                Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
                return new Arguments(eventContractIds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.eventContractIds, ((Arguments) other).eventContractIds);
            }

            public int hashCode() {
                return this.eventContractIds.hashCode();
            }

            public String toString() {
                return "Arguments(eventContractIds=" + this.eventContractIds + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33248x64366c53.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33248x64366c53.INSTANCE.getDescriptor());
                }
                this.eventContractIds = list;
            }

            public Arguments(List<String> eventContractIds) {
                Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
                this.eventContractIds = eventContractIds;
            }

            public final List<String> getEventContractIds() {
                return this.eventContractIds;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Emission;", "", "value", "", "Lcom/robinhood/futures/charts/contracts/models/FuturesQuote;", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "equals", "", "other", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "toString", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {
            private final List<FuturesQuote> value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Emission$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsClientService_Adapter.Endpoint_streamEagleLastTradePrices.Emission._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(FuturesQuote3.INSTANCE);
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22435boximpl(List list) {
                return new Emission(list);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends FuturesQuote> m22436constructorimpl(List<FuturesQuote> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22437equalsimpl(List<? extends FuturesQuote> list, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(list, ((Emission) obj).getValue());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22438equalsimpl0(List<? extends FuturesQuote> list, List<? extends FuturesQuote> list2) {
                return Intrinsics.areEqual(list, list2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22439hashCodeimpl(List<? extends FuturesQuote> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22440toStringimpl(List<? extends FuturesQuote> list) {
                return "Emission(value=" + list + ")";
            }

            public boolean equals(Object obj) {
                return m22437equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22439hashCodeimpl(this.value);
            }

            public String toString() {
                return m22440toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getValue() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_streamEagleLastTradePrices$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33250x75829ce.INSTANCE;
                }
            }

            private /* synthetic */ Emission(List list) {
                this.value = list;
            }

            public final List<FuturesQuote> getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getEagleEvent implements ServiceCallable {
        private final Json json;
        private final FuturesChartsClientService service;

        public Endpoint_getEagleEvent(FuturesChartsClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1 futuresChartsClientService_Adapter$Endpoint_getEagleEvent$call$1 = new FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, futuresChartsClientService_Adapter$Endpoint_getEagleEvent$call$1);
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Arguments;", "", "eventContractIds", "", "", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEventContractIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final List<String> eventContractIds;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Arguments$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsClientService_Adapter.Endpoint_getEagleEvent.Arguments._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Arguments copy$default(Arguments arguments, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = arguments.eventContractIds;
                }
                return arguments.copy(list);
            }

            public final List<String> component1() {
                return this.eventContractIds;
            }

            public final Arguments copy(List<String> eventContractIds) {
                Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
                return new Arguments(eventContractIds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.eventContractIds, ((Arguments) other).eventContractIds);
            }

            public int hashCode() {
                return this.eventContractIds.hashCode();
            }

            public String toString() {
                return "Arguments(eventContractIds=" + this.eventContractIds + ")";
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33210x84e2d755.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C33210x84e2d755.INSTANCE.getDescriptor());
                }
                this.eventContractIds = list;
            }

            public Arguments(List<String> eventContractIds) {
                Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
                this.eventContractIds = eventContractIds;
            }

            public final List<String> getEventContractIds() {
                return this.eventContractIds;
            }
        }

        /* compiled from: FuturesChartsClientService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;)Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final EventContractEvent value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22369boximpl(EventContractEvent eventContractEvent) {
                return new Emission(eventContractEvent);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static EventContractEvent m22370constructorimpl(EventContractEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22371equalsimpl(EventContractEvent eventContractEvent, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(eventContractEvent, ((Emission) obj).m22375unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22372equalsimpl0(EventContractEvent eventContractEvent, EventContractEvent eventContractEvent2) {
                return Intrinsics.areEqual(eventContractEvent, eventContractEvent2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22373hashCodeimpl(EventContractEvent eventContractEvent) {
                return eventContractEvent.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22374toStringimpl(EventContractEvent eventContractEvent) {
                return "Emission(value=" + eventContractEvent + ")";
            }

            public boolean equals(Object obj) {
                return m22371equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22373hashCodeimpl(this.value);
            }

            public String toString() {
                return m22374toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ EventContractEvent m22375unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsClientService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService_Adapter$Endpoint_getEagleEvent$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33211xb5d1568c.INSTANCE;
                }
            }

            private /* synthetic */ Emission(EventContractEvent eventContractEvent) {
                this.value = eventContractEvent;
            }

            public final EventContractEvent getValue() {
                return this.value;
            }
        }
    }
}
