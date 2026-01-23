package com.plaid.internal;

import com.plaid.internal.C5835E6;
import com.plaid.internal.C5953R5;
import com.plaid.internal.link.LinkActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.link.LinkActivity$openOutOfProcessWebview$1", m3645f = "LinkActivity.kt", m3646l = {144}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.E1 */
/* loaded from: classes16.dex */
public final class C5830E1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1336a;

    /* renamed from: b */
    public final /* synthetic */ LinkActivity f1337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5830E1(LinkActivity linkActivity, Continuation<? super C5830E1> continuation) {
        super(2, continuation);
        this.f1337b = linkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5830E1(this.f1337b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5830E1(this.f1337b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1336a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C7205s4 c7205s4M1550a = LinkActivity.m1550a(this.f1337b);
            this.f1336a = 1;
            obj = c7205s4M1550a.m1607a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str == null) {
            C5835E6.a.m1187a("No uri available in pane storage for Out Of Process WebView");
            LinkActivity.m1550a(this.f1337b).m1608a();
            return Unit.INSTANCE;
        }
        C5953R5.a.m1299a(C5953R5.f1671a, "Opening Custom Tab for " + str);
        this.f1337b.m1557a(str);
        LinkActivity.m1550a(this.f1337b).m1611c();
        LinkActivity.m1553c(this.f1337b);
        return Unit.INSTANCE;
    }
}
