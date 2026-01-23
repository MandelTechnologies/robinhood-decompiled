package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.FeatureLock;
import com.robinhood.models.p320db.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AccountAccessStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00140\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00160\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "getFeatureAccess", "Lkotlinx/coroutines/flow/Flow;", "", "accountNumber", "", "feature", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "account", "Lcom/robinhood/models/db/Account;", "getAccessibleFeatures", "", "filterAccountsWithFeatureAccess", "", "accounts", "resolveLockFlow", "lock", "Lcom/robinhood/librobinhood/data/store/FeatureLock;", "lib-store-account-access_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AccountAccessStore {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final RegionGateProvider regionGateProvider;

    public AccountAccessStore(AccountProvider accountProvider, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
    }

    public final Flow<Boolean> getFeatureAccess(String accountNumber, AccountFeature feature) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (accountNumber.length() <= 0) {
            throw new IllegalArgumentException("Account number cannot be empty to get feature access.");
        }
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(accountNumber)), Integer.MAX_VALUE, null, 2, null), new AccountAccessStore$getFeatureAccess$$inlined$flatMapLatest$1(null, this, feature));
    }

    public final Flow<Boolean> getFeatureAccess(Account account, AccountFeature feature) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(feature, "feature");
        return FlowKt.distinctUntilChanged(resolveLockFlow(account, feature.getLock()));
    }

    public final Flow<Set<AccountFeature>> getAccessibleFeatures(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (accountNumber.length() <= 0) {
            throw new IllegalArgumentException("Account number cannot be empty to get accessible features.");
        }
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAccount(accountNumber)), Integer.MAX_VALUE, null, 2, null), new C33481x725e9609(null, this));
    }

    public final Flow<Set<AccountFeature>> getAccessibleFeatures(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        EnumEntries<AccountFeature> entries = AccountFeature.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        for (final AccountFeature accountFeature : entries) {
            final Flow<Boolean> flowResolveLockFlow = resolveLockFlow(account, accountFeature.getLock());
            arrayList.add(new Flow<Tuples2<? extends AccountFeature, ? extends Boolean>>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$lambda$5$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$lambda$5$$inlined$map$1$2 */
                public static final class C334822<T> implements FlowCollector {
                    final /* synthetic */ AccountFeature $feature$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$lambda$5$$inlined$map$1$2", m3645f = "AccountAccessStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C334822.this.emit(null, this);
                        }
                    }

                    public C334822(FlowCollector flowCollector, AccountFeature accountFeature) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$feature$inlined = accountFeature;
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
                            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$feature$inlined, boxing.boxBoolean(((Boolean) obj).booleanValue()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Tuples2<? extends AccountFeature, ? extends Boolean>> flowCollector, Continuation continuation) {
                    Object objCollect = flowResolveLockFlow.collect(new C334822(flowCollector, accountFeature), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
        return FlowKt.distinctUntilChanged(new Flow<Set<? extends AccountFeature>>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$$inlined$combine$1

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$$inlined$combine$1$3", m3645f = "AccountAccessStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$$inlined$combine$1$3 */
            public static final class C334803 extends ContinuationImpl7 implements Function3<FlowCollector<? super Set<? extends AccountFeature>>, Tuples2<? extends AccountFeature, ? extends Boolean>[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C334803(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Set<? extends AccountFeature>> flowCollector, Tuples2<? extends AccountFeature, ? extends Boolean>[] tuples2Arr, Continuation<? super Unit> continuation) {
                    C334803 c334803 = new C334803(continuation);
                    c334803.L$0 = flowCollector;
                    c334803.L$1 = tuples2Arr;
                    return c334803.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Tuples2[] tuples2Arr = (Tuples2[]) ((Object[]) this.L$1);
                        ArrayList arrayList = new ArrayList();
                        for (Tuples2 tuples2 : tuples2Arr) {
                            if (((Boolean) tuples2.getSecond()).booleanValue()) {
                                arrayList.add(tuples2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((AccountFeature) ((Tuples2) it.next()).getFirst());
                        }
                        Set set = CollectionsKt.toSet(arrayList2);
                        this.label = 1;
                        if (flowCollector.emit(set, this) == coroutine_suspended) {
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
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Set<? extends AccountFeature>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Tuples2<? extends AccountFeature, ? extends Boolean>[]>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$getAccessibleFeatures$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Tuples2<? extends AccountFeature, ? extends Boolean>[] invoke() {
                        return new Tuples2[flowArr2.length];
                    }
                }, new C334803(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }
        });
    }

    public final Flow<List<Account>> filterAccountsWithFeatureAccess(List<Account> accounts2, AccountFeature feature) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(feature, "feature");
        List<Account> list = accounts2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (final Account account : list) {
            final Flow<Boolean> featureAccess = getFeatureAccess(account, feature);
            arrayList.add(new Flow<Tuples2<? extends Account, ? extends Boolean>>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$lambda$10$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends Account, ? extends Boolean>> flowCollector, Continuation continuation) {
                    Object objCollect = featureAccess.collect(new AnonymousClass2(flowCollector, account), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$lambda$10$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ Account $account$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$lambda$10$$inlined$map$1$2", m3645f = "AccountAccessStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$lambda$10$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, Account account) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$account$inlined = account;
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
                            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$account$inlined, boxing.boxBoolean(((Boolean) obj).booleanValue()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
            });
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
        return FlowKt.distinctUntilChanged(new Flow<List<? extends Account>>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Account>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Tuples2<? extends Account, ? extends Boolean>[]>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Tuples2<? extends Account, ? extends Boolean>[] invoke() {
                        return new Tuples2[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$$inlined$combine$1$3", m3645f = "AccountAccessStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$filterAccountsWithFeatureAccess$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Account>>, Tuples2<? extends Account, ? extends Boolean>[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super List<? extends Account>> flowCollector, Tuples2<? extends Account, ? extends Boolean>[] tuples2Arr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = tuples2Arr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Tuples2[] tuples2Arr = (Tuples2[]) ((Object[]) this.L$1);
                        ArrayList arrayList = new ArrayList();
                        for (Tuples2 tuples2 : tuples2Arr) {
                            if (((Boolean) tuples2.getSecond()).booleanValue()) {
                                arrayList.add(tuples2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((Account) ((Tuples2) it.next()).getFirst());
                        }
                        this.label = 1;
                        if (flowCollector.emit(arrayList2, this) == coroutine_suspended) {
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
            }
        });
    }

    private final Flow<Boolean> resolveLockFlow(Account account, FeatureLock lock) {
        if (lock instanceof FeatureLock.And) {
            List<FeatureLock> locks = ((FeatureLock.And) lock).getLocks();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(locks, 10));
            Iterator<T> it = locks.iterator();
            while (it.hasNext()) {
                arrayList.add(resolveLockFlow(account, (FeatureLock) it.next()));
            }
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
            return new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    final Flow[] flowArr2 = flowArr;
                    Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Boolean[]>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean[] invoke() {
                            return new Boolean[flowArr2.length];
                        }
                    }, new C334843(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$1$3", m3645f = "AccountAccessStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$1$3 */
                public static final class C334843 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C334843(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Boolean[] boolArr, Continuation<? super Unit> continuation) {
                        C334843 c334843 = new C334843(continuation);
                        c334843.L$0 = flowCollector;
                        c334843.L$1 = boolArr;
                        return c334843.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            Boolean[] boolArr = (Boolean[]) ((Object[]) this.L$1);
                            int length = boolArr.length;
                            boolean z = false;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = true;
                                    break;
                                }
                                if (!boolArr[i2].booleanValue()) {
                                    break;
                                }
                                i2++;
                            }
                            Boolean boolBoxBoolean = boxing.boxBoolean(z);
                            this.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
                }
            };
        }
        if (lock instanceof FeatureLock.Or) {
            List<FeatureLock> locks2 = ((FeatureLock.Or) lock).getLocks();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(locks2, 10));
            Iterator<T> it2 = locks2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(resolveLockFlow(account, (FeatureLock) it2.next()));
            }
            final Flow[] flowArr2 = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
            return new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$2
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    final Flow[] flowArr3 = flowArr2;
                    Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr3, new Function0<Boolean[]>() { // from class: com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$2.2
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean[] invoke() {
                            return new Boolean[flowArr3.length];
                        }
                    }, new C334863(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$2$3", m3645f = "AccountAccessStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.AccountAccessStore$resolveLockFlow$$inlined$combine$2$3 */
                public static final class C334863 extends ContinuationImpl7 implements Function3<FlowCollector<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public C334863(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Boolean[] boolArr, Continuation<? super Unit> continuation) {
                        C334863 c334863 = new C334863(continuation);
                        c334863.L$0 = flowCollector;
                        c334863.L$1 = boolArr;
                        return c334863.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            Boolean[] boolArr = (Boolean[]) ((Object[]) this.L$1);
                            int length = boolArr.length;
                            boolean z = false;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                if (boolArr[i2].booleanValue()) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            Boolean boolBoxBoolean = boxing.boxBoolean(z);
                            this.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
                }
            };
        }
        if (lock instanceof FeatureLock.BrokerageAccountTypes) {
            return FlowKt.flowOf(Boolean.valueOf(((FeatureLock.BrokerageAccountTypes) lock).getBrokerageAccountTypes().contains(account.getBrokerageAccountType())));
        }
        if (lock instanceof FeatureLock.ExperimentLock) {
            return ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{((FeatureLock.ExperimentLock) lock).getExperiment()}, false, null, 6, null);
        }
        if (lock instanceof FeatureLock.ManagementTypes) {
            return FlowKt.flowOf(Boolean.valueOf(((FeatureLock.ManagementTypes) lock).getManagementTypes().contains(account.getManagementType())));
        }
        if (lock instanceof FeatureLock.OptionLevel) {
            return FlowKt.flowOf(Boolean.valueOf(((FeatureLock.OptionLevel) lock).getOptionLevels().contains(account.getOptionLevel())));
        }
        if (lock instanceof FeatureLock.Region) {
            return RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.regionGateProvider, ((FeatureLock.Region) lock).getRegionGate(), false, 2, null);
        }
        if (lock instanceof FeatureLock.OriginalAccount) {
            return FlowKt.flowOf(Boolean.valueOf(account.isOriginal()));
        }
        if (lock instanceof FeatureLock.AccountTypes) {
            return FlowKt.flowOf(Boolean.valueOf(((FeatureLock.AccountTypes) lock).getAccountTypes().contains(account.getType())));
        }
        throw new NoWhenBranchMatchedException();
    }
}
