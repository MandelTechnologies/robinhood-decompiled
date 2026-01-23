package com.robinhood.store.futures.mib;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.p320db.Account;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MiBFuturesAccountPlugin.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0016J\u0010\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016J\u0010\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\rH\u0016J\u000e\u0010\u0014\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/futures/mib/MiBFuturesAccountPlugin;", "Lcom/robinhood/store/futures/mib/MiBFuturesAccountProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/experiments/ExperimentsProvider;)V", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "getExperimentsProvider", "()Lcom/robinhood/experiments/ExperimentsProvider;", "streamRhsAccountWithFuturesAccount", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Account;", "streamUserMiBFuturesState", "Lcom/robinhood/store/futures/mib/MiBFuturesState;", "streamRhsAccountWithFuturesAccountAllowed", "streamRhsAccountNumberWithFuturesAccountAllowed", "", "forceGetMibFuturesState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class MiBFuturesAccountPlugin implements MiBFuturesAccountProvider {
    private final AccountProvider accountProvider;
    private final ExperimentsProvider experimentsProvider;

    /* compiled from: MiBFuturesAccountPlugin.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.mib.MiBFuturesAccountPlugin", m3645f = "MiBFuturesAccountPlugin.kt", m3646l = {49, 49}, m3647m = "forceGetMibFuturesState")
    /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$forceGetMibFuturesState$1 */
    static final class C415231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C415231(Continuation<? super C415231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MiBFuturesAccountPlugin.this.forceGetMibFuturesState(this);
        }
    }

    public MiBFuturesAccountPlugin(AccountProvider accountProvider, ExperimentsProvider experimentsProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.accountProvider = accountProvider;
        this.experimentsProvider = experimentsProvider;
    }

    public final AccountProvider getAccountProvider() {
        return this.accountProvider;
    }

    public final ExperimentsProvider getExperimentsProvider() {
        return this.experimentsProvider;
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<Account> streamRhsAccountWithFuturesAccount() {
        final Flow<List<Account>> flowStreamAllSelfDirectedIndividualAccounts = this.accountProvider.streamAllSelfDirectedIndividualAccounts();
        return FlowKt.distinctUntilChanged(new Flow<Account>() { // from class: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccount$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccount$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccount$$inlined$map$1$2", m3645f = "MiBFuturesAccountPlugin.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccount$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (((Account) next).getHasFuturesAccount()) {
                                break;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAllSelfDirectedIndividualAccounts.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<MiBFuturesState> streamUserMiBFuturesState() {
        return FlowKt.combine(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsProvider, new Experiment[]{MiBFuturesExperiment.INSTANCE}, false, null, 6, null), this.accountProvider.streamAllSelfDirectedIndividualAccounts(), C415251.INSTANCE);
    }

    /* compiled from: MiBFuturesAccountPlugin.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamUserMiBFuturesState$1 */
    /* synthetic */ class C415251 extends AdaptedFunctionReference implements Function3<Boolean, List<? extends Account>, Continuation<? super MiBFuturesState>, Object>, ContinuationImpl6 {
        public static final C415251 INSTANCE = new C415251();

        C415251() {
            super(3, MiBFuturesAccountPlugin2.class, "buildMiBFuturesState", "buildMiBFuturesState(ZLjava/util/List;)Lcom/robinhood/store/futures/mib/MiBFuturesState;", 5);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, List<? extends Account> list, Continuation<? super MiBFuturesState> continuation) {
            return invoke(bool.booleanValue(), (List<Account>) list, continuation);
        }

        public final Object invoke(boolean z, List<Account> list, Continuation<? super MiBFuturesState> continuation) {
            return MiBFuturesAccountPlugin.streamUserMiBFuturesState$buildMiBFuturesState(z, list, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object streamUserMiBFuturesState$buildMiBFuturesState(boolean z, List list, Continuation continuation) {
        return MiBFuturesAccountPlugin2.buildMiBFuturesState(z, list);
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<Account> streamRhsAccountWithFuturesAccountAllowed() {
        final Flow<List<Account>> flowStreamAllSelfDirectedIndividualAccounts = this.accountProvider.streamAllSelfDirectedIndividualAccounts();
        return new Flow<Account>() { // from class: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccountAllowed$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccountAllowed$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccountAllowed$$inlined$map$1$2", m3645f = "MiBFuturesAccountPlugin.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountWithFuturesAccountAllowed$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
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
                        Account accountFuturesAllowedAccount = MiBFuturesAccountPlugin2.futuresAllowedAccount((List) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(accountFuturesAllowedAccount, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAllSelfDirectedIndividualAccounts.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    public Flow<String> streamRhsAccountNumberWithFuturesAccountAllowed() {
        final Flow<Account> flowStreamRhsAccountWithFuturesAccountAllowed = streamRhsAccountWithFuturesAccountAllowed();
        return FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountNumberWithFuturesAccountAllowed$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountNumberWithFuturesAccountAllowed$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountNumberWithFuturesAccountAllowed$$inlined$map$1$2", m3645f = "MiBFuturesAccountPlugin.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$streamRhsAccountNumberWithFuturesAccountAllowed$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
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
                        Account account = (Account) obj;
                        String accountNumber = account != null ? account.getAccountNumber() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                Object objCollect = flowStreamRhsAccountWithFuturesAccountAllowed.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.store.futures.mib.MiBFuturesAccountProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object forceGetMibFuturesState(Continuation<? super MiBFuturesState> continuation) {
        C415231 c415231;
        if (continuation instanceof C415231) {
            c415231 = (C415231) continuation;
            int i = c415231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415231.label = i - Integer.MIN_VALUE;
            } else {
                c415231 = new C415231(continuation);
            }
        }
        Object objFirstOrNull = c415231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c415231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow flowCombine = FlowKt.combine(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsProvider, new Experiment[]{MiBFuturesExperiment.INSTANCE}, false, null, 6, null), this.accountProvider.getAllSelfDirectedIndividualAccountsForced(), C415242.INSTANCE);
            c415231.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowCombine, c415231);
            if (objFirstOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
            return objFirstOrNull;
        }
        ResultKt.throwOnFailure(objFirstOrNull);
        Object objFirst = (MiBFuturesState) objFirstOrNull;
        if (objFirst == null) {
            Flow<MiBFuturesState> flowStreamUserMiBFuturesState = streamUserMiBFuturesState();
            c415231.label = 2;
            objFirst = FlowKt.first(flowStreamUserMiBFuturesState, c415231);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return objFirst;
    }

    /* compiled from: MiBFuturesAccountPlugin.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.mib.MiBFuturesAccountPlugin$forceGetMibFuturesState$2 */
    /* synthetic */ class C415242 extends AdaptedFunctionReference implements Function3<Boolean, List<? extends Account>, Continuation<? super MiBFuturesState>, Object>, ContinuationImpl6 {
        public static final C415242 INSTANCE = new C415242();

        C415242() {
            super(3, MiBFuturesAccountPlugin2.class, "buildMiBFuturesState", "buildMiBFuturesState(ZLjava/util/List;)Lcom/robinhood/store/futures/mib/MiBFuturesState;", 5);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, List<? extends Account> list, Continuation<? super MiBFuturesState> continuation) {
            return invoke(bool.booleanValue(), (List<Account>) list, continuation);
        }

        public final Object invoke(boolean z, List<Account> list, Continuation<? super MiBFuturesState> continuation) {
            return MiBFuturesAccountPlugin.forceGetMibFuturesState$buildMiBFuturesState$4(z, list, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object forceGetMibFuturesState$buildMiBFuturesState$4(boolean z, List list, Continuation continuation) {
        return MiBFuturesAccountPlugin2.buildMiBFuturesState(z, list);
    }
}
