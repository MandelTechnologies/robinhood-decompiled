package com.robinhood.android.optionsexercise;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes17.dex */
public final class OptionExerciseConfirmationFragment_MembersInjector implements MembersInjector<OptionExerciseConfirmationFragment> {
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<HistoryNavigator> historyNavigatorProvider;
    private final Provider<OptionExerciseManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;

    private OptionExerciseConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<OptionExerciseManager> provider4, Provider<HistoryNavigator> provider5) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.orderManagerProvider = provider4;
        this.historyNavigatorProvider = provider5;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(optionExerciseConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(optionExerciseConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(optionExerciseConfirmationFragment, this.pltManagerProvider.get());
        injectOrderManager(optionExerciseConfirmationFragment, this.orderManagerProvider.get());
        injectHistoryNavigator(optionExerciseConfirmationFragment, this.historyNavigatorProvider.get());
    }

    public static MembersInjector<OptionExerciseConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<OptionExerciseManager> provider4, Provider<HistoryNavigator> provider5) {
        return new OptionExerciseConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectOrderManager(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment, OptionExerciseManager optionExerciseManager) {
        optionExerciseConfirmationFragment.orderManager = optionExerciseManager;
    }

    public static void injectHistoryNavigator(OptionExerciseConfirmationFragment optionExerciseConfirmationFragment, HistoryNavigator historyNavigator) {
        optionExerciseConfirmationFragment.historyNavigator = historyNavigator;
    }
}
