package com.robinhood.android.trade.directipo.p260ui.order;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes20.dex */
public final class DirectIpoOrderConfirmationFragment_MembersInjector implements MembersInjector<DirectIpoOrderConfirmationFragment> {
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<DirectIpoOrderSubmissionManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;

    private DirectIpoOrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<DirectIpoOrderSubmissionManager> provider4) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.orderManagerProvider = provider4;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoOrderConfirmationFragment directIpoOrderConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(directIpoOrderConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(directIpoOrderConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(directIpoOrderConfirmationFragment, this.pltManagerProvider.get());
        injectOrderManager(directIpoOrderConfirmationFragment, this.orderManagerProvider.get());
    }

    public static MembersInjector<DirectIpoOrderConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<DirectIpoOrderSubmissionManager> provider4) {
        return new DirectIpoOrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectOrderManager(DirectIpoOrderConfirmationFragment directIpoOrderConfirmationFragment, DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager) {
        directIpoOrderConfirmationFragment.orderManager = directIpoOrderSubmissionManager;
    }
}
