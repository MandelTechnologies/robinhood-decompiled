package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GpsData.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsData;", "", "Landroid/location/Location;", "location", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionAuthorization;", "precision", "<init>", "(Landroid/location/Location;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionAuthorization;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionAuthorization;", "getPrecision", "()Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionAuthorization;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class GpsData {
    private final Location location;
    private final GpsPrecisionAuthorization precision;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GpsData)) {
            return false;
        }
        GpsData gpsData = (GpsData) other;
        return Intrinsics.areEqual(this.location, gpsData.location) && this.precision == gpsData.precision;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.precision.hashCode();
    }

    public String toString() {
        return "GpsData(location=" + this.location + ", precision=" + this.precision + ")";
    }

    public GpsData(Location location, GpsPrecisionAuthorization precision) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.location = location;
        this.precision = precision;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final GpsPrecisionAuthorization getPrecision() {
        return this.precision;
    }
}
