package com.robinhood.android.onboarding.directipo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.parceler.HttpUrlParceler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: UiDirectIpoOnboardingStep.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingStep;", "Landroid/os/Parcelable;", "id", "", "title", "description", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "animationUrl", "Lokhttp3/HttpUrl;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lokhttp3/HttpUrl;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getAnimationUrl", "()Lokhttp3/HttpUrl;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UiDirectIpoOnboardingStep implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDirectIpoOnboardingStep> CREATOR = new Creator();
    private final HttpUrl animationUrl;
    private final MarkdownContent description;
    private final String id;
    private final String title;

    /* compiled from: UiDirectIpoOnboardingStep.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDirectIpoOnboardingStep> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboardingStep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiDirectIpoOnboardingStep(parcel.readString(), parcel.readString(), (MarkdownContent) parcel.readParcelable(UiDirectIpoOnboardingStep.class.getClassLoader()), HttpUrlParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboardingStep[] newArray(int i) {
            return new UiDirectIpoOnboardingStep[i];
        }
    }

    public static /* synthetic */ UiDirectIpoOnboardingStep copy$default(UiDirectIpoOnboardingStep uiDirectIpoOnboardingStep, String str, String str2, MarkdownContent markdownContent, HttpUrl httpUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiDirectIpoOnboardingStep.id;
        }
        if ((i & 2) != 0) {
            str2 = uiDirectIpoOnboardingStep.title;
        }
        if ((i & 4) != 0) {
            markdownContent = uiDirectIpoOnboardingStep.description;
        }
        if ((i & 8) != 0) {
            httpUrl = uiDirectIpoOnboardingStep.animationUrl;
        }
        return uiDirectIpoOnboardingStep.copy(str, str2, markdownContent, httpUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final MarkdownContent getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final HttpUrl getAnimationUrl() {
        return this.animationUrl;
    }

    public final UiDirectIpoOnboardingStep copy(String id, String title, MarkdownContent description, HttpUrl animationUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(animationUrl, "animationUrl");
        return new UiDirectIpoOnboardingStep(id, title, description, animationUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiDirectIpoOnboardingStep)) {
            return false;
        }
        UiDirectIpoOnboardingStep uiDirectIpoOnboardingStep = (UiDirectIpoOnboardingStep) other;
        return Intrinsics.areEqual(this.id, uiDirectIpoOnboardingStep.id) && Intrinsics.areEqual(this.title, uiDirectIpoOnboardingStep.title) && Intrinsics.areEqual(this.description, uiDirectIpoOnboardingStep.description) && Intrinsics.areEqual(this.animationUrl, uiDirectIpoOnboardingStep.animationUrl);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.animationUrl.hashCode();
    }

    public String toString() {
        return "UiDirectIpoOnboardingStep(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", animationUrl=" + this.animationUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeParcelable(this.description, flags);
        HttpUrlParceler.INSTANCE.write(this.animationUrl, dest, flags);
    }

    public UiDirectIpoOnboardingStep(String id, String title, MarkdownContent description, HttpUrl animationUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(animationUrl, "animationUrl");
        this.id = id;
        this.title = title;
        this.description = description;
        this.animationUrl = animationUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final HttpUrl getAnimationUrl() {
        return this.animationUrl;
    }
}
