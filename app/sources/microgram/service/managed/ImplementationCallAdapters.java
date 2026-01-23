package microgram.service.managed;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
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

/* compiled from: ImplementationCallAdapters.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aq\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"A", "R", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/DeserializationStrategy;", "argumentsDeserializer", "Lkotlinx/serialization/SerializationStrategy;", "emissionSerializer", "Lkotlinx/serialization/json/JsonElement;", "arguments", "Lkotlin/Function1;", "Lkotlinx/coroutines/flow/Flow;", "call", "adaptFlow", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/SerializationStrategy;Lkotlinx/serialization/json/JsonElement;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "adaptSuspendFunction", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/SerializationStrategy;Lkotlinx/serialization/json/JsonElement;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "microgram-service"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.service.managed.ImplementationCallAdaptersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ImplementationCallAdapters {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ImplementationCallAdapters.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.managed.ImplementationCallAdaptersKt$adaptFlow$1", m3645f = "ImplementationCallAdapters.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: microgram.service.managed.ImplementationCallAdaptersKt$adaptFlow$1 */
    static final class C467941<R> extends ContinuationImpl7 implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ JsonElement $arguments;
        final /* synthetic */ KSerializer2<A> $argumentsDeserializer;
        final /* synthetic */ Function1<A, Flow<R>> $call;
        final /* synthetic */ Json $json;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C467941(Json json, KSerializer2<? extends A> kSerializer2, JsonElement jsonElement, Function1<? super A, ? extends Flow<? extends R>> function1, Continuation<? super C467941> continuation) {
            super(2, continuation);
            this.$json = json;
            this.$argumentsDeserializer = kSerializer2;
            this.$arguments = jsonElement;
            this.$call = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C467941 c467941 = new C467941(this.$json, this.$argumentsDeserializer, this.$arguments, this.$call, continuation);
            c467941.L$0 = obj;
            return c467941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
            return ((C467941) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Flow<R> flowInvoke = this.$call.invoke(JsonElementHelpers.decodeFromJsonElementSafe(this.$json, this.$argumentsDeserializer, this.$arguments));
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flowInvoke, this) == coroutine_suspended) {
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

    public static final <A, R> Flow<JsonElement> adaptFlow(final Json json, KSerializer2<? extends A> argumentsDeserializer, final KSerializer3<? super R> emissionSerializer, JsonElement arguments, Function1<? super A, ? extends Flow<? extends R>> call) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(argumentsDeserializer, "argumentsDeserializer");
        Intrinsics.checkNotNullParameter(emissionSerializer, "emissionSerializer");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(call, "call");
        final Flow flow = FlowKt.flow(new C467941(json, argumentsDeserializer, arguments, call, null));
        return FlowKt.flowOn(new Flow<JsonElement>() { // from class: microgram.service.managed.ImplementationCallAdaptersKt$adaptFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: microgram.service.managed.ImplementationCallAdaptersKt$adaptFlow$$inlined$map$1$2 */
            public static final class C467932<T> implements FlowCollector {
                final /* synthetic */ KSerializer3 $emissionSerializer$inlined;
                final /* synthetic */ Json $json$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "microgram.service.managed.ImplementationCallAdaptersKt$adaptFlow$$inlined$map$1$2", m3645f = "ImplementationCallAdapters.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: microgram.service.managed.ImplementationCallAdaptersKt$adaptFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C467932.this.emit(null, this);
                    }
                }

                public C467932(FlowCollector flowCollector, Json json, KSerializer3 kSerializer3) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$json$inlined = json;
                    this.$emissionSerializer$inlined = kSerializer3;
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
                        JsonElement jsonElementEncodeToJsonElement = this.$json$inlined.encodeToJsonElement(this.$emissionSerializer$inlined, obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(jsonElementEncodeToJsonElement, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super JsonElement> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C467932(flowCollector, json, emissionSerializer), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatching.getWorkDispatcher());
    }

    public static final <A, R> Flow<JsonElement> adaptSuspendFunction(Json json, KSerializer2<? extends A> argumentsDeserializer, KSerializer3<? super R> emissionSerializer, JsonElement arguments, final Function2<? super A, ? super Continuation<? super R>, ? extends Object> call) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(argumentsDeserializer, "argumentsDeserializer");
        Intrinsics.checkNotNullParameter(emissionSerializer, "emissionSerializer");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(call, "call");
        return adaptFlow(json, argumentsDeserializer, emissionSerializer, arguments, new Function1() { // from class: microgram.service.managed.ImplementationCallAdaptersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImplementationCallAdapters.adaptSuspendFunction$lambda$1(call, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow adaptSuspendFunction$lambda$1(Function2 function2, Object obj) {
        return FlowKt.flow(new ImplementationCallAdapters2(function2, obj, null));
    }
}
