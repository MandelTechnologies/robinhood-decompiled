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

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$clearSessionState$1", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.p4 */
/* loaded from: classes16.dex */
public final class C7178p4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3110a;

    /* renamed from: b */
    public final /* synthetic */ C7205s4 f3111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7178p4(C7205s4 c7205s4, Continuation<? super C7178p4> continuation) {
        super(2, continuation);
        this.f3111b = c7205s4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7178p4(this.f3111b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C7178p4(this.f3111b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r5.mo1319b(r6) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC7171o6 interfaceC7171o6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3110a;
        InterfaceC7171o6 interfaceC7171o62 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7136l6 interfaceC7136l6 = this.f3111b.f3188c;
            if (interfaceC7136l6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                interfaceC7136l6 = null;
            }
            this.f3110a = 1;
            if (interfaceC7136l6.mo1157a(this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            interfaceC7171o6 = this.f3111b.f3190e;
            if (interfaceC7171o6 == null) {
                interfaceC7171o62 = interfaceC7171o6;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
            }
            this.f3110a = 3;
        }
        InterfaceC7189q6 interfaceC7189q6 = this.f3111b.f3189d;
        if (interfaceC7189q6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackId");
            interfaceC7189q6 = null;
        }
        this.f3110a = 2;
        if (interfaceC7189q6.mo1575a((ContinuationImpl7) this) != coroutine_suspended) {
            interfaceC7171o6 = this.f3111b.f3190e;
            if (interfaceC7171o6 == null) {
            }
            this.f3110a = 3;
        }
        return coroutine_suspended;
    }
}
