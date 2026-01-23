package bonfire.proto.idl.equities.p034v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: EquitiesService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/EquitiesService;", "", "Lbonfire/proto/idl/equities/v1/GetAggregatedBorrowChartHistoryRequestDto;", "request", "Lbonfire/proto/idl/equities/v1/GetAggregatedBorrowChartHistoryResponseDto;", "GetAggregatedBorrowChartHistory", "(Lbonfire/proto/idl/equities/v1/GetAggregatedBorrowChartHistoryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/equities/v1/GetKillswitchesRequestDto;", "Lbonfire/proto/idl/equities/v1/GetKillswitchesResponseDto;", "GetKillswitches", "(Lbonfire/proto/idl/equities/v1/GetKillswitchesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface EquitiesService {
    Object GetAggregatedBorrowChartHistory(GetAggregatedBorrowChartHistoryRequestDto getAggregatedBorrowChartHistoryRequestDto, Continuation<? super GetAggregatedBorrowChartHistoryResponseDto> continuation);

    Object GetKillswitches(GetKillswitchesRequestDto getKillswitchesRequestDto, Continuation<? super GetKillswitchesResponseDto> continuation);
}
