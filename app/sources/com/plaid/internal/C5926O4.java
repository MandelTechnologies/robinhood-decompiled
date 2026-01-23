package com.plaid.internal;

import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$storeNoLoadingUi$3", m3645f = "PlaidClientSideOnlyConfigurationStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.O4 */
/* loaded from: classes16.dex */
public final class C5926O4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C5935P4 f1589a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1590b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5926O4(C5935P4 c5935p4, boolean z, Continuation<? super C5926O4> continuation) {
        super(2, continuation);
        this.f1589a = c5935p4;
        this.f1590b = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5926O4(this.f1589a, this.f1590b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5926O4(this.f1589a, this.f1590b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f1589a.f1629a.m1154a("plaid_no_loading_ui", String.valueOf(this.f1590b));
        return Unit.INSTANCE;
    }
}
