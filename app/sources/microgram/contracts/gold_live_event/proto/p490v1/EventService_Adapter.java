package microgram.contracts.gold_live_event.proto.p490v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.contracts.gold_live_event.proto.p490v1.EventService_Adapter;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: EventService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001f !\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006#"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/EventService_Adapter;", "Lmicrogram/contracts/gold_live_event/proto/v1/EventService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationResponseDto;", "GetEventConfiguration", "(Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityRequestDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityResponseDto;", "UpdateEventPageVisibility", "(Lmicrogram/contracts/gold_live_event/proto/v1/UpdateEventPageVisibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusRequestDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusResponseDto;", "UpdatePlaybackStatus", "(Lmicrogram/contracts/gold_live_event/proto/v1/UpdatePlaybackStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/gold_live_event/proto/v1/HandleUserDismissRequestDto;", "Lmicrogram/contracts/gold_live_event/proto/v1/HandleUserDismissResponseDto;", "HandleUserDismiss", "(Lmicrogram/contracts/gold_live_event/proto/v1/HandleUserDismissRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetEventConfigurationEndpoint", "UpdateEventPageVisibilityEndpoint", "UpdatePlaybackStatusEndpoint", "HandleUserDismissEndpoint", "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class EventService_Adapter implements EventService {
    private final ClientBridge __bridge;
    private final Json json;

    public EventService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.gold_live_event.proto.p490v1.EventService
    public Flow<GetEventConfigurationResponseDto> GetEventConfiguration(GetEventConfigurationRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, GetEventConfigurationRequestDto.INSTANCE.getBinaryBase64Serializer(), GetEventConfigurationResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetEventConfiguration", request, null, 32, null);
    }

    @Override // microgram.contracts.gold_live_event.proto.p490v1.EventService
    public Object UpdateEventPageVisibility(UpdateEventPageVisibilityRequestDto updateEventPageVisibilityRequestDto, Continuation<? super UpdateEventPageVisibilityResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateEventPageVisibilityRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateEventPageVisibilityResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateEventPageVisibility", updateEventPageVisibilityRequestDto, continuation);
    }

    @Override // microgram.contracts.gold_live_event.proto.p490v1.EventService
    public Object UpdatePlaybackStatus(UpdatePlaybackStatusRequestDto updatePlaybackStatusRequestDto, Continuation<? super UpdatePlaybackStatusResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdatePlaybackStatusRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdatePlaybackStatusResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdatePlaybackStatus", updatePlaybackStatusRequestDto, continuation);
    }

    @Override // microgram.contracts.gold_live_event.proto.p490v1.EventService
    public Object HandleUserDismiss(HandleUserDismissRequestDto handleUserDismissRequestDto, Continuation<? super HandleUserDismissResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, HandleUserDismissRequestDto.INSTANCE.getBinaryBase64Serializer(), HandleUserDismissResponseDto.INSTANCE.getBinaryBase64Serializer(), "HandleUserDismiss", handleUserDismissRequestDto, continuation);
    }

    /* compiled from: EventService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/EventService_Adapter$GetEventConfigurationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/gold_live_event/proto/v1/EventService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/gold_live_event/proto/v1/EventService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetEventConfigurationEndpoint implements ServiceCallable {
        private final Json json;
        private final EventService service;

        public GetEventConfigurationEndpoint(EventService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, GetEventConfigurationRequestDto.INSTANCE.getBinaryBase64Serializer(), GetEventConfigurationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.gold_live_event.proto.v1.EventService_Adapter$GetEventConfigurationEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EventService_Adapter.GetEventConfigurationEndpoint.call$lambda$0(this.f$0, (GetEventConfigurationRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetEventConfigurationEndpoint getEventConfigurationEndpoint, GetEventConfigurationRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getEventConfigurationEndpoint.service.GetEventConfiguration(request);
        }
    }

    /* compiled from: EventService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/EventService_Adapter$UpdateEventPageVisibilityEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/gold_live_event/proto/v1/EventService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/gold_live_event/proto/v1/EventService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateEventPageVisibilityEndpoint implements ServiceCallable {
        private final Json json;
        private final EventService service;

        public UpdateEventPageVisibilityEndpoint(EventService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateEventPageVisibilityRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateEventPageVisibilityResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EventService_Adapter3(this, null));
        }
    }

    /* compiled from: EventService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/EventService_Adapter$UpdatePlaybackStatusEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/gold_live_event/proto/v1/EventService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/gold_live_event/proto/v1/EventService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdatePlaybackStatusEndpoint implements ServiceCallable {
        private final Json json;
        private final EventService service;

        public UpdatePlaybackStatusEndpoint(EventService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdatePlaybackStatusRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdatePlaybackStatusResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EventService_Adapter4(this, null));
        }
    }

    /* compiled from: EventService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/gold_live_event/proto/v1/EventService_Adapter$HandleUserDismissEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/gold_live_event/proto/v1/EventService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/gold_live_event/proto/v1/EventService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.gold_live_event.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class HandleUserDismissEndpoint implements ServiceCallable {
        private final Json json;
        private final EventService service;

        public HandleUserDismissEndpoint(EventService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, HandleUserDismissRequestDto.INSTANCE.getBinaryBase64Serializer(), HandleUserDismissResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EventService_Adapter2(this, null));
        }
    }
}
