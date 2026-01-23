package com.robinhood.android.common.mcduckling.address;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardShippingAddress.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "mailingAddress", "Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "isBillingAddress", "", "isRecognized", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/common/mcduckling/address/MailingAddress;ZZ)V", "getId", "()Ljava/util/UUID;", "getMailingAddress", "()Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardShippingAddress implements Parcelable {
    public static final String EXTRA_CARD_SHIPPING_ADDRESS_RESULT = "rhCardShippingAddressResult";
    private final UUID id;
    private final boolean isBillingAddress;
    private final boolean isRecognized;
    private final MailingAddress mailingAddress;
    public static final Parcelable.Creator<CardShippingAddress> CREATOR = new Creator();

    /* compiled from: CardShippingAddress.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CardShippingAddress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardShippingAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardShippingAddress((UUID) parcel.readSerializable(), MailingAddress.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardShippingAddress[] newArray(int i) {
            return new CardShippingAddress[i];
        }
    }

    public static /* synthetic */ CardShippingAddress copy$default(CardShippingAddress cardShippingAddress, UUID uuid, MailingAddress mailingAddress, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cardShippingAddress.id;
        }
        if ((i & 2) != 0) {
            mailingAddress = cardShippingAddress.mailingAddress;
        }
        if ((i & 4) != 0) {
            z = cardShippingAddress.isBillingAddress;
        }
        if ((i & 8) != 0) {
            z2 = cardShippingAddress.isRecognized;
        }
        return cardShippingAddress.copy(uuid, mailingAddress, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final MailingAddress getMailingAddress() {
        return this.mailingAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsBillingAddress() {
        return this.isBillingAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRecognized() {
        return this.isRecognized;
    }

    public final CardShippingAddress copy(UUID id, MailingAddress mailingAddress, boolean isBillingAddress, boolean isRecognized) {
        Intrinsics.checkNotNullParameter(mailingAddress, "mailingAddress");
        return new CardShippingAddress(id, mailingAddress, isBillingAddress, isRecognized);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardShippingAddress)) {
            return false;
        }
        CardShippingAddress cardShippingAddress = (CardShippingAddress) other;
        return Intrinsics.areEqual(this.id, cardShippingAddress.id) && Intrinsics.areEqual(this.mailingAddress, cardShippingAddress.mailingAddress) && this.isBillingAddress == cardShippingAddress.isBillingAddress && this.isRecognized == cardShippingAddress.isRecognized;
    }

    public int hashCode() {
        UUID uuid = this.id;
        return ((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.mailingAddress.hashCode()) * 31) + Boolean.hashCode(this.isBillingAddress)) * 31) + Boolean.hashCode(this.isRecognized);
    }

    public String toString() {
        return "CardShippingAddress(id=" + this.id + ", mailingAddress=" + this.mailingAddress + ", isBillingAddress=" + this.isBillingAddress + ", isRecognized=" + this.isRecognized + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        this.mailingAddress.writeToParcel(dest, flags);
        dest.writeInt(this.isBillingAddress ? 1 : 0);
        dest.writeInt(this.isRecognized ? 1 : 0);
    }

    public CardShippingAddress(UUID uuid, MailingAddress mailingAddress, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(mailingAddress, "mailingAddress");
        this.id = uuid;
        this.mailingAddress = mailingAddress;
        this.isBillingAddress = z;
        this.isRecognized = z2;
    }

    public final UUID getId() {
        return this.id;
    }

    public final MailingAddress getMailingAddress() {
        return this.mailingAddress;
    }

    public final boolean isBillingAddress() {
        return this.isBillingAddress;
    }

    public final boolean isRecognized() {
        return this.isRecognized;
    }
}
