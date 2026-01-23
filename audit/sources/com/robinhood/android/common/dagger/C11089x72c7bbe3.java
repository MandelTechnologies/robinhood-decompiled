package com.robinhood.android.common.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.lifecycle.ActivityLogger;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibCommonActivityListenersModule_ProvidesActivityLoggerActivityListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/dagger/LibCommonActivityListenersModule_ProvidesActivityLoggerActivityListenerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "activityLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/util/lifecycle/ActivityLogger;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.dagger.LibCommonActivityListenersModule_ProvidesActivityLoggerActivityListenerFactory */
/* loaded from: classes17.dex */
public final class C11089x72c7bbe3 implements Factory<ActivityLifecycleListener> {
    private final Provider<ActivityLogger> activityLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C11089x72c7bbe3 create(Provider<ActivityLogger> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ActivityLifecycleListener providesActivityLoggerActivityListener(ActivityLogger activityLogger) {
        return INSTANCE.providesActivityLoggerActivityListener(activityLogger);
    }

    public C11089x72c7bbe3(Provider<ActivityLogger> activityLogger) {
        Intrinsics.checkNotNullParameter(activityLogger, "activityLogger");
        this.activityLogger = activityLogger;
    }

    @Override // javax.inject.Provider
    public ActivityLifecycleListener get() {
        Companion companion = INSTANCE;
        ActivityLogger activityLogger = this.activityLogger.get();
        Intrinsics.checkNotNullExpressionValue(activityLogger, "get(...)");
        return companion.providesActivityLoggerActivityListener(activityLogger);
    }

    /* compiled from: LibCommonActivityListenersModule_ProvidesActivityLoggerActivityListenerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/dagger/LibCommonActivityListenersModule_ProvidesActivityLoggerActivityListenerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/dagger/LibCommonActivityListenersModule_ProvidesActivityLoggerActivityListenerFactory;", "activityLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/util/lifecycle/ActivityLogger;", "providesActivityLoggerActivityListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.dagger.LibCommonActivityListenersModule_ProvidesActivityLoggerActivityListenerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C11089x72c7bbe3 create(Provider<ActivityLogger> activityLogger) {
            Intrinsics.checkNotNullParameter(activityLogger, "activityLogger");
            return new C11089x72c7bbe3(activityLogger);
        }

        @JvmStatic
        public final ActivityLifecycleListener providesActivityLoggerActivityListener(ActivityLogger activityLogger) {
            Intrinsics.checkNotNullParameter(activityLogger, "activityLogger");
            Object objCheckNotNull = Preconditions.checkNotNull(LibCommonActivityListenersModule.INSTANCE.providesActivityLoggerActivityListener(activityLogger), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ActivityLifecycleListener) objCheckNotNull;
        }
    }
}
