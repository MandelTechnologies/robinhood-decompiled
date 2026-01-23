package com.robinhood.shared.transfers.cryptocheckout.store;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsRequestDto;
import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponseDto;
import com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoBillingAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore$Response;", "params", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$endpoint$1", m3645f = "CryptoBillingAccountStore.kt", m3646l = {36}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$endpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoBillingAccountStore2 extends ContinuationImpl7 implements Function2<CryptoBillingAccountStore.Request, Continuation<? super CryptoBillingAccountStore.Response>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoBillingAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoBillingAccountStore2(CryptoBillingAccountStore cryptoBillingAccountStore, Continuation<? super CryptoBillingAccountStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoBillingAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoBillingAccountStore2 cryptoBillingAccountStore2 = new CryptoBillingAccountStore2(this.this$0, continuation);
        cryptoBillingAccountStore2.L$0 = obj;
        return cryptoBillingAccountStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoBillingAccountStore.Request request, Continuation<? super CryptoBillingAccountStore.Response> continuation) {
        return ((CryptoBillingAccountStore2) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoBillingAccountStore.Request request = (CryptoBillingAccountStore.Request) this.L$0;
            String accountNumber = request.getAccountNumber();
            BffMoneyMovementService bffMoneyMovementService = this.this$0.bffMoneyMovementService;
            FetchCryptoBillingAccountsRequestDto fetchCryptoBillingAccountsRequestDto = new FetchCryptoBillingAccountsRequestDto(request.getAccountNumber(), null, 2, null);
            this.L$0 = accountNumber;
            this.label = 1;
            obj = bffMoneyMovementService.FetchCryptoBillingAccounts(fetchCryptoBillingAccountsRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = accountNumber;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new CryptoBillingAccountStore.Response(str, (FetchCryptoBillingAccountsResponseDto) obj);
    }
}
