package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "eligibilityStatus", "Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$accountEligibilityStatusEndpoint$2", m3645f = "FuturesAccountStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesAccountStore$accountEligibilityStatusEndpoint$2 extends ContinuationImpl7 implements Function2<AccountFuturesEligibilityStatusDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$accountEligibilityStatusEndpoint$2(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$accountEligibilityStatusEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$accountEligibilityStatusEndpoint$2 futuresAccountStore$accountEligibilityStatusEndpoint$2 = new FuturesAccountStore$accountEligibilityStatusEndpoint$2(this.this$0, continuation);
        futuresAccountStore$accountEligibilityStatusEndpoint$2.L$0 = obj;
        return futuresAccountStore$accountEligibilityStatusEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, Continuation<? super Unit> continuation) {
        return ((FuturesAccountStore$accountEligibilityStatusEndpoint$2) create(accountFuturesEligibilityStatusDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto = (AccountFuturesEligibilityStatusDto) this.L$0;
            SharedFlow2 sharedFlow2 = this.this$0.accountEligibilityStatusCache;
            this.label = 1;
            if (sharedFlow2.emit(accountFuturesEligibilityStatusDto, this) == coroutine_suspended) {
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
