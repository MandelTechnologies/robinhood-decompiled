package moneytree.p510v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: InterestService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lmoneytree/v1/InterestService;", "", "Lcom/robinhood/idl/Request;", "Lmoneytree/v1/ListMonthlyInterestHistoryRequestDto;", "request", "Lcom/robinhood/idl/Response;", "Lmoneytree/v1/ListMonthlyInterestHistoryResponseDto;", "ListMonthlyInterestHistory", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmoneytree/v1/GetMonthlyInterestHistoryRequestDto;", "Lmoneytree/v1/GetMonthlyInterestHistoryResponseDto;", "GetMonthlyInterestHistory", "(Lmoneytree/v1/GetMonthlyInterestHistoryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface InterestService {
    Object GetMonthlyInterestHistory(GetMonthlyInterestHistoryRequestDto getMonthlyInterestHistoryRequestDto, Continuation<? super GetMonthlyInterestHistoryResponseDto> continuation);

    Object ListMonthlyInterestHistory(Request<ListMonthlyInterestHistoryRequestDto> request, Continuation<? super Response<ListMonthlyInterestHistoryResponseDto>> continuation);
}
