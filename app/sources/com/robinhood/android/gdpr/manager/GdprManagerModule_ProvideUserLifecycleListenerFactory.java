package com.robinhood.android.gdpr.manager;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.login.UserLifecycleListener;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GdprManagerModule_ProvideUserLifecycleListenerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprManagerModule_ProvideUserLifecycleListenerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "userLifecycleListener", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprManagerModule_ProvideUserLifecycleListenerFactory implements Factory<UserLifecycleListener> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<GdprUserLifecycleListener> userLifecycleListener;

    @JvmStatic
    public static final GdprManagerModule_ProvideUserLifecycleListenerFactory create(Provider<GdprUserLifecycleListener> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final UserLifecycleListener provideUserLifecycleListener(GdprUserLifecycleListener gdprUserLifecycleListener) {
        return INSTANCE.provideUserLifecycleListener(gdprUserLifecycleListener);
    }

    public GdprManagerModule_ProvideUserLifecycleListenerFactory(Provider<GdprUserLifecycleListener> userLifecycleListener) {
        Intrinsics.checkNotNullParameter(userLifecycleListener, "userLifecycleListener");
        this.userLifecycleListener = userLifecycleListener;
    }

    @Override // javax.inject.Provider
    public UserLifecycleListener get() {
        Companion companion = INSTANCE;
        GdprUserLifecycleListener gdprUserLifecycleListener = this.userLifecycleListener.get();
        Intrinsics.checkNotNullExpressionValue(gdprUserLifecycleListener, "get(...)");
        return companion.provideUserLifecycleListener(gdprUserLifecycleListener);
    }

    /* compiled from: GdprManagerModule_ProvideUserLifecycleListenerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprManagerModule_ProvideUserLifecycleListenerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gdpr/manager/GdprManagerModule_ProvideUserLifecycleListenerFactory;", "userLifecycleListener", "Ljavax/inject/Provider;", "Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener;", "provideUserLifecycleListener", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GdprManagerModule_ProvideUserLifecycleListenerFactory create(Provider<GdprUserLifecycleListener> userLifecycleListener) {
            Intrinsics.checkNotNullParameter(userLifecycleListener, "userLifecycleListener");
            return new GdprManagerModule_ProvideUserLifecycleListenerFactory(userLifecycleListener);
        }

        @JvmStatic
        public final UserLifecycleListener provideUserLifecycleListener(GdprUserLifecycleListener userLifecycleListener) {
            Intrinsics.checkNotNullParameter(userLifecycleListener, "userLifecycleListener");
            Object objCheckNotNull = Preconditions.checkNotNull(GdprManagerModule.INSTANCE.provideUserLifecycleListener(userLifecycleListener), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (UserLifecycleListener) objCheckNotNull;
        }
    }
}
