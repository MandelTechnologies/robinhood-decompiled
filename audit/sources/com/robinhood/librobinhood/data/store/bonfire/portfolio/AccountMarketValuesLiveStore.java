package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.AccountMarketValuesLive;
import com.robinhood.android.models.portfolio.AccountMarketValuesLiveDao;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: AccountMarketValuesLiveStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLiveDao;", "portfolioApi", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/portfolio/AccountMarketValuesLiveDao;Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/store/StoreBundle;)V", "liveValuesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore$AccountMarketValuesLiveRequest;", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesLive;", "liveValuesQuery", "Lcom/robinhood/android/moria/db/Query;", "streamAccountMarketValuesLive", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "AccountMarketValuesLiveRequest", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AccountMarketValuesLiveStore extends Store {
    private final AccountMarketValuesLiveDao dao;
    private final Endpoint<AccountMarketValuesLiveRequest, AccountMarketValuesLive> liveValuesEndpoint;
    private final Query<AccountMarketValuesLiveRequest, AccountMarketValuesLive> liveValuesQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountMarketValuesLiveStore(AccountMarketValuesLiveDao dao, PortfolioApi portfolioApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.liveValuesEndpoint = companion.create(new AccountMarketValuesLiveStore2(portfolioApi, null), logoutKillswitch, new AccountMarketValuesLiveStore3(this, null), clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.liveValuesQuery = Store.create$default(this, Query.INSTANCE, "queryAccountMarketValuesLive", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountMarketValuesLiveStore.liveValuesQuery$lambda$0(this.f$0, (AccountMarketValuesLiveStore.AccountMarketValuesLiveRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesLiveStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountMarketValuesLiveStore.liveValuesQuery$lambda$1(this.f$0, (AccountMarketValuesLiveStore.AccountMarketValuesLiveRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow liveValuesQuery$lambda$0(AccountMarketValuesLiveStore accountMarketValuesLiveStore, AccountMarketValuesLiveRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<AccountMarketValuesLiveRequest, AccountMarketValuesLive> endpoint = accountMarketValuesLiveStore.liveValuesEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow liveValuesQuery$lambda$1(AccountMarketValuesLiveStore accountMarketValuesLiveStore, AccountMarketValuesLiveRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.filterNotNull(accountMarketValuesLiveStore.dao.streamAccountMarketValuesLive(request.getAccountNumber(), request.getDisplayCurrency()));
    }

    public static /* synthetic */ Flow streamAccountMarketValuesLive$default(AccountMarketValuesLiveStore accountMarketValuesLiveStore, String str, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 2) != 0) {
            displayCurrency = DisplayCurrency.USD;
        }
        return accountMarketValuesLiveStore.streamAccountMarketValuesLive(str, displayCurrency);
    }

    public final Flow<AccountMarketValuesLive> streamAccountMarketValuesLive(String accountNumber, DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return this.liveValuesQuery.asFlow(new AccountMarketValuesLiveRequest(accountNumber, displayCurrency));
    }

    /* compiled from: AccountMarketValuesLiveStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesLiveStore$AccountMarketValuesLiveRequest;", "", "accountNumber", "", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "getAccountNumber", "()Ljava/lang/String;", "getDisplayCurrency", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountMarketValuesLiveRequest {
        private final String accountNumber;
        private final DisplayCurrency displayCurrency;

        public static /* synthetic */ AccountMarketValuesLiveRequest copy$default(AccountMarketValuesLiveRequest accountMarketValuesLiveRequest, String str, DisplayCurrency displayCurrency, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountMarketValuesLiveRequest.accountNumber;
            }
            if ((i & 2) != 0) {
                displayCurrency = accountMarketValuesLiveRequest.displayCurrency;
            }
            return accountMarketValuesLiveRequest.copy(str, displayCurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final AccountMarketValuesLiveRequest copy(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            return new AccountMarketValuesLiveRequest(accountNumber, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountMarketValuesLiveRequest)) {
                return false;
            }
            AccountMarketValuesLiveRequest accountMarketValuesLiveRequest = (AccountMarketValuesLiveRequest) other;
            return Intrinsics.areEqual(this.accountNumber, accountMarketValuesLiveRequest.accountNumber) && this.displayCurrency == accountMarketValuesLiveRequest.displayCurrency;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.displayCurrency.hashCode();
        }

        public String toString() {
            return "AccountMarketValuesLiveRequest(accountNumber=" + this.accountNumber + ", displayCurrency=" + this.displayCurrency + ")";
        }

        public AccountMarketValuesLiveRequest(String accountNumber, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            this.accountNumber = accountNumber;
            this.displayCurrency = displayCurrency;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }
    }
}
