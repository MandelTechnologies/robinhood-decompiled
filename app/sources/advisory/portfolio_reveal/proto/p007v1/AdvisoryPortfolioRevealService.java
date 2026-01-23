package advisory.portfolio_reveal.proto.p007v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.annotation.ManagedServices;

/* compiled from: AdvisoryPortfolioRevealService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/AdvisoryPortfolioRevealService;", "", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealRequestDto;", "request", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "GetPortfolioReveal", "(Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "advisory.portfolio_reveal.proto.v1.AdvisoryPortfolioRevealService")
/* loaded from: classes23.dex */
public interface AdvisoryPortfolioRevealService {
    Object GetPortfolioReveal(GetPortfolioRevealRequestDto getPortfolioRevealRequestDto, Continuation<? super GetPortfolioRevealResponseDto> continuation);
}
