package com.robinhood.android.mcduckling.card.help.p179ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.mcduckling.address.MailingAddress;
import com.robinhood.models.api.mcduckling.CardColor;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardReplacementSubmissionDetails.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u000b\u0010\u0018¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDetails;", "Landroid/os/Parcelable;", "cardId", "Ljava/util/UUID;", "replacementType", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "mailingAddress", "Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "cardColor", "Lcom/robinhood/models/api/mcduckling/CardColor;", "shippingAddressId", "isBillingAddress", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;Lcom/robinhood/android/common/mcduckling/address/MailingAddress;Lcom/robinhood/models/api/mcduckling/CardColor;Ljava/util/UUID;Ljava/lang/Boolean;)V", "getCardId", "()Ljava/util/UUID;", "getReplacementType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "getMailingAddress", "()Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "getCardColor", "()Lcom/robinhood/models/api/mcduckling/CardColor;", "getShippingAddressId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CardReplacementSubmissionDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardReplacementSubmissionDetails> CREATOR = new Creator();
    private final CardColor cardColor;
    private final UUID cardId;
    private final Boolean isBillingAddress;
    private final MailingAddress mailingAddress;
    private final CardReplacementType replacementType;
    private final UUID shippingAddressId;

    /* compiled from: CardReplacementSubmissionDetails.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CardReplacementSubmissionDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardReplacementSubmissionDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            CardReplacementType cardReplacementTypeValueOf = CardReplacementType.valueOf(parcel.readString());
            MailingAddress mailingAddress = (MailingAddress) parcel.readParcelable(CardReplacementSubmissionDetails.class.getClassLoader());
            Boolean boolValueOf = null;
            CardColor cardColorValueOf = parcel.readInt() == 0 ? null : CardColor.valueOf(parcel.readString());
            UUID uuid2 = (UUID) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CardReplacementSubmissionDetails(uuid, cardReplacementTypeValueOf, mailingAddress, cardColorValueOf, uuid2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardReplacementSubmissionDetails[] newArray(int i) {
            return new CardReplacementSubmissionDetails[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.cardId);
        dest.writeString(this.replacementType.name());
        dest.writeParcelable(this.mailingAddress, flags);
        CardColor cardColor = this.cardColor;
        if (cardColor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cardColor.name());
        }
        dest.writeSerializable(this.shippingAddressId);
        Boolean bool = this.isBillingAddress;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public CardReplacementSubmissionDetails(UUID cardId, CardReplacementType replacementType, MailingAddress mailingAddress, CardColor cardColor, UUID uuid, Boolean bool) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(replacementType, "replacementType");
        this.cardId = cardId;
        this.replacementType = replacementType;
        this.mailingAddress = mailingAddress;
        this.cardColor = cardColor;
        this.shippingAddressId = uuid;
        this.isBillingAddress = bool;
    }

    public /* synthetic */ CardReplacementSubmissionDetails(UUID uuid, CardReplacementType cardReplacementType, MailingAddress mailingAddress, CardColor cardColor, UUID uuid2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, cardReplacementType, (i & 4) != 0 ? null : mailingAddress, (i & 8) != 0 ? null : cardColor, (i & 16) != 0 ? null : uuid2, (i & 32) != 0 ? null : bool);
    }

    public final UUID getCardId() {
        return this.cardId;
    }

    public final CardReplacementType getReplacementType() {
        return this.replacementType;
    }

    public final MailingAddress getMailingAddress() {
        return this.mailingAddress;
    }

    public final CardColor getCardColor() {
        return this.cardColor;
    }

    public final UUID getShippingAddressId() {
        return this.shippingAddressId;
    }

    /* renamed from: isBillingAddress, reason: from getter */
    public final Boolean getIsBillingAddress() {
        return this.isBillingAddress;
    }
}
