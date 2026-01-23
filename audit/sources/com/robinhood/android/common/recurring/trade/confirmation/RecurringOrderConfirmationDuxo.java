package com.robinhood.android.common.recurring.trade.confirmation;

import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.SweepsTimelineSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: RecurringOrderConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsTimelineSummaryStore", "Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsTimelineSummaryStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "orderFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "onStart", "", "onCreate", "onOrderReceived", Card.Icon.ORDER, "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringOrderConfirmationDuxo extends OldBaseDuxo<RecurringOrderConfirmationViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AchRelationshipStore achRelationshipStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final StateFlow2<InvestmentSchedule> orderFlow;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsTimelineSummaryStore sweepsTimelineSummaryStore;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringOrderConfirmationDuxo(AccountProvider accountProvider, AchRelationshipStore achRelationshipStore, DirectDepositRelationshipStore directDepositRelationshipStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsTimelineSummaryStore sweepsTimelineSummaryStore, CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsTimelineSummaryStore, "sweepsTimelineSummaryStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Object[] objArr = 0 == true ? 1 : 0;
        super(new RecurringOrderConfirmationViewState(null, null, null, null, false, null, 63, null), objArr, 2, 0 == true ? 1 : 0);
        this.accountProvider = accountProvider;
        this.achRelationshipStore = achRelationshipStore;
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsTimelineSummaryStore = sweepsTimelineSummaryStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.orderFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable map = this.accountProvider.getIndividualAccountNumberMaybe().flatMapObservable(new Function() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$enrolledInSweepSingle$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiSweepEnrollment> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return this.this$0.sweepEnrollmentStore.getSweepEnrollmentObservable(accountNumber);
            }
        }).take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$enrolledInSweepSingle$2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(ApiSweepEnrollment it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getSweepEnrolled());
            }
        });
        Boolean bool = Boolean.FALSE;
        Single single = map.single(bool);
        Single single2 = SweepsTimelineSummaryStore.getTimelineSummaryIndividualAccount$default(this.sweepsTimelineSummaryStore, null, 1, null).take(1L).map(new Function() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$eligibleForSweepSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(SweepsTimelineSummary it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getStatus() != ApiSweepsTimelineSummary.Status.PAUSED);
            }
        }).single(bool);
        Singles singles = Singles.INSTANCE;
        Intrinsics.checkNotNull(single);
        Intrinsics.checkNotNull(single2);
        Single singleZip = Single.zip(single, single2, new BiFunction<Boolean, Boolean, R>() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$$inlined$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(Boolean t, Boolean u) {
                Intrinsics.checkParameterIsNotNull(t, "t");
                Intrinsics.checkParameterIsNotNull(u, "u");
                return (R) new RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus(t.booleanValue(), u.booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        LifecycleHost.DefaultImpls.bind$default(this, singleZip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderConfirmationDuxo.onStart$lambda$1(this.f$0, (RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C117843(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RecurringOrderConfirmationDuxo recurringOrderConfirmationDuxo, final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        recurringOrderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderConfirmationDuxo.onStart$lambda$1$lambda$0(status, (RecurringOrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderConfirmationViewState onStart$lambda$1$lambda$0(RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, RecurringOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderConfirmationViewState.copy$default(applyMutation, null, null, null, paycheckRecurringBrokerageCashStatus, false, null, 55, null);
    }

    /* compiled from: RecurringOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$3", m3645f = "RecurringOrderConfirmationDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$3 */
    static final class C117843 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117843(Continuation<? super C117843> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderConfirmationDuxo.this.new C117843(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117843) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = RecurringOrderConfirmationDuxo.this.cryptoExperimentsStore.streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RecurringOrderConfirmationDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: RecurringOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$3$1", m3645f = "RecurringOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ RecurringOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringOrderConfirmationDuxo recurringOrderConfirmationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderConfirmationDuxo;
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
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onStart$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderConfirmationDuxo.C117843.AnonymousClass1.invokeSuspend$lambda$0(z, (RecurringOrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderConfirmationViewState invokeSuspend$lambda$0(boolean z, RecurringOrderConfirmationViewState recurringOrderConfirmationViewState) {
                return RecurringOrderConfirmationViewState.copy$default(recurringOrderConfirmationViewState, null, null, null, null, z, null, 47, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C117831(null));
    }

    /* compiled from: RecurringOrderConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onCreate$1", m3645f = "RecurringOrderConfirmationDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onCreate$1 */
    static final class C117831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C117831(Continuation<? super C117831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecurringOrderConfirmationDuxo.this.new C117831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C117831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(Operators.connectWhen$default(RecurringOrderConfirmationDuxo.this.orderFlow, RecurringOrderConfirmationDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null)), new C11781xf3ca8d80(null, RecurringOrderConfirmationDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RecurringOrderConfirmationDuxo.this, null);
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

        /* compiled from: RecurringOrderConfirmationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onCreate$1$2", m3645f = "RecurringOrderConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RecurringOrderConfirmationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringOrderConfirmationDuxo recurringOrderConfirmationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringOrderConfirmationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Account account = (Account) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$onCreate$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RecurringOrderConfirmationDuxo.C117831.AnonymousClass2.invokeSuspend$lambda$0(account, (RecurringOrderConfirmationViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RecurringOrderConfirmationViewState invokeSuspend$lambda$0(Account account, RecurringOrderConfirmationViewState recurringOrderConfirmationViewState) {
                return RecurringOrderConfirmationViewState.copy$default(recurringOrderConfirmationViewState, null, null, null, null, false, account, 31, null);
            }
        }
    }

    public final void onOrderReceived(final InvestmentSchedule order) {
        Intrinsics.checkNotNullParameter(order, "order");
        UUID achRelationshipId = order.getAchRelationshipId();
        if (achRelationshipId != null) {
            this.achRelationshipStore.refresh(false);
            LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(achRelationshipId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderConfirmationDuxo.onOrderReceived$lambda$3(this.f$0, (AchRelationship) obj);
                }
            });
        }
        UUID directDepositRelationshipId = order.getDirectDepositRelationshipId();
        if (directDepositRelationshipId != null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.directDepositRelationshipStore.getDirectDepositRelationship(directDepositRelationshipId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringOrderConfirmationDuxo.onOrderReceived$lambda$5(this.f$0, (DirectDepositRelationship) obj);
                }
            });
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderConfirmationDuxo.onOrderReceived$lambda$6(order, (RecurringOrderConfirmationViewState) obj);
            }
        });
        StateFlow2<InvestmentSchedule> stateFlow2 = this.orderFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), order)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$3(RecurringOrderConfirmationDuxo recurringOrderConfirmationDuxo, final AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        recurringOrderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderConfirmationDuxo.onOrderReceived$lambda$3$lambda$2(achRelationship, (RecurringOrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderConfirmationViewState onOrderReceived$lambda$3$lambda$2(AchRelationship achRelationship, RecurringOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderConfirmationViewState.copy$default(applyMutation, null, achRelationship, null, null, false, null, 61, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOrderReceived$lambda$5(RecurringOrderConfirmationDuxo recurringOrderConfirmationDuxo, final DirectDepositRelationship directDepositRelationship) {
        Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
        recurringOrderConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringOrderConfirmationDuxo.onOrderReceived$lambda$5$lambda$4(directDepositRelationship, (RecurringOrderConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderConfirmationViewState onOrderReceived$lambda$5$lambda$4(DirectDepositRelationship directDepositRelationship, RecurringOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderConfirmationViewState.copy$default(applyMutation, null, null, directDepositRelationship, null, false, null, 59, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecurringOrderConfirmationViewState onOrderReceived$lambda$6(InvestmentSchedule investmentSchedule, RecurringOrderConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecurringOrderConfirmationViewState.copy$default(applyMutation, investmentSchedule, null, null, null, false, null, 62, null);
    }
}
