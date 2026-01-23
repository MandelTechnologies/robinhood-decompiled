package com.robinhood.android.common.history.p082ui;

import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ComposeHistoryRowDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/history/ui/HistoryRowDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.history.ui.ComposeHistoryRowDuxo$setTarget$1$1", m3645f = "ComposeHistoryRowDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.history.ui.ComposeHistoryRowDuxo$setTarget$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class ComposeHistoryRowDuxo2 extends ContinuationImpl7 implements Function2<HistoryRowDataState, Continuation<? super HistoryRowDataState>, Object> {
    final /* synthetic */ TransactionSummary $summary;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeHistoryRowDuxo2(TransactionSummary transactionSummary, Continuation<? super ComposeHistoryRowDuxo2> continuation) {
        super(2, continuation);
        this.$summary = transactionSummary;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ComposeHistoryRowDuxo2 composeHistoryRowDuxo2 = new ComposeHistoryRowDuxo2(this.$summary, continuation);
        composeHistoryRowDuxo2.L$0 = obj;
        return composeHistoryRowDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HistoryRowDataState historyRowDataState, Continuation<? super HistoryRowDataState> continuation) {
        return ((ComposeHistoryRowDuxo2) create(historyRowDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return HistoryRowDataState.copy$default((HistoryRowDataState) this.L$0, this.$summary, null, 2, null);
    }
}
