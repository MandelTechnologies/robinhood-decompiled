package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.AccountMarketValues;
import com.robinhood.android.models.portfolio.AccountMarketValuesDao;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: AccountMarketValuesStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/android/models/portfolio/AccountMarketValuesDao;", "portfolioApi", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/portfolio/AccountMarketValuesDao;Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/store/StoreBundle;)V", "valuesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesStore$AccountMarketValuesRequest;", "Lcom/robinhood/android/models/portfolio/AccountMarketValues;", "valuesQuery", "Lcom/robinhood/android/moria/db/Query;", "streamMarketValues", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "", "type", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "displaySpan", "AccountMarketValuesRequest", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AccountMarketValuesStore extends Store {
    private final AccountMarketValuesDao dao;
    private final Endpoint<AccountMarketValuesRequest, AccountMarketValues> valuesEndpoint;
    private final Query<AccountMarketValuesRequest, AccountMarketValues> valuesQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountMarketValuesStore(AccountMarketValuesDao dao, PortfolioApi portfolioApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        AccountMarketValuesStore2 accountMarketValuesStore2 = new AccountMarketValuesStore2(dao);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.valuesEndpoint = companion.create(new AccountMarketValuesStore3(portfolioApi, null), logoutKillswitch, accountMarketValuesStore2, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.valuesQuery = Store.create$default(this, Query.INSTANCE, "queryAccountMarketValues", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountMarketValuesStore.valuesQuery$lambda$0(this.f$0, (AccountMarketValuesStore.AccountMarketValuesRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.AccountMarketValuesStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountMarketValuesStore.valuesQuery$lambda$1(this.f$0, (AccountMarketValuesStore.AccountMarketValuesRequest) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object valuesEndpoint$insert(AccountMarketValuesDao accountMarketValuesDao, AccountMarketValues accountMarketValues, Continuation continuation) {
        accountMarketValuesDao.insert(accountMarketValues);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow valuesQuery$lambda$0(AccountMarketValuesStore accountMarketValuesStore, AccountMarketValuesRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<AccountMarketValuesRequest, AccountMarketValues> endpoint = accountMarketValuesStore.valuesEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow valuesQuery$lambda$1(AccountMarketValuesStore accountMarketValuesStore, AccountMarketValuesRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.filterNotNull(accountMarketValuesStore.dao.streamValues(it.getAccountNumber(), it.getType(), it.getDisplaySpan()));
    }

    public final Flow<AccountMarketValues> streamMarketValues(String accountNumber, AccountMarketValuesType type2, String displaySpan) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
        return Context7.buffer$default(RxConvert.asFlow(this.valuesQuery.asObservable(new AccountMarketValuesRequest(accountNumber, type2, displaySpan))), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccountMarketValuesStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/AccountMarketValuesStore$AccountMarketValuesRequest;", "", "accountNumber", "", "type", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "displaySpan", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "getDisplaySpan", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class AccountMarketValuesRequest {
        private final String accountNumber;
        private final String displaySpan;
        private final AccountMarketValuesType type;

        public static /* synthetic */ AccountMarketValuesRequest copy$default(AccountMarketValuesRequest accountMarketValuesRequest, String str, AccountMarketValuesType accountMarketValuesType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountMarketValuesRequest.accountNumber;
            }
            if ((i & 2) != 0) {
                accountMarketValuesType = accountMarketValuesRequest.type;
            }
            if ((i & 4) != 0) {
                str2 = accountMarketValuesRequest.displaySpan;
            }
            return accountMarketValuesRequest.copy(str, accountMarketValuesType, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountMarketValuesType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplaySpan() {
            return this.displaySpan;
        }

        public final AccountMarketValuesRequest copy(String accountNumber, AccountMarketValuesType type2, String displaySpan) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
            return new AccountMarketValuesRequest(accountNumber, type2, displaySpan);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountMarketValuesRequest)) {
                return false;
            }
            AccountMarketValuesRequest accountMarketValuesRequest = (AccountMarketValuesRequest) other;
            return Intrinsics.areEqual(this.accountNumber, accountMarketValuesRequest.accountNumber) && this.type == accountMarketValuesRequest.type && Intrinsics.areEqual(this.displaySpan, accountMarketValuesRequest.displaySpan);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.type.hashCode()) * 31) + this.displaySpan.hashCode();
        }

        public String toString() {
            return "AccountMarketValuesRequest(accountNumber=" + this.accountNumber + ", type=" + this.type + ", displaySpan=" + this.displaySpan + ")";
        }

        public AccountMarketValuesRequest(String accountNumber, AccountMarketValuesType type2, String displaySpan) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(displaySpan, "displaySpan");
            this.accountNumber = accountNumber;
            this.type = type2;
            this.displaySpan = displaySpan;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final AccountMarketValuesType getType() {
            return this.type;
        }

        public final String getDisplaySpan() {
            return this.displaySpan;
        }
    }
}
