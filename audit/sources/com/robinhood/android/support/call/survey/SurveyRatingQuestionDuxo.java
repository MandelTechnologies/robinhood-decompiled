package com.robinhood.android.support.call.survey;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.call.survey.SurveyRatingQuestionDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.contexts.SurveyRatingQuestionContext;
import com.robinhood.udf.UiEvent;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SurveyRatingQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "selectRating", "", "selectedRating", "Lcom/robinhood/models/ui/pathfinder/contexts/SurveyRatingQuestionContext$RatingValue;", "onError", "", "error", "", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SurveyRatingQuestionDuxo extends OldBaseDuxo<SurveyRatingQuestionViewState> implements HasSavedState {
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
    /* JADX WARN: Multi-variable type inference failed */
    public SurveyRatingQuestionDuxo(PathfinderStore pathfinderStore, SavedStateHandle savedStateHandle) {
        super(new SurveyRatingQuestionViewState(((LegacyFragmentKey.SurveyRatingQuestion) INSTANCE.getArgs(savedStateHandle)).getUserViewState(), null, null, 6, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: SurveyRatingQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.survey.SurveyRatingQuestionDuxo$selectRating$1", m3645f = "SurveyRatingQuestionDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.survey.SurveyRatingQuestionDuxo$selectRating$1 */
    static final class C289631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SurveyRatingQuestionContext.RatingValue $selectedRating;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C289631(SurveyRatingQuestionContext.RatingValue ratingValue, Continuation<? super C289631> continuation) {
            super(2, continuation);
            this.$selectedRating = ratingValue;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SurveyRatingQuestionDuxo.this.new C289631(this.$selectedRating, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SurveyRatingQuestionDuxo surveyRatingQuestionDuxo = SurveyRatingQuestionDuxo.this;
                final SurveyRatingQuestionContext.RatingValue ratingValue = this.$selectedRating;
                surveyRatingQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyRatingQuestionDuxo$selectRating$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SurveyRatingQuestionDuxo.C289631.invokeSuspend$lambda$0(ratingValue, (SurveyRatingQuestionViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = SurveyRatingQuestionDuxo.this.pathfinderStore;
                Companion companion = SurveyRatingQuestionDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.SurveyRatingQuestion) companion.getArgs((HasSavedState) SurveyRatingQuestionDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.SurveyRatingQuestion) companion.getArgs((HasSavedState) SurveyRatingQuestionDuxo.this)).getUserViewState().getSequence();
                UserViewInput.SurveyRatingQuestionPageInput surveyRatingQuestionPageInput = new UserViewInput.SurveyRatingQuestionPageInput(this.$selectedRating.getId());
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SurveyRatingQuestionDuxo.this);
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, surveyRatingQuestionPageInput, anonymousClass2, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final SurveyRatingQuestionViewState invokeSuspend$lambda$0(SurveyRatingQuestionContext.RatingValue ratingValue, SurveyRatingQuestionViewState surveyRatingQuestionViewState) {
            return SurveyRatingQuestionViewState.copy$default(surveyRatingQuestionViewState, null, ratingValue, null, 5, null);
        }

        /* compiled from: SurveyRatingQuestionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.support.call.survey.SurveyRatingQuestionDuxo$selectRating$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
            AnonymousClass2(Object obj) {
                super(1, obj, SurveyRatingQuestionDuxo.class, "onError", "onError(Ljava/lang/Throwable;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(((SurveyRatingQuestionDuxo) this.receiver).onError(p0));
            }
        }
    }

    public final void selectRating(SurveyRatingQuestionContext.RatingValue selectedRating) {
        Intrinsics.checkNotNullParameter(selectedRating, "selectedRating");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C289631(selectedRating, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onError(final Throwable error) {
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyRatingQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyRatingQuestionDuxo.onError$lambda$0(error, (SurveyRatingQuestionViewState) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyRatingQuestionViewState onError$lambda$0(Throwable th, SurveyRatingQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SurveyRatingQuestionViewState.copy$default(applyMutation, null, null, new UiEvent(th), 1, null);
    }

    /* compiled from: SurveyRatingQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyRatingQuestion;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SurveyRatingQuestionDuxo, LegacyFragmentKey.SurveyRatingQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SurveyRatingQuestion getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.SurveyRatingQuestion) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SurveyRatingQuestion getArgs(SurveyRatingQuestionDuxo surveyRatingQuestionDuxo) {
            return (LegacyFragmentKey.SurveyRatingQuestion) DuxoCompanion.DefaultImpls.getArgs(this, surveyRatingQuestionDuxo);
        }
    }
}
