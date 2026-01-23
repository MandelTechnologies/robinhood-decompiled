package microgram.contracts.invest_tab_highlights.proto.p494v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.contracts.invest_tab_highlights.proto.p494v1.InvestTabHighlightsService_Adapter;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: InvestTabHighlightsService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService_Adapter;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightsRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightsResponseDto;", "StreamHighlights", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightRequestDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightResponseDto;", "StreamHighlight", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/StreamHighlightRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "StreamHighlightsEndpoint", "StreamHighlightEndpoint", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class InvestTabHighlightsService_Adapter implements InvestTabHighlightsService {
    private final ClientBridge __bridge;
    private final Json json;

    public InvestTabHighlightsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.invest_tab_highlights.proto.p494v1.InvestTabHighlightsService
    public Flow<StreamHighlightsResponseDto> StreamHighlights(StreamHighlightsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamHighlightsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamHighlightsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamHighlights", request, null, 32, null);
    }

    @Override // microgram.contracts.invest_tab_highlights.proto.p494v1.InvestTabHighlightsService
    public Flow<StreamHighlightResponseDto> StreamHighlight(StreamHighlightRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamHighlightRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamHighlightResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamHighlight", request, null, 32, null);
    }

    /* compiled from: InvestTabHighlightsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService_Adapter$StreamHighlightsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamHighlightsEndpoint implements ServiceCallable {
        private final Json json;
        private final InvestTabHighlightsService service;

        public StreamHighlightsEndpoint(InvestTabHighlightsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamHighlightsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamHighlightsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.invest_tab_highlights.proto.v1.InvestTabHighlightsService_Adapter$StreamHighlightsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestTabHighlightsService_Adapter.StreamHighlightsEndpoint.call$lambda$0(this.f$0, (StreamHighlightsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamHighlightsEndpoint streamHighlightsEndpoint, StreamHighlightsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamHighlightsEndpoint.service.StreamHighlights(request);
        }
    }

    /* compiled from: InvestTabHighlightsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService_Adapter$StreamHighlightEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamHighlightEndpoint implements ServiceCallable {
        private final Json json;
        private final InvestTabHighlightsService service;

        public StreamHighlightEndpoint(InvestTabHighlightsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamHighlightRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamHighlightResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.invest_tab_highlights.proto.v1.InvestTabHighlightsService_Adapter$StreamHighlightEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestTabHighlightsService_Adapter.StreamHighlightEndpoint.call$lambda$0(this.f$0, (StreamHighlightRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamHighlightEndpoint streamHighlightEndpoint, StreamHighlightRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamHighlightEndpoint.service.StreamHighlight(request);
        }
    }
}
