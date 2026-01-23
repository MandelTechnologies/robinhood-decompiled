package rosetta.portfolio.p541v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Portfolio.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lrosetta/portfolio/v1/Portfolio;", "", "Lrosetta/portfolio/v1/GetAccountValueRequestDto;", "request", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "GetAccountValue", "(Lrosetta/portfolio/v1/GetAccountValueRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponseDto;", "GetRealizedPerformanceSummary", "(Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface Portfolio {
    Object GetAccountValue(GetAccountValueRequestDto getAccountValueRequestDto, Continuation<? super GetAccountValueResponseDto> continuation);

    Object GetRealizedPerformanceSummary(GetRealizedPerformanceSummaryRequestDto getRealizedPerformanceSummaryRequestDto, Continuation<? super GetRealizedPerformanceSummaryResponseDto> continuation);
}
