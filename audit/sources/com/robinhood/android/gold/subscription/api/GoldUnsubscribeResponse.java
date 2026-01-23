package com.robinhood.android.gold.subscription.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/GoldUnsubscribeResponse;", "Landroid/os/Parcelable;", "success", "", "goldDowngradeConfirmation", "Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;", "<init>", "(ZLcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;)V", "getSuccess", "()Z", "getGoldDowngradeConfirmation", "()Lcom/robinhood/android/gold/subscription/api/ApiGoldDowngradeConfirmation;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldUnsubscribeResponse implements Parcelable {
    public static final Parcelable.Creator<GoldUnsubscribeResponse> CREATOR = new Creator();
    private final ApiGoldDowngradeConfirmation goldDowngradeConfirmation;
    private final boolean success;

    /* compiled from: ApiModels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldUnsubscribeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUnsubscribeResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldUnsubscribeResponse(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ApiGoldDowngradeConfirmation.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldUnsubscribeResponse[] newArray(int i) {
            return new GoldUnsubscribeResponse[i];
        }
    }

    public static /* synthetic */ GoldUnsubscribeResponse copy$default(GoldUnsubscribeResponse goldUnsubscribeResponse, boolean z, ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = goldUnsubscribeResponse.success;
        }
        if ((i & 2) != 0) {
            apiGoldDowngradeConfirmation = goldUnsubscribeResponse.goldDowngradeConfirmation;
        }
        return goldUnsubscribeResponse.copy(z, apiGoldDowngradeConfirmation);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiGoldDowngradeConfirmation getGoldDowngradeConfirmation() {
        return this.goldDowngradeConfirmation;
    }

    public final GoldUnsubscribeResponse copy(boolean success, @Json(name = "gold_downgrade_confirmation") ApiGoldDowngradeConfirmation goldDowngradeConfirmation) {
        return new GoldUnsubscribeResponse(success, goldDowngradeConfirmation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldUnsubscribeResponse)) {
            return false;
        }
        GoldUnsubscribeResponse goldUnsubscribeResponse = (GoldUnsubscribeResponse) other;
        return this.success == goldUnsubscribeResponse.success && Intrinsics.areEqual(this.goldDowngradeConfirmation, goldUnsubscribeResponse.goldDowngradeConfirmation);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation = this.goldDowngradeConfirmation;
        return iHashCode + (apiGoldDowngradeConfirmation == null ? 0 : apiGoldDowngradeConfirmation.hashCode());
    }

    public String toString() {
        return "GoldUnsubscribeResponse(success=" + this.success + ", goldDowngradeConfirmation=" + this.goldDowngradeConfirmation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.success ? 1 : 0);
        ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation = this.goldDowngradeConfirmation;
        if (apiGoldDowngradeConfirmation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldDowngradeConfirmation.writeToParcel(dest, flags);
        }
    }

    public GoldUnsubscribeResponse(boolean z, @Json(name = "gold_downgrade_confirmation") ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation) {
        this.success = z;
        this.goldDowngradeConfirmation = apiGoldDowngradeConfirmation;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final ApiGoldDowngradeConfirmation getGoldDowngradeConfirmation() {
        return this.goldDowngradeConfirmation;
    }
}
