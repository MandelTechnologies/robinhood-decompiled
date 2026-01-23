package com.plaid.internal;

import com.plaid.internal.AbstractC7207s6;
import com.plaid.link.Plaid;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.link.LinkActivityViewModel$onActivityReady$1", m3645f = "LinkActivityViewModel.kt", m3646l = {64, 65, 70}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.f2 */
/* loaded from: classes16.dex */
public final class C7074f2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f2764a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7207s6 f2765b;

    /* renamed from: c */
    public final /* synthetic */ C7094h2 f2766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7074f2(AbstractC7207s6 abstractC7207s6, C7094h2 c7094h2, Continuation<? super C7074f2> continuation) {
        super(2, continuation);
        this.f2765b = abstractC7207s6;
        this.f2766c = c7094h2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7074f2(this.f2765b, this.f2766c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C7074f2(this.f2765b, this.f2766c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r2.mo1588b(r7) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r2.mo1581a(r8, r7) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC7203s2 interfaceC7203s2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2764a;
        InterfaceC7203s2 interfaceC7203s22 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC7207s6 abstractC7207s6 = this.f2765b;
            if (abstractC7207s6 == null) {
                Plaid plaid = Plaid.INSTANCE;
                this.f2764a = 1;
                if (plaid.awaitPreload$link_sdk_release(this) != coroutine_suspended) {
                    interfaceC7203s2 = this.f2766c.f2828c;
                    if (interfaceC7203s2 == null) {
                    }
                    this.f2764a = 2;
                }
            } else {
                if (abstractC7207s6 instanceof AbstractC7207s6.e) {
                    return Unit.INSTANCE;
                }
                InterfaceC7203s2 interfaceC7203s23 = this.f2766c.f2828c;
                if (interfaceC7203s23 != null) {
                    interfaceC7203s22 = interfaceC7203s23;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("controller");
                }
                AbstractC7207s6 abstractC7207s62 = this.f2765b;
                this.f2764a = 3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC7203s2 = this.f2766c.f2828c;
        if (interfaceC7203s2 == null) {
            interfaceC7203s22 = interfaceC7203s2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("controller");
        }
        this.f2764a = 2;
    }
}
