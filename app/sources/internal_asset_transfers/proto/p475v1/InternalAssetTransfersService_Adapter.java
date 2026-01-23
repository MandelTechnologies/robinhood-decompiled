package internal_asset_transfers.proto.p475v1;

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

/* compiled from: InternalAssetTransfersService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/InternalAssetTransfersService_Adapter;", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsRequestDto;", "request", "Linternal_asset_transfers/proto/v1/GetEligibleAccountsResponseDto;", "GetEligibleAccounts", "(Linternal_asset_transfers/proto/v1/GetEligibleAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationRequestDto;", "Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationResponseDto;", "GetInvestorProfileConfirmation", "(Linternal_asset_transfers/proto/v1/GetInvestorProfileConfirmationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelResponseDto;", "GetTaxImplicationsViewModel", "(Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetEligibleAccountsEndpoint", "GetInvestorProfileConfirmationEndpoint", "GetTaxImplicationsViewModelEndpoint", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class InternalAssetTransfersService_Adapter implements InternalAssetTransfersService {
    private final ClientBridge __bridge;
    private final Json json;

    public InternalAssetTransfersService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // internal_asset_transfers.proto.p475v1.InternalAssetTransfersService
    public Object GetEligibleAccounts(GetEligibleAccountsRequestDto getEligibleAccountsRequestDto, Continuation<? super GetEligibleAccountsResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetEligibleAccountsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetEligibleAccountsResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetEligibleAccounts", getEligibleAccountsRequestDto, continuation);
    }

    @Override // internal_asset_transfers.proto.p475v1.InternalAssetTransfersService
    public Object GetInvestorProfileConfirmation(GetInvestorProfileConfirmationRequestDto getInvestorProfileConfirmationRequestDto, Continuation<? super GetInvestorProfileConfirmationResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetInvestorProfileConfirmationRequestDto.INSTANCE.getBinaryBase64Serializer(), GetInvestorProfileConfirmationResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetInvestorProfileConfirmation", getInvestorProfileConfirmationRequestDto, continuation);
    }

    @Override // internal_asset_transfers.proto.p475v1.InternalAssetTransfersService
    public Object GetTaxImplicationsViewModel(GetTaxImplicationsViewModelRequestDto getTaxImplicationsViewModelRequestDto, Continuation<? super GetTaxImplicationsViewModelResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetTaxImplicationsViewModelRequestDto.INSTANCE.getBinaryBase64Serializer(), GetTaxImplicationsViewModelResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetTaxImplicationsViewModel", getTaxImplicationsViewModelRequestDto, continuation);
    }

    /* compiled from: InternalAssetTransfersService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/InternalAssetTransfersService_Adapter$GetEligibleAccountsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetEligibleAccountsEndpoint implements ServiceCallable {
        private final Json json;
        private final InternalAssetTransfersService service;

        public GetEligibleAccountsEndpoint(InternalAssetTransfersService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetEligibleAccountsRequestDto.INSTANCE.getBinaryBase64Serializer(), GetEligibleAccountsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new InternalAssetTransfersService_Adapter2(this, null));
        }
    }

    /* compiled from: InternalAssetTransfersService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/InternalAssetTransfersService_Adapter$GetInvestorProfileConfirmationEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetInvestorProfileConfirmationEndpoint implements ServiceCallable {
        private final Json json;
        private final InternalAssetTransfersService service;

        public GetInvestorProfileConfirmationEndpoint(InternalAssetTransfersService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetInvestorProfileConfirmationRequestDto.INSTANCE.getBinaryBase64Serializer(), GetInvestorProfileConfirmationResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new InternalAssetTransfersService_Adapter3(this, null));
        }
    }

    /* compiled from: InternalAssetTransfersService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/InternalAssetTransfersService_Adapter$GetTaxImplicationsViewModelEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Linternal_asset_transfers/proto/v1/InternalAssetTransfersService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetTaxImplicationsViewModelEndpoint implements ServiceCallable {
        private final Json json;
        private final InternalAssetTransfersService service;

        public GetTaxImplicationsViewModelEndpoint(InternalAssetTransfersService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetTaxImplicationsViewModelRequestDto.INSTANCE.getBinaryBase64Serializer(), GetTaxImplicationsViewModelResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new InternalAssetTransfersService_Adapter4(this, null));
        }
    }
}
