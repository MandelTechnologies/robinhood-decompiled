package com.robinhood.android.mcduckling.p180ui;

import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.mcduckling.CashManagementAccessManager;
import com.robinhood.android.rhy.waitlist.lib.prefs.RhyWaitlistFullscreenAnimationSeenPref;
import com.robinhood.librobinhood.data.store.McDucklingBadgeStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpendingTabFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/ui/SpendingTabFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/mcduckling/ui/SpendingTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "cashManagementAccessManager", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "mcDucklingBadgeStore", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "rhyWaitlistFullscreenAnimationSeenPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-tab-spending_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class SpendingTabFragment_MembersInjector implements MembersInjector<SpendingTabFragment> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CashManagementAccessManager> cashManagementAccessManager;
    private final Provider<McDucklingBadgeStore> mcDucklingBadgeStore;
    private final Provider<BooleanPreference> rhyWaitlistFullscreenAnimationSeenPref;
    private final Provider<BooleanPreference> shouldResetCashTabPref;
    private final Provider<BaseFragmentSingletons> singletons;

    @JvmStatic
    public static final MembersInjector<SpendingTabFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CashManagementAccessManager> provider2, Provider<McDucklingBadgeStore> provider3, Provider<BooleanPreference> provider4, Provider<BooleanPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectCashManagementAccessManager(SpendingTabFragment spendingTabFragment, CashManagementAccessManager cashManagementAccessManager) {
        INSTANCE.injectCashManagementAccessManager(spendingTabFragment, cashManagementAccessManager);
    }

    @JvmStatic
    public static final void injectMcDucklingBadgeStore(SpendingTabFragment spendingTabFragment, McDucklingBadgeStore mcDucklingBadgeStore) {
        INSTANCE.injectMcDucklingBadgeStore(spendingTabFragment, mcDucklingBadgeStore);
    }

    @JvmStatic
    @RhyWaitlistFullscreenAnimationSeenPref
    public static final void injectRhyWaitlistFullscreenAnimationSeenPref(SpendingTabFragment spendingTabFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectRhyWaitlistFullscreenAnimationSeenPref(spendingTabFragment, booleanPreference);
    }

    @JvmStatic
    @ShouldResetCashTabPref
    public static final void injectShouldResetCashTabPref(SpendingTabFragment spendingTabFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShouldResetCashTabPref(spendingTabFragment, booleanPreference);
    }

    public SpendingTabFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<CashManagementAccessManager> cashManagementAccessManager, Provider<McDucklingBadgeStore> mcDucklingBadgeStore, Provider<BooleanPreference> shouldResetCashTabPref, Provider<BooleanPreference> rhyWaitlistFullscreenAnimationSeenPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(cashManagementAccessManager, "cashManagementAccessManager");
        Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "mcDucklingBadgeStore");
        Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
        Intrinsics.checkNotNullParameter(rhyWaitlistFullscreenAnimationSeenPref, "rhyWaitlistFullscreenAnimationSeenPref");
        this.singletons = singletons;
        this.cashManagementAccessManager = cashManagementAccessManager;
        this.mcDucklingBadgeStore = mcDucklingBadgeStore;
        this.shouldResetCashTabPref = shouldResetCashTabPref;
        this.rhyWaitlistFullscreenAnimationSeenPref = rhyWaitlistFullscreenAnimationSeenPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SpendingTabFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        CashManagementAccessManager cashManagementAccessManager = this.cashManagementAccessManager.get();
        Intrinsics.checkNotNullExpressionValue(cashManagementAccessManager, "get(...)");
        companion2.injectCashManagementAccessManager(instance, cashManagementAccessManager);
        McDucklingBadgeStore mcDucklingBadgeStore = this.mcDucklingBadgeStore.get();
        Intrinsics.checkNotNullExpressionValue(mcDucklingBadgeStore, "get(...)");
        companion2.injectMcDucklingBadgeStore(instance, mcDucklingBadgeStore);
        BooleanPreference booleanPreference = this.shouldResetCashTabPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectShouldResetCashTabPref(instance, booleanPreference);
        BooleanPreference booleanPreference2 = this.rhyWaitlistFullscreenAnimationSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion2.injectRhyWaitlistFullscreenAnimationSeenPref(instance, booleanPreference2);
    }

    /* compiled from: SpendingTabFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/ui/SpendingTabFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/mcduckling/ui/SpendingTabFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "cashManagementAccessManager", "Lcom/robinhood/android/mcduckling/CashManagementAccessManager;", "mcDucklingBadgeStore", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "rhyWaitlistFullscreenAnimationSeenPref", "injectCashManagementAccessManager", "", "instance", "injectMcDucklingBadgeStore", "injectShouldResetCashTabPref", "injectRhyWaitlistFullscreenAnimationSeenPref", "feature-tab-spending_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<SpendingTabFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<CashManagementAccessManager> cashManagementAccessManager, Provider<McDucklingBadgeStore> mcDucklingBadgeStore, Provider<BooleanPreference> shouldResetCashTabPref, Provider<BooleanPreference> rhyWaitlistFullscreenAnimationSeenPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(cashManagementAccessManager, "cashManagementAccessManager");
            Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "mcDucklingBadgeStore");
            Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
            Intrinsics.checkNotNullParameter(rhyWaitlistFullscreenAnimationSeenPref, "rhyWaitlistFullscreenAnimationSeenPref");
            return new SpendingTabFragment_MembersInjector(singletons, cashManagementAccessManager, mcDucklingBadgeStore, shouldResetCashTabPref, rhyWaitlistFullscreenAnimationSeenPref);
        }

        @JvmStatic
        public final void injectCashManagementAccessManager(SpendingTabFragment instance, CashManagementAccessManager cashManagementAccessManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cashManagementAccessManager, "cashManagementAccessManager");
            instance.setCashManagementAccessManager(cashManagementAccessManager);
        }

        @JvmStatic
        public final void injectMcDucklingBadgeStore(SpendingTabFragment instance, McDucklingBadgeStore mcDucklingBadgeStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "mcDucklingBadgeStore");
            instance.setMcDucklingBadgeStore(mcDucklingBadgeStore);
        }

        @JvmStatic
        @ShouldResetCashTabPref
        public final void injectShouldResetCashTabPref(SpendingTabFragment instance, BooleanPreference shouldResetCashTabPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
            instance.setShouldResetCashTabPref(shouldResetCashTabPref);
        }

        @JvmStatic
        @RhyWaitlistFullscreenAnimationSeenPref
        public final void injectRhyWaitlistFullscreenAnimationSeenPref(SpendingTabFragment instance, BooleanPreference rhyWaitlistFullscreenAnimationSeenPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyWaitlistFullscreenAnimationSeenPref, "rhyWaitlistFullscreenAnimationSeenPref");
            instance.setRhyWaitlistFullscreenAnimationSeenPref(rhyWaitlistFullscreenAnimationSeenPref);
        }
    }
}
