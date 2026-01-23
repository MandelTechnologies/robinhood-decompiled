package com.robinhood.android.optionsupgrade;

import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.store.user.UserStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingApprovedTradesFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingApprovedTradesFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingApprovedTradesFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionOnboardingApprovedTradesFragment_MembersInjector implements MembersInjector<OptionOnboardingApprovedTradesFragment> {
    private final Provider<AccountDisplayNameStore> accountDisplayNameStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BaseFragmentSingletons> singletons;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OptionOnboardingApprovedTradesFragment> create(Provider<BaseFragmentSingletons> provider, Provider<AccountDisplayNameStore> provider2, Provider<ExperimentsStore> provider3, Provider<UserStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAccountDisplayNameStore(OptionOnboardingApprovedTradesFragment optionOnboardingApprovedTradesFragment, AccountDisplayNameStore accountDisplayNameStore) {
        INSTANCE.injectAccountDisplayNameStore(optionOnboardingApprovedTradesFragment, accountDisplayNameStore);
    }

    @JvmStatic
    public static final void injectExperimentsStore(OptionOnboardingApprovedTradesFragment optionOnboardingApprovedTradesFragment, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(optionOnboardingApprovedTradesFragment, experimentsStore);
    }

    @JvmStatic
    public static final void injectUserStore(OptionOnboardingApprovedTradesFragment optionOnboardingApprovedTradesFragment, UserStore userStore) {
        INSTANCE.injectUserStore(optionOnboardingApprovedTradesFragment, userStore);
    }

    public OptionOnboardingApprovedTradesFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<AccountDisplayNameStore> accountDisplayNameStore, Provider<ExperimentsStore> experimentsStore, Provider<UserStore> userStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.singletons = singletons;
        this.accountDisplayNameStore = accountDisplayNameStore;
        this.experimentsStore = experimentsStore;
        this.userStore = userStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionOnboardingApprovedTradesFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        AccountDisplayNameStore accountDisplayNameStore = this.accountDisplayNameStore.get();
        Intrinsics.checkNotNullExpressionValue(accountDisplayNameStore, "get(...)");
        companion2.injectAccountDisplayNameStore(instance, accountDisplayNameStore);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        companion2.injectUserStore(instance, userStore);
    }

    /* compiled from: OptionOnboardingApprovedTradesFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingApprovedTradesFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingApprovedTradesFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "injectAccountDisplayNameStore", "", "instance", "injectExperimentsStore", "injectUserStore", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OptionOnboardingApprovedTradesFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<AccountDisplayNameStore> accountDisplayNameStore, Provider<ExperimentsStore> experimentsStore, Provider<UserStore> userStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            return new OptionOnboardingApprovedTradesFragment_MembersInjector(singletons, accountDisplayNameStore, experimentsStore, userStore);
        }

        @JvmStatic
        public final void injectAccountDisplayNameStore(OptionOnboardingApprovedTradesFragment instance, AccountDisplayNameStore accountDisplayNameStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountDisplayNameStore, "accountDisplayNameStore");
            instance.setAccountDisplayNameStore(accountDisplayNameStore);
        }

        @JvmStatic
        public final void injectExperimentsStore(OptionOnboardingApprovedTradesFragment instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectUserStore(OptionOnboardingApprovedTradesFragment instance, UserStore userStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            instance.setUserStore(userStore);
        }
    }
}
