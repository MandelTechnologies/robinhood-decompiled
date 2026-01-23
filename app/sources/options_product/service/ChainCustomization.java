package options_product.service;

import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ChainCustomization.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Loptions_product/service/ChainCustomization;", "", "Loptions_product/service/SbsChainCustomizationResponseDto;", "GetSbsChainCustomization", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loptions_product/service/UpdateSbsChainCustomizationRequestDto;", "request", "UpdateSbsChainCustomization", "(Loptions_product/service/UpdateSbsChainCustomizationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface ChainCustomization {
    Object GetSbsChainCustomization(Continuation<? super SbsChainCustomizationResponseDto> continuation);

    Object UpdateSbsChainCustomization(UpdateSbsChainCustomizationRequestDto updateSbsChainCustomizationRequestDto, Continuation<? super SbsChainCustomizationResponseDto> continuation);
}
