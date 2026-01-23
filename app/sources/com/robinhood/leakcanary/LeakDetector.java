package com.robinhood.leakcanary;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LeakDetector.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/leakcanary/LeakDetector;", "", "initialize", "Lcom/robinhood/leakcanary/LeakDetector$InitializationResult;", "application", "Landroid/app/Application;", "expectWeaklyReachable", "", "watchedObject", "description", "", "InitializationResult", "Companion", "lib-leakcanary_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface LeakDetector {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void expectWeaklyReachable(Object watchedObject, String description);

    InitializationResult initialize(Application application);

    /* compiled from: LeakDetector.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/leakcanary/LeakDetector$InitializationResult;", "", "isInAnalyzerProcess", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-leakcanary_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitializationResult {
        private final boolean isInAnalyzerProcess;

        public static /* synthetic */ InitializationResult copy$default(InitializationResult initializationResult, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = initializationResult.isInAnalyzerProcess;
            }
            return initializationResult.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsInAnalyzerProcess() {
            return this.isInAnalyzerProcess;
        }

        public final InitializationResult copy(boolean isInAnalyzerProcess) {
            return new InitializationResult(isInAnalyzerProcess);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitializationResult) && this.isInAnalyzerProcess == ((InitializationResult) other).isInAnalyzerProcess;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInAnalyzerProcess);
        }

        public String toString() {
            return "InitializationResult(isInAnalyzerProcess=" + this.isInAnalyzerProcess + ")";
        }

        public InitializationResult(boolean z) {
            this.isInAnalyzerProcess = z;
        }

        public final boolean isInAnalyzerProcess() {
            return this.isInAnalyzerProcess;
        }
    }

    /* compiled from: LeakDetector.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096\u0001J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/leakcanary/LeakDetector$Companion;", "Lcom/robinhood/leakcanary/LeakDetector;", "<init>", "()V", "expectWeaklyReachable", "", "watchedObject", "", "description", "", "initialize", "Lcom/robinhood/leakcanary/LeakDetector$InitializationResult;", "application", "Landroid/app/Application;", "lib-leakcanary_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements LeakDetector {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private final /* synthetic */ NoopLeakDetector $$delegate_0 = new NoopLeakDetector();

        @Override // com.robinhood.leakcanary.LeakDetector
        public void expectWeaklyReachable(Object watchedObject, String description) {
            Intrinsics.checkNotNullParameter(watchedObject, "watchedObject");
            Intrinsics.checkNotNullParameter(description, "description");
            this.$$delegate_0.expectWeaklyReachable(watchedObject, description);
        }

        @Override // com.robinhood.leakcanary.LeakDetector
        public InitializationResult initialize(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            return this.$$delegate_0.initialize(application);
        }

        private Companion() {
        }
    }
}
