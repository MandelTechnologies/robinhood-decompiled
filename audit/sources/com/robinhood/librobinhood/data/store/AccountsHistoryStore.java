package com.robinhood.librobinhood.data.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.futures.FuturesAccountProvider;
import com.robinhood.android.lib.account.futures.RhdSubAccountIds;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.AccountsHistoryStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.account.history.C41283R;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function5;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: AccountsHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "futuresAccountProvider", "Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/lib/account/futures/FuturesAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "streamAccounts", "Lio/reactivex/Observable;", "", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "HistoryAccountFilterViewInfo", "Companion", "lib-store-account-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AccountsHistoryStore extends Store {
    private static final UUID invalidMinervaId = new UUID(0, 0);
    private final AccountProvider accountProvider;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final FuturesAccountProvider futuresAccountProvider;
    private final MinervaAccountStore minervaAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountsHistoryStore(StoreBundle storeBundle, AccountProvider accountProvider, MinervaAccountStore minervaAccountStore, CryptoAccountStore cryptoAccountStore, FuturesAccountProvider futuresAccountProvider, CryptoExperimentsStore cryptoExperimentsStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(futuresAccountProvider, "futuresAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        this.accountProvider = accountProvider;
        this.minervaAccountStore = minervaAccountStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.futuresAccountProvider = futuresAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    public final Observable<List<HistoryAccountFilterViewInfo>> streamAccounts() {
        final Flow flowConnectWhen$default = Operators.connectWhen$default(this.cryptoAccountStore.streamAllCryptoAccounts(), this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.onStart(new Flow<Map<String, ? extends CryptoAccount>>() { // from class: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$1$2 */
            public static final class C335262<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$1$2", m3645f = "AccountsHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C335262.this.emit(null, this);
                    }
                }

                public C335262(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        List list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (T t : list) {
                            linkedHashMap.put(((CryptoAccount) t).getRhsAccountNumber(), t);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Map<String, ? extends CryptoAccount>> flowCollector, Continuation continuation) {
                Object objCollect = flowConnectWhen$default.collect(new C335262(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new AccountsHistoryStore2(null)));
        Flow<Optional<CryptoAccount>> flowStreamAccountOptional = this.cryptoAccountStore.streamAccountOptional();
        final Flow<Boolean> flowStreamCryptoMibExperiment = this.cryptoExperimentsStore.streamCryptoMibExperiment();
        Flow flowConnectWhen = Operators.connectWhen(flowStreamAccountOptional, new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$2$2 */
            public static final class C335272<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$2$2", m3645f = "AccountsHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C335272.this.emit(null, this);
                    }
                }

                public C335272(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(!((Boolean) obj).booleanValue());
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
                Object objCollect = flowStreamCryptoMibExperiment.collect(new C335272(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, FlowKt.flowOf(Optional2.INSTANCE));
        Observables observables = Observables.INSTANCE;
        Observable<List<HistoryAccountFilterViewInfo>> observableCombineLatest = Observable.combineLatest(this.accountProvider.streamAllAccounts(), this.minervaAccountStore.streamAccounts(), asObservable(flowConnectWhen), asObservable(this.futuresAccountProvider.streamRhsNumberToRhdSubAccountIdMap()), asObservable(flowDistinctUntilChanged), new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.librobinhood.data.store.AccountsHistoryStore$streamAccounts$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
            @Override // io.reactivex.functions.Function5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                Object next;
                AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy rhy;
                UUID id;
                UUID uuid;
                String id2;
                Object next2;
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                Intrinsics.checkParameterIsNotNull(t5, "t5");
                Map map = (Map) t5;
                Map map2 = (Map) t4;
                Optional optional = (Optional) t3;
                List list = (List) t1;
                List list2 = (List) t2;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((MinervaAccount) next).getAccountType() == ApiMinervaAccount.Type.RHY_SPENDING) {
                        break;
                    }
                }
                MinervaAccount minervaAccount = (MinervaAccount) next;
                if (minervaAccount != null) {
                    UUID id3 = minervaAccount.getId();
                    UUID rhyAccountId = minervaAccount.getRhyAccountId();
                    if (rhyAccountId != null) {
                        rhy = new AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy(id3, rhyAccountId);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    rhy = null;
                }
                List<Account> list3 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (Account account : list3) {
                    if (!account.isOriginal()) {
                        id = AccountsHistoryStore.invalidMinervaId;
                    } else {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            if (((MinervaAccount) next2).getAccountType() == ApiMinervaAccount.Type.BROKERAGE) {
                                break;
                            }
                        }
                        MinervaAccount minervaAccount2 = (MinervaAccount) next2;
                        if (minervaAccount2 != null) {
                            id = minervaAccount2.getId();
                        } else {
                            uuid = null;
                            String accountNumber = account.getAccountNumber();
                            CryptoAccount cryptoAccount = (CryptoAccount) map.get(account.getAccountNumberRhs());
                            arrayList.add(new AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount(accountNumber, (cryptoAccount != null || (id2 = cryptoAccount.getId()) == null) ? null : StringsKt.toUuid(id2), account.getBrokerageAccountType(), account.getManagementType(), account.isOriginal(), AccountDisplayNames.getDisplayName(account).getWithAccount().getTitle(), uuid, (RhdSubAccountIds) map2.get(account.getAccountNumberRhs()), account.getCreatedAt()));
                        }
                    }
                    uuid = id;
                    String accountNumber2 = account.getAccountNumber();
                    CryptoAccount cryptoAccount2 = (CryptoAccount) map.get(account.getAccountNumberRhs());
                    arrayList.add(new AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount(accountNumber2, (cryptoAccount2 != null || (id2 = cryptoAccount2.getId()) == null) ? null : StringsKt.toUuid(id2), account.getBrokerageAccountType(), account.getManagementType(), account.isOriginal(), AccountDisplayNames.getDisplayName(account).getWithAccount().getTitle(), uuid, (RhdSubAccountIds) map2.get(account.getAccountNumberRhs()), account.getCreatedAt()));
                }
                CryptoAccount cryptoAccount3 = (CryptoAccount) optional.getOrNull();
                AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto crypto2 = cryptoAccount3 != null ? new AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto(cryptoAccount3.getId()) : null;
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                spreadBuilder.add(rhy);
                spreadBuilder.addSpread(arrayList.toArray(new AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount[0]));
                spreadBuilder.add(crypto2);
                return (R) CollectionsKt.listOfNotNull(spreadBuilder.toArray(new AccountsHistoryStore.HistoryAccountFilterViewInfo[spreadBuilder.size()]));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        return observableCombineLatest;
    }

    /* compiled from: AccountsHistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\b\u0010\u0002\u001a\u00020\u0003H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "Landroid/os/Parcelable;", "getAccountIdentifier", "", "displayName", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "Rhy", "BrokerageAccount", "Crypto", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$BrokerageAccount;", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Crypto;", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Rhy;", "lib-store-account-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface HistoryAccountFilterViewInfo extends Parcelable {
        String getAccountIdentifier();

        StringResource getDisplayName();

        /* compiled from: AccountsHistoryStore.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Rhy;", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "minervaId", "Ljava/util/UUID;", "spendingId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getMinervaId", "()Ljava/util/UUID;", "getSpendingId", "displayName", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayName$annotations", "()V", "getDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountIdentifier", "", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-store-account-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Rhy implements HistoryAccountFilterViewInfo {
            public static final Parcelable.Creator<Rhy> CREATOR = new Creator();
            private final StringResource displayName;
            private final UUID minervaId;
            private final UUID spendingId;

            /* compiled from: AccountsHistoryStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Rhy> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Rhy createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Rhy((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Rhy[] newArray(int i) {
                    return new Rhy[i];
                }
            }

            public static /* synthetic */ Rhy copy$default(Rhy rhy, UUID uuid, UUID uuid2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = rhy.minervaId;
                }
                if ((i & 2) != 0) {
                    uuid2 = rhy.spendingId;
                }
                return rhy.copy(uuid, uuid2);
            }

            public static /* synthetic */ void getDisplayName$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getMinervaId() {
                return this.minervaId;
            }

            /* renamed from: component2, reason: from getter */
            public final UUID getSpendingId() {
                return this.spendingId;
            }

            public final Rhy copy(UUID minervaId, UUID spendingId) {
                Intrinsics.checkNotNullParameter(minervaId, "minervaId");
                Intrinsics.checkNotNullParameter(spendingId, "spendingId");
                return new Rhy(minervaId, spendingId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Rhy)) {
                    return false;
                }
                Rhy rhy = (Rhy) other;
                return Intrinsics.areEqual(this.minervaId, rhy.minervaId) && Intrinsics.areEqual(this.spendingId, rhy.spendingId);
            }

            public int hashCode() {
                return (this.minervaId.hashCode() * 31) + this.spendingId.hashCode();
            }

            public String toString() {
                return "Rhy(minervaId=" + this.minervaId + ", spendingId=" + this.spendingId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.minervaId);
                dest.writeSerializable(this.spendingId);
            }

            public Rhy(UUID minervaId, UUID spendingId) {
                Intrinsics.checkNotNullParameter(minervaId, "minervaId");
                Intrinsics.checkNotNullParameter(spendingId, "spendingId");
                this.minervaId = minervaId;
                this.spendingId = spendingId;
                this.displayName = StringResource.INSTANCE.invoke(C8179R.string.account_type_spending, new Object[0]);
            }

            public final UUID getMinervaId() {
                return this.minervaId;
            }

            public final UUID getSpendingId() {
                return this.spendingId;
            }

            @Override // com.robinhood.librobinhood.data.store.AccountsHistoryStore.HistoryAccountFilterViewInfo
            public StringResource getDisplayName() {
                return this.displayName;
            }

            @Override // com.robinhood.librobinhood.data.store.AccountsHistoryStore.HistoryAccountFilterViewInfo
            public String getAccountIdentifier() {
                String string2 = this.spendingId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }
        }

        /* compiled from: AccountsHistoryStore.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/Jp\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u0016J\u0010\u00103\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b3\u0010\u001fJ\u001a\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\b\u000b\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bC\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010-R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010/¨\u0006H"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$BrokerageAccount;", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "", "accountNumber", "Ljava/util/UUID;", "cryptoId", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "managementType", "", "isOriginalAccount", "Lcom/robinhood/utils/resource/StringResource;", "displayName", "minervaId", "Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "rhdSubAccountIds", "j$/time/Instant", "createdAt", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;ZLcom/robinhood/utils/resource/StringResource;Ljava/util/UUID;Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;Lj$/time/Instant;)V", "getAccountIdentifier", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/util/UUID;", "component3", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component4", "()Lcom/robinhood/models/api/ManagementType;", "component5", "()Z", "component6", "()Lcom/robinhood/utils/resource/StringResource;", "component7", "component8", "()Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "component9", "()Lj$/time/Instant;", "copy", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;ZLcom/robinhood/utils/resource/StringResource;Ljava/util/UUID;Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;Lj$/time/Instant;)Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$BrokerageAccount;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "Ljava/util/UUID;", "getCryptoId", "Lcom/robinhood/models/api/BrokerageAccountType;", "getBrokerageAccountType", "Lcom/robinhood/models/api/ManagementType;", "getManagementType", "Z", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayName", "getMinervaId", "Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "getRhdSubAccountIds", "Lj$/time/Instant;", "getCreatedAt", "lib-store-account-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class BrokerageAccount implements HistoryAccountFilterViewInfo {
            public static final Parcelable.Creator<BrokerageAccount> CREATOR = new Creator();
            private final String accountNumber;
            private final BrokerageAccountType brokerageAccountType;
            private final Instant createdAt;
            private final UUID cryptoId;
            private final StringResource displayName;
            private final boolean isOriginalAccount;
            private final ManagementType managementType;
            private final UUID minervaId;
            private final RhdSubAccountIds rhdSubAccountIds;

            /* compiled from: AccountsHistoryStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<BrokerageAccount> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BrokerageAccount createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BrokerageAccount(parcel.readString(), (UUID) parcel.readSerializable(), BrokerageAccountType.valueOf(parcel.readString()), ManagementType.valueOf(parcel.readString()), parcel.readInt() != 0, (StringResource) parcel.readParcelable(BrokerageAccount.class.getClassLoader()), (UUID) parcel.readSerializable(), (RhdSubAccountIds) parcel.readParcelable(BrokerageAccount.class.getClassLoader()), (Instant) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BrokerageAccount[] newArray(int i) {
                    return new BrokerageAccount[i];
                }
            }

            public static /* synthetic */ BrokerageAccount copy$default(BrokerageAccount brokerageAccount, String str, UUID uuid, BrokerageAccountType brokerageAccountType, ManagementType managementType, boolean z, StringResource stringResource, UUID uuid2, RhdSubAccountIds rhdSubAccountIds, Instant instant, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = brokerageAccount.accountNumber;
                }
                if ((i & 2) != 0) {
                    uuid = brokerageAccount.cryptoId;
                }
                if ((i & 4) != 0) {
                    brokerageAccountType = brokerageAccount.brokerageAccountType;
                }
                if ((i & 8) != 0) {
                    managementType = brokerageAccount.managementType;
                }
                if ((i & 16) != 0) {
                    z = brokerageAccount.isOriginalAccount;
                }
                if ((i & 32) != 0) {
                    stringResource = brokerageAccount.displayName;
                }
                if ((i & 64) != 0) {
                    uuid2 = brokerageAccount.minervaId;
                }
                if ((i & 128) != 0) {
                    rhdSubAccountIds = brokerageAccount.rhdSubAccountIds;
                }
                if ((i & 256) != 0) {
                    instant = brokerageAccount.createdAt;
                }
                RhdSubAccountIds rhdSubAccountIds2 = rhdSubAccountIds;
                Instant instant2 = instant;
                StringResource stringResource2 = stringResource;
                UUID uuid3 = uuid2;
                boolean z2 = z;
                BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
                return brokerageAccount.copy(str, uuid, brokerageAccountType2, managementType, z2, stringResource2, uuid3, rhdSubAccountIds2, instant2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final UUID getCryptoId() {
                return this.cryptoId;
            }

            /* renamed from: component3, reason: from getter */
            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }

            /* renamed from: component4, reason: from getter */
            public final ManagementType getManagementType() {
                return this.managementType;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsOriginalAccount() {
                return this.isOriginalAccount;
            }

            /* renamed from: component6, reason: from getter */
            public final StringResource getDisplayName() {
                return this.displayName;
            }

            /* renamed from: component7, reason: from getter */
            public final UUID getMinervaId() {
                return this.minervaId;
            }

            /* renamed from: component8, reason: from getter */
            public final RhdSubAccountIds getRhdSubAccountIds() {
                return this.rhdSubAccountIds;
            }

            /* renamed from: component9, reason: from getter */
            public final Instant getCreatedAt() {
                return this.createdAt;
            }

            public final BrokerageAccount copy(String accountNumber, UUID cryptoId, BrokerageAccountType brokerageAccountType, ManagementType managementType, boolean isOriginalAccount, StringResource displayName, UUID minervaId, RhdSubAccountIds rhdSubAccountIds, Instant createdAt) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                Intrinsics.checkNotNullParameter(managementType, "managementType");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                return new BrokerageAccount(accountNumber, cryptoId, brokerageAccountType, managementType, isOriginalAccount, displayName, minervaId, rhdSubAccountIds, createdAt);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BrokerageAccount)) {
                    return false;
                }
                BrokerageAccount brokerageAccount = (BrokerageAccount) other;
                return Intrinsics.areEqual(this.accountNumber, brokerageAccount.accountNumber) && Intrinsics.areEqual(this.cryptoId, brokerageAccount.cryptoId) && this.brokerageAccountType == brokerageAccount.brokerageAccountType && this.managementType == brokerageAccount.managementType && this.isOriginalAccount == brokerageAccount.isOriginalAccount && Intrinsics.areEqual(this.displayName, brokerageAccount.displayName) && Intrinsics.areEqual(this.minervaId, brokerageAccount.minervaId) && Intrinsics.areEqual(this.rhdSubAccountIds, brokerageAccount.rhdSubAccountIds) && Intrinsics.areEqual(this.createdAt, brokerageAccount.createdAt);
            }

            public int hashCode() {
                int iHashCode = this.accountNumber.hashCode() * 31;
                UUID uuid = this.cryptoId;
                int iHashCode2 = (((((((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.managementType.hashCode()) * 31) + Boolean.hashCode(this.isOriginalAccount)) * 31) + this.displayName.hashCode()) * 31;
                UUID uuid2 = this.minervaId;
                int iHashCode3 = (iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
                RhdSubAccountIds rhdSubAccountIds = this.rhdSubAccountIds;
                return ((iHashCode3 + (rhdSubAccountIds != null ? rhdSubAccountIds.hashCode() : 0)) * 31) + this.createdAt.hashCode();
            }

            public String toString() {
                return "BrokerageAccount(accountNumber=" + this.accountNumber + ", cryptoId=" + this.cryptoId + ", brokerageAccountType=" + this.brokerageAccountType + ", managementType=" + this.managementType + ", isOriginalAccount=" + this.isOriginalAccount + ", displayName=" + this.displayName + ", minervaId=" + this.minervaId + ", rhdSubAccountIds=" + this.rhdSubAccountIds + ", createdAt=" + this.createdAt + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.accountNumber);
                dest.writeSerializable(this.cryptoId);
                dest.writeString(this.brokerageAccountType.name());
                dest.writeString(this.managementType.name());
                dest.writeInt(this.isOriginalAccount ? 1 : 0);
                dest.writeParcelable(this.displayName, flags);
                dest.writeSerializable(this.minervaId);
                dest.writeParcelable(this.rhdSubAccountIds, flags);
                dest.writeSerializable(this.createdAt);
            }

            public BrokerageAccount(String accountNumber, UUID uuid, BrokerageAccountType brokerageAccountType, ManagementType managementType, boolean z, StringResource displayName, UUID uuid2, RhdSubAccountIds rhdSubAccountIds, Instant createdAt) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
                Intrinsics.checkNotNullParameter(managementType, "managementType");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                this.accountNumber = accountNumber;
                this.cryptoId = uuid;
                this.brokerageAccountType = brokerageAccountType;
                this.managementType = managementType;
                this.isOriginalAccount = z;
                this.displayName = displayName;
                this.minervaId = uuid2;
                this.rhdSubAccountIds = rhdSubAccountIds;
                this.createdAt = createdAt;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ BrokerageAccount(String str, UUID uuid, BrokerageAccountType brokerageAccountType, ManagementType managementType, boolean z, StringResource stringResource, UUID uuid2, RhdSubAccountIds rhdSubAccountIds, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
                Instant instant2;
                RhdSubAccountIds rhdSubAccountIds2;
                uuid = (i & 2) != 0 ? null : uuid;
                uuid2 = (i & 64) != 0 ? null : uuid2;
                if ((i & 128) != 0) {
                    instant2 = instant;
                    rhdSubAccountIds2 = null;
                } else {
                    instant2 = instant;
                    rhdSubAccountIds2 = rhdSubAccountIds;
                }
                this(str, uuid, brokerageAccountType, managementType, z, stringResource, uuid2, rhdSubAccountIds2, instant2);
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final UUID getCryptoId() {
                return this.cryptoId;
            }

            public final BrokerageAccountType getBrokerageAccountType() {
                return this.brokerageAccountType;
            }

            public final ManagementType getManagementType() {
                return this.managementType;
            }

            public final boolean isOriginalAccount() {
                return this.isOriginalAccount;
            }

            @Override // com.robinhood.librobinhood.data.store.AccountsHistoryStore.HistoryAccountFilterViewInfo
            public StringResource getDisplayName() {
                return this.displayName;
            }

            public final UUID getMinervaId() {
                return this.minervaId;
            }

            public final RhdSubAccountIds getRhdSubAccountIds() {
                return this.rhdSubAccountIds;
            }

            public final Instant getCreatedAt() {
                return this.createdAt;
            }

            @Override // com.robinhood.librobinhood.data.store.AccountsHistoryStore.HistoryAccountFilterViewInfo
            public String getAccountIdentifier() {
                return this.accountNumber;
            }
        }

        /* compiled from: AccountsHistoryStore.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo$Crypto;", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "displayName", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayName$annotations", "()V", "getDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountIdentifier", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-store-account-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Crypto implements HistoryAccountFilterViewInfo {
            public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
            private final StringResource displayName;
            private final String id;

            /* compiled from: AccountsHistoryStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Crypto> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Crypto(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Crypto[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            public static /* synthetic */ Crypto copy$default(Crypto crypto2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = crypto2.id;
                }
                return crypto2.copy(str);
            }

            public static /* synthetic */ void getDisplayName$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Crypto copy(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Crypto(id);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Crypto) && Intrinsics.areEqual(this.id, ((Crypto) other).id);
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            public String toString() {
                return "Crypto(id=" + this.id + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
            }

            public Crypto(String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
                this.displayName = StringResource.INSTANCE.invoke(C41283R.string.crypto_account_filter_name, new Object[0]);
            }

            public final String getId() {
                return this.id;
            }

            @Override // com.robinhood.librobinhood.data.store.AccountsHistoryStore.HistoryAccountFilterViewInfo
            public StringResource getDisplayName() {
                return this.displayName;
            }

            @Override // com.robinhood.librobinhood.data.store.AccountsHistoryStore.HistoryAccountFilterViewInfo
            public String getAccountIdentifier() {
                return this.id;
            }
        }
    }
}
