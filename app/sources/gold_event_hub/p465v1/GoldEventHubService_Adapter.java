package gold_event_hub.p465v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import eoy_giveaway.p456v1.UpdateAppStateRequestDto;
import eoy_giveaway.p456v1.UpdateAppStateResponseDto;
import eoy_giveaway.p456v1.UpdateProgramViewVisibilityRequestDto;
import eoy_giveaway.p456v1.UpdateProgramViewVisibilityResponseDto;
import gold_event_hub.p465v1.GoldEventHubService_Adapter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import messaging.proto.badge.p484v1.GetBadgeDataRequestDto;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: GoldEventHubService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001b\u001c\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lgold_event_hub/v1/GoldEventHubService_Adapter;", "Lgold_event_hub/v1/GoldEventHubService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "GetBadgeData", "(Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Leoy_giveaway/v1/UpdateAppStateRequestDto;", "Leoy_giveaway/v1/UpdateAppStateResponseDto;", "UpdateAppState", "(Leoy_giveaway/v1/UpdateAppStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leoy_giveaway/v1/UpdateProgramViewVisibilityRequestDto;", "Leoy_giveaway/v1/UpdateProgramViewVisibilityResponseDto;", "UpdateProgramViewVisibility", "(Leoy_giveaway/v1/UpdateProgramViewVisibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetBadgeDataEndpoint", "UpdateAppStateEndpoint", "UpdateProgramViewVisibilityEndpoint", "gold_event_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class GoldEventHubService_Adapter implements GoldEventHubService {
    private final ClientBridge __bridge;
    private final Json json;

    public GoldEventHubService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // gold_event_hub.p465v1.GoldEventHubService
    public Flow<GetBadgeDataResponseDto> GetBadgeData(GetBadgeDataRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, GetBadgeDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetBadgeDataResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetBadgeData", request, null, 32, null);
    }

    @Override // gold_event_hub.p465v1.GoldEventHubService
    public Object UpdateAppState(UpdateAppStateRequestDto updateAppStateRequestDto, Continuation<? super UpdateAppStateResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateAppStateRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateAppStateResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateAppState", updateAppStateRequestDto, continuation);
    }

    @Override // gold_event_hub.p465v1.GoldEventHubService
    public Object UpdateProgramViewVisibility(UpdateProgramViewVisibilityRequestDto updateProgramViewVisibilityRequestDto, Continuation<? super UpdateProgramViewVisibilityResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateProgramViewVisibilityRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateProgramViewVisibilityResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateProgramViewVisibility", updateProgramViewVisibilityRequestDto, continuation);
    }

    /* compiled from: GoldEventHubService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_event_hub/v1/GoldEventHubService_Adapter$GetBadgeDataEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_event_hub/v1/GoldEventHubService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_event_hub/v1/GoldEventHubService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_event_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetBadgeDataEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldEventHubService service;

        public GetBadgeDataEndpoint(GoldEventHubService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, GetBadgeDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetBadgeDataResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_event_hub.v1.GoldEventHubService_Adapter$GetBadgeDataEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldEventHubService_Adapter.GetBadgeDataEndpoint.call$lambda$0(this.f$0, (GetBadgeDataRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetBadgeDataEndpoint getBadgeDataEndpoint, GetBadgeDataRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getBadgeDataEndpoint.service.GetBadgeData(request);
        }
    }

    /* compiled from: GoldEventHubService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_event_hub/v1/GoldEventHubService_Adapter$UpdateAppStateEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_event_hub/v1/GoldEventHubService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_event_hub/v1/GoldEventHubService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_event_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateAppStateEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldEventHubService service;

        public UpdateAppStateEndpoint(GoldEventHubService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateAppStateRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateAppStateResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldEventHubService_Adapter2(this, null));
        }
    }

    /* compiled from: GoldEventHubService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_event_hub/v1/GoldEventHubService_Adapter$UpdateProgramViewVisibilityEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_event_hub/v1/GoldEventHubService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_event_hub/v1/GoldEventHubService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_event_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateProgramViewVisibilityEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldEventHubService service;

        public UpdateProgramViewVisibilityEndpoint(GoldEventHubService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateProgramViewVisibilityRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateProgramViewVisibilityResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldEventHubService_Adapter3(this, null));
        }
    }
}
