package com.robinhood.android.advisory.history.trade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.AdvisorTradeDetailsKey;
import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.advisory.p304db.trade.AdvisorTrade;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Order;
import com.robinhood.store.advisory.AdvisorTradesStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AdvisorTradeDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDataState;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisorTradesStore", "Lcom/robinhood/store/advisory/AdvisorTradesStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/advisory/AdvisorTradesStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisorTradeDetailsDuxo extends BaseDuxo<AdvisorTradeDetailsDataState, AdvisorTradeDetailsViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AdvisorTradesStore advisorTradesStore;
    private final OrderStore orderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorTradeDetailsDuxo(SavedStateHandle savedStateHandle, AccountProvider accountProvider, AdvisorTradesStore advisorTradesStore, OrderStore orderStore, DuxoBundle duxoBundle) {
        super(new AdvisorTradeDetailsDataState(null, null, null, 7, null), AdvisorTradeDetailsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisorTradesStore, "advisorTradesStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.advisorTradesStore = advisorTradesStore;
        this.orderStore = orderStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        AdvisorTradesStore advisorTradesStore = this.advisorTradesStore;
        Companion companion = INSTANCE;
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C87531(FlowKt.filterNotNull(advisorTradesStore.streamAdvisorTrade(((AdvisorTradeDetailsKey) companion.getArgs((HasSavedState) this)).getId(), ((AdvisorTradeDetailsKey) companion.getArgs((HasSavedState) this)).getFromDeepLink())), this, null));
    }

    /* compiled from: AdvisorTradeDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1 */
    static final class C87531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<AdvisorTrade> $advisorTradeStream;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvisorTradeDetailsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C87531(Flow<AdvisorTrade> flow, AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Continuation<? super C87531> continuation) {
            super(2, continuation);
            this.$advisorTradeStream = flow;
            this.this$0 = advisorTradeDetailsDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C87531 c87531 = new C87531(this.$advisorTradeStream, this.this$0, continuation);
            c87531.L$0 = obj;
            return c87531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C87531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvisorTradeDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$1", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<AdvisorTrade> $advisorTradeStream;
            int label;
            final /* synthetic */ AdvisorTradeDetailsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<AdvisorTrade> flow, AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$advisorTradeStream = flow;
                this.this$0 = advisorTradeDetailsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$advisorTradeStream, this.this$0, continuation);
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
                    Flow<AdvisorTrade> flow = this.$advisorTradeStream;
                    C495651 c495651 = new C495651(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c495651, this) == coroutine_suspended) {
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

            /* compiled from: AdvisorTradeDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, "Lcom/robinhood/models/advisory/db/trade/AdvisorTrade;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$1$1", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495651 extends ContinuationImpl7 implements Function2<AdvisorTrade, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisorTradeDetailsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495651(AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Continuation<? super C495651> continuation) {
                    super(2, continuation);
                    this.this$0 = advisorTradeDetailsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495651 c495651 = new C495651(this.this$0, continuation);
                    c495651.L$0 = obj;
                    return c495651;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AdvisorTrade advisorTrade, Continuation<? super Unit> continuation) {
                    return ((C495651) create(advisorTrade, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisorTradeDetailsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$1$1$1", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495661 extends ContinuationImpl7 implements Function2<AdvisorTradeDetailsDataState, Continuation<? super AdvisorTradeDetailsDataState>, Object> {
                    final /* synthetic */ AdvisorTrade $trade;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495661(AdvisorTrade advisorTrade, Continuation<? super C495661> continuation) {
                        super(2, continuation);
                        this.$trade = advisorTrade;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495661 c495661 = new C495661(this.$trade, continuation);
                        c495661.L$0 = obj;
                        return c495661;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisorTradeDetailsDataState advisorTradeDetailsDataState, Continuation<? super AdvisorTradeDetailsDataState> continuation) {
                        return ((C495661) create(advisorTradeDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisorTradeDetailsDataState.copy$default((AdvisorTradeDetailsDataState) this.L$0, this.$trade, null, null, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495661((AdvisorTrade) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$advisorTradeStream, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$advisorTradeStream, this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$advisorTradeStream, this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvisorTradeDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$2", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<AdvisorTrade> $advisorTradeStream;
            int label;
            final /* synthetic */ AdvisorTradeDetailsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<AdvisorTrade> flow, AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$advisorTradeStream = flow;
                this.this$0 = advisorTradeDetailsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$advisorTradeStream, this.this$0, continuation);
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
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(FlowKt.transformLatest(this.$advisorTradeStream, new C8750x621867e(null, this.this$0)), new Function1() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ((Account) obj2).getAccountNumber();
                        }
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: AdvisorTradeDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$2$3", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisorTradeDetailsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = advisorTradeDetailsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisorTradeDetailsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$2$3$1", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisorTradeDetailsDataState, Continuation<? super AdvisorTradeDetailsDataState>, Object> {
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
                    public final Object invoke(AdvisorTradeDetailsDataState advisorTradeDetailsDataState, Continuation<? super AdvisorTradeDetailsDataState> continuation) {
                        return ((AnonymousClass1) create(advisorTradeDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisorTradeDetailsDataState.copy$default((AdvisorTradeDetailsDataState) this.L$0, null, this.$account, null, 5, null);
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

        /* compiled from: AdvisorTradeDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<AdvisorTrade> $advisorTradeStream;
            int label;
            final /* synthetic */ AdvisorTradeDetailsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Flow<AdvisorTrade> flow, AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$advisorTradeStream = flow;
                this.this$0 = advisorTradeDetailsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$advisorTradeStream, this.this$0, continuation);
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
                    final Flow<AdvisorTrade> flow = this.$advisorTradeStream;
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Set<? extends UUID>>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C87522<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C87522.this.emit(null, this);
                                }
                            }

                            public C87522(FlowCollector flowCollector) {
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
                                    List<AdvisorTrade.OrderGroup> orderGroups = ((AdvisorTrade) obj).getOrderGroups();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<T> it = orderGroups.iterator();
                                    while (it.hasNext()) {
                                        CollectionsKt.addAll(arrayList, ((AdvisorTrade.OrderGroup) it.next()).getOrderIds());
                                    }
                                    Set set = CollectionsKt.toSet(arrayList);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(set, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super Set<? extends UUID>> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C87522(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new C8751x5d3f775d(null, this.this$0.orderStore));
                    C495673 c495673 = new C495673(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c495673, this) == coroutine_suspended) {
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

            /* compiled from: AdvisorTradeDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "orders", "", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$3", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$3, reason: invalid class name and collision with other inner class name */
            static final class C495673 extends ContinuationImpl7 implements Function2<List<? extends Order>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisorTradeDetailsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495673(AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Continuation<? super C495673> continuation) {
                    super(2, continuation);
                    this.this$0 = advisorTradeDetailsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495673 c495673 = new C495673(this.this$0, continuation);
                    c495673.L$0 = obj;
                    return c495673;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends Order> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<Order>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<Order> list, Continuation<? super Unit> continuation) {
                    return ((C495673) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisorTradeDetailsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$3$1", m3645f = "AdvisorTradeDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsDuxo$onStart$1$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisorTradeDetailsDataState, Continuation<? super AdvisorTradeDetailsDataState>, Object> {
                    final /* synthetic */ List<Order> $orders;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<Order> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$orders = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orders, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisorTradeDetailsDataState advisorTradeDetailsDataState, Continuation<? super AdvisorTradeDetailsDataState> continuation) {
                        return ((AnonymousClass1) create(advisorTradeDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisorTradeDetailsDataState.copy$default((AdvisorTradeDetailsDataState) this.L$0, null, null, this.$orders, 3, null);
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

    /* compiled from: AdvisorTradeDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisorTradeDetailsKey;", "<init>", "()V", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisorTradeDetailsDuxo, AdvisorTradeDetailsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisorTradeDetailsKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisorTradeDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisorTradeDetailsKey getArgs(AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo) {
            return (AdvisorTradeDetailsKey) DuxoCompanion.DefaultImpls.getArgs(this, advisorTradeDetailsDuxo);
        }
    }
}
