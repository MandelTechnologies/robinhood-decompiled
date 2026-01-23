package com.robinhood.android.gold.upgrade.legacy;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.lib.upgrade.store.GoldUpgradeStore;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanFragment;
import com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanState;
import com.robinhood.android.lib.store.margin.MarginSettingsStore;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.models.util.Money;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
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

/* compiled from: LegacyGoldUpgradeLoadPlanDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanState;", "Lcom/robinhood/android/udf/HasSavedState;", "goldUpgradeStore", "Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/store/GoldUpgradeStore;Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadUpgradeFlow", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeLoadPlanDuxo extends BaseDuxo4<LegacyGoldUpgradeLoadPlanState> implements HasSavedState {
    private final GoldUpgradeStore goldUpgradeStore;
    private final MarginSettingsStore marginSettingsStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final SavedStateHandle savedStateHandle;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyGoldUpgradeLoadPlanDuxo(GoldUpgradeStore goldUpgradeStore, MarginSettingsStore marginSettingsStore, MarginSubscriptionStore marginSubscriptionStore, UnifiedAccountStore unifiedAccountStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(LegacyGoldUpgradeLoadPlanState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldUpgradeStore, "goldUpgradeStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldUpgradeStore = goldUpgradeStore;
        this.marginSettingsStore = marginSettingsStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo$onCreate$1", m3645f = "LegacyGoldUpgradeLoadPlanDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo$onCreate$1 */
    static final class C181081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C181081(Continuation<? super C181081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyGoldUpgradeLoadPlanDuxo.this.new C181081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Job jobRefresh = LegacyGoldUpgradeLoadPlanDuxo.this.unifiedAccountStore.refresh(true);
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
        Observable observableAndThen = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C181081(null), 1, null).andThen(load());
        Intrinsics.checkNotNullExpressionValue(observableAndThen, "andThen(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableAndThen, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LegacyGoldUpgradeLoadPlanDuxo.onCreate$lambda$0(this.f$0, (LegacyGoldUpgradeLoadPlanState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LegacyGoldUpgradeLoadPlanDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(LegacyGoldUpgradeLoadPlanDuxo legacyGoldUpgradeLoadPlanDuxo, LegacyGoldUpgradeLoadPlanState legacyGoldUpgradeLoadPlanState) {
        legacyGoldUpgradeLoadPlanDuxo.applyMutation(new LegacyGoldUpgradeLoadPlanDuxo2(legacyGoldUpgradeLoadPlanState, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(LegacyGoldUpgradeLoadPlanDuxo legacyGoldUpgradeLoadPlanDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        legacyGoldUpgradeLoadPlanDuxo.applyMutation(new LegacyGoldUpgradeLoadPlanDuxo3(t, null));
        return Unit.INSTANCE;
    }

    private final Observable<Optional<ApiGoldUpgradeFlow>> loadUpgradeFlow() {
        GoldUpgradeStore goldUpgradeStore = this.goldUpgradeStore;
        Companion companion = INSTANCE;
        String feature = ((LegacyGoldUpgradeLoadPlanFragment.Args) companion.getArgs((HasSavedState) this)).getFeature();
        if (feature.length() == 0) {
            feature = null;
        }
        Observable<Optional<ApiGoldUpgradeFlow>> observableOnErrorReturnItem = goldUpgradeStore.streamGoldUpgradeFlow(feature, ((LegacyGoldUpgradeLoadPlanFragment.Args) companion.getArgs((HasSavedState) this)).getExitDeeplink()).map(new Function() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo.loadUpgradeFlow.2
            @Override // io.reactivex.functions.Function
            public final Optional<ApiGoldUpgradeFlow> apply(Object obj) {
                if (Result.m28555isFailureimpl(obj)) {
                    obj = null;
                }
                return Optional3.asOptional(obj);
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply(((Result) obj).getValue());
            }
        }).onErrorReturnItem(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturnItem, "onErrorReturnItem(...)");
        return observableOnErrorReturnItem;
    }

    private final Observable<LegacyGoldUpgradeLoadPlanState> load() {
        Observables observables = Observables.INSTANCE;
        Observable<List<MarginUpgradePlans2>> observable = this.marginSettingsStore.getMarginSubscriptionPlans().onErrorReturn(new Function() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo.load.1
            @Override // io.reactivex.functions.Function
            public final List<MarginUpgradePlans2> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.emptyList();
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable observable2 = MarginSubscriptionStore.checkCurrentMarginSubscription$default(this.marginSubscriptionStore, false, 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable2, "toObservable(...)");
        Observable<LegacyGoldUpgradeLoadPlanState> observableCombineLatest = Observable.combineLatest(observable, observable2, this.unifiedAccountStore.streamIndividualAccountOptional(), loadUpgradeFlow(), new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeLoadPlanDuxo$load$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Money accountBuyingPower;
                MarginSubscription3 plan;
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                MarginSubscription marginSubscription = (MarginSubscription) ((Optional) t2).component1();
                UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) t3).component1();
                ApiGoldUpgradeFlow apiGoldUpgradeFlow = (ApiGoldUpgradeFlow) ((Optional) t4).component1();
                MarginUpgradePlans2 marginUpgradePlans2 = (MarginUpgradePlans2) CollectionsKt.singleOrNull((List) t1);
                LegacyGoldUpgradeLoadPlanDuxo.Companion companion = LegacyGoldUpgradeLoadPlanDuxo.INSTANCE;
                if (!Intrinsics.areEqual(((LegacyGoldUpgradeLoadPlanFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getFeature(), GoldFeature.CREDIT_CARD_WAITLIST) && unifiedAccountV2 == null) {
                    return (R) new LegacyGoldUpgradeLoadPlanState.Failed(null, false, 3, null);
                }
                if (apiGoldUpgradeFlow == null) {
                    return (R) new LegacyGoldUpgradeLoadPlanState.Failed(null, true, 1, null);
                }
                if (marginSubscription != null && (plan = marginSubscription.getPlan()) != null && plan.is24Karat()) {
                    return (R) LegacyGoldUpgradeLoadPlanState.AlreadyGold.INSTANCE;
                }
                if (unifiedAccountV2 != null && (accountBuyingPower = unifiedAccountV2.getAccountBuyingPower()) != null && accountBuyingPower.isNegative()) {
                    return (R) LegacyGoldUpgradeLoadPlanState.AccountDeficit.INSTANCE;
                }
                if (Intrinsics.areEqual(((LegacyGoldUpgradeLoadPlanFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getFeature(), GoldFeature.CREDIT_CARD_WAITLIST) || (marginUpgradePlans2 != null && marginUpgradePlans2.is24KaratGold())) {
                    return (R) new LegacyGoldUpgradeLoadPlanState.Loaded(new LegacyGoldUpgradeDynamicContext(marginUpgradePlans2, apiGoldUpgradeFlow));
                }
                return (R) new LegacyGoldUpgradeLoadPlanState.Failed(null, false, 3, null);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        return observableCombineLatest;
    }

    /* compiled from: LegacyGoldUpgradeLoadPlanDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanDuxo;", "Lcom/robinhood/android/gold/upgrade/legacy/LegacyGoldUpgradeLoadPlanFragment$Args;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LegacyGoldUpgradeLoadPlanDuxo, LegacyGoldUpgradeLoadPlanFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyGoldUpgradeLoadPlanFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyGoldUpgradeLoadPlanFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyGoldUpgradeLoadPlanFragment.Args getArgs(LegacyGoldUpgradeLoadPlanDuxo legacyGoldUpgradeLoadPlanDuxo) {
            return (LegacyGoldUpgradeLoadPlanFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, legacyGoldUpgradeLoadPlanDuxo);
        }
    }
}
