package contracts.money_movement.crypto_account_selection.proto.p432v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64UnitSerializer;
import contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService_Adapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: CryptoAccountSelectionManagedService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0018\u0019\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017¨\u0006\u001b"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService_Adapter;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "GetAccounts", "()Lkotlinx/coroutines/flow/Flow;", "Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;", "request", "", "DidSelectAccount", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/DidSelectAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DidSelectAddAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetAccountsEndpoint", "DidSelectAccountEndpoint", "DidSelectAddAccountEndpoint", "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class CryptoAccountSelectionManagedService_Adapter implements CryptoAccountSelectionManagedService {
    private final ClientBridge __bridge;
    private final Json json;

    public CryptoAccountSelectionManagedService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService
    public Flow<GetAccountsResponseDto> GetAccounts() {
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, BinaryBase64UnitSerializer.INSTANCE, GetAccountsResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetAccounts", Unit.INSTANCE, null, 32, null);
    }

    @Override // contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService
    public Object DidSelectAccount(DidSelectAccountRequestDto didSelectAccountRequestDto, Continuation<? super Unit> continuation) throws IOException {
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, DidSelectAccountRequestDto.INSTANCE.getBinaryBase64Serializer(), BinaryBase64UnitSerializer.INSTANCE, "DidSelectAccount", didSelectAccountRequestDto, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : Unit.INSTANCE;
    }

    @Override // contracts.money_movement.crypto_account_selection.proto.p432v1.CryptoAccountSelectionManagedService
    public Object DidSelectAddAccount(Continuation<? super Unit> continuation) throws IOException {
        ClientBridge clientBridge = get__bridge();
        Json json = this.json;
        BinaryBase64UnitSerializer binaryBase64UnitSerializer = BinaryBase64UnitSerializer.INSTANCE;
        Unit unit = Unit.INSTANCE;
        Object objCallSuspendFunction = ClientCallAdapters.callSuspendFunction(clientBridge, json, binaryBase64UnitSerializer, binaryBase64UnitSerializer, "DidSelectAddAccount", unit, continuation);
        return objCallSuspendFunction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCallSuspendFunction : unit;
    }

    /* compiled from: CryptoAccountSelectionManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService_Adapter$GetAccountsEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetAccountsEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoAccountSelectionManagedService service;

        public GetAccountsEndpoint(CryptoAccountSelectionManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, BinaryBase64UnitSerializer.INSTANCE, GetAccountsResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: contracts.money_movement.crypto_account_selection.proto.v1.CryptoAccountSelectionManagedService_Adapter$GetAccountsEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoAccountSelectionManagedService_Adapter.GetAccountsEndpoint.call$lambda$0(this.f$0, (Unit) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetAccountsEndpoint getAccountsEndpoint, Unit request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getAccountsEndpoint.service.GetAccounts();
        }
    }

    /* compiled from: CryptoAccountSelectionManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService_Adapter$DidSelectAccountEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DidSelectAccountEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoAccountSelectionManagedService service;

        public DidSelectAccountEndpoint(CryptoAccountSelectionManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, DidSelectAccountRequestDto.INSTANCE.getBinaryBase64Serializer(), BinaryBase64UnitSerializer.INSTANCE, body, new CryptoAccountSelectionManagedService_Adapter2(this, null));
        }
    }

    /* compiled from: CryptoAccountSelectionManagedService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService_Adapter$DidSelectAddAccountEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcontracts/money_movement/crypto_account_selection/proto/v1/CryptoAccountSelectionManagedService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts.money_movement.crypto_account_selection.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DidSelectAddAccountEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoAccountSelectionManagedService service;

        public DidSelectAddAccountEndpoint(CryptoAccountSelectionManagedService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            Json json = this.json;
            BinaryBase64UnitSerializer binaryBase64UnitSerializer = BinaryBase64UnitSerializer.INSTANCE;
            return ImplementationCallAdapters.adaptSuspendFunction(json, binaryBase64UnitSerializer, binaryBase64UnitSerializer, body, new CryptoAccountSelectionManagedService_Adapter3(this, null));
        }
    }
}
