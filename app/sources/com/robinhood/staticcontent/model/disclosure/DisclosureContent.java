package com.robinhood.staticcontent.model.disclosure;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DisclosureContent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003JZ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\tJ\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006."}, m3636d2 = {"Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "Landroid/os/Parcelable;", "button", "", "title", "identifier", "content", "", "version", "", "isLink", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;ZLjava/lang/String;)V", "getButton", "()Ljava/lang/String;", "getTitle", "getIdentifier", "getContent", "()Ljava/lang/CharSequence;", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getAdditionalData", "equals", "other", "", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DisclosureContent implements Parcelable {
    public static final Parcelable.Creator<DisclosureContent> CREATOR = new Creator();
    private final String additionalData;
    private final String button;
    private final CharSequence content;
    private final String identifier;
    private final boolean isLink;
    private final String title;
    private final Integer version;

    /* compiled from: DisclosureContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DisclosureContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisclosureContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisclosureContent(parcel.readString(), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisclosureContent[] newArray(int i) {
            return new DisclosureContent[i];
        }
    }

    public static /* synthetic */ DisclosureContent copy$default(DisclosureContent disclosureContent, String str, String str2, String str3, CharSequence charSequence, Integer num, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disclosureContent.button;
        }
        if ((i & 2) != 0) {
            str2 = disclosureContent.title;
        }
        if ((i & 4) != 0) {
            str3 = disclosureContent.identifier;
        }
        if ((i & 8) != 0) {
            charSequence = disclosureContent.content;
        }
        if ((i & 16) != 0) {
            num = disclosureContent.version;
        }
        if ((i & 32) != 0) {
            z = disclosureContent.isLink;
        }
        if ((i & 64) != 0) {
            str4 = disclosureContent.additionalData;
        }
        boolean z2 = z;
        String str5 = str4;
        Integer num2 = num;
        String str6 = str3;
        return disclosureContent.copy(str, str2, str6, charSequence, num2, z2, str5);
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
    public final CharSequence getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLink() {
        return this.isLink;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final DisclosureContent copy(String button, String title, String identifier, CharSequence content, Integer version, boolean isLink, String additionalData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(content, "content");
        return new DisclosureContent(button, title, identifier, content, version, isLink, additionalData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        String str = this.button;
        String str2 = this.title;
        String str3 = this.identifier;
        CharSequence charSequence = this.content;
        return "DisclosureContent(button=" + str + ", title=" + str2 + ", identifier=" + str3 + ", content=" + ((Object) charSequence) + ", version=" + this.version + ", isLink=" + this.isLink + ", additionalData=" + this.additionalData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.button);
        dest.writeString(this.title);
        dest.writeString(this.identifier);
        TextUtils.writeToParcel(this.content, dest, flags);
        Integer num = this.version;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeInt(this.isLink ? 1 : 0);
        dest.writeString(this.additionalData);
    }

    public DisclosureContent(String str, String title, String identifier, CharSequence content, Integer num, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(content, "content");
        this.button = str;
        this.title = title;
        this.identifier = identifier;
        this.content = content;
        this.version = num;
        this.isLink = z;
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

    public final CharSequence getContent() {
        return this.content;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final boolean isLink() {
        return this.isLink;
    }

    public final String getAdditionalData() {
        return this.additionalData;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DisclosureContent)) {
            return false;
        }
        DisclosureContent disclosureContent = (DisclosureContent) other;
        return Intrinsics.areEqual(this.button, disclosureContent.button) && Intrinsics.areEqual(this.title, disclosureContent.title) && Intrinsics.areEqual(this.identifier, disclosureContent.identifier) && StringsKt.contentEquals(this.content, disclosureContent.content) && Intrinsics.areEqual(this.version, disclosureContent.version) && this.isLink == disclosureContent.isLink;
    }

    public int hashCode() {
        String str = this.button;
        int iHashCode = (((((((str != null ? str.hashCode() : 0) * 31) + this.title.hashCode()) * 31) + this.identifier.hashCode()) * 31) + this.content.toString().hashCode()) * 31;
        Integer num = this.version;
        return ((iHashCode + (num != null ? num.intValue() : 0)) * 31) + Boolean.hashCode(this.isLink);
    }
}
