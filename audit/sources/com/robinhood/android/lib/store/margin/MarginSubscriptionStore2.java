package com.robinhood.android.lib.store.margin;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.subscription.api.ApiMarginSubscription;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginSubscriptionStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/subscription/api/ApiMarginSubscription;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.margin.MarginSubscriptionStore$refresh$1$1", m3645f = "MarginSubscriptionStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.store.margin.MarginSubscriptionStore$refresh$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginSubscriptionStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiMarginSubscription>>, Object> {
    final /* synthetic */ String $cursor;
    int label;
    final /* synthetic */ MarginSubscriptionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginSubscriptionStore2(MarginSubscriptionStore marginSubscriptionStore, String str, Continuation<? super MarginSubscriptionStore2> continuation) {
        super(2, continuation);
        this.this$0 = marginSubscriptionStore;
        this.$cursor = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginSubscriptionStore2(this.this$0, this.$cursor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiMarginSubscription>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiMarginSubscription>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiMarginSubscription>> continuation) {
        return ((MarginSubscriptionStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Brokeback brokeback = this.this$0.brokeback;
        String str = this.$cursor;
        this.label = 1;
        Object currentMarginPlan = brokeback.getCurrentMarginPlan(str, this);
        return currentMarginPlan == coroutine_suspended ? coroutine_suspended : currentMarginPlan;
    }
}
