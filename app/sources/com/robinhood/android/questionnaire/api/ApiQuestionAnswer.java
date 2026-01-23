package com.robinhood.android.questionnaire.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireSubmitRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionAnswer;", "Landroid/os/Parcelable;", "question_id", "Ljava/util/UUID;", "answer_content", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;)V", "getQuestion_id", "()Ljava/util/UUID;", "getAnswer_content", "()Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionAnswer implements Parcelable {
    public static final Parcelable.Creator<ApiQuestionAnswer> CREATOR = new Creator();
    private final ApiQuestionnaireSubmitRequest3 answer_content;
    private final UUID question_id;

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiQuestionAnswer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiQuestionAnswer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiQuestionAnswer((UUID) parcel.readSerializable(), (ApiQuestionnaireSubmitRequest3) parcel.readParcelable(ApiQuestionAnswer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiQuestionAnswer[] newArray(int i) {
            return new ApiQuestionAnswer[i];
        }
    }

    public static /* synthetic */ ApiQuestionAnswer copy$default(ApiQuestionAnswer apiQuestionAnswer, UUID uuid, ApiQuestionnaireSubmitRequest3 apiQuestionnaireSubmitRequest3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiQuestionAnswer.question_id;
        }
        if ((i & 2) != 0) {
            apiQuestionnaireSubmitRequest3 = apiQuestionAnswer.answer_content;
        }
        return apiQuestionAnswer.copy(uuid, apiQuestionnaireSubmitRequest3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getQuestion_id() {
        return this.question_id;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiQuestionnaireSubmitRequest3 getAnswer_content() {
        return this.answer_content;
    }

    public final ApiQuestionAnswer copy(UUID question_id, ApiQuestionnaireSubmitRequest3 answer_content) {
        Intrinsics.checkNotNullParameter(question_id, "question_id");
        Intrinsics.checkNotNullParameter(answer_content, "answer_content");
        return new ApiQuestionAnswer(question_id, answer_content);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionAnswer)) {
            return false;
        }
        ApiQuestionAnswer apiQuestionAnswer = (ApiQuestionAnswer) other;
        return Intrinsics.areEqual(this.question_id, apiQuestionAnswer.question_id) && Intrinsics.areEqual(this.answer_content, apiQuestionAnswer.answer_content);
    }

    public int hashCode() {
        return (this.question_id.hashCode() * 31) + this.answer_content.hashCode();
    }

    public String toString() {
        return "ApiQuestionAnswer(question_id=" + this.question_id + ", answer_content=" + this.answer_content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.question_id);
        dest.writeParcelable(this.answer_content, flags);
    }

    public ApiQuestionAnswer(UUID question_id, ApiQuestionnaireSubmitRequest3 answer_content) {
        Intrinsics.checkNotNullParameter(question_id, "question_id");
        Intrinsics.checkNotNullParameter(answer_content, "answer_content");
        this.question_id = question_id;
        this.answer_content = answer_content;
    }

    public final UUID getQuestion_id() {
        return this.question_id;
    }

    public final ApiQuestionnaireSubmitRequest3 getAnswer_content() {
        return this.answer_content;
    }
}
