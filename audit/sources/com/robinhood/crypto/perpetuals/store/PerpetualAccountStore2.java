package com.robinhood.crypto.perpetuals.store;

import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.GetAccountRequestDto;
import crypto_perpetuals.service.p440v1.GetAccountResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PerpetualAccountStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualAccountStore$endpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class PerpetualAccountStore2 extends FunctionReferenceImpl implements Function2<GetAccountRequestDto, Continuation<? super GetAccountResponseDto>, Object>, ContinuationImpl6 {
    PerpetualAccountStore2(Object obj) {
        super(2, obj, CryptoPerpetualsService.class, "GetAccount", "GetAccount(Lcrypto_perpetuals/service/v1/GetAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetAccountRequestDto getAccountRequestDto, Continuation<? super GetAccountResponseDto> continuation) {
        return ((CryptoPerpetualsService) this.receiver).GetAccount(getAccountRequestDto, continuation);
    }
}
