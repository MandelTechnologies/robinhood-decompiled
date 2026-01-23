package com.robinhood.android.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.LockscreenManager;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureLibLoginModule_ProvidesLockscreenManagerActivityListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/dagger/FeatureLibLoginModule_ProvidesLockscreenManagerActivityListenerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "lockscreenManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/util/LockscreenManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dagger.FeatureLibLoginModule_ProvidesLockscreenManagerActivityListenerFactory */
/* loaded from: classes17.dex */
public final class C13654x4b8eaadc implements Factory<ActivityLifecycleListener> {
    private final Provider<LockscreenManager> lockscreenManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C13654x4b8eaadc create(Provider<LockscreenManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ActivityLifecycleListener providesLockscreenManagerActivityListener(LockscreenManager lockscreenManager) {
        return INSTANCE.providesLockscreenManagerActivityListener(lockscreenManager);
    }

    public C13654x4b8eaadc(Provider<LockscreenManager> lockscreenManager) {
        Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
        this.lockscreenManager = lockscreenManager;
    }

    @Override // javax.inject.Provider
    public ActivityLifecycleListener get() {
        Companion companion = INSTANCE;
        LockscreenManager lockscreenManager = this.lockscreenManager.get();
        Intrinsics.checkNotNullExpressionValue(lockscreenManager, "get(...)");
        return companion.providesLockscreenManagerActivityListener(lockscreenManager);
    }

    /* compiled from: FeatureLibLoginModule_ProvidesLockscreenManagerActivityListenerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/dagger/FeatureLibLoginModule_ProvidesLockscreenManagerActivityListenerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/dagger/FeatureLibLoginModule_ProvidesLockscreenManagerActivityListenerFactory;", "lockscreenManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/util/LockscreenManager;", "providesLockscreenManagerActivityListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dagger.FeatureLibLoginModule_ProvidesLockscreenManagerActivityListenerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C13654x4b8eaadc create(Provider<LockscreenManager> lockscreenManager) {
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            return new C13654x4b8eaadc(lockscreenManager);
        }

        @JvmStatic
        public final ActivityLifecycleListener providesLockscreenManagerActivityListener(LockscreenManager lockscreenManager) {
            Intrinsics.checkNotNullParameter(lockscreenManager, "lockscreenManager");
            Object objCheckNotNull = Preconditions.checkNotNull(FeatureLibLoginModule.INSTANCE.providesLockscreenManagerActivityListener(lockscreenManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ActivityLifecycleListener) objCheckNotNull;
        }
    }
}
