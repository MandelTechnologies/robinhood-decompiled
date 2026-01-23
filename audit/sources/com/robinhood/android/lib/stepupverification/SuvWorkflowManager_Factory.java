package com.robinhood.android.lib.stepupverification;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SuvWorkflowManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SuvWorkflowManager_Factory implements Factory<SuvWorkflowManager> {
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<LazyMoshi> moshi;
    private final Provider<SuvMigrationManager> suvMigrationManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SuvWorkflowManager_Factory create(Provider<CoroutineScope> provider, Provider<LazyMoshi> provider2, Provider<SharedEventLogger> provider3, Provider<SuvMigrationManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final SuvWorkflowManager newInstance(CoroutineScope coroutineScope, LazyMoshi lazyMoshi, SharedEventLogger sharedEventLogger, SuvMigrationManager suvMigrationManager) {
        return INSTANCE.newInstance(coroutineScope, lazyMoshi, sharedEventLogger, suvMigrationManager);
    }

    public SuvWorkflowManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<LazyMoshi> moshi, Provider<SharedEventLogger> eventLogger, Provider<SuvMigrationManager> suvMigrationManager) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        this.coroutineScope = coroutineScope;
        this.moshi = moshi;
        this.eventLogger = eventLogger;
        this.suvMigrationManager = suvMigrationManager;
    }

    @Override // javax.inject.Provider
    public SuvWorkflowManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager.get();
        Intrinsics.checkNotNullExpressionValue(suvMigrationManager, "get(...)");
        return companion.newInstance(coroutineScope, lazyMoshi, sharedEventLogger, suvMigrationManager);
    }

    /* compiled from: SuvWorkflowManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "newInstance", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SuvWorkflowManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<LazyMoshi> moshi, Provider<SharedEventLogger> eventLogger, Provider<SuvMigrationManager> suvMigrationManager) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            return new SuvWorkflowManager_Factory(coroutineScope, moshi, eventLogger, suvMigrationManager);
        }

        @JvmStatic
        public final SuvWorkflowManager newInstance(CoroutineScope coroutineScope, LazyMoshi moshi, SharedEventLogger eventLogger, SuvMigrationManager suvMigrationManager) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
            return new SuvWorkflowManager(coroutineScope, moshi, eventLogger, suvMigrationManager);
        }
    }
}
