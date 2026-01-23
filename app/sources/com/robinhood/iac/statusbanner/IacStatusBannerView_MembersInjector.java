package com.robinhood.iac.statusbanner;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacStatusBannerView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/iac/statusbanner/IacStatusBannerView;", "duxo", "Ljavax/inject/Provider;", "Lcom/robinhood/iac/statusbanner/IacStatusBannerDuxo;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class IacStatusBannerView_MembersInjector implements MembersInjector<IacStatusBannerView> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<IacStatusBannerDuxo> duxo;
    private final Provider<EventLogger> eventLogger;
    private final Provider<Navigator> navigator;

    @JvmStatic
    public static final MembersInjector<IacStatusBannerView> create(Provider<IacStatusBannerDuxo> provider, Provider<EventLogger> provider2, Provider<Navigator> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectDuxo(IacStatusBannerView iacStatusBannerView, IacStatusBannerDuxo iacStatusBannerDuxo) {
        INSTANCE.injectDuxo(iacStatusBannerView, iacStatusBannerDuxo);
    }

    @JvmStatic
    public static final void injectEventLogger(IacStatusBannerView iacStatusBannerView, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(iacStatusBannerView, eventLogger);
    }

    @JvmStatic
    public static final void injectNavigator(IacStatusBannerView iacStatusBannerView, Navigator navigator) {
        INSTANCE.injectNavigator(iacStatusBannerView, navigator);
    }

    public IacStatusBannerView_MembersInjector(Provider<IacStatusBannerDuxo> duxo, Provider<EventLogger> eventLogger, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.duxo = duxo;
        this.eventLogger = eventLogger;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(IacStatusBannerView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        IacStatusBannerDuxo iacStatusBannerDuxo = this.duxo.get();
        Intrinsics.checkNotNullExpressionValue(iacStatusBannerDuxo, "get(...)");
        companion.injectDuxo(instance, iacStatusBannerDuxo);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
    }

    /* compiled from: IacStatusBannerView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/iac/statusbanner/IacStatusBannerView;", "duxo", "Ljavax/inject/Provider;", "Lcom/robinhood/iac/statusbanner/IacStatusBannerDuxo;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectDuxo", "", "instance", "injectEventLogger", "injectNavigator", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<IacStatusBannerView> create(Provider<IacStatusBannerDuxo> duxo, Provider<EventLogger> eventLogger, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new IacStatusBannerView_MembersInjector(duxo, eventLogger, navigator);
        }

        @JvmStatic
        public final void injectDuxo(IacStatusBannerView instance, IacStatusBannerDuxo duxo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            instance.setDuxo(duxo);
        }

        @JvmStatic
        public final void injectEventLogger(IacStatusBannerView instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectNavigator(IacStatusBannerView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
