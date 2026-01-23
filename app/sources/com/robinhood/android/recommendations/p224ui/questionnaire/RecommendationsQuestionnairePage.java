package com.robinhood.android.recommendations.p224ui.questionnaire;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsQuestionnairePage.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage;", "Landroid/os/Parcelable;", "<init>", "()V", "SectionCoverPage", "QuestionPage", "Companion", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$QuestionPage;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$SectionCoverPage;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class RecommendationsQuestionnairePage implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ RecommendationsQuestionnairePage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RecommendationsQuestionnairePage() {
    }

    /* compiled from: RecommendationsQuestionnairePage.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$SectionCoverPage;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage;", "title", "", "description", "continueButtonTitle", "loggingIdentifier", "disclosureInfo", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$DisclosureInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$DisclosureInfo;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getContinueButtonTitle", "getLoggingIdentifier", "getDisclosureInfo", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$DisclosureInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SectionCoverPage extends RecommendationsQuestionnairePage {
        public static final Parcelable.Creator<SectionCoverPage> CREATOR = new Creator();
        private final String continueButtonTitle;
        private final String description;
        private final UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo;
        private final String loggingIdentifier;
        private final String title;

        /* compiled from: RecommendationsQuestionnairePage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SectionCoverPage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SectionCoverPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionCoverPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UiRecommendationsQuestionnaire.DisclosureInfo) parcel.readParcelable(SectionCoverPage.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SectionCoverPage[] newArray(int i) {
                return new SectionCoverPage[i];
            }
        }

        public static /* synthetic */ SectionCoverPage copy$default(SectionCoverPage sectionCoverPage, String str, String str2, String str3, String str4, UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionCoverPage.title;
            }
            if ((i & 2) != 0) {
                str2 = sectionCoverPage.description;
            }
            if ((i & 4) != 0) {
                str3 = sectionCoverPage.continueButtonTitle;
            }
            if ((i & 8) != 0) {
                str4 = sectionCoverPage.loggingIdentifier;
            }
            if ((i & 16) != 0) {
                disclosureInfo = sectionCoverPage.disclosureInfo;
            }
            UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo2 = disclosureInfo;
            String str5 = str3;
            return sectionCoverPage.copy(str, str2, str5, str4, disclosureInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContinueButtonTitle() {
            return this.continueButtonTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        /* renamed from: component5, reason: from getter */
        public final UiRecommendationsQuestionnaire.DisclosureInfo getDisclosureInfo() {
            return this.disclosureInfo;
        }

        public final SectionCoverPage copy(String title, String description, String continueButtonTitle, String loggingIdentifier, UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(continueButtonTitle, "continueButtonTitle");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            return new SectionCoverPage(title, description, continueButtonTitle, loggingIdentifier, disclosureInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionCoverPage)) {
                return false;
            }
            SectionCoverPage sectionCoverPage = (SectionCoverPage) other;
            return Intrinsics.areEqual(this.title, sectionCoverPage.title) && Intrinsics.areEqual(this.description, sectionCoverPage.description) && Intrinsics.areEqual(this.continueButtonTitle, sectionCoverPage.continueButtonTitle) && Intrinsics.areEqual(this.loggingIdentifier, sectionCoverPage.loggingIdentifier) && Intrinsics.areEqual(this.disclosureInfo, sectionCoverPage.disclosureInfo);
        }

        public int hashCode() {
            int iHashCode = ((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.continueButtonTitle.hashCode()) * 31) + this.loggingIdentifier.hashCode()) * 31;
            UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo = this.disclosureInfo;
            return iHashCode + (disclosureInfo == null ? 0 : disclosureInfo.hashCode());
        }

        public String toString() {
            return "SectionCoverPage(title=" + this.title + ", description=" + this.description + ", continueButtonTitle=" + this.continueButtonTitle + ", loggingIdentifier=" + this.loggingIdentifier + ", disclosureInfo=" + this.disclosureInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeString(this.continueButtonTitle);
            dest.writeString(this.loggingIdentifier);
            dest.writeParcelable(this.disclosureInfo, flags);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getContinueButtonTitle() {
            return this.continueButtonTitle;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final UiRecommendationsQuestionnaire.DisclosureInfo getDisclosureInfo() {
            return this.disclosureInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionCoverPage(String title, String description, String continueButtonTitle, String loggingIdentifier, UiRecommendationsQuestionnaire.DisclosureInfo disclosureInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(continueButtonTitle, "continueButtonTitle");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            this.title = title;
            this.description = description;
            this.continueButtonTitle = continueButtonTitle;
            this.loggingIdentifier = loggingIdentifier;
            this.disclosureInfo = disclosureInfo;
        }
    }

    /* compiled from: RecommendationsQuestionnairePage.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$QuestionPage;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage;", "questionId", "Ljava/util/UUID;", "title", "", "subtitle", "allowedAnswers", "", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Answer;", "disclosureMarkdown", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getQuestionId", "()Ljava/util/UUID;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAllowedAnswers", "()Ljava/util/List;", "getDisclosureMarkdown", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionPage extends RecommendationsQuestionnairePage {
        public static final Parcelable.Creator<QuestionPage> CREATOR = new Creator();
        private final List<UiRecommendationsQuestionnaire.Answer> allowedAnswers;
        private final String disclosureMarkdown;
        private final UUID questionId;
        private final String subtitle;
        private final String title;

        /* compiled from: RecommendationsQuestionnairePage.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QuestionPage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(QuestionPage.class.getClassLoader()));
                }
                return new QuestionPage(uuid, string2, string3, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuestionPage[] newArray(int i) {
                return new QuestionPage[i];
            }
        }

        public static /* synthetic */ QuestionPage copy$default(QuestionPage questionPage, UUID uuid, String str, String str2, List list, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = questionPage.questionId;
            }
            if ((i & 2) != 0) {
                str = questionPage.title;
            }
            if ((i & 4) != 0) {
                str2 = questionPage.subtitle;
            }
            if ((i & 8) != 0) {
                list = questionPage.allowedAnswers;
            }
            if ((i & 16) != 0) {
                str3 = questionPage.disclosureMarkdown;
            }
            String str4 = str3;
            String str5 = str2;
            return questionPage.copy(uuid, str, str5, list, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getQuestionId() {
            return this.questionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<UiRecommendationsQuestionnaire.Answer> component4() {
            return this.allowedAnswers;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final QuestionPage copy(UUID questionId, String title, String subtitle, List<UiRecommendationsQuestionnaire.Answer> allowedAnswers, String disclosureMarkdown) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(allowedAnswers, "allowedAnswers");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new QuestionPage(questionId, title, subtitle, allowedAnswers, disclosureMarkdown);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionPage)) {
                return false;
            }
            QuestionPage questionPage = (QuestionPage) other;
            return Intrinsics.areEqual(this.questionId, questionPage.questionId) && Intrinsics.areEqual(this.title, questionPage.title) && Intrinsics.areEqual(this.subtitle, questionPage.subtitle) && Intrinsics.areEqual(this.allowedAnswers, questionPage.allowedAnswers) && Intrinsics.areEqual(this.disclosureMarkdown, questionPage.disclosureMarkdown);
        }

        public int hashCode() {
            int iHashCode = ((this.questionId.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.allowedAnswers.hashCode()) * 31) + this.disclosureMarkdown.hashCode();
        }

        public String toString() {
            return "QuestionPage(questionId=" + this.questionId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", allowedAnswers=" + this.allowedAnswers + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.questionId);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            List<UiRecommendationsQuestionnaire.Answer> list = this.allowedAnswers;
            dest.writeInt(list.size());
            Iterator<UiRecommendationsQuestionnaire.Answer> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.disclosureMarkdown);
        }

        public final UUID getQuestionId() {
            return this.questionId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<UiRecommendationsQuestionnaire.Answer> getAllowedAnswers() {
            return this.allowedAnswers;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuestionPage(UUID questionId, String title, String str, List<UiRecommendationsQuestionnaire.Answer> allowedAnswers, String disclosureMarkdown) {
            super(null);
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(allowedAnswers, "allowedAnswers");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.questionId = questionId;
            this.title = title;
            this.subtitle = str;
            this.allowedAnswers = allowedAnswers;
            this.disclosureMarkdown = disclosureMarkdown;
        }
    }

    /* compiled from: RecommendationsQuestionnairePage.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$SectionCoverPage;", "sectionCover", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$SectionCover;", "loggingIdentifier", "", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnairePage$QuestionPage;", "question", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Question;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SectionCoverPage from(UiRecommendationsQuestionnaire.SectionCover sectionCover, String loggingIdentifier) {
            Intrinsics.checkNotNullParameter(sectionCover, "sectionCover");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            return new SectionCoverPage(sectionCover.getTitle(), sectionCover.getDescriptionTitle(), sectionCover.getContinueButtonTitle(), loggingIdentifier, sectionCover.getDisclosureInfo());
        }

        public final QuestionPage from(UiRecommendationsQuestionnaire.Question question) {
            Intrinsics.checkNotNullParameter(question, "question");
            return new QuestionPage(question.getId(), question.getTitle(), question.getSubtitle(), question.getAllowedAnswers(), question.getDisclosureMarkdown());
        }
    }
}
