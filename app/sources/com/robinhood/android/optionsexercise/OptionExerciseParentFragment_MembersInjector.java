package com.robinhood.android.optionsexercise;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.BaseOrderParentFragmentSingletons;
import com.robinhood.android.lib.trade.BaseOrderParentFragment_MembersInjector;
import com.robinhood.android.optionsexercise.pref.NeverShowEarlyAssignmentSplashPref;
import com.robinhood.android.optionsexercise.pref.NeverShowOptionExerciseSplashPref;
import com.robinhood.prefs.BooleanPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseParentFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "orderManager", "Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "neverShowAssignmentSplashPref", "Lcom/robinhood/prefs/BooleanPreference;", "neverShowExerciseSplashPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionExerciseParentFragment_MembersInjector implements MembersInjector<OptionExerciseParentFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BooleanPreference> neverShowAssignmentSplashPref;
    private final Provider<BooleanPreference> neverShowExerciseSplashPref;
    private final Provider<OptionExerciseManager> orderManager;
    private final Provider<BaseOrderParentFragmentSingletons> orderSingletons;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionExerciseParentFragment> create(Provider<BaseFragmentSingletons> provider, Provider<BaseOrderParentFragmentSingletons> provider2, Provider<OptionExerciseManager> provider3, Provider<AccountProvider> provider4, Provider<BooleanPreference> provider5, Provider<BooleanPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAccountProvider(OptionExerciseParentFragment optionExerciseParentFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(optionExerciseParentFragment, accountProvider);
    }

    @JvmStatic
    @NeverShowEarlyAssignmentSplashPref
    public static final void injectNeverShowAssignmentSplashPref(OptionExerciseParentFragment optionExerciseParentFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectNeverShowAssignmentSplashPref(optionExerciseParentFragment, booleanPreference);
    }

    @JvmStatic
    @NeverShowOptionExerciseSplashPref
    public static final void injectNeverShowExerciseSplashPref(OptionExerciseParentFragment optionExerciseParentFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectNeverShowExerciseSplashPref(optionExerciseParentFragment, booleanPreference);
    }

    @JvmStatic
    public static final void injectOrderManager(OptionExerciseParentFragment optionExerciseParentFragment, OptionExerciseManager optionExerciseManager) {
        INSTANCE.injectOrderManager(optionExerciseParentFragment, optionExerciseManager);
    }

    public OptionExerciseParentFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons, Provider<OptionExerciseManager> orderManager, Provider<AccountProvider> accountProvider, Provider<BooleanPreference> neverShowAssignmentSplashPref, Provider<BooleanPreference> neverShowExerciseSplashPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(neverShowAssignmentSplashPref, "neverShowAssignmentSplashPref");
        Intrinsics.checkNotNullParameter(neverShowExerciseSplashPref, "neverShowExerciseSplashPref");
        this.singletons = singletons;
        this.orderSingletons = orderSingletons;
        this.orderManager = orderManager;
        this.accountProvider = accountProvider;
        this.neverShowAssignmentSplashPref = neverShowAssignmentSplashPref;
        this.neverShowExerciseSplashPref = neverShowExerciseSplashPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionExerciseParentFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        BaseOrderParentFragment_MembersInjector.Companion companion2 = BaseOrderParentFragment_MembersInjector.INSTANCE;
        BaseOrderParentFragmentSingletons baseOrderParentFragmentSingletons = this.orderSingletons.get();
        Intrinsics.checkNotNullExpressionValue(baseOrderParentFragmentSingletons, "get(...)");
        companion2.injectOrderSingletons(instance, baseOrderParentFragmentSingletons);
        Companion companion3 = INSTANCE;
        OptionExerciseManager optionExerciseManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(optionExerciseManager, "get(...)");
        companion3.injectOrderManager(instance, optionExerciseManager);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion3.injectAccountProvider(instance, accountProvider);
        BooleanPreference booleanPreference = this.neverShowAssignmentSplashPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion3.injectNeverShowAssignmentSplashPref(instance, booleanPreference);
        BooleanPreference booleanPreference2 = this.neverShowExerciseSplashPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion3.injectNeverShowExerciseSplashPref(instance, booleanPreference2);
    }

    /* compiled from: OptionExerciseParentFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsexercise/OptionExerciseParentFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "orderSingletons", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragmentSingletons;", "orderManager", "Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "neverShowAssignmentSplashPref", "Lcom/robinhood/prefs/BooleanPreference;", "neverShowExerciseSplashPref", "injectOrderManager", "", "instance", "injectAccountProvider", "injectNeverShowAssignmentSplashPref", "injectNeverShowExerciseSplashPref", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionExerciseParentFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<BaseOrderParentFragmentSingletons> orderSingletons, Provider<OptionExerciseManager> orderManager, Provider<AccountProvider> accountProvider, Provider<BooleanPreference> neverShowAssignmentSplashPref, Provider<BooleanPreference> neverShowExerciseSplashPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(orderSingletons, "orderSingletons");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(neverShowAssignmentSplashPref, "neverShowAssignmentSplashPref");
            Intrinsics.checkNotNullParameter(neverShowExerciseSplashPref, "neverShowExerciseSplashPref");
            return new OptionExerciseParentFragment_MembersInjector(singletons, orderSingletons, orderManager, accountProvider, neverShowAssignmentSplashPref, neverShowExerciseSplashPref);
        }

        @JvmStatic
        public final void injectOrderManager(OptionExerciseParentFragment instance, OptionExerciseManager orderManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            instance.setOrderManager(orderManager);
        }

        @JvmStatic
        public final void injectAccountProvider(OptionExerciseParentFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        @NeverShowEarlyAssignmentSplashPref
        public final void injectNeverShowAssignmentSplashPref(OptionExerciseParentFragment instance, BooleanPreference neverShowAssignmentSplashPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(neverShowAssignmentSplashPref, "neverShowAssignmentSplashPref");
            instance.setNeverShowAssignmentSplashPref(neverShowAssignmentSplashPref);
        }

        @JvmStatic
        @NeverShowOptionExerciseSplashPref
        public final void injectNeverShowExerciseSplashPref(OptionExerciseParentFragment instance, BooleanPreference neverShowExerciseSplashPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(neverShowExerciseSplashPref, "neverShowExerciseSplashPref");
            instance.setNeverShowExerciseSplashPref(neverShowExerciseSplashPref);
        }
    }
}
