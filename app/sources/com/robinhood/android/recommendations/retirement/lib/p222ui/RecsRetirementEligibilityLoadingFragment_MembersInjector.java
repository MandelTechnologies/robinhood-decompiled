package com.robinhood.android.recommendations.retirement.lib.p222ui;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.recommendations.retirement.RecsRetirementEligibilityStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.compose.app.GenericComposeFragment_MembersInjector;
import com.robinhood.compose.app.GenericComposeSingletons;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementEligibilityLoadingFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementEligibilityLoadingFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementEligibilityLoadingFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "recsRetirementEligibilityStore", "Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementEligibilityStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecsRetirementEligibilityLoadingFragment_MembersInjector implements MembersInjector<RecsRetirementEligibilityLoadingFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<GenericComposeSingletons> genericComposeSingletons;
    private final Provider<RecsRetirementEligibilityStore> recsRetirementEligibilityStore;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RecsRetirementEligibilityLoadingFragment> create(Provider<BaseFragmentSingletons> provider, Provider<GenericComposeSingletons> provider2, Provider<RecsRetirementEligibilityStore> provider3, Provider<AccountProvider> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectAccountProvider(RecsRetirementEligibilityLoadingFragment recsRetirementEligibilityLoadingFragment, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(recsRetirementEligibilityLoadingFragment, accountProvider);
    }

    @JvmStatic
    public static final void injectRecsRetirementEligibilityStore(RecsRetirementEligibilityLoadingFragment recsRetirementEligibilityLoadingFragment, RecsRetirementEligibilityStore recsRetirementEligibilityStore) {
        INSTANCE.injectRecsRetirementEligibilityStore(recsRetirementEligibilityLoadingFragment, recsRetirementEligibilityStore);
    }

    public RecsRetirementEligibilityLoadingFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<RecsRetirementEligibilityStore> recsRetirementEligibilityStore, Provider<AccountProvider> accountProvider) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
        Intrinsics.checkNotNullParameter(recsRetirementEligibilityStore, "recsRetirementEligibilityStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        this.singletons = singletons;
        this.genericComposeSingletons = genericComposeSingletons;
        this.recsRetirementEligibilityStore = recsRetirementEligibilityStore;
        this.accountProvider = accountProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecsRetirementEligibilityLoadingFragment instance) {
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
        RecsRetirementEligibilityStore recsRetirementEligibilityStore = this.recsRetirementEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(recsRetirementEligibilityStore, "get(...)");
        companion3.injectRecsRetirementEligibilityStore(instance, recsRetirementEligibilityStore);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion3.injectAccountProvider(instance, accountProvider);
    }

    /* compiled from: RecsRetirementEligibilityLoadingFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementEligibilityLoadingFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/recommendations/retirement/lib/ui/RecsRetirementEligibilityLoadingFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "genericComposeSingletons", "Lcom/robinhood/compose/app/GenericComposeSingletons;", "recsRetirementEligibilityStore", "Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementEligibilityStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "injectRecsRetirementEligibilityStore", "", "instance", "injectAccountProvider", "feature-lib-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RecsRetirementEligibilityLoadingFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<GenericComposeSingletons> genericComposeSingletons, Provider<RecsRetirementEligibilityStore> recsRetirementEligibilityStore, Provider<AccountProvider> accountProvider) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(genericComposeSingletons, "genericComposeSingletons");
            Intrinsics.checkNotNullParameter(recsRetirementEligibilityStore, "recsRetirementEligibilityStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            return new RecsRetirementEligibilityLoadingFragment_MembersInjector(singletons, genericComposeSingletons, recsRetirementEligibilityStore, accountProvider);
        }

        @JvmStatic
        public final void injectRecsRetirementEligibilityStore(RecsRetirementEligibilityLoadingFragment instance, RecsRetirementEligibilityStore recsRetirementEligibilityStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recsRetirementEligibilityStore, "recsRetirementEligibilityStore");
            instance.setRecsRetirementEligibilityStore(recsRetirementEligibilityStore);
        }

        @JvmStatic
        public final void injectAccountProvider(RecsRetirementEligibilityLoadingFragment instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }
    }
}
