package microgram.service.managed;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.serialization.JsonElementHelpers;
import microgram.service.protocol.ProtocolExceptions7;
import microgram.service.protocol.ServiceCallable;

/* compiled from: Endpoints.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lmicrogram/service/managed/EndpointRouter;", "Lmicrogram/service/protocol/ServiceCallable;", "json", "Lkotlinx/serialization/json/Json;", "endpoints", "", "", "<init>", "(Lkotlinx/serialization/json/Json;Ljava/util/Map;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.service.managed.EndpointRouter, reason: use source file name */
/* loaded from: classes14.dex */
public final class Endpoints3 implements ServiceCallable {
    private final Map<String, ServiceCallable> endpoints;
    private final Json json;

    /* JADX WARN: Multi-variable type inference failed */
    public Endpoints3(Json json, Map<String, ? extends ServiceCallable> endpoints) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        this.json = json;
        this.endpoints = endpoints;
    }

    /* compiled from: Endpoints.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/serialization/json/JsonElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.service.managed.EndpointRouter$call$1", m3645f = "Endpoints.kt", m3646l = {37}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: microgram.service.managed.EndpointRouter$call$1 */
    static final class C467921 extends ContinuationImpl7 implements Function2<FlowCollector<? super JsonElement>, Continuation<? super Unit>, Object> {
        final /* synthetic */ JsonElement $body;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C467921(JsonElement jsonElement, Continuation<? super C467921> continuation) {
            super(2, continuation);
            this.$body = jsonElement;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C467921 c467921 = Endpoints3.this.new C467921(this.$body, continuation);
            c467921.L$0 = obj;
            return c467921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super JsonElement> flowCollector, Continuation<? super Unit> continuation) {
            return ((C467921) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws ProtocolExceptions7 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Json json = Endpoints3.this.json;
                JsonElement jsonElement = this.$body;
                json.getSerializersModule();
                EndpointCallBody endpointCallBody = (EndpointCallBody) JsonElementHelpers.decodeFromJsonElementSafe(json, EndpointCallBody.INSTANCE.serializer(), jsonElement);
                ServiceCallable serviceCallable = (ServiceCallable) Endpoints3.this.endpoints.get(endpointCallBody.getEndpointName());
                if (serviceCallable == null) {
                    throw new ProtocolExceptions7("Endpoint does not exist: " + endpointCallBody.getEndpointName());
                }
                Flow<JsonElement> flowCall = serviceCallable.call(endpointCallBody.getArguments());
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

    @Override // microgram.service.protocol.ServiceCallable
    public Flow<JsonElement> call(JsonElement body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return FlowKt.flowOn(FlowKt.flow(new C467921(body, null)), Dispatching.getWorkDispatcher());
    }
}
