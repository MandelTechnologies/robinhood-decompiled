package com.robinhood.android.eventcontracts.hub.p134v2;

import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostActivity_MembersInjector;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import dagger.MembersInjector;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractHubActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018Bf\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012A\u0010\u0006\u001a=\u00129\u00127\u0012.\u0012,\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u0010¢\u0006\u0002\b\u000f0\u0007¢\u0006\u0002\b\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000RI\u0010\u0006\u001a=\u00129\u00127\u0012.\u0012,\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bj\u0002`\u0010¢\u0006\u0002\b\u000f0\u0007¢\u0006\u0002\b\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/EventContractHubActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/eventcontracts/hub/v2/EventContractHubActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "navGraphs", "", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "Lkotlin/jvm/JvmSuppressWildcards;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "instance", "Companion", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventContractHubActivity_MembersInjector implements MembersInjector<EventContractHubActivity> {
    private final Provider<CrossSellLaunchManager> crossSellLaunchManager;
    private final Provider<Set<Function2<NavGraphBuilder, NavHostController, Unit>>> navGraphs;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EventContractHubActivity> create(Provider<BaseActivitySingletons> provider, Provider<Set<Function2<NavGraphBuilder, NavHostController, Unit>>> provider2, Provider<CrossSellLaunchManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectCrossSellLaunchManager(EventContractHubActivity eventContractHubActivity, CrossSellLaunchManager crossSellLaunchManager) {
        INSTANCE.injectCrossSellLaunchManager(eventContractHubActivity, crossSellLaunchManager);
    }

    public EventContractHubActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<Set<Function2<NavGraphBuilder, NavHostController, Unit>>> navGraphs, Provider<CrossSellLaunchManager> crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navGraphs, "navGraphs");
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
        this.singletons = singletons;
        this.navGraphs = navGraphs;
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EventContractHubActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        BaseComposeNavHostActivity_MembersInjector.Companion companion2 = BaseComposeNavHostActivity_MembersInjector.INSTANCE;
        Set<Function2<NavGraphBuilder, NavHostController, Unit>> set = this.navGraphs.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        companion2.injectNavGraphs(instance, set);
        Companion companion3 = INSTANCE;
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager.get();
        Intrinsics.checkNotNullExpressionValue(crossSellLaunchManager, "get(...)");
        companion3.injectCrossSellLaunchManager(instance, crossSellLaunchManager);
    }

    /* compiled from: EventContractHubActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2A\u0010\n\u001a=\u00129\u00127\u0012.\u0012,\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\fj\u0002`\u0014¢\u0006\u0002\b\u00130\u000b¢\u0006\u0002\b\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/EventContractHubActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/eventcontracts/hub/v2/EventContractHubActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "navGraphs", "", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "Lkotlin/jvm/JvmSuppressWildcards;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "injectCrossSellLaunchManager", "instance", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EventContractHubActivity> create(Provider<BaseActivitySingletons> singletons, Provider<Set<Function2<NavGraphBuilder, NavHostController, Unit>>> navGraphs, Provider<CrossSellLaunchManager> crossSellLaunchManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navGraphs, "navGraphs");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            return new EventContractHubActivity_MembersInjector(singletons, navGraphs, crossSellLaunchManager);
        }

        @JvmStatic
        public final void injectCrossSellLaunchManager(EventContractHubActivity instance, CrossSellLaunchManager crossSellLaunchManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            instance.setCrossSellLaunchManager(crossSellLaunchManager);
        }
    }
}
