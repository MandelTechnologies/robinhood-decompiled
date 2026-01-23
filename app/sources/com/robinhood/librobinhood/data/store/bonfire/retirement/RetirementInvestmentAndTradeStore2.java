package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.dashboard.ApiRetirementInvestmentAndTrade;
import com.robinhood.android.models.retirement.p194db.RetirementInvestmentAndTrade;
import com.robinhood.android.models.retirement.p194db.RetirementInvestmentAndTrade2;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementInvestmentAndTradeStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/db/RetirementInvestmentAndTrade;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore$endpoint$1", m3645f = "RetirementInvestmentAndTradeStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementInvestmentAndTradeStore2 extends ContinuationImpl7 implements Function2<RetirementInvestmentAndTradeStore.Request, Continuation<? super RetirementInvestmentAndTrade>, Object> {
    final /* synthetic */ RetirementApi $retirementApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementInvestmentAndTradeStore2(RetirementApi retirementApi, Continuation<? super RetirementInvestmentAndTradeStore2> continuation) {
        super(2, continuation);
        this.$retirementApi = retirementApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementInvestmentAndTradeStore2 retirementInvestmentAndTradeStore2 = new RetirementInvestmentAndTradeStore2(this.$retirementApi, continuation);
        retirementInvestmentAndTradeStore2.L$0 = obj;
        return retirementInvestmentAndTradeStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementInvestmentAndTradeStore.Request request, Continuation<? super RetirementInvestmentAndTrade> continuation) {
        return ((RetirementInvestmentAndTradeStore2) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        RetirementInvestmentAndTradeStore.Request request;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RetirementInvestmentAndTradeStore.Request request2 = (RetirementInvestmentAndTradeStore.Request) this.L$0;
            RetirementApi retirementApi = this.$retirementApi;
            String accountNumber = request2.getAccountNumber();
            boolean zIsPrivacyEnabled = request2.isPrivacyEnabled();
            this.L$0 = request2;
            this.label = 1;
            Object retirementInvestmentAndTrade = retirementApi.getRetirementInvestmentAndTrade(accountNumber, zIsPrivacyEnabled, this);
            if (retirementInvestmentAndTrade == coroutine_suspended) {
                return coroutine_suspended;
            }
            request = request2;
            obj = retirementInvestmentAndTrade;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            request = (RetirementInvestmentAndTradeStore.Request) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return RetirementInvestmentAndTrade2.toDbModel((ApiRetirementInvestmentAndTrade) obj, request.getAccountNumber());
    }
}
