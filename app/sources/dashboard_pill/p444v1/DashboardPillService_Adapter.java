package dashboard_pill.p444v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import dashboard_pill.p444v1.DashboardPillService_Adapter;
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

/* compiled from: DashboardPillService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001f !\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006#"}, m3636d2 = {"Ldashboard_pill/v1/DashboardPillService_Adapter;", "Ldashboard_pill/v1/DashboardPillService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "GetBadgeData", "(Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ldashboard_pill/v1/ClearNotificationDotRequestDto;", "Ldashboard_pill/v1/ClearNotificationDotResponseDto;", "ClearNotificationDot", "(Ldashboard_pill/v1/ClearNotificationDotRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldashboard_pill/v1/AppStateChangedRequestDto;", "Ldashboard_pill/v1/AppStateChangedResponseDto;", "AppStateChanged", "(Ldashboard_pill/v1/AppStateChangedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldashboard_pill/v1/SetVisibleLocationRequestDto;", "Ldashboard_pill/v1/SetVisibleLocationResponseDto;", "SetVisibleLocation", "(Ldashboard_pill/v1/SetVisibleLocationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetBadgeDataEndpoint", "ClearNotificationDotEndpoint", "AppStateChangedEndpoint", "SetVisibleLocationEndpoint", "dashboard_pill.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class DashboardPillService_Adapter implements DashboardPillService {
    private final ClientBridge __bridge;
    private final Json json;

    public DashboardPillService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // dashboard_pill.p444v1.DashboardPillService
    public Flow<GetBadgeDataResponseDto> GetBadgeData(GetBadgeDataRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, GetBadgeDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetBadgeDataResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetBadgeData", request, null, 32, null);
    }

    @Override // dashboard_pill.p444v1.DashboardPillService
    public Object ClearNotificationDot(ClearNotificationDotRequestDto clearNotificationDotRequestDto, Continuation<? super ClearNotificationDotResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ClearNotificationDotRequestDto.INSTANCE.getBinaryBase64Serializer(), ClearNotificationDotResponseDto.INSTANCE.getBinaryBase64Serializer(), "ClearNotificationDot", clearNotificationDotRequestDto, continuation);
    }

    @Override // dashboard_pill.p444v1.DashboardPillService
    public Object AppStateChanged(AppStateChangedRequestDto appStateChangedRequestDto, Continuation<? super AppStateChangedResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, AppStateChangedRequestDto.INSTANCE.getBinaryBase64Serializer(), AppStateChangedResponseDto.INSTANCE.getBinaryBase64Serializer(), "AppStateChanged", appStateChangedRequestDto, continuation);
    }

    @Override // dashboard_pill.p444v1.DashboardPillService
    public Object SetVisibleLocation(SetVisibleLocationRequestDto setVisibleLocationRequestDto, Continuation<? super SetVisibleLocationResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SetVisibleLocationRequestDto.INSTANCE.getBinaryBase64Serializer(), SetVisibleLocationResponseDto.INSTANCE.getBinaryBase64Serializer(), "SetVisibleLocation", setVisibleLocationRequestDto, continuation);
    }

    /* compiled from: DashboardPillService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ldashboard_pill/v1/DashboardPillService_Adapter$GetBadgeDataEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ldashboard_pill/v1/DashboardPillService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ldashboard_pill/v1/DashboardPillService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "dashboard_pill.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetBadgeDataEndpoint implements ServiceCallable {
        private final Json json;
        private final DashboardPillService service;

        public GetBadgeDataEndpoint(DashboardPillService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, GetBadgeDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetBadgeDataResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: dashboard_pill.v1.DashboardPillService_Adapter$GetBadgeDataEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DashboardPillService_Adapter.GetBadgeDataEndpoint.call$lambda$0(this.f$0, (GetBadgeDataRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetBadgeDataEndpoint getBadgeDataEndpoint, GetBadgeDataRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getBadgeDataEndpoint.service.GetBadgeData(request);
        }
    }

    /* compiled from: DashboardPillService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ldashboard_pill/v1/DashboardPillService_Adapter$ClearNotificationDotEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ldashboard_pill/v1/DashboardPillService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ldashboard_pill/v1/DashboardPillService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "dashboard_pill.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ClearNotificationDotEndpoint implements ServiceCallable {
        private final Json json;
        private final DashboardPillService service;

        public ClearNotificationDotEndpoint(DashboardPillService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ClearNotificationDotRequestDto.INSTANCE.getBinaryBase64Serializer(), ClearNotificationDotResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new DashboardPillService_Adapter3(this, null));
        }
    }

    /* compiled from: DashboardPillService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ldashboard_pill/v1/DashboardPillService_Adapter$AppStateChangedEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ldashboard_pill/v1/DashboardPillService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ldashboard_pill/v1/DashboardPillService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "dashboard_pill.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AppStateChangedEndpoint implements ServiceCallable {
        private final Json json;
        private final DashboardPillService service;

        public AppStateChangedEndpoint(DashboardPillService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, AppStateChangedRequestDto.INSTANCE.getBinaryBase64Serializer(), AppStateChangedResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new DashboardPillService_Adapter2(this, null));
        }
    }

    /* compiled from: DashboardPillService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ldashboard_pill/v1/DashboardPillService_Adapter$SetVisibleLocationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ldashboard_pill/v1/DashboardPillService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ldashboard_pill/v1/DashboardPillService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "dashboard_pill.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SetVisibleLocationEndpoint implements ServiceCallable {
        private final Json json;
        private final DashboardPillService service;

        public SetVisibleLocationEndpoint(DashboardPillService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SetVisibleLocationRequestDto.INSTANCE.getBinaryBase64Serializer(), SetVisibleLocationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new DashboardPillService_Adapter4(this, null));
        }
    }
}
