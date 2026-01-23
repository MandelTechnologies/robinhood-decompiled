package com.robinhood.android.onboarding.directipo.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.parceler.HttpUrlParceler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: UiDirectIpoOnboardingLearnMoreAction.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMoreAction;", "Landroid/os/Parcelable;", "id", "", "iconUrl", "Lokhttp3/HttpUrl;", "title", "description", "actionUrl", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "getId", "()Ljava/lang/String;", "getIconUrl", "()Lokhttp3/HttpUrl;", "getTitle", "getDescription", "getActionUrl", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UiDirectIpoOnboardingLearnMoreAction implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDirectIpoOnboardingLearnMoreAction> CREATOR = new Creator();
    private final Uri actionUrl;
    private final String description;
    private final HttpUrl iconUrl;
    private final String id;
    private final String title;

    /* compiled from: UiDirectIpoOnboardingLearnMoreAction.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDirectIpoOnboardingLearnMoreAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboardingLearnMoreAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiDirectIpoOnboardingLearnMoreAction(parcel.readString(), HttpUrlParceler.INSTANCE.create(parcel), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(UiDirectIpoOnboardingLearnMoreAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboardingLearnMoreAction[] newArray(int i) {
            return new UiDirectIpoOnboardingLearnMoreAction[i];
        }
    }

    public static /* synthetic */ UiDirectIpoOnboardingLearnMoreAction copy$default(UiDirectIpoOnboardingLearnMoreAction uiDirectIpoOnboardingLearnMoreAction, String str, HttpUrl httpUrl, String str2, String str3, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiDirectIpoOnboardingLearnMoreAction.id;
        }
        if ((i & 2) != 0) {
            httpUrl = uiDirectIpoOnboardingLearnMoreAction.iconUrl;
        }
        if ((i & 4) != 0) {
            str2 = uiDirectIpoOnboardingLearnMoreAction.title;
        }
        if ((i & 8) != 0) {
            str3 = uiDirectIpoOnboardingLearnMoreAction.description;
        }
        if ((i & 16) != 0) {
            uri = uiDirectIpoOnboardingLearnMoreAction.actionUrl;
        }
        Uri uri2 = uri;
        String str4 = str2;
        return uiDirectIpoOnboardingLearnMoreAction.copy(str, httpUrl, str4, str3, uri2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpUrl getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final Uri getActionUrl() {
        return this.actionUrl;
    }

    public final UiDirectIpoOnboardingLearnMoreAction copy(String id, HttpUrl iconUrl, String title, String description, Uri actionUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        return new UiDirectIpoOnboardingLearnMoreAction(id, iconUrl, title, description, actionUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiDirectIpoOnboardingLearnMoreAction)) {
            return false;
        }
        UiDirectIpoOnboardingLearnMoreAction uiDirectIpoOnboardingLearnMoreAction = (UiDirectIpoOnboardingLearnMoreAction) other;
        return Intrinsics.areEqual(this.id, uiDirectIpoOnboardingLearnMoreAction.id) && Intrinsics.areEqual(this.iconUrl, uiDirectIpoOnboardingLearnMoreAction.iconUrl) && Intrinsics.areEqual(this.title, uiDirectIpoOnboardingLearnMoreAction.title) && Intrinsics.areEqual(this.description, uiDirectIpoOnboardingLearnMoreAction.description) && Intrinsics.areEqual(this.actionUrl, uiDirectIpoOnboardingLearnMoreAction.actionUrl);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.actionUrl.hashCode();
    }

    public String toString() {
        return "UiDirectIpoOnboardingLearnMoreAction(id=" + this.id + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", description=" + this.description + ", actionUrl=" + this.actionUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        HttpUrlParceler.INSTANCE.write(this.iconUrl, dest, flags);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeParcelable(this.actionUrl, flags);
    }

    public UiDirectIpoOnboardingLearnMoreAction(String id, HttpUrl iconUrl, String title, String description, Uri actionUrl) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        this.id = id;
        this.iconUrl = iconUrl;
        this.title = title;
        this.description = description;
        this.actionUrl = actionUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final HttpUrl getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Uri getActionUrl() {
        return this.actionUrl;
    }
}
