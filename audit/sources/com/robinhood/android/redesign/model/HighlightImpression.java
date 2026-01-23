package com.robinhood.android.redesign.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: HighlightImpression.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u001a\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b3\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010$¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/HighlightImpression;", "Landroid/os/Parcelable;", "", "id", "", "impressionId", "firstSeenAt", "firstGeneratedAt", "Lcom/robinhood/android/redesign/model/ImpressionType;", "impressionType", "<init>", "(JLjava/lang/String;Ljava/lang/Long;JLcom/robinhood/android/redesign/model/ImpressionType;)V", "j$/time/Instant", "now", "j$/time/Duration", "withinPastDuration", "", "notSeenWithin", "(Lj$/time/Instant;Lj$/time/Duration;)Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "component5", "()Lcom/robinhood/android/redesign/model/ImpressionType;", "copy", "(JLjava/lang/String;Ljava/lang/Long;JLcom/robinhood/android/redesign/model/ImpressionType;)Lcom/robinhood/android/redesign/model/HighlightImpression;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Ljava/lang/String;", "getImpressionId", "Ljava/lang/Long;", "getFirstSeenAt", "getFirstGeneratedAt", "Lcom/robinhood/android/redesign/model/ImpressionType;", "getImpressionType", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HighlightImpression implements Parcelable {
    public static final Parcelable.Creator<HighlightImpression> CREATOR = new Creator();
    private final long firstGeneratedAt;
    private final Long firstSeenAt;
    private final long id;
    private final String impressionId;
    private final HighlightImpression2 impressionType;

    /* compiled from: HighlightImpression.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<HighlightImpression> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HighlightImpression createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HighlightImpression(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), HighlightImpression2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HighlightImpression[] newArray(int i) {
            return new HighlightImpression[i];
        }
    }

    public static /* synthetic */ HighlightImpression copy$default(HighlightImpression highlightImpression, long j, String str, Long l, long j2, HighlightImpression2 highlightImpression2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = highlightImpression.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = highlightImpression.impressionId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            l = highlightImpression.firstSeenAt;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            j2 = highlightImpression.firstGeneratedAt;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            highlightImpression2 = highlightImpression.impressionType;
        }
        return highlightImpression.copy(j3, str2, l2, j4, highlightImpression2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImpressionId() {
        return this.impressionId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getFirstSeenAt() {
        return this.firstSeenAt;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFirstGeneratedAt() {
        return this.firstGeneratedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final HighlightImpression2 getImpressionType() {
        return this.impressionType;
    }

    public final HighlightImpression copy(long id, String impressionId, Long firstSeenAt, long firstGeneratedAt, HighlightImpression2 impressionType) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        return new HighlightImpression(id, impressionId, firstSeenAt, firstGeneratedAt, impressionType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightImpression)) {
            return false;
        }
        HighlightImpression highlightImpression = (HighlightImpression) other;
        return this.id == highlightImpression.id && Intrinsics.areEqual(this.impressionId, highlightImpression.impressionId) && Intrinsics.areEqual(this.firstSeenAt, highlightImpression.firstSeenAt) && this.firstGeneratedAt == highlightImpression.firstGeneratedAt && this.impressionType == highlightImpression.impressionType;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.id) * 31) + this.impressionId.hashCode()) * 31;
        Long l = this.firstSeenAt;
        return ((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.firstGeneratedAt)) * 31) + this.impressionType.hashCode();
    }

    public String toString() {
        return "HighlightImpression(id=" + this.id + ", impressionId=" + this.impressionId + ", firstSeenAt=" + this.firstSeenAt + ", firstGeneratedAt=" + this.firstGeneratedAt + ", impressionType=" + this.impressionType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.impressionId);
        Long l = this.firstSeenAt;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeLong(this.firstGeneratedAt);
        dest.writeString(this.impressionType.name());
    }

    public HighlightImpression(long j, String impressionId, Long l, long j2, HighlightImpression2 impressionType) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        this.id = j;
        this.impressionId = impressionId;
        this.firstSeenAt = l;
        this.firstGeneratedAt = j2;
        this.impressionType = impressionType;
    }

    public /* synthetic */ HighlightImpression(long j, String str, Long l, long j2, HighlightImpression2 highlightImpression2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, (i & 4) != 0 ? null : l, j2, highlightImpression2);
    }

    public final long getId() {
        return this.id;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final Long getFirstSeenAt() {
        return this.firstSeenAt;
    }

    public final long getFirstGeneratedAt() {
        return this.firstGeneratedAt;
    }

    public final HighlightImpression2 getImpressionType() {
        return this.impressionType;
    }

    public final boolean notSeenWithin(Instant now, Duration withinPastDuration) {
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(withinPastDuration, "withinPastDuration");
        return this.firstSeenAt == null || now.minusMillis(withinPastDuration.toMillis()).compareTo(Instant.ofEpochMilli(this.firstSeenAt.longValue())) < 0;
    }
}
