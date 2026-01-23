package microgram.contracts.mcw_currency_conversion.proto.p498v1;

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

/* compiled from: McwCurrencyConversionService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u001e\u001f !B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\""}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService_Adapter;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesRequestDto;", "request", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesResponseDto;", "GetConvertibleCurrencies", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConvertibleCurrenciesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateRequestDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateResponseDto;", "GetConversionFxRate", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/GetConversionFxRateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyResponseDto;", "ConvertCurrency", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionRequestDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionResponseDto;", "PerformQuickConversion", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetConvertibleCurrenciesEndpoint", "GetConversionFxRateEndpoint", "ConvertCurrencyEndpoint", "PerformQuickConversionEndpoint", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class McwCurrencyConversionService_Adapter implements McwCurrencyConversionService {
    private final ClientBridge __bridge;
    private final Json json;

    public McwCurrencyConversionService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService
    public Object GetConvertibleCurrencies(GetConvertibleCurrenciesRequestDto getConvertibleCurrenciesRequestDto, Continuation<? super GetConvertibleCurrenciesResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetConvertibleCurrenciesRequestDto.INSTANCE.getBinaryBase64Serializer(), GetConvertibleCurrenciesResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetConvertibleCurrencies", getConvertibleCurrenciesRequestDto, continuation);
    }

    @Override // microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService
    public Object GetConversionFxRate(GetConversionFxRateRequestDto getConversionFxRateRequestDto, Continuation<? super GetConversionFxRateResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetConversionFxRateRequestDto.INSTANCE.getBinaryBase64Serializer(), GetConversionFxRateResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetConversionFxRate", getConversionFxRateRequestDto, continuation);
    }

    @Override // microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService
    public Object ConvertCurrency(ConvertCurrencyRequestDto convertCurrencyRequestDto, Continuation<? super ConvertCurrencyResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, ConvertCurrencyRequestDto.INSTANCE.getBinaryBase64Serializer(), ConvertCurrencyResponseDto.INSTANCE.getBinaryBase64Serializer(), "ConvertCurrency", convertCurrencyRequestDto, continuation);
    }

    @Override // microgram.contracts.mcw_currency_conversion.proto.p498v1.McwCurrencyConversionService
    public Object PerformQuickConversion(PerformQuickConversionRequestDto performQuickConversionRequestDto, Continuation<? super PerformQuickConversionResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, PerformQuickConversionRequestDto.INSTANCE.getBinaryBase64Serializer(), PerformQuickConversionResponseDto.INSTANCE.getBinaryBase64Serializer(), "PerformQuickConversion", performQuickConversionRequestDto, continuation);
    }

    /* compiled from: McwCurrencyConversionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService_Adapter$GetConvertibleCurrenciesEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetConvertibleCurrenciesEndpoint implements ServiceCallable {
        private final Json json;
        private final McwCurrencyConversionService service;

        public GetConvertibleCurrenciesEndpoint(McwCurrencyConversionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetConvertibleCurrenciesRequestDto.INSTANCE.getBinaryBase64Serializer(), GetConvertibleCurrenciesResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new McwCurrencyConversionService_Adapter4(this, null));
        }
    }

    /* compiled from: McwCurrencyConversionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService_Adapter$GetConversionFxRateEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetConversionFxRateEndpoint implements ServiceCallable {
        private final Json json;
        private final McwCurrencyConversionService service;

        public GetConversionFxRateEndpoint(McwCurrencyConversionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetConversionFxRateRequestDto.INSTANCE.getBinaryBase64Serializer(), GetConversionFxRateResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new McwCurrencyConversionService_Adapter3(this, null));
        }
    }

    /* compiled from: McwCurrencyConversionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService_Adapter$ConvertCurrencyEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ConvertCurrencyEndpoint implements ServiceCallable {
        private final Json json;
        private final McwCurrencyConversionService service;

        public ConvertCurrencyEndpoint(McwCurrencyConversionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, ConvertCurrencyRequestDto.INSTANCE.getBinaryBase64Serializer(), ConvertCurrencyResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new McwCurrencyConversionService_Adapter2(this, null));
        }
    }

    /* compiled from: McwCurrencyConversionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService_Adapter$PerformQuickConversionEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/McwCurrencyConversionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PerformQuickConversionEndpoint implements ServiceCallable {
        private final Json json;
        private final McwCurrencyConversionService service;

        public PerformQuickConversionEndpoint(McwCurrencyConversionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, PerformQuickConversionRequestDto.INSTANCE.getBinaryBase64Serializer(), PerformQuickConversionResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new McwCurrencyConversionService_Adapter5(this, null));
        }
    }
}
