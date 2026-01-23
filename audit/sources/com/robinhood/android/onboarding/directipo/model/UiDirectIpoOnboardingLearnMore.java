package com.robinhood.android.onboarding.directipo.model;

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

/* compiled from: UiDirectIpoOnboardingLearnMore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMore;", "Landroid/os/Parcelable;", "iconUrl", "Lokhttp3/HttpUrl;", "title", "", "description", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "actions", "", "Lcom/robinhood/android/onboarding/directipo/model/UiDirectIpoOnboardingLearnMoreAction;", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;)V", "getIconUrl", "()Lokhttp3/HttpUrl;", "getTitle", "()Ljava/lang/String;", "getDescription", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-direct-ipo-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UiDirectIpoOnboardingLearnMore implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDirectIpoOnboardingLearnMore> CREATOR = new Creator();
    private final List<UiDirectIpoOnboardingLearnMoreAction> actions;
    private final MarkdownContent description;
    private final HttpUrl iconUrl;
    private final String title;

    /* compiled from: UiDirectIpoOnboardingLearnMore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDirectIpoOnboardingLearnMore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboardingLearnMore createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            HttpUrl httpUrlCreate = HttpUrlParceler.INSTANCE.create(parcel);
            String string2 = parcel.readString();
            MarkdownContent markdownContent = (MarkdownContent) parcel.readParcelable(UiDirectIpoOnboardingLearnMore.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UiDirectIpoOnboardingLearnMoreAction.CREATOR.createFromParcel(parcel));
            }
            return new UiDirectIpoOnboardingLearnMore(httpUrlCreate, string2, markdownContent, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDirectIpoOnboardingLearnMore[] newArray(int i) {
            return new UiDirectIpoOnboardingLearnMore[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiDirectIpoOnboardingLearnMore copy$default(UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore, HttpUrl httpUrl, String str, MarkdownContent markdownContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            httpUrl = uiDirectIpoOnboardingLearnMore.iconUrl;
        }
        if ((i & 2) != 0) {
            str = uiDirectIpoOnboardingLearnMore.title;
        }
        if ((i & 4) != 0) {
            markdownContent = uiDirectIpoOnboardingLearnMore.description;
        }
        if ((i & 8) != 0) {
            list = uiDirectIpoOnboardingLearnMore.actions;
        }
        return uiDirectIpoOnboardingLearnMore.copy(httpUrl, str, markdownContent, list);
    }

    /* renamed from: component1, reason: from getter */
    public final HttpUrl getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final List<UiDirectIpoOnboardingLearnMoreAction> component4() {
        return this.actions;
    }

    public final UiDirectIpoOnboardingLearnMore copy(HttpUrl iconUrl, String title, MarkdownContent description, List<UiDirectIpoOnboardingLearnMoreAction> actions) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new UiDirectIpoOnboardingLearnMore(iconUrl, title, description, actions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiDirectIpoOnboardingLearnMore)) {
            return false;
        }
        UiDirectIpoOnboardingLearnMore uiDirectIpoOnboardingLearnMore = (UiDirectIpoOnboardingLearnMore) other;
        return Intrinsics.areEqual(this.iconUrl, uiDirectIpoOnboardingLearnMore.iconUrl) && Intrinsics.areEqual(this.title, uiDirectIpoOnboardingLearnMore.title) && Intrinsics.areEqual(this.description, uiDirectIpoOnboardingLearnMore.description) && Intrinsics.areEqual(this.actions, uiDirectIpoOnboardingLearnMore.actions);
    }

    public int hashCode() {
        return (((((this.iconUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.actions.hashCode();
    }

    public String toString() {
        return "UiDirectIpoOnboardingLearnMore(iconUrl=" + this.iconUrl + ", title=" + this.title + ", description=" + this.description + ", actions=" + this.actions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        HttpUrlParceler.INSTANCE.write(this.iconUrl, dest, flags);
        dest.writeString(this.title);
        dest.writeParcelable(this.description, flags);
        List<UiDirectIpoOnboardingLearnMoreAction> list = this.actions;
        dest.writeInt(list.size());
        Iterator<UiDirectIpoOnboardingLearnMoreAction> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public UiDirectIpoOnboardingLearnMore(HttpUrl iconUrl, String title, MarkdownContent description, List<UiDirectIpoOnboardingLearnMoreAction> actions) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.iconUrl = iconUrl;
        this.title = title;
        this.description = description;
        this.actions = actions;
    }

    public final HttpUrl getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getDescription() {
        return this.description;
    }

    public final List<UiDirectIpoOnboardingLearnMoreAction> getActions() {
        return this.actions;
    }
}
