package gold.proto.p464v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GoldService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lgold/proto/v1/GoldService;", "", "Lgold/proto/v1/GetSageFlowRequestDto;", "request", "Lgold/proto/v1/GetSageFlowResponseDto;", "GetSageFlow", "(Lgold/proto/v1/GetSageFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold/proto/v1/CreateSageApplicationRequestDto;", "Lgold/proto/v1/CreateSageApplicationResponseDto;", "CreateSageApplication", "(Lgold/proto/v1/CreateSageApplicationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgold/proto/v1/GetSageRateRequestDto;", "Lgold/proto/v1/GetSageRateResponseDto;", "GetSageRate", "(Lgold/proto/v1/GetSageRateRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface GoldService {
    Object CreateSageApplication(CreateSageApplicationRequestDto createSageApplicationRequestDto, Continuation<? super CreateSageApplicationResponseDto> continuation);

    Object GetSageFlow(GetSageFlowRequestDto getSageFlowRequestDto, Continuation<? super GetSageFlowResponseDto> continuation);

    Object GetSageRate(GetSageRateRequestDto getSageRateRequestDto, Continuation<? super GetSageRateResponseDto> continuation);
}
