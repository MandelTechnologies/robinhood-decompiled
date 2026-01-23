package com.robinhood.android.recurring.hub;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.recurring.hub.RecurringHubDuxo;
import com.robinhood.android.recurring.hub.RecurringHubViewState;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.flow.internal.Combine;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RecurringHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u001cJ\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00190\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0019H\u0002J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0016J\u0006\u0010%\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018X\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recurring/hub/RecurringHubViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "accountNumberStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "scheduleObs", "Lio/reactivex/Observable;", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "onCreate", "", "update", "combineAccountsToRecurringHubAccountUiModels", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/recurring/hub/RecurringHubAccountUiModel;", "accounts", "Lcom/robinhood/models/db/Account;", "accountSelected", "accountNumber", "clearAccountSelection", "Companion", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecurringHubDuxo extends OldBaseDuxo<RecurringHubViewState> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final StateFlow2<String> accountNumberStateFlow;
    private final AccountProvider accountProvider;
    private final InstrumentStore instrumentStore;
    private final TraderInvestmentScheduleStore investmentScheduleStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private Observable<List<InvestmentSchedule>> scheduleObs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringHubDuxo(AccountProvider accountProvider, TraderInvestmentScheduleStore investmentScheduleStore, InstrumentStore instrumentStore, RegionGateProvider regionGateProvider, AccountAccessStore accountAccessStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        Object[] objArr = 0 == true ? 1 : 0;
        super(new RecurringHubViewState(null, ((RecurringHubFragmentKey) companion.getArgs(savedStateHandle)).getAccountNumber(), false, false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null), objArr, 2, 0 == true ? 1 : 0);
        this.accountProvider = accountProvider;
        this.investmentScheduleStore = investmentScheduleStore;
        this.instrumentStore = instrumentStore;
        this.regionGateProvider = regionGateProvider;
        this.accountAccessStore = accountAccessStore;
        this.savedStateHandle = savedStateHandle;
        this.accountNumberStateFlow = StateFlow4.MutableStateFlow(((RecurringHubFragmentKey) companion.getArgs((HasSavedState) this)).getAccountNumber());
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C262281(null));
    }

    /* compiled from: RecurringHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1", m3645f = "RecurringHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1 */
    static final class C262281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C262281(Continuation<? super C262281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C262281 c262281 = RecurringHubDuxo.this.new C262281(continuation);
            c262281.L$0 = obj;
            return c262281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C262281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            RecurringHubDuxo.this.update();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(RecurringHubDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(RecurringHubDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(RecurringHubDuxo.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(RecurringHubDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: RecurringHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$1", m3645f = "RecurringHubDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecurringHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringHubDuxo recurringHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAllSelfDirectedAccounts()), Integer.MAX_VALUE, null, 2, null), new C26226x934ec965(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: RecurringHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountUiModels", "", "Lcom/robinhood/android/recurring/hub/RecurringHubAccountUiModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$1$2", m3645f = "RecurringHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends RecurringHubAccountUiModel>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ RecurringHubDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RecurringHubDuxo recurringHubDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = recurringHubDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends RecurringHubAccountUiModel> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<RecurringHubAccountUiModel>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<RecurringHubAccountUiModel> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final List list = (List) this.L$0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.this$0.investmentScheduleStore.refreshAccount(true, ((RecurringHubAccountUiModel) it.next()).getAccount().getAccountNumber());
                    }
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RecurringHubDuxo.C262281.AnonymousClass1.AnonymousClass2.invokeSuspend$lambda$0(list, (RecurringHubViewState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RecurringHubViewState invokeSuspend$lambda$0(List list, RecurringHubViewState recurringHubViewState) {
                    return recurringHubViewState.mutateAccounts(list);
                }
            }
        }

        /* compiled from: RecurringHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$2", m3645f = "RecurringHubDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecurringHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringHubDuxo recurringHubDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.accountNumberStateFlow, new C26227xea6cba44(null, this.this$0));
                    C504842 c504842 = new C504842(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c504842, this) == coroutine_suspended) {
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

            /* compiled from: RecurringHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$2$2", m3645f = "RecurringHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C504842 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ RecurringHubDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504842(RecurringHubDuxo recurringHubDuxo, Continuation<? super C504842> continuation) {
                    super(2, continuation);
                    this.this$0 = recurringHubDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504842 c504842 = new C504842(this.this$0, continuation);
                    c504842.Z$0 = ((Boolean) obj).booleanValue();
                    return c504842;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C504842) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final boolean z = this.Z$0;
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$2$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RecurringHubDuxo.C262281.AnonymousClass2.C504842.invokeSuspend$lambda$0(z, (RecurringHubViewState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RecurringHubViewState invokeSuspend$lambda$0(boolean z, RecurringHubViewState recurringHubViewState) {
                    return RecurringHubViewState.copy$default(recurringHubViewState, null, null, z, false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
                }
            }
        }

        /* compiled from: RecurringHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$3", m3645f = "RecurringHubDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecurringHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(RecurringHubDuxo recurringHubDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = recurringHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, InvestFlowRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: RecurringHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$3$1", m3645f = "RecurringHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ RecurringHubDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RecurringHubDuxo recurringHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = recurringHubDuxo;
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
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final boolean z = this.Z$0;
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$3$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RecurringHubDuxo.C262281.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(z, (RecurringHubViewState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RecurringHubViewState invokeSuspend$lambda$0(boolean z, RecurringHubViewState recurringHubViewState) {
                    return RecurringHubViewState.copy$default(recurringHubViewState, null, null, false, false, null, null, null, z, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                }
            }
        }

        /* compiled from: RecurringHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$4", m3645f = "RecurringHubDuxo.kt", m3646l = {111}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecurringHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(RecurringHubDuxo recurringHubDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = recurringHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: RecurringHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$4$1", m3645f = "RecurringHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ RecurringHubDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RecurringHubDuxo recurringHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = recurringHubDuxo;
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
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final boolean z = this.Z$0;
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$onCreate$1$4$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RecurringHubDuxo.C262281.AnonymousClass4.AnonymousClass1.invokeSuspend$lambda$0(z, (RecurringHubViewState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final RecurringHubViewState invokeSuspend$lambda$0(boolean z, RecurringHubViewState recurringHubViewState) {
                    return RecurringHubViewState.copy$default(recurringHubViewState, null, null, false, z, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
                }
            }
        }
    }

    public final void update() {
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        Observable<List<InvestmentSchedule>> observableShare = this.investmentScheduleStore.getStreamAllInvestmentSchedules().asObservable(Unit.INSTANCE).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo.update.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.LOADING_INVESTMENT_SCHEDULES, true);
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo.update.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(List<InvestmentSchedule> list) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.LOADING_INVESTMENT_SCHEDULES, false);
            }
        }).share();
        this.scheduleObs = observableShare;
        if (observableShare == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleObs");
            observableShare = null;
        }
        Observable<R> observableFlatMap = observableShare.flatMap(new C262313());
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.update$lambda$2(this.f$0, (List) obj);
            }
        });
        Observable<List<InvestmentSchedule>> observable = this.scheduleObs;
        if (observable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleObs");
            observable = null;
        }
        Observable<List<InvestmentSchedule>> observableDoOnSubscribe = observable.doOnSubscribe(new C262325());
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.update$lambda$4(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.update$lambda$6(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: RecurringHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$update$3 */
    static final class C262313<T, R> implements Function {
        C262313() {
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends List<Instrument>> apply(List<InvestmentSchedule> schedules) {
            Intrinsics.checkNotNullParameter(schedules, "schedules");
            ArrayList arrayList = new ArrayList();
            for (T t : schedules) {
                if (((InvestmentSchedule) t).isInstrument()) {
                    arrayList.add(t);
                }
            }
            return RecurringHubDuxo.this.instrumentStore.getInstruments(arrayList, new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$update$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringHubDuxo.C262313.apply$lambda$1((InvestmentSchedule) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID apply$lambda$1(InvestmentSchedule it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UUID instrumentId = it.getInvestmentTarget().getInstrumentId();
            Intrinsics.checkNotNull(instrumentId);
            return instrumentId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit update$lambda$2(RecurringHubDuxo recurringHubDuxo, final List list) {
        recurringHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.update$lambda$2$lambda$1(list, (RecurringHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringHubViewState update$lambda$2$lambda$1(List list, RecurringHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Instrument) obj).isEtpOrCef()) {
                arrayList.add(obj);
            }
        }
        return RecurringHubViewState.copy$default(applyMutation, null, null, false, false, null, null, arrayList, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    /* compiled from: RecurringHubDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$update$5 */
    static final class C262325<T> implements Consumer {
        C262325() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecurringHubViewState accept$lambda$0(RecurringHubViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RecurringHubViewState.copy$default(applyMutation, RecurringHubViewState.State.LOADING, null, false, false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RecurringHubDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$update$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringHubDuxo.C262325.accept$lambda$0((RecurringHubViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit update$lambda$4(RecurringHubDuxo recurringHubDuxo, final List list) {
        recurringHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.update$lambda$4$lambda$3(list, (RecurringHubViewState) obj);
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.LOADING_INVESTMENT_SCHEDULES, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringHubViewState update$lambda$4$lambda$3(List list, RecurringHubViewState applyMutation) {
        RecurringHubViewState.State state;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        if (list.isEmpty() && !applyMutation.getShowAccountSelector()) {
            state = RecurringHubViewState.State.EMPTY;
        } else {
            state = RecurringHubViewState.State.NON_EMPTY;
        }
        return RecurringHubViewState.copy$default(applyMutation, state, null, false, false, null, list, null, false, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit update$lambda$6(RecurringHubDuxo recurringHubDuxo, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<unused var>");
        recurringHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.update$lambda$6$lambda$5((RecurringHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringHubViewState update$lambda$6$lambda$5(RecurringHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringHubViewState.copy$default(applyMutation, RecurringHubViewState.State.ERROR, null, false, false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<RecurringHubAccountUiModel>> combineAccountsToRecurringHubAccountUiModels(List<Account> accounts2) {
        List<Account> listFilterDeactivatedForSwitcher = AccountSwitcherUtils4.filterDeactivatedForSwitcher(accounts2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterDeactivatedForSwitcher, 10));
        for (final Account account : listFilterDeactivatedForSwitcher) {
            final Flow<Boolean> featureAccess = this.accountAccessStore.getFeatureAccess(account, AccountFeature.RECURRING);
            arrayList.add(new Flow<RecurringHubAccountUiModel>() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$lambda$8$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super RecurringHubAccountUiModel> flowCollector, Continuation continuation) {
                    Object objCollect = featureAccess.collect(new AnonymousClass2(flowCollector, account), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$lambda$8$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ Account $account$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$lambda$8$$inlined$map$1$2", m3645f = "RecurringHubDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$lambda$8$$inlined$map$1$2$1, reason: invalid class name */
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
                            RecurringHubAccountUiModel recurringHubAccountUiModel = new RecurringHubAccountUiModel(this.$account$inlined, ((Boolean) obj).booleanValue());
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(recurringHubAccountUiModel, anonymousClass1) == coroutine_suspended) {
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
        return FlowKt.distinctUntilChanged(new Flow<List<? extends RecurringHubAccountUiModel>>() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends RecurringHubAccountUiModel>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<RecurringHubAccountUiModel[]>() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final RecurringHubAccountUiModel[] invoke() {
                        return new RecurringHubAccountUiModel[flowArr2.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$$inlined$combine$1$3", m3645f = "RecurringHubDuxo.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.recurring.hub.RecurringHubDuxo$combineAccountsToRecurringHubAccountUiModels$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends RecurringHubAccountUiModel>>, RecurringHubAccountUiModel[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super List<? extends RecurringHubAccountUiModel>> flowCollector, RecurringHubAccountUiModel[] recurringHubAccountUiModelArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = recurringHubAccountUiModelArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        List list = ArraysKt.toList((RecurringHubAccountUiModel[]) ((Object[]) this.L$1));
                        this.label = 1;
                        if (flowCollector.emit(list, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringHubViewState accountSelected$lambda$10(String str, RecurringHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringHubViewState.copy$default(applyMutation, null, str, false, false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    public final void accountSelected(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.accountSelected$lambda$10(accountNumber, (RecurringHubViewState) obj);
            }
        });
        this.accountNumberStateFlow.setValue(accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringHubViewState clearAccountSelection$lambda$11(RecurringHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringHubViewState.copy$default(applyMutation, null, null, false, false, null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    public final void clearAccountSelection() {
        applyMutation(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringHubDuxo.clearAccountSelection$lambda$11((RecurringHubViewState) obj);
            }
        });
        this.accountNumberStateFlow.setValue(null);
    }

    /* compiled from: RecurringHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recurring/hub/RecurringHubDuxo;", "Lcom/robinhood/shared/recurring/contracts/RecurringHubFragmentKey;", "<init>", "()V", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringHubDuxo, RecurringHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringHubFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringHubFragmentKey getArgs(RecurringHubDuxo recurringHubDuxo) {
            return (RecurringHubFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, recurringHubDuxo);
        }
    }
}
