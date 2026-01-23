package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.WorkflowViewModel$getPane$2", m3645f = "WorkflowViewModel.kt", m3646l = {44}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.Y7 */
/* loaded from: classes16.dex */
public final class C6018Y7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Pane$PaneRendering>, Object> {

    /* renamed from: a */
    public int f1857a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6037a8 f1858b;

    /* renamed from: c */
    public final /* synthetic */ C6009X7 f1859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6018Y7(AbstractC6037a8 abstractC6037a8, C6009X7 c6009x7, Continuation<? super C6018Y7> continuation) {
        super(2, continuation);
        this.f1858b = abstractC6037a8;
        this.f1859c = c6009x7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6018Y7(this.f1858b, this.f1859c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pane$PaneRendering> continuation) {
        return new C6018Y7(this.f1858b, this.f1859c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws C5822D2 {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1857a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7162n6 interfaceC7162n6M1369b = this.f1858b.m1369b();
            C6009X7 c6009x7 = this.f1859c;
            this.f1857a = 1;
            obj = interfaceC7162n6M1369b.mo1566a(c6009x7, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
        if (pane$PaneRendering != null) {
            return pane$PaneRendering;
        }
        C6009X7 c6009x72 = this.f1859c;
        throw new C5822D2("No pane rendering found for " + c6009x72 + ".first: " + c6009x72 + ".second");
    }
}
