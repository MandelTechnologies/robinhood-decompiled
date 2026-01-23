package com.robinhood.android.transfers.contracts.wires;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.money_movement.wire_account_creation.proto.p502v1.DidLinkAccountRequestDto;

/* compiled from: WireAccountCreation.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/wires/WireAccountCreation;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "recipientType", "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "<init>", "(Lcom/robinhood/models/api/bonfire/wires/RecipientType;)V", "getRecipientType", "()Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Callbacks", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WireAccountCreation implements FragmentKey {
    public static final String WireAccountResultKey = "WIRE_ACCOUNT_RESULT";
    private final RecipientType recipientType;
    public static final Parcelable.Creator<WireAccountCreation> CREATOR = new Creator();

    /* compiled from: WireAccountCreation.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/wires/WireAccountCreation$Callbacks;", "", "onAccountCreated", "", "request", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/DidLinkAccountRequestDto;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountCreated(DidLinkAccountRequestDto request);
    }

    /* compiled from: WireAccountCreation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<WireAccountCreation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireAccountCreation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireAccountCreation(RecipientType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireAccountCreation[] newArray(int i) {
            return new WireAccountCreation[i];
        }
    }

    public static /* synthetic */ WireAccountCreation copy$default(WireAccountCreation wireAccountCreation, RecipientType recipientType, int i, Object obj) {
        if ((i & 1) != 0) {
            recipientType = wireAccountCreation.recipientType;
        }
        return wireAccountCreation.copy(recipientType);
    }

    /* renamed from: component1, reason: from getter */
    public final RecipientType getRecipientType() {
        return this.recipientType;
    }

    public final WireAccountCreation copy(RecipientType recipientType) {
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        return new WireAccountCreation(recipientType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WireAccountCreation) && this.recipientType == ((WireAccountCreation) other).recipientType;
    }

    public int hashCode() {
        return this.recipientType.hashCode();
    }

    public String toString() {
        return "WireAccountCreation(recipientType=" + this.recipientType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.recipientType.name());
    }

    public WireAccountCreation(RecipientType recipientType) {
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        this.recipientType = recipientType;
    }

    public final RecipientType getRecipientType() {
        return this.recipientType;
    }
}
