package com.robinhood.android.support.call.banner;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallBannerView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/support/call/banner/SupportCallBannerView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/support/call/banner/SupportCallBannerView;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "duxo", "Lcom/robinhood/android/support/call/banner/SupportCallBannerDuxo;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SupportCallBannerView_MembersInjector implements MembersInjector<SupportCallBannerView> {
    private final Provider<SupportCallBannerDuxo> duxo;
    private final Provider<EventLogger> eventLogger;
    private final Provider<Navigator> navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<SupportCallBannerView> create(Provider<EventLogger> provider, Provider<Navigator> provider2, Provider<SupportCallBannerDuxo> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectDuxo(SupportCallBannerView supportCallBannerView, SupportCallBannerDuxo supportCallBannerDuxo) {
        INSTANCE.injectDuxo(supportCallBannerView, supportCallBannerDuxo);
    }

    @JvmStatic
    public static final void injectEventLogger(SupportCallBannerView supportCallBannerView, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(supportCallBannerView, eventLogger);
    }

    @JvmStatic
    public static final void injectNavigator(SupportCallBannerView supportCallBannerView, Navigator navigator) {
        INSTANCE.injectNavigator(supportCallBannerView, navigator);
    }

    public SupportCallBannerView_MembersInjector(Provider<EventLogger> eventLogger, Provider<Navigator> navigator, Provider<SupportCallBannerDuxo> duxo) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        this.eventLogger = eventLogger;
        this.navigator = navigator;
        this.duxo = duxo;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SupportCallBannerView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
        SupportCallBannerDuxo supportCallBannerDuxo = this.duxo.get();
        Intrinsics.checkNotNullExpressionValue(supportCallBannerDuxo, "get(...)");
        companion.injectDuxo(instance, supportCallBannerDuxo);
    }

    /* compiled from: SupportCallBannerView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/support/call/banner/SupportCallBannerView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/support/call/banner/SupportCallBannerView;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/EventLogger;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "duxo", "Lcom/robinhood/android/support/call/banner/SupportCallBannerDuxo;", "injectEventLogger", "", "instance", "injectNavigator", "injectDuxo", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SupportCallBannerView> create(Provider<EventLogger> eventLogger, Provider<Navigator> navigator, Provider<SupportCallBannerDuxo> duxo) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            return new SupportCallBannerView_MembersInjector(eventLogger, navigator, duxo);
        }

        @JvmStatic
        public final void injectEventLogger(SupportCallBannerView instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectNavigator(SupportCallBannerView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectDuxo(SupportCallBannerView instance, SupportCallBannerDuxo duxo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            instance.setDuxo(duxo);
        }
    }
}
