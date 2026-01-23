package com.robinhood.android.api.swipeycontent;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.ImageSource;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeyContentApi.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/api/swipeycontent/SwipeyContent;", "Landroid/os/Parcelable;", "sweepRateTitle", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "sweepRateSubtitle", "sweepRateAssetUrl", "Lcom/robinhood/models/serverdriven/experimental/api/ImageSource;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/models/serverdriven/experimental/api/ImageSource;)V", "getSweepRateTitle", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getSweepRateSubtitle", "getSweepRateAssetUrl", "()Lcom/robinhood/models/serverdriven/experimental/api/ImageSource;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-api-swipey-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SwipeyContent implements Parcelable {
    public static final Parcelable.Creator<SwipeyContent> CREATOR = new Creator();
    private final ImageSource sweepRateAssetUrl;
    private final RichText sweepRateSubtitle;
    private final RichText sweepRateTitle;

    /* compiled from: SwipeyContentApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<SwipeyContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwipeyContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SwipeyContent((RichText) parcel.readParcelable(SwipeyContent.class.getClassLoader()), (RichText) parcel.readParcelable(SwipeyContent.class.getClassLoader()), (ImageSource) parcel.readParcelable(SwipeyContent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwipeyContent[] newArray(int i) {
            return new SwipeyContent[i];
        }
    }

    public static /* synthetic */ SwipeyContent copy$default(SwipeyContent swipeyContent, RichText richText, RichText richText2, ImageSource imageSource, int i, Object obj) {
        if ((i & 1) != 0) {
            richText = swipeyContent.sweepRateTitle;
        }
        if ((i & 2) != 0) {
            richText2 = swipeyContent.sweepRateSubtitle;
        }
        if ((i & 4) != 0) {
            imageSource = swipeyContent.sweepRateAssetUrl;
        }
        return swipeyContent.copy(richText, richText2, imageSource);
    }

    /* renamed from: component1, reason: from getter */
    public final RichText getSweepRateTitle() {
        return this.sweepRateTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final RichText getSweepRateSubtitle() {
        return this.sweepRateSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageSource getSweepRateAssetUrl() {
        return this.sweepRateAssetUrl;
    }

    public final SwipeyContent copy(@Json(name = "sweep_rate_title") RichText sweepRateTitle, @Json(name = "sweep_rate_subtitle") RichText sweepRateSubtitle, @Json(name = "sweep_rate_asset_url") ImageSource sweepRateAssetUrl) {
        Intrinsics.checkNotNullParameter(sweepRateTitle, "sweepRateTitle");
        Intrinsics.checkNotNullParameter(sweepRateSubtitle, "sweepRateSubtitle");
        Intrinsics.checkNotNullParameter(sweepRateAssetUrl, "sweepRateAssetUrl");
        return new SwipeyContent(sweepRateTitle, sweepRateSubtitle, sweepRateAssetUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwipeyContent)) {
            return false;
        }
        SwipeyContent swipeyContent = (SwipeyContent) other;
        return Intrinsics.areEqual(this.sweepRateTitle, swipeyContent.sweepRateTitle) && Intrinsics.areEqual(this.sweepRateSubtitle, swipeyContent.sweepRateSubtitle) && Intrinsics.areEqual(this.sweepRateAssetUrl, swipeyContent.sweepRateAssetUrl);
    }

    public int hashCode() {
        return (((this.sweepRateTitle.hashCode() * 31) + this.sweepRateSubtitle.hashCode()) * 31) + this.sweepRateAssetUrl.hashCode();
    }

    public String toString() {
        return "SwipeyContent(sweepRateTitle=" + this.sweepRateTitle + ", sweepRateSubtitle=" + this.sweepRateSubtitle + ", sweepRateAssetUrl=" + this.sweepRateAssetUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.sweepRateTitle, flags);
        dest.writeParcelable(this.sweepRateSubtitle, flags);
        dest.writeParcelable(this.sweepRateAssetUrl, flags);
    }

    public SwipeyContent(@Json(name = "sweep_rate_title") RichText sweepRateTitle, @Json(name = "sweep_rate_subtitle") RichText sweepRateSubtitle, @Json(name = "sweep_rate_asset_url") ImageSource sweepRateAssetUrl) {
        Intrinsics.checkNotNullParameter(sweepRateTitle, "sweepRateTitle");
        Intrinsics.checkNotNullParameter(sweepRateSubtitle, "sweepRateSubtitle");
        Intrinsics.checkNotNullParameter(sweepRateAssetUrl, "sweepRateAssetUrl");
        this.sweepRateTitle = sweepRateTitle;
        this.sweepRateSubtitle = sweepRateSubtitle;
        this.sweepRateAssetUrl = sweepRateAssetUrl;
    }

    public final RichText getSweepRateTitle() {
        return this.sweepRateTitle;
    }

    public final RichText getSweepRateSubtitle() {
        return this.sweepRateSubtitle;
    }

    public final ImageSource getSweepRateAssetUrl() {
        return this.sweepRateAssetUrl;
    }
}
