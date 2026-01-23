package com.robinhood.android.cash.transaction.p079ui.category;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class MerchantChangeCategoryDuxo_MembersInjector implements MembersInjector<MerchantChangeCategoryDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MerchantChangeCategoryDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MerchantChangeCategoryDuxo merchantChangeCategoryDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(merchantChangeCategoryDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(merchantChangeCategoryDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(merchantChangeCategoryDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MerchantChangeCategoryDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MerchantChangeCategoryDuxo_MembersInjector(provider, provider2, provider3);
    }
}
