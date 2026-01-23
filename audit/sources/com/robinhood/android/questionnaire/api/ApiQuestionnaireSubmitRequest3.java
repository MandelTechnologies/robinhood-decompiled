package com.robinhood.android.questionnaire.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireSubmitRequest.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\b\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/android/questionnaire/api/QuestionType;", "<init>", "(Lcom/robinhood/android/questionnaire/api/QuestionType;)V", "getType", "()Lcom/robinhood/android/questionnaire/api/QuestionType;", "MultipleChoiceContent", "MultipleResponseContent", "HybridContent", "IntegerContent", "StringContent", "OptionalInteger", "AdapterModule", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$HybridContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$MultipleResponseContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$OptionalInteger;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$StringContent;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent, reason: use source file name */
/* loaded from: classes17.dex */
public abstract class ApiQuestionnaireSubmitRequest3 implements Parcelable {
    private final QuestionType type;

    public /* synthetic */ ApiQuestionnaireSubmitRequest3(QuestionType questionType, DefaultConstructorMarker defaultConstructorMarker) {
        this(questionType);
    }

    private ApiQuestionnaireSubmitRequest3(QuestionType questionType) {
        this.type = questionType;
    }

    public final QuestionType getType() {
        return this.type;
    }

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "answer_id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getAnswer_id", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$MultipleChoiceContent, reason: from toString */
    public static final /* data */ class MultipleChoiceContent extends ApiQuestionnaireSubmitRequest3 {
        public static final Parcelable.Creator<MultipleChoiceContent> CREATOR = new Creator();
        private final UUID answer_id;

        /* compiled from: ApiQuestionnaireSubmitRequest.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$MultipleChoiceContent$Creator */
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<MultipleChoiceContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultipleChoiceContent((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceContent[] newArray(int i) {
                return new MultipleChoiceContent[i];
            }
        }

        public static /* synthetic */ MultipleChoiceContent copy$default(MultipleChoiceContent multipleChoiceContent, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = multipleChoiceContent.answer_id;
            }
            return multipleChoiceContent.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAnswer_id() {
            return this.answer_id;
        }

        public final MultipleChoiceContent copy(UUID answer_id) {
            Intrinsics.checkNotNullParameter(answer_id, "answer_id");
            return new MultipleChoiceContent(answer_id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleChoiceContent) && Intrinsics.areEqual(this.answer_id, ((MultipleChoiceContent) other).answer_id);
        }

        public int hashCode() {
            return this.answer_id.hashCode();
        }

        public String toString() {
            return "MultipleChoiceContent(answer_id=" + this.answer_id + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.answer_id);
        }

        public final UUID getAnswer_id() {
            return this.answer_id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleChoiceContent(UUID answer_id) {
            super(QuestionType.MULTIPLE_CHOICE, null);
            Intrinsics.checkNotNullParameter(answer_id, "answer_id");
            this.answer_id = answer_id;
        }
    }

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$MultipleResponseContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "answer_ids", "", "Ljava/util/UUID;", "<init>", "(Ljava/util/List;)V", "getAnswer_ids", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$MultipleResponseContent, reason: from toString */
    public static final /* data */ class MultipleResponseContent extends ApiQuestionnaireSubmitRequest3 {
        public static final Parcelable.Creator<MultipleResponseContent> CREATOR = new Creator();
        private final List<UUID> answer_ids;

        /* compiled from: ApiQuestionnaireSubmitRequest.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$MultipleResponseContent$Creator */
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<MultipleResponseContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleResponseContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new MultipleResponseContent(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleResponseContent[] newArray(int i) {
                return new MultipleResponseContent[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleResponseContent copy$default(MultipleResponseContent multipleResponseContent, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = multipleResponseContent.answer_ids;
            }
            return multipleResponseContent.copy(list);
        }

        public final List<UUID> component1() {
            return this.answer_ids;
        }

        public final MultipleResponseContent copy(List<UUID> answer_ids) {
            Intrinsics.checkNotNullParameter(answer_ids, "answer_ids");
            return new MultipleResponseContent(answer_ids);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleResponseContent) && Intrinsics.areEqual(this.answer_ids, ((MultipleResponseContent) other).answer_ids);
        }

        public int hashCode() {
            return this.answer_ids.hashCode();
        }

        public String toString() {
            return "MultipleResponseContent(answer_ids=" + this.answer_ids + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UUID> list = this.answer_ids;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
        }

        public final List<UUID> getAnswer_ids() {
            return this.answer_ids;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleResponseContent(List<UUID> answer_ids) {
            super(QuestionType.MULTIPLE_CHOICE, null);
            Intrinsics.checkNotNullParameter(answer_ids, "answer_ids");
            this.answer_ids = answer_ids;
        }
    }

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$HybridContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "answer_id", "Ljava/util/UUID;", "answer_text", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getAnswer_id", "()Ljava/util/UUID;", "getAnswer_text", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$HybridContent, reason: from toString */
    /* loaded from: classes11.dex */
    public static final /* data */ class HybridContent extends ApiQuestionnaireSubmitRequest3 {
        public static final Parcelable.Creator<HybridContent> CREATOR = new Creator();
        private final UUID answer_id;
        private final String answer_text;

        /* compiled from: ApiQuestionnaireSubmitRequest.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$HybridContent$Creator */
        public static final class Creator implements Parcelable.Creator<HybridContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HybridContent((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridContent[] newArray(int i) {
                return new HybridContent[i];
            }
        }

        public static /* synthetic */ HybridContent copy$default(HybridContent hybridContent, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = hybridContent.answer_id;
            }
            if ((i & 2) != 0) {
                str = hybridContent.answer_text;
            }
            return hybridContent.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAnswer_id() {
            return this.answer_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAnswer_text() {
            return this.answer_text;
        }

        public final HybridContent copy(UUID answer_id, String answer_text) {
            Intrinsics.checkNotNullParameter(answer_id, "answer_id");
            return new HybridContent(answer_id, answer_text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HybridContent)) {
                return false;
            }
            HybridContent hybridContent = (HybridContent) other;
            return Intrinsics.areEqual(this.answer_id, hybridContent.answer_id) && Intrinsics.areEqual(this.answer_text, hybridContent.answer_text);
        }

        public int hashCode() {
            int iHashCode = this.answer_id.hashCode() * 31;
            String str = this.answer_text;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "HybridContent(answer_id=" + this.answer_id + ", answer_text=" + this.answer_text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.answer_id);
            dest.writeString(this.answer_text);
        }

        public final UUID getAnswer_id() {
            return this.answer_id;
        }

        public final String getAnswer_text() {
            return this.answer_text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HybridContent(UUID answer_id, String str) {
            super(QuestionType.HYBRID_STRING_RESPONSE, null);
            Intrinsics.checkNotNullParameter(answer_id, "answer_id");
            this.answer_id = answer_id;
            this.answer_text = str;
        }
    }

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "answer", "", "<init>", "(I)V", "getAnswer", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$IntegerContent, reason: from toString */
    public static final /* data */ class IntegerContent extends ApiQuestionnaireSubmitRequest3 {
        public static final Parcelable.Creator<IntegerContent> CREATOR = new Creator();
        private final int answer;

        /* compiled from: ApiQuestionnaireSubmitRequest.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$IntegerContent$Creator */
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<IntegerContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegerContent(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerContent[] newArray(int i) {
                return new IntegerContent[i];
            }
        }

        public static /* synthetic */ IntegerContent copy$default(IntegerContent integerContent, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = integerContent.answer;
            }
            return integerContent.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAnswer() {
            return this.answer;
        }

        public final IntegerContent copy(int answer) {
            return new IntegerContent(answer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntegerContent) && this.answer == ((IntegerContent) other).answer;
        }

        public int hashCode() {
            return Integer.hashCode(this.answer);
        }

        public String toString() {
            return "IntegerContent(answer=" + this.answer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.answer);
        }

        public final int getAnswer() {
            return this.answer;
        }

        public IntegerContent(int i) {
            super(QuestionType.INTEGER_QUESTION, null);
            this.answer = i;
        }
    }

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$StringContent;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "answer_text", "", "<init>", "(Ljava/lang/String;)V", "getAnswer_text", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$StringContent, reason: from toString */
    public static final /* data */ class StringContent extends ApiQuestionnaireSubmitRequest3 {
        public static final Parcelable.Creator<StringContent> CREATOR = new Creator();
        private final String answer_text;

        /* compiled from: ApiQuestionnaireSubmitRequest.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$StringContent$Creator */
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<StringContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringContent(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringContent[] newArray(int i) {
                return new StringContent[i];
            }
        }

        public static /* synthetic */ StringContent copy$default(StringContent stringContent, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringContent.answer_text;
            }
            return stringContent.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAnswer_text() {
            return this.answer_text;
        }

        public final StringContent copy(String answer_text) {
            Intrinsics.checkNotNullParameter(answer_text, "answer_text");
            return new StringContent(answer_text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringContent) && Intrinsics.areEqual(this.answer_text, ((StringContent) other).answer_text);
        }

        public int hashCode() {
            return this.answer_text.hashCode();
        }

        public String toString() {
            return "StringContent(answer_text=" + this.answer_text + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.answer_text);
        }

        public final String getAnswer_text() {
            return this.answer_text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringContent(String answer_text) {
            super(QuestionType.STRING_QUESTION, null);
            Intrinsics.checkNotNullParameter(answer_text, "answer_text");
            this.answer_text = answer_text;
        }
    }

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$OptionalInteger;", "Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent;", "answer", "", "<init>", "(Ljava/lang/Integer;)V", "getAnswer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$OptionalInteger;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$OptionalInteger, reason: from toString */
    public static final /* data */ class OptionalInteger extends ApiQuestionnaireSubmitRequest3 {
        public static final Parcelable.Creator<OptionalInteger> CREATOR = new Creator();
        private final Integer answer;

        /* compiled from: ApiQuestionnaireSubmitRequest.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$OptionalInteger$Creator */
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<OptionalInteger> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalInteger createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionalInteger(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalInteger[] newArray(int i) {
                return new OptionalInteger[i];
            }
        }

        public static /* synthetic */ OptionalInteger copy$default(OptionalInteger optionalInteger, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = optionalInteger.answer;
            }
            return optionalInteger.copy(num);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getAnswer() {
            return this.answer;
        }

        public final OptionalInteger copy(Integer answer) {
            return new OptionalInteger(answer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionalInteger) && Intrinsics.areEqual(this.answer, ((OptionalInteger) other).answer);
        }

        public int hashCode() {
            Integer num = this.answer;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "OptionalInteger(answer=" + this.answer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.answer;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
        }

        public final Integer getAnswer() {
            return this.answer;
        }

        public OptionalInteger(Integer num) {
            super(QuestionType.OPTIONAL_INTEGER, null);
            this.answer = num;
        }
    }

    /* compiled from: ApiQuestionnaireSubmitRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSubmitAnswerContent$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.questionnaire.api.ApiSubmitAnswerContent$AdapterModule */
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(ApiQuestionnaireSubmitRequest3.class, "type").withSubtype(MultipleChoiceContent.class, QuestionType.MULTIPLE_CHOICE.getServerValue()).withSubtype(MultipleResponseContent.class, QuestionType.MULTIPLE_RESPONSE.getServerValue()).withSubtype(IntegerContent.class, QuestionType.INTEGER_QUESTION.getServerValue()).withSubtype(StringContent.class, QuestionType.STRING_QUESTION.getServerValue()).withSubtype(OptionalInteger.class, QuestionType.OPTIONAL_INTEGER.getServerValue()).withSubtype(HybridContent.class, QuestionType.HYBRID_STRING_RESPONSE.getServerValue());
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
