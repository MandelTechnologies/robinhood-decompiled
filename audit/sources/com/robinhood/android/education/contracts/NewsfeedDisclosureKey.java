package com.robinhood.android.education.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsfeedDisclosureKey.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "contentfulId", "", "<init>", "(Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NewsfeedDisclosureKey implements FragmentKey {
    public static final String DEFAULT_NEWSFEED_DISCLOSURE_CONTENTFUL_ID = "54hpAhcLX86cSJYdQ0nS3Y";
    public static final String NEWSFEED_DISCLOSURE_GB_CONTENTFUL_ID = "1PwG7jLVM1DBVXtO0T7g3p";
    public static final String NEWSFEED_DISCLOSURE_US_CONTENTFUL_ID = "54hpAhcLX86cSJYdQ0nS3Y";
    private final String contentfulId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<NewsfeedDisclosureKey> CREATOR = new Creator();

    /* compiled from: NewsfeedDisclosureKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<NewsfeedDisclosureKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDisclosureKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewsfeedDisclosureKey(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDisclosureKey[] newArray(int i) {
            return new NewsfeedDisclosureKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedDisclosureKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NewsfeedDisclosureKey copy$default(NewsfeedDisclosureKey newsfeedDisclosureKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedDisclosureKey.contentfulId;
        }
        return newsfeedDisclosureKey.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentfulId() {
        return this.contentfulId;
    }

    public final NewsfeedDisclosureKey copy(String contentfulId) {
        return new NewsfeedDisclosureKey(contentfulId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NewsfeedDisclosureKey) && Intrinsics.areEqual(this.contentfulId, ((NewsfeedDisclosureKey) other).contentfulId);
    }

    public int hashCode() {
        String str = this.contentfulId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "NewsfeedDisclosureKey(contentfulId=" + this.contentfulId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contentfulId);
    }

    public NewsfeedDisclosureKey(String str) {
        this.contentfulId = str;
    }

    public /* synthetic */ NewsfeedDisclosureKey(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }

    /* compiled from: NewsfeedDisclosureKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey$Companion;", "", "<init>", "()V", "defaultForUs", "Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "defaultForGb", "NEWSFEED_DISCLOSURE_US_CONTENTFUL_ID", "", "NEWSFEED_DISCLOSURE_GB_CONTENTFUL_ID", "DEFAULT_NEWSFEED_DISCLOSURE_CONTENTFUL_ID", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NewsfeedDisclosureKey defaultForUs() {
            return new NewsfeedDisclosureKey("54hpAhcLX86cSJYdQ0nS3Y");
        }

        public final NewsfeedDisclosureKey defaultForGb() {
            return new NewsfeedDisclosureKey(NewsfeedDisclosureKey.NEWSFEED_DISCLOSURE_GB_CONTENTFUL_ID);
        }
    }
}
