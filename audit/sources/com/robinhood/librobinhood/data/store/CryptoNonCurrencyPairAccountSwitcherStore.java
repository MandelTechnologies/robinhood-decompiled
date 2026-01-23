package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.dao.CryptoNonCurrencyPairAccountSwitcherDao;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoNonCurrencyPairAccountSwitcher;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoNonCurrencyPairAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u001d\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "Lcom/robinhood/store/Store;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "cryptoNonCurrencyPairAccountSwitcherDao", "Lcom/robinhood/models/crypto/dao/CryptoNonCurrencyPairAccountSwitcherDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/crypto/v1/CryptoService;Lcom/robinhood/models/crypto/dao/CryptoNonCurrencyPairAccountSwitcherDao;Lcom/robinhood/store/StoreBundle;)V", "accountSwitcherForNonCurrencyPairEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher;", "accountSwitcherForNonCurrencyPairQuery", "Lcom/robinhood/android/moria/db/Query;", "streamNonCurrencyPairAccountSwitcher", "Lkotlinx/coroutines/flow/Flow;", "streamIsAccountSelectable", "", "rhsAccountNumber", "", "location", "Lcom/robinhood/models/crypto/db/CryptoNonCurrencyPairAccountSwitcher$Location;", "streamIsAccountSelectable$lib_store_crypto_externalDebug", "streamDefaultAccount", "streamDefaultAccount$lib_store_crypto_externalDebug", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoNonCurrencyPairAccountSwitcherStore extends Store {
    private final Endpoint<Unit, CryptoNonCurrencyPairAccountSwitcher> accountSwitcherForNonCurrencyPairEndpoint;
    private final Query<Unit, CryptoNonCurrencyPairAccountSwitcher> accountSwitcherForNonCurrencyPairQuery;
    private final CryptoNonCurrencyPairAccountSwitcherDao cryptoNonCurrencyPairAccountSwitcherDao;
    private final CryptoService cryptoService;

    /* compiled from: CryptoNonCurrencyPairAccountSwitcherStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoNonCurrencyPairAccountSwitcher.Location.values().length];
            try {
                iArr[CryptoNonCurrencyPairAccountSwitcher.Location.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoNonCurrencyPairAccountSwitcherStore(CryptoService cryptoService, CryptoNonCurrencyPairAccountSwitcherDao cryptoNonCurrencyPairAccountSwitcherDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherDao, "cryptoNonCurrencyPairAccountSwitcherDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoService = cryptoService;
        this.cryptoNonCurrencyPairAccountSwitcherDao = cryptoNonCurrencyPairAccountSwitcherDao;
        Endpoint<Unit, CryptoNonCurrencyPairAccountSwitcher> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoNonCurrencyPairAccountSwitcherStore2(this, null), getLogoutKillswitch(), new CryptoNonCurrencyPairAccountSwitcherStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.accountSwitcherForNonCurrencyPairEndpoint = endpointCreate$default;
        this.accountSwitcherForNonCurrencyPairQuery = Store.create$default(this, Query.INSTANCE, "queryAccountSwitcherForCurrencyPair", CollectionsKt.listOf(new PollEach(getStoreScope(), new CryptoNonCurrencyPairAccountSwitcherStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoNonCurrencyPairAccountSwitcherStore.accountSwitcherForNonCurrencyPairQuery$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow accountSwitcherForNonCurrencyPairQuery$lambda$0(CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoNonCurrencyPairAccountSwitcherStore.cryptoNonCurrencyPairAccountSwitcherDao.getAccountSwitcher();
    }

    public final Flow<CryptoNonCurrencyPairAccountSwitcher> streamNonCurrencyPairAccountSwitcher() {
        return FlowKt.distinctUntilChanged(this.accountSwitcherForNonCurrencyPairQuery.asFlow(Unit.INSTANCE));
    }

    public final Flow<Boolean> streamIsAccountSelectable$lib_store_crypto_externalDebug(final String rhsAccountNumber, final CryptoNonCurrencyPairAccountSwitcher.Location location) {
        Intrinsics.checkNotNullParameter(rhsAccountNumber, "rhsAccountNumber");
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow<CryptoNonCurrencyPairAccountSwitcher> flowAsFlow = this.accountSwitcherForNonCurrencyPairQuery.asFlow(Unit.INSTANCE);
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ CryptoNonCurrencyPairAccountSwitcher.Location $location$inlined;
                final /* synthetic */ String $rhsAccountNumber$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1$2", m3645f = "CryptoNonCurrencyPairAccountSwitcherStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamIsAccountSelectable$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, CryptoNonCurrencyPairAccountSwitcher.Location location, String str) {
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
                        CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher = (CryptoNonCurrencyPairAccountSwitcher) obj;
                        if (CryptoNonCurrencyPairAccountSwitcherStore.WhenMappings.$EnumSwitchMapping$0[this.$location$inlined.ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<CryptoAccountSwitcherAccount> accounts2 = cryptoNonCurrencyPairAccountSwitcher.getHome().getAccounts();
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

    public final Flow<String> streamDefaultAccount$lib_store_crypto_externalDebug(final CryptoNonCurrencyPairAccountSwitcher.Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        final Flow<CryptoNonCurrencyPairAccountSwitcher> flowAsFlow = this.accountSwitcherForNonCurrencyPairQuery.asFlow(Unit.INSTANCE);
        return FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ CryptoNonCurrencyPairAccountSwitcher.Location $location$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1$2", m3645f = "CryptoNonCurrencyPairAccountSwitcherStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore$streamDefaultAccount$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, CryptoNonCurrencyPairAccountSwitcher.Location location) {
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
                        CryptoNonCurrencyPairAccountSwitcher cryptoNonCurrencyPairAccountSwitcher = (CryptoNonCurrencyPairAccountSwitcher) obj;
                        if (CryptoNonCurrencyPairAccountSwitcherStore.WhenMappings.$EnumSwitchMapping$0[this.$location$inlined.ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterator<T> it = cryptoNonCurrencyPairAccountSwitcher.getHome().getAccounts().iterator();
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
