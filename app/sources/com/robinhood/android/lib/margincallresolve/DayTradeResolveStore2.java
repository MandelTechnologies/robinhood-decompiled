package com.robinhood.android.lib.margincallresolve;

import com.robinhood.android.lib.margincallresolve.api.DayTradeResolveApi;
import com.robinhood.android.lib.margincallresolve.api.models.ApiDayTradeCallView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DayTradeResolveStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margincallresolve/api/models/ApiDayTradeCallView;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margincallresolve.DayTradeResolveStore$getEndpoint$1", m3645f = "DayTradeResolveStore.kt", m3646l = {19}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margincallresolve.DayTradeResolveStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class DayTradeResolveStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiDayTradeCallView>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DayTradeResolveStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DayTradeResolveStore2(DayTradeResolveStore dayTradeResolveStore, Continuation<? super DayTradeResolveStore2> continuation) {
        super(2, continuation);
        this.this$0 = dayTradeResolveStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DayTradeResolveStore2 dayTradeResolveStore2 = new DayTradeResolveStore2(this.this$0, continuation);
        dayTradeResolveStore2.L$0 = obj;
        return dayTradeResolveStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiDayTradeCallView> continuation) {
        return ((DayTradeResolveStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DayTradeResolveApi dayTradeResolveApi = this.this$0.dayTradeResolveApi;
        this.label = 1;
        Object dayTradeCallView = dayTradeResolveApi.getDayTradeCallView(str, this);
        return dayTradeCallView == coroutine_suspended ? coroutine_suspended : dayTradeCallView;
    }
}
