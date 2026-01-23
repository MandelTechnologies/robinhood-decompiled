package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService_Adapter;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\b/0123456B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000f2\u0006\u0010\n\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.¨\u00067"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotOrderInputRequestDto;", "request", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotOrderInputResponseDto;", "InitializeCryptoTaxLotOrderInput", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotOrderInputRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponseDto;", "StreamSelectedTaxLotStrategy", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;", "StreamAvailableTaxLotStrategyViewModels", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTemporarilySelectedTaxLotStrategyRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTemporarilySelectedTaxLotStrategyResponseDto;", "UpdateTemporarilySelectedTaxLotStrategy", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTemporarilySelectedTaxLotStrategyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ContinueWithSelectedTaxLotStrategyRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ContinueWithSelectedTaxLotStrategyResponseDto;", "ContinueWithSelectedTaxLotStrategy", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ContinueWithSelectedTaxLotStrategyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTemporarilySelectedTaxLotStrategyRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTemporarilySelectedTaxLotStrategyResponseDto;", "ClearTemporarilySelectedTaxLotStrategy", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTemporarilySelectedTaxLotStrategyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponseDto;", "StreamGainLossAmount", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponseDto;", "ValidateStrategyAndQuantity", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "InitializeCryptoTaxLotOrderInputEndpoint", "StreamSelectedTaxLotStrategyEndpoint", "StreamAvailableTaxLotStrategyViewModelsEndpoint", "UpdateTemporarilySelectedTaxLotStrategyEndpoint", "ContinueWithSelectedTaxLotStrategyEndpoint", "ClearTemporarilySelectedTaxLotStrategyEndpoint", "StreamGainLossAmountEndpoint", "ValidateStrategyAndQuantityEndpoint", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class CryptoTradingTaxLotsService_Adapter implements CryptoTradingTaxLotsService {
    private final ClientBridge __bridge;
    private final Json json;

    public CryptoTradingTaxLotsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Object InitializeCryptoTaxLotOrderInput(InitializeCryptoTaxLotOrderInputRequestDto initializeCryptoTaxLotOrderInputRequestDto, Continuation<? super InitializeCryptoTaxLotOrderInputResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, InitializeCryptoTaxLotOrderInputRequestDto.INSTANCE.getBinaryBase64Serializer(), InitializeCryptoTaxLotOrderInputResponseDto.INSTANCE.getBinaryBase64Serializer(), "InitializeCryptoTaxLotOrderInput", initializeCryptoTaxLotOrderInputRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Flow<StreamSelectedTaxLotStrategyResponseDto> StreamSelectedTaxLotStrategy(StreamSelectedTaxLotStrategyRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSelectedTaxLotStrategy", request, null, 32, null);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Flow<StreamAvailableTaxLotStrategyViewModelsResponseDto> StreamAvailableTaxLotStrategyViewModels(StreamAvailableTaxLotStrategyViewModelsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamAvailableTaxLotStrategyViewModelsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamAvailableTaxLotStrategyViewModelsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamAvailableTaxLotStrategyViewModels", request, null, 32, null);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Object UpdateTemporarilySelectedTaxLotStrategy(UpdateTemporarilySelectedTaxLotStrategyRequestDto updateTemporarilySelectedTaxLotStrategyRequestDto, Continuation<? super UpdateTemporarilySelectedTaxLotStrategyResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateTemporarilySelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTemporarilySelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateTemporarilySelectedTaxLotStrategy", updateTemporarilySelectedTaxLotStrategyRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Object ContinueWithSelectedTaxLotStrategy(ContinueWithSelectedTaxLotStrategyRequestDto continueWithSelectedTaxLotStrategyRequestDto, Continuation<? super ContinueWithSelectedTaxLotStrategyResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ContinueWithSelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), ContinueWithSelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), "ContinueWithSelectedTaxLotStrategy", continueWithSelectedTaxLotStrategyRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Object ClearTemporarilySelectedTaxLotStrategy(ClearTemporarilySelectedTaxLotStrategyRequestDto clearTemporarilySelectedTaxLotStrategyRequestDto, Continuation<? super ClearTemporarilySelectedTaxLotStrategyResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ClearTemporarilySelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), ClearTemporarilySelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), "ClearTemporarilySelectedTaxLotStrategy", clearTemporarilySelectedTaxLotStrategyRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Flow<StreamGainLossAmountResponseDto> StreamGainLossAmount(StreamGainLossAmountRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamGainLossAmountRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamGainLossAmountResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamGainLossAmount", request, null, 32, null);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradingTaxLotsService
    public Object ValidateStrategyAndQuantity(ValidateStrategyAndQuantityRequestDto validateStrategyAndQuantityRequestDto, Continuation<? super ValidateStrategyAndQuantityResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ValidateStrategyAndQuantityRequestDto.INSTANCE.getBinaryBase64Serializer(), ValidateStrategyAndQuantityResponseDto.INSTANCE.getBinaryBase64Serializer(), "ValidateStrategyAndQuantity", validateStrategyAndQuantityRequestDto, continuation);
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$InitializeCryptoTaxLotOrderInputEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InitializeCryptoTaxLotOrderInputEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public InitializeCryptoTaxLotOrderInputEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, InitializeCryptoTaxLotOrderInputRequestDto.INSTANCE.getBinaryBase64Serializer(), InitializeCryptoTaxLotOrderInputResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTradingTaxLotsService_Adapter4(this, null));
        }
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$StreamSelectedTaxLotStrategyEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSelectedTaxLotStrategyEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public StreamSelectedTaxLotStrategyEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTradingTaxLotsService_Adapter$StreamSelectedTaxLotStrategyEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTradingTaxLotsService_Adapter.StreamSelectedTaxLotStrategyEndpoint.call$lambda$0(this.f$0, (StreamSelectedTaxLotStrategyRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSelectedTaxLotStrategyEndpoint streamSelectedTaxLotStrategyEndpoint, StreamSelectedTaxLotStrategyRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSelectedTaxLotStrategyEndpoint.service.StreamSelectedTaxLotStrategy(request);
        }
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$StreamAvailableTaxLotStrategyViewModelsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamAvailableTaxLotStrategyViewModelsEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public StreamAvailableTaxLotStrategyViewModelsEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamAvailableTaxLotStrategyViewModelsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamAvailableTaxLotStrategyViewModelsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTradingTaxLotsService_Adapter$StreamAvailableTaxLotStrategyViewModelsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTradingTaxLotsService_Adapter.StreamAvailableTaxLotStrategyViewModelsEndpoint.call$lambda$0(this.f$0, (StreamAvailableTaxLotStrategyViewModelsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamAvailableTaxLotStrategyViewModelsEndpoint streamAvailableTaxLotStrategyViewModelsEndpoint, StreamAvailableTaxLotStrategyViewModelsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamAvailableTaxLotStrategyViewModelsEndpoint.service.StreamAvailableTaxLotStrategyViewModels(request);
        }
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$UpdateTemporarilySelectedTaxLotStrategyEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateTemporarilySelectedTaxLotStrategyEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public UpdateTemporarilySelectedTaxLotStrategyEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateTemporarilySelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTemporarilySelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTradingTaxLotsService_Adapter5(this, null));
        }
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$ContinueWithSelectedTaxLotStrategyEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContinueWithSelectedTaxLotStrategyEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public ContinueWithSelectedTaxLotStrategyEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ContinueWithSelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), ContinueWithSelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTradingTaxLotsService_Adapter3(this, null));
        }
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$ClearTemporarilySelectedTaxLotStrategyEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ClearTemporarilySelectedTaxLotStrategyEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public ClearTemporarilySelectedTaxLotStrategyEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ClearTemporarilySelectedTaxLotStrategyRequestDto.INSTANCE.getBinaryBase64Serializer(), ClearTemporarilySelectedTaxLotStrategyResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTradingTaxLotsService_Adapter2(this, null));
        }
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$StreamGainLossAmountEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamGainLossAmountEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public StreamGainLossAmountEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamGainLossAmountRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamGainLossAmountResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTradingTaxLotsService_Adapter$StreamGainLossAmountEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTradingTaxLotsService_Adapter.StreamGainLossAmountEndpoint.call$lambda$0(this.f$0, (StreamGainLossAmountRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamGainLossAmountEndpoint streamGainLossAmountEndpoint, StreamGainLossAmountRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamGainLossAmountEndpoint.service.StreamGainLossAmount(request);
        }
    }

    /* compiled from: CryptoTradingTaxLotsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService_Adapter$ValidateStrategyAndQuantityEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTradingTaxLotsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ValidateStrategyAndQuantityEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTradingTaxLotsService service;

        public ValidateStrategyAndQuantityEndpoint(CryptoTradingTaxLotsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ValidateStrategyAndQuantityRequestDto.INSTANCE.getBinaryBase64Serializer(), ValidateStrategyAndQuantityResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTradingTaxLotsService_Adapter6(this, null));
        }
    }
}
