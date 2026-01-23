package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.q0 */
/* loaded from: classes16.dex */
public final class C7183q0 implements InterfaceC5833E4 {

    /* renamed from: a */
    public final InterfaceC7255y<String, Pane$PaneRendering> f3116a;

    /* renamed from: b */
    public final InterfaceC7232v4 f3117b;

    public C7183q0(WorkflowDatabase database) {
        C5978U3 cache2 = new C5978U3();
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(cache2, "cache");
        this.f3116a = cache2;
        this.f3117b = database.mo1639b();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7162n6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1566a(C6009X7 c6009x7, ContinuationImpl continuationImpl) {
        C7174p0 c7174p0;
        Pane$PaneRendering from;
        C7183q0 c7183q0;
        byte[] bArr;
        if (continuationImpl instanceof C7174p0) {
            c7174p0 = (C7174p0) continuationImpl;
            int i = c7174p0.f3091e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7174p0.f3091e = i - Integer.MIN_VALUE;
            } else {
                c7174p0 = new C7174p0(this, continuationImpl);
            }
        }
        Object objMo1131a = c7174p0.f3089c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7174p0.f3091e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1131a);
            from = (Pane$PaneRendering) this.f3116a.mo1327a((String) c6009x7.f1837d.getValue());
            if (from != null) {
                c7183q0 = this;
                if (from != null) {
                    c7183q0.f3116a.mo1328a((String) c6009x7.f1837d.getValue(), from);
                }
                return from;
            }
            InterfaceC7232v4 interfaceC7232v4 = this.f3117b;
            String str = c6009x7.f1834a;
            String str2 = c6009x7.f1835b;
            c7174p0.f3087a = this;
            c7174p0.f3088b = c6009x7;
            c7174p0.f3091e = 1;
            objMo1131a = interfaceC7232v4.mo1131a(str, str2, c7174p0);
            if (objMo1131a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c7183q0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6009x7 = c7174p0.f3088b;
            c7183q0 = c7174p0.f3087a;
            ResultKt.throwOnFailure(objMo1131a);
        }
        C5806B4 c5806b4 = (C5806B4) objMo1131a;
        from = (c5806b4 == null || (bArr = c5806b4.f1276c) == null) ? null : Pane$PaneRendering.parseFrom(bArr);
        if (from != null) {
        }
        return from;
    }

    @Override // com.plaid.internal.InterfaceC5833E4
    /* renamed from: a */
    public final Object mo1184a(C6009X7 c6009x7, Pane$PaneRendering pane$PaneRendering, C5942Q2 c5942q2) {
        this.f3116a.mo1328a((String) c6009x7.f1837d.getValue(), pane$PaneRendering);
        InterfaceC7232v4 interfaceC7232v4 = this.f3117b;
        String str = c6009x7.f1834a;
        String str2 = c6009x7.f1835b;
        byte[] byteArray = pane$PaneRendering.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        Object objMo1132a = interfaceC7232v4.mo1132a(str, str2, byteArray, c5942q2);
        return objMo1132a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1132a : Unit.INSTANCE;
    }
}
