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

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$clearStoredState$1", m3645f = "WebviewViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.y7 */
/* loaded from: classes16.dex */
public final class C7263y7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3328a;

    /* renamed from: b */
    public final /* synthetic */ C5800A7 f3329b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7263y7(C5800A7 c5800a7, Continuation<? super C7263y7> continuation) {
        super(2, continuation);
        this.f3329b = c5800a7;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C7263y7(this.f3329b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C7263y7(this.f3329b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r5.mo1157a(r6) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC7136l6 interfaceC7136l6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f3328a;
        InterfaceC7136l6 interfaceC7136l62 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7189q6 interfaceC7189q6 = this.f3329b.f1240e;
            if (interfaceC7189q6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackId");
                interfaceC7189q6 = null;
            }
            this.f3328a = 1;
            if (interfaceC7189q6.mo1575a((ContinuationImpl7) this) != coroutine_suspended) {
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
            interfaceC7136l6 = this.f3329b.f1244i;
            if (interfaceC7136l6 == null) {
                interfaceC7136l62 = interfaceC7136l6;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
            }
            this.f3328a = 3;
        }
        InterfaceC7180p6 interfaceC7180p6 = this.f3329b.f1241f;
        if (interfaceC7180p6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readWebviewBackgroundTransparencyState");
            interfaceC7180p6 = null;
        }
        this.f3328a = 2;
        if (interfaceC7180p6.mo1547a(this) != coroutine_suspended) {
            interfaceC7136l6 = this.f3329b.f1244i;
            if (interfaceC7136l6 == null) {
            }
            this.f3328a = 3;
        }
        return coroutine_suspended;
    }
}
