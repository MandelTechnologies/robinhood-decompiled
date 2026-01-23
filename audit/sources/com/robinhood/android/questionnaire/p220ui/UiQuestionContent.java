package com.robinhood.android.questionnaire.p220ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiQuestionContent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "Landroid/os/Parcelable;", "MultipleChoiceContent", "MultipleResponseContent", "HybridContent", "IntegerContent", "OptionalIntegerContent", "StringContent", "Unsupported", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$StringContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$Unsupported;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface UiQuestionContent extends Parcelable {

    /* compiled from: UiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "answerChoices", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent$Answer;", "<init>", "(Ljava/util/List;)V", "getAnswerChoices", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleChoiceContent implements UiQuestionContent {
        public static final Parcelable.Creator<MultipleChoiceContent> CREATOR = new Creator();
        private final List<Answer> answerChoices;

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleChoiceContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Answer.CREATOR.createFromParcel(parcel));
                }
                return new MultipleChoiceContent(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleChoiceContent[] newArray(int i) {
                return new MultipleChoiceContent[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleChoiceContent copy$default(MultipleChoiceContent multipleChoiceContent, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = multipleChoiceContent.answerChoices;
            }
            return multipleChoiceContent.copy(list);
        }

        public final List<Answer> component1() {
            return this.answerChoices;
        }

        public final MultipleChoiceContent copy(List<Answer> answerChoices) {
            Intrinsics.checkNotNullParameter(answerChoices, "answerChoices");
            return new MultipleChoiceContent(answerChoices);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleChoiceContent) && Intrinsics.areEqual(this.answerChoices, ((MultipleChoiceContent) other).answerChoices);
        }

        public int hashCode() {
            return this.answerChoices.hashCode();
        }

        public String toString() {
            return "MultipleChoiceContent(answerChoices=" + this.answerChoices + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Answer> list = this.answerChoices;
            dest.writeInt(list.size());
            Iterator<Answer> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public MultipleChoiceContent(List<Answer> answerChoices) {
            Intrinsics.checkNotNullParameter(answerChoices, "answerChoices");
            this.answerChoices = answerChoices;
        }

        public final List<Answer> getAnswerChoices() {
            return this.answerChoices;
        }

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent$Answer;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "title", "", "subtitle", "key", "graphRedirect", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)V", "getId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getKey", "getGraphRedirect", "()Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Answer implements Parcelable {
            public static final Parcelable.Creator<Answer> CREATOR = new Creator();
            private final UiGraphRedirect graphRedirect;
            private final UUID id;
            private final String key;
            private final String subtitle;
            private final String title;

            /* compiled from: UiQuestionContent.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Answer> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Answer createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Answer((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UiGraphRedirect.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Answer[] newArray(int i) {
                    return new Answer[i];
                }
            }

            public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, UiGraphRedirect uiGraphRedirect, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = answer.id;
                }
                if ((i & 2) != 0) {
                    str = answer.title;
                }
                if ((i & 4) != 0) {
                    str2 = answer.subtitle;
                }
                if ((i & 8) != 0) {
                    str3 = answer.key;
                }
                if ((i & 16) != 0) {
                    uiGraphRedirect = answer.graphRedirect;
                }
                UiGraphRedirect uiGraphRedirect2 = uiGraphRedirect;
                String str4 = str2;
                return answer.copy(uuid, str, str4, str3, uiGraphRedirect2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component5, reason: from getter */
            public final UiGraphRedirect getGraphRedirect() {
                return this.graphRedirect;
            }

            public final Answer copy(UUID id, String title, String subtitle, String key, UiGraphRedirect graphRedirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                return new Answer(id, title, subtitle, key, graphRedirect);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Answer)) {
                    return false;
                }
                Answer answer = (Answer) other;
                return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.title, answer.title) && Intrinsics.areEqual(this.subtitle, answer.subtitle) && Intrinsics.areEqual(this.key, answer.key) && Intrinsics.areEqual(this.graphRedirect, answer.graphRedirect);
            }

            public int hashCode() {
                int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.key.hashCode()) * 31;
                UiGraphRedirect uiGraphRedirect = this.graphRedirect;
                return iHashCode + (uiGraphRedirect == null ? 0 : uiGraphRedirect.hashCode());
            }

            public String toString() {
                return "Answer(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", key=" + this.key + ", graphRedirect=" + this.graphRedirect + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.id);
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
                dest.writeString(this.key);
                UiGraphRedirect uiGraphRedirect = this.graphRedirect;
                if (uiGraphRedirect == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    uiGraphRedirect.writeToParcel(dest, flags);
                }
            }

            public Answer(UUID id, String title, String subtitle, String key, UiGraphRedirect uiGraphRedirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                this.id = id;
                this.title = title;
                this.subtitle = subtitle;
                this.key = key;
                this.graphRedirect = uiGraphRedirect;
            }

            public final UUID getId() {
                return this.id;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getKey() {
                return this.key;
            }

            public final UiGraphRedirect getGraphRedirect() {
                return this.graphRedirect;
            }
        }
    }

    /* compiled from: UiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "answerChoices", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent$Answer;", "<init>", "(Ljava/util/List;)V", "getAnswerChoices", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MultipleResponseContent implements UiQuestionContent {
        public static final Parcelable.Creator<MultipleResponseContent> CREATOR = new Creator();
        private final List<Answer> answerChoices;

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleResponseContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultipleResponseContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Answer.CREATOR.createFromParcel(parcel));
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
                list = multipleResponseContent.answerChoices;
            }
            return multipleResponseContent.copy(list);
        }

        public final List<Answer> component1() {
            return this.answerChoices;
        }

        public final MultipleResponseContent copy(List<Answer> answerChoices) {
            Intrinsics.checkNotNullParameter(answerChoices, "answerChoices");
            return new MultipleResponseContent(answerChoices);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleResponseContent) && Intrinsics.areEqual(this.answerChoices, ((MultipleResponseContent) other).answerChoices);
        }

        public int hashCode() {
            return this.answerChoices.hashCode();
        }

        public String toString() {
            return "MultipleResponseContent(answerChoices=" + this.answerChoices + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Answer> list = this.answerChoices;
            dest.writeInt(list.size());
            Iterator<Answer> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public MultipleResponseContent(List<Answer> answerChoices) {
            Intrinsics.checkNotNullParameter(answerChoices, "answerChoices");
            this.answerChoices = answerChoices;
        }

        public final List<Answer> getAnswerChoices() {
            return this.answerChoices;
        }

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleResponseContent$Answer;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "title", "", "subtitle", "key", "graphRedirect", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)V", "getId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getKey", "getGraphRedirect", "()Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Answer implements Parcelable {
            public static final Parcelable.Creator<Answer> CREATOR = new Creator();
            private final UiGraphRedirect graphRedirect;
            private final UUID id;
            private final String key;
            private final String subtitle;
            private final String title;

            /* compiled from: UiQuestionContent.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Answer> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Answer createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Answer((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UiGraphRedirect.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Answer[] newArray(int i) {
                    return new Answer[i];
                }
            }

            public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, UiGraphRedirect uiGraphRedirect, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = answer.id;
                }
                if ((i & 2) != 0) {
                    str = answer.title;
                }
                if ((i & 4) != 0) {
                    str2 = answer.subtitle;
                }
                if ((i & 8) != 0) {
                    str3 = answer.key;
                }
                if ((i & 16) != 0) {
                    uiGraphRedirect = answer.graphRedirect;
                }
                UiGraphRedirect uiGraphRedirect2 = uiGraphRedirect;
                String str4 = str2;
                return answer.copy(uuid, str, str4, str3, uiGraphRedirect2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component5, reason: from getter */
            public final UiGraphRedirect getGraphRedirect() {
                return this.graphRedirect;
            }

            public final Answer copy(UUID id, String title, String subtitle, String key, UiGraphRedirect graphRedirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                return new Answer(id, title, subtitle, key, graphRedirect);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Answer)) {
                    return false;
                }
                Answer answer = (Answer) other;
                return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.title, answer.title) && Intrinsics.areEqual(this.subtitle, answer.subtitle) && Intrinsics.areEqual(this.key, answer.key) && Intrinsics.areEqual(this.graphRedirect, answer.graphRedirect);
            }

            public int hashCode() {
                int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.key.hashCode()) * 31;
                UiGraphRedirect uiGraphRedirect = this.graphRedirect;
                return iHashCode + (uiGraphRedirect == null ? 0 : uiGraphRedirect.hashCode());
            }

            public String toString() {
                return "Answer(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", key=" + this.key + ", graphRedirect=" + this.graphRedirect + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.id);
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
                dest.writeString(this.key);
                UiGraphRedirect uiGraphRedirect = this.graphRedirect;
                if (uiGraphRedirect == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    uiGraphRedirect.writeToParcel(dest, flags);
                }
            }

            public Answer(UUID id, String title, String subtitle, String key, UiGraphRedirect uiGraphRedirect) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                this.id = id;
                this.title = title;
                this.subtitle = subtitle;
                this.key = key;
                this.graphRedirect = uiGraphRedirect;
            }

            public final UUID getId() {
                return this.id;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getKey() {
                return this.key;
            }

            public final UiGraphRedirect getGraphRedirect() {
                return this.graphRedirect;
            }
        }
    }

    /* compiled from: UiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0006J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "answerChoices", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent$Answer;", "maxLength", "", "placeholder", "", "graphDefaultRedirect", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "<init>", "(Ljava/util/List;ILjava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)V", "getAnswerChoices", "()Ljava/util/List;", "getMaxLength", "()I", "getPlaceholder", "()Ljava/lang/String;", "getGraphDefaultRedirect", "()Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Answer", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HybridContent implements UiQuestionContent {
        public static final Parcelable.Creator<HybridContent> CREATOR = new Creator();
        private final List<Answer> answerChoices;
        private final UiGraphRedirect graphDefaultRedirect;
        private final int maxLength;
        private final String placeholder;

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<HybridContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Answer.CREATOR.createFromParcel(parcel));
                }
                return new HybridContent(arrayList, parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : UiGraphRedirect.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HybridContent[] newArray(int i) {
                return new HybridContent[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HybridContent copy$default(HybridContent hybridContent, List list, int i, String str, UiGraphRedirect uiGraphRedirect, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = hybridContent.answerChoices;
            }
            if ((i2 & 2) != 0) {
                i = hybridContent.maxLength;
            }
            if ((i2 & 4) != 0) {
                str = hybridContent.placeholder;
            }
            if ((i2 & 8) != 0) {
                uiGraphRedirect = hybridContent.graphDefaultRedirect;
            }
            return hybridContent.copy(list, i, str, uiGraphRedirect);
        }

        public final List<Answer> component1() {
            return this.answerChoices;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxLength() {
            return this.maxLength;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component4, reason: from getter */
        public final UiGraphRedirect getGraphDefaultRedirect() {
            return this.graphDefaultRedirect;
        }

        public final HybridContent copy(List<Answer> answerChoices, int maxLength, String placeholder, UiGraphRedirect graphDefaultRedirect) {
            Intrinsics.checkNotNullParameter(answerChoices, "answerChoices");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new HybridContent(answerChoices, maxLength, placeholder, graphDefaultRedirect);
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
            return Intrinsics.areEqual(this.answerChoices, hybridContent.answerChoices) && this.maxLength == hybridContent.maxLength && Intrinsics.areEqual(this.placeholder, hybridContent.placeholder) && Intrinsics.areEqual(this.graphDefaultRedirect, hybridContent.graphDefaultRedirect);
        }

        public int hashCode() {
            int iHashCode = ((((this.answerChoices.hashCode() * 31) + Integer.hashCode(this.maxLength)) * 31) + this.placeholder.hashCode()) * 31;
            UiGraphRedirect uiGraphRedirect = this.graphDefaultRedirect;
            return iHashCode + (uiGraphRedirect == null ? 0 : uiGraphRedirect.hashCode());
        }

        public String toString() {
            return "HybridContent(answerChoices=" + this.answerChoices + ", maxLength=" + this.maxLength + ", placeholder=" + this.placeholder + ", graphDefaultRedirect=" + this.graphDefaultRedirect + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Answer> list = this.answerChoices;
            dest.writeInt(list.size());
            Iterator<Answer> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeInt(this.maxLength);
            dest.writeString(this.placeholder);
            UiGraphRedirect uiGraphRedirect = this.graphDefaultRedirect;
            if (uiGraphRedirect == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiGraphRedirect.writeToParcel(dest, flags);
            }
        }

        public HybridContent(List<Answer> answerChoices, int i, String placeholder, UiGraphRedirect uiGraphRedirect) {
            Intrinsics.checkNotNullParameter(answerChoices, "answerChoices");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.answerChoices = answerChoices;
            this.maxLength = i;
            this.placeholder = placeholder;
            this.graphDefaultRedirect = uiGraphRedirect;
        }

        public final List<Answer> getAnswerChoices() {
            return this.answerChoices;
        }

        public final int getMaxLength() {
            return this.maxLength;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final UiGraphRedirect getGraphDefaultRedirect() {
            return this.graphDefaultRedirect;
        }

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent$Answer;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "title", "", "subtitle", "key", "graphRedirect", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "isHybridResponse", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;Z)V", "getId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getKey", "getGraphRedirect", "()Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Answer implements Parcelable {
            public static final Parcelable.Creator<Answer> CREATOR = new Creator();
            private final UiGraphRedirect graphRedirect;
            private final UUID id;
            private final boolean isHybridResponse;
            private final String key;
            private final String subtitle;
            private final String title;

            /* compiled from: UiQuestionContent.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Answer> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Answer createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Answer((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UiGraphRedirect.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Answer[] newArray(int i) {
                    return new Answer[i];
                }
            }

            public static /* synthetic */ Answer copy$default(Answer answer, UUID uuid, String str, String str2, String str3, UiGraphRedirect uiGraphRedirect, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = answer.id;
                }
                if ((i & 2) != 0) {
                    str = answer.title;
                }
                if ((i & 4) != 0) {
                    str2 = answer.subtitle;
                }
                if ((i & 8) != 0) {
                    str3 = answer.key;
                }
                if ((i & 16) != 0) {
                    uiGraphRedirect = answer.graphRedirect;
                }
                if ((i & 32) != 0) {
                    z = answer.isHybridResponse;
                }
                UiGraphRedirect uiGraphRedirect2 = uiGraphRedirect;
                boolean z2 = z;
                return answer.copy(uuid, str, str2, str3, uiGraphRedirect2, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component5, reason: from getter */
            public final UiGraphRedirect getGraphRedirect() {
                return this.graphRedirect;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getIsHybridResponse() {
                return this.isHybridResponse;
            }

            public final Answer copy(UUID id, String title, String subtitle, String key, UiGraphRedirect graphRedirect, boolean isHybridResponse) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                return new Answer(id, title, subtitle, key, graphRedirect, isHybridResponse);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Answer)) {
                    return false;
                }
                Answer answer = (Answer) other;
                return Intrinsics.areEqual(this.id, answer.id) && Intrinsics.areEqual(this.title, answer.title) && Intrinsics.areEqual(this.subtitle, answer.subtitle) && Intrinsics.areEqual(this.key, answer.key) && Intrinsics.areEqual(this.graphRedirect, answer.graphRedirect) && this.isHybridResponse == answer.isHybridResponse;
            }

            public int hashCode() {
                int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.key.hashCode()) * 31;
                UiGraphRedirect uiGraphRedirect = this.graphRedirect;
                return ((iHashCode + (uiGraphRedirect == null ? 0 : uiGraphRedirect.hashCode())) * 31) + Boolean.hashCode(this.isHybridResponse);
            }

            public String toString() {
                return "Answer(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", key=" + this.key + ", graphRedirect=" + this.graphRedirect + ", isHybridResponse=" + this.isHybridResponse + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.id);
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
                dest.writeString(this.key);
                UiGraphRedirect uiGraphRedirect = this.graphRedirect;
                if (uiGraphRedirect == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    uiGraphRedirect.writeToParcel(dest, flags);
                }
                dest.writeInt(this.isHybridResponse ? 1 : 0);
            }

            public Answer(UUID id, String title, String subtitle, String key, UiGraphRedirect uiGraphRedirect, boolean z) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(key, "key");
                this.id = id;
                this.title = title;
                this.subtitle = subtitle;
                this.key = key;
                this.graphRedirect = uiGraphRedirect;
                this.isHybridResponse = z;
            }

            public final UUID getId() {
                return this.id;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getKey() {
                return this.key;
            }

            public final UiGraphRedirect getGraphRedirect() {
                return this.graphRedirect;
            }

            public final boolean isHybridResponse() {
                return this.isHybridResponse;
            }
        }
    }

    /* compiled from: UiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u0003J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$IntegerContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "minValue", "", "maxValue", "placeholder", "", "defaultValue", "belowMinValueAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "aboveMaxValueAlert", "graphDefaultRedirect", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)V", "getMinValue", "()I", "getMaxValue", "getPlaceholder", "()Ljava/lang/String;", "getDefaultValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBelowMinValueAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getAboveMaxValueAlert", "getGraphDefaultRedirect", "()Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$IntegerContent;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class IntegerContent implements UiQuestionContent {
        public static final Parcelable.Creator<IntegerContent> CREATOR = new Creator();
        private final GenericAlertContent<GenericAction> aboveMaxValueAlert;
        private final GenericAlertContent<GenericAction> belowMinValueAlert;
        private final Integer defaultValue;
        private final UiGraphRedirect graphDefaultRedirect;
        private final int maxValue;
        private final int minValue;
        private final String placeholder;

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegerContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegerContent(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (GenericAlertContent) parcel.readParcelable(IntegerContent.class.getClassLoader()), (GenericAlertContent) parcel.readParcelable(IntegerContent.class.getClassLoader()), parcel.readInt() != 0 ? UiGraphRedirect.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerContent[] newArray(int i) {
                return new IntegerContent[i];
            }
        }

        public static /* synthetic */ IntegerContent copy$default(IntegerContent integerContent, int i, int i2, String str, Integer num, GenericAlertContent genericAlertContent, GenericAlertContent genericAlertContent2, UiGraphRedirect uiGraphRedirect, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = integerContent.minValue;
            }
            if ((i3 & 2) != 0) {
                i2 = integerContent.maxValue;
            }
            if ((i3 & 4) != 0) {
                str = integerContent.placeholder;
            }
            if ((i3 & 8) != 0) {
                num = integerContent.defaultValue;
            }
            if ((i3 & 16) != 0) {
                genericAlertContent = integerContent.belowMinValueAlert;
            }
            if ((i3 & 32) != 0) {
                genericAlertContent2 = integerContent.aboveMaxValueAlert;
            }
            if ((i3 & 64) != 0) {
                uiGraphRedirect = integerContent.graphDefaultRedirect;
            }
            GenericAlertContent genericAlertContent3 = genericAlertContent2;
            UiGraphRedirect uiGraphRedirect2 = uiGraphRedirect;
            GenericAlertContent genericAlertContent4 = genericAlertContent;
            String str2 = str;
            return integerContent.copy(i, i2, str2, num, genericAlertContent4, genericAlertContent3, uiGraphRedirect2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxValue() {
            return this.maxValue;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getDefaultValue() {
            return this.defaultValue;
        }

        public final GenericAlertContent<GenericAction> component5() {
            return this.belowMinValueAlert;
        }

        public final GenericAlertContent<GenericAction> component6() {
            return this.aboveMaxValueAlert;
        }

        /* renamed from: component7, reason: from getter */
        public final UiGraphRedirect getGraphDefaultRedirect() {
            return this.graphDefaultRedirect;
        }

        public final IntegerContent copy(int minValue, int maxValue, String placeholder, Integer defaultValue, GenericAlertContent<? extends GenericAction> belowMinValueAlert, GenericAlertContent<? extends GenericAction> aboveMaxValueAlert, UiGraphRedirect graphDefaultRedirect) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(belowMinValueAlert, "belowMinValueAlert");
            Intrinsics.checkNotNullParameter(aboveMaxValueAlert, "aboveMaxValueAlert");
            return new IntegerContent(minValue, maxValue, placeholder, defaultValue, belowMinValueAlert, aboveMaxValueAlert, graphDefaultRedirect);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegerContent)) {
                return false;
            }
            IntegerContent integerContent = (IntegerContent) other;
            return this.minValue == integerContent.minValue && this.maxValue == integerContent.maxValue && Intrinsics.areEqual(this.placeholder, integerContent.placeholder) && Intrinsics.areEqual(this.defaultValue, integerContent.defaultValue) && Intrinsics.areEqual(this.belowMinValueAlert, integerContent.belowMinValueAlert) && Intrinsics.areEqual(this.aboveMaxValueAlert, integerContent.aboveMaxValueAlert) && Intrinsics.areEqual(this.graphDefaultRedirect, integerContent.graphDefaultRedirect);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.minValue) * 31) + Integer.hashCode(this.maxValue)) * 31) + this.placeholder.hashCode()) * 31;
            Integer num = this.defaultValue;
            int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.belowMinValueAlert.hashCode()) * 31) + this.aboveMaxValueAlert.hashCode()) * 31;
            UiGraphRedirect uiGraphRedirect = this.graphDefaultRedirect;
            return iHashCode2 + (uiGraphRedirect != null ? uiGraphRedirect.hashCode() : 0);
        }

        public String toString() {
            return "IntegerContent(minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", placeholder=" + this.placeholder + ", defaultValue=" + this.defaultValue + ", belowMinValueAlert=" + this.belowMinValueAlert + ", aboveMaxValueAlert=" + this.aboveMaxValueAlert + ", graphDefaultRedirect=" + this.graphDefaultRedirect + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.minValue);
            dest.writeInt(this.maxValue);
            dest.writeString(this.placeholder);
            Integer num = this.defaultValue;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeParcelable(this.belowMinValueAlert, flags);
            dest.writeParcelable(this.aboveMaxValueAlert, flags);
            UiGraphRedirect uiGraphRedirect = this.graphDefaultRedirect;
            if (uiGraphRedirect == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiGraphRedirect.writeToParcel(dest, flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IntegerContent(int i, int i2, String placeholder, Integer num, GenericAlertContent<? extends GenericAction> belowMinValueAlert, GenericAlertContent<? extends GenericAction> aboveMaxValueAlert, UiGraphRedirect uiGraphRedirect) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(belowMinValueAlert, "belowMinValueAlert");
            Intrinsics.checkNotNullParameter(aboveMaxValueAlert, "aboveMaxValueAlert");
            this.minValue = i;
            this.maxValue = i2;
            this.placeholder = placeholder;
            this.defaultValue = num;
            this.belowMinValueAlert = belowMinValueAlert;
            this.aboveMaxValueAlert = aboveMaxValueAlert;
            this.graphDefaultRedirect = uiGraphRedirect;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getDefaultValue() {
            return this.defaultValue;
        }

        public final GenericAlertContent<GenericAction> getBelowMinValueAlert() {
            return this.belowMinValueAlert;
        }

        public final GenericAlertContent<GenericAction> getAboveMaxValueAlert() {
            return this.aboveMaxValueAlert;
        }

        public final UiGraphRedirect getGraphDefaultRedirect() {
            return this.graphDefaultRedirect;
        }
    }

    /* compiled from: UiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u008e\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020\u0003J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "minValue", "", "maxValue", "placeholder", "", "defaultValue", "belowMinValueAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "aboveMaxValueAlert", "checkboxLabel", "noneRenderValue", "checkboxLoggingIdentifier", "checkedGraphRedirect", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "uncheckedGraphRedirect", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)V", "getMinValue", "()I", "getMaxValue", "getPlaceholder", "()Ljava/lang/String;", "getDefaultValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBelowMinValueAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getAboveMaxValueAlert", "getCheckboxLabel", "getNoneRenderValue", "getCheckboxLoggingIdentifier", "getCheckedGraphRedirect", "()Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "getUncheckedGraphRedirect", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(IILjava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionalIntegerContent implements UiQuestionContent {
        public static final Parcelable.Creator<OptionalIntegerContent> CREATOR = new Creator();
        private final GenericAlertContent<GenericAction> aboveMaxValueAlert;
        private final GenericAlertContent<GenericAction> belowMinValueAlert;
        private final String checkboxLabel;
        private final String checkboxLoggingIdentifier;
        private final UiGraphRedirect checkedGraphRedirect;
        private final Integer defaultValue;
        private final int maxValue;
        private final int minValue;
        private final String noneRenderValue;
        private final String placeholder;
        private final UiGraphRedirect uncheckedGraphRedirect;

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionalIntegerContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalIntegerContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionalIntegerContent(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (GenericAlertContent) parcel.readParcelable(OptionalIntegerContent.class.getClassLoader()), (GenericAlertContent) parcel.readParcelable(OptionalIntegerContent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UiGraphRedirect.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiGraphRedirect.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionalIntegerContent[] newArray(int i) {
                return new OptionalIntegerContent[i];
            }
        }

        public static /* synthetic */ OptionalIntegerContent copy$default(OptionalIntegerContent optionalIntegerContent, int i, int i2, String str, Integer num, GenericAlertContent genericAlertContent, GenericAlertContent genericAlertContent2, String str2, String str3, String str4, UiGraphRedirect uiGraphRedirect, UiGraphRedirect uiGraphRedirect2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = optionalIntegerContent.minValue;
            }
            if ((i3 & 2) != 0) {
                i2 = optionalIntegerContent.maxValue;
            }
            if ((i3 & 4) != 0) {
                str = optionalIntegerContent.placeholder;
            }
            if ((i3 & 8) != 0) {
                num = optionalIntegerContent.defaultValue;
            }
            if ((i3 & 16) != 0) {
                genericAlertContent = optionalIntegerContent.belowMinValueAlert;
            }
            if ((i3 & 32) != 0) {
                genericAlertContent2 = optionalIntegerContent.aboveMaxValueAlert;
            }
            if ((i3 & 64) != 0) {
                str2 = optionalIntegerContent.checkboxLabel;
            }
            if ((i3 & 128) != 0) {
                str3 = optionalIntegerContent.noneRenderValue;
            }
            if ((i3 & 256) != 0) {
                str4 = optionalIntegerContent.checkboxLoggingIdentifier;
            }
            if ((i3 & 512) != 0) {
                uiGraphRedirect = optionalIntegerContent.checkedGraphRedirect;
            }
            if ((i3 & 1024) != 0) {
                uiGraphRedirect2 = optionalIntegerContent.uncheckedGraphRedirect;
            }
            UiGraphRedirect uiGraphRedirect3 = uiGraphRedirect;
            UiGraphRedirect uiGraphRedirect4 = uiGraphRedirect2;
            String str5 = str3;
            String str6 = str4;
            GenericAlertContent genericAlertContent3 = genericAlertContent2;
            String str7 = str2;
            GenericAlertContent genericAlertContent4 = genericAlertContent;
            String str8 = str;
            return optionalIntegerContent.copy(i, i2, str8, num, genericAlertContent4, genericAlertContent3, str7, str5, str6, uiGraphRedirect3, uiGraphRedirect4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        /* renamed from: component10, reason: from getter */
        public final UiGraphRedirect getCheckedGraphRedirect() {
            return this.checkedGraphRedirect;
        }

        /* renamed from: component11, reason: from getter */
        public final UiGraphRedirect getUncheckedGraphRedirect() {
            return this.uncheckedGraphRedirect;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxValue() {
            return this.maxValue;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getDefaultValue() {
            return this.defaultValue;
        }

        public final GenericAlertContent<GenericAction> component5() {
            return this.belowMinValueAlert;
        }

        public final GenericAlertContent<GenericAction> component6() {
            return this.aboveMaxValueAlert;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCheckboxLabel() {
            return this.checkboxLabel;
        }

        /* renamed from: component8, reason: from getter */
        public final String getNoneRenderValue() {
            return this.noneRenderValue;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCheckboxLoggingIdentifier() {
            return this.checkboxLoggingIdentifier;
        }

        public final OptionalIntegerContent copy(int minValue, int maxValue, String placeholder, Integer defaultValue, GenericAlertContent<? extends GenericAction> belowMinValueAlert, GenericAlertContent<? extends GenericAction> aboveMaxValueAlert, String checkboxLabel, String noneRenderValue, String checkboxLoggingIdentifier, UiGraphRedirect checkedGraphRedirect, UiGraphRedirect uncheckedGraphRedirect) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(belowMinValueAlert, "belowMinValueAlert");
            Intrinsics.checkNotNullParameter(aboveMaxValueAlert, "aboveMaxValueAlert");
            Intrinsics.checkNotNullParameter(checkboxLabel, "checkboxLabel");
            Intrinsics.checkNotNullParameter(noneRenderValue, "noneRenderValue");
            Intrinsics.checkNotNullParameter(checkboxLoggingIdentifier, "checkboxLoggingIdentifier");
            return new OptionalIntegerContent(minValue, maxValue, placeholder, defaultValue, belowMinValueAlert, aboveMaxValueAlert, checkboxLabel, noneRenderValue, checkboxLoggingIdentifier, checkedGraphRedirect, uncheckedGraphRedirect);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionalIntegerContent)) {
                return false;
            }
            OptionalIntegerContent optionalIntegerContent = (OptionalIntegerContent) other;
            return this.minValue == optionalIntegerContent.minValue && this.maxValue == optionalIntegerContent.maxValue && Intrinsics.areEqual(this.placeholder, optionalIntegerContent.placeholder) && Intrinsics.areEqual(this.defaultValue, optionalIntegerContent.defaultValue) && Intrinsics.areEqual(this.belowMinValueAlert, optionalIntegerContent.belowMinValueAlert) && Intrinsics.areEqual(this.aboveMaxValueAlert, optionalIntegerContent.aboveMaxValueAlert) && Intrinsics.areEqual(this.checkboxLabel, optionalIntegerContent.checkboxLabel) && Intrinsics.areEqual(this.noneRenderValue, optionalIntegerContent.noneRenderValue) && Intrinsics.areEqual(this.checkboxLoggingIdentifier, optionalIntegerContent.checkboxLoggingIdentifier) && Intrinsics.areEqual(this.checkedGraphRedirect, optionalIntegerContent.checkedGraphRedirect) && Intrinsics.areEqual(this.uncheckedGraphRedirect, optionalIntegerContent.uncheckedGraphRedirect);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.minValue) * 31) + Integer.hashCode(this.maxValue)) * 31) + this.placeholder.hashCode()) * 31;
            Integer num = this.defaultValue;
            int iHashCode2 = (((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.belowMinValueAlert.hashCode()) * 31) + this.aboveMaxValueAlert.hashCode()) * 31) + this.checkboxLabel.hashCode()) * 31) + this.noneRenderValue.hashCode()) * 31) + this.checkboxLoggingIdentifier.hashCode()) * 31;
            UiGraphRedirect uiGraphRedirect = this.checkedGraphRedirect;
            int iHashCode3 = (iHashCode2 + (uiGraphRedirect == null ? 0 : uiGraphRedirect.hashCode())) * 31;
            UiGraphRedirect uiGraphRedirect2 = this.uncheckedGraphRedirect;
            return iHashCode3 + (uiGraphRedirect2 != null ? uiGraphRedirect2.hashCode() : 0);
        }

        public String toString() {
            return "OptionalIntegerContent(minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", placeholder=" + this.placeholder + ", defaultValue=" + this.defaultValue + ", belowMinValueAlert=" + this.belowMinValueAlert + ", aboveMaxValueAlert=" + this.aboveMaxValueAlert + ", checkboxLabel=" + this.checkboxLabel + ", noneRenderValue=" + this.noneRenderValue + ", checkboxLoggingIdentifier=" + this.checkboxLoggingIdentifier + ", checkedGraphRedirect=" + this.checkedGraphRedirect + ", uncheckedGraphRedirect=" + this.uncheckedGraphRedirect + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.minValue);
            dest.writeInt(this.maxValue);
            dest.writeString(this.placeholder);
            Integer num = this.defaultValue;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeParcelable(this.belowMinValueAlert, flags);
            dest.writeParcelable(this.aboveMaxValueAlert, flags);
            dest.writeString(this.checkboxLabel);
            dest.writeString(this.noneRenderValue);
            dest.writeString(this.checkboxLoggingIdentifier);
            UiGraphRedirect uiGraphRedirect = this.checkedGraphRedirect;
            if (uiGraphRedirect == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiGraphRedirect.writeToParcel(dest, flags);
            }
            UiGraphRedirect uiGraphRedirect2 = this.uncheckedGraphRedirect;
            if (uiGraphRedirect2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiGraphRedirect2.writeToParcel(dest, flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OptionalIntegerContent(int i, int i2, String placeholder, Integer num, GenericAlertContent<? extends GenericAction> belowMinValueAlert, GenericAlertContent<? extends GenericAction> aboveMaxValueAlert, String checkboxLabel, String noneRenderValue, String checkboxLoggingIdentifier, UiGraphRedirect uiGraphRedirect, UiGraphRedirect uiGraphRedirect2) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(belowMinValueAlert, "belowMinValueAlert");
            Intrinsics.checkNotNullParameter(aboveMaxValueAlert, "aboveMaxValueAlert");
            Intrinsics.checkNotNullParameter(checkboxLabel, "checkboxLabel");
            Intrinsics.checkNotNullParameter(noneRenderValue, "noneRenderValue");
            Intrinsics.checkNotNullParameter(checkboxLoggingIdentifier, "checkboxLoggingIdentifier");
            this.minValue = i;
            this.maxValue = i2;
            this.placeholder = placeholder;
            this.defaultValue = num;
            this.belowMinValueAlert = belowMinValueAlert;
            this.aboveMaxValueAlert = aboveMaxValueAlert;
            this.checkboxLabel = checkboxLabel;
            this.noneRenderValue = noneRenderValue;
            this.checkboxLoggingIdentifier = checkboxLoggingIdentifier;
            this.checkedGraphRedirect = uiGraphRedirect;
            this.uncheckedGraphRedirect = uiGraphRedirect2;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getDefaultValue() {
            return this.defaultValue;
        }

        public final GenericAlertContent<GenericAction> getBelowMinValueAlert() {
            return this.belowMinValueAlert;
        }

        public final GenericAlertContent<GenericAction> getAboveMaxValueAlert() {
            return this.aboveMaxValueAlert;
        }

        public final String getCheckboxLabel() {
            return this.checkboxLabel;
        }

        public final String getNoneRenderValue() {
            return this.noneRenderValue;
        }

        public final String getCheckboxLoggingIdentifier() {
            return this.checkboxLoggingIdentifier;
        }

        public final UiGraphRedirect getCheckedGraphRedirect() {
            return this.checkedGraphRedirect;
        }

        public final UiGraphRedirect getUncheckedGraphRedirect() {
            return this.uncheckedGraphRedirect;
        }
    }

    /* compiled from: UiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$StringContent;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "maxLength", "", "placeholder", "", "graphDefaultRedirect", "Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "<init>", "(ILjava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;)V", "getMaxLength", "()I", "getPlaceholder", "()Ljava/lang/String;", "getGraphDefaultRedirect", "()Lcom/robinhood/android/questionnaire/ui/UiGraphRedirect;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StringContent implements UiQuestionContent {
        public static final Parcelable.Creator<StringContent> CREATOR = new Creator();
        private final UiGraphRedirect graphDefaultRedirect;
        private final int maxLength;
        private final String placeholder;

        /* compiled from: UiQuestionContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<StringContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringContent(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : UiGraphRedirect.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringContent[] newArray(int i) {
                return new StringContent[i];
            }
        }

        public static /* synthetic */ StringContent copy$default(StringContent stringContent, int i, String str, UiGraphRedirect uiGraphRedirect, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stringContent.maxLength;
            }
            if ((i2 & 2) != 0) {
                str = stringContent.placeholder;
            }
            if ((i2 & 4) != 0) {
                uiGraphRedirect = stringContent.graphDefaultRedirect;
            }
            return stringContent.copy(i, str, uiGraphRedirect);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxLength() {
            return this.maxLength;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final UiGraphRedirect getGraphDefaultRedirect() {
            return this.graphDefaultRedirect;
        }

        public final StringContent copy(int maxLength, String placeholder, UiGraphRedirect graphDefaultRedirect) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new StringContent(maxLength, placeholder, graphDefaultRedirect);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringContent)) {
                return false;
            }
            StringContent stringContent = (StringContent) other;
            return this.maxLength == stringContent.maxLength && Intrinsics.areEqual(this.placeholder, stringContent.placeholder) && Intrinsics.areEqual(this.graphDefaultRedirect, stringContent.graphDefaultRedirect);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.maxLength) * 31) + this.placeholder.hashCode()) * 31;
            UiGraphRedirect uiGraphRedirect = this.graphDefaultRedirect;
            return iHashCode + (uiGraphRedirect == null ? 0 : uiGraphRedirect.hashCode());
        }

        public String toString() {
            return "StringContent(maxLength=" + this.maxLength + ", placeholder=" + this.placeholder + ", graphDefaultRedirect=" + this.graphDefaultRedirect + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.maxLength);
            dest.writeString(this.placeholder);
            UiGraphRedirect uiGraphRedirect = this.graphDefaultRedirect;
            if (uiGraphRedirect == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiGraphRedirect.writeToParcel(dest, flags);
            }
        }

        public StringContent(int i, String placeholder, UiGraphRedirect uiGraphRedirect) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.maxLength = i;
            this.placeholder = placeholder;
            this.graphDefaultRedirect = uiGraphRedirect;
        }

        public final int getMaxLength() {
            return this.maxLength;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final UiGraphRedirect getGraphDefaultRedirect() {
            return this.graphDefaultRedirect;
        }
    }

    /* compiled from: UiQuestionContent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$Unsupported;", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Unsupported implements UiQuestionContent {
        public static final Unsupported INSTANCE = new Unsupported();
        public static final Parcelable.Creator<Unsupported> CREATOR = new Creator();

        /* compiled from: UiQuestionContent.kt */
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
            return 2141122923;
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
