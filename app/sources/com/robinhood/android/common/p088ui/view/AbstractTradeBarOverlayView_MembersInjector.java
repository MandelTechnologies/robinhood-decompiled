package com.robinhood.android.common.p088ui.view;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.performancelogger.PerformanceLogger;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbstractTradeBarOverlayView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AbstractTradeBarOverlayView_MembersInjector implements MembersInjector<AbstractTradeBarOverlayView> {
    private final Provider<Navigator> navigator;
    private final Provider<PerformanceLogger> performanceLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<AbstractTradeBarOverlayView> create(Provider<Navigator> provider, Provider<PerformanceLogger> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectNavigator(AbstractTradeBarOverlayView abstractTradeBarOverlayView, Navigator navigator) {
        INSTANCE.injectNavigator(abstractTradeBarOverlayView, navigator);
    }

    @JvmStatic
    public static final void injectPerformanceLogger(AbstractTradeBarOverlayView abstractTradeBarOverlayView, PerformanceLogger performanceLogger) {
        INSTANCE.injectPerformanceLogger(abstractTradeBarOverlayView, performanceLogger);
    }

    public AbstractTradeBarOverlayView_MembersInjector(Provider<Navigator> navigator, Provider<PerformanceLogger> performanceLogger) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        this.navigator = navigator;
        this.performanceLogger = performanceLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AbstractTradeBarOverlayView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        companion.injectPerformanceLogger(instance, performanceLogger);
    }

    /* compiled from: AbstractTradeBarOverlayView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView;", "navigator", "Ljavax/inject/Provider;", "Lcom/robinhood/android/navigation/Navigator;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "injectNavigator", "", "instance", "injectPerformanceLogger", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<AbstractTradeBarOverlayView> create(Provider<Navigator> navigator, Provider<PerformanceLogger> performanceLogger) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            return new AbstractTradeBarOverlayView_MembersInjector(navigator, performanceLogger);
        }

        @JvmStatic
        public final void injectNavigator(AbstractTradeBarOverlayView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectPerformanceLogger(AbstractTradeBarOverlayView instance, PerformanceLogger performanceLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            instance.setPerformanceLogger(performanceLogger);
        }
    }
}
