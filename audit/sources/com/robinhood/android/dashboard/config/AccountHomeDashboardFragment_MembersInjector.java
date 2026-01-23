package com.robinhood.android.dashboard.config;

import com.robinhood.analytics.performance.startup.StartupPerformanceLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountHomeDashboardFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/dashboard/config/AccountHomeDashboardFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/dashboard/config/AccountHomeDashboardFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AccountHomeDashboardFragment_MembersInjector implements MembersInjector<AccountHomeDashboardFragment> {
    private final Provider<CrossSellLaunchManager> crossSellLaunchManager;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<Markwon> markwon;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<StartupPerformanceLogger> startupPerformanceLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<AccountHomeDashboardFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<Markwon> provider3, Provider<CrossSellLaunchManager> provider4, Provider<StartupPerformanceLogger> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectCrossSellLaunchManager(AccountHomeDashboardFragment accountHomeDashboardFragment, CrossSellLaunchManager crossSellLaunchManager) {
        INSTANCE.injectCrossSellLaunchManager(accountHomeDashboardFragment, crossSellLaunchManager);
    }

    @JvmStatic
    public static final void injectStartupPerformanceLogger(AccountHomeDashboardFragment accountHomeDashboardFragment, StartupPerformanceLogger startupPerformanceLogger) {
        INSTANCE.injectStartupPerformanceLogger(accountHomeDashboardFragment, startupPerformanceLogger);
    }

    public AccountHomeDashboardFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Markwon> markwon, Provider<CrossSellLaunchManager> crossSellLaunchManager, Provider<StartupPerformanceLogger> startupPerformanceLogger) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
        Intrinsics.checkNotNullParameter(startupPerformanceLogger, "startupPerformanceLogger");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.markwon = markwon;
        this.crossSellLaunchManager = crossSellLaunchManager;
        this.startupPerformanceLogger = startupPerformanceLogger;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AccountHomeDashboardFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        GenericActionHandlingFragment_MembersInjector.Companion companion3 = GenericActionHandlingFragment_MembersInjector.INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion3.injectMarkwon(instance, markwon);
        Companion companion4 = INSTANCE;
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager.get();
        Intrinsics.checkNotNullExpressionValue(crossSellLaunchManager, "get(...)");
        companion4.injectCrossSellLaunchManager(instance, crossSellLaunchManager);
        StartupPerformanceLogger startupPerformanceLogger = this.startupPerformanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(startupPerformanceLogger, "get(...)");
        companion4.injectStartupPerformanceLogger(instance, startupPerformanceLogger);
    }

    /* compiled from: AccountHomeDashboardFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/dashboard/config/AccountHomeDashboardFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/dashboard/config/AccountHomeDashboardFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "markwon", "Lio/noties/markwon/Markwon;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "startupPerformanceLogger", "Lcom/robinhood/analytics/performance/startup/StartupPerformanceLogger;", "injectCrossSellLaunchManager", "", "instance", "injectStartupPerformanceLogger", "feature-account-home_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<AccountHomeDashboardFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<Markwon> markwon, Provider<CrossSellLaunchManager> crossSellLaunchManager, Provider<StartupPerformanceLogger> startupPerformanceLogger) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            Intrinsics.checkNotNullParameter(startupPerformanceLogger, "startupPerformanceLogger");
            return new AccountHomeDashboardFragment_MembersInjector(singletons, genericComposeSingletons, markwon, crossSellLaunchManager, startupPerformanceLogger);
        }

        @JvmStatic
        public final void injectCrossSellLaunchManager(AccountHomeDashboardFragment instance, CrossSellLaunchManager crossSellLaunchManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
            instance.setCrossSellLaunchManager(crossSellLaunchManager);
        }

        @JvmStatic
        public final void injectStartupPerformanceLogger(AccountHomeDashboardFragment instance, StartupPerformanceLogger startupPerformanceLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(startupPerformanceLogger, "startupPerformanceLogger");
            instance.setStartupPerformanceLogger(startupPerformanceLogger);
        }
    }
}
