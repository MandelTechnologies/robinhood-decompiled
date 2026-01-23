package com.plaid.internal;

import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.WorkflowViewModel$next$1", m3645f = "WorkflowViewModel.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.Z7 */
/* loaded from: classes16.dex */
public final class C6027Z7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1879a;

    /* renamed from: b */
    public final /* synthetic */ List f1880b;

    /* renamed from: c */
    public final /* synthetic */ C7122k1 f1881c;

    /* renamed from: d */
    public final /* synthetic */ Pane$PaneOutput.C6730a f1882d;

    /* renamed from: e */
    public final /* synthetic */ String f1883e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6027Z7(List list, C7122k1 c7122k1, Pane$PaneOutput.C6730a c6730a, String str, Continuation continuation) {
        super(2, continuation);
        this.f1880b = list;
        this.f1881c = c7122k1;
        this.f1882d = c6730a;
        this.f1883e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6027Z7(this.f1880b, this.f1881c, this.f1882d, this.f1883e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C6027Z7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Function2<LinkEvent, AbstractC5849G2, Unit> linkEventListenerInternal$link_sdk_release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1879a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<Common$SDKEvent> list = this.f1880b;
            if (list != null) {
                this.f1881c.getClass();
                for (Common$SDKEvent common$SDKEvent : list) {
                    if (!Intrinsics.areEqual(common$SDKEvent, Common$SDKEvent.getDefaultInstance()) && (linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release()) != null) {
                        linkEventListenerInternal$link_sdk_release.invoke(C7262y6.m1670a(common$SDKEvent), AbstractC5849G2.d.f1351a);
                    }
                }
            }
            InterfaceC7203s2 interfaceC7203s2 = this.f1881c.f1911c;
            if (interfaceC7203s2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkController");
                interfaceC7203s2 = null;
            }
            Pane$PaneOutput pane$PaneOutputBuild = this.f1882d.m1445b(this.f1881c.f1909a.f1835b).m1444a(this.f1883e).build();
            Intrinsics.checkNotNullExpressionValue(pane$PaneOutputBuild, "build(...)");
            Pane$PaneOutput[] pane$PaneOutputArr = {pane$PaneOutputBuild};
            this.f1879a = 1;
            if (interfaceC7203s2.mo1584a(pane$PaneOutputArr, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
