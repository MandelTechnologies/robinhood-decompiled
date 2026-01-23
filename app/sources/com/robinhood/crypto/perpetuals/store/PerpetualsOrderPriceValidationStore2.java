package com.robinhood.crypto.perpetuals.store;

import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.ValidateOrderPriceRequestDto;
import crypto_perpetuals.service.p440v1.ValidateOrderPriceResponseDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PerpetualsOrderPriceValidationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsOrderPriceValidationStore$endpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class PerpetualsOrderPriceValidationStore2 extends FunctionReferenceImpl implements Function2<ValidateOrderPriceRequestDto, Continuation<? super ValidateOrderPriceResponseDto>, Object>, ContinuationImpl6 {
    PerpetualsOrderPriceValidationStore2(Object obj) {
        super(2, obj, CryptoPerpetualsService.class, "ValidateOrderPrice", "ValidateOrderPrice(Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ValidateOrderPriceRequestDto validateOrderPriceRequestDto, Continuation<? super ValidateOrderPriceResponseDto> continuation) {
        return ((CryptoPerpetualsService) this.receiver).ValidateOrderPrice(validateOrderPriceRequestDto, continuation);
    }
}
