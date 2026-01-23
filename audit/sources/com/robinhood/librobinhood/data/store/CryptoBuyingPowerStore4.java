package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.models.api.ApiCryptoBuyingPower;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CryptoBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiCryptoBuyingPower;", "params", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerQuery;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$cryptoEndpoint$1", m3645f = "CryptoBuyingPowerStore.kt", m3646l = {201, 47}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$cryptoEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoBuyingPowerStore4 extends ContinuationImpl7 implements Function2<CryptoBuyingPowerStore.BuyingPowerQuery, Continuation<? super Optional<? extends ApiCryptoBuyingPower>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoBuyingPowerStore4(CryptoBuyingPowerStore cryptoBuyingPowerStore, Continuation<? super CryptoBuyingPowerStore4> continuation) {
        super(2, continuation);
        this.this$0 = cryptoBuyingPowerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoBuyingPowerStore4 cryptoBuyingPowerStore4 = new CryptoBuyingPowerStore4(this.this$0, continuation);
        cryptoBuyingPowerStore4.L$0 = obj;
        return cryptoBuyingPowerStore4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CryptoBuyingPowerStore.BuyingPowerQuery buyingPowerQuery, Continuation<? super Optional<ApiCryptoBuyingPower>> continuation) {
        return ((CryptoBuyingPowerStore4) create(buyingPowerQuery, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CryptoBuyingPowerStore.BuyingPowerQuery buyingPowerQuery, Continuation<? super Optional<? extends ApiCryptoBuyingPower>> continuation) {
        return invoke2(buyingPowerQuery, (Continuation<? super Optional<ApiCryptoBuyingPower>>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CryptoBuyingPowerStore.BuyingPowerQuery buyingPowerQuery;
        String accountNumber;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            buyingPowerQuery = (CryptoBuyingPowerStore.BuyingPowerQuery) this.L$0;
            accountNumber = buyingPowerQuery.getAccountNumber();
            if (accountNumber == null) {
                Single<Optional<String>> individualAccountNumber = this.this$0.accountProvider.getIndividualAccountNumber();
                this.L$0 = buyingPowerQuery;
                this.label = 1;
                obj = RxAwait3.await(individualAccountNumber, this);
            } else {
                if (accountNumber != null) {
                    CryptoBonfireApi cryptoBonfireApi = this.this$0.bonfireApi;
                    String currencyCode = buyingPowerQuery.getCurrencyCode();
                    this.L$0 = null;
                    this.label = 2;
                    obj = cryptoBonfireApi.getBuyingPowerForCrypto(accountNumber, currencyCode, this);
                }
                return Optional2.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Optional optionalAsOptional = Optional3.asOptional(obj);
            if (optionalAsOptional != null) {
                return optionalAsOptional;
            }
            return Optional2.INSTANCE;
        }
        buyingPowerQuery = (CryptoBuyingPowerStore.BuyingPowerQuery) this.L$0;
        ResultKt.throwOnFailure(obj);
        Optional optional = (Optional) obj;
        accountNumber = optional != null ? (String) optional.getOrNull() : null;
        if (accountNumber != null) {
        }
        return Optional2.INSTANCE;
    }
}
