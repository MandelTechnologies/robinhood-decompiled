package com.robinhood.android.transfers.ach.p265ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.util.ExtensionsKt;
import com.robinhood.android.transfers.ach.util.LoggingUtils7;
import com.robinhood.android.transfers.ach.util.TransferData;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.cashier.AchTransferStore;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either2;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReviewAchTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "achTransferStore", "Lcom/robinhood/librobinhood/data/store/cashier/AchTransferStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/cashier/AchTransferStore;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "submitTransfer", "baseFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "createTransfer", "createRecurringDeposit", "onTransferSuccess", "result", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ReviewAchTransferDuxo extends BaseDuxo4<ReviewAchTransferViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final AchTransferStore achTransferStore;
    private final AutomaticDepositStore automaticDepositStore;
    private final BalancesStore balancesStore;
    private final TraderPortfolioStore portfolioStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReviewAchTransferDuxo(BalancesStore balancesStore, AchRelationshipStore achRelationshipStore, AchTransferStore achTransferStore, AutomaticDepositStore automaticDepositStore, TraderPortfolioStore portfolioStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(achTransferStore, "achTransferStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new ReviewAchTransferViewState(((ReviewAchTransferFragment.Args) companion.getArgs(savedStateHandle)).getAmount(), ((ReviewAchTransferFragment.Args) companion.getArgs(savedStateHandle)).getFrequency(), ((ReviewAchTransferFragment.Args) companion.getArgs(savedStateHandle)).getTransferContext(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null), duxoBundle);
        this.balancesStore = balancesStore;
        this.achRelationshipStore = achRelationshipStore;
        this.achTransferStore = achTransferStore;
        this.automaticDepositStore = automaticDepositStore;
        this.portfolioStore = portfolioStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.balancesStore.refreshIndividualAccount(false);
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.balancesStore.streamIndividualAccountUnifiedBalances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewAchTransferDuxo.onResume$lambda$0(this.f$0, (UnifiedBalances) obj);
            }
        });
        this.achRelationshipStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(((ReviewAchTransferFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAchRelationshipId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewAchTransferDuxo.onResume$lambda$1(this.f$0, (AchRelationship) obj);
            }
        });
        this.portfolioStore.refreshIndividualAccountPortfolio(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.portfolioStore.getIndividualAccountPortfolio(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewAchTransferDuxo.onResume$lambda$2(this.f$0, (Portfolio) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(ReviewAchTransferDuxo reviewAchTransferDuxo, UnifiedBalances balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        reviewAchTransferDuxo.applyMutation(new ReviewAchTransferDuxo4(balances, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(ReviewAchTransferDuxo reviewAchTransferDuxo, AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        reviewAchTransferDuxo.applyMutation(new ReviewAchTransferDuxo5(achRelationship, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(ReviewAchTransferDuxo reviewAchTransferDuxo, Portfolio portfolio) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        reviewAchTransferDuxo.applyMutation(new ReviewAchTransferDuxo6(portfolio, null));
        return Unit.INSTANCE;
    }

    public final void submitTransfer(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        Companion companion = INSTANCE;
        if (!((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getFrequency().getIsRecurring()) {
            createTransfer(baseFragment);
        } else {
            if (((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getTransferContext().getDirection() == TransferDirection.WITHDRAW) {
                throw new IllegalStateException("Cannot withdraw with deposit schedule");
            }
            createRecurringDeposit(baseFragment);
        }
    }

    private final void createTransfer(BaseFragment baseFragment) {
        String string2;
        Companion companion = INSTANCE;
        UUID uuidGenerateRefId = ExtensionsKt.generateRefId(baseFragment, new TransferData(((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getAchRelationshipId(), ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getAmount(), ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getTransferContext().getDirection()));
        Money moneyForLogging = com.robinhood.android.transfers.lib.ExtensionsKt.toMoneyForLogging(((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getAmount());
        TransferContext.Direction directionForLogging = LoggingUtils7.toDirectionForLogging(((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getTransferContext().getDirection());
        TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.ACH;
        if (!((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getFrequency().getIsRecurring()) {
            string2 = uuidGenerateRefId.toString();
        } else {
            string2 = "";
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        String string3 = ExtensionsKt.getSessionId(baseFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C301211(uuidGenerateRefId, new TransferContext(moneyForLogging, directionForLogging, null, null, paymentInstrument, str, string3, null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null), null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo.createTransfer.2
            @Override // io.reactivex.functions.Function
            public final BaseReviewAchTransferFragment.AchTransferResult apply(AchTransfer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new BaseReviewAchTransferFragment.AchTransferResult(null, it, null, 5, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        bind(map, LifecycleEvent.ON_STOP).subscribeKotlin(new C301233(this), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewAchTransferDuxo.createTransfer$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: ReviewAchTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/transfers/models/db/AchTransfer;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createTransfer$1", m3645f = "ReviewAchTransferDuxo.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createTransfer$1 */
    static final class C301211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AchTransfer>, Object> {
        final /* synthetic */ UUID $refId;
        final /* synthetic */ TransferContext $transferContextForLogging;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C301211(UUID uuid, TransferContext transferContext, Continuation<? super C301211> continuation) {
            super(2, continuation);
            this.$refId = uuid;
            this.$transferContextForLogging = transferContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewAchTransferDuxo.this.new C301211(this.$refId, this.$transferContextForLogging, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AchTransfer> continuation) {
            return ((C301211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AchTransferStore achTransferStore = ReviewAchTransferDuxo.this.achTransferStore;
            Companion companion = ReviewAchTransferDuxo.INSTANCE;
            UUID achRelationshipId = ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) ReviewAchTransferDuxo.this)).getAchRelationshipId();
            BigDecimal amount = ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) ReviewAchTransferDuxo.this)).getAmount();
            TransferDirection direction = ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) ReviewAchTransferDuxo.this)).getTransferContext().getDirection();
            UUID uuid = this.$refId;
            UserInteractionEventData userInteractionEventData = new UserInteractionEventData(null, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.TRANSFERS, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$transferContextForLogging, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -65537, -1, -1, -1, -1, 16383, null), null, null, 111, null);
            this.label = 1;
            Object objCreateAchTransfer = achTransferStore.createAchTransfer(achRelationshipId, amount, direction, uuid, userInteractionEventData, this);
            return objCreateAchTransfer == coroutine_suspended ? coroutine_suspended : objCreateAchTransfer;
        }
    }

    /* compiled from: ReviewAchTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createTransfer$3 */
    /* synthetic */ class C301233 extends FunctionReferenceImpl implements Function1<BaseReviewAchTransferFragment.AchTransferResult, Unit> {
        C301233(Object obj) {
            super(1, obj, ReviewAchTransferDuxo.class, "onTransferSuccess", "onTransferSuccess(Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BaseReviewAchTransferFragment.AchTransferResult achTransferResult) {
            invoke2(achTransferResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BaseReviewAchTransferFragment.AchTransferResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewAchTransferDuxo) this.receiver).onTransferSuccess(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTransfer$lambda$3(ReviewAchTransferDuxo reviewAchTransferDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        reviewAchTransferDuxo.applyMutation(new ReviewAchTransferDuxo3(throwable, null));
        return Unit.INSTANCE;
    }

    private final void createRecurringDeposit(BaseFragment baseFragment) {
        Companion companion = INSTANCE;
        Money moneyForLogging = com.robinhood.android.transfers.lib.ExtensionsKt.toMoneyForLogging(((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getAmount());
        TransferContext.Frequency frequencyForLogging = LoggingUtils7.toFrequencyForLogging(((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) this)).getFrequency());
        TransferContext.PaymentInstrument paymentInstrument = TransferContext.PaymentInstrument.ACH;
        String string2 = ExtensionsKt.getSessionId(baseFragment).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C301181(new TransferContext(moneyForLogging, null, null, frequencyForLogging, paymentInstrument, null, string2, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, null), null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo.createRecurringDeposit.2
            @Override // io.reactivex.functions.Function
            public final BaseReviewAchTransferFragment.AchTransferResult apply(AutomaticDeposit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new BaseReviewAchTransferFragment.AchTransferResult(null, null, it, 3, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        bind(map, LifecycleEvent.ON_STOP).subscribeKotlin(new C301203(this), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewAchTransferDuxo.createRecurringDeposit$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: ReviewAchTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/AutomaticDeposit;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createRecurringDeposit$1", m3645f = "ReviewAchTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createRecurringDeposit$1 */
    static final class C301181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AutomaticDeposit>, Object> {
        final /* synthetic */ TransferContext $transferContextForLogging;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C301181(TransferContext transferContext, Continuation<? super C301181> continuation) {
            super(2, continuation);
            this.$transferContextForLogging = transferContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewAchTransferDuxo.this.new C301181(this.$transferContextForLogging, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AutomaticDeposit> continuation) {
            return ((C301181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            AutomaticDepositStore automaticDepositStore = ReviewAchTransferDuxo.this.automaticDepositStore;
            Companion companion = ReviewAchTransferDuxo.INSTANCE;
            UUID achRelationshipId = ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) ReviewAchTransferDuxo.this)).getAchRelationshipId();
            BigDecimal amount = ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) ReviewAchTransferDuxo.this)).getAmount();
            ApiAutomaticDeposit.Frequency frequency = ((ReviewAchTransferFragment.Args) companion.getArgs((HasSavedState) ReviewAchTransferDuxo.this)).getFrequency();
            UserInteractionEventData userInteractionEventData = new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.TRANSFERS, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$transferContextForLogging, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -65537, -1, -1, -1, -1, 16383, null), null, null, 110, null);
            this.label = 1;
            Object objCreateAutomaticDeposit = automaticDepositStore.createAutomaticDeposit(achRelationshipId, amount, frequency, userInteractionEventData, this);
            return objCreateAutomaticDeposit == coroutine_suspended ? coroutine_suspended : objCreateAutomaticDeposit;
        }
    }

    /* compiled from: ReviewAchTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$createRecurringDeposit$3 */
    /* synthetic */ class C301203 extends FunctionReferenceImpl implements Function1<BaseReviewAchTransferFragment.AchTransferResult, Unit> {
        C301203(Object obj) {
            super(1, obj, ReviewAchTransferDuxo.class, "onTransferSuccess", "onTransferSuccess(Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BaseReviewAchTransferFragment.AchTransferResult achTransferResult) {
            invoke2(achTransferResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BaseReviewAchTransferFragment.AchTransferResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewAchTransferDuxo) this.receiver).onTransferSuccess(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createRecurringDeposit$lambda$4(ReviewAchTransferDuxo reviewAchTransferDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        reviewAchTransferDuxo.applyMutation(new ReviewAchTransferDuxo2(throwable, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTransferSuccess(BaseReviewAchTransferFragment.AchTransferResult result) {
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        applyMutation(new C301241(result, null));
    }

    /* compiled from: ReviewAchTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$onTransferSuccess$1", m3645f = "ReviewAchTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewAchTransferDuxo$onTransferSuccess$1 */
    static final class C301241 extends ContinuationImpl7 implements Function2<ReviewAchTransferViewState, Continuation<? super ReviewAchTransferViewState>, Object> {
        final /* synthetic */ BaseReviewAchTransferFragment.AchTransferResult $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C301241(BaseReviewAchTransferFragment.AchTransferResult achTransferResult, Continuation<? super C301241> continuation) {
            super(2, continuation);
            this.$result = achTransferResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C301241 c301241 = new C301241(this.$result, continuation);
            c301241.L$0 = obj;
            return c301241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewAchTransferViewState reviewAchTransferViewState, Continuation<? super ReviewAchTransferViewState> continuation) {
            return ((C301241) create(reviewAchTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewAchTransferViewState.copy$default((ReviewAchTransferViewState) this.L$0, null, null, null, null, null, null, new UiEvent(Either2.asRight(this.$result)), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    /* compiled from: ReviewAchTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferDuxo;", "Lcom/robinhood/android/transfers/ach/ui/ReviewAchTransferFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReviewAchTransferDuxo, ReviewAchTransferFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewAchTransferFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ReviewAchTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewAchTransferFragment.Args getArgs(ReviewAchTransferDuxo reviewAchTransferDuxo) {
            return (ReviewAchTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, reviewAchTransferDuxo);
        }
    }
}
