package microgram.contracts.service_incentives_wonka.proto.p504v1;

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

/* compiled from: IncentivesWonkaService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService_Adapter;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedRequestDto;", "request", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedResponseDto;", "PromotionUnlocked", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/PromotionUnlockedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferRequestDto;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferResponseDto;", "ContinueTransfer", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/ContinueTransferRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowRequestDto;", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowResponseDto;", "ExitTransferFlow", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/ExitTransferFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "PromotionUnlockedEndpoint", "ContinueTransferEndpoint", "ExitTransferFlowEndpoint", "service_incentives_wonka.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class IncentivesWonkaService_Adapter implements IncentivesWonkaService {
    private final ClientBridge __bridge;
    private final Json json;

    public IncentivesWonkaService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService
    public Object PromotionUnlocked(PromotionUnlockedRequestDto promotionUnlockedRequestDto, Continuation<? super PromotionUnlockedResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, PromotionUnlockedRequestDto.INSTANCE.getBinaryBase64Serializer(), PromotionUnlockedResponseDto.INSTANCE.getBinaryBase64Serializer(), "PromotionUnlocked", promotionUnlockedRequestDto, continuation);
    }

    @Override // microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService
    public Object ContinueTransfer(ContinueTransferRequestDto continueTransferRequestDto, Continuation<? super ContinueTransferResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ContinueTransferRequestDto.INSTANCE.getBinaryBase64Serializer(), ContinueTransferResponseDto.INSTANCE.getBinaryBase64Serializer(), "ContinueTransfer", continueTransferRequestDto, continuation);
    }

    @Override // microgram.contracts.service_incentives_wonka.proto.p504v1.IncentivesWonkaService
    public Object ExitTransferFlow(ExitTransferFlowRequestDto exitTransferFlowRequestDto, Continuation<? super ExitTransferFlowResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ExitTransferFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), ExitTransferFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), "ExitTransferFlow", exitTransferFlowRequestDto, continuation);
    }

    /* compiled from: IncentivesWonkaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService_Adapter$PromotionUnlockedEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "service_incentives_wonka.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PromotionUnlockedEndpoint implements ServiceCallable {
        private final Json json;
        private final IncentivesWonkaService service;

        public PromotionUnlockedEndpoint(IncentivesWonkaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, PromotionUnlockedRequestDto.INSTANCE.getBinaryBase64Serializer(), PromotionUnlockedResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new IncentivesWonkaService_Adapter4(this, null));
        }
    }

    /* compiled from: IncentivesWonkaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService_Adapter$ContinueTransferEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "service_incentives_wonka.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContinueTransferEndpoint implements ServiceCallable {
        private final Json json;
        private final IncentivesWonkaService service;

        public ContinueTransferEndpoint(IncentivesWonkaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ContinueTransferRequestDto.INSTANCE.getBinaryBase64Serializer(), ContinueTransferResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new IncentivesWonkaService_Adapter2(this, null));
        }
    }

    /* compiled from: IncentivesWonkaService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService_Adapter$ExitTransferFlowEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/service_incentives_wonka/proto/v1/IncentivesWonkaService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "service_incentives_wonka.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ExitTransferFlowEndpoint implements ServiceCallable {
        private final Json json;
        private final IncentivesWonkaService service;

        public ExitTransferFlowEndpoint(IncentivesWonkaService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ExitTransferFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), ExitTransferFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new IncentivesWonkaService_Adapter3(this, null));
        }
    }
}
