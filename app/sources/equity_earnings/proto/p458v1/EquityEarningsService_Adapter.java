package equity_earnings.proto.p458v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import equity_earnings.proto.p458v1.EquityEarningsService_Adapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: EquityEarningsService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lequity_earnings/proto/v1/EquityEarningsService_Adapter;", "Lequity_earnings/proto/v1/EquityEarningsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lequity_earnings/proto/v1/StreamEarningsChartRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lequity_earnings/proto/v1/StreamEarningsChartResponseDto;", "StreamEarningsChart", "(Lequity_earnings/proto/v1/StreamEarningsChartRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "StreamEarningsChartEndpoint", "equity_earnings.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class EquityEarningsService_Adapter implements EquityEarningsService {
    private final ClientBridge __bridge;
    private final Json json;

    public EquityEarningsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // equity_earnings.proto.p458v1.EquityEarningsService
    public Flow<StreamEarningsChartResponseDto> StreamEarningsChart(StreamEarningsChartRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamEarningsChartRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamEarningsChartResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamEarningsChart", request, null, 32, null);
    }

    /* compiled from: EquityEarningsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_earnings/proto/v1/EquityEarningsService_Adapter$StreamEarningsChartEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_earnings/proto/v1/EquityEarningsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_earnings/proto/v1/EquityEarningsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_earnings.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamEarningsChartEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityEarningsService service;

        public StreamEarningsChartEndpoint(EquityEarningsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamEarningsChartRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamEarningsChartResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_earnings.proto.v1.EquityEarningsService_Adapter$StreamEarningsChartEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityEarningsService_Adapter.StreamEarningsChartEndpoint.call$lambda$0(this.f$0, (StreamEarningsChartRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamEarningsChartEndpoint streamEarningsChartEndpoint, StreamEarningsChartRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamEarningsChartEndpoint.service.StreamEarningsChart(request);
        }
    }
}
