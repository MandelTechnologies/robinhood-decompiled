package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$1", m3645f = "WebviewViewModel.kt", m3646l = {115, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.w7 */
/* loaded from: classes16.dex */
public final class C7244w7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3285a;

    /* renamed from: b */
    public final /* synthetic */ C5800A7 f3286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7244w7(C5800A7 c5800a7, Continuation<? super C7244w7> continuation) {
        super(2, continuation);
        this.f3286b = c5800a7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7244w7(this.f3286b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C7244w7(this.f3286b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3285a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7198r6 interfaceC7198r6 = this.f3286b.f1238c;
            if (interfaceC7198r6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackUri");
                interfaceC7198r6 = null;
            }
            this.f3285a = 1;
            obj = interfaceC7198r6.mo1600a(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            return Unit.INSTANCE;
        }
        SharedFlow2<String> sharedFlow2 = this.f3286b.f1248m;
        this.f3285a = 2;
    }
}
