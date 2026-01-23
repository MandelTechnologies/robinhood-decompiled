package com.robinhood.android.mcw.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversionOrderDetailsKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/mcw/contracts/ConversionOrderDetailsKey;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConversionOrderDetailsKey implements Parcelable, FragmentKey {
    public static final Parcelable.Creator<ConversionOrderDetailsKey> CREATOR = new Creator();
    private final String accountNumber;
    private final UUID orderId;

    /* compiled from: ConversionOrderDetailsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ConversionOrderDetailsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversionOrderDetailsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConversionOrderDetailsKey(parcel.readString(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversionOrderDetailsKey[] newArray(int i) {
            return new ConversionOrderDetailsKey[i];
        }
    }

    public static /* synthetic */ ConversionOrderDetailsKey copy$default(ConversionOrderDetailsKey conversionOrderDetailsKey, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversionOrderDetailsKey.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = conversionOrderDetailsKey.orderId;
        }
        return conversionOrderDetailsKey.copy(str, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    public final ConversionOrderDetailsKey copy(String accountNumber, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new ConversionOrderDetailsKey(accountNumber, orderId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversionOrderDetailsKey)) {
            return false;
        }
        ConversionOrderDetailsKey conversionOrderDetailsKey = (ConversionOrderDetailsKey) other;
        return Intrinsics.areEqual(this.accountNumber, conversionOrderDetailsKey.accountNumber) && Intrinsics.areEqual(this.orderId, conversionOrderDetailsKey.orderId);
    }

    public int hashCode() {
        String str = this.accountNumber;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.orderId.hashCode();
    }

    public String toString() {
        return "ConversionOrderDetailsKey(accountNumber=" + this.accountNumber + ", orderId=" + this.orderId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.orderId);
    }

    public ConversionOrderDetailsKey(String str, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.accountNumber = str;
        this.orderId = orderId;
    }

    public /* synthetic */ ConversionOrderDetailsKey(String str, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, uuid);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }
}
