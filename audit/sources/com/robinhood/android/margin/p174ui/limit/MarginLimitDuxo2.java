package com.robinhood.android.margin.p174ui.limit;

import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
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
@DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$2$1", m3645f = "MarginLimitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitDuxo$onCreate$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginLimitDuxo2 extends ContinuationImpl7 implements Function2<MarginLimitDataState, Continuation<? super MarginLimitDataState>, Object> {
    final /* synthetic */ UnifiedAccountV2 $unifiedAccount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginLimitDuxo2(UnifiedAccountV2 unifiedAccountV2, Continuation<? super MarginLimitDuxo2> continuation) {
        super(2, continuation);
        this.$unifiedAccount = unifiedAccountV2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginLimitDuxo2 marginLimitDuxo2 = new MarginLimitDuxo2(this.$unifiedAccount, continuation);
        marginLimitDuxo2.L$0 = obj;
        return marginLimitDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginLimitDataState marginLimitDataState, Continuation<? super MarginLimitDataState> continuation) {
        return ((MarginLimitDuxo2) create(marginLimitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MarginLimitDataState.copy$default((MarginLimitDataState) this.L$0, this.$unifiedAccount, null, null, null, null, null, null, null, null, false, null, null, 4094, null);
    }
}
