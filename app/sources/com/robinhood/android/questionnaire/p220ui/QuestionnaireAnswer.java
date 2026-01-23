package com.robinhood.android.questionnaire.p220ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitRequest3;
import com.robinhood.android.questionnaire.p220ui.OptionalIntegerQuestionAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireAnswer.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0013\u0014\u0015\u0016\u0017\u0018J\b\u0010\u0011\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\t\u0082\u0001\u0006\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "Landroid/os/Parcelable;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "redirectRequired", "", "getRedirectRequired", "()Z", "redirectDestinations", "", "", "getRedirectDestinations", "()Ljava/util/List;", "shouldSubmitEarly", "getShouldSubmitEarly", "toApiContent", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "StringAnswer", "IntegerAnswer", "MultipleChoiceAnswer", "MultipleResponseAnswer", "HybridAnswer", "OptionalIntegerAnswer", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$HybridAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$IntegerAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$MultipleChoiceAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$MultipleResponseAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$OptionalIntegerAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$StringAnswer;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface QuestionnaireAnswer extends Parcelable {
    UiQuestionnaireQuestion.Supported getQuestion();

    List<String> getRedirectDestinations();

    boolean getRedirectRequired();

    boolean getShouldSubmitEarly();

    ApiQuestionnaireSubmitRequest3 toApiContent();

    /* compiled from: QuestionnaireAnswer.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$StringAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;", "shouldSubmitEarly", "", "answer", "", "<init>", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;ZLjava/lang/String;)V", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;", "getShouldSubmitEarly", "()Z", "getAnswer", "()Ljava/lang/String;", "redirectRequired", "getRedirectRequired", "redirectDestinations", "", "getRedirectDestinations", "()Ljava/util/List;", "toApiContent", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StringAnswer implements QuestionnaireAnswer {
        public static final Parcelable.Creator<StringAnswer> CREATOR = new Creator();
        private final String answer;
        private final UiQuestionnaireQuestion.StringQuestion question;
        private final boolean shouldSubmitEarly;

        /* compiled from: QuestionnaireAnswer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StringAnswer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringAnswer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringAnswer(UiQuestionnaireQuestion.StringQuestion.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringAnswer[] newArray(int i) {
                return new StringAnswer[i];
            }
        }

        public static /* synthetic */ StringAnswer copy$default(StringAnswer stringAnswer, UiQuestionnaireQuestion.StringQuestion stringQuestion, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                stringQuestion = stringAnswer.question;
            }
            if ((i & 2) != 0) {
                z = stringAnswer.shouldSubmitEarly;
            }
            if ((i & 4) != 0) {
                str = stringAnswer.answer;
            }
            return stringAnswer.copy(stringQuestion, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UiQuestionnaireQuestion.StringQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        public final StringAnswer copy(UiQuestionnaireQuestion.StringQuestion question, boolean shouldSubmitEarly, String answer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            return new StringAnswer(question, shouldSubmitEarly, answer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringAnswer)) {
                return false;
            }
            StringAnswer stringAnswer = (StringAnswer) other;
            return Intrinsics.areEqual(this.question, stringAnswer.question) && this.shouldSubmitEarly == stringAnswer.shouldSubmitEarly && Intrinsics.areEqual(this.answer, stringAnswer.answer);
        }

        public int hashCode() {
            return (((this.question.hashCode() * 31) + Boolean.hashCode(this.shouldSubmitEarly)) * 31) + this.answer.hashCode();
        }

        public String toString() {
            return "StringAnswer(question=" + this.question + ", shouldSubmitEarly=" + this.shouldSubmitEarly + ", answer=" + this.answer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.question.writeToParcel(dest, flags);
            dest.writeInt(this.shouldSubmitEarly ? 1 : 0);
            dest.writeString(this.answer);
        }

        public StringAnswer(UiQuestionnaireQuestion.StringQuestion question, boolean z, String answer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.question = question;
            this.shouldSubmitEarly = z;
            this.answer = answer;
        }

        public /* synthetic */ StringAnswer(UiQuestionnaireQuestion.StringQuestion stringQuestion, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringQuestion, (i & 2) != 0 ? false : z, str);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public UiQuestionnaireQuestion.StringQuestion getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        public final String getAnswer() {
            return this.answer;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getRedirectRequired() {
            UiGraphRedirect graphDefaultRedirect = getQuestion().getContent().getGraphDefaultRedirect();
            return graphDefaultRedirect != null && graphDefaultRedirect.getRedirectRequired();
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public List<String> getRedirectDestinations() {
            UiGraphRedirect graphDefaultRedirect = getQuestion().getContent().getGraphDefaultRedirect();
            return CollectionsKt.listOfNotNull(graphDefaultRedirect != null ? graphDefaultRedirect.getRedirect() : null);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public ApiQuestionnaireSubmitRequest3 toApiContent() {
            return new ApiQuestionnaireSubmitRequest3.StringContent(this.answer);
        }
    }

    /* compiled from: QuestionnaireAnswer.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0007J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0014HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$IntegerAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;", "shouldSubmitEarly", "", "answer", "", "<init>", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;ZI)V", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;", "getShouldSubmitEarly", "()Z", "getAnswer", "()I", "redirectRequired", "getRedirectRequired", "redirectDestinations", "", "", "getRedirectDestinations", "()Ljava/util/List;", "toApiContent", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IntegerAnswer implements QuestionnaireAnswer {
        public static final Parcelable.Creator<IntegerAnswer> CREATOR = new Creator();
        private final int answer;
        private final UiQuestionnaireQuestion.IntegerQuestion question;
        private final boolean shouldSubmitEarly;

        /* compiled from: QuestionnaireAnswer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegerAnswer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerAnswer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegerAnswer(UiQuestionnaireQuestion.IntegerQuestion.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerAnswer[] newArray(int i) {
                return new IntegerAnswer[i];
            }
        }

        public static /* synthetic */ IntegerAnswer copy$default(IntegerAnswer integerAnswer, UiQuestionnaireQuestion.IntegerQuestion integerQuestion, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                integerQuestion = integerAnswer.question;
            }
            if ((i2 & 2) != 0) {
                z = integerAnswer.shouldSubmitEarly;
            }
            if ((i2 & 4) != 0) {
                i = integerAnswer.answer;
            }
            return integerAnswer.copy(integerQuestion, z, i);
        }

        /* renamed from: component1, reason: from getter */
        public final UiQuestionnaireQuestion.IntegerQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        /* renamed from: component3, reason: from getter */
        public final int getAnswer() {
            return this.answer;
        }

        public final IntegerAnswer copy(UiQuestionnaireQuestion.IntegerQuestion question, boolean shouldSubmitEarly, int answer) {
            Intrinsics.checkNotNullParameter(question, "question");
            return new IntegerAnswer(question, shouldSubmitEarly, answer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegerAnswer)) {
                return false;
            }
            IntegerAnswer integerAnswer = (IntegerAnswer) other;
            return Intrinsics.areEqual(this.question, integerAnswer.question) && this.shouldSubmitEarly == integerAnswer.shouldSubmitEarly && this.answer == integerAnswer.answer;
        }

        public int hashCode() {
            return (((this.question.hashCode() * 31) + Boolean.hashCode(this.shouldSubmitEarly)) * 31) + Integer.hashCode(this.answer);
        }

        public String toString() {
            return "IntegerAnswer(question=" + this.question + ", shouldSubmitEarly=" + this.shouldSubmitEarly + ", answer=" + this.answer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.question.writeToParcel(dest, flags);
            dest.writeInt(this.shouldSubmitEarly ? 1 : 0);
            dest.writeInt(this.answer);
        }

        public IntegerAnswer(UiQuestionnaireQuestion.IntegerQuestion question, boolean z, int i) {
            Intrinsics.checkNotNullParameter(question, "question");
            this.question = question;
            this.shouldSubmitEarly = z;
            this.answer = i;
        }

        public /* synthetic */ IntegerAnswer(UiQuestionnaireQuestion.IntegerQuestion integerQuestion, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(integerQuestion, (i2 & 2) != 0 ? false : z, i);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public UiQuestionnaireQuestion.IntegerQuestion getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        public final int getAnswer() {
            return this.answer;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getRedirectRequired() {
            UiGraphRedirect graphDefaultRedirect = getQuestion().getContent().getGraphDefaultRedirect();
            return graphDefaultRedirect != null && graphDefaultRedirect.getRedirectRequired();
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public List<String> getRedirectDestinations() {
            UiGraphRedirect graphDefaultRedirect = getQuestion().getContent().getGraphDefaultRedirect();
            return CollectionsKt.listOfNotNull(graphDefaultRedirect != null ? graphDefaultRedirect.getRedirect() : null);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public ApiQuestionnaireSubmitRequest3 toApiContent() {
            return new ApiQuestionnaireSubmitRequest3.IntegerContent(this.answer);
        }
    }

    /* compiled from: QuestionnaireAnswer.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0014HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$MultipleChoiceAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "shouldSubmitEarly", "", "answer", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;ZLjava/util/UUID;)V", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "getShouldSubmitEarly", "()Z", "getAnswer", "()Ljava/util/UUID;", "redirectRequired", "getRedirectRequired", "redirectDestinations", "", "", "getRedirectDestinations", "()Ljava/util/List;", "toApiContent", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MultipleChoiceAnswer implements QuestionnaireAnswer {
        public static final Parcelable.Creator<MultipleChoiceAnswer> CREATOR = new Creator();
        private final UUID answer;
        private final UiQuestionnaireQuestion.MultipleChoiceQuestion question;
        private final boolean shouldSubmitEarly;

        /* compiled from: QuestionnaireAnswer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleChoiceAnswer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceAnswer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultipleChoiceAnswer(UiQuestionnaireQuestion.MultipleChoiceQuestion.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceAnswer[] newArray(int i) {
                return new MultipleChoiceAnswer[i];
            }
        }

        public static /* synthetic */ MultipleChoiceAnswer copy$default(MultipleChoiceAnswer multipleChoiceAnswer, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                multipleChoiceQuestion = multipleChoiceAnswer.question;
            }
            if ((i & 2) != 0) {
                z = multipleChoiceAnswer.shouldSubmitEarly;
            }
            if ((i & 4) != 0) {
                uuid = multipleChoiceAnswer.answer;
            }
            return multipleChoiceAnswer.copy(multipleChoiceQuestion, z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getAnswer() {
            return this.answer;
        }

        public final MultipleChoiceAnswer copy(UiQuestionnaireQuestion.MultipleChoiceQuestion question, boolean shouldSubmitEarly, UUID answer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            return new MultipleChoiceAnswer(question, shouldSubmitEarly, answer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleChoiceAnswer)) {
                return false;
            }
            MultipleChoiceAnswer multipleChoiceAnswer = (MultipleChoiceAnswer) other;
            return Intrinsics.areEqual(this.question, multipleChoiceAnswer.question) && this.shouldSubmitEarly == multipleChoiceAnswer.shouldSubmitEarly && Intrinsics.areEqual(this.answer, multipleChoiceAnswer.answer);
        }

        public int hashCode() {
            return (((this.question.hashCode() * 31) + Boolean.hashCode(this.shouldSubmitEarly)) * 31) + this.answer.hashCode();
        }

        public String toString() {
            return "MultipleChoiceAnswer(question=" + this.question + ", shouldSubmitEarly=" + this.shouldSubmitEarly + ", answer=" + this.answer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.question.writeToParcel(dest, flags);
            dest.writeInt(this.shouldSubmitEarly ? 1 : 0);
            dest.writeSerializable(this.answer);
        }

        public MultipleChoiceAnswer(UiQuestionnaireQuestion.MultipleChoiceQuestion question, boolean z, UUID answer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.question = question;
            this.shouldSubmitEarly = z;
            this.answer = answer;
        }

        public /* synthetic */ MultipleChoiceAnswer(UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, boolean z, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(multipleChoiceQuestion, (i & 2) != 0 ? false : z, uuid);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        public final UUID getAnswer() {
            return this.answer;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getRedirectRequired() {
            Object next;
            UiGraphRedirect graphRedirect;
            Iterator<T> it = getQuestion().getContent().getAnswerChoices().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((UiQuestionContent.MultipleChoiceContent.Answer) next).getId(), this.answer)) {
                    break;
                }
            }
            UiQuestionContent.MultipleChoiceContent.Answer answer = (UiQuestionContent.MultipleChoiceContent.Answer) next;
            return (answer == null || (graphRedirect = answer.getGraphRedirect()) == null || !graphRedirect.getRedirectRequired()) ? false : true;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public List<String> getRedirectDestinations() {
            String redirect;
            Object next;
            UiGraphRedirect graphRedirect;
            Iterator<T> it = getQuestion().getContent().getAnswerChoices().iterator();
            while (true) {
                redirect = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((UiQuestionContent.MultipleChoiceContent.Answer) next).getId(), this.answer)) {
                    break;
                }
            }
            UiQuestionContent.MultipleChoiceContent.Answer answer = (UiQuestionContent.MultipleChoiceContent.Answer) next;
            if (answer != null && (graphRedirect = answer.getGraphRedirect()) != null) {
                redirect = graphRedirect.getRedirect();
            }
            return CollectionsKt.listOfNotNull(redirect);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public ApiQuestionnaireSubmitRequest3 toApiContent() {
            return new ApiQuestionnaireSubmitRequest3.MultipleChoiceContent(this.answer);
        }
    }

    /* compiled from: QuestionnaireAnswer.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0014HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$MultipleResponseAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleResponseQuestion;", "shouldSubmitEarly", "", "answers", "", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleResponseQuestion;ZLjava/util/List;)V", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleResponseQuestion;", "getShouldSubmitEarly", "()Z", "getAnswers", "()Ljava/util/List;", "redirectRequired", "getRedirectRequired", "redirectDestinations", "", "getRedirectDestinations", "toApiContent", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class MultipleResponseAnswer implements QuestionnaireAnswer {
        public static final Parcelable.Creator<MultipleResponseAnswer> CREATOR = new Creator();
        private final List<UUID> answers;
        private final UiQuestionnaireQuestion.MultipleResponseQuestion question;
        private final boolean shouldSubmitEarly;

        /* compiled from: QuestionnaireAnswer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleResponseAnswer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleResponseAnswer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestionCreateFromParcel = UiQuestionnaireQuestion.MultipleResponseQuestion.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new MultipleResponseAnswer(multipleResponseQuestionCreateFromParcel, z, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleResponseAnswer[] newArray(int i) {
                return new MultipleResponseAnswer[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleResponseAnswer copy$default(MultipleResponseAnswer multipleResponseAnswer, UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                multipleResponseQuestion = multipleResponseAnswer.question;
            }
            if ((i & 2) != 0) {
                z = multipleResponseAnswer.shouldSubmitEarly;
            }
            if ((i & 4) != 0) {
                list = multipleResponseAnswer.answers;
            }
            return multipleResponseAnswer.copy(multipleResponseQuestion, z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final UiQuestionnaireQuestion.MultipleResponseQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        public final List<UUID> component3() {
            return this.answers;
        }

        public final MultipleResponseAnswer copy(UiQuestionnaireQuestion.MultipleResponseQuestion question, boolean shouldSubmitEarly, List<UUID> answers) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answers, "answers");
            return new MultipleResponseAnswer(question, shouldSubmitEarly, answers);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleResponseAnswer)) {
                return false;
            }
            MultipleResponseAnswer multipleResponseAnswer = (MultipleResponseAnswer) other;
            return Intrinsics.areEqual(this.question, multipleResponseAnswer.question) && this.shouldSubmitEarly == multipleResponseAnswer.shouldSubmitEarly && Intrinsics.areEqual(this.answers, multipleResponseAnswer.answers);
        }

        public int hashCode() {
            return (((this.question.hashCode() * 31) + Boolean.hashCode(this.shouldSubmitEarly)) * 31) + this.answers.hashCode();
        }

        public String toString() {
            return "MultipleResponseAnswer(question=" + this.question + ", shouldSubmitEarly=" + this.shouldSubmitEarly + ", answers=" + this.answers + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.question.writeToParcel(dest, flags);
            dest.writeInt(this.shouldSubmitEarly ? 1 : 0);
            List<UUID> list = this.answers;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        public MultipleResponseAnswer(UiQuestionnaireQuestion.MultipleResponseQuestion question, boolean z, List<UUID> answers) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answers, "answers");
            this.question = question;
            this.shouldSubmitEarly = z;
            this.answers = answers;
        }

        public /* synthetic */ MultipleResponseAnswer(UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(multipleResponseQuestion, (i & 2) != 0 ? false : z, list);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public UiQuestionnaireQuestion.MultipleResponseQuestion getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        public final List<UUID> getAnswers() {
            return this.answers;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getRedirectRequired() {
            Object next;
            UiGraphRedirect graphRedirect;
            List<UUID> list = this.answers;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (UUID uuid : list) {
                Iterator<T> it = getQuestion().getContent().getAnswerChoices().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((UiQuestionContent.MultipleResponseContent.Answer) next).getId(), uuid)) {
                        break;
                    }
                }
                UiQuestionContent.MultipleResponseContent.Answer answer = (UiQuestionContent.MultipleResponseContent.Answer) next;
                if (answer != null && (graphRedirect = answer.getGraphRedirect()) != null && graphRedirect.getRedirectRequired()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public List<String> getRedirectDestinations() {
            String redirect;
            Object next;
            UiGraphRedirect graphRedirect;
            List<UUID> list = this.answers;
            ArrayList arrayList = new ArrayList();
            for (UUID uuid : list) {
                Iterator<T> it = getQuestion().getContent().getAnswerChoices().iterator();
                while (true) {
                    redirect = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((UiQuestionContent.MultipleResponseContent.Answer) next).getId(), uuid)) {
                        break;
                    }
                }
                UiQuestionContent.MultipleResponseContent.Answer answer = (UiQuestionContent.MultipleResponseContent.Answer) next;
                if (answer != null && (graphRedirect = answer.getGraphRedirect()) != null) {
                    redirect = graphRedirect.getRedirect();
                }
                if (redirect != null) {
                    arrayList.add(redirect);
                }
            }
            return CollectionsKt.distinct(arrayList);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public ApiQuestionnaireSubmitRequest3 toApiContent() {
            return new ApiQuestionnaireSubmitRequest3.MultipleResponseContent(this.answers);
        }
    }

    /* compiled from: QuestionnaireAnswer.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$HybridAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$HybridQuestion;", "shouldSubmitEarly", "", "answerId", "Ljava/util/UUID;", "answerText", "", "<init>", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$HybridQuestion;ZLjava/util/UUID;Ljava/lang/String;)V", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$HybridQuestion;", "getShouldSubmitEarly", "()Z", "getAnswerId", "()Ljava/util/UUID;", "getAnswerText", "()Ljava/lang/String;", "redirectRequired", "getRedirectRequired", "redirectDestinations", "", "getRedirectDestinations", "()Ljava/util/List;", "toApiContent", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class HybridAnswer implements QuestionnaireAnswer {
        public static final Parcelable.Creator<HybridAnswer> CREATOR = new Creator();
        private final UUID answerId;
        private final String answerText;
        private final UiQuestionnaireQuestion.HybridQuestion question;
        private final boolean shouldSubmitEarly;

        /* compiled from: QuestionnaireAnswer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<HybridAnswer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridAnswer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HybridAnswer(UiQuestionnaireQuestion.HybridQuestion.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridAnswer[] newArray(int i) {
                return new HybridAnswer[i];
            }
        }

        public static /* synthetic */ HybridAnswer copy$default(HybridAnswer hybridAnswer, UiQuestionnaireQuestion.HybridQuestion hybridQuestion, boolean z, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                hybridQuestion = hybridAnswer.question;
            }
            if ((i & 2) != 0) {
                z = hybridAnswer.shouldSubmitEarly;
            }
            if ((i & 4) != 0) {
                uuid = hybridAnswer.answerId;
            }
            if ((i & 8) != 0) {
                str = hybridAnswer.answerText;
            }
            return hybridAnswer.copy(hybridQuestion, z, uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UiQuestionnaireQuestion.HybridQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getAnswerId() {
            return this.answerId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnswerText() {
            return this.answerText;
        }

        public final HybridAnswer copy(UiQuestionnaireQuestion.HybridQuestion question, boolean shouldSubmitEarly, UUID answerId, String answerText) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerId, "answerId");
            return new HybridAnswer(question, shouldSubmitEarly, answerId, answerText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HybridAnswer)) {
                return false;
            }
            HybridAnswer hybridAnswer = (HybridAnswer) other;
            return Intrinsics.areEqual(this.question, hybridAnswer.question) && this.shouldSubmitEarly == hybridAnswer.shouldSubmitEarly && Intrinsics.areEqual(this.answerId, hybridAnswer.answerId) && Intrinsics.areEqual(this.answerText, hybridAnswer.answerText);
        }

        public int hashCode() {
            int iHashCode = ((((this.question.hashCode() * 31) + Boolean.hashCode(this.shouldSubmitEarly)) * 31) + this.answerId.hashCode()) * 31;
            String str = this.answerText;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "HybridAnswer(question=" + this.question + ", shouldSubmitEarly=" + this.shouldSubmitEarly + ", answerId=" + this.answerId + ", answerText=" + this.answerText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.question.writeToParcel(dest, flags);
            dest.writeInt(this.shouldSubmitEarly ? 1 : 0);
            dest.writeSerializable(this.answerId);
            dest.writeString(this.answerText);
        }

        public HybridAnswer(UiQuestionnaireQuestion.HybridQuestion question, boolean z, UUID answerId, String str) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answerId, "answerId");
            this.question = question;
            this.shouldSubmitEarly = z;
            this.answerId = answerId;
            this.answerText = str;
        }

        public /* synthetic */ HybridAnswer(UiQuestionnaireQuestion.HybridQuestion hybridQuestion, boolean z, UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(hybridQuestion, (i & 2) != 0 ? false : z, uuid, str);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public UiQuestionnaireQuestion.HybridQuestion getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        public final UUID getAnswerId() {
            return this.answerId;
        }

        public final String getAnswerText() {
            return this.answerText;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getRedirectRequired() {
            Object next;
            UiGraphRedirect graphRedirect;
            Iterator<T> it = getQuestion().getContent().getAnswerChoices().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((UiQuestionContent.HybridContent.Answer) next).getId(), this.answerId)) {
                    break;
                }
            }
            UiQuestionContent.HybridContent.Answer answer = (UiQuestionContent.HybridContent.Answer) next;
            return (answer == null || (graphRedirect = answer.getGraphRedirect()) == null || !graphRedirect.getRedirectRequired()) ? false : true;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public List<String> getRedirectDestinations() {
            String redirect;
            Object next;
            UiGraphRedirect graphRedirect;
            Iterator<T> it = getQuestion().getContent().getAnswerChoices().iterator();
            while (true) {
                redirect = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((UiQuestionContent.HybridContent.Answer) next).getId(), this.answerId)) {
                    break;
                }
            }
            UiQuestionContent.HybridContent.Answer answer = (UiQuestionContent.HybridContent.Answer) next;
            if (answer != null && (graphRedirect = answer.getGraphRedirect()) != null) {
                redirect = graphRedirect.getRedirect();
            }
            return CollectionsKt.listOfNotNull(redirect);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public ApiQuestionnaireSubmitRequest3 toApiContent() {
            return new ApiQuestionnaireSubmitRequest3.HybridContent(this.answerId, this.answerText);
        }
    }

    /* compiled from: QuestionnaireAnswer.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0014HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer$OptionalIntegerAnswer;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;", "shouldSubmitEarly", "", "answer", "Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;", "<init>", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;ZLcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;)V", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;", "getShouldSubmitEarly", "()Z", "getAnswer", "()Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;", "redirectRequired", "getRedirectRequired", "redirectDestinations", "", "", "getRedirectDestinations", "()Ljava/util/List;", "toApiContent", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionalIntegerAnswer implements QuestionnaireAnswer {
        public static final Parcelable.Creator<OptionalIntegerAnswer> CREATOR = new Creator();
        private final OptionalIntegerQuestionAnswer answer;
        private final UiQuestionnaireQuestion.OptionalIntegerQuestion question;
        private final boolean shouldSubmitEarly;

        /* compiled from: QuestionnaireAnswer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionalIntegerAnswer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalIntegerAnswer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionalIntegerAnswer(UiQuestionnaireQuestion.OptionalIntegerQuestion.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (OptionalIntegerQuestionAnswer) parcel.readParcelable(OptionalIntegerAnswer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalIntegerAnswer[] newArray(int i) {
                return new OptionalIntegerAnswer[i];
            }
        }

        public static /* synthetic */ OptionalIntegerAnswer copy$default(OptionalIntegerAnswer optionalIntegerAnswer, UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, boolean z, OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer, int i, Object obj) {
            if ((i & 1) != 0) {
                optionalIntegerQuestion = optionalIntegerAnswer.question;
            }
            if ((i & 2) != 0) {
                z = optionalIntegerAnswer.shouldSubmitEarly;
            }
            if ((i & 4) != 0) {
                optionalIntegerQuestionAnswer = optionalIntegerAnswer.answer;
            }
            return optionalIntegerAnswer.copy(optionalIntegerQuestion, z, optionalIntegerQuestionAnswer);
        }

        /* renamed from: component1, reason: from getter */
        public final UiQuestionnaireQuestion.OptionalIntegerQuestion getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionalIntegerQuestionAnswer getAnswer() {
            return this.answer;
        }

        public final OptionalIntegerAnswer copy(UiQuestionnaireQuestion.OptionalIntegerQuestion question, boolean shouldSubmitEarly, OptionalIntegerQuestionAnswer answer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            return new OptionalIntegerAnswer(question, shouldSubmitEarly, answer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionalIntegerAnswer)) {
                return false;
            }
            OptionalIntegerAnswer optionalIntegerAnswer = (OptionalIntegerAnswer) other;
            return Intrinsics.areEqual(this.question, optionalIntegerAnswer.question) && this.shouldSubmitEarly == optionalIntegerAnswer.shouldSubmitEarly && Intrinsics.areEqual(this.answer, optionalIntegerAnswer.answer);
        }

        public int hashCode() {
            return (((this.question.hashCode() * 31) + Boolean.hashCode(this.shouldSubmitEarly)) * 31) + this.answer.hashCode();
        }

        public String toString() {
            return "OptionalIntegerAnswer(question=" + this.question + ", shouldSubmitEarly=" + this.shouldSubmitEarly + ", answer=" + this.answer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.question.writeToParcel(dest, flags);
            dest.writeInt(this.shouldSubmitEarly ? 1 : 0);
            dest.writeParcelable(this.answer, flags);
        }

        public OptionalIntegerAnswer(UiQuestionnaireQuestion.OptionalIntegerQuestion question, boolean z, OptionalIntegerQuestionAnswer answer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.question = question;
            this.shouldSubmitEarly = z;
            this.answer = answer;
        }

        public /* synthetic */ OptionalIntegerAnswer(UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, boolean z, OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(optionalIntegerQuestion, (i & 2) != 0 ? false : z, optionalIntegerQuestionAnswer);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public UiQuestionnaireQuestion.OptionalIntegerQuestion getQuestion() {
            return this.question;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getShouldSubmitEarly() {
            return this.shouldSubmitEarly;
        }

        public final OptionalIntegerQuestionAnswer getAnswer() {
            return this.answer;
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public boolean getRedirectRequired() {
            OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer = this.answer;
            Boolean boolValueOf = null;
            if (optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.Integer) {
                UiGraphRedirect uncheckedGraphRedirect = getQuestion().getContent().getUncheckedGraphRedirect();
                if (uncheckedGraphRedirect != null) {
                    boolValueOf = Boolean.valueOf(uncheckedGraphRedirect.getRedirectRequired());
                }
            } else {
                if (!(optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.None)) {
                    throw new NoWhenBranchMatchedException();
                }
                UiGraphRedirect checkedGraphRedirect = getQuestion().getContent().getCheckedGraphRedirect();
                if (checkedGraphRedirect != null) {
                    boolValueOf = Boolean.valueOf(checkedGraphRedirect.getRedirectRequired());
                }
            }
            return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public List<String> getRedirectDestinations() {
            OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer = this.answer;
            String redirect = null;
            if (optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.Integer) {
                UiGraphRedirect uncheckedGraphRedirect = getQuestion().getContent().getUncheckedGraphRedirect();
                if (uncheckedGraphRedirect != null) {
                    redirect = uncheckedGraphRedirect.getRedirect();
                }
            } else {
                if (!(optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.None)) {
                    throw new NoWhenBranchMatchedException();
                }
                UiGraphRedirect checkedGraphRedirect = getQuestion().getContent().getCheckedGraphRedirect();
                if (checkedGraphRedirect != null) {
                    redirect = checkedGraphRedirect.getRedirect();
                }
            }
            return CollectionsKt.listOfNotNull(redirect);
        }

        @Override // com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer
        public ApiQuestionnaireSubmitRequest3 toApiContent() {
            Integer numValueOf;
            OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer = this.answer;
            if (optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.Integer) {
                numValueOf = Integer.valueOf(((OptionalIntegerQuestionAnswer.Integer) optionalIntegerQuestionAnswer).getValue());
            } else {
                if (!(optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.None)) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = null;
            }
            return new ApiQuestionnaireSubmitRequest3.OptionalInteger(numValueOf);
        }
    }
}
