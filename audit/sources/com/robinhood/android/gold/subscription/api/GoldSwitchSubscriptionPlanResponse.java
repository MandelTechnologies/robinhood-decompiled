package com.robinhood.android.gold.subscription.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiModels.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanResponse;", "Landroid/os/Parcelable;", "success", "", "displayStatusMessage", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getDisplayStatusMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldSwitchSubscriptionPlanResponse implements Parcelable {
    public static final Parcelable.Creator<GoldSwitchSubscriptionPlanResponse> CREATOR = new Creator();
    private final String displayStatusMessage;
    private final boolean success;

    /* compiled from: ApiModels.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldSwitchSubscriptionPlanResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSwitchSubscriptionPlanResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldSwitchSubscriptionPlanResponse(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSwitchSubscriptionPlanResponse[] newArray(int i) {
            return new GoldSwitchSubscriptionPlanResponse[i];
        }
    }

    public static /* synthetic */ GoldSwitchSubscriptionPlanResponse copy$default(GoldSwitchSubscriptionPlanResponse goldSwitchSubscriptionPlanResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = goldSwitchSubscriptionPlanResponse.success;
        }
        if ((i & 2) != 0) {
            str = goldSwitchSubscriptionPlanResponse.displayStatusMessage;
        }
        return goldSwitchSubscriptionPlanResponse.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayStatusMessage() {
        return this.displayStatusMessage;
    }

    public final GoldSwitchSubscriptionPlanResponse copy(boolean success, @Json(name = "display_status_message") String displayStatusMessage) {
        return new GoldSwitchSubscriptionPlanResponse(success, displayStatusMessage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldSwitchSubscriptionPlanResponse)) {
            return false;
        }
        GoldSwitchSubscriptionPlanResponse goldSwitchSubscriptionPlanResponse = (GoldSwitchSubscriptionPlanResponse) other;
        return this.success == goldSwitchSubscriptionPlanResponse.success && Intrinsics.areEqual(this.displayStatusMessage, goldSwitchSubscriptionPlanResponse.displayStatusMessage);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.displayStatusMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GoldSwitchSubscriptionPlanResponse(success=" + this.success + ", displayStatusMessage=" + this.displayStatusMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.success ? 1 : 0);
        dest.writeString(this.displayStatusMessage);
    }

    public GoldSwitchSubscriptionPlanResponse(boolean z, @Json(name = "display_status_message") String str) {
        this.success = z;
        this.displayStatusMessage = str;
    }

    public /* synthetic */ GoldSwitchSubscriptionPlanResponse(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getDisplayStatusMessage() {
        return this.displayStatusMessage;
    }
}
