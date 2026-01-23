package com.robinhood.android.safetylabels.p247ui;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLessonSection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafetyLabelsLessonViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003J{\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonViewState;", "", "expandDisclosure", "", "showLoading", "showError", "showLesson", "delimiter", "", "lessonSections", "", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLessonSection;", "lessonIdentifier", "lessonTitle", "canAppendToggleText", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/contentful/markdown/MarkdownContent;", "<init>", "(ZZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/contentful/markdown/MarkdownContent;)V", "getExpandDisclosure", "()Z", "getShowLoading", "getShowError", "getShowLesson", "getDelimiter", "()Ljava/lang/String;", "getLessonSections", "()Ljava/util/List;", "getLessonIdentifier", "getLessonTitle", "getCanAppendToggleText", "getDisclosure", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SafetyLabelsLessonViewState {
    public static final int $stable = 8;
    private final boolean canAppendToggleText;
    private final String delimiter;
    private final MarkdownContent disclosure;
    private final boolean expandDisclosure;
    private final String lessonIdentifier;
    private final List<SafetyLabelsLessonSection> lessonSections;
    private final String lessonTitle;
    private final boolean showError;
    private final boolean showLesson;
    private final boolean showLoading;

    public static /* synthetic */ SafetyLabelsLessonViewState copy$default(SafetyLabelsLessonViewState safetyLabelsLessonViewState, boolean z, boolean z2, boolean z3, boolean z4, String str, List list, String str2, String str3, boolean z5, MarkdownContent markdownContent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = safetyLabelsLessonViewState.expandDisclosure;
        }
        if ((i & 2) != 0) {
            z2 = safetyLabelsLessonViewState.showLoading;
        }
        if ((i & 4) != 0) {
            z3 = safetyLabelsLessonViewState.showError;
        }
        if ((i & 8) != 0) {
            z4 = safetyLabelsLessonViewState.showLesson;
        }
        if ((i & 16) != 0) {
            str = safetyLabelsLessonViewState.delimiter;
        }
        if ((i & 32) != 0) {
            list = safetyLabelsLessonViewState.lessonSections;
        }
        if ((i & 64) != 0) {
            str2 = safetyLabelsLessonViewState.lessonIdentifier;
        }
        if ((i & 128) != 0) {
            str3 = safetyLabelsLessonViewState.lessonTitle;
        }
        if ((i & 256) != 0) {
            z5 = safetyLabelsLessonViewState.canAppendToggleText;
        }
        if ((i & 512) != 0) {
            markdownContent = safetyLabelsLessonViewState.disclosure;
        }
        boolean z6 = z5;
        MarkdownContent markdownContent2 = markdownContent;
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        List list2 = list;
        return safetyLabelsLessonViewState.copy(z, z2, z3, z4, str6, list2, str4, str5, z6, markdownContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    /* renamed from: component10, reason: from getter */
    public final MarkdownContent getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowLesson() {
        return this.showLesson;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDelimiter() {
        return this.delimiter;
    }

    public final List<SafetyLabelsLessonSection> component6() {
        return this.lessonSections;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLessonIdentifier() {
        return this.lessonIdentifier;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLessonTitle() {
        return this.lessonTitle;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCanAppendToggleText() {
        return this.canAppendToggleText;
    }

    public final SafetyLabelsLessonViewState copy(boolean expandDisclosure, boolean showLoading, boolean showError, boolean showLesson, String delimiter, List<? extends SafetyLabelsLessonSection> lessonSections, String lessonIdentifier, String lessonTitle, boolean canAppendToggleText, MarkdownContent disclosure) {
        Intrinsics.checkNotNullParameter(lessonSections, "lessonSections");
        return new SafetyLabelsLessonViewState(expandDisclosure, showLoading, showError, showLesson, delimiter, lessonSections, lessonIdentifier, lessonTitle, canAppendToggleText, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafetyLabelsLessonViewState)) {
            return false;
        }
        SafetyLabelsLessonViewState safetyLabelsLessonViewState = (SafetyLabelsLessonViewState) other;
        return this.expandDisclosure == safetyLabelsLessonViewState.expandDisclosure && this.showLoading == safetyLabelsLessonViewState.showLoading && this.showError == safetyLabelsLessonViewState.showError && this.showLesson == safetyLabelsLessonViewState.showLesson && Intrinsics.areEqual(this.delimiter, safetyLabelsLessonViewState.delimiter) && Intrinsics.areEqual(this.lessonSections, safetyLabelsLessonViewState.lessonSections) && Intrinsics.areEqual(this.lessonIdentifier, safetyLabelsLessonViewState.lessonIdentifier) && Intrinsics.areEqual(this.lessonTitle, safetyLabelsLessonViewState.lessonTitle) && this.canAppendToggleText == safetyLabelsLessonViewState.canAppendToggleText && Intrinsics.areEqual(this.disclosure, safetyLabelsLessonViewState.disclosure);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.expandDisclosure) * 31) + Boolean.hashCode(this.showLoading)) * 31) + Boolean.hashCode(this.showError)) * 31) + Boolean.hashCode(this.showLesson)) * 31;
        String str = this.delimiter;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.lessonSections.hashCode()) * 31;
        String str2 = this.lessonIdentifier;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lessonTitle;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.canAppendToggleText)) * 31;
        MarkdownContent markdownContent = this.disclosure;
        return iHashCode4 + (markdownContent != null ? markdownContent.hashCode() : 0);
    }

    public String toString() {
        return "SafetyLabelsLessonViewState(expandDisclosure=" + this.expandDisclosure + ", showLoading=" + this.showLoading + ", showError=" + this.showError + ", showLesson=" + this.showLesson + ", delimiter=" + this.delimiter + ", lessonSections=" + this.lessonSections + ", lessonIdentifier=" + this.lessonIdentifier + ", lessonTitle=" + this.lessonTitle + ", canAppendToggleText=" + this.canAppendToggleText + ", disclosure=" + this.disclosure + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafetyLabelsLessonViewState(boolean z, boolean z2, boolean z3, boolean z4, String str, List<? extends SafetyLabelsLessonSection> lessonSections, String str2, String str3, boolean z5, MarkdownContent markdownContent) {
        Intrinsics.checkNotNullParameter(lessonSections, "lessonSections");
        this.expandDisclosure = z;
        this.showLoading = z2;
        this.showError = z3;
        this.showLesson = z4;
        this.delimiter = str;
        this.lessonSections = lessonSections;
        this.lessonIdentifier = str2;
        this.lessonTitle = str3;
        this.canAppendToggleText = z5;
        this.disclosure = markdownContent;
    }

    public final boolean getExpandDisclosure() {
        return this.expandDisclosure;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final boolean getShowLesson() {
        return this.showLesson;
    }

    public final String getDelimiter() {
        return this.delimiter;
    }

    public final List<SafetyLabelsLessonSection> getLessonSections() {
        return this.lessonSections;
    }

    public final String getLessonIdentifier() {
        return this.lessonIdentifier;
    }

    public final String getLessonTitle() {
        return this.lessonTitle;
    }

    public final boolean getCanAppendToggleText() {
        return this.canAppendToggleText;
    }

    public final MarkdownContent getDisclosure() {
        return this.disclosure;
    }
}
