package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes20.dex */
public final class RecommendationsOrderConfirmationFragment_MembersInjector implements MembersInjector<RecommendationsOrderConfirmationFragment> {
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<RecommendationsOrderSubmissionManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;

    private RecommendationsOrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<RecommendationsOrderSubmissionManager> provider4) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.orderManagerProvider = provider4;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsOrderConfirmationFragment recommendationsOrderConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(recommendationsOrderConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(recommendationsOrderConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(recommendationsOrderConfirmationFragment, this.pltManagerProvider.get());
        injectOrderManager(recommendationsOrderConfirmationFragment, this.orderManagerProvider.get());
    }

    public static MembersInjector<RecommendationsOrderConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<RecommendationsOrderSubmissionManager> provider4) {
        return new RecommendationsOrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectOrderManager(RecommendationsOrderConfirmationFragment recommendationsOrderConfirmationFragment, RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager) {
        recommendationsOrderConfirmationFragment.orderManager = recommendationsOrderSubmissionManager;
    }
}
