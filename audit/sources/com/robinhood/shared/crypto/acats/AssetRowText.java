package com.robinhood.shared.crypto.acats;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsDestinations.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/AssetRowText;", "Landroid/os/Parcelable;", "primaryText", "", "metaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryText", "()Ljava/lang/String;", "getMetaText", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AssetRowText implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AssetRowText> CREATOR = new Creator();
    private final String metaText;
    private final String primaryText;

    /* compiled from: CryptoAcatsDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetRowText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetRowText createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetRowText(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetRowText[] newArray(int i) {
            return new AssetRowText[i];
        }
    }

    public static /* synthetic */ AssetRowText copy$default(AssetRowText assetRowText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetRowText.primaryText;
        }
        if ((i & 2) != 0) {
            str2 = assetRowText.metaText;
        }
        return assetRowText.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetaText() {
        return this.metaText;
    }

    public final AssetRowText copy(String primaryText, String metaText) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        return new AssetRowText(primaryText, metaText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetRowText)) {
            return false;
        }
        AssetRowText assetRowText = (AssetRowText) other;
        return Intrinsics.areEqual(this.primaryText, assetRowText.primaryText) && Intrinsics.areEqual(this.metaText, assetRowText.metaText);
    }

    public int hashCode() {
        return (this.primaryText.hashCode() * 31) + this.metaText.hashCode();
    }

    public String toString() {
        return "AssetRowText(primaryText=" + this.primaryText + ", metaText=" + this.metaText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.primaryText);
        dest.writeString(this.metaText);
    }

    public AssetRowText(String primaryText, String metaText) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(metaText, "metaText");
        this.primaryText = primaryText;
        this.metaText = metaText;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getMetaText() {
        return this.metaText;
    }
}
