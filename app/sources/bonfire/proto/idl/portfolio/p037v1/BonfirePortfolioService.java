package bonfire.proto.idl.portfolio.p037v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: BonfirePortfolioService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/BonfirePortfolioService;", "", "Lcom/robinhood/idl/Request;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsRequestDto;", "request", "Lcom/robinhood/idl/Response;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponseDto;", "GetAccountPositionDetails", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2RequestDto;", "Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2ResponseDto;", "GetAccountPositionsV2", "(Lbonfire/proto/idl/portfolio/v1/GetAccountPositionsV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface BonfirePortfolioService {
    Object GetAccountPositionDetails(Request<GetAccountPositionDetailsRequestDto> request, Continuation<? super Response<GetAccountPositionDetailsResponseDto>> continuation);

    Object GetAccountPositionsV2(GetAccountPositionsV2RequestDto getAccountPositionsV2RequestDto, Continuation<? super GetAccountPositionsV2ResponseDto> continuation);
}
