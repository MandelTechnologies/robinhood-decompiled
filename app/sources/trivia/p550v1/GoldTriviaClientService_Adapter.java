package trivia.p550v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import eoy_giveaway.p456v1.DismissProgramViewRequestDto;
import eoy_giveaway.p456v1.DismissProgramViewResponseDto;
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

/* compiled from: GoldTriviaClientService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Ltrivia/v1/GoldTriviaClientService_Adapter;", "Ltrivia/v1/GoldTriviaClientService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Leoy_giveaway/v1/DismissProgramViewRequestDto;", "request", "Leoy_giveaway/v1/DismissProgramViewResponseDto;", "DismissProgramView", "(Leoy_giveaway/v1/DismissProgramViewRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/SeekVideoPlaybackRequestDto;", "Ltrivia/v1/SeekVideoPlaybackResponseDto;", "SeekVideoPlayback", "(Ltrivia/v1/SeekVideoPlaybackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltrivia/v1/SetTriviaEventReminderRequestDto;", "Ltrivia/v1/SetTriviaEventReminderResponseDto;", "SetTriviaEventReminder", "(Ltrivia/v1/SetTriviaEventReminderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "DismissProgramViewEndpoint", "SeekVideoPlaybackEndpoint", "SetTriviaEventReminderEndpoint", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
final class GoldTriviaClientService_Adapter implements GoldTriviaClientService {
    private final ClientBridge __bridge;
    private final Json json;

    public GoldTriviaClientService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // trivia.p550v1.GoldTriviaClientService
    public Object DismissProgramView(DismissProgramViewRequestDto dismissProgramViewRequestDto, Continuation<? super DismissProgramViewResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, DismissProgramViewRequestDto.INSTANCE.getBinaryBase64Serializer(), DismissProgramViewResponseDto.INSTANCE.getBinaryBase64Serializer(), "DismissProgramView", dismissProgramViewRequestDto, continuation);
    }

    @Override // trivia.p550v1.GoldTriviaClientService
    public Object SeekVideoPlayback(SeekVideoPlaybackRequestDto seekVideoPlaybackRequestDto, Continuation<? super SeekVideoPlaybackResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SeekVideoPlaybackRequestDto.INSTANCE.getBinaryBase64Serializer(), SeekVideoPlaybackResponseDto.INSTANCE.getBinaryBase64Serializer(), "SeekVideoPlayback", seekVideoPlaybackRequestDto, continuation);
    }

    @Override // trivia.p550v1.GoldTriviaClientService
    public Object SetTriviaEventReminder(SetTriviaEventReminderRequestDto setTriviaEventReminderRequestDto, Continuation<? super SetTriviaEventReminderResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SetTriviaEventReminderRequestDto.INSTANCE.getBinaryBase64Serializer(), SetTriviaEventReminderResponseDto.INSTANCE.getBinaryBase64Serializer(), "SetTriviaEventReminder", setTriviaEventReminderRequestDto, continuation);
    }

    /* compiled from: GoldTriviaClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaClientService_Adapter$DismissProgramViewEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DismissProgramViewEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaClientService service;

        public DismissProgramViewEndpoint(GoldTriviaClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, DismissProgramViewRequestDto.INSTANCE.getBinaryBase64Serializer(), DismissProgramViewResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaClientService_Adapter2(this, null));
        }
    }

    /* compiled from: GoldTriviaClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaClientService_Adapter$SeekVideoPlaybackEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SeekVideoPlaybackEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaClientService service;

        public SeekVideoPlaybackEndpoint(GoldTriviaClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SeekVideoPlaybackRequestDto.INSTANCE.getBinaryBase64Serializer(), SeekVideoPlaybackResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaClientService_Adapter3(this, null));
        }
    }

    /* compiled from: GoldTriviaClientService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ltrivia/v1/GoldTriviaClientService_Adapter$SetTriviaEventReminderEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ltrivia/v1/GoldTriviaClientService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ltrivia/v1/GoldTriviaClientService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SetTriviaEventReminderEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldTriviaClientService service;

        public SetTriviaEventReminderEndpoint(GoldTriviaClientService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SetTriviaEventReminderRequestDto.INSTANCE.getBinaryBase64Serializer(), SetTriviaEventReminderResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldTriviaClientService_Adapter4(this, null));
        }
    }
}
