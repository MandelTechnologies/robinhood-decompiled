package gold_flow.proto.p466v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import gold_flow.proto.p466v1.GoldFlowService_Adapter;
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

/* compiled from: GoldFlowService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\f?@ABCDEFGHIJB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0006\u0010\n\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010\n\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000b2\u0006\u0010\n\u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000b2\u0006\u0010\n\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000b2\u0006\u0010\n\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000b2\u0006\u0010\n\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000\u000b2\u0006\u0010\n\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u000b2\u0006\u0010\n\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080\u000b2\u0006\u0010\n\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010>¨\u0006K"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter;", "Lgold_flow/proto/v1/GoldFlowService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lgold_flow/proto/v1/StreamRouterMessageRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamRouterMessageResponseDto;", "StreamRouterMessage", "(Lgold_flow/proto/v1/StreamRouterMessageRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/SendActionRequestDto;", "Lgold_flow/proto/v1/SendActionResponseDto;", "SendAction", "(Lgold_flow/proto/v1/SendActionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold_flow/proto/v1/StreamValuePropsContentRequestDto;", "Lgold_flow/proto/v1/StreamValuePropsContentResponseDto;", "StreamValuePropsContent", "(Lgold_flow/proto/v1/StreamValuePropsContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentRequestDto;", "Lgold_flow/proto/v1/StreamMultiAgreementsContentResponseDto;", "StreamMultiAgreementsContent", "(Lgold_flow/proto/v1/StreamMultiAgreementsContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSingleAgreementContentRequestDto;", "Lgold_flow/proto/v1/StreamSingleAgreementContentResponseDto;", "StreamSingleAgreementContent", "(Lgold_flow/proto/v1/StreamSingleAgreementContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamConfirmationContentRequestDto;", "Lgold_flow/proto/v1/StreamConfirmationContentResponseDto;", "StreamConfirmationContent", "(Lgold_flow/proto/v1/StreamConfirmationContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSuggestedActionContentRequestDto;", "Lgold_flow/proto/v1/StreamSuggestedActionContentResponseDto;", "StreamSuggestedActionContent", "(Lgold_flow/proto/v1/StreamSuggestedActionContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamAgreementDisplayContentRequestDto;", "Lgold_flow/proto/v1/StreamAgreementDisplayContentResponseDto;", "StreamAgreementDisplayContent", "(Lgold_flow/proto/v1/StreamAgreementDisplayContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentRequestDto;", "Lgold_flow/proto/v1/StreamValuePropsPromoContentResponseDto;", "StreamValuePropsPromoContent", "(Lgold_flow/proto/v1/StreamValuePropsPromoContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamPlanSelectionContentRequestDto;", "Lgold_flow/proto/v1/StreamPlanSelectionContentResponseDto;", "StreamPlanSelectionContent", "(Lgold_flow/proto/v1/StreamPlanSelectionContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentRequestDto;", "Lgold_flow/proto/v1/StreamSageStartApplicationContentResponseDto;", "StreamSageStartApplicationContent", "(Lgold_flow/proto/v1/StreamSageStartApplicationContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lgold_flow/proto/v1/StreamSageApplicationContentRequestDto;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto;", "StreamSageApplicationContent", "(Lgold_flow/proto/v1/StreamSageApplicationContentRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "StreamRouterMessageEndpoint", "SendActionEndpoint", "StreamValuePropsContentEndpoint", "StreamMultiAgreementsContentEndpoint", "StreamSingleAgreementContentEndpoint", "StreamConfirmationContentEndpoint", "StreamSuggestedActionContentEndpoint", "StreamAgreementDisplayContentEndpoint", "StreamValuePropsPromoContentEndpoint", "StreamPlanSelectionContentEndpoint", "StreamSageStartApplicationContentEndpoint", "StreamSageApplicationContentEndpoint", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class GoldFlowService_Adapter implements GoldFlowService {
    private final ClientBridge __bridge;
    private final Json json;

    public GoldFlowService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamRouterMessageResponseDto> StreamRouterMessage(StreamRouterMessageRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamRouterMessageRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamRouterMessageResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamRouterMessage", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Object SendAction(SendActionRequestDto sendActionRequestDto, Continuation<? super SendActionResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SendActionRequestDto.INSTANCE.getBinaryBase64Serializer(), SendActionResponseDto.INSTANCE.getBinaryBase64Serializer(), "SendAction", sendActionRequestDto, continuation);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamValuePropsContentResponseDto> StreamValuePropsContent(StreamValuePropsContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamValuePropsContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamValuePropsContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamValuePropsContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamMultiAgreementsContentResponseDto> StreamMultiAgreementsContent(StreamMultiAgreementsContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamMultiAgreementsContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamMultiAgreementsContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamMultiAgreementsContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamSingleAgreementContentResponseDto> StreamSingleAgreementContent(StreamSingleAgreementContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSingleAgreementContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSingleAgreementContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSingleAgreementContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamConfirmationContentResponseDto> StreamConfirmationContent(StreamConfirmationContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamConfirmationContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamConfirmationContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamConfirmationContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamSuggestedActionContentResponseDto> StreamSuggestedActionContent(StreamSuggestedActionContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSuggestedActionContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSuggestedActionContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSuggestedActionContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamAgreementDisplayContentResponseDto> StreamAgreementDisplayContent(StreamAgreementDisplayContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamAgreementDisplayContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamAgreementDisplayContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamAgreementDisplayContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamValuePropsPromoContentResponseDto> StreamValuePropsPromoContent(StreamValuePropsPromoContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamValuePropsPromoContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamValuePropsPromoContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamValuePropsPromoContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamPlanSelectionContentResponseDto> StreamPlanSelectionContent(StreamPlanSelectionContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamPlanSelectionContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamPlanSelectionContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamPlanSelectionContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamSageStartApplicationContentResponseDto> StreamSageStartApplicationContent(StreamSageStartApplicationContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSageStartApplicationContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSageStartApplicationContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSageStartApplicationContent", request, null, 32, null);
    }

    @Override // gold_flow.proto.p466v1.GoldFlowService
    public Flow<StreamSageApplicationContentResponseDto> StreamSageApplicationContent(StreamSageApplicationContentRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSageApplicationContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSageApplicationContentResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSageApplicationContent", request, null, 32, null);
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamRouterMessageEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamRouterMessageEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamRouterMessageEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamRouterMessageRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamRouterMessageResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamRouterMessageEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamRouterMessageEndpoint.call$lambda$0(this.f$0, (StreamRouterMessageRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamRouterMessageEndpoint streamRouterMessageEndpoint, StreamRouterMessageRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamRouterMessageEndpoint.service.StreamRouterMessage(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$SendActionEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SendActionEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public SendActionEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SendActionRequestDto.INSTANCE.getBinaryBase64Serializer(), SendActionResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new GoldFlowService_Adapter2(this, null));
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamValuePropsContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamValuePropsContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamValuePropsContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamValuePropsContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamValuePropsContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamValuePropsContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamValuePropsContentEndpoint.call$lambda$0(this.f$0, (StreamValuePropsContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamValuePropsContentEndpoint streamValuePropsContentEndpoint, StreamValuePropsContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamValuePropsContentEndpoint.service.StreamValuePropsContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamMultiAgreementsContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamMultiAgreementsContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamMultiAgreementsContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamMultiAgreementsContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamMultiAgreementsContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamMultiAgreementsContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamMultiAgreementsContentEndpoint.call$lambda$0(this.f$0, (StreamMultiAgreementsContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamMultiAgreementsContentEndpoint streamMultiAgreementsContentEndpoint, StreamMultiAgreementsContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamMultiAgreementsContentEndpoint.service.StreamMultiAgreementsContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamSingleAgreementContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSingleAgreementContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamSingleAgreementContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSingleAgreementContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSingleAgreementContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamSingleAgreementContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamSingleAgreementContentEndpoint.call$lambda$0(this.f$0, (StreamSingleAgreementContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSingleAgreementContentEndpoint streamSingleAgreementContentEndpoint, StreamSingleAgreementContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSingleAgreementContentEndpoint.service.StreamSingleAgreementContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamConfirmationContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamConfirmationContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamConfirmationContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamConfirmationContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamConfirmationContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamConfirmationContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamConfirmationContentEndpoint.call$lambda$0(this.f$0, (StreamConfirmationContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamConfirmationContentEndpoint streamConfirmationContentEndpoint, StreamConfirmationContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamConfirmationContentEndpoint.service.StreamConfirmationContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamSuggestedActionContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSuggestedActionContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamSuggestedActionContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSuggestedActionContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSuggestedActionContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamSuggestedActionContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamSuggestedActionContentEndpoint.call$lambda$0(this.f$0, (StreamSuggestedActionContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSuggestedActionContentEndpoint streamSuggestedActionContentEndpoint, StreamSuggestedActionContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSuggestedActionContentEndpoint.service.StreamSuggestedActionContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamAgreementDisplayContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamAgreementDisplayContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamAgreementDisplayContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamAgreementDisplayContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamAgreementDisplayContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamAgreementDisplayContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamAgreementDisplayContentEndpoint.call$lambda$0(this.f$0, (StreamAgreementDisplayContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamAgreementDisplayContentEndpoint streamAgreementDisplayContentEndpoint, StreamAgreementDisplayContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamAgreementDisplayContentEndpoint.service.StreamAgreementDisplayContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamValuePropsPromoContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamValuePropsPromoContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamValuePropsPromoContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamValuePropsPromoContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamValuePropsPromoContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamValuePropsPromoContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamValuePropsPromoContentEndpoint.call$lambda$0(this.f$0, (StreamValuePropsPromoContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamValuePropsPromoContentEndpoint streamValuePropsPromoContentEndpoint, StreamValuePropsPromoContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamValuePropsPromoContentEndpoint.service.StreamValuePropsPromoContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamPlanSelectionContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamPlanSelectionContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamPlanSelectionContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamPlanSelectionContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamPlanSelectionContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamPlanSelectionContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamPlanSelectionContentEndpoint.call$lambda$0(this.f$0, (StreamPlanSelectionContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamPlanSelectionContentEndpoint streamPlanSelectionContentEndpoint, StreamPlanSelectionContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamPlanSelectionContentEndpoint.service.StreamPlanSelectionContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamSageStartApplicationContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSageStartApplicationContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamSageStartApplicationContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSageStartApplicationContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSageStartApplicationContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamSageStartApplicationContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamSageStartApplicationContentEndpoint.call$lambda$0(this.f$0, (StreamSageStartApplicationContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSageStartApplicationContentEndpoint streamSageStartApplicationContentEndpoint, StreamSageStartApplicationContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSageStartApplicationContentEndpoint.service.StreamSageStartApplicationContent(request);
        }
    }

    /* compiled from: GoldFlowService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowService_Adapter$StreamSageApplicationContentEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lgold_flow/proto/v1/GoldFlowService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lgold_flow/proto/v1/GoldFlowService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSageApplicationContentEndpoint implements ServiceCallable {
        private final Json json;
        private final GoldFlowService service;

        public StreamSageApplicationContentEndpoint(GoldFlowService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSageApplicationContentRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSageApplicationContentResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: gold_flow.proto.v1.GoldFlowService_Adapter$StreamSageApplicationContentEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldFlowService_Adapter.StreamSageApplicationContentEndpoint.call$lambda$0(this.f$0, (StreamSageApplicationContentRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSageApplicationContentEndpoint streamSageApplicationContentEndpoint, StreamSageApplicationContentRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSageApplicationContentEndpoint.service.StreamSageApplicationContent(request);
        }
    }
}
