package com.plaid.internal;

import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.FilesKt;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$readNoLoadingUi$2", m3645f = "PlaidClientSideOnlyConfigurationStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.N4 */
/* loaded from: classes16.dex */
public final class C5917N4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

    /* renamed from: a */
    public final /* synthetic */ C5935P4 f1566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5917N4(C5935P4 c5935p4, Continuation<? super C5917N4> continuation) {
        super(2, continuation);
        this.f1566a = c5935p4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5917N4(this.f1566a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return new C5917N4(this.f1566a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C5807B5 c5807b5 = this.f1566a.f1629a;
        c5807b5.getClass();
        Intrinsics.checkNotNullParameter("plaid_no_loading_ui", "fileName");
        File parentDirectory = c5807b5.f1279a.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(parentDirectory, "getFilesDir(...)");
        Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
        Intrinsics.checkNotNullParameter("plaid_no_loading_ui", "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, "plaid_no_loading_ui");
        if (!file.exists()) {
            file.createNewFile();
        }
        return boxing.boxBoolean(Intrinsics.areEqual(FilesKt.readText$default(file, null, 1, null), "true"));
    }
}
