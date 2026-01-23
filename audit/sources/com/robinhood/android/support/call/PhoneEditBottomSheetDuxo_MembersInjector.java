package com.robinhood.android.support.call;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class PhoneEditBottomSheetDuxo_MembersInjector implements MembersInjector<PhoneEditBottomSheetDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PhoneEditBottomSheetDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PhoneEditBottomSheetDuxo phoneEditBottomSheetDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(phoneEditBottomSheetDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(phoneEditBottomSheetDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(phoneEditBottomSheetDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PhoneEditBottomSheetDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PhoneEditBottomSheetDuxo_MembersInjector(provider, provider2, provider3);
    }
}
