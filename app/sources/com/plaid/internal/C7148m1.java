package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.internal.C7122k1;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.plaid.internal.m1 */
/* loaded from: classes16.dex */
public final class C7148m1<T> implements FlowCollector {

    /* renamed from: a */
    public final /* synthetic */ C7122k1 f2969a;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$doOnStart$2", m3645f = "HeadlessOAuthViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 69, 70}, m3647m = "emit")
    /* renamed from: com.plaid.internal.m1$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public C7148m1 f2970a;

        /* renamed from: b */
        public /* synthetic */ Object f2971b;

        /* renamed from: c */
        public final /* synthetic */ C7148m1<T> f2972c;

        /* renamed from: d */
        public int f2973d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C7148m1<? super T> c7148m1, Continuation<? super a> continuation) {
            super(continuation);
            this.f2972c = c7148m1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.f2971b = obj;
            this.f2973d |= Integer.MIN_VALUE;
            return this.f2972c.emit(null, this);
        }
    }

    public C7148m1(C7122k1 c7122k1) {
        this.f2969a = c7122k1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (com.plaid.internal.C7122k1.m1538a(r8, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (com.plaid.internal.C7122k1.m1541b(r8, r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Pane$PaneRendering pane$PaneRendering, Continuation<? super Unit> continuation) {
        a aVar;
        C7148m1<T> c7148m1;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f2973d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f2973d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        }
        Object objM1537a = aVar.f2971b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f2973d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM1537a);
            C7122k1 c7122k1 = this.f2969a;
            aVar.f2970a = this;
            aVar.f2973d = 1;
            objM1537a = C7122k1.m1537a(c7122k1, pane$PaneRendering, aVar);
            if (objM1537a != coroutine_suspended) {
                c7148m1 = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(objM1537a);
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM1537a);
            return Unit.INSTANCE;
        }
        c7148m1 = aVar.f2970a;
        ResultKt.throwOnFailure(objM1537a);
        C7122k1.b bVar = (C7122k1.b) objM1537a;
        if (bVar instanceof C7122k1.b.C49493b) {
            C7122k1 c7122k12 = c7148m1.f2969a;
            String str = ((C7122k1.b.C49493b) bVar).f2897a;
            aVar.f2970a = null;
            aVar.f2973d = 2;
        } else {
            if (!(bVar instanceof C7122k1.b.a)) {
                if (bVar instanceof C7122k1.b.c) {
                    C7122k1 c7122k13 = c7148m1.f2969a;
                    String oauthRedirectUri = ((C7122k1.b.c) bVar).f2898a;
                    c7122k13.getClass();
                    C5953R5.f1671a.getClass();
                    C5953R5.a.m1303a("Submit redirect URI", true);
                    Intrinsics.checkNotNullParameter(oauthRedirectUri, "oauthRedirectUri");
                    HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.C6635b c6635bM1439a = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().m1439a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().m1438b(oauthRedirectUri));
                    Intrinsics.checkNotNullExpressionValue(c6635bM1439a, "submitUri(...)");
                    C7122k1.m1540a(c7122k13, c6635bM1439a);
                }
                return Unit.INSTANCE;
            }
            C7122k1 c7122k14 = c7148m1.f2969a;
            String str2 = ((C7122k1.b.a) bVar).f2896a;
            aVar.f2970a = null;
            aVar.f2973d = 3;
        }
        return coroutine_suspended;
    }
}
