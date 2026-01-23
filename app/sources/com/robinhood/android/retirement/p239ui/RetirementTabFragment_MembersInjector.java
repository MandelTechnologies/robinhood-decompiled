package com.robinhood.android.retirement.p239ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.retirement.RetirementDashboardAccessManager;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementTabFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementTabFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/retirement/ui/RetirementTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "retirementDashboardAccessManager", "Lcom/robinhood/android/retirement/RetirementDashboardAccessManager;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RetirementTabFragment_MembersInjector implements MembersInjector<RetirementTabFragment> {
    private final Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore;
    private final Provider<RetirementDashboardAccessManager> retirementDashboardAccessManager;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RetirementTabFragment> create(Provider<BaseFragmentSingletons> provider, Provider<RetirementDashboardAccessManager> provider2, Provider<RetirementAccountSwitcherStore> provider3, Provider<SurveyManager3> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectRetirementAccountSwitcherStore(RetirementTabFragment retirementTabFragment, RetirementAccountSwitcherStore retirementAccountSwitcherStore) {
        INSTANCE.injectRetirementAccountSwitcherStore(retirementTabFragment, retirementAccountSwitcherStore);
    }

    @JvmStatic
    public static final void injectRetirementDashboardAccessManager(RetirementTabFragment retirementTabFragment, RetirementDashboardAccessManager retirementDashboardAccessManager) {
        INSTANCE.injectRetirementDashboardAccessManager(retirementTabFragment, retirementDashboardAccessManager);
    }

    @JvmStatic
    public static final void injectUserLeapManager(RetirementTabFragment retirementTabFragment, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(retirementTabFragment, surveyManager3);
    }

    public RetirementTabFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<RetirementDashboardAccessManager> retirementDashboardAccessManager, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<SurveyManager3> userLeapManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(retirementDashboardAccessManager, "retirementDashboardAccessManager");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.singletons = singletons;
        this.retirementDashboardAccessManager = retirementDashboardAccessManager;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.userLeapManager = userLeapManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RetirementTabFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        RetirementDashboardAccessManager retirementDashboardAccessManager = this.retirementDashboardAccessManager.get();
        Intrinsics.checkNotNullExpressionValue(retirementDashboardAccessManager, "get(...)");
        companion2.injectRetirementDashboardAccessManager(instance, retirementDashboardAccessManager);
        RetirementAccountSwitcherStore retirementAccountSwitcherStore = this.retirementAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementAccountSwitcherStore, "get(...)");
        companion2.injectRetirementAccountSwitcherStore(instance, retirementAccountSwitcherStore);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
    }

    /* compiled from: RetirementTabFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/RetirementTabFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/retirement/ui/RetirementTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "retirementDashboardAccessManager", "Lcom/robinhood/android/retirement/RetirementDashboardAccessManager;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "injectRetirementDashboardAccessManager", "", "instance", "injectRetirementAccountSwitcherStore", "injectUserLeapManager", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RetirementTabFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<RetirementDashboardAccessManager> retirementDashboardAccessManager, Provider<RetirementAccountSwitcherStore> retirementAccountSwitcherStore, Provider<SurveyManager3> userLeapManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(retirementDashboardAccessManager, "retirementDashboardAccessManager");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            return new RetirementTabFragment_MembersInjector(singletons, retirementDashboardAccessManager, retirementAccountSwitcherStore, userLeapManager);
        }

        @JvmStatic
        public final void injectRetirementDashboardAccessManager(RetirementTabFragment instance, RetirementDashboardAccessManager retirementDashboardAccessManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(retirementDashboardAccessManager, "retirementDashboardAccessManager");
            instance.setRetirementDashboardAccessManager(retirementDashboardAccessManager);
        }

        @JvmStatic
        public final void injectRetirementAccountSwitcherStore(RetirementTabFragment instance, RetirementAccountSwitcherStore retirementAccountSwitcherStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
            instance.setRetirementAccountSwitcherStore(retirementAccountSwitcherStore);
        }

        @JvmStatic
        public final void injectUserLeapManager(RetirementTabFragment instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }
    }
}
