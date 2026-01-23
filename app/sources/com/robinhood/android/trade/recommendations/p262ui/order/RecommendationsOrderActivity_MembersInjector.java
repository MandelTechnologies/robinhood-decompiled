package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsPortfolioStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BN\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0004\u0012\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "recsRiskProfileStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "recsPortfolioStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsPortfolioStore;", "recsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RecommendationsOrderActivity_MembersInjector implements MembersInjector<RecommendationsOrderActivity> {
    private final Provider<RecommendationsPortfolioStore> recsPortfolioStore;
    private final Provider<RecommendationsQuestionnaireStore> recsQuestionnaireStore;
    private final Provider<RecommendationsRiskProfileStore> recsRiskProfileStore;
    private final Provider<BaseActivitySingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RecommendationsOrderActivity> create(Provider<BaseActivitySingletons> provider, Provider<RecommendationsRiskProfileStore> provider2, Provider<RecommendationsPortfolioStore> provider3, Provider<RecommendationsQuestionnaireStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectRecsPortfolioStore(RecommendationsOrderActivity recommendationsOrderActivity, Lazy<RecommendationsPortfolioStore> lazy) {
        INSTANCE.injectRecsPortfolioStore(recommendationsOrderActivity, lazy);
    }

    @JvmStatic
    public static final void injectRecsQuestionnaireStore(RecommendationsOrderActivity recommendationsOrderActivity, Lazy<RecommendationsQuestionnaireStore> lazy) {
        INSTANCE.injectRecsQuestionnaireStore(recommendationsOrderActivity, lazy);
    }

    @JvmStatic
    public static final void injectRecsRiskProfileStore(RecommendationsOrderActivity recommendationsOrderActivity, Lazy<RecommendationsRiskProfileStore> lazy) {
        INSTANCE.injectRecsRiskProfileStore(recommendationsOrderActivity, lazy);
    }

    public RecommendationsOrderActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<RecommendationsRiskProfileStore> recsRiskProfileStore, Provider<RecommendationsPortfolioStore> recsPortfolioStore, Provider<RecommendationsQuestionnaireStore> recsQuestionnaireStore) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(recsRiskProfileStore, "recsRiskProfileStore");
        Intrinsics.checkNotNullParameter(recsPortfolioStore, "recsPortfolioStore");
        Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
        this.singletons = singletons;
        this.recsRiskProfileStore = recsRiskProfileStore;
        this.recsPortfolioStore = recsPortfolioStore;
        this.recsQuestionnaireStore = recsQuestionnaireStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsOrderActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        Lazy<RecommendationsRiskProfileStore> lazy = DoubleCheck.lazy(this.recsRiskProfileStore);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        companion2.injectRecsRiskProfileStore(instance, lazy);
        Lazy<RecommendationsPortfolioStore> lazy2 = DoubleCheck.lazy(this.recsPortfolioStore);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        companion2.injectRecsPortfolioStore(instance, lazy2);
        Lazy<RecommendationsQuestionnaireStore> lazy3 = DoubleCheck.lazy(this.recsQuestionnaireStore);
        Intrinsics.checkNotNullExpressionValue(lazy3, "lazy(...)");
        companion2.injectRecsQuestionnaireStore(instance, lazy3);
    }

    /* compiled from: RecommendationsOrderActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\b2\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\f0\b2\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\f0\bH\u0007J#\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\u0014H\u0007J#\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\f0\u0014H\u0007J#\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\f0\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "recsRiskProfileStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;", "Lkotlin/jvm/JvmSuppressWildcards;", "recsPortfolioStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsPortfolioStore;", "recsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "injectRecsRiskProfileStore", "", "instance", "Ldagger/Lazy;", "injectRecsPortfolioStore", "injectRecsQuestionnaireStore", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RecommendationsOrderActivity> create(Provider<BaseActivitySingletons> singletons, Provider<RecommendationsRiskProfileStore> recsRiskProfileStore, Provider<RecommendationsPortfolioStore> recsPortfolioStore, Provider<RecommendationsQuestionnaireStore> recsQuestionnaireStore) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(recsRiskProfileStore, "recsRiskProfileStore");
            Intrinsics.checkNotNullParameter(recsPortfolioStore, "recsPortfolioStore");
            Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
            return new RecommendationsOrderActivity_MembersInjector(singletons, recsRiskProfileStore, recsPortfolioStore, recsQuestionnaireStore);
        }

        @JvmStatic
        public final void injectRecsRiskProfileStore(RecommendationsOrderActivity instance, Lazy<RecommendationsRiskProfileStore> recsRiskProfileStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recsRiskProfileStore, "recsRiskProfileStore");
            instance.setRecsRiskProfileStore(recsRiskProfileStore);
        }

        @JvmStatic
        public final void injectRecsPortfolioStore(RecommendationsOrderActivity instance, Lazy<RecommendationsPortfolioStore> recsPortfolioStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recsPortfolioStore, "recsPortfolioStore");
            instance.setRecsPortfolioStore(recsPortfolioStore);
        }

        @JvmStatic
        public final void injectRecsQuestionnaireStore(RecommendationsOrderActivity instance, Lazy<RecommendationsQuestionnaireStore> recsQuestionnaireStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
            instance.setRecsQuestionnaireStore(recsQuestionnaireStore);
        }
    }
}
