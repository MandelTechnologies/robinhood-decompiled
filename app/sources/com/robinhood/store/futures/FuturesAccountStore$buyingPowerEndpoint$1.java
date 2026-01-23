package com.robinhood.store.futures;

import com.robinhood.android.lib.api.futures.FuturesBrokebackApi;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "rhsAccountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesAccountStore$buyingPowerEndpoint$1", m3645f = "FuturesAccountStore.kt", m3646l = {365}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesAccountStore$buyingPowerEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiFuturesBuyingPower>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesAccountStore$buyingPowerEndpoint$1(FuturesAccountStore futuresAccountStore, Continuation<? super FuturesAccountStore$buyingPowerEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAccountStore$buyingPowerEndpoint$1 futuresAccountStore$buyingPowerEndpoint$1 = new FuturesAccountStore$buyingPowerEndpoint$1(this.this$0, continuation);
        futuresAccountStore$buyingPowerEndpoint$1.L$0 = obj;
        return futuresAccountStore$buyingPowerEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiFuturesBuyingPower> continuation) {
        return ((FuturesAccountStore$buyingPowerEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        FuturesBrokebackApi futuresBrokebackApi = this.this$0.futuresBrokebackApi;
        this.label = 1;
        Object futuresBuyingPower = futuresBrokebackApi.getFuturesBuyingPower(str, this);
        return futuresBuyingPower == coroutine_suspended ? coroutine_suspended : futuresBuyingPower;
    }
}
