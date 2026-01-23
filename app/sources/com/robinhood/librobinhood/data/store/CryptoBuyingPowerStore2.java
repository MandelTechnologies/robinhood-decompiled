package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.models.api.ApiSessionAlert;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiSessionAlert;", "args", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerAlertArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$buyingPowerAlertEndpoint$1", m3645f = "CryptoBuyingPowerStore.kt", m3646l = {67}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$buyingPowerAlertEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoBuyingPowerStore2 extends ContinuationImpl7 implements Function2<CryptoBuyingPowerStore.BuyingPowerAlertArgs, Continuation<? super Optional<? extends ApiSessionAlert>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoBuyingPowerStore2(CryptoBuyingPowerStore cryptoBuyingPowerStore, Continuation<? super CryptoBuyingPowerStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoBuyingPowerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoBuyingPowerStore2 cryptoBuyingPowerStore2 = new CryptoBuyingPowerStore2(this.this$0, continuation);
        cryptoBuyingPowerStore2.L$0 = obj;
        return cryptoBuyingPowerStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CryptoBuyingPowerStore.BuyingPowerAlertArgs buyingPowerAlertArgs, Continuation<? super Optional<ApiSessionAlert>> continuation) {
        return ((CryptoBuyingPowerStore2) create(buyingPowerAlertArgs, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CryptoBuyingPowerStore.BuyingPowerAlertArgs buyingPowerAlertArgs, Continuation<? super Optional<? extends ApiSessionAlert>> continuation) {
        return invoke2(buyingPowerAlertArgs, (Continuation<? super Optional<ApiSessionAlert>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoBuyingPowerStore.BuyingPowerAlertArgs buyingPowerAlertArgs = (CryptoBuyingPowerStore.BuyingPowerAlertArgs) this.L$0;
            CryptoBonfireApi cryptoBonfireApi = this.this$0.bonfireApi;
            String accountNumber = buyingPowerAlertArgs.getAccountNumber();
            UUID currencyPairId = buyingPowerAlertArgs.getCurrencyPairId();
            this.label = 1;
            obj = cryptoBonfireApi.getCryptoBuyingPowerInfoAlert(accountNumber, currencyPairId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Optional3.asOptional(obj);
    }
}
