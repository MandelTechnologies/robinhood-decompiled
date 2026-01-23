package com.robinhood.android.account.store.settings;

import bonfire.proto.idl.accounts.p028v1.AccountNumbersRequestDto;
import bonfire.proto.idl.accounts.p028v1.AccountNumbersResponseDto;
import bonfire.proto.idl.accounts.p028v1.AccountsService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: AccountSettingsStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/account/store/settings/AccountSettingsStore;", "Lcom/robinhood/store/Store;", "accountsService", "Lbonfire/proto/idl/accounts/v1/AccountsService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/accounts/v1/AccountsService;Lcom/robinhood/store/StoreBundle;)V", "accountNumbersCache", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;", "accountNumbersEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/accounts/v1/AccountNumbersRequestDto;", "accountNumbersQuery", "Lcom/robinhood/android/moria/db/Query;", "streamAccountNumbers", "Lkotlinx/coroutines/flow/Flow;", "lib-store-account-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountSettingsStore extends Store {
    private final StateFlow2<AccountNumbersResponseDto> accountNumbersCache;
    private final Endpoint<AccountNumbersRequestDto, AccountNumbersResponseDto> accountNumbersEndpoint;
    private final Query<AccountNumbersRequestDto, AccountNumbersResponseDto> accountNumbersQuery;
    private final AccountsService accountsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsStore(AccountsService accountsService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountsService, "accountsService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountsService = accountsService;
        this.accountNumbersCache = StateFlow4.MutableStateFlow(null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        AccountSettingsStore2 accountSettingsStore2 = new AccountSettingsStore2(accountsService);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        AccountSettingsStore3 accountSettingsStore3 = new AccountSettingsStore3(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(3L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        Endpoint<AccountNumbersRequestDto, AccountNumbersResponseDto> endpointCreate = companion.create(accountSettingsStore2, logoutKillswitch, accountSettingsStore3, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.accountNumbersEndpoint = endpointCreate;
        this.accountNumbersQuery = Store.create$default(this, Query.INSTANCE, "accountNumbersQuery", CollectionsKt.listOf(new RefreshEach(new AccountSettingsStore4(endpointCreate))), new Function1() { // from class: com.robinhood.android.account.store.settings.AccountSettingsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSettingsStore.accountNumbersQuery$lambda$0(this.f$0, (AccountNumbersRequestDto) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow accountNumbersQuery$lambda$0(AccountSettingsStore accountSettingsStore, AccountNumbersRequestDto accountNumbersRequestDto) {
        Intrinsics.checkNotNullParameter(accountNumbersRequestDto, "<unused var>");
        return accountSettingsStore.accountNumbersCache;
    }

    public final Flow<AccountNumbersResponseDto> streamAccountNumbers() {
        return this.accountNumbersQuery.asFlow(new AccountNumbersRequestDto());
    }
}
