package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarSessionWithHCaptcha.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "Lcom/stripe/android/core/model/StripeModel;", "", "id", "passiveCaptchaSiteKey", "passiveCaptchaRqdata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getPassiveCaptchaSiteKey", "getPassiveCaptchaRqdata", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RadarSessionWithHCaptcha implements StripeModel {
    public static final Parcelable.Creator<RadarSessionWithHCaptcha> CREATOR = new Creator();
    private final String id;
    private final String passiveCaptchaRqdata;
    private final String passiveCaptchaSiteKey;

    /* compiled from: RadarSessionWithHCaptcha.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RadarSessionWithHCaptcha> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarSessionWithHCaptcha createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RadarSessionWithHCaptcha(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarSessionWithHCaptcha[] newArray(int i) {
            return new RadarSessionWithHCaptcha[i];
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
        if (!(other instanceof RadarSessionWithHCaptcha)) {
            return false;
        }
        RadarSessionWithHCaptcha radarSessionWithHCaptcha = (RadarSessionWithHCaptcha) other;
        return Intrinsics.areEqual(this.id, radarSessionWithHCaptcha.id) && Intrinsics.areEqual(this.passiveCaptchaSiteKey, radarSessionWithHCaptcha.passiveCaptchaSiteKey) && Intrinsics.areEqual(this.passiveCaptchaRqdata, radarSessionWithHCaptcha.passiveCaptchaRqdata);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.passiveCaptchaSiteKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.passiveCaptchaRqdata;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RadarSessionWithHCaptcha(id=" + this.id + ", passiveCaptchaSiteKey=" + this.passiveCaptchaSiteKey + ", passiveCaptchaRqdata=" + this.passiveCaptchaRqdata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.passiveCaptchaSiteKey);
        parcel.writeString(this.passiveCaptchaRqdata);
    }

    public RadarSessionWithHCaptcha(String id, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.passiveCaptchaSiteKey = str;
        this.passiveCaptchaRqdata = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassiveCaptchaSiteKey() {
        return this.passiveCaptchaSiteKey;
    }

    public final String getPassiveCaptchaRqdata() {
        return this.passiveCaptchaRqdata;
    }
}
