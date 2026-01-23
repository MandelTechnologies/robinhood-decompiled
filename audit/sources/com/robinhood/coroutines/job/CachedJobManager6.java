package com.robinhood.coroutines.job;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CachedJobManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/coroutines/job/IdleTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.job.IdleTimeoutCancellationException, reason: use source file name */
/* loaded from: classes15.dex */
public final class CachedJobManager6 extends CancellationException {
    /* JADX WARN: Multi-variable type inference failed */
    public CachedJobManager6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CachedJobManager6(String str) {
        super(str);
    }

    public /* synthetic */ CachedJobManager6(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
