package com.robinhood.android.investorprofile.p162ui.questionnaire.load;

import com.robinhood.store.questionnaire.QuestionnaireQuestionsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadQuestionnaireEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent;", "", "Success", "Failure", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent$Failure;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent$Success;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface LoadQuestionnaireEvent {

    /* compiled from: LoadQuestionnaireEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent$Success;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent;", "result", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "<init>", "(Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;)V", "getResult", "()Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements LoadQuestionnaireEvent {
        public static final int $stable = 8;
        private final QuestionnaireQuestionsResult result;

        public static /* synthetic */ Success copy$default(Success success, QuestionnaireQuestionsResult questionnaireQuestionsResult, int i, Object obj) {
            if ((i & 1) != 0) {
                questionnaireQuestionsResult = success.result;
            }
            return success.copy(questionnaireQuestionsResult);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionnaireQuestionsResult getResult() {
            return this.result;
        }

        public final Success copy(QuestionnaireQuestionsResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Success(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.result, ((Success) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Success(result=" + this.result + ")";
        }

        public Success(QuestionnaireQuestionsResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final QuestionnaireQuestionsResult getResult() {
            return this.result;
        }
    }

    /* compiled from: LoadQuestionnaireEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent$Failure;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements LoadQuestionnaireEvent {
        public static final int $stable = 8;
        private final Throwable exception;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.exception;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        public final Failure copy(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Failure(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(exception=" + this.exception + ")";
        }

        public Failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final Throwable getException() {
            return this.exception;
        }
    }
}
