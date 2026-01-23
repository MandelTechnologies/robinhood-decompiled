package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountInfo;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J@\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001e0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0002J\u0018\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoNonCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/store/StoreBundle;)V", "selectedAccountNumberFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "setSelectedAccountNumber", "", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "accountNumber", "streamRhsNumber", "Lkotlinx/coroutines/flow/Flow;", "verifyNumberValidForLocation", "Lkotlin/Function1;", "", "defaultNumberFlow", "streamAccountNumber", "streamCryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "streamCryptoAccountId", "Ljava/util/UUID;", "streamAccountInfo", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoAccountSwitcherStore extends Store implements CryptoAccountProvider {
    private final AccountProvider accountProvider;
    private final AuthManager authManager;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore;
    private final StateFlow2<String> selectedAccountNumberFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAccountSwitcherStore(AuthManager authManager, AccountProvider accountProvider, CryptoAccountStore cryptoAccountStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, AppType appType, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.authManager = authManager;
        this.accountProvider = accountProvider;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoNonCurrencyPairAccountSwitcherStore = cryptoNonCurrencyPairAccountSwitcherStore;
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.selectedAccountNumberFlow = StateFlow4.MutableStateFlow(null);
        if (appType == AppType.TRADER) {
            BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C336811(null), 3, null);
        }
    }

    /* compiled from: CryptoAccountSwitcherStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$1", m3645f = "CryptoAccountSwitcherStore.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$1 */
    static final class C336811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C336811(Continuation<? super C336811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoAccountSwitcherStore.this.new C336811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C336811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> loggedInStateFlow = CryptoAccountSwitcherStore.this.authManager.getLoggedInStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoAccountSwitcherStore.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(loggedInStateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoAccountSwitcherStore.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "loggedIn", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$1$1", m3645f = "CryptoAccountSwitcherStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoAccountSwitcherStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoAccountSwitcherStore cryptoAccountSwitcherStore, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoAccountSwitcherStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0 && this.this$0.selectedAccountNumberFlow.getValue() == null) {
                        this.this$0.accountProvider.refresh(false);
                        Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamIndividualAccount()), Integer.MAX_VALUE, null, 2, null);
                        C506581 c506581 = new C506581(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowBuffer$default, c506581, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoAccountSwitcherStore.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$1$1$1", m3645f = "CryptoAccountSwitcherStore.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506581 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoAccountSwitcherStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506581(CryptoAccountSwitcherStore cryptoAccountSwitcherStore, Continuation<? super C506581> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoAccountSwitcherStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506581 c506581 = new C506581(this.this$0, continuation);
                    c506581.L$0 = obj;
                    return c506581;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((C506581) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Account account = (Account) this.L$0;
                        if (this.this$0.selectedAccountNumberFlow.getValue() == null) {
                            String accountNumberRhs = account.getAccountNumberRhs();
                            this.this$0.mo15792setSelectedAccountNumber(CryptoAccountSwitcherLocation.Home.INSTANCE, accountNumberRhs);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    /* renamed from: setSelectedAccountNumber */
    public void mo15792setSelectedAccountNumber(CryptoAccountSwitcherLocation location, String accountNumber) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        StateFlow2<String> stateFlow2 = this.selectedAccountNumberFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), accountNumber)) {
        }
    }

    private final Flow<String> streamRhsNumber(CryptoAccountSwitcherLocation location, Function1<? super String, ? extends Flow<Boolean>> verifyNumberValidForLocation, Flow<String> defaultNumberFlow) {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C33678xa3c22e8(null, this, verifyNumberValidForLocation, defaultNumberFlow, location)));
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    public Flow<String> streamAccountNumber(final CryptoAccountSwitcherLocation location) {
        Flow<String> flowStreamDefaultAccount$lib_store_crypto_externalDebug;
        Intrinsics.checkNotNullParameter(location, "location");
        if (location instanceof CryptoAccountSwitcherLocation.WithCurrencyPair) {
            CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair = (CryptoAccountSwitcherLocation.WithCurrencyPair) location;
            flowStreamDefaultAccount$lib_store_crypto_externalDebug = this.cryptoCurrencyPairAccountSwitcherStore.streamDefaultAccount$lib_store_crypto_externalDebug(withCurrencyPair.getCurrencyPairId(), withCurrencyPair.getCurrencyPairAccountSwitcherLocation());
        } else {
            if (!(location instanceof CryptoAccountSwitcherLocation.WithoutCurrencyPair)) {
                throw new NoWhenBranchMatchedException();
            }
            flowStreamDefaultAccount$lib_store_crypto_externalDebug = this.cryptoNonCurrencyPairAccountSwitcherStore.streamDefaultAccount$lib_store_crypto_externalDebug(((CryptoAccountSwitcherLocation.WithoutCurrencyPair) location).getNonCurrencyPairAccountSwitcherLocation());
        }
        return streamRhsNumber(location, new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAccountSwitcherStore.streamAccountNumber$lambda$4(location, this, (String) obj);
            }
        }, FlowKt.filterNotNull(flowStreamDefaultAccount$lib_store_crypto_externalDebug));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamAccountNumber$lambda$4(CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation, CryptoAccountSwitcherStore cryptoAccountSwitcherStore, String rhsNumber) {
        Intrinsics.checkNotNullParameter(rhsNumber, "rhsNumber");
        if (cryptoAccountSwitcherLocation instanceof CryptoAccountSwitcherLocation.WithCurrencyPair) {
            CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair = (CryptoAccountSwitcherLocation.WithCurrencyPair) cryptoAccountSwitcherLocation;
            return cryptoAccountSwitcherStore.cryptoCurrencyPairAccountSwitcherStore.streamIsAccountSelectable$lib_store_crypto_externalDebug(rhsNumber, withCurrencyPair.getCurrencyPairId(), withCurrencyPair.getCurrencyPairAccountSwitcherLocation());
        }
        if (!(cryptoAccountSwitcherLocation instanceof CryptoAccountSwitcherLocation.WithoutCurrencyPair)) {
            throw new NoWhenBranchMatchedException();
        }
        return cryptoAccountSwitcherStore.cryptoNonCurrencyPairAccountSwitcherStore.streamIsAccountSelectable$lib_store_crypto_externalDebug(rhsNumber, ((CryptoAccountSwitcherLocation.WithoutCurrencyPair) cryptoAccountSwitcherLocation).getNonCurrencyPairAccountSwitcherLocation());
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    public Flow<CryptoAccount> streamCryptoAccount(CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.transformLatest(streamAccountNumber(location), new C33676xfc76d622(null, this));
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    public Flow<UUID> streamCryptoAccountId(CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow<CryptoAccount> flowStreamCryptoAccount = streamCryptoAccount(location);
        return new Flow<UUID>() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamCryptoAccountId$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamCryptoAccount.collect(new C336772(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamCryptoAccountId$$inlined$map$1$2 */
            public static final class C336772<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamCryptoAccountId$$inlined$map$1$2", m3645f = "CryptoAccountSwitcherStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamCryptoAccountId$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C336772.this.emit(null, this);
                    }
                }

                public C336772(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    String id;
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
                        CryptoAccount cryptoAccount = (CryptoAccount) obj;
                        UUID uuid = (cryptoAccount == null || (id = cryptoAccount.getId()) == null) ? null : StringsKt.toUuid(id);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(uuid, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    @Override // com.robinhood.android.lib.account.crypto.CryptoAccountProvider
    public Flow<CryptoAccountInfo> streamAccountInfo(CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return FlowKt.transformLatest(streamCryptoAccountId(location), new C33674x27c79ab3(null, this, location));
    }
}
