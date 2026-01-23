package microgram.contracts.mcw_cash_balances.proto.p497v1;

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

/* compiled from: CashBalancesHomeSectionService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesHomeSectionService_Adapter;", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesHomeSectionService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionRequestDto;", "request", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionResponseDto;", "GetCashBalancesHomeSection", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesHomeSectionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetCashBalancesHomeSectionEndpoint", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class CashBalancesHomeSectionService_Adapter implements CashBalancesHomeSectionService {
    private final ClientBridge __bridge;
    private final Json json;

    public CashBalancesHomeSectionService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // microgram.contracts.mcw_cash_balances.proto.p497v1.CashBalancesHomeSectionService
    public Object GetCashBalancesHomeSection(GetCashBalancesHomeSectionRequestDto getCashBalancesHomeSectionRequestDto, Continuation<? super GetCashBalancesHomeSectionResponseDto> continuation) {
        return ClientCallAdapters.callSuspendFunction(get__bridge(), this.json, GetCashBalancesHomeSectionRequestDto.INSTANCE.getBinaryBase64Serializer(), GetCashBalancesHomeSectionResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetCashBalancesHomeSection", getCashBalancesHomeSectionRequestDto, continuation);
    }

    /* compiled from: CashBalancesHomeSectionService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesHomeSectionService_Adapter$GetCashBalancesHomeSectionEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesHomeSectionService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/CashBalancesHomeSectionService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetCashBalancesHomeSectionEndpoint implements ServiceCallable {
        private final Json json;
        private final CashBalancesHomeSectionService service;

        public GetCashBalancesHomeSectionEndpoint(CashBalancesHomeSectionService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptSuspendFunction(this.json, GetCashBalancesHomeSectionRequestDto.INSTANCE.getBinaryBase64Serializer(), GetCashBalancesHomeSectionResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new CashBalancesHomeSectionService_Adapter2(this, null));
        }
    }
}
