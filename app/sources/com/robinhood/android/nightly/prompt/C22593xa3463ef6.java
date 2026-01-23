package com.robinhood.android.nightly.prompt;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightlyAdoptionModule_ProvideNightlyAdoptionManagerActivityLifecycleListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule_ProvideNightlyAdoptionManagerActivityLifecycleListenerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "nightlyAdoptionManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.nightly.prompt.NightlyAdoptionModule_ProvideNightlyAdoptionManagerActivityLifecycleListenerFactory */
/* loaded from: classes8.dex */
public final class C22593xa3463ef6 implements Factory<ActivityLifecycleListener> {
    private final Provider<NightlyAdoptionManager> nightlyAdoptionManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C22593xa3463ef6 create(Provider<NightlyAdoptionManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ActivityLifecycleListener provideNightlyAdoptionManagerActivityLifecycleListener(NightlyAdoptionManager nightlyAdoptionManager) {
        return INSTANCE.provideNightlyAdoptionManagerActivityLifecycleListener(nightlyAdoptionManager);
    }

    public C22593xa3463ef6(Provider<NightlyAdoptionManager> nightlyAdoptionManager) {
        Intrinsics.checkNotNullParameter(nightlyAdoptionManager, "nightlyAdoptionManager");
        this.nightlyAdoptionManager = nightlyAdoptionManager;
    }

    @Override // javax.inject.Provider
    public ActivityLifecycleListener get() {
        Companion companion = INSTANCE;
        NightlyAdoptionManager nightlyAdoptionManager = this.nightlyAdoptionManager.get();
        Intrinsics.checkNotNullExpressionValue(nightlyAdoptionManager, "get(...)");
        return companion.provideNightlyAdoptionManagerActivityLifecycleListener(nightlyAdoptionManager);
    }

    /* compiled from: NightlyAdoptionModule_ProvideNightlyAdoptionManagerActivityLifecycleListenerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule_ProvideNightlyAdoptionManagerActivityLifecycleListenerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule_ProvideNightlyAdoptionManagerActivityLifecycleListenerFactory;", "nightlyAdoptionManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionManager;", "provideNightlyAdoptionManagerActivityLifecycleListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.nightly.prompt.NightlyAdoptionModule_ProvideNightlyAdoptionManagerActivityLifecycleListenerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C22593xa3463ef6 create(Provider<NightlyAdoptionManager> nightlyAdoptionManager) {
            Intrinsics.checkNotNullParameter(nightlyAdoptionManager, "nightlyAdoptionManager");
            return new C22593xa3463ef6(nightlyAdoptionManager);
        }

        @JvmStatic
        public final ActivityLifecycleListener provideNightlyAdoptionManagerActivityLifecycleListener(NightlyAdoptionManager nightlyAdoptionManager) {
            Intrinsics.checkNotNullParameter(nightlyAdoptionManager, "nightlyAdoptionManager");
            Object objCheckNotNull = Preconditions.checkNotNull(NightlyAdoptionModule.INSTANCE.provideNightlyAdoptionManagerActivityLifecycleListener(nightlyAdoptionManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ActivityLifecycleListener) objCheckNotNull;
        }
    }
}
