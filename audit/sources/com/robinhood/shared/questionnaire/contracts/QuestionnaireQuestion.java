package com.robinhood.shared.questionnaire.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireQuestion.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireQuestion;", "Landroid/os/Parcelable;", "questionKey", "", "existingAnswer", "questionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuestionKey", "()Ljava/lang/String;", "getExistingAnswer", "getQuestionId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class QuestionnaireQuestion implements Parcelable {
    public static final Parcelable.Creator<QuestionnaireQuestion> CREATOR = new Creator();
    private final String existingAnswer;
    private final String questionId;
    private final String questionKey;

    /* compiled from: QuestionnaireQuestion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionnaireQuestion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireQuestion createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionnaireQuestion(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireQuestion[] newArray(int i) {
            return new QuestionnaireQuestion[i];
        }
    }

    public static /* synthetic */ QuestionnaireQuestion copy$default(QuestionnaireQuestion questionnaireQuestion, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionnaireQuestion.questionKey;
        }
        if ((i & 2) != 0) {
            str2 = questionnaireQuestion.existingAnswer;
        }
        if ((i & 4) != 0) {
            str3 = questionnaireQuestion.questionId;
        }
        return questionnaireQuestion.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestionKey() {
        return this.questionKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExistingAnswer() {
        return this.existingAnswer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    public final QuestionnaireQuestion copy(String questionKey, String existingAnswer, String questionId) {
        Intrinsics.checkNotNullParameter(questionKey, "questionKey");
        return new QuestionnaireQuestion(questionKey, existingAnswer, questionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireQuestion)) {
            return false;
        }
        QuestionnaireQuestion questionnaireQuestion = (QuestionnaireQuestion) other;
        return Intrinsics.areEqual(this.questionKey, questionnaireQuestion.questionKey) && Intrinsics.areEqual(this.existingAnswer, questionnaireQuestion.existingAnswer) && Intrinsics.areEqual(this.questionId, questionnaireQuestion.questionId);
    }

    public int hashCode() {
        int iHashCode = this.questionKey.hashCode() * 31;
        String str = this.existingAnswer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.questionId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "QuestionnaireQuestion(questionKey=" + this.questionKey + ", existingAnswer=" + this.existingAnswer + ", questionId=" + this.questionId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.questionKey);
        dest.writeString(this.existingAnswer);
        dest.writeString(this.questionId);
    }

    public QuestionnaireQuestion(String questionKey, String str, String str2) {
        Intrinsics.checkNotNullParameter(questionKey, "questionKey");
        this.questionKey = questionKey;
        this.existingAnswer = str;
        this.questionId = str2;
    }

    public /* synthetic */ QuestionnaireQuestion(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String getQuestionKey() {
        return this.questionKey;
    }

    public final String getExistingAnswer() {
        return this.existingAnswer;
    }

    public final String getQuestionId() {
        return this.questionId;
    }
}
