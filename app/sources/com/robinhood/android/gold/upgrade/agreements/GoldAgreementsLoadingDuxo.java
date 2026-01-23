package com.robinhood.android.gold.upgrade.agreements;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldSweepAgreementsFlow;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingFragment;
import com.robinhood.android.lib.store.margin.MarginSettingsStore;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: GoldAgreementsLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDataState;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "goldUpgradeStore", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "stateProvider", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Lio/reactivex/Observable;", "loadUpgradeFlow", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldSweepAgreementsFlow;", "Companion", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldAgreementsLoadingDuxo extends BaseDuxo<GoldAgreementsLoadingDataState, GoldAgreementsLoadingState3> implements HasSavedState {
    private final GoldUpgradeStore goldUpgradeStore;
    private final MarginSettingsStore marginSettingsStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldAgreementsLoadingDuxo(GoldUpgradeStore goldUpgradeStore, MarginSettingsStore marginSettingsStore, MarginSubscriptionStore marginSubscriptionStore, StaticContentStore staticContentStore, UnifiedAccountStore unifiedAccountStore, GoldAgreementsLoadingStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new GoldAgreementsLoadingDataState(true, null, null, null, null, false, null, null, false, null, false, 2046, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldUpgradeStore = goldUpgradeStore;
        this.marginSettingsStore = marginSettingsStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.staticContentStore = staticContentStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GoldAgreementsLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$onCreate$1", m3645f = "GoldAgreementsLoadingDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$onCreate$1 */
    static final class C180091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C180091(Continuation<? super C180091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldAgreementsLoadingDuxo.this.new C180091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C180091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job jobRefresh = GoldAgreementsLoadingDuxo.this.unifiedAccountStore.refresh(true);
                this.label = 1;
                if (jobRefresh.join(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable observableAndThen = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C180091(null), 1, null).andThen(load());
        Intrinsics.checkNotNullExpressionValue(observableAndThen, "andThen(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableAndThen, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldAgreementsLoadingDuxo.onCreate$lambda$0(this.f$0, (GoldAgreementsLoadingDataState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldAgreementsLoadingDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(GoldAgreementsLoadingDuxo goldAgreementsLoadingDuxo, GoldAgreementsLoadingDataState goldAgreementsLoadingDataState) {
        goldAgreementsLoadingDuxo.applyMutation(new GoldAgreementsLoadingDuxo3(goldAgreementsLoadingDataState, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(GoldAgreementsLoadingDuxo goldAgreementsLoadingDuxo, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<unused var>");
        goldAgreementsLoadingDuxo.applyMutation(new GoldAgreementsLoadingDuxo4(null));
        return Unit.INSTANCE;
    }

    private final Observable<GoldAgreementsLoadingDataState> load() {
        Observables observables = Observables.INSTANCE;
        Observable<List<MarginUpgradePlans2>> observable = this.marginSettingsStore.getMarginSubscriptionPlans().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable observable2 = MarginSubscriptionStore.checkCurrentMarginSubscription$default(this.marginSubscriptionStore, false, 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable2, "toObservable(...)");
        Observable<GoldAgreementsLoadingDataState> observableCombineLatest = Observable.combineLatest(observable, observable2, this.unifiedAccountStore.streamIndividualAccountOptional(), loadUpgradeFlow(), new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo$load$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Boolean boolIsTitleCenterAligned;
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) t3).component1();
                ApiGoldSweepAgreementsFlow apiGoldSweepAgreementsFlow = (ApiGoldSweepAgreementsFlow) ((Optional) t4).component1();
                MarginUpgradePlans2 marginUpgradePlans2 = (MarginUpgradePlans2) CollectionsKt.singleOrNull((List) t1);
                MarginSubscription marginSubscription = (MarginSubscription) ((Optional) t2).getOrNull();
                ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements = apiGoldSweepAgreementsFlow != null ? apiGoldSweepAgreementsFlow.getGoldSweepAgreements() : null;
                return (R) new GoldAgreementsLoadingDataState(false, marginUpgradePlans2, marginSubscription, unifiedAccountV2, apiGoldSweepAgreementsFlow != null ? apiGoldSweepAgreementsFlow.getPostSuccessActionSheet() : null, apiGoldSweepAgreementsFlow != null ? apiGoldSweepAgreementsFlow.getOnlyShowGoldAgreement() : false, goldSweepAgreements, apiGoldSweepAgreementsFlow != null ? apiGoldSweepAgreementsFlow.getPromotion() : null, (apiGoldSweepAgreementsFlow == null || (boolIsTitleCenterAligned = apiGoldSweepAgreementsFlow.isTitleCenterAligned()) == null) ? false : boolIsTitleCenterAligned.booleanValue(), apiGoldSweepAgreementsFlow != null ? apiGoldSweepAgreementsFlow.getTitleProgressBar() : null, apiGoldSweepAgreementsFlow != null ? Intrinsics.areEqual(apiGoldSweepAgreementsFlow.getDisableSparkleButtonStyling(), Boolean.TRUE) : false);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        return observableCombineLatest;
    }

    private final Observable<Optional<ApiGoldSweepAgreementsFlow>> loadUpgradeFlow() {
        GoldUpgradeStore goldUpgradeStore = this.goldUpgradeStore;
        String feature = ((GoldAgreementsLoadingFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getFeature();
        String str = null;
        if (feature != null) {
            if (feature.length() == 0) {
                feature = null;
            }
            str = feature;
        }
        Observable<Optional<ApiGoldSweepAgreementsFlow>> observableOnErrorReturnItem = goldUpgradeStore.streamGoldSweepAgreementsFlow(str).flatMap(new Function() { // from class: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingDuxo.loadUpgradeFlow.2
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply(((Result) obj).getValue());
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<ApiGoldSweepAgreementsFlow>> apply(Object obj) {
                Intrinsics.checkNotNull(Result.m28549boximpl(obj));
                GoldAgreementsLoadingDuxo goldAgreementsLoadingDuxo = GoldAgreementsLoadingDuxo.this;
                if (Result.m28553exceptionOrNullimpl(obj) == null) {
                    return RxFactory.DefaultImpls.rxObservable$default(goldAgreementsLoadingDuxo, null, new GoldAgreementsLoadingDuxo2((ApiGoldSweepAgreementsFlow) obj, goldAgreementsLoadingDuxo, null), 1, null).onErrorReturnItem(Optional2.INSTANCE);
                }
                return Observable.just(Optional2.INSTANCE);
            }
        }).onErrorReturnItem(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
        return observableOnErrorReturnItem;
    }

    /* compiled from: GoldAgreementsLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingDuxo;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingFragment$Args;", "<init>", "()V", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldAgreementsLoadingDuxo, GoldAgreementsLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldAgreementsLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (GoldAgreementsLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldAgreementsLoadingFragment.Args getArgs(GoldAgreementsLoadingDuxo goldAgreementsLoadingDuxo) {
            return (GoldAgreementsLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, goldAgreementsLoadingDuxo);
        }
    }
}
