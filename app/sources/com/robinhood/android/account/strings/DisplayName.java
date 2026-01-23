package com.robinhood.android.account.strings;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountDisplayNames.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/account/strings/DisplayName;", "Landroid/os/Parcelable;", "nickname", "", "short", "Lcom/robinhood/android/account/strings/DisplayName$Variants;", "withAccount", "withInvesting", "headline", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/account/strings/DisplayName$Variants;Lcom/robinhood/android/account/strings/DisplayName$Variants;Lcom/robinhood/android/account/strings/DisplayName$Variants;Lcom/robinhood/utils/resource/StringResource;)V", "getNickname", "()Ljava/lang/String;", "getShort", "()Lcom/robinhood/android/account/strings/DisplayName$Variants;", "getWithAccount", "getWithInvesting", "getHeadline", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Variants", "lib-account-strings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class DisplayName implements Parcelable {
    public static final int $stable = StringResource.$stable;
    public static final Parcelable.Creator<DisplayName> CREATOR = new Creator();
    private final StringResource headline;
    private final String nickname;
    private final Variants short;
    private final Variants withAccount;
    private final Variants withInvesting;

    /* compiled from: AccountDisplayNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DisplayName> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayName createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            Parcelable.Creator<Variants> creator = Variants.CREATOR;
            return new DisplayName(string2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), (StringResource) parcel.readParcelable(DisplayName.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayName[] newArray(int i) {
            return new DisplayName[i];
        }
    }

    public static /* synthetic */ DisplayName copy$default(DisplayName displayName, String str, Variants variants, Variants variants2, Variants variants3, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayName.nickname;
        }
        if ((i & 2) != 0) {
            variants = displayName.short;
        }
        if ((i & 4) != 0) {
            variants2 = displayName.withAccount;
        }
        if ((i & 8) != 0) {
            variants3 = displayName.withInvesting;
        }
        if ((i & 16) != 0) {
            stringResource = displayName.headline;
        }
        StringResource stringResource2 = stringResource;
        Variants variants4 = variants2;
        return displayName.copy(str, variants, variants4, variants3, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component2, reason: from getter */
    public final Variants getShort() {
        return this.short;
    }

    /* renamed from: component3, reason: from getter */
    public final Variants getWithAccount() {
        return this.withAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final Variants getWithInvesting() {
        return this.withInvesting;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getHeadline() {
        return this.headline;
    }

    public final DisplayName copy(String nickname, Variants variants, Variants withAccount, Variants withInvesting, StringResource headline) {
        Intrinsics.checkNotNullParameter(variants, "short");
        Intrinsics.checkNotNullParameter(withAccount, "withAccount");
        Intrinsics.checkNotNullParameter(withInvesting, "withInvesting");
        Intrinsics.checkNotNullParameter(headline, "headline");
        return new DisplayName(nickname, variants, withAccount, withInvesting, headline);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayName)) {
            return false;
        }
        DisplayName displayName = (DisplayName) other;
        return Intrinsics.areEqual(this.nickname, displayName.nickname) && Intrinsics.areEqual(this.short, displayName.short) && Intrinsics.areEqual(this.withAccount, displayName.withAccount) && Intrinsics.areEqual(this.withInvesting, displayName.withInvesting) && Intrinsics.areEqual(this.headline, displayName.headline);
    }

    public int hashCode() {
        String str = this.nickname;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.short.hashCode()) * 31) + this.withAccount.hashCode()) * 31) + this.withInvesting.hashCode()) * 31) + this.headline.hashCode();
    }

    public String toString() {
        return "DisplayName(nickname=" + this.nickname + ", short=" + this.short + ", withAccount=" + this.withAccount + ", withInvesting=" + this.withInvesting + ", headline=" + this.headline + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.nickname);
        this.short.writeToParcel(dest, flags);
        this.withAccount.writeToParcel(dest, flags);
        this.withInvesting.writeToParcel(dest, flags);
        dest.writeParcelable(this.headline, flags);
    }

    public DisplayName(String str, Variants variants, Variants withAccount, Variants withInvesting, StringResource headline) {
        Intrinsics.checkNotNullParameter(variants, "short");
        Intrinsics.checkNotNullParameter(withAccount, "withAccount");
        Intrinsics.checkNotNullParameter(withInvesting, "withInvesting");
        Intrinsics.checkNotNullParameter(headline, "headline");
        this.nickname = str;
        this.short = variants;
        this.withAccount = withAccount;
        this.withInvesting = withInvesting;
        this.headline = headline;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final Variants getShort() {
        return this.short;
    }

    public final Variants getWithAccount() {
        return this.withAccount;
    }

    public final Variants getWithInvesting() {
        return this.withInvesting;
    }

    public final StringResource getHeadline() {
        return this.headline;
    }

    /* compiled from: AccountDisplayNames.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/account/strings/DisplayName$Variants;", "Landroid/os/Parcelable;", "title", "Lcom/robinhood/utils/resource/StringResource;", "inSentence", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getInSentence", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-account-strings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Variants implements Parcelable {
        public static final int $stable = StringResource.$stable;
        public static final Parcelable.Creator<Variants> CREATOR = new Creator();
        private final StringResource inSentence;
        private final StringResource title;

        /* compiled from: AccountDisplayNames.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Variants> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Variants createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Variants((StringResource) parcel.readParcelable(Variants.class.getClassLoader()), (StringResource) parcel.readParcelable(Variants.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Variants[] newArray(int i) {
                return new Variants[i];
            }
        }

        public static /* synthetic */ Variants copy$default(Variants variants, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = variants.title;
            }
            if ((i & 2) != 0) {
                stringResource2 = variants.inSentence;
            }
            return variants.copy(stringResource, stringResource2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getInSentence() {
            return this.inSentence;
        }

        public final Variants copy(StringResource title, StringResource inSentence) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inSentence, "inSentence");
            return new Variants(title, inSentence);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variants)) {
                return false;
            }
            Variants variants = (Variants) other;
            return Intrinsics.areEqual(this.title, variants.title) && Intrinsics.areEqual(this.inSentence, variants.inSentence);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.inSentence.hashCode();
        }

        public String toString() {
            return "Variants(title=" + this.title + ", inSentence=" + this.inSentence + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.title, flags);
            dest.writeParcelable(this.inSentence, flags);
        }

        public Variants(StringResource title, StringResource inSentence) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inSentence, "inSentence");
            this.title = title;
            this.inSentence = inSentence;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getInSentence() {
            return this.inSentence;
        }
    }
}
