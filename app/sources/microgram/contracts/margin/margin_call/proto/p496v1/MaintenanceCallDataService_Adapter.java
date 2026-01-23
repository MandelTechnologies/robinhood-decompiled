package microgram.contracts.margin.margin_call.proto.p496v1;

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

/* compiled from: MaintenanceCallDataService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService_Adapter;", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataRequestDto;", "request", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "GetMaintenanceCallData", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelRequestDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto;", "GetNbboSummaryModel", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataRequestDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "GetMaintenanceCallSummaryFromData", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetMaintenanceCallDataEndpoint", "GetNbboSummaryModelEndpoint", "GetMaintenanceCallSummaryFromDataEndpoint", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class MaintenanceCallDataService_Adapter implements MaintenanceCallDataService {
    private final ClientBridge __bridge;
    private final Json json;

    public MaintenanceCallDataService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataService
    public Object GetMaintenanceCallData(GetMaintenanceCallDataRequestDto getMaintenanceCallDataRequestDto, Continuation<? super GetMaintenanceCallDataResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetMaintenanceCallDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetMaintenanceCallDataResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetMaintenanceCallData", getMaintenanceCallDataRequestDto, continuation);
    }

    @Override // microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataService
    public Object GetNbboSummaryModel(GetNbboSummaryModelRequestDto getNbboSummaryModelRequestDto, Continuation<? super GetNbboSummaryModelResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetNbboSummaryModelRequestDto.INSTANCE.getBinaryBase64Serializer(), GetNbboSummaryModelResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetNbboSummaryModel", getNbboSummaryModelRequestDto, continuation);
    }

    @Override // microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataService
    public Object GetMaintenanceCallSummaryFromData(GetMaintenanceCallSummaryFromDataRequestDto getMaintenanceCallSummaryFromDataRequestDto, Continuation<? super GetMaintenanceCallSummaryFromDataResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetMaintenanceCallSummaryFromDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetMaintenanceCallSummaryFromDataResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetMaintenanceCallSummaryFromData", getMaintenanceCallSummaryFromDataRequestDto, continuation);
    }

    /* compiled from: MaintenanceCallDataService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService_Adapter$GetMaintenanceCallDataEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetMaintenanceCallDataEndpoint implements ServiceCallable {
        private final Json json;
        private final MaintenanceCallDataService service;

        public GetMaintenanceCallDataEndpoint(MaintenanceCallDataService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetMaintenanceCallDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetMaintenanceCallDataResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new MaintenanceCallDataService_Adapter2(this, null));
        }
    }

    /* compiled from: MaintenanceCallDataService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService_Adapter$GetNbboSummaryModelEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetNbboSummaryModelEndpoint implements ServiceCallable {
        private final Json json;
        private final MaintenanceCallDataService service;

        public GetNbboSummaryModelEndpoint(MaintenanceCallDataService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetNbboSummaryModelRequestDto.INSTANCE.getBinaryBase64Serializer(), GetNbboSummaryModelResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new MaintenanceCallDataService_Adapter4(this, null));
        }
    }

    /* compiled from: MaintenanceCallDataService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService_Adapter$GetMaintenanceCallSummaryFromDataEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetMaintenanceCallSummaryFromDataEndpoint implements ServiceCallable {
        private final Json json;
        private final MaintenanceCallDataService service;

        public GetMaintenanceCallSummaryFromDataEndpoint(MaintenanceCallDataService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetMaintenanceCallSummaryFromDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetMaintenanceCallSummaryFromDataResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new MaintenanceCallDataService_Adapter3(this, null));
        }
    }
}
