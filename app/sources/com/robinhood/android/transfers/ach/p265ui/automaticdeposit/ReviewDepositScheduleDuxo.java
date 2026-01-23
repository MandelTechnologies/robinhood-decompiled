package com.robinhood.android.transfers.ach.p265ui.automaticdeposit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.DepositScheduleFlowArgs3;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ReviewDepositScheduleFragment;
import com.robinhood.android.transfers.ach.p265ui.automaticdeposit.ReviewDepositScheduleViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.DepositScheduleStore;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.DepositSchedule;
import com.robinhood.models.util.Money3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.money.Currencies;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewDepositScheduleDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "depositScheduleStore", "Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/DepositScheduleStore;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "config", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs;", "onResume", "", "submit", "createDepositSchedule", "args", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs$Create;", "updateDepositSchedule", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewScreenArgs$Edit;", "onError", "throwable", "", "onSuccess", "timeline", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/TimelineScreenArgs;", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ReviewDepositScheduleDuxo extends OldBaseDuxo<ReviewDepositScheduleViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final DepositScheduleFlowArgs3 config;
    private final DepositScheduleStore depositScheduleStore;
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
    /* JADX WARN: Multi-variable type inference failed */
    public ReviewDepositScheduleDuxo(AchRelationshipStore achRelationshipStore, DepositScheduleStore depositScheduleStore, TraderPortfolioStore portfolioStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(depositScheduleStore, "depositScheduleStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new ReviewDepositScheduleViewState.Loaded(((ReviewDepositScheduleFragment.Args) companion.getArgs(savedStateHandle)).getReviewScreenArgs().getAmount(), ((ReviewDepositScheduleFragment.Args) companion.getArgs(savedStateHandle)).getReviewScreenArgs().getFrequency(), ((ReviewDepositScheduleFragment.Args) companion.getArgs(savedStateHandle)).getReviewScreenArgs().getStartDate(), null, ((ReviewDepositScheduleFragment.Args) companion.getArgs(savedStateHandle)).getReviewScreenArgs(), 8, null), null, 2, 0 == true ? 1 : 0);
        this.achRelationshipStore = achRelationshipStore;
        this.depositScheduleStore = depositScheduleStore;
        this.portfolioStore = portfolioStore;
        this.savedStateHandle = savedStateHandle;
        this.config = ((ReviewDepositScheduleFragment.Args) companion.getArgs((HasSavedState) this)).getReviewScreenArgs();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.achRelationshipStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(this.config.getAchRelationshipId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewDepositScheduleDuxo.onResume$lambda$1(this.f$0, (AchRelationship) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(final ReviewDepositScheduleDuxo reviewDepositScheduleDuxo, final AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        reviewDepositScheduleDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewDepositScheduleDuxo.onResume$lambda$1$lambda$0(this.f$0, achRelationship, (ReviewDepositScheduleViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewDepositScheduleViewState onResume$lambda$1$lambda$0(ReviewDepositScheduleDuxo reviewDepositScheduleDuxo, AchRelationship achRelationship, ReviewDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new ReviewDepositScheduleViewState.Loaded(reviewDepositScheduleDuxo.config.getAmount(), reviewDepositScheduleDuxo.config.getFrequency(), reviewDepositScheduleDuxo.config.getStartDate(), achRelationship, reviewDepositScheduleDuxo.config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewDepositScheduleViewState submit$lambda$2(ReviewDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ReviewDepositScheduleViewState.Submitting.INSTANCE;
    }

    public final void submit() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewDepositScheduleDuxo.submit$lambda$2((ReviewDepositScheduleViewState) obj);
            }
        });
        DepositScheduleFlowArgs3 depositScheduleFlowArgs3 = this.config;
        if (depositScheduleFlowArgs3 instanceof DepositScheduleFlowArgs3.Create) {
            createDepositSchedule((DepositScheduleFlowArgs3.Create) depositScheduleFlowArgs3);
        } else {
            if (!(depositScheduleFlowArgs3 instanceof DepositScheduleFlowArgs3.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            updateDepositSchedule((DepositScheduleFlowArgs3.Edit) depositScheduleFlowArgs3);
        }
    }

    private final void createDepositSchedule(DepositScheduleFlowArgs3.Create args) {
        bind(this.depositScheduleStore.createDepositSchedule(args.getAchRelationshipId(), Money3.toMoney(args.getAmount(), Currencies.USD), args.getFrequency(), args.getStartDate()), LifecycleEvent.ON_STOP).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewDepositScheduleDuxo.createDepositSchedule$lambda$3(this.f$0, (DepositSchedule) obj);
            }
        }, new C301532(this));
    }

    /* compiled from: ReviewDepositScheduleDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$createDepositSchedule$2 */
    /* synthetic */ class C301532 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C301532(Object obj) {
            super(1, obj, ReviewDepositScheduleDuxo.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewDepositScheduleDuxo) this.receiver).onError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDepositSchedule$lambda$3(ReviewDepositScheduleDuxo reviewDepositScheduleDuxo, DepositSchedule it) {
        Intrinsics.checkNotNullParameter(it, "it");
        reviewDepositScheduleDuxo.onSuccess(new DepositScheduleFlowArgs4(it, reviewDepositScheduleDuxo.config.getAchRelationshipId()));
        return Unit.INSTANCE;
    }

    private final void updateDepositSchedule(final DepositScheduleFlowArgs3.Edit args) {
        bind(this.depositScheduleStore.updateDepositSchedule(args.getDepositScheduleId(), args.getFrequency(), args.getStartDate()), LifecycleEvent.ON_STOP).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewDepositScheduleDuxo.updateDepositSchedule$lambda$4(this.f$0, args, (DepositSchedule) obj);
            }
        }, new C301542(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDepositSchedule$lambda$4(ReviewDepositScheduleDuxo reviewDepositScheduleDuxo, DepositScheduleFlowArgs3.Edit edit, DepositSchedule it) {
        Intrinsics.checkNotNullParameter(it, "it");
        reviewDepositScheduleDuxo.onSuccess(new DepositScheduleFlowArgs4(it, edit.getAchRelationshipId()));
        return Unit.INSTANCE;
    }

    /* compiled from: ReviewDepositScheduleDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$updateDepositSchedule$2 */
    /* synthetic */ class C301542 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C301542(Object obj) {
            super(1, obj, ReviewDepositScheduleDuxo.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ReviewDepositScheduleDuxo) this.receiver).onError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(final Throwable throwable) {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewDepositScheduleDuxo.onError$lambda$5(throwable, (ReviewDepositScheduleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewDepositScheduleViewState onError$lambda$5(Throwable th, ReviewDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return new ReviewDepositScheduleViewState.Submitted(new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)))));
    }

    private final void onSuccess(final DepositScheduleFlowArgs4 timeline) {
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.automaticdeposit.ReviewDepositScheduleDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewDepositScheduleDuxo.onSuccess$lambda$6(timeline, (ReviewDepositScheduleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewDepositScheduleViewState onSuccess$lambda$6(DepositScheduleFlowArgs4 depositScheduleFlowArgs4, ReviewDepositScheduleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new ReviewDepositScheduleViewState.Submitted(new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(depositScheduleFlowArgs4))));
    }

    /* compiled from: ReviewDepositScheduleDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleDuxo;", "Lcom/robinhood/android/transfers/ach/ui/automaticdeposit/ReviewDepositScheduleFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReviewDepositScheduleDuxo, ReviewDepositScheduleFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewDepositScheduleFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ReviewDepositScheduleFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewDepositScheduleFragment.Args getArgs(ReviewDepositScheduleDuxo reviewDepositScheduleDuxo) {
            return (ReviewDepositScheduleFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, reviewDepositScheduleDuxo);
        }
    }
}
