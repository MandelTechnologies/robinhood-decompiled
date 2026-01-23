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
import kotlin.p481io.FilesKt;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.core.storage.PlaidDirectoryStorage$loadData$2", m3645f = "PlaidDirectoryStorage.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.Y4 */
/* loaded from: classes16.dex */
public final class C6015Y4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C6044b5 f1850a;

    /* renamed from: b */
    public final /* synthetic */ String f1851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6015Y4(C6044b5 c6044b5, String str, Continuation<? super C6015Y4> continuation) {
        super(2, continuation);
        this.f1850a = c6044b5;
        this.f1851b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6015Y4(this.f1850a, this.f1851b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return new C6015Y4(this.f1850a, this.f1851b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File parentDirectory = this.f1850a.f1925a;
        String fileName = this.f1851b;
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        return FilesKt.readText$default(file, null, 1, null);
    }
}
