package com.robinhood.android.gold.lib.upgrade.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldSweepAgreementsFlow.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0005J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "Landroid/os/Parcelable;", "title", "", "progressBarSegmentIdx", "", "progressBarSegmentProgress", "", "progressBarNumSegments", "<init>", "(Ljava/lang/String;IFI)V", "getTitle", "()Ljava/lang/String;", "getProgressBarSegmentIdx", "()I", "getProgressBarSegmentProgress", "()F", "getProgressBarNumSegments", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldAgreementsProgressBar implements Parcelable {
    public static final Parcelable.Creator<ApiGoldAgreementsProgressBar> CREATOR = new Creator();
    private final int progressBarNumSegments;
    private final int progressBarSegmentIdx;
    private final float progressBarSegmentProgress;
    private final String title;

    /* compiled from: ApiGoldSweepAgreementsFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldAgreementsProgressBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldAgreementsProgressBar createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldAgreementsProgressBar(parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldAgreementsProgressBar[] newArray(int i) {
            return new ApiGoldAgreementsProgressBar[i];
        }
    }

    public static /* synthetic */ ApiGoldAgreementsProgressBar copy$default(ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, String str, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = apiGoldAgreementsProgressBar.title;
        }
        if ((i3 & 2) != 0) {
            i = apiGoldAgreementsProgressBar.progressBarSegmentIdx;
        }
        if ((i3 & 4) != 0) {
            f = apiGoldAgreementsProgressBar.progressBarSegmentProgress;
        }
        if ((i3 & 8) != 0) {
            i2 = apiGoldAgreementsProgressBar.progressBarNumSegments;
        }
        return apiGoldAgreementsProgressBar.copy(str, i, f, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgressBarSegmentIdx() {
        return this.progressBarSegmentIdx;
    }

    /* renamed from: component3, reason: from getter */
    public final float getProgressBarSegmentProgress() {
        return this.progressBarSegmentProgress;
    }

    /* renamed from: component4, reason: from getter */
    public final int getProgressBarNumSegments() {
        return this.progressBarNumSegments;
    }

    public final ApiGoldAgreementsProgressBar copy(String title, @Json(name = "progress_segment_bar_index") int progressBarSegmentIdx, @Json(name = "progress_segment_bar_progress") float progressBarSegmentProgress, @Json(name = "progress_bar_num_segments") int progressBarNumSegments) {
        return new ApiGoldAgreementsProgressBar(title, progressBarSegmentIdx, progressBarSegmentProgress, progressBarNumSegments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldAgreementsProgressBar)) {
            return false;
        }
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = (ApiGoldAgreementsProgressBar) other;
        return Intrinsics.areEqual(this.title, apiGoldAgreementsProgressBar.title) && this.progressBarSegmentIdx == apiGoldAgreementsProgressBar.progressBarSegmentIdx && Float.compare(this.progressBarSegmentProgress, apiGoldAgreementsProgressBar.progressBarSegmentProgress) == 0 && this.progressBarNumSegments == apiGoldAgreementsProgressBar.progressBarNumSegments;
    }

    public int hashCode() {
        String str = this.title;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.progressBarSegmentIdx)) * 31) + Float.hashCode(this.progressBarSegmentProgress)) * 31) + Integer.hashCode(this.progressBarNumSegments);
    }

    public String toString() {
        return "ApiGoldAgreementsProgressBar(title=" + this.title + ", progressBarSegmentIdx=" + this.progressBarSegmentIdx + ", progressBarSegmentProgress=" + this.progressBarSegmentProgress + ", progressBarNumSegments=" + this.progressBarNumSegments + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeInt(this.progressBarSegmentIdx);
        dest.writeFloat(this.progressBarSegmentProgress);
        dest.writeInt(this.progressBarNumSegments);
    }

    public ApiGoldAgreementsProgressBar(String str, @Json(name = "progress_segment_bar_index") int i, @Json(name = "progress_segment_bar_progress") float f, @Json(name = "progress_bar_num_segments") int i2) {
        this.title = str;
        this.progressBarSegmentIdx = i;
        this.progressBarSegmentProgress = f;
        this.progressBarNumSegments = i2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getProgressBarSegmentIdx() {
        return this.progressBarSegmentIdx;
    }

    public final float getProgressBarSegmentProgress() {
        return this.progressBarSegmentProgress;
    }

    public final int getProgressBarNumSegments() {
        return this.progressBarNumSegments;
    }
}
