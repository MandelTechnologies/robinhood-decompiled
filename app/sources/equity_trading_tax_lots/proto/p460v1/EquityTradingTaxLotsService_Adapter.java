package equity_trading_tax_lots.proto.p460v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService_Adapter;
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

/* compiled from: EquityTradingTaxLotsService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\f?@ABCDEFGHIJB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\n\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020#H\u0096@¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000f2\u0006\u0010\n\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000f2\u0006\u0010\n\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000\u000f2\u0006\u0010\n\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u0002042\u0006\u0010\n\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u0002082\u0006\u0010\n\u001a\u000207H\u0096@¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010>¨\u0006K"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter;", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lequity_trading_tax_lots/proto/v1/GetAvailableDisposalOptionsRequestDto;", "request", "Lequity_trading_tax_lots/proto/v1/GetAvailableDisposalOptionsResponseDto;", "GetAvailableDisposalOptions", "(Lequity_trading_tax_lots/proto/v1/GetAvailableDisposalOptionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsResponseDto;", "StreamTaxLots", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationRequestDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationResponseDto;", "StreamTaxLotInformation", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotInformationRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsRequestDto;", "Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsResponseDto;", "RequestNextPageInTaxLots", "(Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsRequestDto;", "Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;", "StreamSelectedTaxLots", "(Lequity_trading_tax_lots/proto/v1/StreamSelectedTaxLotsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsRequestDto;", "Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsResponseDto;", "SetSelectedTaxLots", "(Lequity_trading_tax_lots/proto/v1/SetSelectedTaxLotsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsRequestDto;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto;", "EditSelectedTaxLots", "(Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryRequestDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponseDto;", "StreamTaxLotsSummary", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryRequestDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryResponseDto;", "StreamTaxLotsSelectionStrategySummary", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategySummaryRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategyRequestDto;", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategyResponseDto;", "StreamTaxLotsSelectionStrategy", "(Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSelectionStrategyRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodRequestDto;", "Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodResponseDto;", "SetTaxLotsSelectionMethod", "(Lequity_trading_tax_lots/proto/v1/SetTaxLotsSelectionMethodRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lequity_trading_tax_lots/proto/v1/GetAvailableSelectionStrategyOptionsRequestDto;", "Lequity_trading_tax_lots/proto/v1/GetAvailableSelectionStrategyOptionsResponseDto;", "GetAvailableSelectionStrategyOptions", "(Lequity_trading_tax_lots/proto/v1/GetAvailableSelectionStrategyOptionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetAvailableDisposalOptionsEndpoint", "StreamTaxLotsEndpoint", "StreamTaxLotInformationEndpoint", "RequestNextPageInTaxLotsEndpoint", "StreamSelectedTaxLotsEndpoint", "SetSelectedTaxLotsEndpoint", "EditSelectedTaxLotsEndpoint", "StreamTaxLotsSummaryEndpoint", "StreamTaxLotsSelectionStrategySummaryEndpoint", "StreamTaxLotsSelectionStrategyEndpoint", "SetTaxLotsSelectionMethodEndpoint", "GetAvailableSelectionStrategyOptionsEndpoint", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class EquityTradingTaxLotsService_Adapter implements EquityTradingTaxLotsService {
    private final ClientBridge __bridge;
    private final Json json;

    public EquityTradingTaxLotsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Object GetAvailableDisposalOptions(GetAvailableDisposalOptionsRequestDto getAvailableDisposalOptionsRequestDto, Continuation<? super GetAvailableDisposalOptionsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetAvailableDisposalOptionsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetAvailableDisposalOptionsResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetAvailableDisposalOptions", getAvailableDisposalOptionsRequestDto, continuation);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Flow<StreamTaxLotsResponseDto> StreamTaxLots(StreamTaxLotsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamTaxLots", request, null, 32, null);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Flow<StreamTaxLotInformationResponseDto> StreamTaxLotInformation(StreamTaxLotInformationRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamTaxLotInformationRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotInformationResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamTaxLotInformation", request, null, 32, null);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Object RequestNextPageInTaxLots(RequestNextPageInTaxLotsRequestDto requestNextPageInTaxLotsRequestDto, Continuation<? super RequestNextPageInTaxLotsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, RequestNextPageInTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), RequestNextPageInTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), "RequestNextPageInTaxLots", requestNextPageInTaxLotsRequestDto, continuation);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Flow<StreamSelectedTaxLotsResponseDto> StreamSelectedTaxLots(StreamSelectedTaxLotsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSelectedTaxLots", request, null, 32, null);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Object SetSelectedTaxLots(SetSelectedTaxLotsRequestDto setSelectedTaxLotsRequestDto, Continuation<? super SetSelectedTaxLotsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SetSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), SetSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), "SetSelectedTaxLots", setSelectedTaxLotsRequestDto, continuation);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Object EditSelectedTaxLots(EditSelectedTaxLotsRequestDto editSelectedTaxLotsRequestDto, Continuation<? super EditSelectedTaxLotsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, EditSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), EditSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), "EditSelectedTaxLots", editSelectedTaxLotsRequestDto, continuation);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Flow<StreamTaxLotsSummaryResponseDto> StreamTaxLotsSummary(StreamTaxLotsSummaryRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamTaxLotsSummaryRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsSummaryResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamTaxLotsSummary", request, null, 32, null);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Flow<StreamTaxLotsSelectionStrategySummaryResponseDto> StreamTaxLotsSelectionStrategySummary(StreamTaxLotsSelectionStrategySummaryRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamTaxLotsSelectionStrategySummaryRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsSelectionStrategySummaryResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamTaxLotsSelectionStrategySummary", request, null, 32, null);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Flow<StreamTaxLotsSelectionStrategyResponseDto> StreamTaxLotsSelectionStrategy(StreamTaxLotsSelectionStrategyRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamTaxLotsSelectionStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsSelectionStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamTaxLotsSelectionStrategy", request, null, 32, null);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Object SetTaxLotsSelectionMethod(SetTaxLotsSelectionMethodRequestDto setTaxLotsSelectionMethodRequestDto, Continuation<? super SetTaxLotsSelectionMethodResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, SetTaxLotsSelectionMethodRequestDto.INSTANCE.getBinaryBase64Serializer(), SetTaxLotsSelectionMethodResponseDto.INSTANCE.getBinaryBase64Serializer(), "SetTaxLotsSelectionMethod", setTaxLotsSelectionMethodRequestDto, continuation);
    }

    @Override // equity_trading_tax_lots.proto.p460v1.EquityTradingTaxLotsService
    public Object GetAvailableSelectionStrategyOptions(GetAvailableSelectionStrategyOptionsRequestDto getAvailableSelectionStrategyOptionsRequestDto, Continuation<? super GetAvailableSelectionStrategyOptionsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetAvailableSelectionStrategyOptionsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetAvailableSelectionStrategyOptionsResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetAvailableSelectionStrategyOptions", getAvailableSelectionStrategyOptionsRequestDto, continuation);
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$GetAvailableDisposalOptionsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetAvailableDisposalOptionsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public GetAvailableDisposalOptionsEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetAvailableDisposalOptionsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetAvailableDisposalOptionsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityTradingTaxLotsService_Adapter3(this, null));
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$StreamTaxLotsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamTaxLotsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public StreamTaxLotsEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$StreamTaxLotsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradingTaxLotsService_Adapter.StreamTaxLotsEndpoint.call$lambda$0(this.f$0, (StreamTaxLotsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamTaxLotsEndpoint streamTaxLotsEndpoint, StreamTaxLotsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamTaxLotsEndpoint.service.StreamTaxLots(request);
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$StreamTaxLotInformationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamTaxLotInformationEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public StreamTaxLotInformationEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamTaxLotInformationRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotInformationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$StreamTaxLotInformationEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradingTaxLotsService_Adapter.StreamTaxLotInformationEndpoint.call$lambda$0(this.f$0, (StreamTaxLotInformationRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamTaxLotInformationEndpoint streamTaxLotInformationEndpoint, StreamTaxLotInformationRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamTaxLotInformationEndpoint.service.StreamTaxLotInformation(request);
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$RequestNextPageInTaxLotsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RequestNextPageInTaxLotsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public RequestNextPageInTaxLotsEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, RequestNextPageInTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), RequestNextPageInTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityTradingTaxLotsService_Adapter5(this, null));
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$StreamSelectedTaxLotsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSelectedTaxLotsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public StreamSelectedTaxLotsEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$StreamSelectedTaxLotsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradingTaxLotsService_Adapter.StreamSelectedTaxLotsEndpoint.call$lambda$0(this.f$0, (StreamSelectedTaxLotsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSelectedTaxLotsEndpoint streamSelectedTaxLotsEndpoint, StreamSelectedTaxLotsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSelectedTaxLotsEndpoint.service.StreamSelectedTaxLots(request);
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$SetSelectedTaxLotsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SetSelectedTaxLotsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public SetSelectedTaxLotsEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SetSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), SetSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityTradingTaxLotsService_Adapter6(this, null));
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$EditSelectedTaxLotsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EditSelectedTaxLotsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public EditSelectedTaxLotsEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, EditSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), EditSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityTradingTaxLotsService_Adapter2(this, null));
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$StreamTaxLotsSummaryEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamTaxLotsSummaryEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public StreamTaxLotsSummaryEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamTaxLotsSummaryRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsSummaryResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$StreamTaxLotsSummaryEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradingTaxLotsService_Adapter.StreamTaxLotsSummaryEndpoint.call$lambda$0(this.f$0, (StreamTaxLotsSummaryRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamTaxLotsSummaryEndpoint streamTaxLotsSummaryEndpoint, StreamTaxLotsSummaryRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamTaxLotsSummaryEndpoint.service.StreamTaxLotsSummary(request);
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$StreamTaxLotsSelectionStrategySummaryEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamTaxLotsSelectionStrategySummaryEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public StreamTaxLotsSelectionStrategySummaryEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamTaxLotsSelectionStrategySummaryRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsSelectionStrategySummaryResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$StreamTaxLotsSelectionStrategySummaryEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradingTaxLotsService_Adapter.StreamTaxLotsSelectionStrategySummaryEndpoint.call$lambda$0(this.f$0, (StreamTaxLotsSelectionStrategySummaryRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamTaxLotsSelectionStrategySummaryEndpoint streamTaxLotsSelectionStrategySummaryEndpoint, StreamTaxLotsSelectionStrategySummaryRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamTaxLotsSelectionStrategySummaryEndpoint.service.StreamTaxLotsSelectionStrategySummary(request);
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$StreamTaxLotsSelectionStrategyEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamTaxLotsSelectionStrategyEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public StreamTaxLotsSelectionStrategyEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamTaxLotsSelectionStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotsSelectionStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: equity_trading_tax_lots.proto.v1.EquityTradingTaxLotsService_Adapter$StreamTaxLotsSelectionStrategyEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityTradingTaxLotsService_Adapter.StreamTaxLotsSelectionStrategyEndpoint.call$lambda$0(this.f$0, (StreamTaxLotsSelectionStrategyRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamTaxLotsSelectionStrategyEndpoint streamTaxLotsSelectionStrategyEndpoint, StreamTaxLotsSelectionStrategyRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamTaxLotsSelectionStrategyEndpoint.service.StreamTaxLotsSelectionStrategy(request);
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$SetTaxLotsSelectionMethodEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SetTaxLotsSelectionMethodEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public SetTaxLotsSelectionMethodEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, SetTaxLotsSelectionMethodRequestDto.INSTANCE.getBinaryBase64Serializer(), SetTaxLotsSelectionMethodResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityTradingTaxLotsService_Adapter7(this, null));
        }
    }

    /* compiled from: EquityTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService_Adapter$GetAvailableSelectionStrategyOptionsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lequity_trading_tax_lots/proto/v1/EquityTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetAvailableSelectionStrategyOptionsEndpoint implements ServiceCallable {
        private final Json json;
        private final EquityTradingTaxLotsService service;

        public GetAvailableSelectionStrategyOptionsEndpoint(EquityTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetAvailableSelectionStrategyOptionsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetAvailableSelectionStrategyOptionsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new EquityTradingTaxLotsService_Adapter4(this, null));
        }
    }
}
