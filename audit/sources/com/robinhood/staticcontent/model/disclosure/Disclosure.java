package com.robinhood.staticcontent.model.disclosure;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.staticcontent.util.Markwons;
import com.squareup.moshi.JsonClass;
import io.noties.markwon.Markwon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Disclosure.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\\\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\tJ\u0013\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\n\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u00065"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "Landroid/os/Parcelable;", "button", "", "title", "identifier", "content", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "version", "", "is_link", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getButton", "()Ljava/lang/String;", "getTitle", "getIdentifier", "getContent", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAdditionalData", "toDisclosureContent", "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "markwon", "Lio/noties/markwon/Markwon;", "formatArguments", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "describeContents", "equals", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class Disclosure implements Parcelable {
    public static final Parcelable.Creator<Disclosure> CREATOR = new Creator();
    private final String additionalData;
    private final String button;
    private final MarkdownContent content;
    private final String identifier;
    private final Boolean is_link;
    private final String title;
    private final Integer version;

    /* compiled from: Disclosure.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<Disclosure> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Disclosure createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            MarkdownContent markdownContent = (MarkdownContent) parcel.readParcelable(Disclosure.class.getClassLoader());
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Disclosure(string2, string3, string4, markdownContent, numValueOf, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Disclosure[] newArray(int i) {
            return new Disclosure[i];
        }
    }

    public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, String str, String str2, String str3, MarkdownContent markdownContent, Integer num, Boolean bool, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disclosure.button;
        }
        if ((i & 2) != 0) {
            str2 = disclosure.title;
        }
        if ((i & 4) != 0) {
            str3 = disclosure.identifier;
        }
        if ((i & 8) != 0) {
            markdownContent = disclosure.content;
        }
        if ((i & 16) != 0) {
            num = disclosure.version;
        }
        if ((i & 32) != 0) {
            bool = disclosure.is_link;
        }
        if ((i & 64) != 0) {
            str4 = disclosure.additionalData;
        }
        Boolean bool2 = bool;
        String str5 = str4;
        Integer num2 = num;
        String str6 = str3;
        return disclosure.copy(str, str2, str6, markdownContent, num2, bool2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component4, reason: from getter */
    public final MarkdownContent getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIs_link() {
        return this.is_link;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final Disclosure copy(String button, String title, String identifier, MarkdownContent content, Integer version, Boolean is_link, String additionalData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(content, "content");
        return new Disclosure(button, title, identifier, content, version, is_link, additionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Disclosure)) {
            return false;
        }
        Disclosure disclosure = (Disclosure) other;
        return Intrinsics.areEqual(this.button, disclosure.button) && Intrinsics.areEqual(this.title, disclosure.title) && Intrinsics.areEqual(this.identifier, disclosure.identifier) && Intrinsics.areEqual(this.content, disclosure.content) && Intrinsics.areEqual(this.version, disclosure.version) && Intrinsics.areEqual(this.is_link, disclosure.is_link) && Intrinsics.areEqual(this.additionalData, disclosure.additionalData);
    }

    public int hashCode() {
        String str = this.button;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + this.identifier.hashCode()) * 31) + this.content.hashCode()) * 31;
        Integer num = this.version;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.is_link;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.additionalData;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Disclosure(button=" + this.button + ", title=" + this.title + ", identifier=" + this.identifier + ", content=" + this.content + ", version=" + this.version + ", is_link=" + this.is_link + ", additionalData=" + this.additionalData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.button);
        dest.writeString(this.title);
        dest.writeString(this.identifier);
        dest.writeParcelable(this.content, flags);
        Integer num = this.version;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Boolean bool = this.is_link;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.additionalData);
    }

    public Disclosure(String str, String title, String identifier, MarkdownContent content, Integer num, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(content, "content");
        this.button = str;
        this.title = title;
        this.identifier = identifier;
        this.content = content;
        this.version = num;
        this.is_link = bool;
        this.additionalData = str2;
    }

    public final String getButton() {
        return this.button;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final MarkdownContent getContent() {
        return this.content;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final Boolean is_link() {
        return this.is_link;
    }

    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final DisclosureContent toDisclosureContent(Markwon markwon, Map<String, ? extends Object> formatArguments) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        return new DisclosureContent(this.button, this.title, this.identifier, Markwons.toSpanned(markwon, this.content, formatArguments), this.version, Intrinsics.areEqual(this.is_link, Boolean.TRUE), this.additionalData);
    }
}
