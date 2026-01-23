package com.robinhood.android.portfolio.pnlhub;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PnlHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/pnlhub/PnlHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.pnlhub.PnlHubDuxo$onBottomSheetStateChange$1", m3645f = "PnlHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PnlHubDuxo$onBottomSheetStateChange$1 extends ContinuationImpl7 implements Function2<PnlHubDataState, Continuation<? super PnlHubDataState>, Object> {
    final /* synthetic */ PnlHubDataState2 $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubDuxo$onBottomSheetStateChange$1(PnlHubDataState2 pnlHubDataState2, Continuation<? super PnlHubDuxo$onBottomSheetStateChange$1> continuation) {
        super(2, continuation);
        this.$state = pnlHubDataState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PnlHubDuxo$onBottomSheetStateChange$1 pnlHubDuxo$onBottomSheetStateChange$1 = new PnlHubDuxo$onBottomSheetStateChange$1(this.$state, continuation);
        pnlHubDuxo$onBottomSheetStateChange$1.L$0 = obj;
        return pnlHubDuxo$onBottomSheetStateChange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PnlHubDataState pnlHubDataState, Continuation<? super PnlHubDataState> continuation) {
        return ((PnlHubDuxo$onBottomSheetStateChange$1) create(pnlHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PnlHubDataState.copy$default((PnlHubDataState) this.L$0, null, null, null, null, null, this.$state, null, false, null, null, null, false, false, null, false, false, false, null, false, false, false, 2097119, null);
    }
}
