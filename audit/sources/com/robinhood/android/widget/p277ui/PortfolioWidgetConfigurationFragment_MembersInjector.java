package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.p088ui.RxPreferenceFragment_MembersInjector;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetConfigurationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "widgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetConfigurationFragment_MembersInjector implements MembersInjector<PortfolioWidgetConfigurationFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<PortfolioWidgetInfoPref> widgetInfoPref;

    @JvmStatic
    public static final MembersInjector<PortfolioWidgetConfigurationFragment> create(Provider<DispatcherProvider> provider, Provider<RxGlobalErrorHandler> provider2, Provider<PortfolioWidgetInfoPref> provider3, Provider<RegionGateProvider> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectRegionGateProvider(PortfolioWidgetConfigurationFragment portfolioWidgetConfigurationFragment, RegionGateProvider regionGateProvider) {
        INSTANCE.injectRegionGateProvider(portfolioWidgetConfigurationFragment, regionGateProvider);
    }

    @JvmStatic
    public static final void injectWidgetInfoPref(PortfolioWidgetConfigurationFragment portfolioWidgetConfigurationFragment, PortfolioWidgetInfoPref portfolioWidgetInfoPref) {
        INSTANCE.injectWidgetInfoPref(portfolioWidgetConfigurationFragment, portfolioWidgetInfoPref);
    }

    public PortfolioWidgetConfigurationFragment_MembersInjector(Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<PortfolioWidgetInfoPref> widgetInfoPref, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.dispatcherProvider = dispatcherProvider;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
        this.widgetInfoPref = widgetInfoPref;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PortfolioWidgetConfigurationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        RxPreferenceFragment_MembersInjector.Companion companion = RxPreferenceFragment_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion.injectDispatcherProvider(instance, dispatcherProvider);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion.injectRxGlobalErrorHandler(instance, rxGlobalErrorHandler);
        Companion companion2 = INSTANCE;
        PortfolioWidgetInfoPref portfolioWidgetInfoPref = this.widgetInfoPref.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetInfoPref, "get(...)");
        companion2.injectWidgetInfoPref(instance, portfolioWidgetInfoPref);
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        companion2.injectRegionGateProvider(instance, regionGateProvider);
    }

    /* compiled from: PortfolioWidgetConfigurationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetConfigurationFragment;", "dispatcherProvider", "Ljavax/inject/Provider;", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "widgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "injectWidgetInfoPref", "", "instance", "injectRegionGateProvider", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PortfolioWidgetConfigurationFragment> create(Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<PortfolioWidgetInfoPref> widgetInfoPref, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new PortfolioWidgetConfigurationFragment_MembersInjector(dispatcherProvider, rxGlobalErrorHandler, widgetInfoPref, regionGateProvider);
        }

        @JvmStatic
        public final void injectWidgetInfoPref(PortfolioWidgetConfigurationFragment instance, PortfolioWidgetInfoPref widgetInfoPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
            instance.setWidgetInfoPref(widgetInfoPref);
        }

        @JvmStatic
        public final void injectRegionGateProvider(PortfolioWidgetConfigurationFragment instance, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            instance.setRegionGateProvider(regionGateProvider);
        }
    }
}
