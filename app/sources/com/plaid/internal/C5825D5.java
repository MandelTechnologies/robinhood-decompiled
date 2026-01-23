package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope3;

/* renamed from: com.plaid.internal.D5 */
/* loaded from: classes16.dex */
public final class C5825D5 {

    /* renamed from: a */
    public final C5988V4 f1322a;

    public C5825D5(C5988V4 plaidCrashReporter) {
        Intrinsics.checkNotNullParameter(plaidCrashReporter, "plaidCrashReporter");
        this.f1322a = plaidCrashReporter;
    }

    /* renamed from: a */
    public final void m1175a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C5988V4 c5988v4 = this.f1322a;
        c5988v4.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C5970T4(c5988v4, message, null), 3, null);
    }
}
