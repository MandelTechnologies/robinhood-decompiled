package com.robinhood.android.portfolio.closedpnlsection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ClosedPnlSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$2$1$1$1", m3645f = "ClosedPnlSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.closedpnlsection.ClosedPnlSectionDuxo$bind$2$1$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class ClosedPnlSectionDuxo2 extends ContinuationImpl7 implements Function2<ClosedPnlSectionViewState, Continuation<? super ClosedPnlSectionViewState>, Object> {
    final /* synthetic */ boolean $isStale;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClosedPnlSectionDuxo2(boolean z, Continuation<? super ClosedPnlSectionDuxo2> continuation) {
        super(2, continuation);
        this.$isStale = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ClosedPnlSectionDuxo2 closedPnlSectionDuxo2 = new ClosedPnlSectionDuxo2(this.$isStale, continuation);
        closedPnlSectionDuxo2.L$0 = obj;
        return closedPnlSectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ClosedPnlSectionViewState closedPnlSectionViewState, Continuation<? super ClosedPnlSectionViewState> continuation) {
        return ((ClosedPnlSectionDuxo2) create(closedPnlSectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ClosedPnlSectionViewState.copy$default((ClosedPnlSectionViewState) this.L$0, null, null, this.$isStale, false, 11, null);
    }
}
