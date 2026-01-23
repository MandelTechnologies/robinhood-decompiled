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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService_Adapter;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\t3456789:;B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\n\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020#H\u0096@¢\u0006\u0004\b%\u0010&J\u0018\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*J\u0018\u0010-\u001a\u00020,2\u0006\u0010\n\u001a\u00020+H\u0096@¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102¨\u0006<"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotSelectionRequestDto;", "request", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotSelectionResponseDto;", "InitializeCryptoTaxLotSelection", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotSelectionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsResponseDto;", "StreamSelectedTaxLots", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponseDto;", "StreamTaxLotSelectionFooter", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;", "StreamTaxLotViewModels", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/FetchTaxLotsNextPageRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/FetchTaxLotsNextPageResponseDto;", "FetchTaxLotsNextPage", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/FetchTaxLotsNextPageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotsSortRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotsSortResponseDto;", "UpdateTaxLotsSort", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotsSortRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowCheckedStateRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowCheckedStateResponseDto;", "UpdateTaxLotRowCheckedState", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowCheckedStateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowInputAmountRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowInputAmountResponseDto;", "UpdateTaxLotRowInputAmount", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotRowInputAmountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTaxLotRowInvalidInputAmountRequestDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTaxLotRowInvalidInputAmountResponseDto;", "ClearTaxLotRowInvalidInputAmount", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ClearTaxLotRowInvalidInputAmountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "InitializeCryptoTaxLotSelectionEndpoint", "StreamSelectedTaxLotsEndpoint", "StreamTaxLotSelectionFooterEndpoint", "StreamTaxLotViewModelsEndpoint", "FetchTaxLotsNextPageEndpoint", "UpdateTaxLotsSortEndpoint", "UpdateTaxLotRowCheckedStateEndpoint", "UpdateTaxLotRowInputAmountEndpoint", "ClearTaxLotRowInvalidInputAmountEndpoint", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class CryptoTaxLotSelectionService_Adapter implements CryptoTaxLotSelectionService {
    private final ClientBridge __bridge;
    private final Json json;

    public CryptoTaxLotSelectionService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Object InitializeCryptoTaxLotSelection(InitializeCryptoTaxLotSelectionRequestDto initializeCryptoTaxLotSelectionRequestDto, Continuation<? super InitializeCryptoTaxLotSelectionResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, InitializeCryptoTaxLotSelectionRequestDto.INSTANCE.getBinaryBase64Serializer(), InitializeCryptoTaxLotSelectionResponseDto.INSTANCE.getBinaryBase64Serializer(), "InitializeCryptoTaxLotSelection", initializeCryptoTaxLotSelectionRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Flow<StreamSelectedTaxLotsResponseDto> StreamSelectedTaxLots(StreamSelectedTaxLotsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamSelectedTaxLots", request, null, 32, null);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Flow<StreamTaxLotSelectionFooterResponseDto> StreamTaxLotSelectionFooter(StreamTaxLotSelectionFooterRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamTaxLotSelectionFooterRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotSelectionFooterResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamTaxLotSelectionFooter", request, null, 32, null);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Flow<StreamTaxLotViewModelsResponseDto> StreamTaxLotViewModels(StreamTaxLotViewModelsRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, StreamTaxLotViewModelsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotViewModelsResponseDto.INSTANCE.getBinaryBase64Serializer(), "StreamTaxLotViewModels", request, null, 32, null);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Object FetchTaxLotsNextPage(FetchTaxLotsNextPageRequestDto fetchTaxLotsNextPageRequestDto, Continuation<? super FetchTaxLotsNextPageResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, FetchTaxLotsNextPageRequestDto.INSTANCE.getBinaryBase64Serializer(), FetchTaxLotsNextPageResponseDto.INSTANCE.getBinaryBase64Serializer(), "FetchTaxLotsNextPage", fetchTaxLotsNextPageRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Object UpdateTaxLotsSort(UpdateTaxLotsSortRequestDto updateTaxLotsSortRequestDto, Continuation<? super UpdateTaxLotsSortResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateTaxLotsSortRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTaxLotsSortResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateTaxLotsSort", updateTaxLotsSortRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Object UpdateTaxLotRowCheckedState(UpdateTaxLotRowCheckedStateRequestDto updateTaxLotRowCheckedStateRequestDto, Continuation<? super UpdateTaxLotRowCheckedStateResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateTaxLotRowCheckedStateRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTaxLotRowCheckedStateResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateTaxLotRowCheckedState", updateTaxLotRowCheckedStateRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Object UpdateTaxLotRowInputAmount(UpdateTaxLotRowInputAmountRequestDto updateTaxLotRowInputAmountRequestDto, Continuation<? super UpdateTaxLotRowInputAmountResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, UpdateTaxLotRowInputAmountRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTaxLotRowInputAmountResponseDto.INSTANCE.getBinaryBase64Serializer(), "UpdateTaxLotRowInputAmount", updateTaxLotRowInputAmountRequestDto, continuation);
    }

    @Override // microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService
    public Object ClearTaxLotRowInvalidInputAmount(ClearTaxLotRowInvalidInputAmountRequestDto clearTaxLotRowInvalidInputAmountRequestDto, Continuation<? super ClearTaxLotRowInvalidInputAmountResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ClearTaxLotRowInvalidInputAmountRequestDto.INSTANCE.getBinaryBase64Serializer(), ClearTaxLotRowInvalidInputAmountResponseDto.INSTANCE.getBinaryBase64Serializer(), "ClearTaxLotRowInvalidInputAmount", clearTaxLotRowInvalidInputAmountRequestDto, continuation);
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$InitializeCryptoTaxLotSelectionEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InitializeCryptoTaxLotSelectionEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public InitializeCryptoTaxLotSelectionEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, InitializeCryptoTaxLotSelectionRequestDto.INSTANCE.getBinaryBase64Serializer(), InitializeCryptoTaxLotSelectionResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTaxLotSelectionService_Adapter4(this, null));
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$StreamSelectedTaxLotsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamSelectedTaxLotsEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public StreamSelectedTaxLotsEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamSelectedTaxLotsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamSelectedTaxLotsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTaxLotSelectionService_Adapter$StreamSelectedTaxLotsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTaxLotSelectionService_Adapter.StreamSelectedTaxLotsEndpoint.call$lambda$0(this.f$0, (StreamSelectedTaxLotsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamSelectedTaxLotsEndpoint streamSelectedTaxLotsEndpoint, StreamSelectedTaxLotsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamSelectedTaxLotsEndpoint.service.StreamSelectedTaxLots(request);
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$StreamTaxLotSelectionFooterEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamTaxLotSelectionFooterEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public StreamTaxLotSelectionFooterEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamTaxLotSelectionFooterRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotSelectionFooterResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTaxLotSelectionService_Adapter$StreamTaxLotSelectionFooterEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTaxLotSelectionService_Adapter.StreamTaxLotSelectionFooterEndpoint.call$lambda$0(this.f$0, (StreamTaxLotSelectionFooterRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamTaxLotSelectionFooterEndpoint streamTaxLotSelectionFooterEndpoint, StreamTaxLotSelectionFooterRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamTaxLotSelectionFooterEndpoint.service.StreamTaxLotSelectionFooter(request);
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$StreamTaxLotViewModelsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StreamTaxLotViewModelsEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public StreamTaxLotViewModelsEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, StreamTaxLotViewModelsRequestDto.INSTANCE.getBinaryBase64Serializer(), StreamTaxLotViewModelsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.CryptoTaxLotSelectionService_Adapter$StreamTaxLotViewModelsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTaxLotSelectionService_Adapter.StreamTaxLotViewModelsEndpoint.call$lambda$0(this.f$0, (StreamTaxLotViewModelsRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(StreamTaxLotViewModelsEndpoint streamTaxLotViewModelsEndpoint, StreamTaxLotViewModelsRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return streamTaxLotViewModelsEndpoint.service.StreamTaxLotViewModels(request);
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$FetchTaxLotsNextPageEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FetchTaxLotsNextPageEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public FetchTaxLotsNextPageEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, FetchTaxLotsNextPageRequestDto.INSTANCE.getBinaryBase64Serializer(), FetchTaxLotsNextPageResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTaxLotSelectionService_Adapter3(this, null));
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$UpdateTaxLotsSortEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateTaxLotsSortEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public UpdateTaxLotsSortEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateTaxLotsSortRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTaxLotsSortResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTaxLotSelectionService_Adapter7(this, null));
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$UpdateTaxLotRowCheckedStateEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateTaxLotRowCheckedStateEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public UpdateTaxLotRowCheckedStateEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateTaxLotRowCheckedStateRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTaxLotRowCheckedStateResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTaxLotSelectionService_Adapter5(this, null));
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$UpdateTaxLotRowInputAmountEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UpdateTaxLotRowInputAmountEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public UpdateTaxLotRowInputAmountEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, UpdateTaxLotRowInputAmountRequestDto.INSTANCE.getBinaryBase64Serializer(), UpdateTaxLotRowInputAmountResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTaxLotSelectionService_Adapter6(this, null));
        }
    }

    /* compiled from: CryptoTaxLotSelectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService_Adapter$ClearTaxLotRowInvalidInputAmountEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/CryptoTaxLotSelectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ClearTaxLotRowInvalidInputAmountEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoTaxLotSelectionService service;

        public ClearTaxLotRowInvalidInputAmountEndpoint(CryptoTaxLotSelectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ClearTaxLotRowInvalidInputAmountRequestDto.INSTANCE.getBinaryBase64Serializer(), ClearTaxLotRowInvalidInputAmountResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoTaxLotSelectionService_Adapter2(this, null));
        }
    }
}
