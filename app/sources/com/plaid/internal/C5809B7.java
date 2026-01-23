package com.plaid.internal;

import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$onSessionHandoff$1", m3645f = "WebviewViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.B7 */
/* loaded from: classes16.dex */
public final class C5809B7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1284a;

    /* renamed from: b */
    public final /* synthetic */ C5800A7 f1285b;

    /* renamed from: c */
    public final /* synthetic */ LinkedHashMap f1286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5809B7(C5800A7 c5800a7, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f1285b = c5800a7;
        this.f1286c = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5809B7(this.f1285b, this.f1286c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5809B7(this.f1285b, this.f1286c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1284a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7203s2 interfaceC7203s2M1143b = this.f1285b.m1143b();
            LinkedHashMap linkedHashMap = this.f1286c;
            this.f1284a = 1;
            if (interfaceC7203s2M1143b.mo1582a(linkedHashMap, this) == coroutine_suspended) {
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
