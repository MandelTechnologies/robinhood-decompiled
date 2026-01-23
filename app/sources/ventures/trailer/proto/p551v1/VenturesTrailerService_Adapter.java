package ventures.trailer.proto.p551v1;

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

/* compiled from: VenturesTrailerService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lventures/trailer/proto/v1/VenturesTrailerService_Adapter;", "Lventures/trailer/proto/v1/VenturesTrailerService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lventures/trailer/proto/v1/GetTrailerRequestDto;", "request", "Lventures/trailer/proto/v1/GetTrailerResponseDto;", "GetTrailer", "(Lventures/trailer/proto/v1/GetTrailerRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetTrailerEndpoint", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
final class VenturesTrailerService_Adapter implements VenturesTrailerService {
    private final ClientBridge __bridge;
    private final Json json;

    public VenturesTrailerService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // ventures.trailer.proto.p551v1.VenturesTrailerService
    public Object GetTrailer(GetTrailerRequestDto getTrailerRequestDto, Continuation<? super GetTrailerResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetTrailerRequestDto.INSTANCE.getBinaryBase64Serializer(), GetTrailerResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetTrailer", getTrailerRequestDto, continuation);
    }

    /* compiled from: VenturesTrailerService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lventures/trailer/proto/v1/VenturesTrailerService_Adapter$GetTrailerEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lventures/trailer/proto/v1/VenturesTrailerService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lventures/trailer/proto/v1/VenturesTrailerService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetTrailerEndpoint implements ServiceCallable {
        private final Json json;
        private final VenturesTrailerService service;

        public GetTrailerEndpoint(VenturesTrailerService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetTrailerRequestDto.INSTANCE.getBinaryBase64Serializer(), GetTrailerResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new VenturesTrailerService_Adapter2(this, null));
        }
    }
}
