package md_server_proxy.service.p483v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MdServerProxyService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmd_server_proxy/service/v1/MdServerProxyService;", "", "Lmd_server_proxy/service/v1/GetQuotesRequestDto;", "request", "Lmd_server_proxy/service/v1/GetQuotesResponseDto;", "GetQuotes", "(Lmd_server_proxy/service/v1/GetQuotesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmd_server_proxy/service/v1/GetFundamentalsRequestDto;", "Lmd_server_proxy/service/v1/GetFundamentalsResponseDto;", "GetFundamentals", "(Lmd_server_proxy/service/v1/GetFundamentalsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface MdServerProxyService {
    Object GetFundamentals(GetFundamentalsRequestDto getFundamentalsRequestDto, Continuation<? super GetFundamentalsResponseDto> continuation);

    Object GetQuotes(GetQuotesRequestDto getQuotesRequestDto, Continuation<? super GetQuotesResponseDto> continuation);
}
