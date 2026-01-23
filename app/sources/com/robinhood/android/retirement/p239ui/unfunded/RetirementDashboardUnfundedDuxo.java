package com.robinhood.android.retirement.p239ui.unfunded;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.models.retirement.p194db.RetirementUnfundedViewModel;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.retirement.p239ui.RetirementDashboardEvent;
import com.robinhood.android.retirement.p239ui.unfunded.RetirementDashboardUnfundedFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.InboxBadge;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.store.AsyncResult;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RetirementDashboardUnfundedDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001&BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDataState;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "matchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "refreshAccountSwitcher", "onRetirementAccountSelected", "accountNumber", "", "tapInfoBanner", "receiptUuid", "Ljava/util/UUID;", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "dismissInfoBanner", "dismissMethod", "Lcom/robinhood/models/api/IacDismissMethod;", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementDashboardUnfundedDuxo extends BaseDuxo3<RetirementDashboardUnfundedDataState, RetirementDashboardUnfundedViewState, RetirementDashboardEvent> implements HasSavedState {
    private final IacInfoBannerStore iacInfoBannerStore;
    private final InboxBadgeStore inboxBadgeStore;
    private final RetirementMatchStore matchStore;
    private final RetirementAccountSwitcherStore retirementAccountSwitcherStore;
    private final RetirementNuxStore retirementNuxStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RetirementDashboardUnfundedDuxo(InboxBadgeStore inboxBadgeStore, RetirementMatchStore matchStore, RetirementAccountSwitcherStore retirementAccountSwitcherStore, RetirementNuxStore retirementNuxStore, IacInfoBannerStore iacInfoBannerStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(matchStore, "matchStore");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        AccountSelectorTabArgs accountSelectorTabArgs = ((RetirementDashboardUnfundedFragment.Args) companion.getArgs(savedStateHandle)).getAccountSelectorTabArgs();
        super(new RetirementDashboardUnfundedDataState(((RetirementDashboardUnfundedFragment.Args) companion.getArgs(savedStateHandle)).getAccountNumber(), null, null, null, false, false, false, null, null, accountSelectorTabArgs != null && accountSelectorTabArgs.isEmbedded(), 510, null), RetirementDashboardUnfundedDataState.INSTANCE, duxoBundle);
        this.inboxBadgeStore = inboxBadgeStore;
        this.matchStore = matchStore;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.retirementNuxStore = retirementNuxStore;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<Optional<String>> observableDistinctUntilChanged = this.retirementAccountSwitcherStore.streamActiveRetirementAccountNumber().distinctUntilChanged();
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardUnfundedDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.retirementAccountSwitcherStore.streamAllRetirementAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardUnfundedDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, QueryKt.asObservable(this.retirementAccountSwitcherStore.getRetirementAccountSwitcherQuery()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardUnfundedDuxo.onStart$lambda$2(this.f$0, (RetirementAccountSwitcher) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, QueryKt.asObservable(this.retirementNuxStore.getUnfundedViewModelQuery()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardUnfundedDuxo.onStart$lambda$3(this.f$0, (RetirementUnfundedViewModel) obj);
            }
        });
        InboxBadge latestBadgeResult = this.inboxBadgeStore.getLatestBadgeResult();
        if (latestBadgeResult != null) {
            applyMutation(new RetirementDashboardUnfundedDuxo6(latestBadgeResult, null));
        }
        LifecycleHost.DefaultImpls.bind$default(this, QueryKt.asObservable(this.matchStore.getQueryNoPolling()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardUnfundedDuxo.onStart$lambda$5(this.f$0, (RetirementMatchRate) obj);
            }
        });
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(observableDistinctUntilChanged).switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo.onStart.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<IacInfoBanner>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                List listListOf = CollectionsKt.listOf(IacInfoBannerLocation.INFO_BANNER_RETIREMENT_TAB_TOP_LEVEL);
                IacInfoBannerStore.refresh$default(RetirementDashboardUnfundedDuxo.this.iacInfoBannerStore, listListOf, null, null, null, null, null, null, null, accountNumber, null, null, false, 3838, null);
                return IacInfoBannerStore.streamBatch$default(RetirementDashboardUnfundedDuxo.this.iacInfoBannerStore, listListOf, null, null, null, null, null, null, null, null, accountNumber, null, 1534, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardUnfundedDuxo.onStart$lambda$6(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, Optional optional) {
        retirementDashboardUnfundedDuxo.applyMutation(new RetirementDashboardUnfundedDuxo2((String) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, List retirementAccounts) {
        Intrinsics.checkNotNullParameter(retirementAccounts, "retirementAccounts");
        retirementDashboardUnfundedDuxo.applyMutation(new RetirementDashboardUnfundedDuxo3(retirementAccounts, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, RetirementAccountSwitcher switcher) {
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        retirementDashboardUnfundedDuxo.applyMutation(new RetirementDashboardUnfundedDuxo4(switcher, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, RetirementUnfundedViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        retirementDashboardUnfundedDuxo.applyMutation(new RetirementDashboardUnfundedDuxo5(viewModel, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, RetirementMatchRate retirementMatchRate) {
        Intrinsics.checkNotNullParameter(retirementMatchRate, "retirementMatchRate");
        retirementDashboardUnfundedDuxo.applyMutation(new RetirementDashboardUnfundedDuxo7(retirementMatchRate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, List list) {
        Intrinsics.checkNotNull(list);
        retirementDashboardUnfundedDuxo.applyMutation(new RetirementDashboardUnfundedDuxo8(IacInfoBanners.findByLocation(list, IacInfoBannerLocation.INFO_BANNER_RETIREMENT_TAB_TOP_LEVEL), null));
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementDashboardUnfundedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {144}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1 */
    static final class C272841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C272841(Continuation<? super C272841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementDashboardUnfundedDuxo.this.new C272841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C272841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformWhile = FlowKt.transformWhile(RetirementDashboardUnfundedDuxo.this.retirementAccountSwitcherStore.refreshAccountSwitcher(), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RetirementDashboardUnfundedDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformWhile, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: RetirementDashboardUnfundedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "state"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1$1", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<FlowCollector<? super AsyncResult<? extends RetirementAccountSwitcher>>, AsyncResult<? extends RetirementAccountSwitcher>, Continuation<? super Boolean>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AsyncResult<? extends RetirementAccountSwitcher>> flowCollector, AsyncResult<? extends RetirementAccountSwitcher> asyncResult, Continuation<? super Boolean> continuation) {
                return invoke2((FlowCollector<? super AsyncResult<RetirementAccountSwitcher>>) flowCollector, (AsyncResult<RetirementAccountSwitcher>) asyncResult, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super AsyncResult<RetirementAccountSwitcher>> flowCollector, AsyncResult<RetirementAccountSwitcher> asyncResult, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = flowCollector;
                anonymousClass1.L$1 = asyncResult;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AsyncResult asyncResult;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    AsyncResult asyncResult2 = (AsyncResult) this.L$1;
                    this.L$0 = asyncResult2;
                    this.label = 1;
                    if (flowCollector.emit(asyncResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    asyncResult = asyncResult2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncResult = (AsyncResult) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return boxing.boxBoolean(asyncResult instanceof AsyncResult.Loading);
            }
        }

        /* compiled from: RetirementDashboardUnfundedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "switcherState", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1$2", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AsyncResult<? extends RetirementAccountSwitcher>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RetirementDashboardUnfundedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = retirementDashboardUnfundedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AsyncResult<RetirementAccountSwitcher> asyncResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends RetirementAccountSwitcher> asyncResult, Continuation<? super Unit> continuation) {
                return invoke2((AsyncResult<RetirementAccountSwitcher>) asyncResult, continuation);
            }

            /* compiled from: RetirementDashboardUnfundedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1$2$1", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$refreshAccountSwitcher$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState>, Object> {
                final /* synthetic */ AsyncResult<RetirementAccountSwitcher> $switcherState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AsyncResult<RetirementAccountSwitcher> asyncResult, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$switcherState = asyncResult;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$switcherState, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState> continuation) {
                    return ((AnonymousClass1) create(retirementDashboardUnfundedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState = (RetirementDashboardUnfundedDataState) this.L$0;
                    RetirementAccountSwitcher successValue = this.$switcherState.getSuccessValue();
                    if (successValue == null) {
                        successValue = retirementDashboardUnfundedDataState.getAccountSwitcher();
                    }
                    return RetirementDashboardUnfundedDataState.copy$default(retirementDashboardUnfundedDataState, null, null, successValue, null, this.$switcherState instanceof AsyncResult.Loading, false, false, null, null, false, 1003, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AsyncResult<RetirementAccountSwitcher> asyncResult = (AsyncResult) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1(asyncResult, null));
                    RetirementDashboardEvent retirementDashboardEventFrom = RetirementDashboardEvent.INSTANCE.from(asyncResult);
                    if (retirementDashboardEventFrom != null) {
                        this.this$0.submit(retirementDashboardEventFrom);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void refreshAccountSwitcher() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C272841(null), 3, null);
    }

    public final void onRetirementAccountSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.retirementAccountSwitcherStore.setActiveRetirementAccountNumber(accountNumber);
    }

    public final void tapInfoBanner(UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        bind(this.iacInfoBannerStore.postTapped(receiptUuid, action.getUri().toString()), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    public static /* synthetic */ void dismissInfoBanner$default(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo, UUID uuid, IacDismissMethod iacDismissMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            iacDismissMethod = IacDismissMethod.PASSIVE;
        }
        retirementDashboardUnfundedDuxo.dismissInfoBanner(uuid, iacDismissMethod);
    }

    /* compiled from: RetirementDashboardUnfundedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$dismissInfoBanner$1", m3645f = "RetirementDashboardUnfundedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDuxo$dismissInfoBanner$1 */
    static final class C272821 extends ContinuationImpl7 implements Function2<RetirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272821(Continuation<? super C272821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272821 c272821 = new C272821(continuation);
            c272821.L$0 = obj;
            return c272821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState, Continuation<? super RetirementDashboardUnfundedDataState> continuation) {
            return ((C272821) create(retirementDashboardUnfundedDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementDashboardUnfundedDataState.copy$default((RetirementDashboardUnfundedDataState) this.L$0, null, null, null, null, false, false, false, null, null, false, 767, null);
        }
    }

    public final void dismissInfoBanner(UUID receiptUuid, IacDismissMethod dismissMethod) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(dismissMethod, "dismissMethod");
        applyMutation(new C272821(null));
        bind(this.iacInfoBannerStore.postDismissed(receiptUuid, dismissMethod), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    /* compiled from: RetirementDashboardUnfundedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDuxo;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedFragment$Args;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<RetirementDashboardUnfundedDuxo, RetirementDashboardUnfundedFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public RetirementDashboardUnfundedFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementDashboardUnfundedFragment.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public RetirementDashboardUnfundedFragment.Args getArgs(RetirementDashboardUnfundedDuxo retirementDashboardUnfundedDuxo) {
            return (RetirementDashboardUnfundedFragment.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, retirementDashboardUnfundedDuxo);
        }
    }
}
