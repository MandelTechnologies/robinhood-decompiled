package com.robinhood.android.portfolio.pnlhub;

import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onCreate$1$1$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PnlHubDuxo$onCreate$1$1$1 extends ContinuationImpl7 implements Function2<PnlHubViewState, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    PnlHubDuxo$onCreate$1$1$1(Continuation<? super PnlHubDuxo$onCreate$1$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubDuxo$onCreate$1$1$1 pnlHubDuxo$onCreate$1$1$1 = new PnlHubDuxo$onCreate$1$1$1(continuation);
        pnlHubDuxo$onCreate$1$1$1.L$0 = obj;
        return pnlHubDuxo$onCreate$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PnlHubViewState pnlHubViewState, Continuation<? super Boolean> continuation) {
        return ((PnlHubDuxo$onCreate$1$1$1) create(pnlHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return boxing.boxBoolean(((PnlHubViewState) this.L$0) instanceof PnlHubViewState.Loading);
    }
}
