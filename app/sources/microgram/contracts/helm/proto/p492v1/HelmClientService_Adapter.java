package microgram.contracts.helm.proto.p492v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: HelmClientService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/helm/proto/v1/HelmClientService_Adapter;", "Lmicrogram/contracts/helm/proto/v1/HelmClientService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequestDto;", "request", "Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowResponseDto;", "StartNativeSubflow", "(Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/helm/proto/v1/EndProcessingRequestDto;", "Lmicrogram/contracts/helm/proto/v1/EndProcessingResponseDto;", "EndProcessing", "(Lmicrogram/contracts/helm/proto/v1/EndProcessingRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/helm/proto/v1/EndFlowRequestDto;", "Lmicrogram/contracts/helm/proto/v1/EndFlowResponseDto;", "EndFlow", "(Lmicrogram/contracts/helm/proto/v1/EndFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "StartNativeSubflowEndpoint", "EndProcessingEndpoint", "EndFlowEndpoint", "helm.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class HelmClientService_Adapter implements HelmClientService {
    private final ClientBridge __bridge;
    private final Json json;

    public HelmClientService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.helm.proto.p492v1.HelmClientService
    public Object StartNativeSubflow(StartNativeSubflowRequestDto startNativeSubflowRequestDto, Continuation<? super StartNativeSubflowResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, StartNativeSubflowRequestDto.INSTANCE.getBinaryBase64Serializer(), StartNativeSubflowResponseDto.INSTANCE.getBinaryBase64Serializer(), "StartNativeSubflow", startNativeSubflowRequestDto, continuation);
    }

    @Override // microgram.contracts.helm.proto.p492v1.HelmClientService
    public Object EndProcessing(EndProcessingRequestDto endProcessingRequestDto, Continuation<? super EndProcessingResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, EndProcessingRequestDto.INSTANCE.getBinaryBase64Serializer(), EndProcessingResponseDto.INSTANCE.getBinaryBase64Serializer(), "EndProcessing", endProcessingRequestDto, continuation);
    }

    @Override // microgram.contracts.helm.proto.p492v1.HelmClientService
    public Object EndFlow(EndFlowRequestDto endFlowRequestDto, Continuation<? super EndFlowResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, EndFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), EndFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), "EndFlow", endFlowRequestDto, continuation);
    }

    /* compiled from: HelmClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/helm/proto/v1/HelmClientService_Adapter$StartNativeSubflowEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/helm/proto/v1/HelmClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/helm/proto/v1/HelmClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "helm.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StartNativeSubflowEndpoint implements ServiceCallable {
        private final Json json;
        private final HelmClientService service;

        public StartNativeSubflowEndpoint(HelmClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, StartNativeSubflowRequestDto.INSTANCE.getBinaryBase64Serializer(), StartNativeSubflowResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new HelmClientService_Adapter4(this, null));
        }
    }

    /* compiled from: HelmClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/helm/proto/v1/HelmClientService_Adapter$EndProcessingEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/helm/proto/v1/HelmClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/helm/proto/v1/HelmClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "helm.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EndProcessingEndpoint implements ServiceCallable {
        private final Json json;
        private final HelmClientService service;

        public EndProcessingEndpoint(HelmClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, EndProcessingRequestDto.INSTANCE.getBinaryBase64Serializer(), EndProcessingResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new HelmClientService_Adapter3(this, null));
        }
    }

    /* compiled from: HelmClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/helm/proto/v1/HelmClientService_Adapter$EndFlowEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/helm/proto/v1/HelmClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/helm/proto/v1/HelmClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "helm.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EndFlowEndpoint implements ServiceCallable {
        private final Json json;
        private final HelmClientService service;

        public EndFlowEndpoint(HelmClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, EndFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), EndFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new HelmClientService_Adapter2(this, null));
        }
    }
}
