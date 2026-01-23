package com.robinhood.android.transfers.ach.p265ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.transfers.ach.p265ui.BaseReviewAchTransferFragment;
import com.robinhood.android.transfers.ach.p265ui.ReviewRecurringDepositEvent;
import com.robinhood.android.transfers.ach.p265ui.ReviewRecurringDepositFragment;
import com.robinhood.android.transfers.ach.util.LoggingUtils7;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
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

/* compiled from: ReviewRecurringDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositViewState;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "submitTransfer", "sessionId", "", "onTransferSuccess", "result", "Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ReviewRecurringDepositDuxo extends BaseDuxo5<ReviewRecurringDepositViewState, ReviewRecurringDepositEvent> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
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
    public ReviewRecurringDepositDuxo(BalancesStore balancesStore, AchRelationshipStore achRelationshipStore, TraderPortfolioStore portfolioStore, AutomaticDepositStore automaticDepositStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new ReviewRecurringDepositViewState(((ReviewRecurringDepositFragment.Args) companion.getArgs(savedStateHandle)).getMaxEarlyAccessAmount(), ((ReviewRecurringDepositFragment.Args) companion.getArgs(savedStateHandle)).getUnclearedDeposits(), ((ReviewRecurringDepositFragment.Args) companion.getArgs(savedStateHandle)).getFrequency(), null, null, null, 56, null), duxoBundle);
        this.balancesStore = balancesStore;
        this.achRelationshipStore = achRelationshipStore;
        this.portfolioStore = portfolioStore;
        this.automaticDepositStore = automaticDepositStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.balancesStore.refreshIndividualAccount(false);
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.balancesStore.streamIndividualAccountUnifiedBalances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewRecurringDepositDuxo.onResume$lambda$0(this.f$0, (UnifiedBalances) obj);
            }
        });
        this.achRelationshipStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(((ReviewRecurringDepositFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAchRelationshipId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewRecurringDepositDuxo.onResume$lambda$1(this.f$0, (AchRelationship) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(ReviewRecurringDepositDuxo reviewRecurringDepositDuxo, UnifiedBalances balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        reviewRecurringDepositDuxo.applyMutation(new ReviewRecurringDepositDuxo2(balances, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(ReviewRecurringDepositDuxo reviewRecurringDepositDuxo, AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        reviewRecurringDepositDuxo.applyMutation(new ReviewRecurringDepositDuxo3(achRelationship, null));
        return Unit.INSTANCE;
    }

    public final void submitTransfer(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Companion companion = INSTANCE;
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C301351(new TransferContext(ExtensionsKt.toMoneyForLogging(((ReviewRecurringDepositFragment.Args) companion.getArgs((HasSavedState) this)).getAmount()), null, null, LoggingUtils7.toFrequencyForLogging(((ReviewRecurringDepositFragment.Args) companion.getArgs((HasSavedState) this)).getFrequency()), TransferContext.PaymentInstrument.ACH, null, sessionId, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, null), null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositDuxo.submitTransfer.2
            @Override // io.reactivex.functions.Function
            public final BaseReviewAchTransferFragment.AchTransferResult apply(AutomaticDeposit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new BaseReviewAchTransferFragment.AchTransferResult(null, null, it, 3, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        bind(map, LifecycleEvent.ON_STOP).subscribeKotlin(new C301373(this), new Function1() { // from class: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewRecurringDepositDuxo.submitTransfer$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: ReviewRecurringDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/AutomaticDeposit;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositDuxo$submitTransfer$1", m3645f = "ReviewRecurringDepositDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositDuxo$submitTransfer$1 */
    static final class C301351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AutomaticDeposit>, Object> {
        final /* synthetic */ TransferContext $transferContextForLogging;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C301351(TransferContext transferContext, Continuation<? super C301351> continuation) {
            super(2, continuation);
            this.$transferContextForLogging = transferContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewRecurringDepositDuxo.this.new C301351(this.$transferContextForLogging, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AutomaticDeposit> continuation) {
            return ((C301351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AutomaticDepositStore automaticDepositStore = ReviewRecurringDepositDuxo.this.automaticDepositStore;
            Companion companion = ReviewRecurringDepositDuxo.INSTANCE;
            UUID achRelationshipId = ((ReviewRecurringDepositFragment.Args) companion.getArgs((HasSavedState) ReviewRecurringDepositDuxo.this)).getAchRelationshipId();
            BigDecimal amount = ((ReviewRecurringDepositFragment.Args) companion.getArgs((HasSavedState) ReviewRecurringDepositDuxo.this)).getAmount();
            ApiAutomaticDeposit.Frequency frequency = ((ReviewRecurringDepositFragment.Args) companion.getArgs((HasSavedState) ReviewRecurringDepositDuxo.this)).getFrequency();
            UserInteractionEventData userInteractionEventData = new UserInteractionEventData(UserInteractionEventData.EventType.NETWORK, null, null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.TRANSFERS, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$transferContextForLogging, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -129, -65537, -1, -1, -1, -1, 16383, null), null, null, 110, null);
            this.label = 1;
            Object objCreateAutomaticDeposit = automaticDepositStore.createAutomaticDeposit(achRelationshipId, amount, frequency, userInteractionEventData, this);
            return objCreateAutomaticDeposit == coroutine_suspended ? coroutine_suspended : objCreateAutomaticDeposit;
        }
    }

    /* compiled from: ReviewRecurringDepositDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.ReviewRecurringDepositDuxo$submitTransfer$3 */
    /* synthetic */ class C301373 extends FunctionReferenceImpl implements Function1<BaseReviewAchTransferFragment.AchTransferResult, Unit> {
        C301373(Object obj) {
            super(1, obj, ReviewRecurringDepositDuxo.class, "onTransferSuccess", "onTransferSuccess(Lcom/robinhood/android/transfers/ach/ui/BaseReviewAchTransferFragment$AchTransferResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BaseReviewAchTransferFragment.AchTransferResult achTransferResult) {
            invoke2(achTransferResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BaseReviewAchTransferFragment.AchTransferResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewRecurringDepositDuxo) this.receiver).onTransferSuccess(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitTransfer$lambda$2(ReviewRecurringDepositDuxo reviewRecurringDepositDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        reviewRecurringDepositDuxo.submit(new ReviewRecurringDepositEvent.TransferFailed(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTransferSuccess(BaseReviewAchTransferFragment.AchTransferResult result) {
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        submit(new ReviewRecurringDepositEvent.TransferSuccess(result));
    }

    /* compiled from: ReviewRecurringDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositDuxo;", "Lcom/robinhood/android/transfers/ach/ui/ReviewRecurringDepositFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReviewRecurringDepositDuxo, ReviewRecurringDepositFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewRecurringDepositFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ReviewRecurringDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewRecurringDepositFragment.Args getArgs(ReviewRecurringDepositDuxo reviewRecurringDepositDuxo) {
            return (ReviewRecurringDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, reviewRecurringDepositDuxo);
        }
    }
}
