package com.robinhood.android.onboarding.directipo.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.parceler.HttpUrlParceler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: UiDirectIpoOnboarding.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003Ji\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001J\u0006\u0010/\u001a\u00020\u0005J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0005HÖ\u0001J\t\u00105\u001a\u00020\bHÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001b¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboarding;", "Landroid/os/Parcelable;", "introImageUrl", "Lokhttp3/HttpUrl;", "introForegroundColor", "", "introBackgroundColor", "title", "", "description", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "steps", "", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingStep;", "learnMore", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMore;", "viewAvailableIposUrl", "Landroid/net/Uri;", "viewAvailableIposButtonTitle", "<init>", "(Lokhttp3/HttpUrl;IILjava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMore;Landroid/net/Uri;Ljava/lang/String;)V", "getIntroImageUrl", "()Lokhttp3/HttpUrl;", "getIntroForegroundColor", "()I", "getIntroBackgroundColor", "getTitle", "()Ljava/lang/String;", "getDescription", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getSteps", "()Ljava/util/List;", "getLearnMore", "()Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMore;", "getViewAvailableIposUrl", "()Landroid/net/Uri;", "getViewAvailableIposButtonTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UiDirectIpoOnboarding implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDirectIpoOnboarding> CREATOR = new Creator();
    private final MarkdownContent description;
    private final int introBackgroundColor;
    private final int introForegroundColor;
    private final HttpUrl introImageUrl;
    private final UiDirectIpoOnboardingLearnMore learnMore;
    private final List<UiDirectIpoOnboardingStep> steps;
    private final String title;
    private final String viewAvailableIposButtonTitle;
    private final Uri viewAvailableIposUrl;

    /* compiled from: UiDirectIpoOnboarding.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDirectIpoOnboarding> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboarding createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HttpUrl httpUrlCreate = HttpUrlParceler.INSTANCE.create(parcel);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string2 = parcel.readString();
            MarkdownContent markdownContent = (MarkdownContent) parcel.readParcelable(UiDirectIpoOnboarding.class.getClassLoader());
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(UiDirectIpoOnboardingStep.CREATOR.createFromParcel(parcel));
            }
            return new UiDirectIpoOnboarding(httpUrlCreate, i, i2, string2, markdownContent, arrayList, UiDirectIpoOnboardingLearnMore.CREATOR.createFromParcel(parcel), (Uri) parcel.readParcelable(UiDirectIpoOnboarding.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboarding[] newArray(int i) {
            return new UiDirectIpoOnboarding[i];
        }
    }

    public static /* synthetic */ UiDirectIpoOnboarding copy$default(UiDirectIpoOnboarding uiDirectIpoOnboarding, HttpUrl httpUrl, int i, int i2, String str, MarkdownContent markdownContent, List list, UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore, Uri uri, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            httpUrl = uiDirectIpoOnboarding.introImageUrl;
        }
        if ((i3 & 2) != 0) {
            i = uiDirectIpoOnboarding.introForegroundColor;
        }
        if ((i3 & 4) != 0) {
            i2 = uiDirectIpoOnboarding.introBackgroundColor;
        }
        if ((i3 & 8) != 0) {
            str = uiDirectIpoOnboarding.title;
        }
        if ((i3 & 16) != 0) {
            markdownContent = uiDirectIpoOnboarding.description;
        }
        if ((i3 & 32) != 0) {
            list = uiDirectIpoOnboarding.steps;
        }
        if ((i3 & 64) != 0) {
            uiDirectIpoOnboardingLearnMore = uiDirectIpoOnboarding.learnMore;
        }
        if ((i3 & 128) != 0) {
            uri = uiDirectIpoOnboarding.viewAvailableIposUrl;
        }
        if ((i3 & 256) != 0) {
            str2 = uiDirectIpoOnboarding.viewAvailableIposButtonTitle;
        }
        Uri uri2 = uri;
        String str3 = str2;
        List list2 = list;
        UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore2 = uiDirectIpoOnboardingLearnMore;
        MarkdownContent markdownContent2 = markdownContent;
        int i4 = i2;
        return uiDirectIpoOnboarding.copy(httpUrl, i, i4, str, markdownContent2, list2, uiDirectIpoOnboardingLearnMore2, uri2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final HttpUrl getIntroImageUrl() {
        return this.introImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIntroForegroundColor() {
        return this.introForegroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIntroBackgroundColor() {
        return this.introBackgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final List<UiDirectIpoOnboardingStep> component6() {
        return this.steps;
    }

    /* renamed from: component7, reason: from getter */
    public final UiDirectIpoOnboardingLearnMore getLearnMore() {
        return this.learnMore;
    }

    /* renamed from: component8, reason: from getter */
    public final Uri getViewAvailableIposUrl() {
        return this.viewAvailableIposUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getViewAvailableIposButtonTitle() {
        return this.viewAvailableIposButtonTitle;
    }

    public final UiDirectIpoOnboarding copy(HttpUrl introImageUrl, int introForegroundColor, int introBackgroundColor, String title, MarkdownContent description, List<UiDirectIpoOnboardingStep> steps, UiDirectIpoOnboardingLearnMore learnMore, Uri viewAvailableIposUrl, String viewAvailableIposButtonTitle) {
        Intrinsics.checkNotNullParameter(introImageUrl, "introImageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        Intrinsics.checkNotNullParameter(viewAvailableIposUrl, "viewAvailableIposUrl");
        Intrinsics.checkNotNullParameter(viewAvailableIposButtonTitle, "viewAvailableIposButtonTitle");
        return new UiDirectIpoOnboarding(introImageUrl, introForegroundColor, introBackgroundColor, title, description, steps, learnMore, viewAvailableIposUrl, viewAvailableIposButtonTitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiDirectIpoOnboarding)) {
            return false;
        }
        UiDirectIpoOnboarding uiDirectIpoOnboarding = (UiDirectIpoOnboarding) other;
        return Intrinsics.areEqual(this.introImageUrl, uiDirectIpoOnboarding.introImageUrl) && this.introForegroundColor == uiDirectIpoOnboarding.introForegroundColor && this.introBackgroundColor == uiDirectIpoOnboarding.introBackgroundColor && Intrinsics.areEqual(this.title, uiDirectIpoOnboarding.title) && Intrinsics.areEqual(this.description, uiDirectIpoOnboarding.description) && Intrinsics.areEqual(this.steps, uiDirectIpoOnboarding.steps) && Intrinsics.areEqual(this.learnMore, uiDirectIpoOnboarding.learnMore) && Intrinsics.areEqual(this.viewAvailableIposUrl, uiDirectIpoOnboarding.viewAvailableIposUrl) && Intrinsics.areEqual(this.viewAvailableIposButtonTitle, uiDirectIpoOnboarding.viewAvailableIposButtonTitle);
    }

    public int hashCode() {
        return (((((((((((((((this.introImageUrl.hashCode() * 31) + Integer.hashCode(this.introForegroundColor)) * 31) + Integer.hashCode(this.introBackgroundColor)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.steps.hashCode()) * 31) + this.learnMore.hashCode()) * 31) + this.viewAvailableIposUrl.hashCode()) * 31) + this.viewAvailableIposButtonTitle.hashCode();
    }

    public String toString() {
        return "UiDirectIpoOnboarding(introImageUrl=" + this.introImageUrl + ", introForegroundColor=" + this.introForegroundColor + ", introBackgroundColor=" + this.introBackgroundColor + ", title=" + this.title + ", description=" + this.description + ", steps=" + this.steps + ", learnMore=" + this.learnMore + ", viewAvailableIposUrl=" + this.viewAvailableIposUrl + ", viewAvailableIposButtonTitle=" + this.viewAvailableIposButtonTitle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HttpUrlParceler.INSTANCE.write(this.introImageUrl, dest, flags);
        dest.writeInt(this.introForegroundColor);
        dest.writeInt(this.introBackgroundColor);
        dest.writeString(this.title);
        dest.writeParcelable(this.description, flags);
        List<UiDirectIpoOnboardingStep> list = this.steps;
        dest.writeInt(list.size());
        Iterator<UiDirectIpoOnboardingStep> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        this.learnMore.writeToParcel(dest, flags);
        dest.writeParcelable(this.viewAvailableIposUrl, flags);
        dest.writeString(this.viewAvailableIposButtonTitle);
    }

    public UiDirectIpoOnboarding(HttpUrl introImageUrl, int i, int i2, String title, MarkdownContent description, List<UiDirectIpoOnboardingStep> steps, UiDirectIpoOnboardingLearnMore learnMore, Uri viewAvailableIposUrl, String viewAvailableIposButtonTitle) {
        Intrinsics.checkNotNullParameter(introImageUrl, "introImageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(learnMore, "learnMore");
        Intrinsics.checkNotNullParameter(viewAvailableIposUrl, "viewAvailableIposUrl");
        Intrinsics.checkNotNullParameter(viewAvailableIposButtonTitle, "viewAvailableIposButtonTitle");
        this.introImageUrl = introImageUrl;
        this.introForegroundColor = i;
        this.introBackgroundColor = i2;
        this.title = title;
        this.description = description;
        this.steps = steps;
        this.learnMore = learnMore;
        this.viewAvailableIposUrl = viewAvailableIposUrl;
        this.viewAvailableIposButtonTitle = viewAvailableIposButtonTitle;
    }

    public final HttpUrl getIntroImageUrl() {
        return this.introImageUrl;
    }

    public final int getIntroForegroundColor() {
        return this.introForegroundColor;
    }

    public final int getIntroBackgroundColor() {
        return this.introBackgroundColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final List<UiDirectIpoOnboardingStep> getSteps() {
        return this.steps;
    }

    public final UiDirectIpoOnboardingLearnMore getLearnMore() {
        return this.learnMore;
    }

    public final Uri getViewAvailableIposUrl() {
        return this.viewAvailableIposUrl;
    }

    public final String getViewAvailableIposButtonTitle() {
        return this.viewAvailableIposButtonTitle;
    }
}
