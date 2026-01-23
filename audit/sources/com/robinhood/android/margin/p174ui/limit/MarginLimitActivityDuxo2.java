package com.robinhood.android.margin.p174ui.limit;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginLimitActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitActivityDuxo$onCreate$1$result$1$1", m3645f = "MarginLimitActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitActivityDuxo$onCreate$1$result$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginLimitActivityDuxo2 extends ContinuationImpl7 implements Function2<MarginLimitActivityState, Continuation<? super MarginLimitActivityState>, Object> {
    final /* synthetic */ String $accountNumber;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginLimitActivityDuxo2(String str, Continuation<? super MarginLimitActivityDuxo2> continuation) {
        super(2, continuation);
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginLimitActivityDuxo2 marginLimitActivityDuxo2 = new MarginLimitActivityDuxo2(this.$accountNumber, continuation);
        marginLimitActivityDuxo2.L$0 = obj;
        return marginLimitActivityDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginLimitActivityState marginLimitActivityState, Continuation<? super MarginLimitActivityState> continuation) {
        return ((MarginLimitActivityDuxo2) create(marginLimitActivityState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((MarginLimitActivityState) this.L$0).copy(this.$accountNumber);
    }
}
