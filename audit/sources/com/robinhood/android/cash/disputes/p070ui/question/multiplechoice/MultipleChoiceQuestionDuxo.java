package com.robinhood.android.cash.disputes.p070ui.question.multiplechoice;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.multiplechoice.MultipleChoiceQuestionFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleChoiceQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/multiplechoice/MultipleChoiceQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/multiplechoice/MultipleChoiceQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "updatePreFillChoiceIndex", "", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$MultipleChoice;", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MultipleChoiceQuestionDuxo extends OldBaseDuxo<MultipleChoiceQuestionViewState> implements HasSavedState {
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
    public MultipleChoiceQuestionDuxo(SavedStateHandle savedStateHandle) {
        super(new MultipleChoiceQuestionViewState(((MultipleChoiceQuestionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getQuestion(), null, 2, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    public final void updatePreFillChoiceIndex(final DisputeQuestionResponse.MultipleChoice response) {
        Intrinsics.checkNotNullParameter(response, "response");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.multiplechoice.MultipleChoiceQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultipleChoiceQuestionDuxo.updatePreFillChoiceIndex$lambda$0(response, (MultipleChoiceQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultipleChoiceQuestionViewState updatePreFillChoiceIndex$lambda$0(DisputeQuestionResponse.MultipleChoice multipleChoice, MultipleChoiceQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MultipleChoiceQuestionViewState.copy$default(applyMutation, null, new UiEvent(Integer.valueOf(multipleChoice.getChoiceIndex())), 1, null);
    }

    /* compiled from: MultipleChoiceQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/multiplechoice/MultipleChoiceQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/multiplechoice/MultipleChoiceQuestionDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/multiplechoice/MultipleChoiceQuestionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MultipleChoiceQuestionDuxo, MultipleChoiceQuestionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MultipleChoiceQuestionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MultipleChoiceQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MultipleChoiceQuestionFragment.Args getArgs(MultipleChoiceQuestionDuxo multipleChoiceQuestionDuxo) {
            return (MultipleChoiceQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, multipleChoiceQuestionDuxo);
        }
    }
}
