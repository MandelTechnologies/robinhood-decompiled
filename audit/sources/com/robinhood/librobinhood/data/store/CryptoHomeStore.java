package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.librobinhood.data.store.CryptoHomeStore;
import com.robinhood.models.api.home.ApiCryptoHomeState;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.dao.CryptoHomeCtaButtonsDao;
import com.robinhood.models.crypto.dao.CryptoHomeDiscoverDao;
import com.robinhood.models.crypto.dao.CryptoHomeStateDao;
import com.robinhood.models.crypto.dao.CryptoTopCryptoDao;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover;
import com.robinhood.models.crypto.p314db.home.CryptoHomeState;
import com.robinhood.models.crypto.p314db.home.CryptoTopCrypto;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: CryptoHomeStore.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 62\u00020\u0001:\u000256BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0002J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bJ\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020(0\u001b2\u0006\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020\u001eJ\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020+0\u001b2\u0006\u00101\u001a\u00020'J\f\u00104\u001a\b\u0012\u0004\u0012\u00020.0\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001e0&\u0012\u0004\u0012\u00020(0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001e0&\u0012\u0004\u0012\u00020(0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020+0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020+0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020.0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020.0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoBonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoHomeDiscoverDao", "Lcom/robinhood/models/crypto/dao/CryptoHomeDiscoverDao;", "cryptoHomeStateDao", "Lcom/robinhood/models/crypto/dao/CryptoHomeStateDao;", "cryptoTopCryptoDao", "Lcom/robinhood/models/crypto/dao/CryptoTopCryptoDao;", "cryptoHomeCtaButtonsDao", "Lcom/robinhood/models/crypto/dao/CryptoHomeCtaButtonsDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/models/crypto/dao/CryptoHomeDiscoverDao;Lcom/robinhood/models/crypto/dao/CryptoHomeStateDao;Lcom/robinhood/models/crypto/dao/CryptoTopCryptoDao;Lcom/robinhood/models/crypto/dao/CryptoHomeCtaButtonsDao;)V", "getCryptoHomeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/home/ApiCryptoHomeState;", "streamCryptoHomeQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore$HomeRequest;", "Lcom/robinhood/models/crypto/db/home/CryptoHomeState;", "streamCryptoHome", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "force", "", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithoutCurrencyPair;", "getRegionalCryptoHomeEndpoint", "", "pollRegionalCryptoHomeQuery", "pollRegionalCryptoHome", "discoverCryptoEndpoint", "Lkotlin/Pair;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "Lcom/robinhood/models/crypto/db/home/CryptoHomeDiscover;", "cryptoHomeDiscoverQuery", "topCryptoEndpoint", "Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;", "cryptoTopCryptoQuery", "ctaButtonsEndpoint", "Lcom/robinhood/models/crypto/db/home/CryptoHomeCtaButtons;", "ctaButtonsQuery", "streamCryptoHomeDiscover", "instrumentDisplayType", "tradeable", "streamCryptoTopCrypto", "streamCryptoHomeCtaButtons", "HomeRequest", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoHomeStore extends Store {
    public static final String NO_INDIVIDUAL_ACCOUNT_NUMBER_STRING = "0";
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoBonfireApi cryptoBonfireApi;
    private final CryptoHomeCtaButtonsDao cryptoHomeCtaButtonsDao;
    private final CryptoHomeDiscoverDao cryptoHomeDiscoverDao;
    private final Query<Tuples2<? extends InstrumentDisplayType, Boolean>, CryptoHomeDiscover> cryptoHomeDiscoverQuery;
    private final CryptoHomeStateDao cryptoHomeStateDao;
    private final CryptoTopCryptoDao cryptoTopCryptoDao;
    private final Query<InstrumentDisplayType, CryptoTopCrypto> cryptoTopCryptoQuery;
    private final Endpoint<String, CryptoHomeCtaButtons> ctaButtonsEndpoint;
    private final Query<String, CryptoHomeCtaButtons> ctaButtonsQuery;
    private final Endpoint<Tuples2<InstrumentDisplayType, Boolean>, CryptoHomeDiscover> discoverCryptoEndpoint;
    private final Endpoint<String, ApiCryptoHomeState> getCryptoHomeEndpoint;
    private final Endpoint<Unit, ApiCryptoHomeState> getRegionalCryptoHomeEndpoint;
    private final Query<Unit, CryptoHomeState> pollRegionalCryptoHomeQuery;
    private final Query<HomeRequest, CryptoHomeState> streamCryptoHomeQuery;
    private final Endpoint<InstrumentDisplayType, CryptoTopCrypto> topCryptoEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeStore(StoreBundle storeBundle, CryptoAccountProvider cryptoAccountProvider, CryptoBonfireApi cryptoBonfireApi, CryptoHomeDiscoverDao cryptoHomeDiscoverDao, CryptoHomeStateDao cryptoHomeStateDao, CryptoTopCryptoDao cryptoTopCryptoDao, CryptoHomeCtaButtonsDao cryptoHomeCtaButtonsDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoBonfireApi, "cryptoBonfireApi");
        Intrinsics.checkNotNullParameter(cryptoHomeDiscoverDao, "cryptoHomeDiscoverDao");
        Intrinsics.checkNotNullParameter(cryptoHomeStateDao, "cryptoHomeStateDao");
        Intrinsics.checkNotNullParameter(cryptoTopCryptoDao, "cryptoTopCryptoDao");
        Intrinsics.checkNotNullParameter(cryptoHomeCtaButtonsDao, "cryptoHomeCtaButtonsDao");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoBonfireApi = cryptoBonfireApi;
        this.cryptoHomeDiscoverDao = cryptoHomeDiscoverDao;
        this.cryptoHomeStateDao = cryptoHomeStateDao;
        this.cryptoTopCryptoDao = cryptoTopCryptoDao;
        this.cryptoHomeCtaButtonsDao = cryptoHomeCtaButtonsDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        CryptoHomeState.Companion companion2 = CryptoHomeState.INSTANCE;
        this.getCryptoHomeEndpoint = companion.create(new CryptoHomeStore$getCryptoHomeEndpoint$1(this, null), logoutKillswitch, new CryptoHomeStore$getCryptoHomeEndpoint$2(this, null), clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion3 = Query.INSTANCE;
        this.streamCryptoHomeQuery = Store.create$default(this, companion3, "getCryptoHomeQuery", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHomeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeStore.streamCryptoHomeQuery$lambda$0(this.f$0, (CryptoHomeStore.HomeRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHomeStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeStore.streamCryptoHomeQuery$lambda$1(this.f$0, (CryptoHomeStore.HomeRequest) obj);
            }
        }, false, 8, null);
        Endpoint<Unit, ApiCryptoHomeState> endpointCreate = companion.create(new CryptoHomeStore$getRegionalCryptoHomeEndpoint$1(this, null), getLogoutKillswitch(), new CryptoHomeStore$getRegionalCryptoHomeEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getShortStaleTimeout(), storeBundle.getClock()));
        this.getRegionalCryptoHomeEndpoint = endpointCreate;
        this.pollRegionalCryptoHomeQuery = Store.create$default(this, companion3, "pollRegionalCryptoHomeQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoHomeStore$pollRegionalCryptoHomeQuery$1(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHomeStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeStore.pollRegionalCryptoHomeQuery$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        CryptoHomeStore$discoverCryptoEndpoint$1 cryptoHomeStore$discoverCryptoEndpoint$1 = new CryptoHomeStore$discoverCryptoEndpoint$1(cryptoHomeDiscoverDao);
        Endpoint<Tuples2<InstrumentDisplayType, Boolean>, CryptoHomeDiscover> endpointCreate2 = companion.create(new CryptoHomeStore$discoverCryptoEndpoint$2(this, null), getLogoutKillswitch(), cryptoHomeStore$discoverCryptoEndpoint$1, storeBundle.getClock(), new DefaultStaleDecider(CryptoHomeDiscover.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.discoverCryptoEndpoint = endpointCreate2;
        this.cryptoHomeDiscoverQuery = Store.create$default(this, companion3, "streamCryptoHomeDiscover", CollectionsKt.listOf(new RefreshEach(new CryptoHomeStore$cryptoHomeDiscoverQuery$1(endpointCreate2))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHomeStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeStore.cryptoHomeDiscoverQuery$lambda$4(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        CryptoHomeStore$topCryptoEndpoint$1 cryptoHomeStore$topCryptoEndpoint$1 = new CryptoHomeStore$topCryptoEndpoint$1(cryptoTopCryptoDao);
        Endpoint<InstrumentDisplayType, CryptoTopCrypto> endpointCreate3 = companion.create(new CryptoHomeStore$topCryptoEndpoint$2(this, null), getLogoutKillswitch(), cryptoHomeStore$topCryptoEndpoint$1, storeBundle.getClock(), new DefaultStaleDecider(CryptoTopCrypto.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.topCryptoEndpoint = endpointCreate3;
        this.cryptoTopCryptoQuery = Store.create$default(this, companion3, "streamCryptoTopCrypto", CollectionsKt.listOf(new RefreshEach(new CryptoHomeStore$cryptoTopCryptoQuery$1(endpointCreate3))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoHomeStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHomeStore.cryptoTopCryptoQuery$lambda$7(this.f$0, (InstrumentDisplayType) obj);
            }
        }, false, 8, null);
        CryptoHomeStore$ctaButtonsEndpoint$1 cryptoHomeStore$ctaButtonsEndpoint$1 = new CryptoHomeStore$ctaButtonsEndpoint$1(cryptoHomeCtaButtonsDao);
        Endpoint<String, CryptoHomeCtaButtons> endpointCreate4 = companion.create(new CryptoHomeStore$ctaButtonsEndpoint$2(this, null), getLogoutKillswitch(), cryptoHomeStore$ctaButtonsEndpoint$1, storeBundle.getClock(), new DefaultStaleDecider(CryptoHomeCtaButtons.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        this.ctaButtonsEndpoint = endpointCreate4;
        this.ctaButtonsQuery = Store.create$default(this, companion3, "streamCtaButtons", CollectionsKt.listOf(new RefreshEach(new CryptoHomeStore$ctaButtonsQuery$1(endpointCreate4))), new CryptoHomeStore$ctaButtonsQuery$2(cryptoHomeCtaButtonsDao), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamCryptoHomeQuery$lambda$0(CryptoHomeStore cryptoHomeStore, HomeRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(cryptoHomeStore.getCryptoHomeEndpoint, it.getAccountNumber(), it.getForce(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoHomeQuery$lambda$1(CryptoHomeStore cryptoHomeStore, HomeRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoHomeStore.cryptoHomeStateDao.getCryptoHomeStateForAccount(it.getAccountNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<CryptoHomeState> streamCryptoHome(String accountNumber, boolean force) {
        return this.streamCryptoHomeQuery.asFlow(new HomeRequest(force, accountNumber));
    }

    static /* synthetic */ Flow streamCryptoHome$default(CryptoHomeStore cryptoHomeStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cryptoHomeStore.streamCryptoHome(str, z);
    }

    public static /* synthetic */ Flow streamCryptoHome$default(CryptoHomeStore cryptoHomeStore, CryptoAccountSwitcherLocation.WithoutCurrencyPair withoutCurrencyPair, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cryptoHomeStore.streamCryptoHome(withoutCurrencyPair, z);
    }

    public final Flow<CryptoHomeState> streamCryptoHome(CryptoAccountSwitcherLocation.WithoutCurrencyPair location, boolean force) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.transformLatest(this.cryptoAccountProvider.streamAccountNumber(location), new CryptoHomeStore$streamCryptoHome$$inlined$flatMapLatest$1(null, this, force));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollRegionalCryptoHomeQuery$lambda$3(CryptoHomeStore cryptoHomeStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoHomeStore.cryptoHomeStateDao.getSingleHomeState();
    }

    public final Flow<CryptoHomeState> pollRegionalCryptoHome() {
        return this.pollRegionalCryptoHomeQuery.asFlow(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object discoverCryptoEndpoint$insert(CryptoHomeDiscoverDao cryptoHomeDiscoverDao, CryptoHomeDiscover cryptoHomeDiscover, Continuation continuation) {
        cryptoHomeDiscoverDao.insert(cryptoHomeDiscover);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cryptoHomeDiscoverQuery$lambda$4(CryptoHomeStore cryptoHomeStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return cryptoHomeStore.cryptoHomeDiscoverDao.getCryptoHomeDiscover((InstrumentDisplayType) tuples2.component1(), ((Boolean) tuples2.component2()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object topCryptoEndpoint$insert$5(CryptoTopCryptoDao cryptoTopCryptoDao, CryptoTopCrypto cryptoTopCrypto, Continuation continuation) {
        cryptoTopCryptoDao.insert(cryptoTopCrypto);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow cryptoTopCryptoQuery$lambda$7(CryptoHomeStore cryptoHomeStore, InstrumentDisplayType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoHomeStore.cryptoTopCryptoDao.getTopCrypto(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ctaButtonsEndpoint$insert$8(CryptoHomeCtaButtonsDao cryptoHomeCtaButtonsDao, CryptoHomeCtaButtons cryptoHomeCtaButtons, Continuation continuation) {
        cryptoHomeCtaButtonsDao.insert(cryptoHomeCtaButtons);
        return Unit.INSTANCE;
    }

    public final Flow<CryptoHomeDiscover> streamCryptoHomeDiscover(InstrumentDisplayType instrumentDisplayType, boolean tradeable) {
        Intrinsics.checkNotNullParameter(instrumentDisplayType, "instrumentDisplayType");
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.cryptoHomeDiscoverQuery, Tuples4.m3642to(instrumentDisplayType, Boolean.valueOf(tradeable)), new C337141(this.cryptoHomeDiscoverDao), false, 4, null);
    }

    /* compiled from: CryptoHomeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHomeStore$streamCryptoHomeDiscover$1 */
    /* synthetic */ class C337141 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C337141(Object obj) {
            super(1, obj, CryptoHomeDiscoverDao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return CryptoHomeStore.streamCryptoHomeDiscover$deleteAll((CryptoHomeDiscoverDao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamCryptoHomeDiscover$deleteAll(CryptoHomeDiscoverDao cryptoHomeDiscoverDao, Continuation continuation) {
        cryptoHomeDiscoverDao.deleteAll();
        return Unit.INSTANCE;
    }

    public final Flow<CryptoTopCrypto> streamCryptoTopCrypto(InstrumentDisplayType instrumentDisplayType) {
        Intrinsics.checkNotNullParameter(instrumentDisplayType, "instrumentDisplayType");
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.cryptoTopCryptoQuery, instrumentDisplayType, new C337151(this.cryptoTopCryptoDao), false, 4, null);
    }

    /* compiled from: CryptoHomeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHomeStore$streamCryptoTopCrypto$1 */
    /* synthetic */ class C337151 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C337151(Object obj) {
            super(1, obj, CryptoTopCryptoDao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return CryptoHomeStore.streamCryptoTopCrypto$deleteAll$10((CryptoTopCryptoDao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamCryptoTopCrypto$deleteAll$10(CryptoTopCryptoDao cryptoTopCryptoDao, Continuation continuation) {
        cryptoTopCryptoDao.deleteAll();
        return Unit.INSTANCE;
    }

    public final Flow<CryptoHomeCtaButtons> streamCryptoHomeCtaButtons() {
        return QueryKt.deleteAllOnRoomJsonExceptionFlow$default(this.ctaButtonsQuery, CryptoHomeCtaButtons.DEFAULT_ID, new C337131(this.cryptoHomeCtaButtonsDao), false, 4, null);
    }

    /* compiled from: CryptoHomeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoHomeStore$streamCryptoHomeCtaButtons$1 */
    /* synthetic */ class C337131 extends AdaptedFunctionReference implements Function1<Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C337131(Object obj) {
            super(1, obj, CryptoHomeCtaButtonsDao.class, "deleteAll", "deleteAll()V", 4);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return CryptoHomeStore.streamCryptoHomeCtaButtons$deleteAll$11((CryptoHomeCtaButtonsDao) this.receiver, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamCryptoHomeCtaButtons$deleteAll$11(CryptoHomeCtaButtonsDao cryptoHomeCtaButtonsDao, Continuation continuation) {
        cryptoHomeCtaButtonsDao.deleteAll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoHomeStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoHomeStore$HomeRequest;", "", "force", "", "accountNumber", "", "<init>", "(ZLjava/lang/String;)V", "getForce", "()Z", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class HomeRequest {
        private final String accountNumber;
        private final boolean force;

        public static /* synthetic */ HomeRequest copy$default(HomeRequest homeRequest, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = homeRequest.force;
            }
            if ((i & 2) != 0) {
                str = homeRequest.accountNumber;
            }
            return homeRequest.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getForce() {
            return this.force;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final HomeRequest copy(boolean force, String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new HomeRequest(force, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HomeRequest)) {
                return false;
            }
            HomeRequest homeRequest = (HomeRequest) other;
            return this.force == homeRequest.force && Intrinsics.areEqual(this.accountNumber, homeRequest.accountNumber);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.force) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "HomeRequest(force=" + this.force + ", accountNumber=" + this.accountNumber + ")";
        }

        public HomeRequest(boolean z, String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.force = z;
            this.accountNumber = accountNumber;
        }

        public final boolean getForce() {
            return this.force;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }
}
