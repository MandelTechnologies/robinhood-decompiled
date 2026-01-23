package com.robinhood.android.common.portfolio.pnl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PnlHubSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$onNavigate$1", m3645f = "PnlHubSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$onNavigate$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PnlHubSectionDuxo7 extends ContinuationImpl7 implements Function2<PnlHubSectionViewState, Continuation<? super PnlHubSectionViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PnlHubSectionDuxo7(Continuation<? super PnlHubSectionDuxo7> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubSectionDuxo7 pnlHubSectionDuxo7 = new PnlHubSectionDuxo7(continuation);
        pnlHubSectionDuxo7.L$0 = obj;
        return pnlHubSectionDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PnlHubSectionViewState pnlHubSectionViewState, Continuation<? super PnlHubSectionViewState> continuation) {
        return ((PnlHubSectionDuxo7) create(pnlHubSectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PnlHubSectionViewState.copy$default((PnlHubSectionViewState) this.L$0, null, null, null, null, false, false, false, false, 239, null);
    }
}
