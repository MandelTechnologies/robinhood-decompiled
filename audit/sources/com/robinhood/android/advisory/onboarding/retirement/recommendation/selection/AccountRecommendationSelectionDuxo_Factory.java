package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountRecommendationSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo;", "advisoryOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AccountRecommendationSelectionDuxo_Factory implements Factory<AccountRecommendationSelectionDuxo> {
    private final Provider<AdvisoryOnboardingStore> advisoryOnboardingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RetirementOnboardingStore> retirementOnboardingStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AccountRecommendationSelectionDuxo_Factory create(Provider<AdvisoryOnboardingStore> provider, Provider<RetirementOnboardingStore> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AccountRecommendationSelectionDuxo newInstance(AdvisoryOnboardingStore advisoryOnboardingStore, RetirementOnboardingStore retirementOnboardingStore, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(advisoryOnboardingStore, retirementOnboardingStore, duxoBundle);
    }

    public AccountRecommendationSelectionDuxo_Factory(Provider<AdvisoryOnboardingStore> advisoryOnboardingStore, Provider<RetirementOnboardingStore> retirementOnboardingStore, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(advisoryOnboardingStore, "advisoryOnboardingStore");
        Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.advisoryOnboardingStore = advisoryOnboardingStore;
        this.retirementOnboardingStore = retirementOnboardingStore;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AccountRecommendationSelectionDuxo get() {
        Companion companion = INSTANCE;
        AdvisoryOnboardingStore advisoryOnboardingStore = this.advisoryOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryOnboardingStore, "get(...)");
        RetirementOnboardingStore retirementOnboardingStore = this.retirementOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(retirementOnboardingStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(advisoryOnboardingStore, retirementOnboardingStore, duxoBundle);
    }

    /* compiled from: AccountRecommendationSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo_Factory;", "advisoryOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountRecommendationSelectionDuxo_Factory create(Provider<AdvisoryOnboardingStore> advisoryOnboardingStore, Provider<RetirementOnboardingStore> retirementOnboardingStore, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(advisoryOnboardingStore, "advisoryOnboardingStore");
            Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountRecommendationSelectionDuxo_Factory(advisoryOnboardingStore, retirementOnboardingStore, duxoBundle);
        }

        @JvmStatic
        public final AccountRecommendationSelectionDuxo newInstance(AdvisoryOnboardingStore advisoryOnboardingStore, RetirementOnboardingStore retirementOnboardingStore, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(advisoryOnboardingStore, "advisoryOnboardingStore");
            Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AccountRecommendationSelectionDuxo(advisoryOnboardingStore, retirementOnboardingStore, duxoBundle);
        }
    }
}
