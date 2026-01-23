package com.robinhood.android.indexes.detail.components.tradebar;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherHelper;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherLocation;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherRequest;
import com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelper;
import com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment;
import com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarStates3;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.experiments.TradeOptionsSduiAccountSwitcherExperiment;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountSwitcherStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.store.AsyncResult;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: IndexDetailPageTradeBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001*Ba\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarViewState;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "accountSwitcherRequest", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherRequest;", "getAccountSwitcherRequest", "()Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherRequest;", "onCreate", "", "setAccountNumber", "accountNumber", "", "refreshAccountSwitcher", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageTradeBarDuxo extends BaseDuxo3<IndexDetailPageTradeBarDataState, IndexDetailPageTradeBarViewState, IndexDetailPageTradeBarStates3> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final AccountSwitcherStore accountSwitcherStore;
    private final ExperimentsStore experimentStore;
    private final IndexAccountSwitcherStore indexAccountSwitcherStore;
    private final IndexStore indexStore;
    private final OptionChainStore optionChainStore;
    private final OptionUpgradePromotionStore optionUpgradePromotionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageTradeBarDuxo(AccountAccessStore accountAccessStore, AccountProvider accountProvider, AccountSwitcherStore accountSwitcherStore, ExperimentsStore experimentStore, IndexStore indexStore, IndexAccountSwitcherStore indexAccountSwitcherStore, OptionChainStore optionChainStore, OptionUpgradePromotionStore optionUpgradePromotionStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, IndexDetailPageTradeBarStateProvider stateProvider) {
        super(new IndexDetailPageTradeBarDataState(null, null, null, null, null, false, null, false, 255, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountAccessStore = accountAccessStore;
        this.accountProvider = accountProvider;
        this.accountSwitcherStore = accountSwitcherStore;
        this.experimentStore = experimentStore;
        this.indexStore = indexStore;
        this.indexAccountSwitcherStore = indexAccountSwitcherStore;
        this.optionChainStore = optionChainStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountSwitcherRequest getAccountSwitcherRequest() {
        String string2 = ((IndexDetailPageTradeBarFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getIndexId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new AccountSwitcherRequest(string2, AccountSwitcherLocation.INDEX_DETAIL_TRADE_BAR);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C188661(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188672(null));
        Flow<Account> currentAccountFlow = IndexDetailPageDuxoHelper.getCurrentAccountFlow(this.indexAccountSwitcherStore, this.accountProvider);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188683(currentAccountFlow, this, null));
        Flow<Index> flowStreamIndex = this.indexStore.streamIndex(((IndexDetailPageTradeBarFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getIndexId());
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188694(flowStreamIndex, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188705(currentAccountFlow, flowStreamIndex, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188716(currentAccountFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C188727(currentAccountFlow, this, null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C188738(null));
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$1 */
    static final class C188661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188661(Continuation<? super C188661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageTradeBarDuxo.this.new C188661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(IndexDetailPageTradeBarDuxo.this.accountSwitcherStore.getAccountSwitcherQuery().asFlow(IndexDetailPageTradeBarDuxo.this.getAccountSwitcherRequest()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageTradeBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountSwitcher", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountSwitcher, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountSwitcher accountSwitcher, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(accountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$1$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502071 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ AccountSwitcher $accountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502071(AccountSwitcher accountSwitcher, Continuation<? super C502071> continuation) {
                    super(2, continuation);
                    this.$accountSwitcher = accountSwitcher;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502071 c502071 = new C502071(this.$accountSwitcher, continuation);
                    c502071.L$0 = obj;
                    return c502071;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((C502071) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageTradeBarDataState.copy$default((IndexDetailPageTradeBarDataState) this.L$0, this.$accountSwitcher, null, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502071((AccountSwitcher) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$2", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$2 */
    static final class C188672 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188672(Continuation<? super C188672> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageTradeBarDuxo.this.new C188672(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188672) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(IndexDetailPageTradeBarDuxo.this.accountProvider.streamAllSelfDirectedAccounts()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageTradeBarDuxo.this, null);
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accounts", "", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$2$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends Account>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, Continuation<? super Unit> continuation) {
                return invoke2((List<Account>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<Account> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$2$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502081 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ List<Account> $accounts;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502081(List<Account> list, Continuation<? super C502081> continuation) {
                    super(2, continuation);
                    this.$accounts = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502081 c502081 = new C502081(this.$accounts, continuation);
                    c502081.L$0 = obj;
                    return c502081;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((C502081) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageTradeBarDataState.copy$default((IndexDetailPageTradeBarDataState) this.L$0, null, this.$accounts, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502081((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$3", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$3 */
    static final class C188683 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $currentAccountFlow;
        int label;
        final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188683(Flow<Account> flow, IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super C188683> continuation) {
            super(2, continuation);
            this.$currentAccountFlow = flow;
            this.this$0 = indexDetailPageTradeBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188683(this.$currentAccountFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188683) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currentAccount", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$3$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
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

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$3$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502091 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ Account $currentAccount;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502091(Account account, Continuation<? super C502091> continuation) {
                    super(2, continuation);
                    this.$currentAccount = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502091 c502091 = new C502091(this.$currentAccount, continuation);
                    c502091.L$0 = obj;
                    return c502091;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((C502091) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageTradeBarDataState.copy$default((IndexDetailPageTradeBarDataState) this.L$0, null, null, this.$currentAccount, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502091((Account) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$4", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$4 */
    static final class C188694 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Index> $indexFlow;
        int label;
        final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188694(Flow<Index> flow, IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super C188694> continuation) {
            super(2, continuation);
            this.$indexFlow = flow;
            this.this$0 = indexDetailPageTradeBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188694(this.$indexFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188694) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Index> flow = this.$indexFlow;
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/indexes/models/db/Index;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$4$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Index, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Index index, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(index, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$4$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502101 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ Index $index;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502101(Index index, Continuation<? super C502101> continuation) {
                    super(2, continuation);
                    this.$index = index;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502101 c502101 = new C502101(this.$index, continuation);
                    c502101.L$0 = obj;
                    return c502101;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((C502101) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageTradeBarDataState.copy$default((IndexDetailPageTradeBarDataState) this.L$0, null, null, null, null, this.$index, false, null, false, 239, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502101((Index) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$5", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$5 */
    static final class C188705 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $currentAccountFlow;
        final /* synthetic */ Flow<Index> $indexFlow;
        int label;
        final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188705(Flow<Account> flow, Flow<Index> flow2, IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super C188705> continuation) {
            super(2, continuation);
            this.$currentAccountFlow = flow;
            this.$indexFlow = flow2;
            this.this$0 = indexDetailPageTradeBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188705(this.$currentAccountFlow, this.$indexFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188705) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.combine(this.$currentAccountFlow, this.$indexFlow), new C18862xcaf68057(null, this.this$0));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/ui/UiOptionChain;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$5$2", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends UiOptionChain>, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UiOptionChain> list, Continuation<? super Unit> continuation) {
                return invoke2((List<UiOptionChain>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UiOptionChain> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6 */
    static final class C188716 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $currentAccountFlow;
        int label;
        final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188716(Flow<Account> flow, IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super C188716> continuation) {
            super(2, continuation);
            this.$currentAccountFlow = flow;
            this.this$0 = indexDetailPageTradeBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188716(this.$currentAccountFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188716) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowOnStart = FlowKt.onStart(FlowKt.transformLatest(this.$currentAccountFlow, new C18863x22147136(null, this.this$0)), new AnonymousClass2(null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowOnStart, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6$2", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {136}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends Boolean>>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends Boolean>> flowCollector, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super Optional<Boolean>>) flowCollector, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super Optional<Boolean>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Optional2 optional2 = Optional2.INSTANCE;
                    this.label = 1;
                    if (flowCollector.emit(optional2, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasOptionsAccess", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6$3", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Optional<? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<Boolean> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Boolean> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<Boolean>) optional, continuation);
            }

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6$3$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$6$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ Optional<Boolean> $hasOptionsAccess;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Optional<Boolean> optional, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$hasOptionsAccess = optional;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hasOptionsAccess, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((AnonymousClass1) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageTradeBarDataState.copy$default((IndexDetailPageTradeBarDataState) this.L$0, null, null, null, this.$hasOptionsAccess.getOrNull(), null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Optional) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7 */
    static final class C188727 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Account> $currentAccountFlow;
        int label;
        final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188727(Flow<Account> flow, IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super C188727> continuation) {
            super(2, continuation);
            this.$currentAccountFlow = flow;
            this.this$0 = indexDetailPageTradeBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188727(this.$currentAccountFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188727) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowTransformLatest = FlowKt.transformLatest(Operators.combine(this.$currentAccountFlow, ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentStore, new Experiment[]{Experiments.SdpOptionsUpsellAllowNullRiskTolerance.INSTANCE}, false, null, 6, null)), new C18864x79326215(null, this.this$0));
                Flow flowOnStart = FlowKt.onStart(new Flow<Optional<? extends Boolean>>() { // from class: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Optional<? extends Boolean>> flowCollector, Continuation continuation) {
                        Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$invokeSuspend$$inlined$map$1$2", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Optional optionalAsOptional = Optional3.asOptional(boxing.boxBoolean(((OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp) obj) == OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.SERVER_SHOULD_SHOW));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
                }, new AnonymousClass3(null));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowOnStart, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$3", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends Boolean>>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends Boolean>> flowCollector, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super Optional<Boolean>>) flowCollector, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super Optional<Boolean>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Optional2 optional2 = Optional2.INSTANCE;
                    this.label = 1;
                    if (flowCollector.emit(optional2, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showOptionsUpgrade", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$4", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Optional<? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<Boolean> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Boolean> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<Boolean>) optional, continuation);
            }

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$4$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$7$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ Optional<Boolean> $showOptionsUpgrade;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Optional<Boolean> optional, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$showOptionsUpgrade = optional;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$showOptionsUpgrade, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((AnonymousClass1) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageTradeBarDataState.copy$default((IndexDetailPageTradeBarDataState) this.L$0, null, null, null, null, null, false, this.$showOptionsUpgrade.getOrNull(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Optional) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$8", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$8 */
    static final class C188738 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188738(Continuation<? super C188738> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageTradeBarDuxo.this.new C188738(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188738) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(IndexDetailPageTradeBarDuxo.this.experimentStore, new Experiment[]{TradeOptionsSduiAccountSwitcherExperiment.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageTradeBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "useSduiAccountSwitcher", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$8$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
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

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$8$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$onCreate$8$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502111 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ boolean $useSduiAccountSwitcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502111(boolean z, Continuation<? super C502111> continuation) {
                    super(2, continuation);
                    this.$useSduiAccountSwitcher = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502111 c502111 = new C502111(this.$useSduiAccountSwitcher, continuation);
                    c502111.L$0 = obj;
                    return c502111;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((C502111) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageTradeBarDataState.copy$default((IndexDetailPageTradeBarDataState) this.L$0, null, null, null, null, null, false, null, this.$useSduiAccountSwitcher, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502111(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.indexAccountSwitcherStore.setActiveAccountNumber(accountNumber);
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$refreshAccountSwitcher$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$refreshAccountSwitcher$1 */
    static final class C188741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C188741(Continuation<? super C188741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndexDetailPageTradeBarDuxo.this.new C188741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTake = FlowKt.take(Operators.combine(IndexDetailPageDuxoHelper.getCurrentAccountFlow(IndexDetailPageTradeBarDuxo.this.indexAccountSwitcherStore, IndexDetailPageTradeBarDuxo.this.accountProvider), IndexDetailPageTradeBarDuxo.this.accountSwitcherStore.forceFetchAccountSwitcher(IndexDetailPageTradeBarDuxo.this.getAccountSwitcherRequest())), 1);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IndexDetailPageTradeBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: IndexDetailPageTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$refreshAccountSwitcher$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$refreshAccountSwitcher$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Tuples2<? extends Account, ? extends AsyncResult<? extends AccountSwitcher>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Account, ? extends AsyncResult<? extends AccountSwitcher>> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<Account, ? extends AsyncResult<AccountSwitcher>>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<Account, ? extends AsyncResult<AccountSwitcher>> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$refreshAccountSwitcher$1$1$1", m3645f = "IndexDetailPageTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarDuxo$refreshAccountSwitcher$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502121 extends ContinuationImpl7 implements Function2<IndexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState>, Object> {
                final /* synthetic */ Account $account;
                final /* synthetic */ AsyncResult<AccountSwitcher> $result;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ IndexDetailPageTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502121(AsyncResult<AccountSwitcher> asyncResult, IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo, Account account, Continuation<? super C502121> continuation) {
                    super(2, continuation);
                    this.$result = asyncResult;
                    this.this$0 = indexDetailPageTradeBarDuxo;
                    this.$account = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502121 c502121 = new C502121(this.$result, this.this$0, this.$account, continuation);
                    c502121.L$0 = obj;
                    return c502121;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState, Continuation<? super IndexDetailPageTradeBarDataState> continuation) {
                    return ((C502121) create(indexDetailPageTradeBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    IndexDetailPageTradeBarDataState indexDetailPageTradeBarDataState = (IndexDetailPageTradeBarDataState) this.L$0;
                    AsyncResult<AccountSwitcher> asyncResult = this.$result;
                    if (asyncResult instanceof AsyncResult.Failure) {
                        this.this$0.submit(new IndexDetailPageTradeBarStates3.AccountSwitcherRefreshed(new Either.Right(((AsyncResult.Failure) this.$result).getException())));
                        return IndexDetailPageTradeBarDataState.copy$default(indexDetailPageTradeBarDataState, null, null, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                    }
                    if (asyncResult instanceof AsyncResult.Loading) {
                        return IndexDetailPageTradeBarDataState.copy$default(indexDetailPageTradeBarDataState, null, null, null, null, null, true, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                    }
                    if (!(asyncResult instanceof AsyncResult.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.submit(new IndexDetailPageTradeBarStates3.AccountSwitcherRefreshed(new Either.Left(AccountSwitcherHelper.toAccountSwitcherData((AccountSwitcher) ((AsyncResult.Success) this.$result).getValue(), this.$account.getAccountNumber(), new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null)))));
                    return IndexDetailPageTradeBarDataState.copy$default(indexDetailPageTradeBarDataState, (AccountSwitcher) ((AsyncResult.Success) this.$result).getValue(), null, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                Account account = (Account) tuples2.component1();
                AsyncResult asyncResult = (AsyncResult) tuples2.component2();
                IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo = this.this$0;
                indexDetailPageTradeBarDuxo.applyMutation(new C502121(asyncResult, indexDetailPageTradeBarDuxo, account, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void refreshAccountSwitcher() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C188741(null), 3, null);
    }

    /* compiled from: IndexDetailPageTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarDuxo;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarFragment$Args;", "<init>", "()V", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndexDetailPageTradeBarDuxo, IndexDetailPageTradeBarFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageTradeBarFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (IndexDetailPageTradeBarFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndexDetailPageTradeBarFragment.Args getArgs(IndexDetailPageTradeBarDuxo indexDetailPageTradeBarDuxo) {
            return (IndexDetailPageTradeBarFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, indexDetailPageTradeBarDuxo);
        }
    }
}
