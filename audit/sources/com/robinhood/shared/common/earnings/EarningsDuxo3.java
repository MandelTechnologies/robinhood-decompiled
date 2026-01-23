package com.robinhood.shared.common.earnings;

import com.robinhood.shared.common.earnings.EarningsDuxo;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EarningsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/common/earnings/EarningsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$1$1", m3645f = "EarningsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.common.earnings.EarningsDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class EarningsDuxo3 extends ContinuationImpl7 implements Function2<EarningsDataState, Continuation<? super EarningsDataState>, Object> {
    final /* synthetic */ UiEarnings $uiEarnings;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EarningsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EarningsDuxo3(UiEarnings uiEarnings, EarningsDuxo earningsDuxo, Continuation<? super EarningsDuxo3> continuation) {
        super(2, continuation);
        this.$uiEarnings = uiEarnings;
        this.this$0 = earningsDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EarningsDuxo3 earningsDuxo3 = new EarningsDuxo3(this.$uiEarnings, this.this$0, continuation);
        earningsDuxo3.L$0 = obj;
        return earningsDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EarningsDataState earningsDataState, Continuation<? super EarningsDataState> continuation) {
        return ((EarningsDuxo3) create(earningsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EarningsDataState earningsDataState = (EarningsDataState) this.L$0;
        UiEarnings uiEarnings = this.$uiEarnings;
        EarningsDuxo earningsDuxo = this.this$0;
        boolean showHeader = ((EarningsDuxo.InitArgs) earningsDuxo.getArgs(earningsDuxo.getSavedStateHandle())).getShowHeader();
        EarningsDuxo earningsDuxo2 = this.this$0;
        return EarningsDataState.copy$default(earningsDataState, uiEarnings, showHeader, ((EarningsDuxo.InitArgs) earningsDuxo2.getArgs(earningsDuxo2.getSavedStateHandle())).getHeaderOverride(), null, false, 24, null);
    }
}
