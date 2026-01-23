package com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionEvent;
import com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.extensions.KeyEvents2;
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
import kotlin.text.StringsKt;

/* compiled from: QuestionnaireIntegerQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u0019\u001a\u00020\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionViewState;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onKeyPress", "", "event", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onResetToDefault", "onContinue", "showAlert", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onDismissAlert", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class QuestionnaireIntegerQuestionDuxo extends BaseDuxo3<QuestionnaireIntegerQuestionDataState, QuestionnaireIntegerQuestionViewState, QuestionnaireIntegerQuestionEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuestionnaireIntegerQuestionDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        String string2;
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        Integer defaultValue = ((QuestionnaireIntegerQuestionFragment.Args) companion.getArgs(savedStateHandle)).getIntegerQuestion().getContent().getDefaultValue();
        String string3 = defaultValue != null ? defaultValue.toString() : null;
        String existingAnswer = ((QuestionnaireIntegerQuestionFragment.Args) companion.getArgs(savedStateHandle)).getExistingAnswer();
        if (existingAnswer != null) {
            string2 = existingAnswer;
        } else {
            Integer defaultValue2 = ((QuestionnaireIntegerQuestionFragment.Args) companion.getArgs(savedStateHandle)).getIntegerQuestion().getContent().getDefaultValue();
            string2 = defaultValue2 != null ? defaultValue2.toString() : null;
            if (string2 == null) {
                existingAnswer = "";
                string2 = existingAnswer;
            }
        }
        super(new QuestionnaireIntegerQuestionDataState(string3, string2, ((QuestionnaireIntegerQuestionFragment.Args) companion.getArgs(savedStateHandle)).getIntegerQuestion(), null, 8, null), QuestionnaireIntegerQuestionDataState.INSTANCE, duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: QuestionnaireIntegerQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onKeyPress$1", m3645f = "QuestionnaireIntegerQuestionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onKeyPress$1 */
    static final class C197611 extends ContinuationImpl7 implements Function2<QuestionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState>, Object> {
        final /* synthetic */ KeyEvent $event;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C197611(KeyEvent keyEvent, Continuation<? super C197611> continuation) {
            super(2, continuation);
            this.$event = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C197611 c197611 = new C197611(this.$event, continuation);
            c197611.L$0 = obj;
            return c197611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState> continuation) {
            return ((C197611) create(questionnaireIntegerQuestionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String inputString;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState = (QuestionnaireIntegerQuestionDataState) this.L$0;
            boolean z = true;
            if (KeyEvents2.isDelete(this.$event) && questionnaireIntegerQuestionDataState.getInputString().length() <= 1) {
                inputString = "";
            } else if (KeyEvents2.isDelete(this.$event)) {
                inputString = StringsKt.dropLast(questionnaireIntegerQuestionDataState.getInputString(), 1);
            } else {
                if (KeyEvents2.isDigit(this.$event)) {
                    inputString = questionnaireIntegerQuestionDataState.getInputString() + this.$event.getNumber();
                    if (Integer.parseInt(inputString) > questionnaireIntegerQuestionDataState.getIntegerQuestion().getContent().getMaxValue()) {
                        inputString = questionnaireIntegerQuestionDataState.getInputString();
                    }
                    return QuestionnaireIntegerQuestionDataState.copy$default(questionnaireIntegerQuestionDataState, null, inputString, null, !z ? questionnaireIntegerQuestionDataState.getIntegerQuestion().getContent().getAboveMaxValueAlert() : null, 5, null);
                }
                inputString = questionnaireIntegerQuestionDataState.getInputString();
            }
            z = false;
            return QuestionnaireIntegerQuestionDataState.copy$default(questionnaireIntegerQuestionDataState, null, inputString, null, !z ? questionnaireIntegerQuestionDataState.getIntegerQuestion().getContent().getAboveMaxValueAlert() : null, 5, null);
        }
    }

    public final void onKeyPress(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        applyMutation(new C197611(event, null));
    }

    /* compiled from: QuestionnaireIntegerQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onResetToDefault$1", m3645f = "QuestionnaireIntegerQuestionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onResetToDefault$1 */
    static final class C197621 extends ContinuationImpl7 implements Function2<QuestionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C197621(Continuation<? super C197621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C197621 c197621 = new C197621(continuation);
            c197621.L$0 = obj;
            return c197621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState> continuation) {
            return ((C197621) create(questionnaireIntegerQuestionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState = (QuestionnaireIntegerQuestionDataState) this.L$0;
            return questionnaireIntegerQuestionDataState.getDefaultValue() != null ? QuestionnaireIntegerQuestionDataState.copy$default(questionnaireIntegerQuestionDataState, null, questionnaireIntegerQuestionDataState.getDefaultValue(), null, null, 13, null) : questionnaireIntegerQuestionDataState;
        }
    }

    public final void onResetToDefault() {
        applyMutation(new C197621(null));
    }

    public final void onContinue() {
        withDataState(new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QuestionnaireIntegerQuestionDuxo.onContinue$lambda$0(this.f$0, (QuestionnaireIntegerQuestionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinue$lambda$0(QuestionnaireIntegerQuestionDuxo questionnaireIntegerQuestionDuxo, QuestionnaireIntegerQuestionDataState ds) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(ds, "ds");
        int i = Integer.parseInt(ds.getInputString());
        if (i < ds.getIntegerQuestion().getContent().getMinValue()) {
            questionnaireIntegerQuestionDuxo.applyMutation(new QuestionnaireIntegerQuestionDuxo2(null));
        } else if (i > ds.getIntegerQuestion().getContent().getMaxValue()) {
            questionnaireIntegerQuestionDuxo.applyMutation(new QuestionnaireIntegerQuestionDuxo3(null));
        } else {
            questionnaireIntegerQuestionDuxo.submit(new QuestionnaireIntegerQuestionEvent.Answered(Integer.parseInt(ds.getInputString())));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: QuestionnaireIntegerQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$showAlert$1", m3645f = "QuestionnaireIntegerQuestionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$showAlert$1 */
    static final class C197631 extends ContinuationImpl7 implements Function2<QuestionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState>, Object> {
        final /* synthetic */ GenericAlertContent<GenericAction> $alert;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C197631(GenericAlertContent<? extends GenericAction> genericAlertContent, Continuation<? super C197631> continuation) {
            super(2, continuation);
            this.$alert = genericAlertContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C197631 c197631 = new C197631(this.$alert, continuation);
            c197631.L$0 = obj;
            return c197631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState> continuation) {
            return ((C197631) create(questionnaireIntegerQuestionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return QuestionnaireIntegerQuestionDataState.copy$default((QuestionnaireIntegerQuestionDataState) this.L$0, null, null, null, this.$alert, 7, null);
        }
    }

    public final void showAlert(GenericAlertContent<? extends GenericAction> alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        applyMutation(new C197631(alert, null));
    }

    /* compiled from: QuestionnaireIntegerQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onDismissAlert$1", m3645f = "QuestionnaireIntegerQuestionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo$onDismissAlert$1 */
    static final class C197601 extends ContinuationImpl7 implements Function2<QuestionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C197601(Continuation<? super C197601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C197601 c197601 = new C197601(continuation);
            c197601.L$0 = obj;
            return c197601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState, Continuation<? super QuestionnaireIntegerQuestionDataState> continuation) {
            return ((C197601) create(questionnaireIntegerQuestionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return QuestionnaireIntegerQuestionDataState.copy$default((QuestionnaireIntegerQuestionDataState) this.L$0, null, null, null, null, 7, null);
        }
    }

    public final void onDismissAlert() {
        applyMutation(new C197601(null));
    }

    /* compiled from: QuestionnaireIntegerQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDuxo;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<QuestionnaireIntegerQuestionDuxo, QuestionnaireIntegerQuestionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public QuestionnaireIntegerQuestionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (QuestionnaireIntegerQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public QuestionnaireIntegerQuestionFragment.Args getArgs(QuestionnaireIntegerQuestionDuxo questionnaireIntegerQuestionDuxo) {
            return (QuestionnaireIntegerQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, questionnaireIntegerQuestionDuxo);
        }
    }
}
