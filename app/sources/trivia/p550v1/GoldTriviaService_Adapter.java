package trivia.p550v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
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
import trivia.p550v1.GoldTriviaService_Adapter;

/* compiled from: GoldTriviaService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0007+,-./01B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020#H\u0096@¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*¨\u00062"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter;", "Ltrivia/v1/GoldTriviaService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "GetBadgeData", "(Lmessaging/proto/badge/v1/GetBadgeDataRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ltrivia/v1/GetVideoViewModelRequestDto;", "Ltrivia/v1/GetVideoViewModelResponseDto;", "GetVideoViewModel", "(Ltrivia/v1/GetVideoViewModelRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ltrivia/v1/VideoBufferingBeganRequestDto;", "Ltrivia/v1/VideoBufferingBeganResponseDto;", "VideoBufferingBegan", "(Ltrivia/v1/VideoBufferingBeganRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/VideoBufferingEndedRequestDto;", "Ltrivia/v1/VideoBufferingEndedResponseDto;", "VideoBufferingEnded", "(Ltrivia/v1/VideoBufferingEndedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/CloseButtonTappedRequestDto;", "Ltrivia/v1/CloseButtonTappedResponseDto;", "CloseButtonTapped", "(Ltrivia/v1/CloseButtonTappedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/ScreenStateChangedRequestDto;", "Ltrivia/v1/ScreenStateChangedResponseDto;", "ScreenStateChanged", "(Ltrivia/v1/ScreenStateChangedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/AppStateChangedRequestDto;", "Ltrivia/v1/AppStateChangedResponseDto;", "AppStateChanged", "(Ltrivia/v1/AppStateChangedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetBadgeDataEndpoint", "GetVideoViewModelEndpoint", "VideoBufferingBeganEndpoint", "VideoBufferingEndedEndpoint", "CloseButtonTappedEndpoint", "ScreenStateChangedEndpoint", "AppStateChangedEndpoint", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
final class GoldTriviaService_Adapter implements GoldTriviaService {
    private final ClientBridge __bridge;
    private final Json json;

    public GoldTriviaService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // trivia.p550v1.GoldTriviaService
    public Flow<GetBadgeDataResponseDto> GetBadgeData(GetBadgeDataRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, GetBadgeDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetBadgeDataResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetBadgeData", request, null, 32, null);
    }

    @Override // trivia.p550v1.GoldTriviaService
    public Flow<GetVideoViewModelResponseDto> GetVideoViewModel(GetVideoViewModelRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, GetVideoViewModelRequestDto.INSTANCE.getBinaryBase64Serializer(), GetVideoViewModelResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetVideoViewModel", request, null, 32, null);
    }

    @Override // trivia.p550v1.GoldTriviaService
    public Object VideoBufferingBegan(VideoBufferingBeganRequestDto videoBufferingBeganRequestDto, Continuation<? super VideoBufferingBeganResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, VideoBufferingBeganRequestDto.INSTANCE.getBinaryBase64Serializer(), VideoBufferingBeganResponseDto.INSTANCE.getBinaryBase64Serializer(), "VideoBufferingBegan", videoBufferingBeganRequestDto, continuation);
    }

    @Override // trivia.p550v1.GoldTriviaService
    public Object VideoBufferingEnded(VideoBufferingEndedRequestDto videoBufferingEndedRequestDto, Continuation<? super VideoBufferingEndedResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, VideoBufferingEndedRequestDto.INSTANCE.getBinaryBase64Serializer(), VideoBufferingEndedResponseDto.INSTANCE.getBinaryBase64Serializer(), "VideoBufferingEnded", videoBufferingEndedRequestDto, continuation);
    }

    @Override // trivia.p550v1.GoldTriviaService
    public Object CloseButtonTapped(CloseButtonTappedRequestDto closeButtonTappedRequestDto, Continuation<? super CloseButtonTappedResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, CloseButtonTappedRequestDto.INSTANCE.getBinaryBase64Serializer(), CloseButtonTappedResponseDto.INSTANCE.getBinaryBase64Serializer(), "CloseButtonTapped", closeButtonTappedRequestDto, continuation);
    }

    @Override // trivia.p550v1.GoldTriviaService
    public Object ScreenStateChanged(ScreenStateChangedRequestDto screenStateChangedRequestDto, Continuation<? super ScreenStateChangedResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ScreenStateChangedRequestDto.INSTANCE.getBinaryBase64Serializer(), ScreenStateChangedResponseDto.INSTANCE.getBinaryBase64Serializer(), "ScreenStateChanged", screenStateChangedRequestDto, continuation);
    }

    @Override // trivia.p550v1.GoldTriviaService
    public Object AppStateChanged(AppStateChangedRequestDto appStateChangedRequestDto, Continuation<? super AppStateChangedResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, AppStateChangedRequestDto.INSTANCE.getBinaryBase64Serializer(), AppStateChangedResponseDto.INSTANCE.getBinaryBase64Serializer(), "AppStateChanged", appStateChangedRequestDto, continuation);
    }

    /* compiled from: GoldTriviaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter$GetBadgeDataEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetBadgeDataEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaService service;

        public GetBadgeDataEndpoint(GoldTriviaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, GetBadgeDataRequestDto.INSTANCE.getBinaryBase64Serializer(), GetBadgeDataResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: trivia.v1.GoldTriviaService_Adapter$GetBadgeDataEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldTriviaService_Adapter.GetBadgeDataEndpoint.call$lambda$0(this.f$0, (GetBadgeDataRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetBadgeDataEndpoint getBadgeDataEndpoint, GetBadgeDataRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getBadgeDataEndpoint.service.GetBadgeData(request);
        }
    }

    /* compiled from: GoldTriviaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter$GetVideoViewModelEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetVideoViewModelEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaService service;

        public GetVideoViewModelEndpoint(GoldTriviaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, GetVideoViewModelRequestDto.INSTANCE.getBinaryBase64Serializer(), GetVideoViewModelResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: trivia.v1.GoldTriviaService_Adapter$GetVideoViewModelEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldTriviaService_Adapter.GetVideoViewModelEndpoint.call$lambda$0(this.f$0, (GetVideoViewModelRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetVideoViewModelEndpoint getVideoViewModelEndpoint, GetVideoViewModelRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getVideoViewModelEndpoint.service.GetVideoViewModel(request);
        }
    }

    /* compiled from: GoldTriviaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter$VideoBufferingBeganEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VideoBufferingBeganEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaService service;

        public VideoBufferingBeganEndpoint(GoldTriviaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, VideoBufferingBeganRequestDto.INSTANCE.getBinaryBase64Serializer(), VideoBufferingBeganResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaService_Adapter5(this, null));
        }
    }

    /* compiled from: GoldTriviaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter$VideoBufferingEndedEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VideoBufferingEndedEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaService service;

        public VideoBufferingEndedEndpoint(GoldTriviaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, VideoBufferingEndedRequestDto.INSTANCE.getBinaryBase64Serializer(), VideoBufferingEndedResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaService_Adapter6(this, null));
        }
    }

    /* compiled from: GoldTriviaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter$CloseButtonTappedEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CloseButtonTappedEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaService service;

        public CloseButtonTappedEndpoint(GoldTriviaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, CloseButtonTappedRequestDto.INSTANCE.getBinaryBase64Serializer(), CloseButtonTappedResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaService_Adapter3(this, null));
        }
    }

    /* compiled from: GoldTriviaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter$ScreenStateChangedEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScreenStateChangedEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaService service;

        public ScreenStateChangedEndpoint(GoldTriviaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ScreenStateChangedRequestDto.INSTANCE.getBinaryBase64Serializer(), ScreenStateChangedResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaService_Adapter4(this, null));
        }
    }

    /* compiled from: GoldTriviaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaService_Adapter$AppStateChangedEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AppStateChangedEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaService service;

        public AppStateChangedEndpoint(GoldTriviaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, AppStateChangedRequestDto.INSTANCE.getBinaryBase64Serializer(), AppStateChangedResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaService_Adapter2(this, null));
        }
    }
}
