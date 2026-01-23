package com.robinhood.android.investorprofile.p162ui.questionnaire.load;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.investorprofile.p162ui.questionnaire.load.LoadQuestionnaireEvent;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.store.questionnaire.QuestionnaireQuestionsResult;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoadQuestionnaireDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "questionnaireStore", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/questionnaire/QuestionnaireStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LoadQuestionnaireDuxo extends BaseDuxo5<Unit, LoadQuestionnaireEvent> implements HasSavedState {
    private final QuestionnaireStore questionnaireStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadQuestionnaireDuxo(QuestionnaireStore questionnaireStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(questionnaireStore, "questionnaireStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.questionnaireStore = questionnaireStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C197701(null), 3, null);
    }

    /* compiled from: LoadQuestionnaireDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.load.LoadQuestionnaireDuxo$onStart$1", m3645f = "LoadQuestionnaireDuxo.kt", m3646l = {34, 47, 55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.load.LoadQuestionnaireDuxo$onStart$1 */
    static final class C197701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C197701(Continuation<? super C197701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoadQuestionnaireDuxo.this.new C197701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C197701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        
            if (r12 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
        
            if (r12 == r0) goto L38;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            C197701 c197701;
            QuestionnaireQuestionsResult questionGraph;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Companion companion = LoadQuestionnaireDuxo.INSTANCE;
                    String questionKey = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getQuestionKey();
                    String questionId = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getQuestionId();
                    Map<String, UiQuestionnaireQuestion.Supported> questionGraph2 = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getQuestionGraph();
                    if (questionKey != null && questionGraph2 == null) {
                        QuestionnaireStore questionnaireStore = LoadQuestionnaireDuxo.this.questionnaireStore;
                        String context = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getContext();
                        String accountNumber = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getAccountNumber();
                        this.label = 1;
                        obj = questionnaireStore.getQuestion(context, questionKey, accountNumber, this);
                    } else {
                        try {
                            if (!QuestionnaireContexts.INSTANCE.getGRAPH_SUPPORTED_CONTEXTS().contains(((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getContext())) {
                                QuestionnaireStore questionnaireStore2 = LoadQuestionnaireDuxo.this.questionnaireStore;
                                String context2 = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getContext();
                                String accountNumber2 = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getAccountNumber();
                                boolean includeQuestionsAlreadyAnswered = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getIncludeQuestionsAlreadyAnswered();
                                this.label = 3;
                                c197701 = this;
                                try {
                                    obj = QuestionnaireStore.getQuestions$default(questionnaireStore2, context2, accountNumber2, null, includeQuestionsAlreadyAnswered, c197701, 4, null);
                                } catch (Exception e) {
                                    e = e;
                                    exc = e;
                                    LoadQuestionnaireDuxo.this.submit(new LoadQuestionnaireEvent.Failure(exc));
                                    return Unit.INSTANCE;
                                }
                            } else if (questionGraph2 == null || questionId == null) {
                                QuestionnaireStore questionnaireStore3 = LoadQuestionnaireDuxo.this.questionnaireStore;
                                String context3 = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getContext();
                                String accountNumber3 = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getAccountNumber();
                                boolean includeQuestionsAlreadyAnswered2 = ((LoadQuestionnaireArgs) companion.getArgs((HasSavedState) LoadQuestionnaireDuxo.this)).getIncludeQuestionsAlreadyAnswered();
                                this.label = 2;
                                obj = questionnaireStore3.streamQuestionGraph(context3, accountNumber3, includeQuestionsAlreadyAnswered2, this);
                                if (obj == coroutine_suspended) {
                                }
                                questionGraph = (QuestionnaireQuestionsResult) obj;
                                c197701 = this;
                                LoadQuestionnaireDuxo.this.submit(new LoadQuestionnaireEvent.Success(questionGraph));
                            } else {
                                questionGraph = new QuestionnaireQuestionsResult.QuestionGraph(questionGraph2, questionId);
                                c197701 = this;
                                LoadQuestionnaireDuxo.this.submit(new LoadQuestionnaireEvent.Success(questionGraph));
                            }
                        } catch (Exception e2) {
                            e = e2;
                            c197701 = this;
                            exc = e;
                            LoadQuestionnaireDuxo.this.submit(new LoadQuestionnaireEvent.Failure(exc));
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    questionGraph = (QuestionnaireQuestionsResult) obj;
                    c197701 = this;
                    LoadQuestionnaireDuxo.this.submit(new LoadQuestionnaireEvent.Success(questionGraph));
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    questionGraph = (QuestionnaireQuestionsResult) obj;
                    c197701 = this;
                    LoadQuestionnaireDuxo.this.submit(new LoadQuestionnaireEvent.Success(questionGraph));
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c197701 = this;
                    questionGraph = (QuestionnaireQuestionsResult) obj;
                    LoadQuestionnaireDuxo.this.submit(new LoadQuestionnaireEvent.Success(questionGraph));
                }
            } catch (Exception e3) {
                exc = e3;
                c197701 = this;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: LoadQuestionnaireDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireDuxo;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireArgs;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LoadQuestionnaireDuxo, LoadQuestionnaireArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoadQuestionnaireArgs getArgs(SavedStateHandle savedStateHandle) {
            return (LoadQuestionnaireArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoadQuestionnaireArgs getArgs(LoadQuestionnaireDuxo loadQuestionnaireDuxo) {
            return (LoadQuestionnaireArgs) DuxoCompanion.DefaultImpls.getArgs(this, loadQuestionnaireDuxo);
        }
    }
}
