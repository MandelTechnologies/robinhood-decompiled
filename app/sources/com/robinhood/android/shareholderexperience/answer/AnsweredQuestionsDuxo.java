package com.robinhood.android.shareholderexperience.answer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsBottomSheetFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.shareholderx.models.p401db.ShareholderQuestion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnsweredQuestionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "activateNextQuestion", "", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AnsweredQuestionsDuxo extends OldBaseDuxo<AnsweredQuestionsViewState> implements HasSavedState {
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
    public AnsweredQuestionsDuxo(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new AnsweredQuestionsViewState(((AnsweredQuestionsBottomSheetFragment.Args) companion.getArgs(savedStateHandle)).getMetadata(), ((AnsweredQuestionsBottomSheetFragment.Args) companion.getArgs(savedStateHandle)).getQuestions(), ((AnsweredQuestionsBottomSheetFragment.Args) companion.getArgs(savedStateHandle)).getActiveQuestion()), null, 2, 0 == true ? 1 : 0);
        this.savedStateHandle = savedStateHandle;
    }

    public final void activateNextQuestion() {
        applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.answer.AnsweredQuestionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnsweredQuestionsDuxo.activateNextQuestion$lambda$0((AnsweredQuestionsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnsweredQuestionsViewState activateNextQuestion$lambda$0(AnsweredQuestionsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        ShareholderQuestion activeQuestion = (ShareholderQuestion) CollectionsKt.getOrNull(applyMutation.getQuestions(), applyMutation.getQuestions().indexOf(applyMutation.getActiveQuestion()) + 1);
        if (activeQuestion == null) {
            activeQuestion = applyMutation.getActiveQuestion();
        }
        return AnsweredQuestionsViewState.copy$default(applyMutation, null, null, activeQuestion, 3, null);
    }

    /* compiled from: AnsweredQuestionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsDuxo;", "Lcom/robinhood/android/shareholderexperience/answer/AnsweredQuestionsBottomSheetFragment$Args;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AnsweredQuestionsDuxo, AnsweredQuestionsBottomSheetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AnsweredQuestionsBottomSheetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AnsweredQuestionsBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AnsweredQuestionsBottomSheetFragment.Args getArgs(AnsweredQuestionsDuxo answeredQuestionsDuxo) {
            return (AnsweredQuestionsBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, answeredQuestionsDuxo);
        }
    }
}
