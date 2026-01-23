package advisory.update_investor_profile.proto.p009v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import microgram.annotation.ManagedServices;

/* compiled from: AdvisoryUpdateInvestorProfileAllocationService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/AdvisoryUpdateInvestorProfileAllocationService;", "", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowRequestDto;", "request", "Lkotlinx/coroutines/flow/Flow;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto;", "GetAllocationFlow", "(Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowRequestDto;", "Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowResponseDto;", "GetNavigationFlow", "(Ladvisory/update_investor_profile/proto/v1/GetNavigationFlowRequestDto;)Lkotlinx/coroutines/flow/Flow;", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "advisory.update_investor_profile.proto.v1.AdvisoryUpdateInvestorProfileAllocationService")
/* loaded from: classes4.dex */
public interface AdvisoryUpdateInvestorProfileAllocationService {
    Flow<GetAllocationFlowResponseDto> GetAllocationFlow(GetAllocationFlowRequestDto request);

    Flow<GetNavigationFlowResponseDto> GetNavigationFlow(GetNavigationFlowRequestDto request);
}
