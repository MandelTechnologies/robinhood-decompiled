package com.robinhood.shared.transfers.cryptocheckout.store;

import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponseDto;
import com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: CryptoBillingAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/shared/transfers/cryptocheckout/store/CryptoBillingAccountStore$Response;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$endpoint$2", m3645f = "CryptoBillingAccountStore.kt", m3646l = {45}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.transfers.cryptocheckout.store.CryptoBillingAccountStore$endpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoBillingAccountStore3 extends ContinuationImpl7 implements Function2<CryptoBillingAccountStore.Response, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoBillingAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoBillingAccountStore3(CryptoBillingAccountStore cryptoBillingAccountStore, Continuation<? super CryptoBillingAccountStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoBillingAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoBillingAccountStore3 cryptoBillingAccountStore3 = new CryptoBillingAccountStore3(this.this$0, continuation);
        cryptoBillingAccountStore3.L$0 = obj;
        return cryptoBillingAccountStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoBillingAccountStore.Response response, Continuation<? super Unit> continuation) {
        return ((CryptoBillingAccountStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoBillingAccountStore.Response response = (CryptoBillingAccountStore.Response) this.L$0;
            String accountNumber = response.getAccountNumber();
            FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto = response.getFetchCryptoBillingAccountsResponseDto();
            StateFlow2 stateFlow2 = this.this$0.state;
            Map mapEmptyMap = (Map) this.this$0.state.getValue();
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, Tuples4.m3642to(accountNumber, fetchCryptoBillingAccountsResponseDto));
            this.label = 1;
            if (stateFlow2.emit(mapPlus, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
