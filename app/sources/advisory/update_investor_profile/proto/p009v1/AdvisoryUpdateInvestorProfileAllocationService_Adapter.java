package advisory.update_investor_profile.proto.p009v1;

import advisory.update_investor_profile.proto.p009v1.AdvisoryUpdateInvestorProfileAllocationService_Adapter;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.idl.RhGenerated;
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

/* compiled from: AdvisoryUpdateInvestorProfileAllocationService_Adapter.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService_Adapter;", "Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;", "", "Lmicrogram/service/bridge/ClientBridge;", "__bridge", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lmicrogram/service/bridge/ClientBridge;Lkotlinx/serialization/json/Json;)V", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto;", "GetAllocationFlow", "(Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowRequestDto;", "Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowResponseDto;", "GetNavigationFlow", "(Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/service/bridge/ClientBridge;", "get__bridge", "()Lmicrogram/service/bridge/ClientBridge;", "Lkotlinx/serialization/json/Json;", "GetAllocationFlowEndpoint", "GetNavigationFlowEndpoint", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class AdvisoryUpdateInvestorProfileAllocationService_Adapter implements AdvisoryUpdateInvestorProfileAllocationService {
    private final ClientBridge __bridge;
    private final Json json;

    public AdvisoryUpdateInvestorProfileAllocationService_Adapter(ClientBridge __bridge, Json json) {
        Intrinsics.checkNotNullParameter(__bridge, "__bridge");
        Intrinsics.checkNotNullParameter(json, "json");
        this.__bridge = __bridge;
        this.json = json;
    }

    public ClientBridge get__bridge() {
        return this.__bridge;
    }

    @Override // advisory.update_investor_profile.proto.p009v1.AdvisoryUpdateInvestorProfileAllocationService
    public Flow<GetAllocationFlowResponseDto> GetAllocationFlow(GetAllocationFlowRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, GetAllocationFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), GetAllocationFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetAllocationFlow", request, null, 32, null);
    }

    @Override // advisory.update_investor_profile.proto.p009v1.AdvisoryUpdateInvestorProfileAllocationService
    public Flow<GetNavigationFlowResponseDto> GetNavigationFlow(GetNavigationFlowRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return ClientCallAdapters.callFlow$default(get__bridge(), this.json, GetNavigationFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), GetNavigationFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), "GetNavigationFlow", request, null, 32, null);
    }

    /* compiled from: AdvisoryUpdateInvestorProfileAllocationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService_Adapter$GetAllocationFlowEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetAllocationFlowEndpoint implements ServiceCallable {
        private final Json json;
        private final AdvisoryUpdateInvestorProfileAllocationService service;

        public GetAllocationFlowEndpoint(AdvisoryUpdateInvestorProfileAllocationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, GetAllocationFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), GetAllocationFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService_Adapter$GetAllocationFlowEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryUpdateInvestorProfileAllocationService_Adapter.GetAllocationFlowEndpoint.call$lambda$0(this.f$0, (GetAllocationFlowRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetAllocationFlowEndpoint getAllocationFlowEndpoint, GetAllocationFlowRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getAllocationFlowEndpoint.service.GetAllocationFlow(request);
        }
    }

    /* compiled from: AdvisoryUpdateInvestorProfileAllocationService_Adapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService_Adapter$GetNavigationFlowEndpoint;", "Lmicrogram/service/protocol/ServiceCallable;", "service", "Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;Lkotlinx/serialization/json/Json;)V", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GetNavigationFlowEndpoint implements ServiceCallable {
        private final Json json;
        private final AdvisoryUpdateInvestorProfileAllocationService service;

        public GetNavigationFlowEndpoint(AdvisoryUpdateInvestorProfileAllocationService service, Json json) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(json, "json");
            this.service = service;
            this.json = json;
        }

        @Override // microgram.service.protocol.ServiceCallable
        public Flow<JsonElement> call(JsonElement body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return ImplementationCallAdapters.adaptFlow(this.json, GetNavigationFlowRequestDto.INSTANCE.getBinaryBase64Serializer(), GetNavigationFlowResponseDto.INSTANCE.getBinaryBase64Serializer(), body, new Function1() { // from class: advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService_Adapter$GetNavigationFlowEndpoint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvisoryUpdateInvestorProfileAllocationService_Adapter.GetNavigationFlowEndpoint.call$lambda$0(this.f$0, (GetNavigationFlowRequestDto) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow call$lambda$0(GetNavigationFlowEndpoint getNavigationFlowEndpoint, GetNavigationFlowRequestDto request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return getNavigationFlowEndpoint.service.GetNavigationFlow(request);
        }
    }
}
