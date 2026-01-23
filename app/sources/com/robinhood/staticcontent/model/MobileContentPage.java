package com.robinhood.staticcontent.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileContentPage.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0018\u00010\nHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f\u0018\u00010\u000bHÆ\u0003Jw\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f\u0018\u00010\u000bHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R%\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/MobileContentPage;", "Landroid/os/Parcelable;", "title", "", "subtitle", CarResultComposable2.BODY, "Lcom/robinhood/contentful/markdown/MarkdownContent;", "primaryCta", "secondaryCta", "pageFeatures", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/TitleAndBody;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/contentful/model/ResourceLink;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBody", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getPrimaryCta", "getSecondaryCta", "getPageFeatures", "()Ljava/util/List;", "getDisclosure", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class MobileContentPage implements Parcelable {
    public static final Parcelable.Creator<MobileContentPage> CREATOR = new Creator();
    private final MarkdownContent body;
    private final ResourceLink<EntryResource<Disclosure>> disclosure;
    private final List<ResourceLink<EntryResource<TitleAndBody>>> pageFeatures;
    private final String primaryCta;
    private final String secondaryCta;
    private final String subtitle;
    private final String title;

    /* compiled from: MobileContentPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<MobileContentPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileContentPage createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            MarkdownContent markdownContent = (MarkdownContent) parcel.readParcelable(MobileContentPage.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(MobileContentPage.class.getClassLoader()));
                }
            }
            return new MobileContentPage(string2, string3, markdownContent, string4, string5, arrayList, (ResourceLink) parcel.readParcelable(MobileContentPage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MobileContentPage[] newArray(int i) {
            return new MobileContentPage[i];
        }
    }

    public static /* synthetic */ MobileContentPage copy$default(MobileContentPage mobileContentPage, String str, String str2, MarkdownContent markdownContent, String str3, String str4, List list, ResourceLink resourceLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileContentPage.title;
        }
        if ((i & 2) != 0) {
            str2 = mobileContentPage.subtitle;
        }
        if ((i & 4) != 0) {
            markdownContent = mobileContentPage.body;
        }
        if ((i & 8) != 0) {
            str3 = mobileContentPage.primaryCta;
        }
        if ((i & 16) != 0) {
            str4 = mobileContentPage.secondaryCta;
        }
        if ((i & 32) != 0) {
            list = mobileContentPage.pageFeatures;
        }
        if ((i & 64) != 0) {
            resourceLink = mobileContentPage.disclosure;
        }
        List list2 = list;
        ResourceLink resourceLink2 = resourceLink;
        String str5 = str4;
        MarkdownContent markdownContent2 = markdownContent;
        return mobileContentPage.copy(str, str2, markdownContent2, str3, str5, list2, resourceLink2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final MarkdownContent getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    public final List<ResourceLink<EntryResource<TitleAndBody>>> component6() {
        return this.pageFeatures;
    }

    public final ResourceLink<EntryResource<Disclosure>> component7() {
        return this.disclosure;
    }

    public final MobileContentPage copy(String title, String subtitle, MarkdownContent body, @Json(name = "primaryCTA") String primaryCta, @Json(name = "secondaryCTA") String secondaryCta, List<ResourceLink<EntryResource<TitleAndBody>>> pageFeatures, ResourceLink<EntryResource<Disclosure>> disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        return new MobileContentPage(title, subtitle, body, primaryCta, secondaryCta, pageFeatures, disclosure);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileContentPage)) {
            return false;
        }
        MobileContentPage mobileContentPage = (MobileContentPage) other;
        return Intrinsics.areEqual(this.title, mobileContentPage.title) && Intrinsics.areEqual(this.subtitle, mobileContentPage.subtitle) && Intrinsics.areEqual(this.body, mobileContentPage.body) && Intrinsics.areEqual(this.primaryCta, mobileContentPage.primaryCta) && Intrinsics.areEqual(this.secondaryCta, mobileContentPage.secondaryCta) && Intrinsics.areEqual(this.pageFeatures, mobileContentPage.pageFeatures) && Intrinsics.areEqual(this.disclosure, mobileContentPage.disclosure);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MarkdownContent markdownContent = this.body;
        int iHashCode3 = (((iHashCode2 + (markdownContent == null ? 0 : markdownContent.hashCode())) * 31) + this.primaryCta.hashCode()) * 31;
        String str2 = this.secondaryCta;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ResourceLink<EntryResource<TitleAndBody>>> list = this.pageFeatures;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ResourceLink<EntryResource<Disclosure>> resourceLink = this.disclosure;
        return iHashCode5 + (resourceLink != null ? resourceLink.hashCode() : 0);
    }

    public String toString() {
        return "MobileContentPage(title=" + this.title + ", subtitle=" + this.subtitle + ", body=" + this.body + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", pageFeatures=" + this.pageFeatures + ", disclosure=" + this.disclosure + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeParcelable(this.body, flags);
        dest.writeString(this.primaryCta);
        dest.writeString(this.secondaryCta);
        List<ResourceLink<EntryResource<TitleAndBody>>> list = this.pageFeatures;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<ResourceLink<EntryResource<TitleAndBody>>> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeParcelable(this.disclosure, flags);
    }

    public MobileContentPage(String title, String str, MarkdownContent markdownContent, @Json(name = "primaryCTA") String primaryCta, @Json(name = "secondaryCTA") String str2, List<ResourceLink<EntryResource<TitleAndBody>>> list, ResourceLink<EntryResource<Disclosure>> resourceLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        this.title = title;
        this.subtitle = str;
        this.body = markdownContent;
        this.primaryCta = primaryCta;
        this.secondaryCta = str2;
        this.pageFeatures = list;
        this.disclosure = resourceLink;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final MarkdownContent getBody() {
        return this.body;
    }

    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    public final List<ResourceLink<EntryResource<TitleAndBody>>> getPageFeatures() {
        return this.pageFeatures;
    }

    public final ResourceLink<EntryResource<Disclosure>> getDisclosure() {
        return this.disclosure;
    }
}
