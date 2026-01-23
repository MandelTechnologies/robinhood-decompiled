package com.robinhood.crypto.perpetuals.store;

import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.GetContractRequestDto;
import crypto_perpetuals.service.p440v1.GetContractResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PerpetualContractStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualContractStore$getContractEndpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class PerpetualContractStore2 extends FunctionReferenceImpl implements Function2<GetContractRequestDto, Continuation<? super GetContractResponseDto>, Object>, ContinuationImpl6 {
    PerpetualContractStore2(Object obj) {
        super(2, obj, CryptoPerpetualsService.class, "GetContract", "GetContract(Lcrypto_perpetuals/service/v1/GetContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetContractRequestDto getContractRequestDto, Continuation<? super GetContractResponseDto> continuation) {
        return ((CryptoPerpetualsService) this.receiver).GetContract(getContractRequestDto, continuation);
    }
}
