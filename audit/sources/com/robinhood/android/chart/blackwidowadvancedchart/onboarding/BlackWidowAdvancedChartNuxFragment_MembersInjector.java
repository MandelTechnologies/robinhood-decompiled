package com.robinhood.android.chart.blackwidowadvancedchart.onboarding;

import com.robinhood.android.chart.blackwidowadvancedchart.BwChartPrefModule4;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartNuxFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartNuxFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartNuxFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "bwHasVisitedChartSharedPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartNuxFragment_MembersInjector implements MembersInjector<BlackWidowAdvancedChartNuxFragment> {
    private final Provider<BooleanPreference> bwHasVisitedChartSharedPref;
    private final Provider<BwWebViewManager> bwWebViewManager;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<BlackWidowAdvancedChartNuxFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<BwWebViewManager> provider3, Provider<BooleanPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    @BwChartPrefModule4
    public static final void injectBwHasVisitedChartSharedPref(BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectBwHasVisitedChartSharedPref(blackWidowAdvancedChartNuxFragment, booleanPreference);
    }

    @JvmStatic
    public static final void injectBwWebViewManager(BlackWidowAdvancedChartNuxFragment blackWidowAdvancedChartNuxFragment, BwWebViewManager bwWebViewManager) {
        INSTANCE.injectBwWebViewManager(blackWidowAdvancedChartNuxFragment, bwWebViewManager);
    }

    public BlackWidowAdvancedChartNuxFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<BwWebViewManager> bwWebViewManager, Provider<BooleanPreference> bwHasVisitedChartSharedPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Intrinsics.checkNotNullParameter(bwHasVisitedChartSharedPref, "bwHasVisitedChartSharedPref");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.bwWebViewManager = bwWebViewManager;
        this.bwHasVisitedChartSharedPref = bwHasVisitedChartSharedPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BlackWidowAdvancedChartNuxFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        GenericComposeFragment_MembersInjector.Companion companion2 = GenericComposeFragment_MembersInjector.INSTANCE;
        GenericComposeSingletons genericComposeSingletons = this.genericComposeSingletons.get();
        Intrinsics.checkNotNullExpressionValue(genericComposeSingletons, "get(...)");
        companion2.injectGenericComposeSingletons(instance, genericComposeSingletons);
        Companion companion3 = INSTANCE;
        BwWebViewManager bwWebViewManager = this.bwWebViewManager.get();
        Intrinsics.checkNotNullExpressionValue(bwWebViewManager, "get(...)");
        companion3.injectBwWebViewManager(instance, bwWebViewManager);
        BooleanPreference booleanPreference = this.bwHasVisitedChartSharedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion3.injectBwHasVisitedChartSharedPref(instance, booleanPreference);
    }

    /* compiled from: BlackWidowAdvancedChartNuxFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartNuxFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/onboarding/BlackWidowAdvancedChartNuxFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "bwHasVisitedChartSharedPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectBwWebViewManager", "", "instance", "injectBwHasVisitedChartSharedPref", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<BlackWidowAdvancedChartNuxFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<BwWebViewManager> bwWebViewManager, Provider<BooleanPreference> bwHasVisitedChartSharedPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            Intrinsics.checkNotNullParameter(bwHasVisitedChartSharedPref, "bwHasVisitedChartSharedPref");
            return new BlackWidowAdvancedChartNuxFragment_MembersInjector(singletons, genericComposeSingletons, bwWebViewManager, bwHasVisitedChartSharedPref);
        }

        @JvmStatic
        public final void injectBwWebViewManager(BlackWidowAdvancedChartNuxFragment instance, BwWebViewManager bwWebViewManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
            instance.setBwWebViewManager(bwWebViewManager);
        }

        @JvmStatic
        @BwChartPrefModule4
        public final void injectBwHasVisitedChartSharedPref(BlackWidowAdvancedChartNuxFragment instance, BooleanPreference bwHasVisitedChartSharedPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(bwHasVisitedChartSharedPref, "bwHasVisitedChartSharedPref");
            instance.setBwHasVisitedChartSharedPref(bwHasVisitedChartSharedPref);
        }
    }
}
