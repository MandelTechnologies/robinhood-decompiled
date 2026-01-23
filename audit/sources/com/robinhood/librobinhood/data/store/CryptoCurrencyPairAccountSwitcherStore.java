package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.dao.CryptoCurrencyPairAccountSwitcherDao;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherViewModel;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoCurrencyPairAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ%\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00132\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "cryptoCurrencyPairAccountSwitcherDao", "Lcom/robinhood/models/crypto/dao/CryptoCurrencyPairAccountSwitcherDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/crypto/v1/CryptoService;Lcom/robinhood/models/crypto/dao/CryptoCurrencyPairAccountSwitcherDao;Lcom/robinhood/store/StoreBundle;)V", "accountSwitcherForCurrencyPairEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "accountSwitcherForCurrencyPairQuery", "Lcom/robinhood/android/moria/db/Query;", "getAccountSwitcherForCurrencyPairQuery", "()Lcom/robinhood/android/moria/db/Query;", "streamIsAccountSelectable", "Lkotlinx/coroutines/flow/Flow;", "", "rhsAccountNumber", "", "currencyPairId", "location", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher$Location;", "streamIsAccountSelectable$lib_store_crypto_externalDebug", "streamDefaultAccount", "streamDefaultAccount$lib_store_crypto_externalDebug", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoCurrencyPairAccountSwitcherStore extends Store {
    private final Endpoint<UUID, CryptoCurrencyPairAccountSwitcher> accountSwitcherForCurrencyPairEndpoint;
    private final Query<UUID, CryptoCurrencyPairAccountSwitcher> accountSwitcherForCurrencyPairQuery;
    private final CryptoCurrencyPairAccountSwitcherDao cryptoCurrencyPairAccountSwitcherDao;
    private final CryptoService cryptoService;

    /* compiled from: CryptoCurrencyPairAccountSwitcherStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoCurrencyPairAccountSwitcher.Location.values().length];
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.TRADE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.SELL_QUOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoCurrencyPairAccountSwitcher.Location.SELL_ASSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCurrencyPairAccountSwitcherStore(CryptoService cryptoService, CryptoCurrencyPairAccountSwitcherDao cryptoCurrencyPairAccountSwitcherDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherDao, "cryptoCurrencyPairAccountSwitcherDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoService = cryptoService;
        this.cryptoCurrencyPairAccountSwitcherDao = cryptoCurrencyPairAccountSwitcherDao;
        Endpoint<UUID, CryptoCurrencyPairAccountSwitcher> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoCurrencyPairAccountSwitcherStore2(this, null), getLogoutKillswitch(), new CryptoCurrencyPairAccountSwitcherStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.accountSwitcherForCurrencyPairEndpoint = endpointCreate$default;
        this.accountSwitcherForCurrencyPairQuery = Store.create$default(this, Query.INSTANCE, "queryAccountSwitcherForCurrencyPair", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoCurrencyPairAccountSwitcherStore4(endpointCreate$default))), new CryptoCurrencyPairAccountSwitcherStore5(cryptoCurrencyPairAccountSwitcherDao), false, 8, null);
    }

    public final Query<UUID, CryptoCurrencyPairAccountSwitcher> getAccountSwitcherForCurrencyPairQuery() {
        return this.accountSwitcherForCurrencyPairQuery;
    }

    public final Flow<Boolean> streamIsAccountSelectable$lib_store_crypto_externalDebug(final String rhsAccountNumber, UUID currencyPairId, final CryptoCurrencyPairAccountSwitcher.Location location) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow<CryptoCurrencyPairAccountSwitcher> flowAsFlow = this.accountSwitcherForCurrencyPairQuery.asFlow(currencyPairId);
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ CryptoCurrencyPairAccountSwitcher.Location $location$inlined;
                final /* synthetic */ String $rhsAccountNumber$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1$2", m3645f = "CryptoCurrencyPairAccountSwitcherStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CryptoCurrencyPairAccountSwitcher.Location location, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$location$inlined = location;
                    this.$rhsAccountNumber$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    CryptoAccountSwitcherViewModel tradeBar;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = (CryptoCurrencyPairAccountSwitcher) obj;
                        int i3 = CryptoCurrencyPairAccountSwitcherStore.WhenMappings.$EnumSwitchMapping$0[this.$location$inlined.ordinal()];
                        if (i3 == 1) {
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getTradeBar();
                        } else if (i3 == 2) {
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getBuy();
                        } else if (i3 == 3) {
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getSellQuote();
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getSellAsset();
                        }
                        List<CryptoAccountSwitcherAccount> accounts2 = tradeBar.getAccounts();
                        boolean z = false;
                        if (!(accounts2 instanceof Collection) || !accounts2.isEmpty()) {
                            Iterator<T> it = accounts2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount = (CryptoAccountSwitcherAccount) it.next();
                                if (Intrinsics.areEqual(cryptoAccountSwitcherAccount.getRhsAccountNumber(), this.$rhsAccountNumber$inlined) && cryptoAccountSwitcherAccount.isSelectable()) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(z);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector, location, rhsAccountNumber), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final Flow<String> streamDefaultAccount$lib_store_crypto_externalDebug(UUID currencyPairId, final CryptoCurrencyPairAccountSwitcher.Location location) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow<CryptoCurrencyPairAccountSwitcher> flowAsFlow = this.accountSwitcherForCurrencyPairQuery.asFlow(currencyPairId);
        return FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ CryptoCurrencyPairAccountSwitcher.Location $location$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1$2", m3645f = "CryptoCurrencyPairAccountSwitcherStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CryptoCurrencyPairAccountSwitcher.Location location) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$location$inlined = location;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    CryptoAccountSwitcherViewModel tradeBar;
                    T next;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = (CryptoCurrencyPairAccountSwitcher) obj;
                        int i3 = CryptoCurrencyPairAccountSwitcherStore.WhenMappings.$EnumSwitchMapping$0[this.$location$inlined.ordinal()];
                        if (i3 == 1) {
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getTradeBar();
                        } else if (i3 == 2) {
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getBuy();
                        } else if (i3 == 3) {
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getSellQuote();
                        } else {
                            if (i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tradeBar = cryptoCurrencyPairAccountSwitcher.getSellAsset();
                        }
                        Iterator<T> it = tradeBar.getAccounts().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (((CryptoAccountSwitcherAccount) next).getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
                                break;
                            }
                        }
                        CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount = next;
                        String rhsAccountNumber = cryptoAccountSwitcherAccount != null ? cryptoAccountSwitcherAccount.getRhsAccountNumber() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(rhsAccountNumber, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector, location), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }
}
