package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "request", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginEligibilityStore$postEndpoint$1", m3645f = "MarginEligibilityStore.kt", m3646l = {45}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.MarginEligibilityStore$postEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginEligibilityStore6 extends ContinuationImpl7 implements Function2<MarginEligibilityStore.Request, Continuation<? super ApiMarginEligibility>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginEligibilityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginEligibilityStore6(MarginEligibilityStore marginEligibilityStore, Continuation<? super MarginEligibilityStore6> continuation) {
        super(2, continuation);
        this.this$0 = marginEligibilityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginEligibilityStore6 marginEligibilityStore6 = new MarginEligibilityStore6(this.this$0, continuation);
        marginEligibilityStore6.L$0 = obj;
        return marginEligibilityStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginEligibilityStore.Request request, Continuation<? super ApiMarginEligibility> continuation) {
        return ((MarginEligibilityStore6) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        MarginEligibilityStore.Request request = (MarginEligibilityStore.Request) this.L$0;
        MarginInvestingApi marginInvestingApi = this.this$0.marginInvestingApi;
        String accountNumber = request.getAccountNumber();
        boolean skipMin2kEquityCheck = request.getSkipMin2kEquityCheck();
        this.label = 1;
        Object objPostMarginEligibility = marginInvestingApi.postMarginEligibility(accountNumber, skipMin2kEquityCheck, this);
        return objPostMarginEligibility == coroutine_suspended ? coroutine_suspended : objPostMarginEligibility;
    }
}
