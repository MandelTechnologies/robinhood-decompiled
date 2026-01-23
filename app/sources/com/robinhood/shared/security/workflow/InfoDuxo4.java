package com.robinhood.shared.security.workflow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/workflow/InfoViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.InfoDuxo$onSecondaryCtaClicked$1$1", m3645f = "InfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.workflow.InfoDuxo$onSecondaryCtaClicked$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class InfoDuxo4 extends ContinuationImpl7 implements Function2<InfoViewState, Continuation<? super InfoViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InfoDuxo4(Continuation<? super InfoDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InfoDuxo4 infoDuxo4 = new InfoDuxo4(continuation);
        infoDuxo4.L$0 = obj;
        return infoDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InfoViewState infoViewState, Continuation<? super InfoViewState> continuation) {
        return ((InfoDuxo4) create(infoViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((InfoViewState) this.L$0).copy(true);
    }
}
