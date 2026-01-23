package com.robinhood.shared.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtherMarkdownFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "contentfulId", "", "overrideToolbarTitle", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;)V", "getContentfulId", "()Ljava/lang/String;", "getOverrideToolbarTitle", "getPrimaryButton", "()Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PrimaryButton", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class OtherMarkdownFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<OtherMarkdownFragmentKey> CREATOR = new Creator();
    private final String contentfulId;
    private final String overrideToolbarTitle;
    private final PrimaryButton primaryButton;

    /* compiled from: OtherMarkdownFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<OtherMarkdownFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtherMarkdownFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtherMarkdownFragmentKey(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PrimaryButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtherMarkdownFragmentKey[] newArray(int i) {
            return new OtherMarkdownFragmentKey[i];
        }
    }

    public static /* synthetic */ OtherMarkdownFragmentKey copy$default(OtherMarkdownFragmentKey otherMarkdownFragmentKey, String str, String str2, PrimaryButton primaryButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otherMarkdownFragmentKey.contentfulId;
        }
        if ((i & 2) != 0) {
            str2 = otherMarkdownFragmentKey.overrideToolbarTitle;
        }
        if ((i & 4) != 0) {
            primaryButton = otherMarkdownFragmentKey.primaryButton;
        }
        return otherMarkdownFragmentKey.copy(str, str2, primaryButton);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentfulId() {
        return this.contentfulId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOverrideToolbarTitle() {
        return this.overrideToolbarTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }

    public final OtherMarkdownFragmentKey copy(String contentfulId, String overrideToolbarTitle, PrimaryButton primaryButton) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        return new OtherMarkdownFragmentKey(contentfulId, overrideToolbarTitle, primaryButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherMarkdownFragmentKey)) {
            return false;
        }
        OtherMarkdownFragmentKey otherMarkdownFragmentKey = (OtherMarkdownFragmentKey) other;
        return Intrinsics.areEqual(this.contentfulId, otherMarkdownFragmentKey.contentfulId) && Intrinsics.areEqual(this.overrideToolbarTitle, otherMarkdownFragmentKey.overrideToolbarTitle) && Intrinsics.areEqual(this.primaryButton, otherMarkdownFragmentKey.primaryButton);
    }

    public int hashCode() {
        int iHashCode = this.contentfulId.hashCode() * 31;
        String str = this.overrideToolbarTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PrimaryButton primaryButton = this.primaryButton;
        return iHashCode2 + (primaryButton != null ? primaryButton.hashCode() : 0);
    }

    public String toString() {
        return "OtherMarkdownFragmentKey(contentfulId=" + this.contentfulId + ", overrideToolbarTitle=" + this.overrideToolbarTitle + ", primaryButton=" + this.primaryButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contentfulId);
        dest.writeString(this.overrideToolbarTitle);
        PrimaryButton primaryButton = this.primaryButton;
        if (primaryButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            primaryButton.writeToParcel(dest, flags);
        }
    }

    public OtherMarkdownFragmentKey(String contentfulId, String str, PrimaryButton primaryButton) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        this.contentfulId = contentfulId;
        this.overrideToolbarTitle = str;
        this.primaryButton = primaryButton;
    }

    public /* synthetic */ OtherMarkdownFragmentKey(String str, String str2, PrimaryButton primaryButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : primaryButton);
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }

    public final String getOverrideToolbarTitle() {
        return this.overrideToolbarTitle;
    }

    public final PrimaryButton getPrimaryButton() {
        return this.primaryButton;
    }

    /* compiled from: OtherMarkdownFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/OtherMarkdownFragmentKey$PrimaryButton;", "Landroid/os/Parcelable;", "text", "", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getLink", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final /* data */ class PrimaryButton implements Parcelable {
        public static final Parcelable.Creator<PrimaryButton> CREATOR = new Creator();
        private final String link;
        private final String text;

        /* compiled from: OtherMarkdownFragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<PrimaryButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButton(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton[] newArray(int i) {
                return new PrimaryButton[i];
            }
        }

        public static /* synthetic */ PrimaryButton copy$default(PrimaryButton primaryButton, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = primaryButton.text;
            }
            if ((i & 2) != 0) {
                str2 = primaryButton.link;
            }
            return primaryButton.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        public final PrimaryButton copy(String text, String link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            return new PrimaryButton(text, link);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButton)) {
                return false;
            }
            PrimaryButton primaryButton = (PrimaryButton) other;
            return Intrinsics.areEqual(this.text, primaryButton.text) && Intrinsics.areEqual(this.link, primaryButton.link);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.link.hashCode();
        }

        public String toString() {
            return "PrimaryButton(text=" + this.text + ", link=" + this.link + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeString(this.link);
        }

        public PrimaryButton(String text, String link) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(link, "link");
            this.text = text;
            this.link = link;
        }

        public final String getText() {
            return this.text;
        }

        public final String getLink() {
            return this.link;
        }
    }
}
