package com.robinhood.android.optionsexercise.assignment;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class EarlyAssignmentOptionPickerDuxo_MembersInjector implements MembersInjector<EarlyAssignmentOptionPickerDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private EarlyAssignmentOptionPickerDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EarlyAssignmentOptionPickerDuxo earlyAssignmentOptionPickerDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(earlyAssignmentOptionPickerDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(earlyAssignmentOptionPickerDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(earlyAssignmentOptionPickerDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<EarlyAssignmentOptionPickerDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new EarlyAssignmentOptionPickerDuxo_MembersInjector(provider, provider2, provider3);
    }
}
