package com.robinhood.crypto.perpetuals.store;

import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.GetMarginEditRequestDto;
import crypto_perpetuals.service.p440v1.GetMarginEditResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PerpetualMarginEditHistoryStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$getMarginEditEndpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class PerpetualMarginEditHistoryStore2 extends FunctionReferenceImpl implements Function2<GetMarginEditRequestDto, Continuation<? super GetMarginEditResponseDto>, Object>, ContinuationImpl6 {
    PerpetualMarginEditHistoryStore2(Object obj) {
        super(2, obj, CryptoPerpetualsService.class, "GetMarginEdit", "GetMarginEdit(Lcrypto_perpetuals/service/v1/GetMarginEditRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMarginEditRequestDto getMarginEditRequestDto, Continuation<? super GetMarginEditResponseDto> continuation) {
        return ((CryptoPerpetualsService) this.receiver).GetMarginEdit(getMarginEditRequestDto, continuation);
    }
}
