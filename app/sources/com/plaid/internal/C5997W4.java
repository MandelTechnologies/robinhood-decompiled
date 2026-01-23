package com.plaid.internal;

import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.core.storage.PlaidDirectoryStorage$createFile$2", m3645f = "PlaidDirectoryStorage.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.W4 */
/* loaded from: classes16.dex */
public final class C5997W4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C6044b5 f1801a;

    /* renamed from: b */
    public final /* synthetic */ String f1802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5997W4(C6044b5 c6044b5, String str, Continuation<? super C5997W4> continuation) {
        super(2, continuation);
        this.f1801a = c6044b5;
        this.f1802b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5997W4(this.f1801a, this.f1802b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return new C5997W4(this.f1801a, this.f1802b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File parentDirectory = this.f1801a.f1925a;
        String fileName = this.f1802b;
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
            return file;
        }
        file.delete();
        file.createNewFile();
        return file;
    }
}
