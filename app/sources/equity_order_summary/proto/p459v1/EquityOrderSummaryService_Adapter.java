package equity_order_summary.proto.p459v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService_Adapter;
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

/* compiled from: EquityOrderSummaryService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001f !\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006#"}, m3636d2 = {"Lequity_order_summary/proto/v1/EquityOrderSummaryService_Adapter;", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;", "request", "Lequity_order_summary/proto/v1/GetOrderSummaryResponseDto;", "GetOrderSummary", "(Lequity_order_summary/proto/v1/GetOrderSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_order_summary/proto/v1/StreamOrderConfirmationRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lequity_order_summary/proto/v1/StreamOrderConfirmationResponseDto;", "StreamOrderConfirmation", "(Lequity_order_summary/proto/v1/StreamOrderConfirmationRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_order_summary/proto/v1/GetOrderConfirmationRequestDto;", "Lequity_order_summary/proto/v1/GetOrderConfirmationResponseDto;", "GetOrderConfirmation", "(Lequity_order_summary/proto/v1/GetOrderConfirmationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_order_summary/proto/v1/WarmupRequestDto;", "Lequity_order_summary/proto/v1/WarmupResponseDto;", "Warmup", "(Lequity_order_summary/proto/v1/WarmupRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetOrderSummaryEndpoint", "StreamOrderConfirmationEndpoint", "GetOrderConfirmationEndpoint", "WarmupEndpoint", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class EquityOrderSummaryService_Adapter implements EquityOrderSummaryService {
    private final ClientBridge __bridge;
    private final Json json;

    public EquityOrderSummaryService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // equity_order_summary.proto.p459v1.EquityOrderSummaryService
    public Object GetOrderSummary(GetOrderSummaryRequestDto getOrderSummaryRequestDto, Continuation<? super GetOrderSummaryResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetOrderSummaryRequestDto.INSTANCE.getBinaryBase64Serializer(), GetOrderSummaryResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetOrderSummary", getOrderSummaryRequestDto, continuation);
    }

    @Override // equity_order_summary.proto.p459v1.EquityOrderSummaryService
    public Flow<StreamOrderConfirmationResponseDto> StreamOrderConfirmation(StreamOrderConfirmationRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamOrderConfirmationRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamOrderConfirmationResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamOrderConfirmation", request, null, 32, null);
    }

    @Override // equity_order_summary.proto.p459v1.EquityOrderSummaryService
    public Object GetOrderConfirmation(GetOrderConfirmationRequestDto getOrderConfirmationRequestDto, Continuation<? super GetOrderConfirmationResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetOrderConfirmationRequestDto.INSTANCE.getBinaryBase64Serializer(), GetOrderConfirmationResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetOrderConfirmation", getOrderConfirmationRequestDto, continuation);
    }

    @Override // equity_order_summary.proto.p459v1.EquityOrderSummaryService
    public Object Warmup(WarmupRequestDto warmupRequestDto, Continuation<? super WarmupResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, WarmupRequestDto.INSTANCE.getBinaryBase64Serializer(), WarmupResponseDto.INSTANCE.getBinaryBase64Serializer(), "Warmup", warmupRequestDto, continuation);
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_order_summary/proto/v1/EquityOrderSummaryService_Adapter$GetOrderSummaryEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_order_summary/proto/v1/EquityOrderSummaryService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetOrderSummaryEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityOrderSummaryService service;

        public GetOrderSummaryEndpoint(EquityOrderSummaryService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetOrderSummaryRequestDto.INSTANCE.getBinaryBase64Serializer(), GetOrderSummaryResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityOrderSummaryService_Adapter$GetOrderSummaryEndpoint$call$1(this, null));
        }
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_order_summary/proto/v1/EquityOrderSummaryService_Adapter$StreamOrderConfirmationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_order_summary/proto/v1/EquityOrderSummaryService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamOrderConfirmationEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityOrderSummaryService service;

        public StreamOrderConfirmationEndpoint(EquityOrderSummaryService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamOrderConfirmationRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamOrderConfirmationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_order_summary.proto.v1.EquityOrderSummaryService_Adapter$StreamOrderConfirmationEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityOrderSummaryService_Adapter.StreamOrderConfirmationEndpoint.call$lambda$0(this.f$0, (StreamOrderConfirmationRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamOrderConfirmationEndpoint streamOrderConfirmationEndpoint, StreamOrderConfirmationRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamOrderConfirmationEndpoint.service.StreamOrderConfirmation(request);
        }
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_order_summary/proto/v1/EquityOrderSummaryService_Adapter$GetOrderConfirmationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_order_summary/proto/v1/EquityOrderSummaryService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetOrderConfirmationEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityOrderSummaryService service;

        public GetOrderConfirmationEndpoint(EquityOrderSummaryService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetOrderConfirmationRequestDto.INSTANCE.getBinaryBase64Serializer(), GetOrderConfirmationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new C44731xc04e5ad1(this, null));
        }
    }

    /* compiled from: EquityOrderSummaryService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_order_summary/proto/v1/EquityOrderSummaryService_Adapter$WarmupEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_order_summary/proto/v1/EquityOrderSummaryService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_order_summary/proto/v1/EquityOrderSummaryService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WarmupEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityOrderSummaryService service;

        public WarmupEndpoint(EquityOrderSummaryService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, WarmupRequestDto.INSTANCE.getBinaryBase64Serializer(), WarmupResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityOrderSummaryService_Adapter$WarmupEndpoint$call$1(this, null));
        }
    }
}
