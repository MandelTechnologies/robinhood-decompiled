package com.robinhood.shared.documents.lib.docupload;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaFlowStyle.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0003J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/SplashScreenStyle;", "Landroid/os/Parcelable;", "asset", "", "assetBackgroundColorValue", "Lkotlin/ULong;", "title", "subtitle", "allowSkip", "", "<init>", "(IJIIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsset", "()I", "getAssetBackgroundColorValue-s-VKNKU", "()J", "J", "getTitle", "getSubtitle", "getAllowSkip", "()Z", "component1", "component2", "component2-s-VKNKU", "component3", "component4", "component5", "copy", "copy-lhpF3nk", "(IJIIZ)Lcom/robinhood/shared/documents/lib/docupload/SplashScreenStyle;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SplashScreenStyle implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SplashScreenStyle> CREATOR = new Creator();
    private final boolean allowSkip;
    private final int asset;
    private final long assetBackgroundColorValue;
    private final int subtitle;
    private final int title;

    /* compiled from: PersonaFlowStyle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SplashScreenStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplashScreenStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplashScreenStyle(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplashScreenStyle[] newArray(int i) {
            return new SplashScreenStyle[i];
        }
    }

    public /* synthetic */ SplashScreenStyle(int i, long j, int i2, int i3, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, i2, i3, z);
    }

    /* renamed from: copy-lhpF3nk$default, reason: not valid java name */
    public static /* synthetic */ SplashScreenStyle m25310copylhpF3nk$default(SplashScreenStyle splashScreenStyle, int i, long j, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = splashScreenStyle.asset;
        }
        if ((i4 & 2) != 0) {
            j = splashScreenStyle.assetBackgroundColorValue;
        }
        if ((i4 & 4) != 0) {
            i2 = splashScreenStyle.title;
        }
        if ((i4 & 8) != 0) {
            i3 = splashScreenStyle.subtitle;
        }
        if ((i4 & 16) != 0) {
            z = splashScreenStyle.allowSkip;
        }
        boolean z2 = z;
        int i5 = i2;
        return splashScreenStyle.m25312copylhpF3nk(i, j, i5, i3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAsset() {
        return this.asset;
    }

    /* renamed from: component2-s-VKNKU, reason: not valid java name and from getter */
    public final long getAssetBackgroundColorValue() {
        return this.assetBackgroundColorValue;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAllowSkip() {
        return this.allowSkip;
    }

    /* renamed from: copy-lhpF3nk, reason: not valid java name */
    public final SplashScreenStyle m25312copylhpF3nk(int asset, long assetBackgroundColorValue, int title, int subtitle, boolean allowSkip) {
        return new SplashScreenStyle(asset, assetBackgroundColorValue, title, subtitle, allowSkip, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplashScreenStyle)) {
            return false;
        }
        SplashScreenStyle splashScreenStyle = (SplashScreenStyle) other;
        return this.asset == splashScreenStyle.asset && this.assetBackgroundColorValue == splashScreenStyle.assetBackgroundColorValue && this.title == splashScreenStyle.title && this.subtitle == splashScreenStyle.subtitle && this.allowSkip == splashScreenStyle.allowSkip;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.asset) * 31) + ULong.m28608hashCodeimpl(this.assetBackgroundColorValue)) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.subtitle)) * 31) + Boolean.hashCode(this.allowSkip);
    }

    public String toString() {
        return "SplashScreenStyle(asset=" + this.asset + ", assetBackgroundColorValue=" + ULong.m28609toStringimpl(this.assetBackgroundColorValue) + ", title=" + this.title + ", subtitle=" + this.subtitle + ", allowSkip=" + this.allowSkip + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.asset);
        dest.writeLong(this.assetBackgroundColorValue);
        dest.writeInt(this.title);
        dest.writeInt(this.subtitle);
        dest.writeInt(this.allowSkip ? 1 : 0);
    }

    private SplashScreenStyle(int i, long j, int i2, int i3, boolean z) {
        this.asset = i;
        this.assetBackgroundColorValue = j;
        this.title = i2;
        this.subtitle = i3;
        this.allowSkip = z;
    }

    public final int getAsset() {
        return this.asset;
    }

    /* renamed from: getAssetBackgroundColorValue-s-VKNKU, reason: not valid java name */
    public final long m25313getAssetBackgroundColorValuesVKNKU() {
        return this.assetBackgroundColorValue;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final boolean getAllowSkip() {
        return this.allowSkip;
    }
}
