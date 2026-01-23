package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$listEndpoint$1", m3645f = "RetirementHistoryStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class RetirementHistoryStore$listEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiRetirementFeeHistoryResponse>, Object> {
    int label;
    final /* synthetic */ RetirementHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementHistoryStore$listEndpoint$1(RetirementHistoryStore retirementHistoryStore, Continuation<? super RetirementHistoryStore$listEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = retirementHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RetirementHistoryStore$listEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiRetirementFeeHistoryResponse> continuation) {
        return ((RetirementHistoryStore$listEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RetirementApi retirementApi = this.this$0.api;
        this.label = 1;
        Object retirementFeeHistory = retirementApi.getRetirementFeeHistory(this);
        return retirementFeeHistory == coroutine_suspended ? coroutine_suspended : retirementFeeHistory;
    }
}
