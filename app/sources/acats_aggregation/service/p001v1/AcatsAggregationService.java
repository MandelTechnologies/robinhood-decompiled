package acats_aggregation.service.p001v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AcatsAggregationService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lacats_aggregation/service/v1/AcatsAggregationService;", "", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryRequestDto;", "request", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryResponseDto;", "FeeReimbursementsHistory", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsRequestDto;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;", "FeeReimbursementsHistoryDetails", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lacats_aggregation/service/v1/PlaidIntroRequestDto;", "Lacats_aggregation/service/v1/PlaidIntroResponseDto;", "PlaidIntro", "(Lacats_aggregation/service/v1/PlaidIntroRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public interface AcatsAggregationService {
    Object FeeReimbursementsHistory(FeeReimbursementsHistoryRequestDto feeReimbursementsHistoryRequestDto, Continuation<? super FeeReimbursementsHistoryResponseDto> continuation);

    Object FeeReimbursementsHistoryDetails(FeeReimbursementsHistoryDetailsRequestDto feeReimbursementsHistoryDetailsRequestDto, Continuation<? super FeeReimbursementsHistoryDetailsResponseDto> continuation);

    Object PlaidIntro(PlaidIntroRequestDto plaidIntroRequestDto, Continuation<? super PlaidIntroResponseDto> continuation);
}
