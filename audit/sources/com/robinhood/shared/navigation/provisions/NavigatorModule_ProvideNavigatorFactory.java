package com.robinhood.shared.navigation.provisions;

import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.ResolverNotFoundHandler;
import com.robinhood.android.performancelogger.PerformanceLogger;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigatorModule_ProvideNavigatorFactory.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bd\u0012#\u0010\u0003\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\u0002\b\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R+\u0010\u0003\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\u0002\b\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/navigation/provisions/NavigatorModule_ProvideNavigatorFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/navigation/Navigator;", "navigationResolverSuppliers", "Ljavax/inject/Provider;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "resolverNotFoundHandler", "Lcom/robinhood/android/navigation/ResolverNotFoundHandler;", "deepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "eventLogger", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-navigation-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class NavigatorModule_ProvideNavigatorFactory implements Factory<Navigator> {
    private final Provider<DeepLinkResolver> deepLinkResolver;
    private final Provider<DeeplinkEventLogger> eventLogger;
    private final Provider<Map<String, Function0<NavigationResolver>>> navigationResolverSuppliers;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<ResolverNotFoundHandler> resolverNotFoundHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final NavigatorModule_ProvideNavigatorFactory create(Provider<Map<String, Function0<NavigationResolver>>> provider, Provider<PerformanceLogger> provider2, Provider<ResolverNotFoundHandler> provider3, Provider<DeepLinkResolver> provider4, Provider<DeeplinkEventLogger> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final Navigator provideNavigator(Lazy<Map<String, Function0<NavigationResolver>>> lazy, PerformanceLogger performanceLogger, ResolverNotFoundHandler resolverNotFoundHandler, DeepLinkResolver deepLinkResolver, DeeplinkEventLogger deeplinkEventLogger) {
        return INSTANCE.provideNavigator(lazy, performanceLogger, resolverNotFoundHandler, deepLinkResolver, deeplinkEventLogger);
    }

    public NavigatorModule_ProvideNavigatorFactory(Provider<Map<String, Function0<NavigationResolver>>> navigationResolverSuppliers, Provider<PerformanceLogger> performanceLogger, Provider<ResolverNotFoundHandler> resolverNotFoundHandler, Provider<DeepLinkResolver> deepLinkResolver, Provider<DeeplinkEventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(navigationResolverSuppliers, "navigationResolverSuppliers");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(resolverNotFoundHandler, "resolverNotFoundHandler");
        Intrinsics.checkNotNullParameter(deepLinkResolver, "deepLinkResolver");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.navigationResolverSuppliers = navigationResolverSuppliers;
        this.performanceLogger = performanceLogger;
        this.resolverNotFoundHandler = resolverNotFoundHandler;
        this.deepLinkResolver = deepLinkResolver;
        this.eventLogger = eventLogger;
    }

    @Override // javax.inject.Provider
    public Navigator get() {
        Companion companion = INSTANCE;
        Lazy<Map<String, Function0<NavigationResolver>>> lazy = DoubleCheck.lazy(this.navigationResolverSuppliers);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        ResolverNotFoundHandler resolverNotFoundHandler = this.resolverNotFoundHandler.get();
        Intrinsics.checkNotNullExpressionValue(resolverNotFoundHandler, "get(...)");
        DeepLinkResolver deepLinkResolver = this.deepLinkResolver.get();
        Intrinsics.checkNotNullExpressionValue(deepLinkResolver, "get(...)");
        DeeplinkEventLogger deeplinkEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(deeplinkEventLogger, "get(...)");
        return companion.provideNavigator(lazy, performanceLogger, resolverNotFoundHandler, deepLinkResolver, deeplinkEventLogger);
    }

    /* compiled from: NavigatorModule_ProvideNavigatorFactory.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b¢\u0006\u0002\b\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007JM\u0010\u0015\u001a\u00020\u00162#\u0010\u0006\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b¢\u0006\u0002\b\f0\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/navigation/provisions/NavigatorModule_ProvideNavigatorFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/navigation/provisions/NavigatorModule_ProvideNavigatorFactory;", "navigationResolverSuppliers", "Ljavax/inject/Provider;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "Lkotlin/jvm/JvmSuppressWildcards;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "resolverNotFoundHandler", "Lcom/robinhood/android/navigation/ResolverNotFoundHandler;", "deepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "eventLogger", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "provideNavigator", "Lcom/robinhood/android/navigation/Navigator;", "Ldagger/Lazy;", "lib-navigation-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NavigatorModule_ProvideNavigatorFactory create(Provider<Map<String, Function0<NavigationResolver>>> navigationResolverSuppliers, Provider<PerformanceLogger> performanceLogger, Provider<ResolverNotFoundHandler> resolverNotFoundHandler, Provider<DeepLinkResolver> deepLinkResolver, Provider<DeeplinkEventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(navigationResolverSuppliers, "navigationResolverSuppliers");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(resolverNotFoundHandler, "resolverNotFoundHandler");
            Intrinsics.checkNotNullParameter(deepLinkResolver, "deepLinkResolver");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new NavigatorModule_ProvideNavigatorFactory(navigationResolverSuppliers, performanceLogger, resolverNotFoundHandler, deepLinkResolver, eventLogger);
        }

        @JvmStatic
        public final Navigator provideNavigator(Lazy<Map<String, Function0<NavigationResolver>>> navigationResolverSuppliers, PerformanceLogger performanceLogger, ResolverNotFoundHandler resolverNotFoundHandler, DeepLinkResolver deepLinkResolver, DeeplinkEventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(navigationResolverSuppliers, "navigationResolverSuppliers");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(resolverNotFoundHandler, "resolverNotFoundHandler");
            Intrinsics.checkNotNullParameter(deepLinkResolver, "deepLinkResolver");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Object objCheckNotNull = Preconditions.checkNotNull(NavigatorModule.INSTANCE.provideNavigator(navigationResolverSuppliers, performanceLogger, resolverNotFoundHandler, deepLinkResolver, eventLogger), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Navigator) objCheckNotNull;
        }
    }
}
