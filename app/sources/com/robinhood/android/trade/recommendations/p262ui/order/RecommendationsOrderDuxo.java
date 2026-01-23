package com.robinhood.android.trade.recommendations.p262ui.order;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.tickerinputview.CharArrays;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsOrderDuxo;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsOrderFragment;
import com.robinhood.android.trade.recommendations.p262ui.order.RecommendationsOrderViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutAmountStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutReviewStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsOrderSummaryStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutAmount;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutReview;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsOrderSummary;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Notification;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001FBI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u001eJ \u0010&\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\u0006\u0010+\u001a\u00020\u001eJ\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\u001e2\u0006\u0010#\u001a\u000200J\u0016\u00101\u001a\u00020\u001e2\u0006\u0010#\u001a\u0002002\u0006\u0010'\u001a\u00020(J\u001e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010'\u001a\u00020(J\u0006\u00107\u001a\u00020\u001eJ\u0006\u00108\u001a\u00020\u001eJ\u001a\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010>\u001a\u00020<H\u0002J\u0010\u0010?\u001a\u00020@2\u0006\u00103\u001a\u000204H\u0002J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u00105\u001a\u000206H\u0002J\"\u0010C\u001a\b\u0012\u0004\u0012\u0002HD0\u0019\"\b\b\u0000\u0010D*\u00020E*\b\u0012\u0004\u0012\u0002HD0\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "orderManager", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;", "recsOrderSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderSummaryStore;", "recsCheckoutReviewStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutReviewStore;", "recsCheckoutAmountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutAmountStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderSubmissionManager;Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsOrderSummaryStore;Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutReviewStore;Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutAmountStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "unifiedAccountStream", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getUnifiedAccountStream", "()Lio/reactivex/Observable;", "onCreate", "", "onStart", "nextPage", "previousPage", "refreshCheckoutReview", "amount", "Lcom/robinhood/models/util/Money;", "onEditClicked", "submitOrder", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onDisclosureSigned", "consumeKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "onQuickTradeAmountTap", "", "logQuickTradeAmountButtonAppear", "logReviewButtonClicked", "page", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderState;", "buttonAction", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$ReviewButtonAction;", "launchTransferFlow", "refreshBuyingPowerIfNeeded", "validate", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderViewState$Error;", "amountCharArray", "", "format", "charArray", "getLoggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingButtonAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "applyErrorEventOnError", "T", "", "Companion", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RecommendationsOrderDuxo extends OldBaseDuxo<RecommendationsOrderViewState> implements HasSavedState {
    private static final NumberFormat FORMATTER;
    private final AchRelationshipStore achRelationshipStore;
    private final EventLogger eventLogger;
    private final RecommendationsOrderSubmissionManager orderManager;
    private final RecommendationsCheckoutAmountStore recsCheckoutAmountStore;
    private final RecommendationsCheckoutReviewStore recsCheckoutReviewStore;
    private final RecommendationsOrderSummaryStore recsOrderSummaryStore;
    private final SavedStateHandle savedStateHandle;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecommendationsOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecommendationsOrderState.values().length];
            try {
                iArr[RecommendationsOrderState.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecommendationsOrderState.BREAKDOWN_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecommendationsOrderState.SWIPE_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecommendationsOrderViewState.ReviewButtonAction.values().length];
            try {
                iArr2[RecommendationsOrderViewState.ReviewButtonAction.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecommendationsOrderViewState.ReviewButtonAction.LINK_BANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RecommendationsOrderViewState.ReviewButtonAction.DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecommendationsOrderDuxo(RecommendationsOrderSubmissionManager orderManager, RecommendationsOrderSummaryStore recsOrderSummaryStore, RecommendationsCheckoutReviewStore recsCheckoutReviewStore, RecommendationsCheckoutAmountStore recsCheckoutAmountStore, UnifiedAccountStore unifiedAccountStore, AchRelationshipStore achRelationshipStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(recsOrderSummaryStore, "recsOrderSummaryStore");
        Intrinsics.checkNotNullParameter(recsCheckoutReviewStore, "recsCheckoutReviewStore");
        Intrinsics.checkNotNullParameter(recsCheckoutAmountStore, "recsCheckoutAmountStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecommendationsOrderViewState(((RecommendationsOrderFragment.Args) companion.getArgs(savedStateHandle)).getAccountNumber(), null, false, null, null, null, null, null, false, null, null, null, null, false, false, ((RecommendationsOrderFragment.Args) companion.getArgs(savedStateHandle)).getSource(), 32766, null), null, 2, null);
        this.orderManager = orderManager;
        this.recsOrderSummaryStore = recsOrderSummaryStore;
        this.recsCheckoutReviewStore = recsCheckoutReviewStore;
        this.recsCheckoutAmountStore = recsCheckoutAmountStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.achRelationshipStore = achRelationshipStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    private final Observable<UnifiedAccountV2> getUnifiedAccountStream() {
        String accountNumber = ((RecommendationsOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber != null) {
            return ObservablesKt.filterIsPresent(this.unifiedAccountStore.streamAccount(accountNumber));
        }
        return this.unifiedAccountStore.streamIndividualAccount();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        this.unifiedAccountStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.unifiedAccountStore.poll(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        Observable observableDoAfterNext = getUnifiedAccountStream().map(new RecommendationsOrderDuxo5(new PropertyReference1Impl() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onCreate$buyingPowerObservable$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((UnifiedAccountV2) obj).getAccountBuyingPower();
            }
        })).distinctUntilChanged().doAfterNext(new RecommendationsOrderDuxo4(this));
        Intrinsics.checkNotNullExpressionValue(observableDoAfterNext, "doAfterNext(...)");
        Observable observableDistinctUntilChanged = getUnifiedAccountStream().map(new RecommendationsOrderDuxo5(new PropertyReference1Impl() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onCreate$brokerageAccountTypeObservable$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((UnifiedAccountV2) obj).getBrokerageAccountType();
            }
        })).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observables observables = Observables.INSTANCE;
        Observable<List<AchRelationship>> linkedAchRelationships = this.achRelationshipStore.getLinkedAchRelationships();
        RecommendationsCheckoutAmountStore recommendationsCheckoutAmountStore = this.recsCheckoutAmountStore;
        Companion companion = INSTANCE;
        Observable<Optional<UiRecommendationsCheckoutAmount>> observable = recommendationsCheckoutAmountStore.getCheckoutAmount(((RecommendationsOrderFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber(), ((RecommendationsOrderFragment.Args) companion.getArgs((HasSavedState) this)).getRecommendationId()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<R> map = observable.map(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional((UiRecommendationsCheckoutAmount) ((Optional) it).getOrNull());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RecommendationsOrderDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableCombineLatest = Observable.combineLatest(observableDoAfterNext, observableDistinctUntilChanged, linkedAchRelationships, ObservablesKt.filterIsPresent(map), new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onCreate$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                Intrinsics.checkParameterIsNotNull(t4, "t4");
                return (R) new RecommendationsOrderViewState.RequiredState((Money) t1, (BrokerageAccountType) t2, !((List) t3).isEmpty(), (UiRecommendationsCheckoutAmount) t4);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        LifecycleHost.DefaultImpls.bind$default(this, applyErrorEventOnError(observableCombineLatest), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onCreate$lambda$3(this.f$0, (RecommendationsOrderViewState.RequiredState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RecommendationsOrderDuxo recommendationsOrderDuxo, final RecommendationsOrderViewState.RequiredState requiredState) {
        Intrinsics.checkNotNullParameter(requiredState, "requiredState");
        recommendationsOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onCreate$lambda$3$lambda$2(requiredState, (RecommendationsOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState onCreate$lambda$3$lambda$2(RecommendationsOrderViewState.RequiredState requiredState, RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : requiredState, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = getStates().filter(new Predicate() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(RecommendationsOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getRequiredState() != null;
            }
        }).map(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final Tuples2<RecommendationsOrderState, Context> apply(RecommendationsOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Tuples4.m3642to(state.getCurrentState(), state.getLoggingContext());
            }
        }).distinctUntilChanged((Function<? super R, K>) new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final RecommendationsOrderState apply(Tuples2<? extends RecommendationsOrderState, Context> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return tuples2.component1();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onStart$lambda$4(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableFilter = getStates().map(new RecommendationsOrderDuxo5(new PropertyReference1Impl() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.5
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RecommendationsOrderViewState) obj).getCurrentState();
            }
        })).distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(RecommendationsOrderState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it == RecommendationsOrderState.INPUT;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onStart$lambda$6(this.f$0, (RecommendationsOrderState) obj);
            }
        });
        Observable observableDoOnEach = getStates().distinctUntilChanged((Function<? super RecommendationsOrderViewState, K>) new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.8
            @Override // io.reactivex.functions.Function
            public final RecommendationsOrderState apply(RecommendationsOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getCurrentState();
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.9
            @Override // io.reactivex.functions.Predicate
            public final boolean test(RecommendationsOrderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCurrentState() == RecommendationsOrderState.BREAKDOWN_REVIEW;
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo.onStart.10
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<UiRecommendationsCheckoutReview, Optional<UiRecommendationsOrderSummary>>> apply(RecommendationsOrderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                Observables observables = Observables.INSTANCE;
                RecommendationsCheckoutReviewStore recommendationsCheckoutReviewStore = RecommendationsOrderDuxo.this.recsCheckoutReviewStore;
                Companion companion = RecommendationsOrderDuxo.INSTANCE;
                Observable<UiRecommendationsCheckoutReview> observablePoll = recommendationsCheckoutReviewStore.poll(((RecommendationsOrderFragment.Args) companion.getArgs((HasSavedState) RecommendationsOrderDuxo.this)).getRecommendationId(), state.getAmount());
                Observable<Optional<UiRecommendationsOrderSummary>> observable = RecommendationsOrderDuxo.this.recsOrderSummaryStore.createRecommendationOrderSummary(((RecommendationsOrderFragment.Args) companion.getArgs((HasSavedState) RecommendationsOrderDuxo.this)).getRecommendationId(), state.getAmount(), state.getAccountNumber()).toObservable();
                Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                return observables.combineLatest(observablePoll, observable);
            }
        }).doOnEach(new C2992211());
        Intrinsics.checkNotNullExpressionValue(observableDoOnEach, "doOnEach(...)");
        LifecycleHost.DefaultImpls.bind$default(this, applyErrorEventOnError(observableDoOnEach), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onStart$lambda$8(this.f$0, (Tuples2) obj);
            }
        });
        this.unifiedAccountStore.refresh(true);
        this.achRelationshipStore.refresh(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(RecommendationsOrderDuxo recommendationsOrderDuxo, Tuples2 tuples2) {
        RecommendationsOrderState recommendationsOrderState = (RecommendationsOrderState) tuples2.component1();
        EventLogger.DefaultImpls.logScreenAppear$default(recommendationsOrderDuxo.eventLogger, null, recommendationsOrderDuxo.getLoggingScreen(recommendationsOrderState), null, null, (Context) tuples2.component2(), 13, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(RecommendationsOrderDuxo recommendationsOrderDuxo, RecommendationsOrderState recommendationsOrderState) {
        recommendationsOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onStart$lambda$6$lambda$5((RecommendationsOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState onStart$lambda$6$lambda$5(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    /* compiled from: RecommendationsOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onStart$11 */
    static final class C2992211<T> implements Consumer {
        C2992211() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecommendationsOrderViewState accept$lambda$0(RecommendationsOrderViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : true, (57343 & 32768) != 0 ? applyMutation.source : null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Notification<Tuples2<UiRecommendationsCheckoutReview, Optional<UiRecommendationsOrderSummary>>> notification) {
            RecommendationsOrderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$onStart$11$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsOrderDuxo.C2992211.accept$lambda$0((RecommendationsOrderViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(RecommendationsOrderDuxo recommendationsOrderDuxo, Tuples2 tuples2) {
        final UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview = (UiRecommendationsCheckoutReview) tuples2.component1();
        final Optional optional = (Optional) tuples2.component2();
        recommendationsOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onStart$lambda$8$lambda$7(uiRecommendationsCheckoutReview, optional, (RecommendationsOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState onStart$lambda$8$lambda$7(UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview, Optional optional, RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : uiRecommendationsCheckoutReview, (57343 & 16) != 0 ? applyMutation.orderSummary : (UiRecommendationsOrderSummary) optional.getOrNull(), (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState nextPage$lambda$9(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecommendationsOrderState nextState = applyMutation.getCurrentState().getNextState();
        if (nextState == null) {
            nextState = applyMutation.getCurrentState();
        }
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : nextState, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void nextPage() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.nextPage$lambda$9((RecommendationsOrderViewState) obj);
            }
        });
    }

    public final void previousPage() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.previousPage$lambda$10((RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState previousPage$lambda$10(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecommendationsOrderState previousState = applyMutation.getCurrentState().getPreviousState();
        if (previousState != null) {
            return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : previousState, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
        }
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : new UiEvent(Unit.INSTANCE), (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void refreshCheckoutReview(Money amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.refreshCheckoutReview$lambda$11((RecommendationsOrderViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.recsCheckoutReviewStore.createCheckoutReview(((RecommendationsOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getRecommendationId(), amount), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.refreshCheckoutReview$lambda$13(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState refreshCheckoutReview$lambda$11(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : true, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : true, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshCheckoutReview$lambda$13(RecommendationsOrderDuxo recommendationsOrderDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview = (UiRecommendationsCheckoutReview) optional.component1();
        recommendationsOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.refreshCheckoutReview$lambda$13$lambda$12(uiRecommendationsCheckoutReview, (RecommendationsOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState refreshCheckoutReview$lambda$13$lambda$12(UiRecommendationsCheckoutReview uiRecommendationsCheckoutReview, RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : uiRecommendationsCheckoutReview, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void onEditClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onEditClicked$lambda$14(this.f$0, (RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState onEditClicked$lambda$14(RecommendationsOrderDuxo recommendationsOrderDuxo, RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        EventLogger.DefaultImpls.logTap$default(recommendationsOrderDuxo.eventLogger, UserInteractionEventData.Action.EDIT, recommendationsOrderDuxo.getLoggingScreen(applyMutation.getCurrentState()), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, applyMutation.getLoggingContext(), false, 40, null);
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : RecommendationsOrderState.INPUT, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void submitOrder(Money amount, Context loggingContext, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        RecommendationsOrderSubmissionManager recommendationsOrderSubmissionManager = this.orderManager;
        Companion companion = INSTANCE;
        OrderSubmissionManager.submit$default(recommendationsOrderSubmissionManager, new RecommendationsOrderRequest(((RecommendationsOrderFragment.Args) companion.getArgs((HasSavedState) this)).getRefId(), ((RecommendationsOrderFragment.Args) companion.getArgs((HasSavedState) this)).getRecommendationId(), amount, ((RecommendationsOrderFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber(), brokerageAccountType), null, false, 6, null);
        EventLogger.DefaultImpls.logSwipe$default(this.eventLogger, UserInteractionEventData.Action.SUBMIT_RECOMMENDATION_ORDER, getLoggingScreen(RecommendationsOrderState.SWIPE_UP), null, null, loggingContext, false, 44, null);
    }

    public final void onDisclosureSigned() {
        nextPage();
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onDisclosureSigned$lambda$15((RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState onDisclosureSigned$lambda$15(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : true, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void consumeKeyEvent(final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.consumeKeyEvent$lambda$16(this.f$0, keyEvent, (RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState consumeKeyEvent$lambda$16(RecommendationsOrderDuxo recommendationsOrderDuxo, KeyEvent keyEvent, RecommendationsOrderViewState applyMutation) {
        char[] initial_state;
        BigDecimal number;
        Money money;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        RecommendationsOrderViewState.Error errorValidate = recommendationsOrderDuxo.validate(applyMutation.getAmountCharArray(), keyEvent);
        if (errorValidate != null) {
            return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : new UiEvent(errorValidate), (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
        }
        if (KeyEvents2.isDelete(keyEvent)) {
            if (applyMutation.getAmountCharArray().length > 2) {
                initial_state = recommendationsOrderDuxo.format(CollectionsKt.toCharArray(ArraysKt.dropLast(applyMutation.getAmountCharArray(), 1)));
            } else {
                initial_state = RecommendationsOrderViewState.INSTANCE.getINITIAL_STATE();
            }
        } else if (KeyEvents2.isDigit(keyEvent) || KeyEvents2.isDot(keyEvent)) {
            initial_state = recommendationsOrderDuxo.format(ArraysKt.plus(applyMutation.getAmountCharArray(), keyEvent.getNumber()));
            if (initial_state == null) {
                initial_state = RecommendationsOrderViewState.INSTANCE.getINITIAL_STATE();
            }
        } else {
            initial_state = null;
        }
        char[] cArr = initial_state;
        if (cArr == null || (number = CharArrays.toNumber(cArr)) == null || (money = Money3.toMoney(number, Currencies.USD)) == null) {
            return applyMutation;
        }
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : money, (57343 & 64) != 0 ? applyMutation.amountCharArray : cArr, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void onQuickTradeAmountTap(final int amount) {
        char[] charArray = "$".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        char[] charArray2 = String.valueOf(amount).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        final char[] cArrPlus = ArraysKt.plus(charArray, charArray2);
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.onQuickTradeAmountTap$lambda$17(this.f$0, amount, cArrPlus, (RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState onQuickTradeAmountTap$lambda$17(RecommendationsOrderDuxo recommendationsOrderDuxo, int i, char[] cArr, RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        EventLogger.DefaultImpls.logTap$default(recommendationsOrderDuxo.eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.RECS_ORDER_ENTRY, null, String.valueOf(i), null, 10, null), new Component(Component.ComponentType.BUTTON, String.valueOf(i), null, 4, null), null, applyMutation.getLoggingContext(), false, 40, null);
        RecommendationsOrderState recommendationsOrderState = RecommendationsOrderState.BREAKDOWN_REVIEW;
        BigDecimal number = CharArrays.toNumber(cArr);
        Intrinsics.checkNotNull(number);
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : recommendationsOrderState, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : Money3.toMoney(number, Currencies.USD), (57343 & 64) != 0 ? applyMutation.amountCharArray : cArr, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void logQuickTradeAmountButtonAppear(int amount, Context loggingContext) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.RECS_ORDER_ENTRY, null, String.valueOf(amount), null, 10, null), new Component(Component.ComponentType.BUTTON, String.valueOf(amount), null, 4, null), null, loggingContext, 8, null);
    }

    public final void logReviewButtonClicked(RecommendationsOrderState page, RecommendationsOrderViewState.ReviewButtonAction buttonAction, Context loggingContext) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(buttonAction, "buttonAction");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        UserInteractionEventData.Action loggingButtonAction = getLoggingButtonAction(buttonAction);
        if (loggingButtonAction == null) {
            return;
        }
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, loggingButtonAction, getLoggingScreen(page), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, loggingContext, false, 40, null);
    }

    public final void launchTransferFlow() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.launchTransferFlow$lambda$18((RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState launchTransferFlow$lambda$18(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : new UiEvent(Unit.INSTANCE), (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    public final void refreshBuyingPowerIfNeeded() {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.refreshBuyingPowerIfNeeded$lambda$21(this.f$0, (RecommendationsOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState refreshBuyingPowerIfNeeded$lambda$21(final RecommendationsOrderDuxo recommendationsOrderDuxo, RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getRequiredMinDeposit() != null) {
            recommendationsOrderDuxo.unifiedAccountStore.refresh(true);
            Observable<Long> observableTimer = Observable.timer(5L, TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
            LifecycleHost.DefaultImpls.bind$default(recommendationsOrderDuxo, observableTimer, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsOrderDuxo.refreshBuyingPowerIfNeeded$lambda$21$lambda$20(this.f$0, (Long) obj);
                }
            });
            return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : true, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
        }
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshBuyingPowerIfNeeded$lambda$21$lambda$20(RecommendationsOrderDuxo recommendationsOrderDuxo, Long l) {
        recommendationsOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsOrderDuxo.refreshBuyingPowerIfNeeded$lambda$21$lambda$20$lambda$19((RecommendationsOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsOrderViewState refreshBuyingPowerIfNeeded$lambda$21$lambda$20$lambda$19(RecommendationsOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : null, (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
    }

    private final RecommendationsOrderViewState.Error validate(char[] amountCharArray, KeyEvent keyEvent) {
        BigDecimal number;
        if (KeyEvents2.isDigit(keyEvent) && (number = CharArrays.toNumber(ArraysKt.plus(amountCharArray, keyEvent.getNumber()))) != null && number.compareTo(RecommendationsOrderViewState.INSTANCE.getMAX_AMOUNT()) > 0) {
            return RecommendationsOrderViewState.Error.GREATER_THAN_MAX;
        }
        if (!KeyEvents2.isDot(keyEvent) || CharArrays.isNumber(ArraysKt.plus(amountCharArray, keyEvent.getNumber()))) {
            return null;
        }
        return RecommendationsOrderViewState.Error.GENERIC;
    }

    private final char[] format(char[] charArray) {
        char[] charArray2;
        List<char[]> listSplitByDecimalSeparator = CharArrays.splitByDecimalSeparator(CharArrays.dropChars(charArray, TickerInputView.CURRENCY_SYMBOL), '.');
        if (listSplitByDecimalSeparator.isEmpty()) {
            return null;
        }
        BigDecimal number = CharArrays.toNumber(listSplitByDecimalSeparator.get(0));
        if (number == null) {
            charArray2 = new char[0];
        } else {
            String str = FORMATTER.format(number);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            charArray2 = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        }
        if (listSplitByDecimalSeparator.size() == 1) {
            return ArraysKt.plus(new char[]{TickerInputView.CURRENCY_SYMBOL}, charArray2);
        }
        if (listSplitByDecimalSeparator.size() != 2) {
            return null;
        }
        return ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(new char[]{TickerInputView.CURRENCY_SYMBOL}, charArray2), '.'), ArraysKt.take(listSplitByDecimalSeparator.get(1), FORMATTER.getMaximumFractionDigits()));
    }

    private final Screen getLoggingScreen(RecommendationsOrderState page) {
        Screen.Name name;
        int i = WhenMappings.$EnumSwitchMapping$0[page.ordinal()];
        if (i == 1) {
            name = Screen.Name.RECS_ORDER_ENTRY;
        } else if (i == 2) {
            name = Screen.Name.RECS_ORDER_REVIEW;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            name = Screen.Name.RECS_ORDER_SUMMARY;
        }
        Screen.Name name2 = name;
        String string2 = ((RecommendationsOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getRecommendationId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name2, null, string2, null, 10, null);
    }

    private final UserInteractionEventData.Action getLoggingButtonAction(RecommendationsOrderViewState.ReviewButtonAction buttonAction) {
        int i = WhenMappings.$EnumSwitchMapping$1[buttonAction.ordinal()];
        if (i == 1) {
            return UserInteractionEventData.Action.CONTINUE;
        }
        if (i == 2) {
            return UserInteractionEventData.Action.VIEW_BANK_LINKING;
        }
        if (i != 3) {
            return null;
        }
        return UserInteractionEventData.Action.VIEW_FUNDING;
    }

    /* compiled from: RecommendationsOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$applyErrorEventOnError$1 */
    static final class C299181<T> implements Consumer {
        C299181() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecommendationsOrderViewState accept$lambda$0(Throwable th, RecommendationsOrderViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((57343 & 1) != 0 ? applyMutation.accountNumber : null, (57343 & 2) != 0 ? applyMutation.currentState : null, (57343 & 4) != 0 ? applyMutation.isCheckoutReviewLoading : false, (57343 & 8) != 0 ? applyMutation.checkoutReview : null, (57343 & 16) != 0 ? applyMutation.orderSummary : null, (57343 & 32) != 0 ? applyMutation.amount : null, (57343 & 64) != 0 ? applyMutation.amountCharArray : null, (57343 & 128) != 0 ? applyMutation.amountError : null, (57343 & 256) != 0 ? applyMutation.disclosureSigned : false, (57343 & 512) != 0 ? applyMutation.exitFlowEvent : null, (57343 & 1024) != 0 ? applyMutation.requiredState : null, (57343 & 2048) != 0 ? applyMutation.errorEvent : new UiEvent(th), (57343 & 4096) != 0 ? applyMutation.launchTransferFlowEvent : null, (57343 & 8192) != 0 ? applyMutation.buyingPowerStale : false, (57343 & 16384) != 0 ? applyMutation.internalIsLoading : false, (57343 & 32768) != 0 ? applyMutation.source : null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Throwable th) {
            RecommendationsOrderDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderDuxo$applyErrorEventOnError$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsOrderDuxo.C299181.accept$lambda$0(th, (RecommendationsOrderViewState) obj);
                }
            });
        }
    }

    private final <T> Observable<T> applyErrorEventOnError(Observable<T> observable) {
        Observable<T> observableDoOnError = observable.doOnError(new C299181());
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        return observableDoOnError;
    }

    /* compiled from: RecommendationsOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderDuxo;", "Lcom/robinhood/android/trade/recommendations/ui/order/RecommendationsOrderFragment$Args;", "<init>", "()V", "FORMATTER", "Ljava/text/NumberFormat;", "feature-trade-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsOrderDuxo, RecommendationsOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsOrderFragment.Args getArgs(RecommendationsOrderDuxo recommendationsOrderDuxo) {
            return (RecommendationsOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsOrderDuxo);
        }
    }

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setRoundingMode(RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(numberInstance, "apply(...)");
        FORMATTER = numberInstance;
    }
}
