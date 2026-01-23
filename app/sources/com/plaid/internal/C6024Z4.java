package com.plaid.internal;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.core.storage.PlaidDirectoryStorage$removeData$2", m3645f = "PlaidDirectoryStorage.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.Z4 */
/* loaded from: classes16.dex */
public final class C6024Z4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C6044b5 f1868a;

    /* renamed from: b */
    public final /* synthetic */ String f1869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6024Z4(C6044b5 c6044b5, String str, Continuation<? super C6024Z4> continuation) {
        super(2, continuation);
        this.f1868a = c6044b5;
        this.f1869b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6024Z4(this.f1868a, this.f1869b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C6024Z4(this.f1868a, this.f1869b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File file = new File(this.f1868a.f1925a.toString(), this.f1869b);
        if (file.exists()) {
            file.delete();
        }
        return Unit.INSTANCE;
    }
}
