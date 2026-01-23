package com.robinhood.android.cash.rhy.tab.p077v2.onboarding;

import com.robinhood.android.common.mcduckling.prefs.ShouldResetCashTabPref;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.odyssey.lib.BaseSdActivitySingletons;
import com.robinhood.android.odyssey.lib.BaseSdActivity_MembersInjector;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OdysseyRhyUpgradeActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/OdysseyRhyUpgradeActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/OdysseyRhyUpgradeActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "sdSingletons", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "showRhyFundingBottomSheetPref", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OdysseyRhyUpgradeActivity_MembersInjector implements MembersInjector<OdysseyRhyUpgradeActivity> {
    private final Provider<ScreenProtectManager> screenProtectManager;
    private final Provider<BaseSdActivitySingletons> sdSingletons;
    private final Provider<BooleanPreference> shouldResetCashTabPref;
    private final Provider<BooleanPreference> showRhyFundingBottomSheetPref;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OdysseyRhyUpgradeActivity> create(Provider<BaseActivitySingletons> provider, Provider<BaseSdActivitySingletons> provider2, Provider<BooleanPreference> provider3, Provider<BooleanPreference> provider4, Provider<ScreenProtectManager> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectScreenProtectManager(OdysseyRhyUpgradeActivity odysseyRhyUpgradeActivity, ScreenProtectManager screenProtectManager) {
        INSTANCE.injectScreenProtectManager(odysseyRhyUpgradeActivity, screenProtectManager);
    }

    @JvmStatic
    @ShouldResetCashTabPref
    public static final void injectShouldResetCashTabPref(OdysseyRhyUpgradeActivity odysseyRhyUpgradeActivity, BooleanPreference booleanPreference) {
        INSTANCE.injectShouldResetCashTabPref(odysseyRhyUpgradeActivity, booleanPreference);
    }

    @JvmStatic
    @ShowRhyFundingBottomSheetPref
    public static final void injectShowRhyFundingBottomSheetPref(OdysseyRhyUpgradeActivity odysseyRhyUpgradeActivity, BooleanPreference booleanPreference) {
        INSTANCE.injectShowRhyFundingBottomSheetPref(odysseyRhyUpgradeActivity, booleanPreference);
    }

    public OdysseyRhyUpgradeActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<BaseSdActivitySingletons> sdSingletons, Provider<BooleanPreference> shouldResetCashTabPref, Provider<BooleanPreference> showRhyFundingBottomSheetPref, Provider<ScreenProtectManager> screenProtectManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(sdSingletons, "sdSingletons");
        Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
        Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
        Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
        this.singletons = singletons;
        this.sdSingletons = sdSingletons;
        this.shouldResetCashTabPref = shouldResetCashTabPref;
        this.showRhyFundingBottomSheetPref = showRhyFundingBottomSheetPref;
        this.screenProtectManager = screenProtectManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OdysseyRhyUpgradeActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        BaseSdActivity_MembersInjector.Companion companion2 = BaseSdActivity_MembersInjector.INSTANCE;
        BaseSdActivitySingletons baseSdActivitySingletons = this.sdSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseSdActivitySingletons, "get(...)");
        companion2.injectSdSingletons(instance, baseSdActivitySingletons);
        Companion companion3 = INSTANCE;
        BooleanPreference booleanPreference = this.shouldResetCashTabPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion3.injectShouldResetCashTabPref(instance, booleanPreference);
        BooleanPreference booleanPreference2 = this.showRhyFundingBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion3.injectShowRhyFundingBottomSheetPref(instance, booleanPreference2);
        ScreenProtectManager screenProtectManager = this.screenProtectManager.get();
        Intrinsics.checkNotNullExpressionValue(screenProtectManager, "get(...)");
        companion3.injectScreenProtectManager(instance, screenProtectManager);
    }

    /* compiled from: OdysseyRhyUpgradeActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/OdysseyRhyUpgradeActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/cash/rhy/tab/v2/onboarding/OdysseyRhyUpgradeActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "sdSingletons", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "shouldResetCashTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "showRhyFundingBottomSheetPref", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "injectShouldResetCashTabPref", "", "instance", "injectShowRhyFundingBottomSheetPref", "injectScreenProtectManager", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OdysseyRhyUpgradeActivity> create(Provider<BaseActivitySingletons> singletons, Provider<BaseSdActivitySingletons> sdSingletons, Provider<BooleanPreference> shouldResetCashTabPref, Provider<BooleanPreference> showRhyFundingBottomSheetPref, Provider<ScreenProtectManager> screenProtectManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(sdSingletons, "sdSingletons");
            Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
            Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            return new OdysseyRhyUpgradeActivity_MembersInjector(singletons, sdSingletons, shouldResetCashTabPref, showRhyFundingBottomSheetPref, screenProtectManager);
        }

        @JvmStatic
        @ShouldResetCashTabPref
        public final void injectShouldResetCashTabPref(OdysseyRhyUpgradeActivity instance, BooleanPreference shouldResetCashTabPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(shouldResetCashTabPref, "shouldResetCashTabPref");
            instance.setShouldResetCashTabPref(shouldResetCashTabPref);
        }

        @JvmStatic
        @ShowRhyFundingBottomSheetPref
        public final void injectShowRhyFundingBottomSheetPref(OdysseyRhyUpgradeActivity instance, BooleanPreference showRhyFundingBottomSheetPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showRhyFundingBottomSheetPref, "showRhyFundingBottomSheetPref");
            instance.setShowRhyFundingBottomSheetPref(showRhyFundingBottomSheetPref);
        }

        @JvmStatic
        public final void injectScreenProtectManager(OdysseyRhyUpgradeActivity instance, ScreenProtectManager screenProtectManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            instance.setScreenProtectManager(screenProtectManager);
        }
    }
}
