package com.robinhood.android.equity.history.p121ui.borrowcharge;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.equity.history.p121ui.borrowcharge.BorrowChargeDetailFragment;
import com.robinhood.android.equity.history.p121ui.borrowcharge.BorrowChargeDetailViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.BorrowChargeStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.GroupedBorrowCharges;
import com.robinhood.models.p320db.InstrumentBorrowCharge;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BorrowChargeDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDataState;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "borrowChargeStore", "Lcom/robinhood/librobinhood/data/store/BorrowChargeStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/BorrowChargeStore;Lcom/robinhood/android/lib/account/AccountProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class BorrowChargeDetailDuxo extends BaseDuxo<BorrowChargeDetailDataState, BorrowChargeDetailViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final BorrowChargeStore borrowChargeStore;
    private final InstrumentStore instrumentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowChargeDetailDuxo(BorrowChargeStore borrowChargeStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle, InstrumentStore instrumentStore, DuxoBundle duxoBundle, BorrowChargeDetailStateProvider stateProvider) {
        super(new BorrowChargeDetailDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(borrowChargeStore, "borrowChargeStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.borrowChargeStore = borrowChargeStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
        this.instrumentStore = instrumentStore;
    }

    /* compiled from: BorrowChargeDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1 */
    static final class C151191 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C151191(Continuation<? super C151191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151191 c151191 = BorrowChargeDetailDuxo.this.new C151191(continuation);
            c151191.L$0 = obj;
            return c151191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C151191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<GroupedBorrowCharges> groupedBorrowChargeById = BorrowChargeDetailDuxo.this.borrowChargeStore.getGroupedBorrowChargeById(((BorrowChargeDetailFragment.Args) BorrowChargeDetailDuxo.INSTANCE.getArgs((HasSavedState) BorrowChargeDetailDuxo.this)).getBorrowChargeId());
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(groupedBorrowChargeById, BorrowChargeDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(groupedBorrowChargeById, BorrowChargeDetailDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(groupedBorrowChargeById, BorrowChargeDetailDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: BorrowChargeDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$1", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<GroupedBorrowCharges> $groupedBorrowChargesFlow;
            int label;
            final /* synthetic */ BorrowChargeDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<GroupedBorrowCharges> flow, BorrowChargeDetailDuxo borrowChargeDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$groupedBorrowChargesFlow = flow;
                this.this$0 = borrowChargeDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$groupedBorrowChargesFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BorrowChargeDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/GroupedBorrowCharges;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$1$1", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499271 extends ContinuationImpl7 implements Function2<GroupedBorrowCharges, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BorrowChargeDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499271(BorrowChargeDetailDuxo borrowChargeDetailDuxo, Continuation<? super C499271> continuation) {
                    super(2, continuation);
                    this.this$0 = borrowChargeDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499271 c499271 = new C499271(this.this$0, continuation);
                    c499271.L$0 = obj;
                    return c499271;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GroupedBorrowCharges groupedBorrowCharges, Continuation<? super Unit> continuation) {
                    return ((C499271) create(groupedBorrowCharges, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BorrowChargeDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$1$1$1", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499281 extends ContinuationImpl7 implements Function2<BorrowChargeDetailDataState, Continuation<? super BorrowChargeDetailDataState>, Object> {
                    final /* synthetic */ GroupedBorrowCharges $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499281(GroupedBorrowCharges groupedBorrowCharges, Continuation<? super C499281> continuation) {
                        super(2, continuation);
                        this.$it = groupedBorrowCharges;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499281 c499281 = new C499281(this.$it, continuation);
                        c499281.L$0 = obj;
                        return c499281;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BorrowChargeDetailDataState borrowChargeDetailDataState, Continuation<? super BorrowChargeDetailDataState> continuation) {
                        return ((C499281) create(borrowChargeDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BorrowChargeDetailDataState.copy$default((BorrowChargeDetailDataState) this.L$0, null, this.$it, null, 5, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499281((GroupedBorrowCharges) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<GroupedBorrowCharges> flow = this.$groupedBorrowChargesFlow;
                    C499271 c499271 = new C499271(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c499271, this) == coroutine_suspended) {
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

        /* compiled from: BorrowChargeDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$2", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<GroupedBorrowCharges> $groupedBorrowChargesFlow;
            int label;
            final /* synthetic */ BorrowChargeDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<GroupedBorrowCharges> flow, BorrowChargeDetailDuxo borrowChargeDetailDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$groupedBorrowChargesFlow = flow;
                this.this$0 = borrowChargeDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$groupedBorrowChargesFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$groupedBorrowChargesFlow, new C15115x49e11822(null, this.this$0));
                    C499292 c499292 = new C499292(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c499292, this) == coroutine_suspended) {
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

            /* compiled from: BorrowChargeDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$2$2", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C499292 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BorrowChargeDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499292(BorrowChargeDetailDuxo borrowChargeDetailDuxo, Continuation<? super C499292> continuation) {
                    super(2, continuation);
                    this.this$0 = borrowChargeDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499292 c499292 = new C499292(this.this$0, continuation);
                    c499292.L$0 = obj;
                    return c499292;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((C499292) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BorrowChargeDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$2$2$1", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BorrowChargeDetailDataState, Continuation<? super BorrowChargeDetailDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$account, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BorrowChargeDetailDataState borrowChargeDetailDataState, Continuation<? super BorrowChargeDetailDataState> continuation) {
                        return ((AnonymousClass1) create(borrowChargeDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BorrowChargeDetailDataState.copy$default((BorrowChargeDetailDataState) this.L$0, this.$account, null, null, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: BorrowChargeDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<GroupedBorrowCharges> $groupedBorrowChargesFlow;
            int label;
            final /* synthetic */ BorrowChargeDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<GroupedBorrowCharges> flow, BorrowChargeDetailDuxo borrowChargeDetailDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$groupedBorrowChargesFlow = flow;
                this.this$0 = borrowChargeDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$groupedBorrowChargesFlow, this.this$0, continuation);
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
                    final Flow<GroupedBorrowCharges> flow = this.$groupedBorrowChargesFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<List<? extends InstrumentBorrowCharge>>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C151172<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C151172.this.emit(null, this);
                                }
                            }

                            public C151172(FlowCollector flowCollector) {
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
                                    List<InstrumentBorrowCharge> instrumentBorrowCharges = ((GroupedBorrowCharges) obj).getInstrumentBorrowCharges();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(instrumentBorrowCharges, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super List<? extends InstrumentBorrowCharge>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C151172(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new C15116xa0ff0901(null, this.this$0));
                    C499303 c499303 = new C499303(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c499303, this) == coroutine_suspended) {
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

            /* compiled from: BorrowChargeDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrumentBorrowCharges", "", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState$UiBorrowCharge;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$3", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C499303 extends ContinuationImpl7 implements Function2<List<? extends BorrowChargeDetailViewState.UiBorrowCharge>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BorrowChargeDetailDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499303(BorrowChargeDetailDuxo borrowChargeDetailDuxo, Continuation<? super C499303> continuation) {
                    super(2, continuation);
                    this.this$0 = borrowChargeDetailDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499303 c499303 = new C499303(this.this$0, continuation);
                    c499303.L$0 = obj;
                    return c499303;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends BorrowChargeDetailViewState.UiBorrowCharge> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<BorrowChargeDetailViewState.UiBorrowCharge>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<BorrowChargeDetailViewState.UiBorrowCharge> list, Continuation<? super Unit> continuation) {
                    return ((C499303) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BorrowChargeDetailDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$3$1", m3645f = "BorrowChargeDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailDuxo$onStart$1$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BorrowChargeDetailDataState, Continuation<? super BorrowChargeDetailDataState>, Object> {
                    final /* synthetic */ List<BorrowChargeDetailViewState.UiBorrowCharge> $instrumentBorrowCharges;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<BorrowChargeDetailViewState.UiBorrowCharge> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$instrumentBorrowCharges = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrumentBorrowCharges, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BorrowChargeDetailDataState borrowChargeDetailDataState, Continuation<? super BorrowChargeDetailDataState> continuation) {
                        return ((AnonymousClass1) create(borrowChargeDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BorrowChargeDetailDataState.copy$default((BorrowChargeDetailDataState) this.L$0, null, null, this.$instrumentBorrowCharges, 3, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C151191(null));
    }

    /* compiled from: BorrowChargeDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo;", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailFragment$Args;", "<init>", "()V", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BorrowChargeDetailDuxo, BorrowChargeDetailFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BorrowChargeDetailFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BorrowChargeDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BorrowChargeDetailFragment.Args getArgs(BorrowChargeDetailDuxo borrowChargeDetailDuxo) {
            return (BorrowChargeDetailFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, borrowChargeDetailDuxo);
        }
    }
}
