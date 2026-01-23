package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecommendationsOrderSubmissionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "recsOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RecommendationsOrderSubmissionManager_Factory implements Factory<RecommendationsOrderSubmissionManager> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<RecommendationsOrderStore> recsOrderStore;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final RecommendationsOrderSubmissionManager_Factory create(Provider<RecommendationsOrderStore> provider, Provider<AccountProvider> provider2, Provider<SurveyManager3> provider3, Provider<CoroutineScope> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final RecommendationsOrderSubmissionManager newInstance(RecommendationsOrderStore recommendationsOrderStore, AccountProvider accountProvider, SurveyManager3 surveyManager3, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(recommendationsOrderStore, accountProvider, surveyManager3, coroutineScope);
    }

    public RecommendationsOrderSubmissionManager_Factory(Provider<RecommendationsOrderStore> recsOrderStore, Provider<AccountProvider> accountProvider, Provider<SurveyManager3> userLeapManager, Provider<CoroutineScope> coroutineScope) {
        Intrinsics.checkNotNullParameter(recsOrderStore, "recsOrderStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.recsOrderStore = recsOrderStore;
        this.accountProvider = accountProvider;
        this.userLeapManager = userLeapManager;
        this.coroutineScope = coroutineScope;
    }

    @Override // javax.inject.Provider
    public RecommendationsOrderSubmissionManager get() {
        Companion companion = INSTANCE;
        RecommendationsOrderStore recommendationsOrderStore = this.recsOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(recommendationsOrderStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(recommendationsOrderStore, accountProvider, surveyManager3, coroutineScope);
    }

    /* compiled from: RecommendationsOrderSubmissionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager_Factory;", "recsOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "newInstance", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecommendationsOrderSubmissionManager_Factory create(Provider<RecommendationsOrderStore> recsOrderStore, Provider<AccountProvider> accountProvider, Provider<SurveyManager3> userLeapManager, Provider<CoroutineScope> coroutineScope) {
            Intrinsics.checkNotNullParameter(recsOrderStore, "recsOrderStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new RecommendationsOrderSubmissionManager_Factory(recsOrderStore, accountProvider, userLeapManager, coroutineScope);
        }

        @JvmStatic
        public final RecommendationsOrderSubmissionManager newInstance(RecommendationsOrderStore recsOrderStore, AccountProvider accountProvider, SurveyManager3 userLeapManager, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(recsOrderStore, "recsOrderStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new RecommendationsOrderSubmissionManager(recsOrderStore, accountProvider, userLeapManager, coroutineScope);
        }
    }
}
