package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.model.StripeModel;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BinRange.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/model/BinRange;", "Lcom/stripe/android/core/model/StripeModel;", "", "low", "high", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "matches", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLow", "getHigh", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BinRange implements StripeModel {
    public static final Parcelable.Creator<BinRange> CREATOR = new Creator();
    private final String high;
    private final String low;

    /* compiled from: BinRange.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<BinRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BinRange(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange[] newArray(int i) {
            return new BinRange[i];
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
        if (!(other instanceof BinRange)) {
            return false;
        }
        BinRange binRange = (BinRange) other;
        return Intrinsics.areEqual(this.low, binRange.low) && Intrinsics.areEqual(this.high, binRange.high);
    }

    public int hashCode() {
        return (this.low.hashCode() * 31) + this.high.hashCode();
    }

    public String toString() {
        return "BinRange(low=" + this.low + ", high=" + this.high + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.low);
        parcel.writeString(this.high);
    }

    public BinRange(String low, String high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        this.low = low;
        this.high = high;
    }

    public final boolean matches(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        String normalized = cardNumber.getNormalized();
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(normalized);
        if (bigDecimalOrNull == null) {
            return false;
        }
        return (normalized.length() >= this.low.length() ? new BigDecimal(StringsKt.take(normalized, this.low.length())).compareTo(new BigDecimal(this.low)) >= 0 : bigDecimalOrNull.compareTo(new BigDecimal(StringsKt.take(this.low, normalized.length()))) >= 0) && (normalized.length() >= this.high.length() ? new BigDecimal(StringsKt.take(normalized, this.high.length())).compareTo(new BigDecimal(this.high)) <= 0 : bigDecimalOrNull.compareTo(new BigDecimal(StringsKt.take(this.high, normalized.length()))) <= 0);
    }
}
