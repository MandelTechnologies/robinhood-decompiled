package com.robinhood.android.margin.p174ui.limit;

import com.robinhood.models.subscription.p352db.MarginSubscription;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginLimitDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$4$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$4$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginLimitDuxo4 extends ContinuationImpl7 implements Function2<MarginLimitDataState, Continuation<? super MarginLimitDataState>, Object> {
    final /* synthetic */ MarginSubscription $subscription;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginLimitDuxo4(MarginSubscription marginSubscription, Continuation<? super MarginLimitDuxo4> continuation) {
        super(2, continuation);
        this.$subscription = marginSubscription;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginLimitDuxo4 marginLimitDuxo4 = new MarginLimitDuxo4(this.$subscription, continuation);
        marginLimitDuxo4.L$0 = obj;
        return marginLimitDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginLimitDataState marginLimitDataState, Continuation<? super MarginLimitDataState> continuation) {
        return ((MarginLimitDuxo4) create(marginLimitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MarginLimitDataState.copy$default((MarginLimitDataState) this.L$0, null, null, this.$subscription, null, null, null, null, null, null, false, null, null, 4091, null);
    }
}
