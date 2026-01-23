package common.global_notification.proto.p425v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import common.global_notification.proto.p425v1.NotificationService_Adapter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: NotificationService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001b\u001c\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001e"}, m3636d2 = {"Lcommon/global_notification/proto/v1/NotificationService_Adapter;", "Lcommon/global_notification/proto/v1/NotificationService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcommon/global_notification/proto/v1/PostNotificationRequestDto;", "request", "Lcommon/global_notification/proto/v1/PostNotificationResponseDto;", "PostNotification", "(Lcommon/global_notification/proto/v1/PostNotificationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcommon/global_notification/proto/v1/ObserveNotificationRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lcommon/global_notification/proto/v1/ObserveNotificationResponseDto;", "ObserveNotification", "(Lcommon/global_notification/proto/v1/ObserveNotificationRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lcommon/global_notification/proto/v1/StopObservingNotificationRequestDto;", "Lcommon/global_notification/proto/v1/StopObservingNotificationResponseDto;", "StopObservingNotification", "(Lcommon/global_notification/proto/v1/StopObservingNotificationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "PostNotificationEndpoint", "ObserveNotificationEndpoint", "StopObservingNotificationEndpoint", "global_notification.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class NotificationService_Adapter implements NotificationService {
    private final ClientBridge __bridge;
    private final Json json;

    public NotificationService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // common.global_notification.proto.p425v1.NotificationService
    public Object PostNotification(PostNotificationRequestDto postNotificationRequestDto, Continuation<? super PostNotificationResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, PostNotificationRequestDto.INSTANCE.getBinaryBase64Serializer(), PostNotificationResponseDto.INSTANCE.getBinaryBase64Serializer(), "PostNotification", postNotificationRequestDto, continuation);
    }

    @Override // common.global_notification.proto.p425v1.NotificationService
    public Flow<ObserveNotificationResponseDto> ObserveNotification(ObserveNotificationRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, ObserveNotificationRequestDto.INSTANCE.getBinaryBase64Serializer(), ObserveNotificationResponseDto.INSTANCE.getBinaryBase64Serializer(), "ObserveNotification", request, null, 32, null);
    }

    @Override // common.global_notification.proto.p425v1.NotificationService
    public Object StopObservingNotification(StopObservingNotificationRequestDto stopObservingNotificationRequestDto, Continuation<? super StopObservingNotificationResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, StopObservingNotificationRequestDto.INSTANCE.getBinaryBase64Serializer(), StopObservingNotificationResponseDto.INSTANCE.getBinaryBase64Serializer(), "StopObservingNotification", stopObservingNotificationRequestDto, continuation);
    }

    /* compiled from: NotificationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcommon/global_notification/proto/v1/NotificationService_Adapter$PostNotificationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcommon/global_notification/proto/v1/NotificationService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcommon/global_notification/proto/v1/NotificationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "global_notification.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PostNotificationEndpoint implements ServiceCallable {
        private final Json json;
        private final NotificationService service;

        public PostNotificationEndpoint(NotificationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, PostNotificationRequestDto.INSTANCE.getBinaryBase64Serializer(), PostNotificationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new NotificationService_Adapter2(this, null));
        }
    }

    /* compiled from: NotificationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcommon/global_notification/proto/v1/NotificationService_Adapter$ObserveNotificationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcommon/global_notification/proto/v1/NotificationService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcommon/global_notification/proto/v1/NotificationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "global_notification.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ObserveNotificationEndpoint implements ServiceCallable {
        private final Json json;
        private final NotificationService service;

        public ObserveNotificationEndpoint(NotificationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, ObserveNotificationRequestDto.INSTANCE.getBinaryBase64Serializer(), ObserveNotificationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: common.global_notification.proto.v1.NotificationService_Adapter$ObserveNotificationEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationService_Adapter.ObserveNotificationEndpoint.call$lambda$0(this.f$0, (ObserveNotificationRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(ObserveNotificationEndpoint observeNotificationEndpoint, ObserveNotificationRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return observeNotificationEndpoint.service.ObserveNotification(request);
        }
    }

    /* compiled from: NotificationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcommon/global_notification/proto/v1/NotificationService_Adapter$StopObservingNotificationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcommon/global_notification/proto/v1/NotificationService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcommon/global_notification/proto/v1/NotificationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "global_notification.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StopObservingNotificationEndpoint implements ServiceCallable {
        private final Json json;
        private final NotificationService service;

        public StopObservingNotificationEndpoint(NotificationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, StopObservingNotificationRequestDto.INSTANCE.getBinaryBase64Serializer(), StopObservingNotificationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new NotificationService_Adapter3(this, null));
        }
    }
}
