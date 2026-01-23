package com.robinhood.android.pictureinpicture.pip;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PictureInPictureActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PictureInPictureActivity_MembersInjector implements MembersInjector<PictureInPictureActivity> {
    private final Provider<AuthManager> authManager;
    private final Provider<EventLogger> eventLogger;
    private final Provider<PictureInPictureStore> pipSupportStore;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<PictureInPictureActivity> create(Provider<BaseActivitySingletons> provider, Provider<PictureInPictureStore> provider2, Provider<EventLogger> provider3, Provider<AuthManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAuthManager(PictureInPictureActivity pictureInPictureActivity, AuthManager authManager) {
        INSTANCE.injectAuthManager(pictureInPictureActivity, authManager);
    }

    @JvmStatic
    public static final void injectEventLogger(PictureInPictureActivity pictureInPictureActivity, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(pictureInPictureActivity, eventLogger);
    }

    @JvmStatic
    public static final void injectPipSupportStore(PictureInPictureActivity pictureInPictureActivity, PictureInPictureStore pictureInPictureStore) {
        INSTANCE.injectPipSupportStore(pictureInPictureActivity, pictureInPictureStore);
    }

    public PictureInPictureActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<PictureInPictureStore> pipSupportStore, Provider<EventLogger> eventLogger, Provider<AuthManager> authManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.singletons = singletons;
        this.pipSupportStore = pipSupportStore;
        this.eventLogger = eventLogger;
        this.authManager = authManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PictureInPictureActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore.get();
        Intrinsics.checkNotNullExpressionValue(pictureInPictureStore, "get(...)");
        companion2.injectPipSupportStore(instance, pictureInPictureStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        companion2.injectAuthManager(instance, authManager);
    }

    /* compiled from: PictureInPictureActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "injectPipSupportStore", "", "instance", "injectEventLogger", "injectAuthManager", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PictureInPictureActivity> create(Provider<BaseActivitySingletons> singletons, Provider<PictureInPictureStore> pipSupportStore, Provider<EventLogger> eventLogger, Provider<AuthManager> authManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            return new PictureInPictureActivity_MembersInjector(singletons, pipSupportStore, eventLogger, authManager);
        }

        @JvmStatic
        public final void injectPipSupportStore(PictureInPictureActivity instance, PictureInPictureStore pipSupportStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(pipSupportStore, "pipSupportStore");
            instance.setPipSupportStore(pipSupportStore);
        }

        @JvmStatic
        public final void injectEventLogger(PictureInPictureActivity instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectAuthManager(PictureInPictureActivity instance, AuthManager authManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            instance.setAuthManager(authManager);
        }
    }
}
