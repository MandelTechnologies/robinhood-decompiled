package com.robinhood.android.navigation.deeplink.unrecognized;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.app.type.AppType;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnrecognizedDeepLinkActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/unrecognized/UnrecognizedDeepLinkActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/navigation/deeplink/unrecognized/UnrecognizedDeepLinkActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-unrecognized-deep-link_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class UnrecognizedDeepLinkActivity_MembersInjector implements MembersInjector<UnrecognizedDeepLinkActivity> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AppType> appType;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BaseActivitySingletons> singletons;

    @JvmStatic
    public static final MembersInjector<UnrecognizedDeepLinkActivity> create(Provider<BaseActivitySingletons> provider, Provider<EventLogger> provider2, Provider<AppType> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAppType(UnrecognizedDeepLinkActivity unrecognizedDeepLinkActivity, AppType appType) {
        INSTANCE.injectAppType(unrecognizedDeepLinkActivity, appType);
    }

    @JvmStatic
    public static final void injectEventLogger(UnrecognizedDeepLinkActivity unrecognizedDeepLinkActivity, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(unrecognizedDeepLinkActivity, eventLogger);
    }

    public UnrecognizedDeepLinkActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<EventLogger> eventLogger, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.singletons = singletons;
        this.eventLogger = eventLogger;
        this.appType = appType;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UnrecognizedDeepLinkActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        companion2.injectAppType(instance, appType);
    }

    /* compiled from: UnrecognizedDeepLinkActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/navigation/deeplink/unrecognized/UnrecognizedDeepLinkActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/navigation/deeplink/unrecognized/UnrecognizedDeepLinkActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "injectEventLogger", "", "instance", "injectAppType", "feature-unrecognized-deep-link_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<UnrecognizedDeepLinkActivity> create(Provider<BaseActivitySingletons> singletons, Provider<EventLogger> eventLogger, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new UnrecognizedDeepLinkActivity_MembersInjector(singletons, eventLogger, appType);
        }

        @JvmStatic
        public final void injectEventLogger(UnrecognizedDeepLinkActivity instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectAppType(UnrecognizedDeepLinkActivity instance, AppType appType) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(appType, "appType");
            instance.setAppType(appType);
        }
    }
}
