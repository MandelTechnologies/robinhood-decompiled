package com.robinhood.libtradingtrends.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmStatic;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: TradingTrendsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0005&'()*B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u00060\tj\u0002`\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010 \u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%¨\u0006+"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "", "instrumentId", "initialSelectedType", "", "isDetailPage", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "getSection", "(Ljava/lang/String;Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "getMoreInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsType;", "type", "", "selectType", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialSortKey", "initialSortDirection", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "getTable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "sortKey", "sortDirection", "sortTable", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "Endpoint_getMoreInfo", "Endpoint_getSection", "Endpoint_getTable", "Endpoint_selectType", "Endpoint_sortTable", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class TradingTrendsService_Adapter implements TradingTrendsService {
    private final ClientBridge __bridge;
    private final Json json;

    /* compiled from: TradingTrendsService_Adapter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter", m3645f = "TradingTrendsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "getMoreInfo")
    /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getMoreInfo$1 */
    static final class C349391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C349391(Continuation<? super C349391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TradingTrendsService_Adapter.this.getMoreInfo(this);
        }
    }

    public TradingTrendsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // com.robinhood.libtradingtrends.contracts.TradingTrendsService
    public Flow<TradingTrendsSection> getSection(String instrumentId, String initialSelectedType, boolean isDetailPage) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_getSection.Arguments arguments = new Endpoint_getSection.Arguments(instrumentId, initialSelectedType, isDetailPage);
        json.getSerializersModule();
        KSerializer<Endpoint_getSection.Arguments> kSerializerSerializer = Endpoint_getSection.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_getSection.Emission.INSTANCE.serializer(), "getSection", arguments, null);
        return new Flow<TradingTrendsSection>() { // from class: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getSection$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super TradingTrendsSection> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new C349372(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getSection$$inlined$map$1$2 */
            public static final class C349372<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getSection$$inlined$map$1$2", m3645f = "TradingTrendsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                @SourceDebugExtension
                /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getSection$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C349372.this.emit(null, this);
                    }
                }

                public C349372(FlowCollector flowCollector) {
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
                        TradingTrendsSection tradingTrendsSectionM22838unboximpl = ((TradingTrendsService_Adapter.Endpoint_getSection.Emission) obj).m22838unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tradingTrendsSectionM22838unboximpl, anonymousClass1) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.libtradingtrends.contracts.TradingTrendsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getMoreInfo(Continuation<? super String> continuation) throws IOException {
        C349391 c349391;
        if (continuation instanceof C349391) {
            c349391 = (C349391) continuation;
            int i = c349391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c349391.label = i - Integer.MIN_VALUE;
            } else {
                c349391 = new C349391(continuation);
            }
        }
        C349391 c3493912 = c349391;
        Object objCallSuspendFunction = c3493912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3493912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCallSuspendFunction);
            ClientBridge clientBridge = get__bridge();
            Json json = this.json;
            Unit unit = Unit.INSTANCE;
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            KSerializer<Endpoint_getMoreInfo.Emission> kSerializerSerializer = Endpoint_getMoreInfo.Emission.INSTANCE.serializer();
            c3493912.label = 1;
            objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, unitSerializer, kSerializerSerializer, "getMoreInfo", unit, c3493912);
            if (objCallSuspendFunction == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCallSuspendFunction);
        }
        return ((Endpoint_getMoreInfo.Emission) objCallSuspendFunction).m22831unboximpl();
    }

    @Override // com.robinhood.libtradingtrends.contracts.TradingTrendsService
    public Object selectType(String str, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_selectType.Arguments arguments = new Endpoint_selectType.Arguments(str);
        json.getSerializersModule();
        KSerializer<Endpoint_selectType.Arguments> kSerializerSerializer = Endpoint_selectType.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "selectType", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // com.robinhood.libtradingtrends.contracts.TradingTrendsService
    public Flow<TradingTrendsTable> getTable(String instrumentId, String initialSelectedType, String initialSortKey, String initialSortDirection) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_getTable.Arguments arguments = new Endpoint_getTable.Arguments(instrumentId, initialSelectedType, initialSortKey, initialSortDirection);
        json.getSerializersModule();
        KSerializer<Endpoint_getTable.Arguments> kSerializerSerializer = Endpoint_getTable.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        final Flow flowCallFlow = ClientCallAdapters.callFlow(clientBridge, json, kSerializerSerializer, Endpoint_getTable.Emission.INSTANCE.serializer(), "getTable", arguments, null);
        return new Flow<TradingTrendsTable>() { // from class: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getTable$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super TradingTrendsTable> flowCollector, Continuation continuation) {
                Object objCollect = flowCallFlow.collect(new C349382(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getTable$$inlined$map$1$2 */
            public static final class C349382<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getTable$$inlined$map$1$2", m3645f = "TradingTrendsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                @SourceDebugExtension
                /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$getTable$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C349382.this.emit(null, this);
                    }
                }

                public C349382(FlowCollector flowCollector) {
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
                        TradingTrendsTable tradingTrendsTableM22845unboximpl = ((TradingTrendsService_Adapter.Endpoint_getTable.Emission) obj).m22845unboximpl();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(tradingTrendsTableM22845unboximpl, anonymousClass1) == coroutine_suspended) {
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

    @Override // com.robinhood.libtradingtrends.contracts.TradingTrendsService
    public Object sortTable(String str, String str2, Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        Endpoint_sortTable.Arguments arguments = new Endpoint_sortTable.Arguments(str, str2);
        json.getSerializersModule();
        KSerializer<Endpoint_sortTable.Arguments> kSerializerSerializer = Endpoint_sortTable.Arguments.INSTANCE.serializer();
        json.getSerializersModule();
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, kSerializerSerializer, UnitSerializer.INSTANCE, "sortTable", arguments, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    /* compiled from: TradingTrendsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getSection;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getSection implements ServiceCallable {
        private final Json json;
        private final TradingTrendsService service;

        public Endpoint_getSection(TradingTrendsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1<Arguments, Flow<? extends Emission>> function1 = new Function1<Arguments, Flow<? extends Emission>>() { // from class: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getSection$call$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Flow<TradingTrendsService_Adapter.Endpoint_getSection.Emission> invoke(TradingTrendsService_Adapter.Endpoint_getSection.Arguments it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    final Flow<TradingTrendsSection> section = this.this$0.service.getSection(it.getInstrumentId(), it.getInitialSelectedType(), it.isDetailPage());
                    return new Flow<TradingTrendsService_Adapter.Endpoint_getSection.Emission>() { // from class: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getSection$call$1$invoke$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super TradingTrendsService_Adapter.Endpoint_getSection.Emission> flowCollector, Continuation continuation) {
                            Object objCollect = section.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 9, 0})
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getSection$call$1$invoke$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getSection$call$1$invoke$$inlined$map$1$2", m3645f = "TradingTrendsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getSection$call$1$invoke$$inlined$map$1$2$1, reason: invalid class name */
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
                                    TradingTrendsService_Adapter.Endpoint_getSection.Emission emissionM22832boximpl = TradingTrendsService_Adapter.Endpoint_getSection.Emission.m22832boximpl(TradingTrendsService_Adapter.Endpoint_getSection.Emission.m22833constructorimpl((TradingTrendsSection) obj));
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(emissionM22832boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* compiled from: TradingTrendsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getSection$Arguments;", "", "seen1", "", "instrumentId", "", "initialSelectedType", "isDetailPage", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getInitialSelectedType", "()Ljava/lang/String;", "getInstrumentId", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String initialSelectedType;
            private final String instrumentId;
            private final boolean isDetailPage;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.instrumentId;
                }
                if ((i & 2) != 0) {
                    str2 = arguments.initialSelectedType;
                }
                if ((i & 4) != 0) {
                    z = arguments.isDetailPage;
                }
                return arguments.copy(str, str2, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInstrumentId() {
                return this.instrumentId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getInitialSelectedType() {
                return this.initialSelectedType;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsDetailPage() {
                return this.isDetailPage;
            }

            public final Arguments copy(String instrumentId, String initialSelectedType, boolean isDetailPage) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return new Arguments(instrumentId, initialSelectedType, isDetailPage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.instrumentId, arguments.instrumentId) && Intrinsics.areEqual(this.initialSelectedType, arguments.initialSelectedType) && this.isDetailPage == arguments.isDetailPage;
            }

            public int hashCode() {
                int iHashCode = this.instrumentId.hashCode() * 31;
                String str = this.initialSelectedType;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isDetailPage);
            }

            public String toString() {
                return "Arguments(instrumentId=" + this.instrumentId + ", initialSelectedType=" + this.initialSelectedType + ", isDetailPage=" + this.isDetailPage + ")";
            }

            /* compiled from: TradingTrendsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getSection$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getSection$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C34929xc63a6e07.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptions.throwMissingFieldException(i, 7, C34929xc63a6e07.INSTANCE.getDescriptor());
                }
                this.instrumentId = str;
                this.initialSelectedType = str2;
                this.isDetailPage = z;
            }

            public Arguments(String instrumentId, String str, boolean z) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                this.instrumentId = instrumentId;
                this.initialSelectedType = str;
                this.isDetailPage = z;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.instrumentId);
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.initialSelectedType);
                output.encodeBooleanElement(serialDesc, 2, self.isDetailPage);
            }

            public final String getInstrumentId() {
                return this.instrumentId;
            }

            public final String getInitialSelectedType() {
                return this.initialSelectedType;
            }

            public final boolean isDetailPage() {
                return this.isDetailPage;
            }
        }

        /* compiled from: TradingTrendsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getSection$Emission;", "", "value", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "constructor-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;)Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "getValue", "()Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;)I", "toString", "", "toString-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TradingTrendsSection value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22832boximpl(TradingTrendsSection tradingTrendsSection) {
                return new Emission(tradingTrendsSection);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static TradingTrendsSection m22833constructorimpl(TradingTrendsSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22834equalsimpl(TradingTrendsSection tradingTrendsSection, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(tradingTrendsSection, ((Emission) obj).m22838unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22835equalsimpl0(TradingTrendsSection tradingTrendsSection, TradingTrendsSection tradingTrendsSection2) {
                return Intrinsics.areEqual(tradingTrendsSection, tradingTrendsSection2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22836hashCodeimpl(TradingTrendsSection tradingTrendsSection) {
                return tradingTrendsSection.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22837toStringimpl(TradingTrendsSection tradingTrendsSection) {
                return "Emission(value=" + tradingTrendsSection + ")";
            }

            public boolean equals(Object obj) {
                return m22834equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22836hashCodeimpl(this.value);
            }

            public String toString() {
                return m22837toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ TradingTrendsSection m22838unboximpl() {
                return this.value;
            }

            /* compiled from: TradingTrendsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getSection$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getSection$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C34930xd0b3219a.INSTANCE;
                }
            }

            private /* synthetic */ Emission(TradingTrendsSection tradingTrendsSection) {
                this.value = tradingTrendsSection;
            }

            public final TradingTrendsSection getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: TradingTrendsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getMoreInfo;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getMoreInfo implements ServiceCallable {
        private final Json json;
        private final TradingTrendsService service;

        public Endpoint_getMoreInfo(TradingTrendsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1 tradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1 = new TradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1(this, null);
            json.getSerializersModule();
            UnitSerializer unitSerializer = UnitSerializer.INSTANCE;
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, unitSerializer, Emission.INSTANCE.serializer(), body, tradingTrendsService_Adapter$Endpoint_getMoreInfo$call$1);
        }

        /* compiled from: TradingTrendsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getMoreInfo$Emission;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22825boximpl(String str) {
                return new Emission(str);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m22826constructorimpl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22827equalsimpl(String str, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(str, ((Emission) obj).m22831unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22828equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22829hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22830toStringimpl(String str) {
                return "Emission(value=" + str + ")";
            }

            public boolean equals(Object obj) {
                return m22827equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22829hashCodeimpl(this.value);
            }

            public String toString() {
                return m22830toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m22831unboximpl() {
                return this.value;
            }

            /* compiled from: TradingTrendsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getMoreInfo$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getMoreInfo$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C34928xe94891d8.INSTANCE;
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

    /* compiled from: TradingTrendsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_selectType;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_selectType implements ServiceCallable {
        private final Json json;
        private final TradingTrendsService service;

        public Endpoint_selectType(TradingTrendsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            TradingTrendsService_Adapter$Endpoint_selectType$call$1 tradingTrendsService_Adapter$Endpoint_selectType$call$1 = new TradingTrendsService_Adapter$Endpoint_selectType$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, tradingTrendsService_Adapter$Endpoint_selectType$call$1);
        }

        /* compiled from: TradingTrendsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0011\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\nJ\r\u0010\r\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\u0017\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÁ\u0001¢\u0006\u0002\b\u001bR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_selectType$Arguments;", "", "seen1", "", "type", "", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String type;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.type;
                }
                return arguments.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final Arguments copy(String type2) {
                Intrinsics.checkNotNullParameter(type2, "type");
                return new Arguments(type2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Arguments) && Intrinsics.areEqual(this.type, ((Arguments) other).type);
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return "Arguments(type=" + this.type + ")";
            }

            /* compiled from: TradingTrendsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_selectType$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_selectType$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C34935x5f93c66e.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, C34935x5f93c66e.INSTANCE.getDescriptor());
                }
                this.type = str;
            }

            public Arguments(String type2) {
                Intrinsics.checkNotNullParameter(type2, "type");
                this.type = type2;
            }

            public final String getType() {
                return this.type;
            }
        }
    }

    /* compiled from: TradingTrendsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getTable;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "Emission", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_getTable implements ServiceCallable {
        private final Json json;
        private final TradingTrendsService service;

        public Endpoint_getTable(TradingTrendsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            Function1<Arguments, Flow<? extends Emission>> function1 = new Function1<Arguments, Flow<? extends Emission>>() { // from class: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getTable$call$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Flow<TradingTrendsService_Adapter.Endpoint_getTable.Emission> invoke(TradingTrendsService_Adapter.Endpoint_getTable.Arguments it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    final Flow<TradingTrendsTable> table = this.this$0.service.getTable(it.getInstrumentId(), it.getInitialSelectedType(), it.getInitialSortKey(), it.getInitialSortDirection());
                    return new Flow<TradingTrendsService_Adapter.Endpoint_getTable.Emission>() { // from class: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getTable$call$1$invoke$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super TradingTrendsService_Adapter.Endpoint_getTable.Emission> flowCollector, Continuation continuation) {
                            Object objCollect = table.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m3637k = 3, m3638mv = {1, 9, 0})
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getTable$call$1$invoke$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getTable$call$1$invoke$$inlined$map$1$2", m3645f = "TradingTrendsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.libtradingtrends.contracts.TradingTrendsService_Adapter$Endpoint_getTable$call$1$invoke$$inlined$map$1$2$1, reason: invalid class name */
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
                                    TradingTrendsService_Adapter.Endpoint_getTable.Emission emissionM22839boximpl = TradingTrendsService_Adapter.Endpoint_getTable.Emission.m22839boximpl(TradingTrendsService_Adapter.Endpoint_getTable.Emission.m22840constructorimpl((TradingTrendsTable) obj));
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(emissionM22839boximpl, anonymousClass1) == coroutine_suspended) {
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
            };
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptFlow(json, kSerializerSerializer, Emission.INSTANCE.serializer(), body, function1);
        }

        /* compiled from: TradingTrendsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006&"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getTable$Arguments;", "", "seen1", "", "instrumentId", "", "initialSelectedType", "initialSortKey", "initialSortDirection", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInitialSelectedType", "()Ljava/lang/String;", "getInitialSortDirection", "getInitialSortKey", "getInstrumentId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String initialSelectedType;
            private final String initialSortDirection;
            private final String initialSortKey;
            private final String instrumentId;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.instrumentId;
                }
                if ((i & 2) != 0) {
                    str2 = arguments.initialSelectedType;
                }
                if ((i & 4) != 0) {
                    str3 = arguments.initialSortKey;
                }
                if ((i & 8) != 0) {
                    str4 = arguments.initialSortDirection;
                }
                return arguments.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInstrumentId() {
                return this.instrumentId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getInitialSelectedType() {
                return this.initialSelectedType;
            }

            /* renamed from: component3, reason: from getter */
            public final String getInitialSortKey() {
                return this.initialSortKey;
            }

            /* renamed from: component4, reason: from getter */
            public final String getInitialSortDirection() {
                return this.initialSortDirection;
            }

            public final Arguments copy(String instrumentId, String initialSelectedType, String initialSortKey, String initialSortDirection) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return new Arguments(instrumentId, initialSelectedType, initialSortKey, initialSortDirection);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.instrumentId, arguments.instrumentId) && Intrinsics.areEqual(this.initialSelectedType, arguments.initialSelectedType) && Intrinsics.areEqual(this.initialSortKey, arguments.initialSortKey) && Intrinsics.areEqual(this.initialSortDirection, arguments.initialSortDirection);
            }

            public int hashCode() {
                int iHashCode = this.instrumentId.hashCode() * 31;
                String str = this.initialSelectedType;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.initialSortKey;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.initialSortDirection;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Arguments(instrumentId=" + this.instrumentId + ", initialSelectedType=" + this.initialSelectedType + ", initialSortKey=" + this.initialSortKey + ", initialSortDirection=" + this.initialSortDirection + ")";
            }

            /* compiled from: TradingTrendsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getTable$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getTable$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C34932x6b7b9db0.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
                if (15 != (i & 15)) {
                    PluginExceptions.throwMissingFieldException(i, 15, C34932x6b7b9db0.INSTANCE.getDescriptor());
                }
                this.instrumentId = str;
                this.initialSelectedType = str2;
                this.initialSortKey = str3;
                this.initialSortDirection = str4;
            }

            public Arguments(String instrumentId, String str, String str2, String str3) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                this.instrumentId = instrumentId;
                this.initialSelectedType = str;
                this.initialSortKey = str2;
                this.initialSortDirection = str3;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.instrumentId);
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.initialSelectedType);
                output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.initialSortKey);
                output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.initialSortDirection);
            }

            public final String getInstrumentId() {
                return this.instrumentId;
            }

            public final String getInitialSelectedType() {
                return this.initialSelectedType;
            }

            public final String getInitialSortKey() {
                return this.initialSortKey;
            }

            public final String getInitialSortDirection() {
                return this.initialSortDirection;
            }
        }

        /* compiled from: TradingTrendsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getTable$Emission;", "", "value", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "constructor-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;)Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "getValue", "()Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;", "equals", "", "other", "equals-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;)I", "toString", "", "toString-impl", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsTable;)Ljava/lang/String;", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        @JvmInline
        public static final class Emission {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final TradingTrendsTable value;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Emission m22839boximpl(TradingTrendsTable tradingTrendsTable) {
                return new Emission(tradingTrendsTable);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static TradingTrendsTable m22840constructorimpl(TradingTrendsTable value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m22841equalsimpl(TradingTrendsTable tradingTrendsTable, Object obj) {
                return (obj instanceof Emission) && Intrinsics.areEqual(tradingTrendsTable, ((Emission) obj).m22845unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m22842equalsimpl0(TradingTrendsTable tradingTrendsTable, TradingTrendsTable tradingTrendsTable2) {
                return Intrinsics.areEqual(tradingTrendsTable, tradingTrendsTable2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m22843hashCodeimpl(TradingTrendsTable tradingTrendsTable) {
                return tradingTrendsTable.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m22844toStringimpl(TradingTrendsTable tradingTrendsTable) {
                return "Emission(value=" + tradingTrendsTable + ")";
            }

            public boolean equals(Object obj) {
                return m22841equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m22843hashCodeimpl(this.value);
            }

            public String toString() {
                return m22844toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ TradingTrendsTable m22845unboximpl() {
                return this.value;
            }

            /* compiled from: TradingTrendsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getTable$Emission$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_getTable$Emission;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Emission> serializer() {
                    return C34933x5a28d8d1.INSTANCE;
                }
            }

            private /* synthetic */ Emission(TradingTrendsTable tradingTrendsTable) {
                this.value = tradingTrendsTable;
            }

            public final TradingTrendsTable getValue() {
                return this.value;
            }
        }
    }

    /* compiled from: TradingTrendsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_sortTable;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;", "json", "Lkotlinx/serialization/json/Json;", "(Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "Arguments", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Endpoint_sortTable implements ServiceCallable {
        private final Json json;
        private final TradingTrendsService service;

        public Endpoint_sortTable(TradingTrendsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            TradingTrendsService_Adapter$Endpoint_sortTable$call$1 tradingTrendsService_Adapter$Endpoint_sortTable$call$1 = new TradingTrendsService_Adapter$Endpoint_sortTable$call$1(this, null);
            json.getSerializersModule();
            KSerializer<Arguments> kSerializerSerializer = Arguments.INSTANCE.serializer();
            json.getSerializersModule();
            return ImplementationCallAdapters.adaptSuspendFunction(json, kSerializerSerializer, UnitSerializer.INSTANCE, body, tradingTrendsService_Adapter$Endpoint_sortTable$call$1);
        }

        /* compiled from: TradingTrendsService_Adapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_sortTable$Arguments;", "", "seen1", "", "sortKey", "", "sortDirection", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getSortDirection", "()Ljava/lang/String;", "getSortKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$contracts", "$serializer", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Arguments {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String sortDirection;
            private final String sortKey;

            public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = arguments.sortKey;
                }
                if ((i & 2) != 0) {
                    str2 = arguments.sortDirection;
                }
                return arguments.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSortKey() {
                return this.sortKey;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSortDirection() {
                return this.sortDirection;
            }

            public final Arguments copy(String sortKey, String sortDirection) {
                return new Arguments(sortKey, sortDirection);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) other;
                return Intrinsics.areEqual(this.sortKey, arguments.sortKey) && Intrinsics.areEqual(this.sortDirection, arguments.sortDirection);
            }

            public int hashCode() {
                String str = this.sortKey;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.sortDirection;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Arguments(sortKey=" + this.sortKey + ", sortDirection=" + this.sortDirection + ")";
            }

            /* compiled from: TradingTrendsService_Adapter.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_sortTable$Arguments$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsService_Adapter$Endpoint_sortTable$Arguments;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Arguments> serializer() {
                    return C34936xbb768f00.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Arguments(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, C34936xbb768f00.INSTANCE.getDescriptor());
                }
                this.sortKey = str;
                this.sortDirection = str2;
            }

            public Arguments(String str, String str2) {
                this.sortKey = str;
                this.sortDirection = str2;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts(Arguments self, Encoding3 output, SerialDescriptor serialDesc) {
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.sortKey);
                output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.sortDirection);
            }

            public final String getSortKey() {
                return this.sortKey;
            }

            public final String getSortDirection() {
                return this.sortDirection;
            }
        }
    }
}
