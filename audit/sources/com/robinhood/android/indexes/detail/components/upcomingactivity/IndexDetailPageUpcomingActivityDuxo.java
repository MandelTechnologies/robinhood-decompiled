package com.robinhood.android.indexes.detail.components.upcomingactivity;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.detail.component.history.DetailPageHistoryViewState;
import com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelper;
import com.robinhood.android.indexes.detail.IndexDetailPageFragment;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDataState;", "Lcom/robinhood/android/common/detail/component/history/DetailPageHistoryViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;Lcom/robinhood/shared/store/history/HistoryStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageUpcomingActivityDuxo extends BaseDuxo<IndexDetailPageUpcomingActivityDataState, DetailPageHistoryViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final HistoryStore historyStore;
    private final IndexAccountSwitcherStore indexAccountSwitcherStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageUpcomingActivityDuxo(AccountProvider accountProvider, IndexAccountSwitcherStore indexAccountSwitcherStore, HistoryStore historyStore, SavedStateHandle savedStateHandle, IndexDetailPageUpcomingActivityStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new IndexDetailPageUpcomingActivityDataState(null, ((IndexDetailPageFragment.Args) INSTANCE.getArgs(savedStateHandle)).getIndexId(), null, 5, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.indexAccountSwitcherStore = indexAccountSwitcherStore;
        this.historyStore = historyStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Flow<Account> currentAccountFlow = IndexDetailPageDuxoHelper.getCurrentAccountFlow(this.indexAccountSwitcherStore, this.accountProvider);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C188811(currentAccountFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188822(currentAccountFlow, null));
    }

    /* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$1", m3645f = "IndexDetailPageUpcomingActivityDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$1 */
    static final class C188811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $currentAccountFlow;
        int label;
        final /* synthetic */ IndexDetailPageUpcomingActivityDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188811(Flow<Account> flow, IndexDetailPageUpcomingActivityDuxo indexDetailPageUpcomingActivityDuxo, Continuation<? super C188811> continuation) {
            super(2, continuation);
            this.$currentAccountFlow = flow;
            this.this$0 = indexDetailPageUpcomingActivityDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188811(this.$currentAccountFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Account> flow = this.$currentAccountFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currentAccount", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$1$1", m3645f = "IndexDetailPageUpcomingActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageUpcomingActivityDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageUpcomingActivityDuxo indexDetailPageUpcomingActivityDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageUpcomingActivityDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$1$1$1", m3645f = "IndexDetailPageUpcomingActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502131 extends ContinuationImpl7 implements Function2<IndexDetailPageUpcomingActivityDataState, Continuation<? super IndexDetailPageUpcomingActivityDataState>, Object> {
                final /* synthetic */ Account $currentAccount;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502131(Account account, Continuation<? super C502131> continuation) {
                    super(2, continuation);
                    this.$currentAccount = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502131 c502131 = new C502131(this.$currentAccount, continuation);
                    c502131.L$0 = obj;
                    return c502131;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageUpcomingActivityDataState indexDetailPageUpcomingActivityDataState, Continuation<? super IndexDetailPageUpcomingActivityDataState> continuation) {
                    return ((C502131) create(indexDetailPageUpcomingActivityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageUpcomingActivityDataState.copy$default((IndexDetailPageUpcomingActivityDataState) this.L$0, this.$currentAccount, null, null, 6, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502131((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$2", m3645f = "IndexDetailPageUpcomingActivityDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$2 */
    static final class C188822 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $currentAccountFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188822(Flow<Account> flow, Continuation<? super C188822> continuation) {
            super(2, continuation);
            this.$currentAccountFlow = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageUpcomingActivityDuxo.this.new C188822(this.$currentAccountFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188822) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<StatefulHistoryEvent<HistoryEvent>>> indexDetailPageHistoryFlow = IndexDetailPageDuxoHelper.getIndexDetailPageHistoryFlow(true, ((IndexDetailPageFragment.Args) IndexDetailPageUpcomingActivityDuxo.INSTANCE.getArgs((HasSavedState) IndexDetailPageUpcomingActivityDuxo.this)).getIndexId(), 5, this.$currentAccountFlow, IndexDetailPageUpcomingActivityDuxo.this.historyStore);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageUpcomingActivityDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(indexDetailPageHistoryFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "events", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$2$1", m3645f = "IndexDetailPageUpcomingActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageUpcomingActivityDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageUpcomingActivityDuxo indexDetailPageUpcomingActivityDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageUpcomingActivityDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$2$1$1", m3645f = "IndexDetailPageUpcomingActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.upcomingactivity.IndexDetailPageUpcomingActivityDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502141 extends ContinuationImpl7 implements Function2<IndexDetailPageUpcomingActivityDataState, Continuation<? super IndexDetailPageUpcomingActivityDataState>, Object> {
                final /* synthetic */ List<StatefulHistoryEvent<HistoryEvent>> $events;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C502141(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, Continuation<? super C502141> continuation) {
                    super(2, continuation);
                    this.$events = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502141 c502141 = new C502141(this.$events, continuation);
                    c502141.L$0 = obj;
                    return c502141;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageUpcomingActivityDataState indexDetailPageUpcomingActivityDataState, Continuation<? super IndexDetailPageUpcomingActivityDataState> continuation) {
                    return ((C502141) create(indexDetailPageUpcomingActivityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageUpcomingActivityDataState.copy$default((IndexDetailPageUpcomingActivityDataState) this.L$0, null, null, this.$events, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502141((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageUpcomingActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/indexes/detail/components/upcomingactivity/IndexDetailPageUpcomingActivityDuxo;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Args;", "<init>", "()V", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndexDetailPageUpcomingActivityDuxo, IndexDetailPageFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageFragment.Args getArgs(IndexDetailPageUpcomingActivityDuxo indexDetailPageUpcomingActivityDuxo) {
            return (IndexDetailPageFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, indexDetailPageUpcomingActivityDuxo);
        }
    }
}
