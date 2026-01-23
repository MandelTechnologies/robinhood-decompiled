package com.robinhood.android.investFlow.confirmation;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.investFlow.submit.InvestFlowOrderSubmissionManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes17.dex */
public final class InvestFlowOrderConfirmationFragment_MembersInjector implements MembersInjector<InvestFlowOrderConfirmationFragment> {
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<InvestFlowOrderSubmissionManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;

    private InvestFlowOrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<InvestFlowOrderSubmissionManager> provider4) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.orderManagerProvider = provider4;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InvestFlowOrderConfirmationFragment investFlowOrderConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(investFlowOrderConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(investFlowOrderConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(investFlowOrderConfirmationFragment, this.pltManagerProvider.get());
        injectOrderManager(investFlowOrderConfirmationFragment, this.orderManagerProvider.get());
    }

    public static MembersInjector<InvestFlowOrderConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<InvestFlowOrderSubmissionManager> provider4) {
        return new InvestFlowOrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectOrderManager(InvestFlowOrderConfirmationFragment investFlowOrderConfirmationFragment, InvestFlowOrderSubmissionManager investFlowOrderSubmissionManager) {
        investFlowOrderConfirmationFragment.orderManager = investFlowOrderSubmissionManager;
    }
}
