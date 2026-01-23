package com.robinhood.android.support.call.survey;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionDuxo;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.udf.UiEvent;
import java.util.List;
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

/* compiled from: SurveyMultipleChoiceQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "updateSelection", "", "id", "", "isSelected", "", "submitChoices", "selectedChoiceIds", "", "onError", "error", "", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SurveyMultipleChoiceQuestionDuxo extends OldBaseDuxo<SurveyMultipleChoiceQuestionViewState> implements HasSavedState {
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
    public SurveyMultipleChoiceQuestionDuxo(PathfinderStore pathfinderStore, SavedStateHandle savedStateHandle) {
        super(new SurveyMultipleChoiceQuestionViewState(((LegacyFragmentKey.SurveyMultipleChoiceQuestion) INSTANCE.getArgs(savedStateHandle)).getUserViewState(), null, false, null, 14, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void updateSelection(final String id, final boolean isSelected) {
        Intrinsics.checkNotNullParameter(id, "id");
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyMultipleChoiceQuestionDuxo.updateSelection$lambda$0(id, isSelected, (SurveyMultipleChoiceQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyMultipleChoiceQuestionViewState updateSelection$lambda$0(String str, boolean z, SurveyMultipleChoiceQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copyWithUpdatedSelection(str, z);
    }

    /* compiled from: SurveyMultipleChoiceQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionDuxo$submitChoices$1", m3645f = "SurveyMultipleChoiceQuestionDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionDuxo$submitChoices$1 */
    static final class C289591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $selectedChoiceIds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C289591(List<String> list, Continuation<? super C289591> continuation) {
            super(2, continuation);
            this.$selectedChoiceIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SurveyMultipleChoiceQuestionDuxo.this.new C289591(this.$selectedChoiceIds, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SurveyMultipleChoiceQuestionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionDuxo$submitChoices$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SurveyMultipleChoiceQuestionDuxo.C289591.invokeSuspend$lambda$0((SurveyMultipleChoiceQuestionViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = SurveyMultipleChoiceQuestionDuxo.this.pathfinderStore;
                Companion companion = SurveyMultipleChoiceQuestionDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.SurveyMultipleChoiceQuestion) companion.getArgs((HasSavedState) SurveyMultipleChoiceQuestionDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.SurveyMultipleChoiceQuestion) companion.getArgs((HasSavedState) SurveyMultipleChoiceQuestionDuxo.this)).getUserViewState().getSequence();
                UserViewInput.SurveyMultipleChoiceQuestionPageInput surveyMultipleChoiceQuestionPageInput = new UserViewInput.SurveyMultipleChoiceQuestionPageInput(this.$selectedChoiceIds);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SurveyMultipleChoiceQuestionDuxo.this);
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, surveyMultipleChoiceQuestionPageInput, anonymousClass2, this) == coroutine_suspended) {
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
        public static final SurveyMultipleChoiceQuestionViewState invokeSuspend$lambda$0(SurveyMultipleChoiceQuestionViewState surveyMultipleChoiceQuestionViewState) {
            return SurveyMultipleChoiceQuestionViewState.copy$default(surveyMultipleChoiceQuestionViewState, null, null, true, null, 11, null);
        }

        /* compiled from: SurveyMultipleChoiceQuestionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionDuxo$submitChoices$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
            AnonymousClass2(Object obj) {
                super(1, obj, SurveyMultipleChoiceQuestionDuxo.class, "onError", "onError(Ljava/lang/Throwable;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(((SurveyMultipleChoiceQuestionDuxo) this.receiver).onError(p0));
            }
        }
    }

    public final void submitChoices(List<String> selectedChoiceIds) {
        Intrinsics.checkNotNullParameter(selectedChoiceIds, "selectedChoiceIds");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C289591(selectedChoiceIds, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onError(final Throwable error) {
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyMultipleChoiceQuestionDuxo.onError$lambda$1(error, (SurveyMultipleChoiceQuestionViewState) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyMultipleChoiceQuestionViewState onError$lambda$1(Throwable th, SurveyMultipleChoiceQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SurveyMultipleChoiceQuestionViewState.copy$default(applyMutation, null, null, false, new UiEvent(th), 3, null);
    }

    /* compiled from: SurveyMultipleChoiceQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyMultipleChoiceQuestionDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyMultipleChoiceQuestion;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SurveyMultipleChoiceQuestionDuxo, LegacyFragmentKey.SurveyMultipleChoiceQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SurveyMultipleChoiceQuestion getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.SurveyMultipleChoiceQuestion) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SurveyMultipleChoiceQuestion getArgs(SurveyMultipleChoiceQuestionDuxo surveyMultipleChoiceQuestionDuxo) {
            return (LegacyFragmentKey.SurveyMultipleChoiceQuestion) DuxoCompanion.DefaultImpls.getArgs(this, surveyMultipleChoiceQuestionDuxo);
        }
    }
}
