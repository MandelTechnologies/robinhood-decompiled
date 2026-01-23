package com.robinhood.android.rhy.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardBackorder.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/CardBackorder;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "isFromRhy", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Z)V", "getPaymentCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CardBackorder implements FragmentKey {
    public static final Parcelable.Creator<CardBackorder> CREATOR = new Creator();
    private final boolean isFromRhy;
    private final PaymentCard paymentCard;

    /* compiled from: CardBackorder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<CardBackorder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardBackorder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardBackorder((PaymentCard) parcel.readParcelable(CardBackorder.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardBackorder[] newArray(int i) {
            return new CardBackorder[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.paymentCard, flags);
        dest.writeInt(this.isFromRhy ? 1 : 0);
    }

    public CardBackorder(PaymentCard paymentCard, boolean z) {
        this.paymentCard = paymentCard;
        this.isFromRhy = z;
    }

    public final PaymentCard getPaymentCard() {
        return this.paymentCard;
    }

    /* renamed from: isFromRhy, reason: from getter */
    public final boolean getIsFromRhy() {
        return this.isFromRhy;
    }
}
