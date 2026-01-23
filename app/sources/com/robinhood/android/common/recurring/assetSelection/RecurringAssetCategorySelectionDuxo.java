package com.robinhood.android.common.recurring.assetSelection;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.retirement.p194db.RetirementContributionsSummary;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.librobinhood.data.store.SweepsStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementContributionsSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RecurringAssetCategorySelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDataState;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "sweepsStatusStore", "Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "retirementContributionsSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsSummaryStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "stateProvider", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SweepsStatusStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementContributionsSummaryStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringAssetCategorySelectionDuxo extends BaseDuxo<RecurringAssetCategorySelectionDataState, RecurringAssetCategorySelectionViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final RetirementContributionsSummaryStore retirementContributionsSummaryStore;
    private final RetirementMatchStore retirementMatchStore;
    private final SavedStateHandle savedStateHandle;
    private final SweepsStatusStore sweepsStatusStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecurringAssetCategorySelectionDuxo(SweepsStatusStore sweepsStatusStore, AccountProvider accountProvider, RetirementContributionsSummaryStore retirementContributionsSummaryStore, RetirementMatchStore retirementMatchStore, RecurringAssetCategorySelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(sweepsStatusStore, "sweepsStatusStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(retirementContributionsSummaryStore, "retirementContributionsSummaryStore");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecurringAssetCategorySelectionDataState(null, false, null, null, false, false, null, null, null, ((RecurringAssetCategorySelectionFragment.Args) companion.getArgs(savedStateHandle)).getBrokerageCashOptionEnabled(), ((RecurringAssetCategorySelectionFragment.Args) companion.getArgs(savedStateHandle)).getRetirementCashOptionEnabled(), ((RecurringAssetCategorySelectionFragment.Args) companion.getArgs(savedStateHandle)).getInvestmentOptionEnabled(), 511, null), stateProvider, duxoBundle);
        this.sweepsStatusStore = sweepsStatusStore;
        this.accountProvider = accountProvider;
        this.retirementContributionsSummaryStore = retirementContributionsSummaryStore;
        this.retirementMatchStore = retirementMatchStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.sweepsStatusStore.refresh(true);
        this.accountProvider.refresh(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C116261(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C116272(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C116283(null), 3, null);
    }

    /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$1", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$1 */
    static final class C116261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C116261(Continuation<? super C116261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringAssetCategorySelectionDuxo.this.new C116261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C116261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<SweepsStatus> observableDistinctUntilChanged = RecurringAssetCategorySelectionDuxo.this.sweepsStatusStore.stream().distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecurringAssetCategorySelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sweepsStatus", "Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$1$1", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SweepsStatus, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringAssetCategorySelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringAssetCategorySelectionDuxo recurringAssetCategorySelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringAssetCategorySelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SweepsStatus sweepsStatus, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(sweepsStatus, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$1$1$1", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496941 extends ContinuationImpl7 implements Function2<RecurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState>, Object> {
                final /* synthetic */ SweepsStatus $sweepsStatus;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496941(SweepsStatus sweepsStatus, Continuation<? super C496941> continuation) {
                    super(2, continuation);
                    this.$sweepsStatus = sweepsStatus;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496941 c496941 = new C496941(this.$sweepsStatus, continuation);
                    c496941.L$0 = obj;
                    return c496941;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RecurringAssetCategorySelectionDataState recurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState> continuation) {
                    return ((C496941) create(recurringAssetCategorySelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return RecurringAssetCategorySelectionDataState.copy$default((RecurringAssetCategorySelectionDataState) this.L$0, this.$sweepsStatus, false, null, null, false, false, null, null, null, false, false, false, 4094, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496941((SweepsStatus) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2 */
    static final class C116272 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C116272(Continuation<? super C116272> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringAssetCategorySelectionDuxo.this.new C116272(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C116272) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<List<Account>> observableStreamAllSelfDirectedAccounts = RecurringAssetCategorySelectionDuxo.this.accountProvider.streamAllSelfDirectedAccounts();
                final RecurringAssetCategorySelectionDuxo recurringAssetCategorySelectionDuxo = RecurringAssetCategorySelectionDuxo.this;
                ObservableSource observableSourceFlatMap = observableStreamAllSelfDirectedAccounts.flatMap(new Function() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo.onStart.2.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends Tuples2<Optional<RetirementContributionsSummary>, Optional<RetirementContributionsSummary>>> apply(List<Account> accounts2) {
                        T next;
                        T next2;
                        T next3;
                        T next4;
                        Intrinsics.checkNotNullParameter(accounts2, "accounts");
                        List<Account> list = accounts2;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (((Account) next).getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
                                break;
                            }
                        }
                        Account account = next;
                        boolean z = account != null && account.isGold();
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = (T) null;
                                break;
                            }
                            next2 = it2.next();
                            if (((Account) next2).getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH) {
                                break;
                            }
                        }
                        Account account2 = next2;
                        String accountNumber = account2 != null ? account2.getAccountNumber() : null;
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next3 = (T) null;
                                break;
                            }
                            next3 = it3.next();
                            if (((Account) next3).getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL) {
                                break;
                            }
                        }
                        Account account3 = next3;
                        String accountNumber2 = account3 != null ? account3.getAccountNumber() : null;
                        Iterator<T> it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next4 = (T) null;
                                break;
                            }
                            next4 = it4.next();
                            if (((Account) next4).getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
                                break;
                            }
                        }
                        Account account4 = next4;
                        recurringAssetCategorySelectionDuxo.applyMutation(new C496951(z, account4 != null ? account4.getAccountNumber() : null, accountNumber, accountNumber2, null));
                        Observables observables = Observables.INSTANCE;
                        Observable<R> map = accountNumber != null ? recurringAssetCategorySelectionDuxo.retirementContributionsSummaryStore.getQuery().asObservable(accountNumber).map(new Function() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo.onStart.2.1.2
                            @Override // io.reactivex.functions.Function
                            public final Optional<RetirementContributionsSummary> apply(RetirementContributionsSummary it5) {
                                Intrinsics.checkNotNullParameter(it5, "it");
                                return Optional3.asOptional(it5);
                            }
                        }) : Observable.just(Optional2.INSTANCE);
                        Intrinsics.checkNotNull(map);
                        Observable<R> map2 = accountNumber2 != null ? recurringAssetCategorySelectionDuxo.retirementContributionsSummaryStore.getQuery().asObservable(accountNumber2).map(new Function() { // from class: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo.onStart.2.1.3
                            @Override // io.reactivex.functions.Function
                            public final Optional<RetirementContributionsSummary> apply(RetirementContributionsSummary it5) {
                                Intrinsics.checkNotNullParameter(it5, "it");
                                return Optional3.asOptional(it5);
                            }
                        }) : Observable.just(Optional2.INSTANCE);
                        Intrinsics.checkNotNull(map2);
                        return observables.zip(map, map2);
                    }

                    /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2$1$1", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C496951 extends ContinuationImpl7 implements Function2<RecurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState>, Object> {
                        final /* synthetic */ String $brokerageAccountNumber;
                        final /* synthetic */ boolean $hasGoldSubscription;
                        final /* synthetic */ String $rothIraAccountNumber;
                        final /* synthetic */ String $traditionalIraAccountNumber;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C496951(boolean z, String str, String str2, String str3, Continuation<? super C496951> continuation) {
                            super(2, continuation);
                            this.$hasGoldSubscription = z;
                            this.$brokerageAccountNumber = str;
                            this.$rothIraAccountNumber = str2;
                            this.$traditionalIraAccountNumber = str3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C496951 c496951 = new C496951(this.$hasGoldSubscription, this.$brokerageAccountNumber, this.$rothIraAccountNumber, this.$traditionalIraAccountNumber, continuation);
                            c496951.L$0 = obj;
                            return c496951;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(RecurringAssetCategorySelectionDataState recurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState> continuation) {
                            return ((C496951) create(recurringAssetCategorySelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return RecurringAssetCategorySelectionDataState.copy$default((RecurringAssetCategorySelectionDataState) this.L$0, null, this.$hasGoldSubscription, null, null, false, false, this.$brokerageAccountNumber, this.$rothIraAccountNumber, this.$traditionalIraAccountNumber, false, false, false, 3645, null);
                        }
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableSourceFlatMap, "flatMap(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableSourceFlatMap), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringAssetCategorySelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/retirement/db/RetirementContributionsSummary;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2$2", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends RetirementContributionsSummary>, ? extends Optional<? extends RetirementContributionsSummary>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringAssetCategorySelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringAssetCategorySelectionDuxo recurringAssetCategorySelectionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringAssetCategorySelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends RetirementContributionsSummary>, ? extends Optional<? extends RetirementContributionsSummary>> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends Optional<RetirementContributionsSummary>, ? extends Optional<RetirementContributionsSummary>>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends Optional<RetirementContributionsSummary>, ? extends Optional<RetirementContributionsSummary>> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Money money;
                Money money2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                Optional optional = (Optional) tuples2.component1();
                Optional optional2 = (Optional) tuples2.component2();
                RetirementContributionsSummary retirementContributionsSummary = (RetirementContributionsSummary) optional.getOrNull();
                RetirementContributionsSummary retirementContributionsSummary2 = (RetirementContributionsSummary) optional2.getOrNull();
                if (retirementContributionsSummary == null || (money = retirementContributionsSummary.getAmountContributed()) == null) {
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    money = Money3.toMoney(ZERO, Currencies.USD);
                }
                if (retirementContributionsSummary2 == null || (money2 = retirementContributionsSummary2.getAmountContributed()) == null) {
                    BigDecimal ZERO2 = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                    money2 = Money3.toMoney(ZERO2, Currencies.USD);
                }
                Money moneyPlus = money.plus(money2);
                if (retirementContributionsSummary2 != null) {
                    retirementContributionsSummary = retirementContributionsSummary2;
                }
                Money contributionLimit = retirementContributionsSummary != null ? retirementContributionsSummary.getContributionLimit() : null;
                this.this$0.applyMutation(new AnonymousClass1(contributionLimit != null ? contributionLimit.minus(moneyPlus) : null, null));
                return Unit.INSTANCE;
            }

            /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2$2$1", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RecurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState>, Object> {
                final /* synthetic */ Money $retirementRemainingToLimit;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Money money, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$retirementRemainingToLimit = money;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$retirementRemainingToLimit, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RecurringAssetCategorySelectionDataState recurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState> continuation) {
                    return ((AnonymousClass1) create(recurringAssetCategorySelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return RecurringAssetCategorySelectionDataState.copy$default((RecurringAssetCategorySelectionDataState) this.L$0, null, false, null, this.$retirementRemainingToLimit, false, false, null, null, null, false, false, false, 4087, null);
                }
            }
        }
    }

    /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$3", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$3 */
    static final class C116283 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C116283(Continuation<? super C116283> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringAssetCategorySelectionDuxo.this.new C116283(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C116283) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<RetirementMatchRate> observableDistinctUntilChanged = RecurringAssetCategorySelectionDuxo.this.retirementMatchStore.getQuery().asObservable(Unit.INSTANCE).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecurringAssetCategorySelectionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "matchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$3$1", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementMatchRate, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringAssetCategorySelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringAssetCategorySelectionDuxo recurringAssetCategorySelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringAssetCategorySelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementMatchRate retirementMatchRate, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(retirementMatchRate, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$3$1$1", m3645f = "RecurringAssetCategorySelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.common.recurring.assetSelection.RecurringAssetCategorySelectionDuxo$onStart$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496961 extends ContinuationImpl7 implements Function2<RecurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState>, Object> {
                final /* synthetic */ RetirementMatchRate $matchRate;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496961(RetirementMatchRate retirementMatchRate, Continuation<? super C496961> continuation) {
                    super(2, continuation);
                    this.$matchRate = retirementMatchRate;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496961 c496961 = new C496961(this.$matchRate, continuation);
                    c496961.L$0 = obj;
                    return c496961;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RecurringAssetCategorySelectionDataState recurringAssetCategorySelectionDataState, Continuation<? super RecurringAssetCategorySelectionDataState> continuation) {
                    return ((C496961) create(recurringAssetCategorySelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return RecurringAssetCategorySelectionDataState.copy$default((RecurringAssetCategorySelectionDataState) this.L$0, null, false, this.$matchRate.getHighestActiveInternalAccountTransferRate(), null, false, false, null, null, null, false, false, false, 4091, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496961((RetirementMatchRate) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RecurringAssetCategorySelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionDuxo;", "Lcom/robinhood/android/common/recurring/assetSelection/RecurringAssetCategorySelectionFragment$Args;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecurringAssetCategorySelectionDuxo, RecurringAssetCategorySelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringAssetCategorySelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecurringAssetCategorySelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecurringAssetCategorySelectionFragment.Args getArgs(RecurringAssetCategorySelectionDuxo recurringAssetCategorySelectionDuxo) {
            return (RecurringAssetCategorySelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recurringAssetCategorySelectionDuxo);
        }
    }
}
