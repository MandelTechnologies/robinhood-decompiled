package com.robinhood.futures.charts.contracts;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter;
import com.robinhood.futures.charts.contracts.models.EventContractRequest;
import com.robinhood.futures.charts.contracts.models.EventContractRequest2;
import com.robinhood.futures.charts.contracts.models.FuturesChartResponse;
import com.robinhood.futures.charts.contracts.models.FuturesChartResponseJson;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical4;
import com.robinhood.futures.charts.contracts.models.FuturesPerformanceChartResponse;
import com.robinhood.futures.charts.contracts.models.FuturesPerformanceChartResponseJson;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.p507ui.sdui.SduiDisplaySpan;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: FuturesChartsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0006)*+,-.B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b!\u0010\u0015J5\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001bJ%\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00122\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(¨\u0006/"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "contractId", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "span", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;", "chartType", "", "isContinuous", "isSparkline", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "streamFuturesChart", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/futures/charts/contracts/models/EventContractRequest;", "requests", "fillEntireWidth", "streamEventContractChart", "(Ljava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "accountNumber", "Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;", "streamFuturesPerformanceChart", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "streamFuturesChartJson", "streamEventContractChartJson", "Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;", "streamFuturesPerformanceChartJson", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_streamFuturesChart", "Endpoint_streamEagleChart", "Endpoint_streamFuturesPerformanceChart", "Endpoint_streamFuturesChartJson", "Endpoint_streamEagleChartJson", "Endpoint_streamFuturesPerformanceChartJson", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class FuturesChartsService_Adapter implements FuturesChartsService {
    private final ClientBridge __bridge;
    private final Json json;

    public FuturesChartsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsService
    public Flow<FuturesChartResponse> streamFuturesChart(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean isContinuous, Boolean isSparkline) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamFuturesChart.Arguments arguments = new Endpoint_streamFuturesChart.Arguments(contractId, span, chartType, isContinuous, isSparkline);
        json.getSerializersModule();
        KSerializer<Endpoint_streamFuturesChart.Arguments> kSerializerSerializer = Endpoint_streamFuturesChart.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamFuturesChart.Emission.INSTANCE.serializer(), "streamFuturesChart", arguments, null);
        return new Flow<FuturesChartResponse>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChart$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChart$$inlined$map$1$2 */
            public static final class C333012<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChart$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChart$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C333012.this.emit(null, this);
                    }
                }

                public C333012(FlowCollector flowCollector) {
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
                        FuturesChartResponse futuresChartResponseM22476unboximpl = ((FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Emission) obj).m22476unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresChartResponseM22476unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesChartResponse> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new C333012(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsService
    public Flow<FuturesChartResponse> streamEventContractChart(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean fillEntireWidth) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(span, "span");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamEagleChart.Arguments arguments = new Endpoint_streamEagleChart.Arguments(requests, span, fillEntireWidth);
        json.getSerializersModule();
        KSerializer<Endpoint_streamEagleChart.Arguments> kSerializerSerializer = Endpoint_streamEagleChart.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamEagleChart.Emission.INSTANCE.serializer(), "streamEagleChart", arguments, null);
        return new Flow<FuturesChartResponse>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChart$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChart$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChart$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChart$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesChartResponse futuresChartResponseM22460unboximpl = ((FuturesChartsService_Adapter.Endpoint_streamEagleChart.Emission) obj).m22460unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresChartResponseM22460unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesChartResponse> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsService
    public Flow<FuturesPerformanceChartResponse> streamFuturesPerformanceChart(String accountNumber, SduiDisplaySpan span) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(span, "span");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamFuturesPerformanceChart.Arguments arguments = new Endpoint_streamFuturesPerformanceChart.Arguments(accountNumber, span);
        json.getSerializersModule();
        KSerializer<Endpoint_streamFuturesPerformanceChart.Arguments> kSerializerSerializer = Endpoint_streamFuturesPerformanceChart.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamFuturesPerformanceChart.Emission.INSTANCE.serializer(), "streamFuturesPerformanceChart", arguments, null);
        return new Flow<FuturesPerformanceChartResponse>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChart$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChart$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChart$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChart$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesPerformanceChartResponse futuresPerformanceChartResponseM22491unboximpl = ((FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.Emission) obj).m22491unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresPerformanceChartResponseM22491unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesPerformanceChartResponse> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsService
    public Flow<FuturesChartResponseJson> streamFuturesChartJson(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean isContinuous, Boolean isSparkline) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamFuturesChartJson.Arguments arguments = new Endpoint_streamFuturesChartJson.Arguments(contractId, span, chartType, isContinuous, isSparkline);
        json.getSerializersModule();
        KSerializer<Endpoint_streamFuturesChartJson.Arguments> kSerializerSerializer = Endpoint_streamFuturesChartJson.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamFuturesChartJson.Emission.INSTANCE.serializer(), "streamFuturesChartJson", arguments, null);
        return new Flow<FuturesChartResponseJson>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChartJson$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChartJson$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChartJson$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesChartJson$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesChartResponseJson futuresChartResponseJsonM22484unboximpl = ((FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Emission) obj).m22484unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresChartResponseJsonM22484unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesChartResponseJson> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsService
    public Flow<FuturesChartResponseJson> streamEventContractChartJson(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean fillEntireWidth) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(span, "span");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamEagleChartJson.Arguments arguments = new Endpoint_streamEagleChartJson.Arguments(requests, span, fillEntireWidth);
        json.getSerializersModule();
        KSerializer<Endpoint_streamEagleChartJson.Arguments> kSerializerSerializer = Endpoint_streamEagleChartJson.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamEagleChartJson.Emission.INSTANCE.serializer(), "streamEagleChartJson", arguments, null);
        return new Flow<FuturesChartResponseJson>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChartJson$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChartJson$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChartJson$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamEventContractChartJson$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesChartResponseJson futuresChartResponseJsonM22468unboximpl = ((FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Emission) obj).m22468unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresChartResponseJsonM22468unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesChartResponseJson> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsService
    public Flow<FuturesPerformanceChartResponseJson> streamFuturesPerformanceChartJson(String accountNumber, SduiDisplaySpan span) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(span, "span");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_streamFuturesPerformanceChartJson.Arguments arguments = new Endpoint_streamFuturesPerformanceChartJson.Arguments(accountNumber, span);
        json.getSerializersModule();
        KSerializer<Endpoint_streamFuturesPerformanceChartJson.Arguments> kSerializerSerializer = Endpoint_streamFuturesPerformanceChartJson.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_streamFuturesPerformanceChartJson.Emission.INSTANCE.serializer(), "streamFuturesPerformanceChartJson", arguments, null);
        return new Flow<FuturesPerformanceChartResponseJson>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChartJson$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChartJson$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChartJson$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$streamFuturesPerformanceChartJson$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJsonM22499unboximpl = ((FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Emission) obj).m22499unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresPerformanceChartResponseJsonM22499unboximpl, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super FuturesPerformanceChartResponseJson> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* compiled from: FuturesChartsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamFuturesChart implements ServiceCallable {
        private final Json json;
        private final FuturesChartsService service;

        public Endpoint_streamFuturesChart(FuturesChartsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChart$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsService_Adapter.Endpoint_streamFuturesChart.call$lambda$1(this.f$0, (FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamFuturesChart endpoint_streamFuturesChart, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesChartResponse> flowStreamFuturesChart = endpoint_streamFuturesChart.service.streamFuturesChart(it.getContractId(), it.getSpan(), it.getChartType(), it.isContinuous(), it.isSparkline());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChart$call$lambda$1$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChart$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChart$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChart$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Emission emissionM22470boximpl = FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Emission.m22470boximpl(FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Emission.m22471constructorimpl((FuturesChartResponse) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22470boximpl, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamFuturesChart.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000eHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\n\u0010\u0019¨\u00060"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Arguments;", "", "contractId", "", "span", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "chartType", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;", "isContinuous", "", "isSparkline", "<init>", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContractId", "()Ljava/lang/String;", "getSpan", "()Lmicrogram/ui/sdui/SduiDisplaySpan;", "getChartType", "()Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;)Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Arguments;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesHistorical4 chartType;
            private final String contractId;
            private final boolean isContinuous;
            private final Boolean isSparkline;
            private final SduiDisplaySpan span;

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return SduiDisplaySpan.INSTANCE.serializer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return FuturesHistorical4.INSTANCE.serializer();
            }

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, SduiDisplaySpan sduiDisplaySpan, FuturesHistorical4 futuresHistorical4, boolean z, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.contractId;
                }
                if ((i & 2) != 0) {
                    sduiDisplaySpan = arguments.span;
                }
                if ((i & 4) != 0) {
                    futuresHistorical4 = arguments.chartType;
                }
                if ((i & 8) != 0) {
                    z = arguments.isContinuous;
                }
                if ((i & 16) != 0) {
                    bool = arguments.isSparkline;
                }
                Boolean bool2 = bool;
                FuturesHistorical4 futuresHistorical42 = futuresHistorical4;
                return arguments.copy(str, sduiDisplaySpan, futuresHistorical42, z, bool2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractId() {
                return this.contractId;
            }

            /* renamed from: component2, reason: from getter */
            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            /* renamed from: component3, reason: from getter */
            public final FuturesHistorical4 getChartType() {
                return this.chartType;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsContinuous() {
                return this.isContinuous;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getIsSparkline() {
                return this.isSparkline;
            }

            public final Arguments copy(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean isContinuous, Boolean isSparkline) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(span, "span");
                Intrinsics.checkNotNullParameter(chartType, "chartType");
                return new Arguments(contractId, span, chartType, isContinuous, isSparkline);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.contractId, arguments.contractId) && this.span == arguments.span && this.chartType == arguments.chartType && this.isContinuous == arguments.isContinuous && Intrinsics.areEqual(this.isSparkline, arguments.isSparkline);
            }

            public int hashCode() {
                int iHashCode = ((((((this.contractId.hashCode() * 31) + this.span.hashCode()) * 31) + this.chartType.hashCode()) * 31) + Boolean.hashCode(this.isContinuous)) * 31;
                Boolean bool = this.isSparkline;
                return iHashCode + (bool == null ? 0 : bool.hashCode());
            }

            public String toString() {
                return "Arguments(contractId=" + this.contractId + ", span=" + this.span + ", chartType=" + this.chartType + ", isContinuous=" + this.isContinuous + ", isSparkline=" + this.isSparkline + ")";
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33280x622b1198.INSTANCE;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Arguments$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Arguments._childSerializers$_anonymous_();
                    }
                }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Arguments$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamFuturesChart.Arguments._childSerializers$_anonymous_$0();
                    }
                }), null, null};
            }

            public /* synthetic */ Arguments(int i, String str, SduiDisplaySpan sduiDisplaySpan, FuturesHistorical4 futuresHistorical4, boolean z, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
                if (31 != (i & 31)) {
                    PluginExceptions.throwMissingFieldException(i, 31, C33280x622b1198.INSTANCE.getDescriptor());
                }
                this.contractId = str;
                this.span = sduiDisplaySpan;
                this.chartType = futuresHistorical4;
                this.isContinuous = z;
                this.isSparkline = bool;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.contractId);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.span);
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.chartType);
                output.encodeBooleanElement(serialDesc, 3, self.isContinuous);
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.isSparkline);
            }

            public Arguments(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean z, Boolean bool) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(span, "span");
                Intrinsics.checkNotNullParameter(chartType, "chartType");
                this.contractId = contractId;
                this.span = span;
                this.chartType = chartType;
                this.isContinuous = z;
                this.isSparkline = bool;
            }

            public final String getContractId() {
                return this.contractId;
            }

            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            public final FuturesHistorical4 getChartType() {
                return this.chartType;
            }

            public final boolean isContinuous() {
                return this.isContinuous;
            }

            public final Boolean isSparkline() {
                return this.isSparkline;
            }
        }

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;)Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesChartResponse value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22470boximpl(FuturesChartResponse futuresChartResponse) {
                return new Emission(futuresChartResponse);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesChartResponse m22471constructorimpl(FuturesChartResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22472equalsimpl(FuturesChartResponse futuresChartResponse, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresChartResponse, ((Emission) obj).m22476unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22473equalsimpl0(FuturesChartResponse futuresChartResponse, FuturesChartResponse futuresChartResponse2) {
                return Intrinsics.areEqual(futuresChartResponse, futuresChartResponse2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22474hashCodeimpl(FuturesChartResponse futuresChartResponse) {
                return futuresChartResponse.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22475toStringimpl(FuturesChartResponse futuresChartResponse) {
                return "Emission(value=" + futuresChartResponse + ")";
            }

            public boolean equals(Object obj) {
                return m22472equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22474hashCodeimpl(this.value);
            }

            public String toString() {
                return m22475toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesChartResponse m22476unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChart$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33281x74747e9.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesChartResponse futuresChartResponse) {
                this.value = futuresChartResponse;
            }

            public final FuturesChartResponse getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamEagleChart implements ServiceCallable {
        private final Json json;
        private final FuturesChartsService service;

        public Endpoint_streamEagleChart(FuturesChartsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsService_Adapter.Endpoint_streamEagleChart.call$lambda$1(this.f$0, (FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamEagleChart endpoint_streamEagleChart, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesChartResponse> flowStreamEventContractChart = endpoint_streamEagleChart.service.streamEventContractChart(it.getRequests(), it.getSpan(), it.getFillEntireWidth());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsService_Adapter.Endpoint_streamEagleChart.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamEventContractChart.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsService_Adapter.Endpoint_streamEagleChart.Emission emissionM22454boximpl = FuturesChartsService_Adapter.Endpoint_streamEagleChart.Emission.m22454boximpl(FuturesChartsService_Adapter.Endpoint_streamEagleChart.Emission.m22455constructorimpl((FuturesChartResponse) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22454boximpl, anonymousClass1) == coroutine_suspended) {
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

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\fHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments;", "", "requests", "", "Lcom/robinhood/futures/charts/contracts/models/EventContractRequest;", "span", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "fillEntireWidth", "", "<init>", "(Ljava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRequests", "()Ljava/util/List;", "getSpan", "()Lmicrogram/ui/sdui/SduiDisplaySpan;", "getFillEntireWidth", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;)Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Boolean fillEntireWidth;
            private final List<EventContractRequest> requests;
            private final SduiDisplaySpan span;

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(EventContractRequest2.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return SduiDisplaySpan.INSTANCE.serializer();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Arguments copy$default(Arguments arguments, List list, SduiDisplaySpan sduiDisplaySpan, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = arguments.requests;
                }
                if ((i & 2) != 0) {
                    sduiDisplaySpan = arguments.span;
                }
                if ((i & 4) != 0) {
                    bool = arguments.fillEntireWidth;
                }
                return arguments.copy(list, sduiDisplaySpan, bool);
            }

            public final List<EventContractRequest> component1() {
                return this.requests;
            }

            /* renamed from: component2, reason: from getter */
            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            /* renamed from: component3, reason: from getter */
            public final Boolean getFillEntireWidth() {
                return this.fillEntireWidth;
            }

            public final Arguments copy(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean fillEntireWidth) {
                Intrinsics.checkNotNullParameter(requests, "requests");
                Intrinsics.checkNotNullParameter(span, "span");
                return new Arguments(requests, span, fillEntireWidth);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.requests, arguments.requests) && this.span == arguments.span && Intrinsics.areEqual(this.fillEntireWidth, arguments.fillEntireWidth);
            }

            public int hashCode() {
                int iHashCode = ((this.requests.hashCode() * 31) + this.span.hashCode()) * 31;
                Boolean bool = this.fillEntireWidth;
                return iHashCode + (bool == null ? 0 : bool.hashCode());
            }

            public String toString() {
                return "Arguments(requests=" + this.requests + ", span=" + this.span + ", fillEntireWidth=" + this.fillEntireWidth + ")";
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33268xfc5d8fa4.INSTANCE;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments._childSerializers$_anonymous_();
                    }
                }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChart$Arguments$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamEagleChart.Arguments._childSerializers$_anonymous_$0();
                    }
                }), null};
            }

            public /* synthetic */ Arguments(int i, List list, SduiDisplaySpan sduiDisplaySpan, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C33268xfc5d8fa4.INSTANCE.getDescriptor());
                }
                this.requests = list;
                this.span = sduiDisplaySpan;
                this.fillEntireWidth = bool;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.requests);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.span);
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.fillEntireWidth);
            }

            public Arguments(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean bool) {
                Intrinsics.checkNotNullParameter(requests, "requests");
                Intrinsics.checkNotNullParameter(span, "span");
                this.requests = requests;
                this.span = span;
                this.fillEntireWidth = bool;
            }

            public final List<EventContractRequest> getRequests() {
                return this.requests;
            }

            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            public final Boolean getFillEntireWidth() {
                return this.fillEntireWidth;
            }
        }

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;)Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponse;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesChartResponse value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22454boximpl(FuturesChartResponse futuresChartResponse) {
                return new Emission(futuresChartResponse);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesChartResponse m22455constructorimpl(FuturesChartResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22456equalsimpl(FuturesChartResponse futuresChartResponse, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresChartResponse, ((Emission) obj).m22460unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22457equalsimpl0(FuturesChartResponse futuresChartResponse, FuturesChartResponse futuresChartResponse2) {
                return Intrinsics.areEqual(futuresChartResponse, futuresChartResponse2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22458hashCodeimpl(FuturesChartResponse futuresChartResponse) {
                return futuresChartResponse.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22459toStringimpl(FuturesChartResponse futuresChartResponse) {
                return "Emission(value=" + futuresChartResponse + ")";
            }

            public boolean equals(Object obj) {
                return m22456equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22458hashCodeimpl(this.value);
            }

            public String toString() {
                return m22459toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesChartResponse m22460unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChart$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33269x2506d85d.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesChartResponse futuresChartResponse) {
                this.value = futuresChartResponse;
            }

            public final FuturesChartResponse getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamFuturesPerformanceChart implements ServiceCallable {
        private final Json json;
        private final FuturesChartsService service;

        public Endpoint_streamFuturesPerformanceChart(FuturesChartsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.call$lambda$1(this.f$0, (FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamFuturesPerformanceChart endpoint_streamFuturesPerformanceChart, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesPerformanceChartResponse> flowStreamFuturesPerformanceChart = endpoint_streamFuturesPerformanceChart.service.streamFuturesPerformanceChart(it.getAccountNumber(), it.getSpan());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamFuturesPerformanceChart.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.Emission emissionM22485boximpl = FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.Emission.m22485boximpl(FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.Emission.m22486constructorimpl((FuturesPerformanceChartResponse) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22485boximpl, anonymousClass1) == coroutine_suspended) {
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

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$Arguments;", "", "accountNumber", "", "span", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "<init>", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccountNumber", "()Ljava/lang/String;", "getSpan", "()Lmicrogram/ui/sdui/SduiDisplaySpan;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final String accountNumber;
            private final SduiDisplaySpan span;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$Arguments$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChart.Arguments._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return SduiDisplaySpan.INSTANCE.serializer();
            }

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, SduiDisplaySpan sduiDisplaySpan, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.accountNumber;
                }
                if ((i & 2) != 0) {
                    sduiDisplaySpan = arguments.span;
                }
                return arguments.copy(str, sduiDisplaySpan);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            public final Arguments copy(String accountNumber, SduiDisplaySpan span) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(span, "span");
                return new Arguments(accountNumber, span);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.accountNumber, arguments.accountNumber) && this.span == arguments.span;
            }

            public int hashCode() {
                return (this.accountNumber.hashCode() * 31) + this.span.hashCode();
            }

            public String toString() {
                return "Arguments(accountNumber=" + this.accountNumber + ", span=" + this.span + ")";
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33291xdcba4a5c.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, SduiDisplaySpan sduiDisplaySpan, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C33291xdcba4a5c.INSTANCE.getDescriptor());
                }
                this.accountNumber = str;
                this.span = sduiDisplaySpan;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.accountNumber);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.span);
            }

            public Arguments(String accountNumber, SduiDisplaySpan span) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(span, "span");
                this.accountNumber = accountNumber;
                this.span = span;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final SduiDisplaySpan getSpan() {
                return this.span;
            }
        }

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;)Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponse;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesPerformanceChartResponse value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22485boximpl(FuturesPerformanceChartResponse futuresPerformanceChartResponse) {
                return new Emission(futuresPerformanceChartResponse);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesPerformanceChartResponse m22486constructorimpl(FuturesPerformanceChartResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22487equalsimpl(FuturesPerformanceChartResponse futuresPerformanceChartResponse, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresPerformanceChartResponse, ((Emission) obj).m22491unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22488equalsimpl0(FuturesPerformanceChartResponse futuresPerformanceChartResponse, FuturesPerformanceChartResponse futuresPerformanceChartResponse2) {
                return Intrinsics.areEqual(futuresPerformanceChartResponse, futuresPerformanceChartResponse2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22489hashCodeimpl(FuturesPerformanceChartResponse futuresPerformanceChartResponse) {
                return futuresPerformanceChartResponse.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22490toStringimpl(FuturesPerformanceChartResponse futuresPerformanceChartResponse) {
                return "Emission(value=" + futuresPerformanceChartResponse + ")";
            }

            public boolean equals(Object obj) {
                return m22487equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22489hashCodeimpl(this.value);
            }

            public String toString() {
                return m22490toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesPerformanceChartResponse m22491unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChart$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33292x4d4be6a5.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesPerformanceChartResponse futuresPerformanceChartResponse) {
                this.value = futuresPerformanceChartResponse;
            }

            public final FuturesPerformanceChartResponse getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamFuturesChartJson implements ServiceCallable {
        private final Json json;
        private final FuturesChartsService service;

        public Endpoint_streamFuturesChartJson(FuturesChartsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.call$lambda$1(this.f$0, (FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamFuturesChartJson endpoint_streamFuturesChartJson, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesChartResponseJson> flowStreamFuturesChartJson = endpoint_streamFuturesChartJson.service.streamFuturesChartJson(it.getContractId(), it.getSpan(), it.getChartType(), it.isContinuous(), it.isSparkline());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamFuturesChartJson.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Emission emissionM22478boximpl = FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Emission.m22478boximpl(FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Emission.m22479constructorimpl((FuturesChartResponseJson) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22478boximpl, anonymousClass1) == coroutine_suspended) {
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

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000eHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\n\u0010\u0019¨\u00060"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Arguments;", "", "contractId", "", "span", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "chartType", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;", "isContinuous", "", "isSparkline", "<init>", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContractId", "()Ljava/lang/String;", "getSpan", "()Lmicrogram/ui/sdui/SduiDisplaySpan;", "getChartType", "()Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalChartType;ZLjava/lang/Boolean;)Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Arguments;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesHistorical4 chartType;
            private final String contractId;
            private final boolean isContinuous;
            private final Boolean isSparkline;
            private final SduiDisplaySpan span;

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return SduiDisplaySpan.INSTANCE.serializer();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return FuturesHistorical4.INSTANCE.serializer();
            }

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, SduiDisplaySpan sduiDisplaySpan, FuturesHistorical4 futuresHistorical4, boolean z, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.contractId;
                }
                if ((i & 2) != 0) {
                    sduiDisplaySpan = arguments.span;
                }
                if ((i & 4) != 0) {
                    futuresHistorical4 = arguments.chartType;
                }
                if ((i & 8) != 0) {
                    z = arguments.isContinuous;
                }
                if ((i & 16) != 0) {
                    bool = arguments.isSparkline;
                }
                Boolean bool2 = bool;
                FuturesHistorical4 futuresHistorical42 = futuresHistorical4;
                return arguments.copy(str, sduiDisplaySpan, futuresHistorical42, z, bool2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getContractId() {
                return this.contractId;
            }

            /* renamed from: component2, reason: from getter */
            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            /* renamed from: component3, reason: from getter */
            public final FuturesHistorical4 getChartType() {
                return this.chartType;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsContinuous() {
                return this.isContinuous;
            }

            /* renamed from: component5, reason: from getter */
            public final Boolean getIsSparkline() {
                return this.isSparkline;
            }

            public final Arguments copy(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean isContinuous, Boolean isSparkline) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(span, "span");
                Intrinsics.checkNotNullParameter(chartType, "chartType");
                return new Arguments(contractId, span, chartType, isContinuous, isSparkline);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.contractId, arguments.contractId) && this.span == arguments.span && this.chartType == arguments.chartType && this.isContinuous == arguments.isContinuous && Intrinsics.areEqual(this.isSparkline, arguments.isSparkline);
            }

            public int hashCode() {
                int iHashCode = ((((((this.contractId.hashCode() * 31) + this.span.hashCode()) * 31) + this.chartType.hashCode()) * 31) + Boolean.hashCode(this.isContinuous)) * 31;
                Boolean bool = this.isSparkline;
                return iHashCode + (bool == null ? 0 : bool.hashCode());
            }

            public String toString() {
                return "Arguments(contractId=" + this.contractId + ", span=" + this.span + ", chartType=" + this.chartType + ", isContinuous=" + this.isContinuous + ", isSparkline=" + this.isSparkline + ")";
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33286xafdae2a0.INSTANCE;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Arguments$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Arguments._childSerializers$_anonymous_();
                    }
                }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Arguments$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamFuturesChartJson.Arguments._childSerializers$_anonymous_$0();
                    }
                }), null, null};
            }

            public /* synthetic */ Arguments(int i, String str, SduiDisplaySpan sduiDisplaySpan, FuturesHistorical4 futuresHistorical4, boolean z, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
                if (31 != (i & 31)) {
                    PluginExceptions.throwMissingFieldException(i, 31, C33286xafdae2a0.INSTANCE.getDescriptor());
                }
                this.contractId = str;
                this.span = sduiDisplaySpan;
                this.chartType = futuresHistorical4;
                this.isContinuous = z;
                this.isSparkline = bool;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.contractId);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.span);
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.chartType);
                output.encodeBooleanElement(serialDesc, 3, self.isContinuous);
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.isSparkline);
            }

            public Arguments(String contractId, SduiDisplaySpan span, FuturesHistorical4 chartType, boolean z, Boolean bool) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(span, "span");
                Intrinsics.checkNotNullParameter(chartType, "chartType");
                this.contractId = contractId;
                this.span = span;
                this.chartType = chartType;
                this.isContinuous = z;
                this.isSparkline = bool;
            }

            public final String getContractId() {
                return this.contractId;
            }

            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            public final FuturesHistorical4 getChartType() {
                return this.chartType;
            }

            public final boolean isContinuous() {
                return this.isContinuous;
            }

            public final Boolean isSparkline() {
                return this.isSparkline;
            }
        }

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;)Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesChartResponseJson value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22478boximpl(FuturesChartResponseJson futuresChartResponseJson) {
                return new Emission(futuresChartResponseJson);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesChartResponseJson m22479constructorimpl(FuturesChartResponseJson value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22480equalsimpl(FuturesChartResponseJson futuresChartResponseJson, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresChartResponseJson, ((Emission) obj).m22484unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22481equalsimpl0(FuturesChartResponseJson futuresChartResponseJson, FuturesChartResponseJson futuresChartResponseJson2) {
                return Intrinsics.areEqual(futuresChartResponseJson, futuresChartResponseJson2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22482hashCodeimpl(FuturesChartResponseJson futuresChartResponseJson) {
                return futuresChartResponseJson.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22483toStringimpl(FuturesChartResponseJson futuresChartResponseJson) {
                return "Emission(value=" + futuresChartResponseJson + ")";
            }

            public boolean equals(Object obj) {
                return m22480equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22482hashCodeimpl(this.value);
            }

            public String toString() {
                return m22483toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesChartResponseJson m22484unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesChartJson$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33287x3b5535e1.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesChartResponseJson futuresChartResponseJson) {
                this.value = futuresChartResponseJson;
            }

            public final FuturesChartResponseJson getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamEagleChartJson implements ServiceCallable {
        private final Json json;
        private final FuturesChartsService service;

        public Endpoint_streamEagleChartJson(FuturesChartsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.call$lambda$1(this.f$0, (FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamEagleChartJson endpoint_streamEagleChartJson, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesChartResponseJson> flowStreamEventContractChartJson = endpoint_streamEagleChartJson.service.streamEventContractChartJson(it.getRequests(), it.getSpan(), it.getFillEntireWidth());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamEventContractChartJson.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Emission emissionM22462boximpl = FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Emission.m22462boximpl(FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Emission.m22463constructorimpl((FuturesChartResponseJson) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22462boximpl, anonymousClass1) == coroutine_suspended) {
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

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\fHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Arguments;", "", "requests", "", "Lcom/robinhood/futures/charts/contracts/models/EventContractRequest;", "span", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "fillEntireWidth", "", "<init>", "(Ljava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRequests", "()Ljava/util/List;", "getSpan", "()Lmicrogram/ui/sdui/SduiDisplaySpan;", "getFillEntireWidth", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/lang/Boolean;)Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Arguments;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Boolean fillEntireWidth;
            private final List<EventContractRequest> requests;
            private final SduiDisplaySpan span;

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(EventContractRequest2.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return SduiDisplaySpan.INSTANCE.serializer();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Arguments copy$default(Arguments arguments, List list, SduiDisplaySpan sduiDisplaySpan, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = arguments.requests;
                }
                if ((i & 2) != 0) {
                    sduiDisplaySpan = arguments.span;
                }
                if ((i & 4) != 0) {
                    bool = arguments.fillEntireWidth;
                }
                return arguments.copy(list, sduiDisplaySpan, bool);
            }

            public final List<EventContractRequest> component1() {
                return this.requests;
            }

            /* renamed from: component2, reason: from getter */
            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            /* renamed from: component3, reason: from getter */
            public final Boolean getFillEntireWidth() {
                return this.fillEntireWidth;
            }

            public final Arguments copy(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean fillEntireWidth) {
                Intrinsics.checkNotNullParameter(requests, "requests");
                Intrinsics.checkNotNullParameter(span, "span");
                return new Arguments(requests, span, fillEntireWidth);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.requests, arguments.requests) && this.span == arguments.span && Intrinsics.areEqual(this.fillEntireWidth, arguments.fillEntireWidth);
            }

            public int hashCode() {
                int iHashCode = ((this.requests.hashCode() * 31) + this.span.hashCode()) * 31;
                Boolean bool = this.fillEntireWidth;
                return iHashCode + (bool == null ? 0 : bool.hashCode());
            }

            public String toString() {
                return "Arguments(requests=" + this.requests + ", span=" + this.span + ", fillEntireWidth=" + this.fillEntireWidth + ")";
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33274xd1477aac.INSTANCE;
                }
            }

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Arguments$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Arguments._childSerializers$_anonymous_();
                    }
                }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Arguments$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesChartsService_Adapter.Endpoint_streamEagleChartJson.Arguments._childSerializers$_anonymous_$0();
                    }
                }), null};
            }

            public /* synthetic */ Arguments(int i, List list, SduiDisplaySpan sduiDisplaySpan, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C33274xd1477aac.INSTANCE.getDescriptor());
                }
                this.requests = list;
                this.span = sduiDisplaySpan;
                this.fillEntireWidth = bool;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.requests);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.span);
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.fillEntireWidth);
            }

            public Arguments(List<EventContractRequest> requests, SduiDisplaySpan span, Boolean bool) {
                Intrinsics.checkNotNullParameter(requests, "requests");
                Intrinsics.checkNotNullParameter(span, "span");
                this.requests = requests;
                this.span = span;
                this.fillEntireWidth = bool;
            }

            public final List<EventContractRequest> getRequests() {
                return this.requests;
            }

            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            public final Boolean getFillEntireWidth() {
                return this.fillEntireWidth;
            }
        }

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;)Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesChartResponseJson;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesChartResponseJson value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22462boximpl(FuturesChartResponseJson futuresChartResponseJson) {
                return new Emission(futuresChartResponseJson);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesChartResponseJson m22463constructorimpl(FuturesChartResponseJson value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22464equalsimpl(FuturesChartResponseJson futuresChartResponseJson, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresChartResponseJson, ((Emission) obj).m22468unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22465equalsimpl0(FuturesChartResponseJson futuresChartResponseJson, FuturesChartResponseJson futuresChartResponseJson2) {
                return Intrinsics.areEqual(futuresChartResponseJson, futuresChartResponseJson2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22466hashCodeimpl(FuturesChartResponseJson futuresChartResponseJson) {
                return futuresChartResponseJson.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22467toStringimpl(FuturesChartResponseJson futuresChartResponseJson) {
                return "Emission(value=" + futuresChartResponseJson + ")";
            }

            public boolean equals(Object obj) {
                return m22464equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22466hashCodeimpl(this.value);
            }

            public String toString() {
                return m22467toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesChartResponseJson m22468unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamEagleChartJson$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33275x552f6c55.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesChartResponseJson futuresChartResponseJson) {
                this.value = futuresChartResponseJson;
            }

            public final FuturesChartResponseJson getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: FuturesChartsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcom/robinhood/futures/charts/contracts/FuturesChartsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_streamFuturesPerformanceChartJson implements ServiceCallable {
        private final Json json;
        private final FuturesChartsService service;

        public Endpoint_streamFuturesPerformanceChartJson(FuturesChartsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1 function1 = new Function1() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.call$lambda$1(this.f$0, (FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments) obj);
                }
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$1(Endpoint_streamFuturesPerformanceChartJson endpoint_streamFuturesPerformanceChartJson, Arguments it) {
            Intrinsics.checkNotNullParameter(it, "it");
            final Flow<FuturesPerformanceChartResponseJson> flowStreamFuturesPerformanceChartJson = endpoint_streamFuturesPerformanceChartJson.service.streamFuturesPerformanceChartJson(it.getAccountNumber(), it.getSpan());
            return new Flow<Emission>() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$call$lambda$1$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Emission> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamFuturesPerformanceChartJson.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$call$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$call$lambda$1$$inlined$map$1$2", m3645f = "FuturesChartsService_Adapter.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$call$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Emission emissionM22493boximpl = FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Emission.m22493boximpl(FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Emission.m22494constructorimpl((FuturesPerformanceChartResponseJson) obj));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(emissionM22493boximpl, anonymousClass1) == coroutine_suspended) {
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

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Arguments;", "", "accountNumber", "", "span", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "<init>", "(Ljava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiDisplaySpan;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccountNumber", "()Ljava/lang/String;", "getSpan", "()Lmicrogram/ui/sdui/SduiDisplaySpan;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {
            private final String accountNumber;
            private final SduiDisplaySpan span;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.futures.charts.contracts.FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Arguments$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesChartsService_Adapter.Endpoint_streamFuturesPerformanceChartJson.Arguments._childSerializers$_anonymous_();
                }
            })};

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return SduiDisplaySpan.INSTANCE.serializer();
            }

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, SduiDisplaySpan sduiDisplaySpan, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.accountNumber;
                }
                if ((i & 2) != 0) {
                    sduiDisplaySpan = arguments.span;
                }
                return arguments.copy(str, sduiDisplaySpan);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final SduiDisplaySpan getSpan() {
                return this.span;
            }

            public final Arguments copy(String accountNumber, SduiDisplaySpan span) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(span, "span");
                return new Arguments(accountNumber, span);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.accountNumber, arguments.accountNumber) && this.span == arguments.span;
            }

            public int hashCode() {
                return (this.accountNumber.hashCode() * 31) + this.span.hashCode();
            }

            public String toString() {
                return "Arguments(accountNumber=" + this.accountNumber + ", span=" + this.span + ")";
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Arguments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Arguments;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Arguments> serializer() {
                    return C33296x6ad81964.INSTANCE;
                }
            }

            public /* synthetic */ Arguments(int i, String str, SduiDisplaySpan sduiDisplaySpan, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C33296x6ad81964.INSTANCE.getDescriptor());
                }
                this.accountNumber = str;
                this.span = sduiDisplaySpan;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.accountNumber);
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.span);
            }

            public Arguments(String accountNumber, SduiDisplaySpan span) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(span, "span");
                this.accountNumber = accountNumber;
                this.span = span;
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final SduiDisplaySpan getSpan() {
                return this.span;
            }
        }

        /* compiled from: FuturesChartsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Emission;", "", "value", "Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;", "constructor-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;)Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;", "getValue", "()Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;)I", "toString", "", "toString-impl", "(Lcom/robinhood/futures/charts/contracts/models/FuturesPerformanceChartResponseJson;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final FuturesPerformanceChartResponseJson value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22493boximpl(FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson) {
                return new Emission(futuresPerformanceChartResponseJson);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static FuturesPerformanceChartResponseJson m22494constructorimpl(FuturesPerformanceChartResponseJson value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22495equalsimpl(FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(futuresPerformanceChartResponseJson, ((Emission) obj).m22499unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22496equalsimpl0(FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson, FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson2) {
                return Intrinsics.areEqual(futuresPerformanceChartResponseJson, futuresPerformanceChartResponseJson2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22497hashCodeimpl(FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson) {
                return futuresPerformanceChartResponseJson.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22498toStringimpl(FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson) {
                return "Emission(value=" + futuresPerformanceChartResponseJson + ")";
            }

            public boolean equals(Object obj) {
                return m22495equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22497hashCodeimpl(this.value);
            }

            public String toString() {
                return m22498toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ FuturesPerformanceChartResponseJson m22499unboximpl() {
                return this.value;
            }

            /* compiled from: FuturesChartsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Emission$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsService_Adapter$Endpoint_streamFuturesPerformanceChartJson$Emission;", "contracts"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Emission> serializer() {
                    return C33297x9c34169d.INSTANCE;
                }
            }

            private /* synthetic */ Emission(FuturesPerformanceChartResponseJson futuresPerformanceChartResponseJson) {
                this.value = futuresPerformanceChartResponseJson;
            }

            public final FuturesPerformanceChartResponseJson getValue() {
                return this.value;
            }
        }
    }
}
