package com.robinhood.leakcanary;

import android.app.Application;
import com.robinhood.leakcanary.LeakDetector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoopLeakDetector.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/leakcanary/NoopLeakDetector;", "Lcom/robinhood/leakcanary/LeakDetector;", "<init>", "()V", "initialize", "Lcom/robinhood/leakcanary/LeakDetector$InitializationResult;", "application", "Landroid/app/Application;", "expectWeaklyReachable", "", "watchedObject", "", "description", "", "lib-leakcanary_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NoopLeakDetector implements LeakDetector {
    @Override // com.robinhood.leakcanary.LeakDetector
    public void expectWeaklyReachable(Object watchedObject, String description) {
        Intrinsics.checkNotNullParameter(watchedObject, "watchedObject");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    @Override // com.robinhood.leakcanary.LeakDetector
    public LeakDetector.InitializationResult initialize(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new LeakDetector.InitializationResult(false);
    }
}
