package com.plaid.internal;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.b5 */
/* loaded from: classes16.dex */
public final class C6044b5 {

    /* renamed from: a */
    public final File f1925a;

    public C6044b5(File rootDirectory, String directory) {
        Intrinsics.checkNotNullParameter(rootDirectory, "rootDirectory");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f1925a = new File(rootDirectory, directory);
    }

    /* renamed from: a */
    public final Object m1376a(ContinuationImpl7 continuationImpl7) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C6006X4(this, null), continuationImpl7);
    }

    /* renamed from: a */
    public final Object m1375a(String str, ContinuationImpl7 continuationImpl7) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C6024Z4(this, str, null), continuationImpl7);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
