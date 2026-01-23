package com.robinhood.android.securitycenter.p251ui.data.sharing;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class DataSharingPermissionsDuxo_MembersInjector implements MembersInjector<DataSharingPermissionsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DataSharingPermissionsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DataSharingPermissionsDuxo dataSharingPermissionsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(dataSharingPermissionsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(dataSharingPermissionsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(dataSharingPermissionsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DataSharingPermissionsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DataSharingPermissionsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
