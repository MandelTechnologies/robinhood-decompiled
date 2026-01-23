package contracts.crypto.rewards.proto.p430v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64UnitSerializer;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import microgram.service.bridge.ClientBridge;
import microgram.service.managed.ClientCallAdapters;
import microgram.service.managed.ImplementationCallAdapters;
import microgram.service.protocol.ServiceCallable;

/* compiled from: CryptoRewardsService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\n\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001b"}, m3636d2 = {"Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService_Adapter;", "Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;", "GetHomeRewardsButton", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "", "request", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;", "Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonResponseDto;", "GetCryptoDetailRewardButton", "(Lcontracts/crypto/rewards/proto/v1/GetCryptoDetailRewardButtonRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetHomeRewardsButtonEndpoint", "GetCryptoDetailRewardButtonEndpoint", "contracts.crypto.rewards.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
final class CryptoRewardsService_Adapter implements CryptoRewardsService {
    private final ClientBridge __bridge;
    private final Json json;

    public CryptoRewardsService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    public Object GetHomeRewardsButton(Continuation<? super GetHomeRewardsButtonResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, BinaryBase64UnitSerializer.INSTANCE, GetHomeRewardsButtonResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetHomeRewardsButton", Unit.INSTANCE, continuation);
    }

    @Override // contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    public Object GetHomeRewardsButton(Request<Unit> request, Continuation<? super Response<GetHomeRewardsButtonResponseDto>> continuation) {
        throw new Standard2("Request/Response wrappers not supported for managed services");
    }

    @Override // contracts.crypto.rewards.proto.p430v1.CryptoRewardsService
    public Object GetCryptoDetailRewardButton(GetCryptoDetailRewardButtonRequestDto getCryptoDetailRewardButtonRequestDto, Continuation<? super GetCryptoDetailRewardButtonResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetCryptoDetailRewardButtonRequestDto.INSTANCE.getBinaryBase64Serializer(), GetCryptoDetailRewardButtonResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetCryptoDetailRewardButton", getCryptoDetailRewardButtonRequestDto, continuation);
    }

    /* compiled from: CryptoRewardsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService_Adapter$GetHomeRewardsButtonEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts.crypto.rewards.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetHomeRewardsButtonEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoRewardsService service;

        public GetHomeRewardsButtonEndpoint(CryptoRewardsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, BinaryBase64UnitSerializer.INSTANCE, GetHomeRewardsButtonResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoRewardsService_Adapter3(this, null));
        }
    }

    /* compiled from: CryptoRewardsService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService_Adapter$GetCryptoDetailRewardButtonEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lcontracts/crypto/rewards/proto/v1/CryptoRewardsService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "contracts.crypto.rewards.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetCryptoDetailRewardButtonEndpoint implements ServiceCallable {
        private final Json json;
        private final CryptoRewardsService service;

        public GetCryptoDetailRewardButtonEndpoint(CryptoRewardsService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetCryptoDetailRewardButtonRequestDto.INSTANCE.getBinaryBase64Serializer(), GetCryptoDetailRewardButtonResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CryptoRewardsService_Adapter2(this, null));
        }
    }
}
