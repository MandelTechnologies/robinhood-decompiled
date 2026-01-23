package com.robinhood.android.common.recurring.trade.confirmation;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.recurring.trade.RecurringOrderManager;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes17.dex */
public final class RecurringOrderConfirmationFragment_MembersInjector implements MembersInjector<RecurringOrderConfirmationFragment> {
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<RecurringOrderManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;
    private final Provider<SurveyManager3> userLeapManagerProvider;

    private RecurringOrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<RecurringOrderManager> provider4, Provider<SurveyManager3> provider5) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.orderManagerProvider = provider4;
        this.userLeapManagerProvider = provider5;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecurringOrderConfirmationFragment recurringOrderConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(recurringOrderConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(recurringOrderConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(recurringOrderConfirmationFragment, this.pltManagerProvider.get());
        injectOrderManager(recurringOrderConfirmationFragment, this.orderManagerProvider.get());
        injectUserLeapManager(recurringOrderConfirmationFragment, this.userLeapManagerProvider.get());
    }

    public static MembersInjector<RecurringOrderConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<RecurringOrderManager> provider4, Provider<SurveyManager3> provider5) {
        return new RecurringOrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectOrderManager(RecurringOrderConfirmationFragment recurringOrderConfirmationFragment, RecurringOrderManager recurringOrderManager) {
        recurringOrderConfirmationFragment.orderManager = recurringOrderManager;
    }

    public static void injectUserLeapManager(RecurringOrderConfirmationFragment recurringOrderConfirmationFragment, SurveyManager3 surveyManager3) {
        recurringOrderConfirmationFragment.userLeapManager = surveyManager3;
    }
}
