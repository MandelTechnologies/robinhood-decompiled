package com.robinhood.android.questionnaire.p220ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiQuestionnaireQuestion.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion;", "Landroid/os/Parcelable;", "Supported", "MultipleChoiceQuestion", "MultipleResponseQuestion", "HybridQuestion", "IntegerQuestion", "StringQuestion", "OptionalIntegerQuestion", "Unsupported", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Unsupported;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface UiQuestionnaireQuestion extends Parcelable {

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "key", "", "getKey", "()Ljava/lang/String;", "title", "getTitle", "subtitle", "getSubtitle", "disclosureMarkdown", "getDisclosureMarkdown", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "getContent", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$HybridQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleResponseQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Supported extends UiQuestionnaireQuestion {
        UiQuestionContent getContent();

        ApiQuestionnaireQuestion.Context getContext();

        String getDisclosureMarkdown();

        UUID getId();

        String getKey();

        String getSubtitle();

        String getTitle();
    }

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "id", "Ljava/util/UUID;", "key", "", "title", "subtitle", "disclosureMarkdown", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;)V", "getId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosureMarkdown", "getContent", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleChoiceQuestion implements Supported {
        public static final Parcelable.Creator<MultipleChoiceQuestion> CREATOR = new Creator();
        private final UiQuestionContent.MultipleChoiceContent content;
        private final ApiQuestionnaireQuestion.Context context;
        private final String disclosureMarkdown;
        private final UUID id;
        private final String key;
        private final String subtitle;
        private final String title;

        /* compiled from: UiQuestionnaireQuestion.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleChoiceQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultipleChoiceQuestion((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), UiQuestionContent.MultipleChoiceContent.CREATOR.createFromParcel(parcel), ApiQuestionnaireQuestion.Context.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceQuestion[] newArray(int i) {
                return new MultipleChoiceQuestion[i];
            }
        }

        public static /* synthetic */ MultipleChoiceQuestion copy$default(MultipleChoiceQuestion multipleChoiceQuestion, UUID uuid, String str, String str2, String str3, String str4, UiQuestionContent.MultipleChoiceContent multipleChoiceContent, ApiQuestionnaireQuestion.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = multipleChoiceQuestion.id;
            }
            if ((i & 2) != 0) {
                str = multipleChoiceQuestion.key;
            }
            if ((i & 4) != 0) {
                str2 = multipleChoiceQuestion.title;
            }
            if ((i & 8) != 0) {
                str3 = multipleChoiceQuestion.subtitle;
            }
            if ((i & 16) != 0) {
                str4 = multipleChoiceQuestion.disclosureMarkdown;
            }
            if ((i & 32) != 0) {
                multipleChoiceContent = multipleChoiceQuestion.content;
            }
            if ((i & 64) != 0) {
                context = multipleChoiceQuestion.context;
            }
            UiQuestionContent.MultipleChoiceContent multipleChoiceContent2 = multipleChoiceContent;
            ApiQuestionnaireQuestion.Context context2 = context;
            String str5 = str4;
            String str6 = str2;
            return multipleChoiceQuestion.copy(uuid, str, str6, str3, str5, multipleChoiceContent2, context2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component6, reason: from getter */
        public final UiQuestionContent.MultipleChoiceContent getContent() {
            return this.content;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }

        public final MultipleChoiceQuestion copy(UUID id, String key, String title, String subtitle, String disclosureMarkdown, UiQuestionContent.MultipleChoiceContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            return new MultipleChoiceQuestion(id, key, title, subtitle, disclosureMarkdown, content, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleChoiceQuestion)) {
                return false;
            }
            MultipleChoiceQuestion multipleChoiceQuestion = (MultipleChoiceQuestion) other;
            return Intrinsics.areEqual(this.id, multipleChoiceQuestion.id) && Intrinsics.areEqual(this.key, multipleChoiceQuestion.key) && Intrinsics.areEqual(this.title, multipleChoiceQuestion.title) && Intrinsics.areEqual(this.subtitle, multipleChoiceQuestion.subtitle) && Intrinsics.areEqual(this.disclosureMarkdown, multipleChoiceQuestion.disclosureMarkdown) && Intrinsics.areEqual(this.content, multipleChoiceQuestion.content) && this.context == multipleChoiceQuestion.context;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            String str = this.disclosureMarkdown;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31) + this.context.hashCode();
        }

        public String toString() {
            return "MultipleChoiceQuestion(id=" + this.id + ", key=" + this.key + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", content=" + this.content + ", context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.key);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeString(this.disclosureMarkdown);
            this.content.writeToParcel(dest, flags);
            dest.writeString(this.context.name());
        }

        public MultipleChoiceQuestion(UUID id, String key, String title, String subtitle, String str, UiQuestionContent.MultipleChoiceContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            this.id = id;
            this.key = key;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosureMarkdown = str;
            this.content = content;
            this.context = context;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UiQuestionContent.MultipleChoiceContent getContent() {
            return this.content;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }
    }

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleResponseQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "id", "Ljava/util/UUID;", "key", "", "title", "subtitle", "disclosureMarkdown", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;)V", "getId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosureMarkdown", "getContent", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleResponseQuestion implements Supported {
        public static final Parcelable.Creator<MultipleResponseQuestion> CREATOR = new Creator();
        private final UiQuestionContent.MultipleResponseContent content;
        private final ApiQuestionnaireQuestion.Context context;
        private final String disclosureMarkdown;
        private final UUID id;
        private final String key;
        private final String subtitle;
        private final String title;

        /* compiled from: UiQuestionnaireQuestion.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleResponseQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleResponseQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultipleResponseQuestion((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), UiQuestionContent.MultipleResponseContent.CREATOR.createFromParcel(parcel), ApiQuestionnaireQuestion.Context.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleResponseQuestion[] newArray(int i) {
                return new MultipleResponseQuestion[i];
            }
        }

        public static /* synthetic */ MultipleResponseQuestion copy$default(MultipleResponseQuestion multipleResponseQuestion, UUID uuid, String str, String str2, String str3, String str4, UiQuestionContent.MultipleResponseContent multipleResponseContent, ApiQuestionnaireQuestion.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = multipleResponseQuestion.id;
            }
            if ((i & 2) != 0) {
                str = multipleResponseQuestion.key;
            }
            if ((i & 4) != 0) {
                str2 = multipleResponseQuestion.title;
            }
            if ((i & 8) != 0) {
                str3 = multipleResponseQuestion.subtitle;
            }
            if ((i & 16) != 0) {
                str4 = multipleResponseQuestion.disclosureMarkdown;
            }
            if ((i & 32) != 0) {
                multipleResponseContent = multipleResponseQuestion.content;
            }
            if ((i & 64) != 0) {
                context = multipleResponseQuestion.context;
            }
            UiQuestionContent.MultipleResponseContent multipleResponseContent2 = multipleResponseContent;
            ApiQuestionnaireQuestion.Context context2 = context;
            String str5 = str4;
            String str6 = str2;
            return multipleResponseQuestion.copy(uuid, str, str6, str3, str5, multipleResponseContent2, context2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component6, reason: from getter */
        public final UiQuestionContent.MultipleResponseContent getContent() {
            return this.content;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }

        public final MultipleResponseQuestion copy(UUID id, String key, String title, String subtitle, String disclosureMarkdown, UiQuestionContent.MultipleResponseContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            return new MultipleResponseQuestion(id, key, title, subtitle, disclosureMarkdown, content, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleResponseQuestion)) {
                return false;
            }
            MultipleResponseQuestion multipleResponseQuestion = (MultipleResponseQuestion) other;
            return Intrinsics.areEqual(this.id, multipleResponseQuestion.id) && Intrinsics.areEqual(this.key, multipleResponseQuestion.key) && Intrinsics.areEqual(this.title, multipleResponseQuestion.title) && Intrinsics.areEqual(this.subtitle, multipleResponseQuestion.subtitle) && Intrinsics.areEqual(this.disclosureMarkdown, multipleResponseQuestion.disclosureMarkdown) && Intrinsics.areEqual(this.content, multipleResponseQuestion.content) && this.context == multipleResponseQuestion.context;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            String str = this.disclosureMarkdown;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31) + this.context.hashCode();
        }

        public String toString() {
            return "MultipleResponseQuestion(id=" + this.id + ", key=" + this.key + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", content=" + this.content + ", context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.key);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeString(this.disclosureMarkdown);
            this.content.writeToParcel(dest, flags);
            dest.writeString(this.context.name());
        }

        public MultipleResponseQuestion(UUID id, String key, String title, String subtitle, String str, UiQuestionContent.MultipleResponseContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            this.id = id;
            this.key = key;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosureMarkdown = str;
            this.content = content;
            this.context = context;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UiQuestionContent.MultipleResponseContent getContent() {
            return this.content;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }
    }

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$HybridQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "id", "Ljava/util/UUID;", "key", "", "title", "subtitle", "disclosureMarkdown", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;)V", "getId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosureMarkdown", "getContent", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HybridQuestion implements Supported {
        public static final Parcelable.Creator<HybridQuestion> CREATOR = new Creator();
        private final UiQuestionContent.HybridContent content;
        private final ApiQuestionnaireQuestion.Context context;
        private final String disclosureMarkdown;
        private final UUID id;
        private final String key;
        private final String subtitle;
        private final String title;

        /* compiled from: UiQuestionnaireQuestion.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<HybridQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HybridQuestion((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), UiQuestionContent.HybridContent.CREATOR.createFromParcel(parcel), ApiQuestionnaireQuestion.Context.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridQuestion[] newArray(int i) {
                return new HybridQuestion[i];
            }
        }

        public static /* synthetic */ HybridQuestion copy$default(HybridQuestion hybridQuestion, UUID uuid, String str, String str2, String str3, String str4, UiQuestionContent.HybridContent hybridContent, ApiQuestionnaireQuestion.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = hybridQuestion.id;
            }
            if ((i & 2) != 0) {
                str = hybridQuestion.key;
            }
            if ((i & 4) != 0) {
                str2 = hybridQuestion.title;
            }
            if ((i & 8) != 0) {
                str3 = hybridQuestion.subtitle;
            }
            if ((i & 16) != 0) {
                str4 = hybridQuestion.disclosureMarkdown;
            }
            if ((i & 32) != 0) {
                hybridContent = hybridQuestion.content;
            }
            if ((i & 64) != 0) {
                context = hybridQuestion.context;
            }
            UiQuestionContent.HybridContent hybridContent2 = hybridContent;
            ApiQuestionnaireQuestion.Context context2 = context;
            String str5 = str4;
            String str6 = str2;
            return hybridQuestion.copy(uuid, str, str6, str3, str5, hybridContent2, context2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component6, reason: from getter */
        public final UiQuestionContent.HybridContent getContent() {
            return this.content;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }

        public final HybridQuestion copy(UUID id, String key, String title, String subtitle, String disclosureMarkdown, UiQuestionContent.HybridContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            return new HybridQuestion(id, key, title, subtitle, disclosureMarkdown, content, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HybridQuestion)) {
                return false;
            }
            HybridQuestion hybridQuestion = (HybridQuestion) other;
            return Intrinsics.areEqual(this.id, hybridQuestion.id) && Intrinsics.areEqual(this.key, hybridQuestion.key) && Intrinsics.areEqual(this.title, hybridQuestion.title) && Intrinsics.areEqual(this.subtitle, hybridQuestion.subtitle) && Intrinsics.areEqual(this.disclosureMarkdown, hybridQuestion.disclosureMarkdown) && Intrinsics.areEqual(this.content, hybridQuestion.content) && this.context == hybridQuestion.context;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            String str = this.disclosureMarkdown;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31) + this.context.hashCode();
        }

        public String toString() {
            return "HybridQuestion(id=" + this.id + ", key=" + this.key + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", content=" + this.content + ", context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.key);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeString(this.disclosureMarkdown);
            this.content.writeToParcel(dest, flags);
            dest.writeString(this.context.name());
        }

        public HybridQuestion(UUID id, String key, String title, String subtitle, String str, UiQuestionContent.HybridContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            this.id = id;
            this.key = key;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosureMarkdown = str;
            this.content = content;
            this.context = context;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UiQuestionContent.HybridContent getContent() {
            return this.content;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }
    }

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "id", "Ljava/util/UUID;", "key", "", "title", "subtitle", "disclosureMarkdown", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$IntegerContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$IntegerContent;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;)V", "getId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosureMarkdown", "getContent", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$IntegerContent;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IntegerQuestion implements Supported {
        public static final Parcelable.Creator<IntegerQuestion> CREATOR = new Creator();
        private final UiQuestionContent.IntegerContent content;
        private final ApiQuestionnaireQuestion.Context context;
        private final String disclosureMarkdown;
        private final UUID id;
        private final String key;
        private final String subtitle;
        private final String title;

        /* compiled from: UiQuestionnaireQuestion.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegerQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegerQuestion((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), UiQuestionContent.IntegerContent.CREATOR.createFromParcel(parcel), ApiQuestionnaireQuestion.Context.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerQuestion[] newArray(int i) {
                return new IntegerQuestion[i];
            }
        }

        public static /* synthetic */ IntegerQuestion copy$default(IntegerQuestion integerQuestion, UUID uuid, String str, String str2, String str3, String str4, UiQuestionContent.IntegerContent integerContent, ApiQuestionnaireQuestion.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = integerQuestion.id;
            }
            if ((i & 2) != 0) {
                str = integerQuestion.key;
            }
            if ((i & 4) != 0) {
                str2 = integerQuestion.title;
            }
            if ((i & 8) != 0) {
                str3 = integerQuestion.subtitle;
            }
            if ((i & 16) != 0) {
                str4 = integerQuestion.disclosureMarkdown;
            }
            if ((i & 32) != 0) {
                integerContent = integerQuestion.content;
            }
            if ((i & 64) != 0) {
                context = integerQuestion.context;
            }
            UiQuestionContent.IntegerContent integerContent2 = integerContent;
            ApiQuestionnaireQuestion.Context context2 = context;
            String str5 = str4;
            String str6 = str2;
            return integerQuestion.copy(uuid, str, str6, str3, str5, integerContent2, context2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component6, reason: from getter */
        public final UiQuestionContent.IntegerContent getContent() {
            return this.content;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }

        public final IntegerQuestion copy(UUID id, String key, String title, String subtitle, String disclosureMarkdown, UiQuestionContent.IntegerContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            return new IntegerQuestion(id, key, title, subtitle, disclosureMarkdown, content, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegerQuestion)) {
                return false;
            }
            IntegerQuestion integerQuestion = (IntegerQuestion) other;
            return Intrinsics.areEqual(this.id, integerQuestion.id) && Intrinsics.areEqual(this.key, integerQuestion.key) && Intrinsics.areEqual(this.title, integerQuestion.title) && Intrinsics.areEqual(this.subtitle, integerQuestion.subtitle) && Intrinsics.areEqual(this.disclosureMarkdown, integerQuestion.disclosureMarkdown) && Intrinsics.areEqual(this.content, integerQuestion.content) && this.context == integerQuestion.context;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            String str = this.disclosureMarkdown;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31) + this.context.hashCode();
        }

        public String toString() {
            return "IntegerQuestion(id=" + this.id + ", key=" + this.key + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", content=" + this.content + ", context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.key);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeString(this.disclosureMarkdown);
            this.content.writeToParcel(dest, flags);
            dest.writeString(this.context.name());
        }

        public IntegerQuestion(UUID id, String key, String title, String subtitle, String str, UiQuestionContent.IntegerContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            this.id = id;
            this.key = key;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosureMarkdown = str;
            this.content = content;
            this.context = context;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UiQuestionContent.IntegerContent getContent() {
            return this.content;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }
    }

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "id", "Ljava/util/UUID;", "key", "", "title", "subtitle", "disclosureMarkdown", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$StringContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "isOptional", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$StringContent;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;Z)V", "getId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosureMarkdown", "getContent", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$StringContent;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StringQuestion implements Supported {
        public static final Parcelable.Creator<StringQuestion> CREATOR = new Creator();
        private final UiQuestionContent.StringContent content;
        private final ApiQuestionnaireQuestion.Context context;
        private final String disclosureMarkdown;
        private final UUID id;
        private final boolean isOptional;
        private final String key;
        private final String subtitle;
        private final String title;

        /* compiled from: UiQuestionnaireQuestion.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StringQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringQuestion((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), UiQuestionContent.StringContent.CREATOR.createFromParcel(parcel), ApiQuestionnaireQuestion.Context.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringQuestion[] newArray(int i) {
                return new StringQuestion[i];
            }
        }

        public static /* synthetic */ StringQuestion copy$default(StringQuestion stringQuestion, UUID uuid, String str, String str2, String str3, String str4, UiQuestionContent.StringContent stringContent, ApiQuestionnaireQuestion.Context context, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = stringQuestion.id;
            }
            if ((i & 2) != 0) {
                str = stringQuestion.key;
            }
            if ((i & 4) != 0) {
                str2 = stringQuestion.title;
            }
            if ((i & 8) != 0) {
                str3 = stringQuestion.subtitle;
            }
            if ((i & 16) != 0) {
                str4 = stringQuestion.disclosureMarkdown;
            }
            if ((i & 32) != 0) {
                stringContent = stringQuestion.content;
            }
            if ((i & 64) != 0) {
                context = stringQuestion.context;
            }
            if ((i & 128) != 0) {
                z = stringQuestion.isOptional;
            }
            ApiQuestionnaireQuestion.Context context2 = context;
            boolean z2 = z;
            String str5 = str4;
            UiQuestionContent.StringContent stringContent2 = stringContent;
            return stringQuestion.copy(uuid, str, str2, str3, str5, stringContent2, context2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component6, reason: from getter */
        public final UiQuestionContent.StringContent getContent() {
            return this.content;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        public final StringQuestion copy(UUID id, String key, String title, String subtitle, String disclosureMarkdown, UiQuestionContent.StringContent content, ApiQuestionnaireQuestion.Context context, boolean isOptional) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            return new StringQuestion(id, key, title, subtitle, disclosureMarkdown, content, context, isOptional);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringQuestion)) {
                return false;
            }
            StringQuestion stringQuestion = (StringQuestion) other;
            return Intrinsics.areEqual(this.id, stringQuestion.id) && Intrinsics.areEqual(this.key, stringQuestion.key) && Intrinsics.areEqual(this.title, stringQuestion.title) && Intrinsics.areEqual(this.subtitle, stringQuestion.subtitle) && Intrinsics.areEqual(this.disclosureMarkdown, stringQuestion.disclosureMarkdown) && Intrinsics.areEqual(this.content, stringQuestion.content) && this.context == stringQuestion.context && this.isOptional == stringQuestion.isOptional;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            String str = this.disclosureMarkdown;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31) + this.context.hashCode()) * 31) + Boolean.hashCode(this.isOptional);
        }

        public String toString() {
            return "StringQuestion(id=" + this.id + ", key=" + this.key + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", content=" + this.content + ", context=" + this.context + ", isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.key);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeString(this.disclosureMarkdown);
            this.content.writeToParcel(dest, flags);
            dest.writeString(this.context.name());
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public StringQuestion(UUID id, String key, String title, String subtitle, String str, UiQuestionContent.StringContent content, ApiQuestionnaireQuestion.Context context, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            this.id = id;
            this.key = key;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosureMarkdown = str;
            this.content = content;
            this.context = context;
            this.isOptional = z;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UiQuestionContent.StringContent getContent() {
            return this.content;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }

        public final boolean isOptional() {
            return this.isOptional;
        }
    }

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "id", "Ljava/util/UUID;", "key", "", "title", "subtitle", "disclosureMarkdown", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;", "context", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;)V", "getId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosureMarkdown", "getContent", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;", "getContext", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireQuestion$Context;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionalIntegerQuestion implements Supported {
        public static final Parcelable.Creator<OptionalIntegerQuestion> CREATOR = new Creator();
        private final UiQuestionContent.OptionalIntegerContent content;
        private final ApiQuestionnaireQuestion.Context context;
        private final String disclosureMarkdown;
        private final UUID id;
        private final String key;
        private final String subtitle;
        private final String title;

        /* compiled from: UiQuestionnaireQuestion.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionalIntegerQuestion> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalIntegerQuestion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionalIntegerQuestion((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), UiQuestionContent.OptionalIntegerContent.CREATOR.createFromParcel(parcel), ApiQuestionnaireQuestion.Context.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalIntegerQuestion[] newArray(int i) {
                return new OptionalIntegerQuestion[i];
            }
        }

        public static /* synthetic */ OptionalIntegerQuestion copy$default(OptionalIntegerQuestion optionalIntegerQuestion, UUID uuid, String str, String str2, String str3, String str4, UiQuestionContent.OptionalIntegerContent optionalIntegerContent, ApiQuestionnaireQuestion.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = optionalIntegerQuestion.id;
            }
            if ((i & 2) != 0) {
                str = optionalIntegerQuestion.key;
            }
            if ((i & 4) != 0) {
                str2 = optionalIntegerQuestion.title;
            }
            if ((i & 8) != 0) {
                str3 = optionalIntegerQuestion.subtitle;
            }
            if ((i & 16) != 0) {
                str4 = optionalIntegerQuestion.disclosureMarkdown;
            }
            if ((i & 32) != 0) {
                optionalIntegerContent = optionalIntegerQuestion.content;
            }
            if ((i & 64) != 0) {
                context = optionalIntegerQuestion.context;
            }
            UiQuestionContent.OptionalIntegerContent optionalIntegerContent2 = optionalIntegerContent;
            ApiQuestionnaireQuestion.Context context2 = context;
            String str5 = str4;
            String str6 = str2;
            return optionalIntegerQuestion.copy(uuid, str, str6, str3, str5, optionalIntegerContent2, context2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component6, reason: from getter */
        public final UiQuestionContent.OptionalIntegerContent getContent() {
            return this.content;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }

        public final OptionalIntegerQuestion copy(UUID id, String key, String title, String subtitle, String disclosureMarkdown, UiQuestionContent.OptionalIntegerContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            return new OptionalIntegerQuestion(id, key, title, subtitle, disclosureMarkdown, content, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionalIntegerQuestion)) {
                return false;
            }
            OptionalIntegerQuestion optionalIntegerQuestion = (OptionalIntegerQuestion) other;
            return Intrinsics.areEqual(this.id, optionalIntegerQuestion.id) && Intrinsics.areEqual(this.key, optionalIntegerQuestion.key) && Intrinsics.areEqual(this.title, optionalIntegerQuestion.title) && Intrinsics.areEqual(this.subtitle, optionalIntegerQuestion.subtitle) && Intrinsics.areEqual(this.disclosureMarkdown, optionalIntegerQuestion.disclosureMarkdown) && Intrinsics.areEqual(this.content, optionalIntegerQuestion.content) && this.context == optionalIntegerQuestion.context;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            String str = this.disclosureMarkdown;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.content.hashCode()) * 31) + this.context.hashCode();
        }

        public String toString() {
            return "OptionalIntegerQuestion(id=" + this.id + ", key=" + this.key + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", content=" + this.content + ", context=" + this.context + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.key);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeString(this.disclosureMarkdown);
            this.content.writeToParcel(dest, flags);
            dest.writeString(this.context.name());
        }

        public OptionalIntegerQuestion(UUID id, String key, String title, String subtitle, String str, UiQuestionContent.OptionalIntegerContent content, ApiQuestionnaireQuestion.Context context) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(context, "context");
            this.id = id;
            this.key = key;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosureMarkdown = str;
            this.content = content;
            this.context = context;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getKey() {
            return this.key;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getTitle() {
            return this.title;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public UiQuestionContent.OptionalIntegerContent getContent() {
            return this.content;
        }

        @Override // com.robinhood.android.questionnaire.ui.UiQuestionnaireQuestion.Supported
        public ApiQuestionnaireQuestion.Context getContext() {
            return this.context;
        }
    }

    /* compiled from: UiQuestionnaireQuestion.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Unsupported;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Unsupported implements UiQuestionnaireQuestion {
        public static final Unsupported INSTANCE = new Unsupported();
        public static final Parcelable.Creator<Unsupported> CREATOR = new Creator();

        /* compiled from: UiQuestionnaireQuestion.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Unsupported> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unsupported createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unsupported.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unsupported[] newArray(int i) {
                return new Unsupported[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unsupported);
        }

        public int hashCode() {
            return -1288259423;
        }

        public String toString() {
            return "Unsupported";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Unsupported() {
        }
    }
}
