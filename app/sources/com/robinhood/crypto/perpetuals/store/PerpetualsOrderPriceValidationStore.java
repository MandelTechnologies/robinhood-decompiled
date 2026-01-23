package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.crypto.models.perpetuals.p288db.OrderSide;
import com.robinhood.crypto.models.perpetuals.p288db.OrderSide2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Uuids;
import crypto_perpetuals.common.p435v1.QuoteDto;
import crypto_perpetuals.order.p438v1.ValidatePriceDto;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.ValidateOrderPriceRequestDto;
import crypto_perpetuals.service.p440v1.ValidateOrderPriceResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualsOrderPriceValidationStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsOrderPriceValidationStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcrypto_perpetuals/service/v1/ValidateOrderPriceRequestDto;", "Lcrypto_perpetuals/service/v1/ValidateOrderPriceResponseDto;", "validateOrderPrice", "Lkotlin/Result;", "", "contractId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/crypto/models/perpetuals/db/OrderSide;", "quote", "Lcrypto_perpetuals/common/v1/QuoteDto;", "validatePrice", "Lcrypto_perpetuals/order/v1/ValidatePriceDto;", "validateOrderPrice-yxL6bBk", "(Ljava/util/UUID;Lcom/robinhood/crypto/models/perpetuals/db/OrderSide;Lcrypto_perpetuals/common/v1/QuoteDto;Lcrypto_perpetuals/order/v1/ValidatePriceDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PerpetualsOrderPriceValidationStore extends Store {
    private final Endpoint<ValidateOrderPriceRequestDto, ValidateOrderPriceResponseDto> endpoint;
    private final CryptoPerpetualsService service;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean endpoint$lambda$0(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualsOrderPriceValidationStore(StoreBundle storeBundle, CryptoPerpetualsService service) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.endpoint = Endpoint.INSTANCE.create(new PerpetualsOrderPriceValidationStore2(service), getLogoutKillswitch(), new PerpetualsOrderPriceValidationStore3(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsOrderPriceValidationStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PerpetualsOrderPriceValidationStore.endpoint$lambda$0((Long) obj));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: validateOrderPrice-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22243validateOrderPriceyxL6bBk(UUID uuid, OrderSide orderSide, QuoteDto quoteDto, ValidatePriceDto validatePriceDto, Continuation<? super Result<Unit>> continuation) {
        PerpetualsOrderPriceValidationStore4 perpetualsOrderPriceValidationStore4;
        if (continuation instanceof PerpetualsOrderPriceValidationStore4) {
            perpetualsOrderPriceValidationStore4 = (PerpetualsOrderPriceValidationStore4) continuation;
            int i = perpetualsOrderPriceValidationStore4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                perpetualsOrderPriceValidationStore4.label = i - Integer.MIN_VALUE;
            } else {
                perpetualsOrderPriceValidationStore4 = new PerpetualsOrderPriceValidationStore4(this, continuation);
            }
        }
        PerpetualsOrderPriceValidationStore4 perpetualsOrderPriceValidationStore42 = perpetualsOrderPriceValidationStore4;
        Object obj = perpetualsOrderPriceValidationStore42.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = perpetualsOrderPriceValidationStore42.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ValidateOrderPriceRequestDto validateOrderPriceRequestDto = new ValidateOrderPriceRequestDto(Uuids.safeToString(uuid), OrderSide2.toProto(orderSide), quoteDto, validatePriceDto);
                Endpoint<ValidateOrderPriceRequestDto, ValidateOrderPriceResponseDto> endpoint = this.endpoint;
                perpetualsOrderPriceValidationStore42.label = 1;
                if (Endpoint.DefaultImpls.forceFetch$default(endpoint, validateOrderPriceRequestDto, null, perpetualsOrderPriceValidationStore42, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(e));
        }
    }
}
