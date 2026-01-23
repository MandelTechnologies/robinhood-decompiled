package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.models.api.ApiCryptoPortfolio;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoBalances;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.PortfolioStore;
import com.robinhood.utils.Optional;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;
import rosetta.portfolio.p541v1.GetAccountValueResponseDto;

/* compiled from: BalancesStore.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 92\u00020\u0001:\u00019BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001fJ\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f2\u0006\u0010\u001a\u001a\u00020\u001bJ\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u001fJ\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u001fJ\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00180\u001fJ\u0010\u0010,\u001a\u00020&2\b\b\u0002\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010 \u001a\u00020!H\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020#0\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u001f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020#0\u001f2\u0006\u00105\u001a\u00020\u001bJ\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u001f2\u0006\u00106\u001a\u000207J\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020#0\u001f2\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/BalancesStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "portfolioStore", "Lcom/robinhood/store/base/PortfolioStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "cryptoPortfolioStore", "Lcom/robinhood/librobinhood/data/store/CryptoPortfolioStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/store/base/PortfolioStore;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/librobinhood/data/store/CryptoPortfolioStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "individualAccountBrokerageBalances", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "individualAccountBrokerageBalancesOptional", "Lcom/robinhood/utils/Optional;", "accountBrokerageBalances", "accountNumber", "", "cryptoBalances", "Lcom/robinhood/models/crypto/db/CryptoBalances;", "streamCryptoBalances", "Lkotlinx/coroutines/flow/Flow;", "account", "Lcom/robinhood/models/db/Account;", "individualAccountUnifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "individualAccountUnifiedBalancesOptional", "poll", "", "pollAccount", "streamAccountBrokerageBalances", "streamIndividualAccountBrokerageBalances", "streamIndividualAccountUnifiedBalances", "streamIndividualAccountUnifiedBalancesOptional", "refreshIndividualAccount", "force", "", "refreshAccount", "getSelectedAccountBrokerageBalances", "getSelectedAccountCryptoBalances", "getSelectedAccountUnifiedBalances", "streamUnifiedBalances", "streamUnifiedBalancesByRhsAccountNumber", "rhsAccountNumber", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "streamSelectedAccountUnifiedBalances", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class BalancesStore extends Store {
    public static final long REFRESH_INTERVAL = 5000;
    private final AccountProvider accountProvider;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoAccountStore cryptoAccountStore;
    private final SharedFlow<CryptoBalances> cryptoBalances;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CryptoPortfolioStore cryptoPortfolioStore;
    private final SharedFlow<BrokerageBalances> individualAccountBrokerageBalances;
    private final SharedFlow<Optional<BrokerageBalances>> individualAccountBrokerageBalancesOptional;
    private final SharedFlow<UnifiedBalances> individualAccountUnifiedBalances;
    private final SharedFlow<Optional<UnifiedBalances>> individualAccountUnifiedBalancesOptional;
    private final PortfolioStore portfolioStore;

    /* compiled from: BalancesStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalancesStore(StoreBundle storeBundle, AccountProvider accountProvider, CryptoAccountStore cryptoAccountStore, PortfolioStore portfolioStore, CryptoHoldingStore cryptoHoldingStore, CryptoPortfolioStore cryptoPortfolioStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore) {
        super(storeBundle, UnifiedBalances.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(cryptoPortfolioStore, "cryptoPortfolioStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        this.accountProvider = accountProvider;
        this.cryptoAccountStore = cryptoAccountStore;
        this.portfolioStore = portfolioStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.cryptoPortfolioStore = cryptoPortfolioStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        Flow flowFlowCombine = FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(accountProvider.streamIndividualAccount()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(portfolioStore.getIndividualAccountPortfolio()), Integer.MAX_VALUE, null, 2, null), new BalancesStore3(null));
        CoroutineScope storeScope = getStoreScope();
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        SharedFlow<BrokerageBalances> sharedFlowShareIn = FlowKt.shareIn(flowFlowCombine, storeScope, companion.getLazily(), 1);
        this.individualAccountBrokerageBalances = sharedFlowShareIn;
        SharedFlow<Optional<BrokerageBalances>> sharedFlowShareIn2 = FlowKt.shareIn(FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(accountProvider.streamIndividualAccountOptional()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(portfolioStore.getIndividualAccountPortfolioOptional()), Integer.MAX_VALUE, null, 2, null), new BalancesStore4(null)), getStoreScope(), companion.getLazily(), 1);
        this.individualAccountBrokerageBalancesOptional = sharedFlowShareIn2;
        SharedFlow<CryptoBalances> sharedFlowShareIn3 = FlowKt.shareIn(FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(cryptoPortfolioStore.streamCryptoPortfolioOptional()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(cryptoHoldingStore.streamLocalCryptoHoldingOptional()), Integer.MAX_VALUE, null, 2, null), new BalancesStore2(null)), getStoreScope(), companion.getLazily(), 1);
        this.cryptoBalances = sharedFlowShareIn3;
        this.individualAccountUnifiedBalances = FlowKt.shareIn(FlowKt.flowCombine(sharedFlowShareIn, sharedFlowShareIn3, new BalancesStore5(null)), getStoreScope(), companion.getLazily(), 1);
        this.individualAccountUnifiedBalancesOptional = FlowKt.shareIn(FlowKt.flowCombine(sharedFlowShareIn2, sharedFlowShareIn3, new BalancesStore6(null)), getStoreScope(), companion.getLazily(), 1);
    }

    private final SharedFlow<BrokerageBalances> accountBrokerageBalances(String accountNumber) {
        return FlowKt.shareIn(FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(accountNumber)), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.portfolioStore.getPortfolio(accountNumber)), Integer.MAX_VALUE, null, 2, null), new C336101(null)), getStoreScope(), SharingStarted.INSTANCE.getLazily(), 1);
    }

    /* compiled from: BalancesStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "account", "Lcom/robinhood/models/db/Account;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$accountBrokerageBalances$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$accountBrokerageBalances$1 */
    /* loaded from: classes13.dex */
    static final class C336101 extends ContinuationImpl7 implements Function3<Account, Portfolio, Continuation<? super BrokerageBalances>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C336101(Continuation<? super C336101> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Account account, Portfolio portfolio, Continuation<? super BrokerageBalances> continuation) {
            C336101 c336101 = new C336101(continuation);
            c336101.L$0 = account;
            c336101.L$1 = portfolio;
            return c336101.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new BrokerageBalances((Account) this.L$0, (Portfolio) this.L$1);
        }
    }

    private final Flow<CryptoBalances> streamCryptoBalances(Account account) {
        return FlowKt.transformLatest(this.cryptoAccountStore.streamSelectedAccountByAccountNumber(account.getAccountNumberRhs()), new BalancesStore$streamCryptoBalances$$inlined$flatMapLatest$1(null, this));
    }

    public final Flow<Unit> poll() {
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.pollIndividualAccount(5000L, TimeUnit.MILLISECONDS)), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.portfolioStore.pollIndividualAccountPortfolio()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.cryptoPortfolioStore.pollCryptoPortfolio()), Integer.MAX_VALUE, null, 2, null), new C336131(null));
    }

    /* compiled from: BalancesStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0002\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/utils/Optional;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "Lcom/robinhood/models/api/ApiCryptoPortfolio;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$poll$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$poll$1 */
    /* loaded from: classes13.dex */
    static final class C336131 extends ContinuationImpl7 implements Function4<Account, Optional<? extends GetAccountValueResponseDto>, ApiCryptoPortfolio, Continuation<? super Unit>, Object> {
        int label;

        C336131(Continuation<? super C336131> continuation) {
            super(4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Account account, Optional<GetAccountValueResponseDto> optional, ApiCryptoPortfolio apiCryptoPortfolio, Continuation<? super Unit> continuation) {
            return new C336131(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Account account, Optional<? extends GetAccountValueResponseDto> optional, ApiCryptoPortfolio apiCryptoPortfolio, Continuation<? super Unit> continuation) {
            return invoke2(account, (Optional<GetAccountValueResponseDto>) optional, apiCryptoPortfolio, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public final Flow<Unit> pollAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.pollAccount(accountNumber, 5000L, TimeUnit.MILLISECONDS)), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.portfolioStore.pollAccountPortfolio(accountNumber)), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.cryptoPortfolioStore.pollCryptoPortfolio()), Integer.MAX_VALUE, null, 2, null), new C336141(null));
    }

    /* compiled from: BalancesStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/models/db/Account;", "Lrosetta/portfolio/v1/GetAccountValueResponseDto;", "Lcom/robinhood/models/api/ApiCryptoPortfolio;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$pollAccount$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$pollAccount$1 */
    /* loaded from: classes13.dex */
    static final class C336141 extends ContinuationImpl7 implements Function4<Account, GetAccountValueResponseDto, ApiCryptoPortfolio, Continuation<? super Unit>, Object> {
        int label;

        C336141(Continuation<? super C336141> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Account account, GetAccountValueResponseDto getAccountValueResponseDto, ApiCryptoPortfolio apiCryptoPortfolio, Continuation<? super Unit> continuation) {
            return new C336141(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public final Flow<BrokerageBalances> streamAccountBrokerageBalances(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return accountBrokerageBalances(accountNumber);
    }

    public final Flow<BrokerageBalances> streamIndividualAccountBrokerageBalances() {
        return this.individualAccountBrokerageBalances;
    }

    public final Flow<UnifiedBalances> streamIndividualAccountUnifiedBalances() {
        return this.individualAccountUnifiedBalances;
    }

    public final Flow<Optional<UnifiedBalances>> streamIndividualAccountUnifiedBalancesOptional() {
        return this.individualAccountUnifiedBalancesOptional;
    }

    public static /* synthetic */ void refreshIndividualAccount$default(BalancesStore balancesStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        balancesStore.refreshIndividualAccount(z);
    }

    public final void refreshIndividualAccount(boolean force) {
        this.accountProvider.refresh(force);
        this.portfolioStore.refreshIndividualAccountPortfolio(force);
        this.cryptoHoldingStore.refresh(force);
        this.cryptoPortfolioStore.refresh(force);
    }

    public static /* synthetic */ void refreshAccount$default(BalancesStore balancesStore, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        balancesStore.refreshAccount(str, z);
    }

    public final void refreshAccount(String accountNumber, boolean force) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountProvider.refresh(force);
        this.portfolioStore.refreshPortfolio(accountNumber, force);
        this.cryptoHoldingStore.refreshForAccountNumber(force, accountNumber);
        this.cryptoPortfolioStore.refresh(force);
    }

    /* compiled from: BalancesStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "acct", "Lcom/robinhood/models/db/Account;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$getSelectedAccountBrokerageBalances$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$getSelectedAccountBrokerageBalances$1 */
    /* loaded from: classes13.dex */
    static final class C336111 extends ContinuationImpl7 implements Function3<Account, Portfolio, Continuation<? super BrokerageBalances>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C336111(Continuation<? super C336111> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Account account, Portfolio portfolio, Continuation<? super BrokerageBalances> continuation) {
            C336111 c336111 = new C336111(continuation);
            c336111.L$0 = account;
            c336111.L$1 = portfolio;
            return c336111.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new BrokerageBalances((Account) this.L$0, (Portfolio) this.L$1);
        }
    }

    private final SharedFlow<BrokerageBalances> getSelectedAccountBrokerageBalances(Account account) {
        return FlowKt.shareIn(FlowKt.flowCombine(FlowKt.flowOf(account), Context7.buffer$default(RxConvert.asFlow(this.portfolioStore.getPortfolio(account.getAccountNumber())), Integer.MAX_VALUE, null, 2, null), new C336111(null)), getStoreScope(), SharingStarted.INSTANCE.getLazily(), 1);
    }

    private final Flow<CryptoBalances> getSelectedAccountCryptoBalances(Account account) {
        switch (WhenMappings.$EnumSwitchMapping$0[account.getBrokerageAccountType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return streamCryptoBalances(account);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return FlowKt.flowOf(new CryptoBalances(null, null));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: BalancesStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "brokerageBalances", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", "cryptoBalances", "Lcom/robinhood/models/crypto/db/CryptoBalances;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BalancesStore$getSelectedAccountUnifiedBalances$1", m3645f = "BalancesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BalancesStore$getSelectedAccountUnifiedBalances$1 */
    /* loaded from: classes13.dex */
    static final class C336121 extends ContinuationImpl7 implements Function3<BrokerageBalances, CryptoBalances, Continuation<? super UnifiedBalances>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C336121(Continuation<? super C336121> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(BrokerageBalances brokerageBalances, CryptoBalances cryptoBalances, Continuation<? super UnifiedBalances> continuation) {
            C336121 c336121 = new C336121(continuation);
            c336121.L$0 = brokerageBalances;
            c336121.L$1 = cryptoBalances;
            return c336121.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new UnifiedBalances((BrokerageBalances) this.L$0, (CryptoBalances) this.L$1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<UnifiedBalances> getSelectedAccountUnifiedBalances(Account account) {
        return FlowKt.shareIn(FlowKt.flowCombine(getSelectedAccountBrokerageBalances(account), getSelectedAccountCryptoBalances(account), new C336121(null)), getStoreScope(), SharingStarted.INSTANCE.getLazily(), 1);
    }

    public final Flow<UnifiedBalances> streamUnifiedBalances(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(accountNumber)), Integer.MAX_VALUE, null, 2, null), new BalancesStore$streamUnifiedBalances$$inlined$flatMapLatest$1(null, this));
    }

    public final Flow<UnifiedBalances> streamUnifiedBalancesByRhsAccountNumber(String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccountByRhs(rhsAccountNumber)), Integer.MAX_VALUE, null, 2, null), new C33609x7d8f249f(null, this));
    }

    public final Flow<UnifiedBalances> streamUnifiedBalances(CryptoAccountSwitcherLocation.WithCurrencyPair location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new BalancesStore$streamUnifiedBalances$$inlined$flatMapLatest$2(null, this, location));
    }

    public final Flow<UnifiedBalances> streamSelectedAccountUnifiedBalances(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return getSelectedAccountUnifiedBalances(account);
    }
}
