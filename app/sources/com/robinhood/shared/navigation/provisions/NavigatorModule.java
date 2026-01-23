package com.robinhood.shared.navigation.provisions;

import com.robinhood.analytics.DeeplinkEventLogger;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.Navigation;
import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.ResolverNotFoundHandler;
import com.robinhood.android.performancelogger.PerformanceLogger;
import dagger.Lazy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigatorModule.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052 \b\u0001\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/navigation/provisions/NavigatorModule;", "", "<init>", "()V", "provideNavigator", "Lcom/robinhood/android/navigation/Navigator;", "navigationResolverSuppliers", "Ldagger/Lazy;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "resolverNotFoundHandler", "Lcom/robinhood/android/navigation/ResolverNotFoundHandler;", "deepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "eventLogger", "Lcom/robinhood/analytics/DeeplinkEventLogger;", "lib-navigation-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class NavigatorModule {
    public static final int $stable = 0;
    public static final NavigatorModule INSTANCE = new NavigatorModule();

    private NavigatorModule() {
    }

    public final Navigator provideNavigator(@Navigation Lazy<Map<String, Function0<NavigationResolver>>> navigationResolverSuppliers, PerformanceLogger performanceLogger, ResolverNotFoundHandler resolverNotFoundHandler, DeepLinkResolver deepLinkResolver, DeeplinkEventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(navigationResolverSuppliers, "navigationResolverSuppliers");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(resolverNotFoundHandler, "resolverNotFoundHandler");
        Intrinsics.checkNotNullParameter(deepLinkResolver, "deepLinkResolver");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        return new SharedNavigator(navigationResolverSuppliers, performanceLogger, resolverNotFoundHandler, deepLinkResolver, eventLogger);
    }
}
