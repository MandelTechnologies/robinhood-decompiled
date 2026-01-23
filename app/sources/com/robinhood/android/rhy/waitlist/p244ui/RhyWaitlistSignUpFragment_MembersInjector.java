package com.robinhood.android.rhy.waitlist.p244ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.rhy.waitlist.lib.prefs.RhyWaitlistFullscreenAnimationSeenPref;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyWaitlistSignUpFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyWaitlistFullscreenAnimationSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RhyWaitlistSignUpFragment_MembersInjector implements MembersInjector<RhyWaitlistSignUpFragment> {
    private final Provider<BonfireApi> bonfireApi;
    private final Provider<EventLogger> eventLogger;
    private final Provider<BooleanPreference> rhyWaitlistFullscreenAnimationSeenPref;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RhyWaitlistSignUpFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BonfireApi> provider2, Provider<EventLogger> provider3, Provider<BooleanPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectBonfireApi(RhyWaitlistSignUpFragment rhyWaitlistSignUpFragment, BonfireApi bonfireApi) {
        INSTANCE.injectBonfireApi(rhyWaitlistSignUpFragment, bonfireApi);
    }

    @JvmStatic
    public static final void injectEventLogger(RhyWaitlistSignUpFragment rhyWaitlistSignUpFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(rhyWaitlistSignUpFragment, eventLogger);
    }

    @JvmStatic
    @RhyWaitlistFullscreenAnimationSeenPref
    public static final void injectRhyWaitlistFullscreenAnimationSeenPref(RhyWaitlistSignUpFragment rhyWaitlistSignUpFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectRhyWaitlistFullscreenAnimationSeenPref(rhyWaitlistSignUpFragment, booleanPreference);
    }

    public RhyWaitlistSignUpFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BonfireApi> bonfireApi, Provider<EventLogger> eventLogger, Provider<BooleanPreference> rhyWaitlistFullscreenAnimationSeenPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(rhyWaitlistFullscreenAnimationSeenPref, "rhyWaitlistFullscreenAnimationSeenPref");
        this.singletons = singletons;
        this.bonfireApi = bonfireApi;
        this.eventLogger = eventLogger;
        this.rhyWaitlistFullscreenAnimationSeenPref = rhyWaitlistFullscreenAnimationSeenPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyWaitlistSignUpFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        BonfireApi bonfireApi = this.bonfireApi.get();
        Intrinsics.checkNotNullExpressionValue(bonfireApi, "get(...)");
        companion2.injectBonfireApi(instance, bonfireApi);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        BooleanPreference booleanPreference = this.rhyWaitlistFullscreenAnimationSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectRhyWaitlistFullscreenAnimationSeenPref(instance, booleanPreference);
    }

    /* compiled from: RhyWaitlistSignUpFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/rhy/waitlist/ui/RhyWaitlistSignUpFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "rhyWaitlistFullscreenAnimationSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectBonfireApi", "", "instance", "injectEventLogger", "injectRhyWaitlistFullscreenAnimationSeenPref", "feature-rhy-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RhyWaitlistSignUpFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BonfireApi> bonfireApi, Provider<EventLogger> eventLogger, Provider<BooleanPreference> rhyWaitlistFullscreenAnimationSeenPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(rhyWaitlistFullscreenAnimationSeenPref, "rhyWaitlistFullscreenAnimationSeenPref");
            return new RhyWaitlistSignUpFragment_MembersInjector(singletons, bonfireApi, eventLogger, rhyWaitlistFullscreenAnimationSeenPref);
        }

        @JvmStatic
        public final void injectBonfireApi(RhyWaitlistSignUpFragment instance, BonfireApi bonfireApi) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
            instance.setBonfireApi(bonfireApi);
        }

        @JvmStatic
        public final void injectEventLogger(RhyWaitlistSignUpFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        @RhyWaitlistFullscreenAnimationSeenPref
        public final void injectRhyWaitlistFullscreenAnimationSeenPref(RhyWaitlistSignUpFragment instance, BooleanPreference rhyWaitlistFullscreenAnimationSeenPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyWaitlistFullscreenAnimationSeenPref, "rhyWaitlistFullscreenAnimationSeenPref");
            instance.setRhyWaitlistFullscreenAnimationSeenPref(rhyWaitlistFullscreenAnimationSeenPref);
        }
    }
}
