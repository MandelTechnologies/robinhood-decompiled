package hippo.service.p470v1;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UXFlagsService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lhippo/service/v1/UXFlagsService;", "", "Lhippo/service/v1/GetUXFlagsRequestDto;", "request", "Lhippo/service/v1/GetUXFlagsResponseDto;", "GetUXFlags", "(Lhippo/service/v1/GetUXFlagsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface UXFlagsService {
    Object GetUXFlags(GetUXFlagsRequestDto getUXFlagsRequestDto, Continuation<? super GetUXFlagsResponseDto> continuation);
}
