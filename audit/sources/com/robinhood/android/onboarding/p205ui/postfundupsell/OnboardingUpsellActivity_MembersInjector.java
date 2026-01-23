package com.robinhood.android.onboarding.p205ui.postfundupsell;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.onboarding.p205ui.postfundupsell.preferences.GoldNativeFundingUpsellSourcePref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingUpsellActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldNativeFundingUpsellSourcePref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OnboardingUpsellActivity_MembersInjector implements MembersInjector<OnboardingUpsellActivity> {
    private final Provider<CardManager> cardManager;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<StringPreference> goldNativeFundingUpsellSourcePref;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OnboardingUpsellActivity> create(Provider<BaseActivitySingletons> provider, Provider<CardManager> provider2, Provider<ExperimentsStore> provider3, Provider<StringPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectCardManager(OnboardingUpsellActivity onboardingUpsellActivity, CardManager cardManager) {
        INSTANCE.injectCardManager(onboardingUpsellActivity, cardManager);
    }

    @JvmStatic
    public static final void injectExperimentsStore(OnboardingUpsellActivity onboardingUpsellActivity, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(onboardingUpsellActivity, experimentsStore);
    }

    @JvmStatic
    @GoldNativeFundingUpsellSourcePref
    public static final void injectGoldNativeFundingUpsellSourcePref(OnboardingUpsellActivity onboardingUpsellActivity, StringPreference stringPreference) {
        INSTANCE.injectGoldNativeFundingUpsellSourcePref(onboardingUpsellActivity, stringPreference);
    }

    public OnboardingUpsellActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<CardManager> cardManager, Provider<ExperimentsStore> experimentsStore, Provider<StringPreference> goldNativeFundingUpsellSourcePref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldNativeFundingUpsellSourcePref, "goldNativeFundingUpsellSourcePref");
        this.singletons = singletons;
        this.cardManager = cardManager;
        this.experimentsStore = experimentsStore;
        this.goldNativeFundingUpsellSourcePref = goldNativeFundingUpsellSourcePref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnboardingUpsellActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        CardManager cardManager = this.cardManager.get();
        Intrinsics.checkNotNullExpressionValue(cardManager, "get(...)");
        companion2.injectCardManager(instance, cardManager);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        StringPreference stringPreference = this.goldNativeFundingUpsellSourcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectGoldNativeFundingUpsellSourcePref(instance, stringPreference);
    }

    /* compiled from: OnboardingUpsellActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "goldNativeFundingUpsellSourcePref", "Lcom/robinhood/prefs/StringPreference;", "injectCardManager", "", "instance", "injectExperimentsStore", "injectGoldNativeFundingUpsellSourcePref", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OnboardingUpsellActivity> create(Provider<BaseActivitySingletons> singletons, Provider<CardManager> cardManager, Provider<ExperimentsStore> experimentsStore, Provider<StringPreference> goldNativeFundingUpsellSourcePref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(goldNativeFundingUpsellSourcePref, "goldNativeFundingUpsellSourcePref");
            return new OnboardingUpsellActivity_MembersInjector(singletons, cardManager, experimentsStore, goldNativeFundingUpsellSourcePref);
        }

        @JvmStatic
        public final void injectCardManager(OnboardingUpsellActivity instance, CardManager cardManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cardManager, "cardManager");
            instance.setCardManager(cardManager);
        }

        @JvmStatic
        public final void injectExperimentsStore(OnboardingUpsellActivity instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        @GoldNativeFundingUpsellSourcePref
        public final void injectGoldNativeFundingUpsellSourcePref(OnboardingUpsellActivity instance, StringPreference goldNativeFundingUpsellSourcePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldNativeFundingUpsellSourcePref, "goldNativeFundingUpsellSourcePref");
            instance.setGoldNativeFundingUpsellSourcePref(goldNativeFundingUpsellSourcePref);
        }
    }
}
