package com.plaid.internal;

import com.plaid.internal.C5835E6;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.core.webview.PlaidWebview$submit$1$2$1", m3645f = "PlaidWebview.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.N5 */
/* loaded from: classes16.dex */
public final class C5918N5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C5927O5 f1567a;

    /* renamed from: b */
    public final /* synthetic */ String f1568b;

    /* renamed from: c */
    public final /* synthetic */ String f1569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5918N5(C5927O5 c5927o5, String str, String str2, Continuation<? super C5918N5> continuation) {
        super(2, continuation);
        this.f1567a = c5927o5;
        this.f1568b = str;
        this.f1569c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5918N5(this.f1567a, this.f1568b, this.f1569c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C5918N5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f1567a.m1277a().get()) {
            C5835E6.a.m1187a("Webview is destroyed, cannot submit data");
            return Unit.INSTANCE;
        }
        this.f1567a.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"submit\", \"data\": {\"phone_number\":\"" + this.f1568b + "\", \"date_of_birth\":\"" + this.f1569c + "\"}}')");
        return Unit.INSTANCE;
    }
}
