package com.robinhood.crypto.perpetuals.store.cachedService;

import contracts.perpetuals.proto.p433v1.GetButtonsRequestDto;
import contracts.perpetuals.proto.p433v1.GetButtonsResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PerpetualsButtonsCachedService.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/cachedService/PerpetualsButtonsCachedService;", "", "getButtons", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "request", "Lcontracts/perpetuals/proto/v1/GetButtonsRequestDto;", "(Lcontracts/perpetuals/proto/v1/GetButtonsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface PerpetualsButtonsCachedService {
    Object getButtons(GetButtonsRequestDto getButtonsRequestDto, Continuation<? super GetButtonsResponseDto> continuation);
}
