package com.robinhood.android.investorprofile.question;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireProfileResponse;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.store.questionnaire.QuestionnaireStore;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConfirmMultipleChoiceQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0016\u0017B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDataState;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo$InitArgs;", "questionnaireStore", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/questionnaire/QuestionnaireStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getQuestionnaireStore", "()Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "InitArgs", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ConfirmMultipleChoiceQuestionDuxo extends BaseDuxo<ConfirmMultipleChoiceQuestionDataState, ConfirmMultipleChoiceQuestionViewState> implements HasArgs<InitArgs> {
    private final QuestionnaireStore questionnaireStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    public final QuestionnaireStore getQuestionnaireStore() {
        return this.questionnaireStore;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConfirmMultipleChoiceQuestionDuxo(QuestionnaireStore questionnaireStore, SavedStateHandle savedStateHandle, ConfirmMultipleChoiceQuestionStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(questionnaireStore, "questionnaireStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new ConfirmMultipleChoiceQuestionDataState(((InitArgs) companion.getArgs(savedStateHandle)).getAccountNumber(), null, ((InitArgs) companion.getArgs(savedStateHandle)).getQuestion(), 2, null), stateProvider, duxoBundle);
        this.questionnaireStore = questionnaireStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C196441(null));
    }

    /* compiled from: ConfirmMultipleChoiceQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionDuxo$onCreate$1", m3645f = "ConfirmMultipleChoiceQuestionDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionDuxo$onCreate$1 */
    static final class C196441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C196441(Continuation<? super C196441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfirmMultipleChoiceQuestionDuxo.this.new C196441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C196441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                QuestionnaireStore questionnaireStore = ConfirmMultipleChoiceQuestionDuxo.this.getQuestionnaireStore();
                ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo = ConfirmMultipleChoiceQuestionDuxo.this;
                String context = ((InitArgs) confirmMultipleChoiceQuestionDuxo.getArgs(confirmMultipleChoiceQuestionDuxo.getSavedStateHandle())).getContext();
                ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo2 = ConfirmMultipleChoiceQuestionDuxo.this;
                String accountNumber = ((InitArgs) confirmMultipleChoiceQuestionDuxo2.getArgs(confirmMultipleChoiceQuestionDuxo2.getSavedStateHandle())).getAccountNumber();
                this.label = 1;
                obj = questionnaireStore.getProfile(context, true, accountNumber, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ConfirmMultipleChoiceQuestionDuxo.this.applyMutation(new AnonymousClass1((ApiQuestionnaireProfileResponse) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: ConfirmMultipleChoiceQuestionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionDuxo$onCreate$1$1", m3645f = "ConfirmMultipleChoiceQuestionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ConfirmMultipleChoiceQuestionDataState, Continuation<? super ConfirmMultipleChoiceQuestionDataState>, Object> {
            final /* synthetic */ ApiQuestionnaireProfileResponse $profile;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiQuestionnaireProfileResponse apiQuestionnaireProfileResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$profile = apiQuestionnaireProfileResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$profile, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmMultipleChoiceQuestionDataState confirmMultipleChoiceQuestionDataState, Continuation<? super ConfirmMultipleChoiceQuestionDataState> continuation) {
                return ((AnonymousClass1) create(confirmMultipleChoiceQuestionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ConfirmMultipleChoiceQuestionDataState.copy$default((ConfirmMultipleChoiceQuestionDataState) this.L$0, null, this.$profile, null, 5, null);
            }
        }
    }

    /* compiled from: ConfirmMultipleChoiceQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo$InitArgs;", "Landroid/os/Parcelable;", "context", "", "accountNumber", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;)V", "getContext", "()Ljava/lang/String;", "getAccountNumber", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String accountNumber;
        private final String context;
        private final UiQuestionnaireQuestion.MultipleChoiceQuestion question;

        /* compiled from: ConfirmMultipleChoiceQuestionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readString(), parcel.readString(), (UiQuestionnaireQuestion.MultipleChoiceQuestion) parcel.readParcelable(InitArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, String str, String str2, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initArgs.context;
            }
            if ((i & 2) != 0) {
                str2 = initArgs.accountNumber;
            }
            if ((i & 4) != 0) {
                multipleChoiceQuestion = initArgs.question;
            }
            return initArgs.copy(str, str2, multipleChoiceQuestion);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
            return this.question;
        }

        public final InitArgs copy(String context, String accountNumber, UiQuestionnaireQuestion.MultipleChoiceQuestion question) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(question, "question");
            return new InitArgs(context, accountNumber, question);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.context, initArgs.context) && Intrinsics.areEqual(this.accountNumber, initArgs.accountNumber) && Intrinsics.areEqual(this.question, initArgs.question);
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            String str = this.accountNumber;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.question.hashCode();
        }

        public String toString() {
            return "InitArgs(context=" + this.context + ", accountNumber=" + this.accountNumber + ", question=" + this.question + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.context);
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.question, flags);
        }

        public InitArgs(String context, String str, UiQuestionnaireQuestion.MultipleChoiceQuestion question) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(question, "question");
            this.context = context;
            this.accountNumber = str;
            this.question = question;
        }

        public final String getContext() {
            return this.context;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
            return this.question;
        }
    }

    /* compiled from: ConfirmMultipleChoiceQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo;", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo$InitArgs;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<ConfirmMultipleChoiceQuestionDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, confirmMultipleChoiceQuestionDuxo);
        }
    }
}
