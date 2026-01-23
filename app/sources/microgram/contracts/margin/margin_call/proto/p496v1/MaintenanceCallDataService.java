package microgram.contracts.margin.margin_call.proto.p496v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: MaintenanceCallDataService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataService;", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataRequestDto;", "request", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "GetMaintenanceCallData", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelRequestDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponseDto;", "GetNbboSummaryModel", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataRequestDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataResponseDto;", "GetMaintenanceCallSummaryFromData", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallSummaryFromDataRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "microgram.contracts.margin.margin_call.proto.v1.MaintenanceCallDataService")
/* loaded from: classes14.dex */
public interface MaintenanceCallDataService {
    Object GetMaintenanceCallData(GetMaintenanceCallDataRequestDto getMaintenanceCallDataRequestDto, Continuation<? super GetMaintenanceCallDataResponseDto> continuation);

    Object GetMaintenanceCallSummaryFromData(GetMaintenanceCallSummaryFromDataRequestDto getMaintenanceCallSummaryFromDataRequestDto, Continuation<? super GetMaintenanceCallSummaryFromDataResponseDto> continuation);

    Object GetNbboSummaryModel(GetNbboSummaryModelRequestDto getNbboSummaryModelRequestDto, Continuation<? super GetNbboSummaryModelResponseDto> continuation);
}
