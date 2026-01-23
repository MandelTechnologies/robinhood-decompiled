package com.robinhood.android.pathfinder.corepages.reviewagreement;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.support.contracts.pathfinder.ReviewAgreementFragmentKey;
import com.robinhood.utils.extensions.Throwables;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReviewAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementViewState;", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sendInput", "", "updateInquiryTarget", "", "updateScrolledToBottom", "handleInputError", "", "throwable", "", "handleInputError$feature_pathfinder_core_pages_externalDebug", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ReviewAgreementDuxo extends BaseDuxo5<ReviewAgreementViewState, ReviewAgreementEvent> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewAgreementDuxo(PathfinderStore pathfinderStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ReviewAgreementViewState(((UserViewStatePageContext.ReviewAgreement) ((ReviewAgreementFragmentKey) INSTANCE.getArgs(savedStateHandle)).getUserViewState().getTypeContext()).getContext(), false, null, 6, null), duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: ReviewAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$sendInput$1", m3645f = "ReviewAgreementDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$sendInput$1 */
    static final class C253451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $updateInquiryTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253451(String str, Continuation<? super C253451> continuation) {
            super(2, continuation);
            this.$updateInquiryTarget = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReviewAgreementDuxo.this.new C253451(this.$updateInquiryTarget, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ReviewAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$sendInput$1$1", m3645f = "ReviewAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$sendInput$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ReviewAgreementViewState, Continuation<? super ReviewAgreementViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ReviewAgreementViewState reviewAgreementViewState, Continuation<? super ReviewAgreementViewState> continuation) {
                return ((AnonymousClass1) create(reviewAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ReviewAgreementViewState.copy$default((ReviewAgreementViewState) this.L$0, null, true, null, 5, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C253451 c253451;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ReviewAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                PathfinderStore pathfinderStore = ReviewAgreementDuxo.this.pathfinderStore;
                Companion companion = ReviewAgreementDuxo.INSTANCE;
                UUID inquiryId = ((ReviewAgreementFragmentKey) companion.getArgs((HasSavedState) ReviewAgreementDuxo.this)).getInquiryId();
                int sequence = ((ReviewAgreementFragmentKey) companion.getArgs((HasSavedState) ReviewAgreementDuxo.this)).getUserViewState().getSequence();
                UserViewInput.ReviewAgreement reviewAgreement = new UserViewInput.ReviewAgreement(this.$updateInquiryTarget);
                final ReviewAgreementDuxo reviewAgreementDuxo = ReviewAgreementDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$sendInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(reviewAgreementDuxo.handleInputError$feature_pathfinder_core_pages_externalDebug((Throwable) obj2));
                    }
                };
                this.label = 1;
                c253451 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, reviewAgreement, function1, c253451) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c253451 = this;
            }
            ReviewAgreementDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: ReviewAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$sendInput$1$3", m3645f = "ReviewAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$sendInput$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ReviewAgreementViewState, Continuation<? super ReviewAgreementViewState>, Object> {
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
            public final Object invoke(ReviewAgreementViewState reviewAgreementViewState, Continuation<? super ReviewAgreementViewState> continuation) {
                return ((AnonymousClass3) create(reviewAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ReviewAgreementViewState.copy$default((ReviewAgreementViewState) this.L$0, null, false, null, 5, null);
            }
        }
    }

    public final void sendInput(String updateInquiryTarget) {
        Intrinsics.checkNotNullParameter(updateInquiryTarget, "updateInquiryTarget");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C253451(updateInquiryTarget, null), 3, null);
    }

    /* compiled from: ReviewAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$updateScrolledToBottom$1", m3645f = "ReviewAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.ReviewAgreementDuxo$updateScrolledToBottom$1 */
    static final class C253461 extends ContinuationImpl7 implements Function2<ReviewAgreementViewState, Continuation<? super ReviewAgreementViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C253461(Continuation<? super C253461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253461 c253461 = new C253461(continuation);
            c253461.L$0 = obj;
            return c253461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewAgreementViewState reviewAgreementViewState, Continuation<? super ReviewAgreementViewState> continuation) {
            return ((C253461) create(reviewAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewAgreementViewState.copy$default((ReviewAgreementViewState) this.L$0, null, false, ReviewAgreementViewState2.REVIEWED, 3, null);
        }
    }

    public final void updateScrolledToBottom() {
        applyMutation(new C253461(null));
    }

    public final boolean handleInputError$feature_pathfinder_core_pages_externalDebug(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(throwable);
        if (zIsNetworkRelated) {
            submit(new ReviewAgreementEvent.SendInputErrorEvent(throwable));
        }
        return zIsNetworkRelated;
    }

    /* compiled from: ReviewAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/corepages/reviewagreement/ReviewAgreementDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/ReviewAgreementFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReviewAgreementDuxo, ReviewAgreementFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewAgreementFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (ReviewAgreementFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReviewAgreementFragmentKey getArgs(ReviewAgreementDuxo reviewAgreementDuxo) {
            return (ReviewAgreementFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, reviewAgreementDuxo);
        }
    }
}
