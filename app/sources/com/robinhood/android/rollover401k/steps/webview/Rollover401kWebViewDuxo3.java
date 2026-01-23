package com.robinhood.android.rollover401k.steps.webview;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Rollover401kWebViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$onCreate$3$1", m3645f = "Rollover401kWebViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewDuxo$onCreate$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class Rollover401kWebViewDuxo3 extends ContinuationImpl7 implements Function2<Rollover401kWebViewViewState, Continuation<? super Rollover401kWebViewViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    Rollover401kWebViewDuxo3(Continuation<? super Rollover401kWebViewDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Rollover401kWebViewDuxo3 rollover401kWebViewDuxo3 = new Rollover401kWebViewDuxo3(continuation);
        rollover401kWebViewDuxo3.L$0 = obj;
        return rollover401kWebViewDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Rollover401kWebViewViewState rollover401kWebViewViewState, Continuation<? super Rollover401kWebViewViewState> continuation) {
        return ((Rollover401kWebViewDuxo3) create(rollover401kWebViewViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Rollover401kWebViewViewState.copy$default((Rollover401kWebViewViewState) this.L$0, false, null, null, 6, null);
    }
}
