package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.models.api.ApiClientComponentAlert;
import com.robinhood.models.api.ApiCryptoBuyingPower;
import com.robinhood.models.api.ApiSessionAlert;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.models.dao.CryptoBuyingPowerDao;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002,-B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\"2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\"2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\"2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\"2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "bonfireApi", "Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CryptoBuyingPowerDao;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/api/retrofit/CryptoBonfireApi;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CryptoBuyingPowerDao;)V", "cryptoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerQuery;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiCryptoBuyingPower;", "buyingPowerAlertEndpoint", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerAlertArgs;", "Lcom/robinhood/models/api/ApiSessionAlert;", "refresh", "", "force", "", "currencyCode", "", "streamCryptoBuyingPower", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/CryptoBuyingPower;", "streamBuyingPowerForCrypto", "Lkotlinx/coroutines/flow/Flow;", "streamBuyingPowerForRhsAccountNumber", "accountNumber", "streamBuyingPowerForSelectedAccount", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "streamCryptoBuyingPowerAlert", "Lcom/robinhood/models/db/ClientComponentAlert;", "currencyPairId", "Ljava/util/UUID;", "BuyingPowerQuery", "BuyingPowerAlertArgs", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoBuyingPowerStore extends Store {
    private final AccountProvider accountProvider;
    private final CryptoBonfireApi bonfireApi;
    private final Endpoint<BuyingPowerAlertArgs, Optional<ApiSessionAlert>> buyingPowerAlertEndpoint;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final Endpoint<BuyingPowerQuery, Optional<ApiCryptoBuyingPower>> cryptoEndpoint;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoBuyingPowerDao dao;
    private final Query<BuyingPowerQuery, CryptoBuyingPower> streamCryptoBuyingPower;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoBuyingPowerStore(AccountProvider accountProvider, CryptoBonfireApi bonfireApi, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle, CryptoBuyingPowerDao dao) {
        super(storeBundle, CryptoBuyingPower.INSTANCE);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.accountProvider = accountProvider;
        this.bonfireApi = bonfireApi;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<BuyingPowerQuery, Optional<ApiCryptoBuyingPower>> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(companion, new CryptoBuyingPowerStore4(this, null), getLogoutKillswitch(), new CryptoBuyingPowerStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.cryptoEndpoint = endpointCreateWithParams$default;
        this.buyingPowerAlertEndpoint = Endpoint.Companion.createWithParams$default(companion, new CryptoBuyingPowerStore2(this, null), getLogoutKillswitch(), new CryptoBuyingPowerStore3(null), storeBundle.getClock(), null, 16, null);
        this.streamCryptoBuyingPower = Store.create$default(this, Query.INSTANCE, "streamCryptoBuyingPower", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoBuyingPowerStore6(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoBuyingPowerStore.streamCryptoBuyingPower$lambda$0(this.f$0, (CryptoBuyingPowerStore.BuyingPowerQuery) obj);
            }
        }, false, 8, null);
    }

    public final void refresh(boolean force, String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Endpoint.DefaultImpls.refresh$default(this.cryptoEndpoint, new BuyingPowerQuery(null, currencyCode), force, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamCryptoBuyingPower$lambda$0(CryptoBuyingPowerStore cryptoBuyingPowerStore, BuyingPowerQuery params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.getAccountNumber() == null) {
            return cryptoBuyingPowerStore.dao.getCryptoBuyingPowerByCode(params.getCurrencyCode());
        }
        return cryptoBuyingPowerStore.dao.getCryptoBuyingPowerByRhsAccount(params.getAccountNumber(), params.getCurrencyCode());
    }

    public final Flow<CryptoBuyingPower> streamBuyingPowerForCrypto(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return this.streamCryptoBuyingPower.asFlow(new BuyingPowerQuery(null, currencyCode));
    }

    public final Flow<CryptoBuyingPower> streamBuyingPowerForRhsAccountNumber(String accountNumber, String currencyCode) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return this.streamCryptoBuyingPower.asFlow(new BuyingPowerQuery(accountNumber, currencyCode));
    }

    public final Flow<CryptoBuyingPower> streamBuyingPowerForSelectedAccount(CryptoAccountSwitcherLocation.WithCurrencyPair location, String currencyCode) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C33683x759104b7(null, this, location, currencyCode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoBuyingPowerStore.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerQuery;", "", "accountNumber", "", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getCurrencyCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class BuyingPowerQuery {
        private final String accountNumber;
        private final String currencyCode;

        public static /* synthetic */ BuyingPowerQuery copy$default(BuyingPowerQuery buyingPowerQuery, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buyingPowerQuery.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = buyingPowerQuery.currencyCode;
            }
            return buyingPowerQuery.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final BuyingPowerQuery copy(String accountNumber, String currencyCode) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            return new BuyingPowerQuery(accountNumber, currencyCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyingPowerQuery)) {
                return false;
            }
            BuyingPowerQuery buyingPowerQuery = (BuyingPowerQuery) other;
            return Intrinsics.areEqual(this.accountNumber, buyingPowerQuery.accountNumber) && Intrinsics.areEqual(this.currencyCode, buyingPowerQuery.currencyCode);
        }

        public int hashCode() {
            String str = this.accountNumber;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.currencyCode.hashCode();
        }

        public String toString() {
            return "BuyingPowerQuery(accountNumber=" + this.accountNumber + ", currencyCode=" + this.currencyCode + ")";
        }

        public BuyingPowerQuery(String str, String currencyCode) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.accountNumber = str;
            this.currencyCode = currencyCode;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }
    }

    public final Flow<ClientComponentAlert> streamCryptoBuyingPowerAlert(final UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        final Flow flowTransformLatest = FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C33685x8044987f(null, this, currencyPairId));
        return new Flow<ClientComponentAlert>() { // from class: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$streamCryptoBuyingPowerAlert$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ClientComponentAlert> flowCollector, Continuation continuation) {
                Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector, this, currencyPairId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$streamCryptoBuyingPowerAlert$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ UUID $currencyPairId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ CryptoBuyingPowerStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$streamCryptoBuyingPowerAlert$$inlined$map$1$2", m3645f = "CryptoBuyingPowerStore.kt", m3646l = {55, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$streamCryptoBuyingPowerAlert$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, CryptoBuyingPowerStore cryptoBuyingPowerStore, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = cryptoBuyingPowerStore;
                    this.$currencyPairId$inlined = uuid;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
                
                    if (r12.emit(r11, r4) != r0) goto L34;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                /* JADX WARN: Type inference failed for: r12v13, types: [com.robinhood.models.db.ClientComponentAlert] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    T t;
                    FlowCollector flowCollector2;
                    ApiClientComponentAlert alert;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    Object obj2 = anonymousClass12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass12.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        flowCollector = this.$this_unsafeFlow;
                        String str = (String) obj;
                        if (str != null) {
                            Endpoint endpoint = this.this$0.buyingPowerAlertEndpoint;
                            CryptoBuyingPowerStore.BuyingPowerAlertArgs buyingPowerAlertArgs = new CryptoBuyingPowerStore.BuyingPowerAlertArgs(str, this.$currencyPairId$inlined);
                            anonymousClass12.L$0 = flowCollector;
                            anonymousClass12.label = 1;
                            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, buyingPowerAlertArgs, null, anonymousClass12, 2, null);
                            if (objForceFetch$default != coroutine_suspended) {
                                obj2 = objForceFetch$default;
                                flowCollector2 = flowCollector;
                            }
                            return coroutine_suspended;
                        }
                        t = null;
                        anonymousClass12.L$0 = null;
                        anonymousClass12.label = 2;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        flowCollector2 = (FlowCollector) anonymousClass12.L$0;
                        ResultKt.throwOnFailure(obj2);
                    }
                    ApiSessionAlert apiSessionAlert = (ApiSessionAlert) ((Optional) obj2).getOrNull();
                    T dbModel = (apiSessionAlert == null || (alert = apiSessionAlert.getAlert()) == null) ? null : alert.toDbModel();
                    flowCollector = flowCollector2;
                    t = dbModel;
                    anonymousClass12.L$0 = null;
                    anonymousClass12.label = 2;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoBuyingPowerStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerAlertArgs;", "", "accountNumber", "", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class BuyingPowerAlertArgs {
        private final String accountNumber;
        private final UUID currencyPairId;

        public static /* synthetic */ BuyingPowerAlertArgs copy$default(BuyingPowerAlertArgs buyingPowerAlertArgs, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buyingPowerAlertArgs.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = buyingPowerAlertArgs.currencyPairId;
            }
            return buyingPowerAlertArgs.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final BuyingPowerAlertArgs copy(String accountNumber, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new BuyingPowerAlertArgs(accountNumber, currencyPairId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyingPowerAlertArgs)) {
                return false;
            }
            BuyingPowerAlertArgs buyingPowerAlertArgs = (BuyingPowerAlertArgs) other;
            return Intrinsics.areEqual(this.accountNumber, buyingPowerAlertArgs.accountNumber) && Intrinsics.areEqual(this.currencyPairId, buyingPowerAlertArgs.currencyPairId);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.currencyPairId.hashCode();
        }

        public String toString() {
            return "BuyingPowerAlertArgs(accountNumber=" + this.accountNumber + ", currencyPairId=" + this.currencyPairId + ")";
        }

        public BuyingPowerAlertArgs(String accountNumber, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.accountNumber = accountNumber;
            this.currencyPairId = currencyPairId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }
}
