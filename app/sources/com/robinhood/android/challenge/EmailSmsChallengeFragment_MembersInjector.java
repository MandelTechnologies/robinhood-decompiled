package com.robinhood.android.challenge;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.app.type.AppType;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailSmsChallengeFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/challenge/EmailSmsChallengeFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EmailSmsChallengeFragment_MembersInjector implements MembersInjector<EmailSmsChallengeFragment> {
    private final Provider<AppType> appType;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SupportEmailHandler> supportEmailHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EmailSmsChallengeFragment> create(Provider<BaseFragmentSingletons> provider, Provider<SupportEmailHandler> provider2, Provider<EventLogger> provider3, Provider<AppType> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAppType(EmailSmsChallengeFragment emailSmsChallengeFragment, AppType appType) {
        INSTANCE.injectAppType(emailSmsChallengeFragment, appType);
    }

    @JvmStatic
    public static final void injectEventLogger(EmailSmsChallengeFragment emailSmsChallengeFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(emailSmsChallengeFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectSupportEmailHandler(EmailSmsChallengeFragment emailSmsChallengeFragment, SupportEmailHandler supportEmailHandler) {
        INSTANCE.injectSupportEmailHandler(emailSmsChallengeFragment, supportEmailHandler);
    }

    public EmailSmsChallengeFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<SupportEmailHandler> supportEmailHandler, Provider<EventLogger> eventLogger, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.singletons = singletons;
        this.supportEmailHandler = supportEmailHandler;
        this.eventLogger = eventLogger;
        this.appType = appType;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EmailSmsChallengeFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler.get();
        Intrinsics.checkNotNullExpressionValue(supportEmailHandler, "get(...)");
        companion2.injectSupportEmailHandler(instance, supportEmailHandler);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        companion2.injectAppType(instance, appType);
    }

    /* compiled from: EmailSmsChallengeFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/challenge/EmailSmsChallengeFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "injectSupportEmailHandler", "", "instance", "injectEventLogger", "injectAppType", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EmailSmsChallengeFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<SupportEmailHandler> supportEmailHandler, Provider<EventLogger> eventLogger, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new EmailSmsChallengeFragment_MembersInjector(singletons, supportEmailHandler, eventLogger, appType);
        }

        @JvmStatic
        public final void injectSupportEmailHandler(EmailSmsChallengeFragment instance, SupportEmailHandler supportEmailHandler) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(supportEmailHandler, "supportEmailHandler");
            instance.setSupportEmailHandler(supportEmailHandler);
        }

        @JvmStatic
        public final void injectEventLogger(EmailSmsChallengeFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectAppType(EmailSmsChallengeFragment instance, AppType appType) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(appType, "appType");
            instance.setAppType(appType);
        }
    }
}
