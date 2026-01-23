package com.robinhood.shared.questionnaire.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireProgressBarData.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireProgressBarData;", "Landroid/os/Parcelable;", "toolbarTitleRes", "", "segmentIdx", "segments", "<init>", "(III)V", "getToolbarTitleRes", "()I", "getSegmentIdx", "getSegments", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class QuestionnaireProgressBarData implements Parcelable {
    public static final Parcelable.Creator<QuestionnaireProgressBarData> CREATOR = new Creator();
    private final int segmentIdx;
    private final int segments;
    private final int toolbarTitleRes;

    /* compiled from: QuestionnaireProgressBarData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionnaireProgressBarData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireProgressBarData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionnaireProgressBarData(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireProgressBarData[] newArray(int i) {
            return new QuestionnaireProgressBarData[i];
        }
    }

    public static /* synthetic */ QuestionnaireProgressBarData copy$default(QuestionnaireProgressBarData questionnaireProgressBarData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = questionnaireProgressBarData.toolbarTitleRes;
        }
        if ((i4 & 2) != 0) {
            i2 = questionnaireProgressBarData.segmentIdx;
        }
        if ((i4 & 4) != 0) {
            i3 = questionnaireProgressBarData.segments;
        }
        return questionnaireProgressBarData.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getToolbarTitleRes() {
        return this.toolbarTitleRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSegmentIdx() {
        return this.segmentIdx;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSegments() {
        return this.segments;
    }

    public final QuestionnaireProgressBarData copy(int toolbarTitleRes, int segmentIdx, int segments) {
        return new QuestionnaireProgressBarData(toolbarTitleRes, segmentIdx, segments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireProgressBarData)) {
            return false;
        }
        QuestionnaireProgressBarData questionnaireProgressBarData = (QuestionnaireProgressBarData) other;
        return this.toolbarTitleRes == questionnaireProgressBarData.toolbarTitleRes && this.segmentIdx == questionnaireProgressBarData.segmentIdx && this.segments == questionnaireProgressBarData.segments;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.toolbarTitleRes) * 31) + Integer.hashCode(this.segmentIdx)) * 31) + Integer.hashCode(this.segments);
    }

    public String toString() {
        return "QuestionnaireProgressBarData(toolbarTitleRes=" + this.toolbarTitleRes + ", segmentIdx=" + this.segmentIdx + ", segments=" + this.segments + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.toolbarTitleRes);
        dest.writeInt(this.segmentIdx);
        dest.writeInt(this.segments);
    }

    public QuestionnaireProgressBarData(int i, int i2, int i3) {
        this.toolbarTitleRes = i;
        this.segmentIdx = i2;
        this.segments = i3;
    }

    public final int getToolbarTitleRes() {
        return this.toolbarTitleRes;
    }

    public final int getSegmentIdx() {
        return this.segmentIdx;
    }

    public final int getSegments() {
        return this.segments;
    }
}
