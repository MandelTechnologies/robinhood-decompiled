package microgram.service.managed;

import java.io.IOException;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.KSerializer3;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.serialization.JsonElementHelpers;
import microgram.service.bridge.ClientBridge;

/* compiled from: ClientCallAdapters.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aT\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"A", "R", "Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/SerializationStrategy;", "argumentsSerializer", "Lkotlinx/serialization/DeserializationStrategy;", "emissionDeserializer", "", "endpointName", "arguments", "", "limit", "Lkotlinx/coroutines/flow/Flow;", "callFlow", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "callSuspendFunction", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "call", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "microgram-service"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.service.managed.ClientCallAdaptersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ClientCallAdapters {

    /* compiled from: ClientCallAdapters.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.managed.ClientCallAdaptersKt", m3645f = "ClientCallAdapters.kt", m3646l = {84}, m3647m = "callSuspendFunction")
    /* renamed from: microgram.service.managed.ClientCallAdaptersKt$callSuspendFunction$2 */
    static final class C467912<A, R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C467912(Continuation<? super C467912> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ClientCallAdapters.callSuspendFunction(null, null, null, null, null, null, this);
        }
    }

    public static /* synthetic */ Flow callFlow$default(ClientBridge clientBridge, Json json, KSerializer3 kSerializer3, KSerializer2 kSerializer2, String str, Object obj, Integer num, int i, Object obj2) {
        if ((i & 32) != 0) {
            num = null;
        }
        return callFlow(clientBridge, json, kSerializer3, kSerializer2, str, obj, num);
    }

    /* compiled from: ClientCallAdapters.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/serialization/json/JsonElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.managed.ClientCallAdaptersKt$callFlow$1", m3645f = "ClientCallAdapters.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: microgram.service.managed.ClientCallAdaptersKt$callFlow$1 */
    static final class C467901 extends ContinuationImpl7 implements Function2<FlowCollector<? super JsonElement>, Continuation<? super Unit>, Object> {
        final /* synthetic */ A $arguments;
        final /* synthetic */ KSerializer3<A> $argumentsSerializer;
        final /* synthetic */ String $endpointName;
        final /* synthetic */ Json $json;
        final /* synthetic */ Integer $limit;
        final /* synthetic */ ClientBridge $this_callFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C467901(Json json, KSerializer3<? super A> kSerializer3, A a, ClientBridge clientBridge, String str, Integer num, Continuation<? super C467901> continuation) {
            super(2, continuation);
            this.$json = json;
            this.$argumentsSerializer = kSerializer3;
            this.$arguments = a;
            this.$this_callFlow = clientBridge;
            this.$endpointName = str;
            this.$limit = num;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C467901 c467901 = new C467901(this.$json, this.$argumentsSerializer, this.$arguments, this.$this_callFlow, this.$endpointName, this.$limit, continuation);
            c467901.L$0 = obj;
            return c467901;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super JsonElement> flowCollector, Continuation<? super Unit> continuation) {
            return ((C467901) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<JsonElement> flowCall = ClientCallAdapters.call(this.$this_callFlow, this.$json, this.$endpointName, this.$json.encodeToJsonElement(this.$argumentsSerializer, this.$arguments), this.$limit);
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flowCall, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <A, R> Flow<R> callFlow(ClientBridge clientBridge, final Json json, KSerializer3<? super A> argumentsSerializer, final KSerializer2<? extends R> emissionDeserializer, String endpointName, A a, Integer num) {
        Intrinsics.checkNotNullParameter(clientBridge, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(argumentsSerializer, "argumentsSerializer");
        Intrinsics.checkNotNullParameter(emissionDeserializer, "emissionDeserializer");
        Intrinsics.checkNotNullParameter(endpointName, "endpointName");
        final Flow flow = FlowKt.flow(new C467901(json, argumentsSerializer, a, clientBridge, endpointName, num, null));
        return FlowKt.flowOn(new Flow<R>() { // from class: microgram.service.managed.ClientCallAdaptersKt$callFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: microgram.service.managed.ClientCallAdaptersKt$callFlow$$inlined$map$1$2 */
            public static final class C467882<T> implements FlowCollector {
                final /* synthetic */ KSerializer2 $emissionDeserializer$inlined;
                final /* synthetic */ Json $json$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "microgram.service.managed.ClientCallAdaptersKt$callFlow$$inlined$map$1$2", m3645f = "ClientCallAdapters.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: microgram.service.managed.ClientCallAdaptersKt$callFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C467882.this.emit(null, this);
                    }
                }

                public C467882(FlowCollector flowCollector, Json json, KSerializer2 kSerializer2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$json$inlined = json;
                    this.$emissionDeserializer$inlined = kSerializer2;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object objDecodeFromJsonElementSafe = JsonElementHelpers.decodeFromJsonElementSafe(this.$json$inlined, this.$emissionDeserializer$inlined, (JsonElement) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objDecodeFromJsonElementSafe, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C467882(flowCollector, json, emissionDeserializer), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatching.getWorkDispatcher());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <A, R> Object callSuspendFunction(ClientBridge clientBridge, Json json, KSerializer3<? super A> kSerializer3, KSerializer2<? extends R> kSerializer2, String str, A a, Continuation<? super R> continuation) throws IOException {
        C467912 c467912;
        String str2;
        NoSuchElementException noSuchElementException;
        if (continuation instanceof C467912) {
            c467912 = (C467912) continuation;
            int i = c467912.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c467912.label = i - Integer.MIN_VALUE;
            } else {
                c467912 = new C467912(continuation);
            }
        }
        Object obj = c467912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c467912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowCallFlow = callFlow(clientBridge, json, kSerializer3, kSerializer2, str, a, boxing.boxInt(1));
            try {
                c467912.L$0 = clientBridge;
                str2 = str;
            } catch (NoSuchElementException e) {
                e = e;
                str2 = str;
            }
            try {
                c467912.L$1 = str2;
                c467912.label = 1;
                Object objFirst = FlowKt.first(flowCallFlow, c467912);
                return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
            } catch (NoSuchElementException e2) {
                e = e2;
                noSuchElementException = e;
                throw new IOException("Called endpoint emitted zero elements, but at least one is required for unary endpoints. bridge = " + clientBridge + ", endpointName = " + str2, noSuchElementException);
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = (String) c467912.L$1;
        ClientBridge clientBridge2 = (ClientBridge) c467912.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            return obj;
        } catch (NoSuchElementException e3) {
            noSuchElementException = e3;
            str2 = str3;
            clientBridge = clientBridge2;
        }
        throw new IOException("Called endpoint emitted zero elements, but at least one is required for unary endpoints. bridge = " + clientBridge + ", endpointName = " + str2, noSuchElementException);
    }

    @PublishedApi
    public static final Flow<JsonElement> call(ClientBridge clientBridge, Json json, String endpointName, JsonElement arguments, Integer num) {
        Intrinsics.checkNotNullParameter(clientBridge, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(endpointName, "endpointName");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return FlowKt.flowOn(FlowKt.flow(new C467891(clientBridge, json, new EndpointCallBody(endpointName, arguments), num, null)), Dispatching.getWorkDispatcher());
    }

    /* compiled from: ClientCallAdapters.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/serialization/json/JsonElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.managed.ClientCallAdaptersKt$call$1", m3645f = "ClientCallAdapters.kt", m3646l = {103}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: microgram.service.managed.ClientCallAdaptersKt$call$1 */
    static final class C467891 extends ContinuationImpl7 implements Function2<FlowCollector<? super JsonElement>, Continuation<? super Unit>, Object> {
        final /* synthetic */ EndpointCallBody $callBody;
        final /* synthetic */ Json $json;
        final /* synthetic */ Integer $limit;
        final /* synthetic */ ClientBridge $this_call;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C467891(ClientBridge clientBridge, Json json, EndpointCallBody endpoints, Integer num, Continuation<? super C467891> continuation) {
            super(2, continuation);
            this.$this_call = clientBridge;
            this.$json = json;
            this.$callBody = endpoints;
            this.$limit = num;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C467891 c467891 = new C467891(this.$this_call, this.$json, this.$callBody, this.$limit, continuation);
            c467891.L$0 = obj;
            return c467891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super JsonElement> flowCollector, Continuation<? super Unit> continuation) {
            return ((C467891) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ClientBridge clientBridge = this.$this_call;
                Json json = this.$json;
                EndpointCallBody endpoints = this.$callBody;
                json.getSerializersModule();
                Flow<JsonElement> flowCall = clientBridge.call(json.encodeToJsonElement(EndpointCallBody.INSTANCE.serializer(), endpoints), this.$limit);
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flowCall, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
