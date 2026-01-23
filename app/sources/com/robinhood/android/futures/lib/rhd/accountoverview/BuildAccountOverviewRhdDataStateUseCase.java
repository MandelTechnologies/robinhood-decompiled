package com.robinhood.android.futures.lib.rhd.accountoverview;

import com.robinhood.android.regiongate.FuturesTradingOrEventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: BuildAccountOverviewRhdDataStateUseCase.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/futures/lib/rhd/accountoverview/BuildAccountOverviewRhdDataStateUseCase;", "", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "activeAccountNumberStates", "", "lib-rhd-account-overview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BuildAccountOverviewRhdDataStateUseCase {
    private final FuturesAccountStore futuresAccountStore;
    private final RegionGateProvider regionGateProvider;

    public BuildAccountOverviewRhdDataStateUseCase(FuturesAccountStore futuresAccountStore, RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.futuresAccountStore = futuresAccountStore;
        this.regionGateProvider = regionGateProvider;
    }

    public final Flow<RhdAccountDataState> invoke(Flow<String> activeAccountNumberStates) {
        Intrinsics.checkNotNullParameter(activeAccountNumberStates, "activeAccountNumberStates");
        final Flow<MiBFuturesState> flowStreamUserMiBFuturesState = this.futuresAccountStore.streamUserMiBFuturesState();
        final Flow<Account> flow = new Flow<Account>() { // from class: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$1$2 */
            public static final class C172882<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$1$2", m3645f = "BuildAccountOverviewRhdDataStateUseCase.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C172882.this.emit(null, this);
                    }
                }

                public C172882(FlowCollector flowCollector) {
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
                        Account futuresAllowedRhsAccount = ((MiBFuturesState) obj).getFuturesAllowedRhsAccount();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresAllowedRhsAccount, anonymousClass1) == coroutine_suspended) {
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
                Object objCollect = flowStreamUserMiBFuturesState.collect(new C172882(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return Operators.connectWhen$default(FlowKt.combine(activeAccountNumberStates, flowStreamUserMiBFuturesState, FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$2$2 */
            public static final class C172892<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$2$2", m3645f = "BuildAccountOverviewRhdDataStateUseCase.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C172892.this.emit(null, this);
                    }
                }

                public C172892(FlowCollector flowCollector) {
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
                Object objCollect = flow.collect(new C172892(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C17287x4c6c61e8(null, this)), C172901.INSTANCE), Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, FuturesTradingOrEventContractsRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null), null, 2, null);
    }

    /* compiled from: BuildAccountOverviewRhdDataStateUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.BuildAccountOverviewRhdDataStateUseCase$invoke$1 */
    /* synthetic */ class C172901 extends AdaptedFunctionReference implements Function4<String, MiBFuturesState, AccountFuturesEligibilityStatusDto, Continuation<? super RhdAccountDataState>, Object>, ContinuationImpl6 {
        public static final C172901 INSTANCE = new C172901();

        C172901() {
            super(4, BuildAccountOverviewRhdDataStateUseCase2.class, "buildRhdAccountDataState", "buildRhdAccountDataState(Ljava/lang/String;Lcom/robinhood/store/futures/mib/MiBFuturesState;Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;)Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", 5);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(String str, MiBFuturesState miBFuturesState, AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, Continuation<? super RhdAccountDataState> continuation) {
            return BuildAccountOverviewRhdDataStateUseCase.invoke$buildRhdAccountDataState(str, miBFuturesState, accountFuturesEligibilityStatusDto, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invoke$buildRhdAccountDataState(String str, MiBFuturesState miBFuturesState, AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, Continuation continuation) {
        return BuildAccountOverviewRhdDataStateUseCase2.buildRhdAccountDataState(str, miBFuturesState, accountFuturesEligibilityStatusDto);
    }
}
