package com.robinhood.librobinhood.data.store;

import account_aggregation.service.p005v1.AccountAggregationService;
import account_aggregation.service.p005v1.GetAccountSwitcherRequestDto;
import account_aggregation.service.p005v1.GetAccountSwitcherResponseDto;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher4;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "request", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountSwitcherStore$accountSwitcherEndpoint$1", m3645f = "AccountSwitcherStore.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.AccountSwitcherStore$accountSwitcherEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AccountSwitcherStore2 extends ContinuationImpl7 implements Function2<AccountSwitcherRequest, Continuation<? super AccountSwitcher>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountSwitcherStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSwitcherStore2(AccountSwitcherStore accountSwitcherStore, Continuation<? super AccountSwitcherStore2> continuation) {
        super(2, continuation);
        this.this$0 = accountSwitcherStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountSwitcherStore2 accountSwitcherStore2 = new AccountSwitcherStore2(this.this$0, continuation);
        accountSwitcherStore2.L$0 = obj;
        return accountSwitcherStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountSwitcherRequest accountSwitcherRequest, Continuation<? super AccountSwitcher> continuation) {
        return ((AccountSwitcherStore2) create(accountSwitcherRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSwitcherRequest accountSwitcherRequest = (AccountSwitcherRequest) this.L$0;
            AccountAggregationService accountAggregationService = this.this$0.accountAggregationService;
            GetAccountSwitcherRequestDto dto = accountSwitcherRequest.toDto();
            this.label = 1;
            obj = accountAggregationService.GetAccountSwitcher(dto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return AccountSwitcher4.toDbModel((GetAccountSwitcherResponseDto) obj, this.this$0.clock);
    }
}
