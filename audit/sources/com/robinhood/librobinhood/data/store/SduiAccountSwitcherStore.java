package com.robinhood.librobinhood.data.store;

import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import contracts.account_switcher.proto.p427v1.AccountSwitcherService;
import contracts.account_switcher.proto.p427v1.GetAccountSwitcherRequestDto;
import contracts.account_switcher.proto.p427v1.GetAccountSwitcherResponseDto;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: SduiAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/store/StoreBundle;)V", "accountOnboardingComponent", "Lmicrogram/android/inject/MicrogramComponent;", "accountSwitcherService", "Lcontracts/account_switcher/proto/v1/AccountSwitcherService;", "getAccountSwitcher", "Lcontracts/account_switcher/proto/v1/GetAccountSwitcherResponseDto;", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "(Lcontracts/account_switcher/proto/v1/SurfaceDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SduiAccountSwitcherStore extends Store {
    private final MicrogramComponent accountOnboardingComponent;
    private final AccountSwitcherService accountSwitcherService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiAccountSwitcherStore(@RootCoroutineScope CoroutineScope rootCoroutineScope, MicrogramComponent.Factory microgramComponentFactory, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, rootCoroutineScope, new RemoteMicrogramApplication("app-account-switcher", null, 2, null), null, 4, null);
        this.accountOnboardingComponent = microgramComponentCreate$default;
        this.accountSwitcherService = (AccountSwitcherService) microgramComponentCreate$default.getServiceLocator().getClient(AccountSwitcherService.class);
    }

    public final Object getAccountSwitcher(SurfaceDto surfaceDto, Continuation<? super GetAccountSwitcherResponseDto> continuation) {
        return this.accountSwitcherService.GetAccountSwitcher(new GetAccountSwitcherRequestDto(surfaceDto), continuation);
    }
}
