package com.stripe.android.networking;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FraudDetectionData.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0001,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, m3636d2 = {"Lcom/stripe/android/networking/FraudDetectionData;", "Lcom/stripe/android/core/model/StripeModel;", "", "guid", "muid", "sid", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "currentTime", "", "isExpired", "(J)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getGuid$payments_core_release", "getMuid$payments_core_release", "getSid$payments_core_release", "J", "getTimestamp$payments_core_release", "()J", "", "getParams", "()Ljava/util/Map;", "params", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final /* data */ class FraudDetectionData implements StripeModel {
    private final String guid;
    private final String muid;
    private final String sid;
    private final long timestamp;
    public static final Parcelable.Creator<FraudDetectionData> CREATOR = new Creator();
    private static final long TTL = TimeUnit.MINUTES.toMillis(30);

    /* compiled from: FraudDetectionData.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudDetectionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FraudDetectionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData[] newArray(int i) {
            return new FraudDetectionData[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudDetectionData)) {
            return false;
        }
        FraudDetectionData fraudDetectionData = (FraudDetectionData) other;
        return Intrinsics.areEqual(this.guid, fraudDetectionData.guid) && Intrinsics.areEqual(this.muid, fraudDetectionData.muid) && Intrinsics.areEqual(this.sid, fraudDetectionData.sid) && this.timestamp == fraudDetectionData.timestamp;
    }

    public int hashCode() {
        return (((((this.guid.hashCode() * 31) + this.muid.hashCode()) * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "FraudDetectionData(guid=" + this.guid + ", muid=" + this.muid + ", sid=" + this.sid + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.guid);
        parcel.writeString(this.muid);
        parcel.writeString(this.sid);
        parcel.writeLong(this.timestamp);
    }

    public FraudDetectionData(String guid, String muid, String sid, long j) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(muid, "muid");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.guid = guid;
        this.muid = muid;
        this.sid = sid;
        this.timestamp = j;
    }

    /* renamed from: getGuid$payments_core_release, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: getMuid$payments_core_release, reason: from getter */
    public final String getMuid() {
        return this.muid;
    }

    /* renamed from: getSid$payments_core_release, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    public final Map<String, String> getParams() {
        return MapsKt.mapOf(Tuples4.m3642to("guid", this.guid), Tuples4.m3642to("muid", this.muid), Tuples4.m3642to("sid", this.sid));
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("guid", this.guid).put("muid", this.muid).put("sid", this.sid).put("timestamp", this.timestamp);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final boolean isExpired(long currentTime) {
        return currentTime - this.timestamp > TTL;
    }
}
