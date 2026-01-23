package com.robinhood.shared.account.contracts.switcher;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherDeeplinkCta.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherDeeplinkCta;", "Landroid/os/Parcelable;", "uri", "", "primaryText", "loggingIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "getPrimaryText", "getLoggingIdentifier", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountSwitcherDeeplinkCta implements Parcelable {
    public static final Parcelable.Creator<AccountSwitcherDeeplinkCta> CREATOR = new Creator();
    private final String loggingIdentifier;
    private final String primaryText;
    private final String uri;

    /* compiled from: AccountSwitcherDeeplinkCta.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSwitcherDeeplinkCta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherDeeplinkCta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountSwitcherDeeplinkCta(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSwitcherDeeplinkCta[] newArray(int i) {
            return new AccountSwitcherDeeplinkCta[i];
        }
    }

    public static /* synthetic */ AccountSwitcherDeeplinkCta copy$default(AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountSwitcherDeeplinkCta.uri;
        }
        if ((i & 2) != 0) {
            str2 = accountSwitcherDeeplinkCta.primaryText;
        }
        if ((i & 4) != 0) {
            str3 = accountSwitcherDeeplinkCta.loggingIdentifier;
        }
        return accountSwitcherDeeplinkCta.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final AccountSwitcherDeeplinkCta copy(String uri, String primaryText, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new AccountSwitcherDeeplinkCta(uri, primaryText, loggingIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSwitcherDeeplinkCta)) {
            return false;
        }
        AccountSwitcherDeeplinkCta accountSwitcherDeeplinkCta = (AccountSwitcherDeeplinkCta) other;
        return Intrinsics.areEqual(this.uri, accountSwitcherDeeplinkCta.uri) && Intrinsics.areEqual(this.primaryText, accountSwitcherDeeplinkCta.primaryText) && Intrinsics.areEqual(this.loggingIdentifier, accountSwitcherDeeplinkCta.loggingIdentifier);
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.loggingIdentifier.hashCode();
    }

    public String toString() {
        return "AccountSwitcherDeeplinkCta(uri=" + this.uri + ", primaryText=" + this.primaryText + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.uri);
        dest.writeString(this.primaryText);
        dest.writeString(this.loggingIdentifier);
    }

    public AccountSwitcherDeeplinkCta(String uri, String primaryText, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.uri = uri;
        this.primaryText = primaryText;
        this.loggingIdentifier = loggingIdentifier;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }
}
