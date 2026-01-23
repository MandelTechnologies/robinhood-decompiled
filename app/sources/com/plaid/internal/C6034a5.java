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

@DebugMetadata(m3644c = "com.plaid.core.storage.PlaidDirectoryStorage$saveData$2", m3645f = "PlaidDirectoryStorage.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.a5 */
/* loaded from: classes16.dex */
public final class C6034a5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C6044b5 f1898a;

    /* renamed from: b */
    public final /* synthetic */ String f1899b;

    /* renamed from: c */
    public final /* synthetic */ String f1900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6034a5(C6044b5 c6044b5, String str, String str2, Continuation<? super C6034a5> continuation) {
        super(2, continuation);
        this.f1898a = c6044b5;
        this.f1899b = str;
        this.f1900c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6034a5(this.f1898a, this.f1899b, this.f1900c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C6034a5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File parentDirectory = this.f1898a.f1925a;
        String fileName = this.f1899b;
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        FilesKt.writeText$default(file, this.f1900c, null, 2, null);
        return Unit.INSTANCE;
    }
}
